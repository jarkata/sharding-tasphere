// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-translator/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLTranslatorDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLTranslatorDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLTranslatorDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SQLTranslatorDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#showSQLTranslatorRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSQLTranslatorRule(SQLTranslatorDistSQLStatementParser.ShowSQLTranslatorRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#alterSQLTranslatorRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSQLTranslatorRule(SQLTranslatorDistSQLStatementParser.AlterSQLTranslatorRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#sqlTranslatorRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlTranslatorRuleDefinition(SQLTranslatorDistSQLStatementParser.SqlTranslatorRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#useOriginalSQLDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseOriginalSQLDefinition(SQLTranslatorDistSQLStatementParser.UseOriginalSQLDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#useOriginalSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseOriginalSQL(SQLTranslatorDistSQLStatementParser.UseOriginalSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(SQLTranslatorDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(SQLTranslatorDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#buildInProviderTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInProviderTypeName(SQLTranslatorDistSQLStatementParser.BuildInProviderTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(SQLTranslatorDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(SQLTranslatorDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(SQLTranslatorDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SQLTranslatorDistSQLStatementParser.LiteralContext ctx);
}