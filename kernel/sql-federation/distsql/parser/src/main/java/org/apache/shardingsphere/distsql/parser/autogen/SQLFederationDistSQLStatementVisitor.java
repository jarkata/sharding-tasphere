// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-federation/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLFederationDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLFederationDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLFederationDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SQLFederationDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#showSQLFederationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSQLFederationRule(SQLFederationDistSQLStatementParser.ShowSQLFederationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#alterSQLFederationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSQLFederationRule(SQLFederationDistSQLStatementParser.AlterSQLFederationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#sqlFederationRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlFederationRuleDefinition(SQLFederationDistSQLStatementParser.SqlFederationRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#sqlFederationEnabled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlFederationEnabled(SQLFederationDistSQLStatementParser.SqlFederationEnabledContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#allQueryUseSQLFederation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllQueryUseSQLFederation(SQLFederationDistSQLStatementParser.AllQueryUseSQLFederationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#executionPlanCache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutionPlanCache(SQLFederationDistSQLStatementParser.ExecutionPlanCacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#boolean_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_(SQLFederationDistSQLStatementParser.Boolean_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#cacheOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheOption(SQLFederationDistSQLStatementParser.CacheOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#initialCapacity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialCapacity(SQLFederationDistSQLStatementParser.InitialCapacityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLFederationDistSQLStatementParser#maximumSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximumSize(SQLFederationDistSQLStatementParser.MaximumSizeContext ctx);
}