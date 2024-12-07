// Generated from /Users/code/gitcode/shardingsphere/features/broadcast/distsql/parser/src/main/antlr4/broadcast/org/apache/shardingsphere/distsql/parser/autogen/BroadcastDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BroadcastDistSQLStatementParser}.
 */
public interface BroadcastDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(BroadcastDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(BroadcastDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#createBroadcastTableRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateBroadcastTableRule(BroadcastDistSQLStatementParser.CreateBroadcastTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#createBroadcastTableRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateBroadcastTableRule(BroadcastDistSQLStatementParser.CreateBroadcastTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#dropBroadcastTableRule}.
	 * @param ctx the parse tree
	 */
	void enterDropBroadcastTableRule(BroadcastDistSQLStatementParser.DropBroadcastTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#dropBroadcastTableRule}.
	 * @param ctx the parse tree
	 */
	void exitDropBroadcastTableRule(BroadcastDistSQLStatementParser.DropBroadcastTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BroadcastDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BroadcastDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(BroadcastDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(BroadcastDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(BroadcastDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(BroadcastDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(BroadcastDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(BroadcastDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(BroadcastDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(BroadcastDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#showBroadcastTableRules}.
	 * @param ctx the parse tree
	 */
	void enterShowBroadcastTableRules(BroadcastDistSQLStatementParser.ShowBroadcastTableRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#showBroadcastTableRules}.
	 * @param ctx the parse tree
	 */
	void exitShowBroadcastTableRules(BroadcastDistSQLStatementParser.ShowBroadcastTableRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroadcastDistSQLStatementParser#countBroadcastRule}.
	 * @param ctx the parse tree
	 */
	void enterCountBroadcastRule(BroadcastDistSQLStatementParser.CountBroadcastRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroadcastDistSQLStatementParser#countBroadcastRule}.
	 * @param ctx the parse tree
	 */
	void exitCountBroadcastRule(BroadcastDistSQLStatementParser.CountBroadcastRuleContext ctx);
}