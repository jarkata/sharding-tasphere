// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-parser/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLParserDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParserDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLParserDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SQLParserDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#showSQLParserRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSQLParserRule(SQLParserDistSQLStatementParser.ShowSQLParserRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#alterSQLParserRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSQLParserRule(SQLParserDistSQLStatementParser.AlterSQLParserRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#sqlParserRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlParserRuleDefinition(SQLParserDistSQLStatementParser.SqlParserRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#parseTreeCacheDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseTreeCacheDefinition(SQLParserDistSQLStatementParser.ParseTreeCacheDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#sqlStatementCacheDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatementCacheDefinition(SQLParserDistSQLStatementParser.SqlStatementCacheDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#cacheOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheOption(SQLParserDistSQLStatementParser.CacheOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#initialCapacity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialCapacity(SQLParserDistSQLStatementParser.InitialCapacityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParserDistSQLStatementParser#maximumSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximumSize(SQLParserDistSQLStatementParser.MaximumSizeContext ctx);
}