// Generated from /Users/CaelmBleidd/Programming/ANTLR-pascal-generator/src/main/java/PascalToC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalToCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalToCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascalToCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(PascalToCParser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#blocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocks(PascalToCParser.BlocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#constBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBlock(PascalToCParser.ConstBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#constDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDefinition(PascalToCParser.ConstDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#constValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstValue(PascalToCParser.ConstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#varBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBlock(PascalToCParser.VarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(PascalToCParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#varIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdent(PascalToCParser.VarIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#identList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentList(PascalToCParser.IdentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascalToCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(PascalToCParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PascalToCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#procedureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDefinition(PascalToCParser.ProcedureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PascalToCParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(PascalToCParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PascalToCParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascalToCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PascalToCParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(PascalToCParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(PascalToCParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PascalToCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(PascalToCParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PascalToCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(PascalToCParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PascalToCParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#functionalCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalCall(PascalToCParser.FunctionalCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PascalToCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#secondPriorityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondPriorityOperator(PascalToCParser.SecondPriorityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#thirdPriorityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThirdPriorityOperator(PascalToCParser.ThirdPriorityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#lastPriorityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastPriorityOperator(PascalToCParser.LastPriorityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(PascalToCParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(PascalToCParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(PascalToCParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascalToCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(PascalToCParser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PascalToCParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(PascalToCParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PascalToCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PascalToCParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConst(PascalToCParser.NumberConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConst(PascalToCParser.LiteralConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullConst(PascalToCParser.NullConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalToCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(PascalToCParser.UnsignedNumberContext ctx);
}