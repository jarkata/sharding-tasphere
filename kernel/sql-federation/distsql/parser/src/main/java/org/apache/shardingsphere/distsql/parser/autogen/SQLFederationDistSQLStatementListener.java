// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-federation/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLFederationDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLFederationDistSQLStatementParser}.
 */
public interface SQLFederationDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SQLFederationDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SQLFederationDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#showSQLFederationRule}.
	 * @param ctx the parse tree
	 */
	void enterShowSQLFederationRule(SQLFederationDistSQLStatementParser.ShowSQLFederationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#showSQLFederationRule}.
	 * @param ctx the parse tree
	 */
	void exitShowSQLFederationRule(SQLFederationDistSQLStatementParser.ShowSQLFederationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#alterSQLFederationRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterSQLFederationRule(SQLFederationDistSQLStatementParser.AlterSQLFederationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#alterSQLFederationRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterSQLFederationRule(SQLFederationDistSQLStatementParser.AlterSQLFederationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#sqlFederationRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSqlFederationRuleDefinition(SQLFederationDistSQLStatementParser.SqlFederationRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#sqlFederationRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSqlFederationRuleDefinition(SQLFederationDistSQLStatementParser.SqlFederationRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#sqlFederationEnabled}.
	 * @param ctx the parse tree
	 */
	void enterSqlFederationEnabled(SQLFederationDistSQLStatementParser.SqlFederationEnabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#sqlFederationEnabled}.
	 * @param ctx the parse tree
	 */
	void exitSqlFederationEnabled(SQLFederationDistSQLStatementParser.SqlFederationEnabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#allQueryUseSQLFederation}.
	 * @param ctx the parse tree
	 */
	void enterAllQueryUseSQLFederation(SQLFederationDistSQLStatementParser.AllQueryUseSQLFederationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#allQueryUseSQLFederation}.
	 * @param ctx the parse tree
	 */
	void exitAllQueryUseSQLFederation(SQLFederationDistSQLStatementParser.AllQueryUseSQLFederationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#executionPlanCache}.
	 * @param ctx the parse tree
	 */
	void enterExecutionPlanCache(SQLFederationDistSQLStatementParser.ExecutionPlanCacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#executionPlanCache}.
	 * @param ctx the parse tree
	 */
	void exitExecutionPlanCache(SQLFederationDistSQLStatementParser.ExecutionPlanCacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#boolean_}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_(SQLFederationDistSQLStatementParser.Boolean_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#boolean_}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_(SQLFederationDistSQLStatementParser.Boolean_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#cacheOption}.
	 * @param ctx the parse tree
	 */
	void enterCacheOption(SQLFederationDistSQLStatementParser.CacheOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#cacheOption}.
	 * @param ctx the parse tree
	 */
	void exitCacheOption(SQLFederationDistSQLStatementParser.CacheOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#initialCapacity}.
	 * @param ctx the parse tree
	 */
	void enterInitialCapacity(SQLFederationDistSQLStatementParser.InitialCapacityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#initialCapacity}.
	 * @param ctx the parse tree
	 */
	void exitInitialCapacity(SQLFederationDistSQLStatementParser.InitialCapacityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLFederationDistSQLStatementParser#maximumSize}.
	 * @param ctx the parse tree
	 */
	void enterMaximumSize(SQLFederationDistSQLStatementParser.MaximumSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLFederationDistSQLStatementParser#maximumSize}.
	 * @param ctx the parse tree
	 */
	void exitMaximumSize(SQLFederationDistSQLStatementParser.MaximumSizeContext ctx);
}