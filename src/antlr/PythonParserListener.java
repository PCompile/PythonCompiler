// Generated from C:/PythonCompiler/src/antlr/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStmt}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(PythonParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStmt}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(PythonParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(PythonParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(PythonParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmt(PythonParser.SmallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmt(PythonParser.SmallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link PythonParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(PythonParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link PythonParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(PythonParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpr}
	 * labeled alternative in {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(PythonParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpr}
	 * labeled alternative in {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(PythonParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(PythonParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(PythonParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PythonParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PythonParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefStmt(PythonParser.FunctionDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefStmt(PythonParser.FunctionDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParamList(PythonParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParamList(PythonParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefStmt}
	 * labeled alternative in {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassDefStmt(PythonParser.ClassDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefStmt}
	 * labeled alternative in {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassDefStmt(PythonParser.ClassDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DottedName}
	 * labeled alternative in {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DottedName}
	 * labeled alternative in {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSuite(PythonParser.SimpleSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSuite(PythonParser.SimpleSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterBlockSuite(PythonParser.BlockSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitBlockSuite(PythonParser.BlockSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(PythonParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(PythonParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(PythonParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(PythonParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(PythonParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(PythonParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(PythonParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(PythonParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(PythonParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(PythonParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(PythonParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(PythonParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketAtomExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBracketAtomExpr(PythonParser.BracketAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketAtomExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBracketAtomExpr(PythonParser.BracketAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAttributeExpr(PythonParser.AttributeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAttributeExpr(PythonParser.AttributeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntNumber(PythonParser.IntNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntNumber(PythonParser.IntNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BRACEAtomExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBRACEAtomExpr(PythonParser.BRACEAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BRACEAtomExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBRACEAtomExpr(PythonParser.BRACEAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(PythonParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(PythonParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNumber(PythonParser.DoubleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNumber(PythonParser.DoubleNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenAtomExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenAtomExpr(PythonParser.ParenAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenAtomExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenAtomExpr(PythonParser.ParenAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpr(PythonParser.BracketExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpr(PythonParser.BracketExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(PythonParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(PythonParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PythonParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PythonParser.ArgListContext ctx);
}