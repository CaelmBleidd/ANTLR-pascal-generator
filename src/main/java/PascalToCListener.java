// Generated from /Users/CaelmBleidd/Programming/ANTLR-pascal-generator/src/main/java/PascalToC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalToCParser}.
 */
public interface PascalToCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalToCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalToCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(PascalToCParser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(PascalToCParser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#blocks}.
	 * @param ctx the parse tree
	 */
	void enterBlocks(PascalToCParser.BlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#blocks}.
	 * @param ctx the parse tree
	 */
	void exitBlocks(PascalToCParser.BlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstBlock(PascalToCParser.ConstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstBlock(PascalToCParser.ConstBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(PascalToCParser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(PascalToCParser.ConstDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(PascalToCParser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(PascalToCParser.ConstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarBlock(PascalToCParser.VarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarBlock(PascalToCParser.VarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(PascalToCParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(PascalToCParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#varIdent}.
	 * @param ctx the parse tree
	 */
	void enterVarIdent(PascalToCParser.VarIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#varIdent}.
	 * @param ctx the parse tree
	 */
	void exitVarIdent(PascalToCParser.VarIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#identList}.
	 * @param ctx the parse tree
	 */
	void enterIdentList(PascalToCParser.IdentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#identList}.
	 * @param ctx the parse tree
	 */
	void exitIdentList(PascalToCParser.IdentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalToCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalToCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(PascalToCParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(PascalToCParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PascalToCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PascalToCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#procedureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDefinition(PascalToCParser.ProcedureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#procedureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDefinition(PascalToCParser.ProcedureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PascalToCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PascalToCParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(PascalToCParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(PascalToCParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalToCParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalToCParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalToCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalToCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalToCParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalToCParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(PascalToCParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(PascalToCParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascalToCParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascalToCParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalToCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalToCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalToCParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalToCParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalToCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalToCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascalToCParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascalToCParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalToCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalToCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#functionalCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalCall(PascalToCParser.FunctionalCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#functionalCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalCall(PascalToCParser.FunctionalCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascalToCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascalToCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#secondPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void enterSecondPriorityOperator(PascalToCParser.SecondPriorityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#secondPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void exitSecondPriorityOperator(PascalToCParser.SecondPriorityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#thirdPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void enterThirdPriorityOperator(PascalToCParser.ThirdPriorityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#thirdPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void exitThirdPriorityOperator(PascalToCParser.ThirdPriorityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#lastPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void enterLastPriorityOperator(PascalToCParser.LastPriorityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#lastPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void exitLastPriorityOperator(PascalToCParser.LastPriorityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(PascalToCParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(PascalToCParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalToCParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalToCParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PascalToCParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PascalToCParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalToCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalToCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(PascalToCParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(PascalToCParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascalToCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascalToCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PascalToCParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PascalToCParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascalToCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascalToCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PascalToCParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PascalToCParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumberConst(PascalToCParser.NumberConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumberConst(PascalToCParser.NumberConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConst(PascalToCParser.LiteralConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConst(PascalToCParser.LiteralConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterNullConst(PascalToCParser.NullConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullConst}
	 * labeled alternative in {@link PascalToCParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitNullConst(PascalToCParser.NullConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascalToCParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascalToCParser.UnsignedNumberContext ctx);
}