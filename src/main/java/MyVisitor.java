import java.util.*;
import java.util.stream.Collectors;

public class MyVisitor extends PascalToCBaseVisitor<String> {
    private String funName = "";
    private String functionCallName = "";
    private Map<String, String> typesMap = Map.of(
            "int", "%d",
            "double", "%f",
            "char", "%c",
            "string", "%s",
            "boolean", "%d");
    private HashMap<String, String> variableToType = new HashMap<>();

    private HashMap<String, List<Boolean>> functionNameToArguments = new HashMap<>();
    private HashMap<String, HashMap<String, Boolean>> functionNameToArgumentsByName = new HashMap<>();

    @Override
    public String visitProgram(PascalToCParser.ProgramContext ctx) {
        return visit(ctx.getChild(0)) + System.lineSeparator() +
               (ctx.getChildCount() > 3 ? visit(ctx.getChild(1)) : "");
    }

    @Override
    public String visitProgramHeader(PascalToCParser.ProgramHeaderContext ctx) {
        return "#include <stdio.h>\n#include <math.h>\n#include <stdbool.h>\n";
    }

    @Override
    public String visitBlocks(PascalToCParser.BlocksContext ctx) {
        var result = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount() - 1; i++) {
            result.append(visit(ctx.getChild(i))).append(System.lineSeparator());
        }
        result.append("int main() ");
        result.append(visit(ctx.getChild(ctx.getChildCount() - 1)));
        return result.toString();
    }

    @Override
    public String visitConstBlock(PascalToCParser.ConstBlockContext ctx) {
        var result = new StringBuilder();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            result.append(visit(ctx.getChild(i))).append(System.lineSeparator());
        }
        return result.toString();
    }

    @Override
    public String visitConstDefinition(PascalToCParser.ConstDefinitionContext ctx) {
        variableToType.put(ctx.getChild(0).getText(), visit(ctx.getChild(2)));
        return "const " +
               visit(ctx.getChild(2)) +
               " " +
               ctx.getChild(0).getText() +
               " = " +
               visit(ctx.getChild(4));
    }

    @Override
    public String visitConstValue(PascalToCParser.ConstValueContext ctx) {
        return ctx.getChild(0).getText() + ";";
    }

    @Override
    public String visitVarBlock(PascalToCParser.VarBlockContext ctx) {
        var result = new StringBuilder();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            result.append(visit(ctx.getChild(i))).append(System.lineSeparator());
        }
        return result.toString();
    }

    @Override
    public String visitVarDefinition(PascalToCParser.VarDefinitionContext ctx) {
        var result = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i += 2) {
            result.append(visit(ctx.getChild(i))).append("; ").append(System.lineSeparator());
        }
        return result.toString();
    }

    @Override
    public String visitVarIdent(PascalToCParser.VarIdentContext ctx) {
        var type = visit(ctx.getChild(2));
        Arrays.stream(ctx.getChild(0).getText().split(","))
              .forEach(name -> variableToType.put(name, type));
        var variables = ctx.getChild(0).getText();
        if (type.equals("char *")) {
            return "char " + Arrays.stream(variables.split(",")).map(name -> "*" + name)
                                   .collect(Collectors.joining(", "));
        }
        return type + " " + variables;
    }

    @Override
    public String visitIdentList(PascalToCParser.IdentListContext ctx) {
        var result = new StringBuilder(ctx.getChild(0).getText());
        for (int i = 2; i < ctx.getChildCount(); i += 2) {
            result.append(", ").append(ctx.getChild(i).getText());
        }
        return result.toString();
    }

    @Override
    public String visitType(PascalToCParser.TypeContext ctx) {
        String type = ctx.getChild(0).getText();
        switch (type.toLowerCase()) {
            case ("integer"):
                return "int";
            case ("double"):
                return "double";
            case ("boolean"):
                return "bool";
            case ("string"):
                return "char *";
            case ("char"):
                return "char";
            default:
                return "Unknown type";
        }
    }

    @Override
    public String visitFunctionBlock(PascalToCParser.FunctionBlockContext ctx) {
        var isFunction = ctx.getChild(0).getChild(0).getText().equalsIgnoreCase("function");
        var args = ctx.getChildCount() == 4 ? visit(ctx.getChild(1)) : "";
        if (isFunction) {
            funName = ctx.getChild(0).getChild(1).getText();
            args += visit(ctx.getChild(0).getChild(6)) + " result;" + System.lineSeparator();
        }
        // Arguments by value and link
        functionNameToArguments.put(funName, new ArrayList<>());
        functionNameToArgumentsByName.put(funName, new HashMap<>());
        var header = visit(ctx.getChild(0));


        var codeBlock = ctx.getChildCount() == 4 ? visit(ctx.getChild(2)) : visit(ctx.getChild(1));
        var startBlock = codeBlock.charAt(0) == '{' ? 2 : 0;
        funName = "";
        return header + " {" + System.lineSeparator() + args +
               codeBlock.substring(startBlock, codeBlock.length() - 1) +
               (isFunction ? "return result;" + System.lineSeparator() : "") + "}";
    }

    @Override
    public String visitFunctionDefinition(PascalToCParser.FunctionDefinitionContext ctx) {
        return visit(ctx.getChild(6)) + " " +
               ctx.getChild(1).getText() + "(" +
               visit(ctx.getChild(3)) + ")";
    }

    @Override
    public String visitProcedureDefinition(PascalToCParser.ProcedureDefinitionContext ctx) {
        return "void " +
               ctx.getChild(1).getText() + "(" +
               visit(ctx.getChild(3)) + ")";
    }

    @Override
    public String visitArgs(PascalToCParser.ArgsContext ctx) {
        if (ctx.getChildCount() == 0)
            return "";

        var result = new StringBuilder();

        for (int i = 0; i < ctx.getChildCount(); ) {
            var is_var = ctx.getChild(i).getText().equals("var");

            if (is_var)
                i++;

            String type = visit(ctx.getChild(i + 2));


            String[] names = ctx.getChild(i).getText().split(",");
            for (var name : names) {
                if (is_var) {
                    functionNameToArguments.get(funName).add(true);
                    functionNameToArgumentsByName.get(funName).put(name, true);
                } else {
                    functionNameToArguments.get(funName).add(false);
                    functionNameToArgumentsByName.get(funName).put(name, false);
                }
            }
            result.append(type);
            if (is_var) {
                result.append(" *");
            } else {
                result.append(" ");
            }
            result.append(names[0].strip());

            for (int j = 1; j < names.length; j++) {
                result.append(", ");
                if (is_var) {
                    result.append(type).append(" *").append(names[j]);
                } else {
                    result.append(type).append(" ").append(names[j]);
                }
            }

            if (i + 4 < ctx.getChildCount()) {
                result.append(", ");
            }
            i += 4;
        }
        return result.toString();
    }

    @Override
    public String visitCodeBlock(PascalToCParser.CodeBlockContext ctx) {
        return "{" + System.lineSeparator() + visit(ctx.getChild(1)) + System.lineSeparator() + "}";
    }

    @Override
    public String visitStatements(PascalToCParser.StatementsContext ctx) {
        var result = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i += 2) {
            result.append(visit(ctx.getChild(i))).append(System.lineSeparator());
        }
        return result.toString();
    }

    @Override
    public String visitStatement(PascalToCParser.StatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitSimpleStatement(PascalToCParser.SimpleStatementContext ctx) {
        if (ctx.getChildCount() != 0) {
            return visit(ctx.getChild(0)) + ";";
        }
        return "";
    }

    @Override
    public String visitAssignStatement(PascalToCParser.AssignStatementContext ctx) {
        return visit(ctx.getChild(0)) + " = " + visit(ctx.getChild(2));
    }

    @Override
    public String visitProcedureStatement(PascalToCParser.ProcedureStatementContext ctx) {
        functionCallName = ctx.getChild(0).getText();
        if (ctx.getChild(0).getText().equalsIgnoreCase("writeln")) {
            var types = new StringBuilder();
            var arguments = visit(ctx.getChild(2));
            Arrays.stream(arguments.split(",")).map(String::strip)
                  .forEachOrdered(name -> {
                      String type = "%s";
                      if (variableToType.containsKey(name)) {
                          type = typesMap.get(variableToType.get(name));
                      }
                      types.append(type).append(" ");
                  });
            return "printf(\"" + types.toString().strip() + "\", " + arguments + ")";
        }
        return ctx.getChild(0).getText() + "(" + visit(ctx.getChild(2)) + ")";
    }

    @Override
    public String visitExpression(PascalToCParser.ExpressionContext ctx) {
        var result = new StringBuilder(visit(ctx.getChild(0)));
        for (int i = 1; i < ctx.getChildCount(); i++) {
            result.append(" ").append(visit(ctx.getChild(i)));
        }
        return result.toString();
    }

    @Override
    public String visitSimpleExpression(PascalToCParser.SimpleExpressionContext ctx) {
        var result = new StringBuilder(visit(ctx.getChild(0)));
        for (int i = 1; i < ctx.getChildCount(); i++) {
            result.append(" ").append(visit(ctx.getChild(i)));
        }
        return result.toString();
    }

    @Override
    public String visitTerm(PascalToCParser.TermContext ctx) {
        var result = new StringBuilder(visit(ctx.getChild(0)));
        for (int i = 1; i < ctx.getChildCount(); i++) {
            result.append(" ").append(visit(ctx.getChild(i)));
        }
        return result.toString();
    }

    @Override
    public String visitSignedFactor(PascalToCParser.SignedFactorContext ctx) {
        if (ctx.getChildCount() == 2) {
            return ctx.getChild(0) + visit(ctx.getChild(1));
        }
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitFactor(PascalToCParser.FactorContext ctx) {
        switch (ctx.getChildCount()) {
            case 1:
                return visit(ctx.getChild(0));
            case 2:
                return "!" + visit(ctx.getChild(1));
            default:
                return "(" + visit(ctx.getChild(1)) + ")";
        }
    }

    @Override
    public String visitFunctionalCall(PascalToCParser.FunctionalCallContext ctx) {
        functionCallName = ctx.getChild(0).getText();
        if (ctx.getChild(0).getText().equalsIgnoreCase("writeln")) {
            var types = new StringBuilder();
            var arguments = visit(ctx.getChild(2));
            Arrays.stream(arguments.split(",")).map(String::strip)
                  .forEachOrdered(name -> {
                      String type = "%s";
                      if (variableToType.containsKey(name)) {
                          type = typesMap.get(variableToType.get(name));
                      }
                      types.append(type).append(" ");
                  });
            return "printf(\"" + types.toString().strip() + "\", " + arguments + ")";
        }
        return ctx.getChild(0).getText() + "(" + visit(ctx.getChild(2)) + ")";
    }


    @Override
    public String visitParameterList(PascalToCParser.ParameterListContext ctx) {
        var result = new StringBuilder();
        if (functionNameToArguments.containsKey(functionCallName) &&
            functionNameToArguments.get(functionCallName).size() > 0) {

            if (functionNameToArguments.get(functionCallName).get(0)) {
                result.append("&").append(visit(ctx.getChild(0)));
            } else {
                result.append(visit(ctx.getChild(0)));
            }
        } else {
            result.append(visit(ctx.getChild(0)));
        }
        for (int i = 2; i < ctx.getChildCount(); i += 2) {
            if (functionNameToArguments.containsKey(functionCallName) &&
                functionNameToArguments.get(functionCallName).size() > 0 &&
                functionNameToArguments.get(functionCallName).get(i / 2)) {
                result.append(", &").append(visit(ctx.getChild(i)));
            } else {
                result.append(", ").append(visit(ctx.getChild(i)));
            }
        }
        return result.toString();
    }

    @Override
    public String visitSecondPriorityOperator(PascalToCParser.SecondPriorityOperatorContext ctx) {
        switch (ctx.getText().toLowerCase()) {
            case "div":
                return "/";
            case "mod":
                return "%";
            case "and":
                return "&&";
            default:
                return ctx.getText();
        }
    }

    @Override
    public String visitThirdPriorityOperator(PascalToCParser.ThirdPriorityOperatorContext ctx) {
        if (ctx.getText().equalsIgnoreCase("or")) {
            return "||";
        }
        return ctx.getText();
    }

    @Override
    public String visitLastPriorityOperator(PascalToCParser.LastPriorityOperatorContext ctx) {
        switch (ctx.getText().toLowerCase()) {
            case "=":
                return "==";
            case "<>":
                return "!=";
            default:
                return ctx.getText();
        }
    }

    @Override
    public String visitVarName(PascalToCParser.VarNameContext ctx) {
        String varName = ctx.getText();
        String result = varName.equals(funName) ? "result" : varName;
        if (result.equals("result")) {
            return result;
        }
        if (functionNameToArgumentsByName.containsKey(funName) &&
            functionNameToArgumentsByName.get(funName).containsKey(varName) &&
            functionNameToArgumentsByName.get(funName).get(varName)) {
            return "*" + varName;
        }
        return varName;
    }

    @Override
    public String visitStructuredStatement(PascalToCParser.StructuredStatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitConditionalStatement(PascalToCParser.ConditionalStatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitIfStatement(PascalToCParser.IfStatementContext ctx) {
        return "if (" + visit(ctx.getChild(1)) + ")" + System.lineSeparator() +
               visit(ctx.getChild(3)) + System.lineSeparator() +
               (ctx.getChildCount() > 4 ? "else" + System.lineSeparator() + visit(ctx.getChild(5)) : "");
    }

    @Override
    public String visitRepetetiveStatement(PascalToCParser.RepetetiveStatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitWhileStatement(PascalToCParser.WhileStatementContext ctx) {
        return "while (" + visit(ctx.getChild(1)) + ") {" + System.lineSeparator() +
               visit(ctx.getChild(3)) + System.lineSeparator() + "}";
    }

    @Override
    public String visitRepeatStatement(PascalToCParser.RepeatStatementContext ctx) {
        return "do {" + System.lineSeparator() + visit(ctx.getChild(1)) + System.lineSeparator() +
               "} while(" + visit(ctx.getChild(3)) + ")";
    }

    @Override
    public String visitForStatement(PascalToCParser.ForStatementContext ctx) {
        return "for (int " + ctx.getChild(1).getText() + " = " + visit(ctx.getChild(3)) + "; " +
               ctx.getChild(1).getText() +
               (ctx.getChild(4).getText().equalsIgnoreCase("to") ? " < " : " > ") +
               visit(ctx.getChild(5)) + "; " + ctx.getChild(1).getText() +
               (ctx.getChild(4).getText().equalsIgnoreCase("to") ? "++" : "--") +
               ")" + System.lineSeparator() +
               visit(ctx.getChild(7));
    }

    @Override
    public String visitBool(PascalToCParser.BoolContext ctx) {
        return ctx.getText().equalsIgnoreCase("true") ? "true" : "false";
    }

    @Override
    public String visitNumberConst(PascalToCParser.NumberConstContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLiteralConst(PascalToCParser.LiteralConstContext ctx) {
        return "\"" + ctx.getText().substring(1, ctx.getText().length() - 1) + "\"";
    }

    @Override
    public String visitNullConst(PascalToCParser.NullConstContext ctx) {
        return "NULL";
    }

    @Override
    public String visitUnsignedNumber(PascalToCParser.UnsignedNumberContext ctx) {
        return ctx.getText();
    }
}
