// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-parser/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLParserDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParserDistSQLStatementParser}.
 */
public interface SQLParserDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SQLParserDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SQLParserDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#showSQLParserRule}.
	 * @param ctx the parse tree
	 */
	void enterShowSQLParserRule(SQLParserDistSQLStatementParser.ShowSQLParserRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#showSQLParserRule}.
	 * @param ctx the parse tree
	 */
	void exitShowSQLParserRule(SQLParserDistSQLStatementParser.ShowSQLParserRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#alterSQLParserRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterSQLParserRule(SQLParserDistSQLStatementParser.AlterSQLParserRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#alterSQLParserRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterSQLParserRule(SQLParserDistSQLStatementParser.AlterSQLParserRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#sqlParserRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSqlParserRuleDefinition(SQLParserDistSQLStatementParser.SqlParserRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#sqlParserRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSqlParserRuleDefinition(SQLParserDistSQLStatementParser.SqlParserRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#parseTreeCacheDefinition}.
	 * @param ctx the parse tree
	 */
	void enterParseTreeCacheDefinition(SQLParserDistSQLStatementParser.ParseTreeCacheDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#parseTreeCacheDefinition}.
	 * @param ctx the parse tree
	 */
	void exitParseTreeCacheDefinition(SQLParserDistSQLStatementParser.ParseTreeCacheDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#sqlStatementCacheDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatementCacheDefinition(SQLParserDistSQLStatementParser.SqlStatementCacheDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#sqlStatementCacheDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatementCacheDefinition(SQLParserDistSQLStatementParser.SqlStatementCacheDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#cacheOption}.
	 * @param ctx the parse tree
	 */
	void enterCacheOption(SQLParserDistSQLStatementParser.CacheOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#cacheOption}.
	 * @param ctx the parse tree
	 */
	void exitCacheOption(SQLParserDistSQLStatementParser.CacheOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#initialCapacity}.
	 * @param ctx the parse tree
	 */
	void enterInitialCapacity(SQLParserDistSQLStatementParser.InitialCapacityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#initialCapacity}.
	 * @param ctx the parse tree
	 */
	void exitInitialCapacity(SQLParserDistSQLStatementParser.InitialCapacityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserDistSQLStatementParser#maximumSize}.
	 * @param ctx the parse tree
	 */
	void enterMaximumSize(SQLParserDistSQLStatementParser.MaximumSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserDistSQLStatementParser#maximumSize}.
	 * @param ctx the parse tree
	 */
	void exitMaximumSize(SQLParserDistSQLStatementParser.MaximumSizeContext ctx);
}