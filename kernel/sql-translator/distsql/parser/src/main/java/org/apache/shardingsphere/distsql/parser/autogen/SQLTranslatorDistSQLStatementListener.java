// Generated from /Users/code/gitcode/shardingsphere/kernel/sql-translator/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SQLTranslatorDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLTranslatorDistSQLStatementParser}.
 */
public interface SQLTranslatorDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SQLTranslatorDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SQLTranslatorDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#showSQLTranslatorRule}.
	 * @param ctx the parse tree
	 */
	void enterShowSQLTranslatorRule(SQLTranslatorDistSQLStatementParser.ShowSQLTranslatorRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#showSQLTranslatorRule}.
	 * @param ctx the parse tree
	 */
	void exitShowSQLTranslatorRule(SQLTranslatorDistSQLStatementParser.ShowSQLTranslatorRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#alterSQLTranslatorRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterSQLTranslatorRule(SQLTranslatorDistSQLStatementParser.AlterSQLTranslatorRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#alterSQLTranslatorRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterSQLTranslatorRule(SQLTranslatorDistSQLStatementParser.AlterSQLTranslatorRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#sqlTranslatorRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSqlTranslatorRuleDefinition(SQLTranslatorDistSQLStatementParser.SqlTranslatorRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#sqlTranslatorRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSqlTranslatorRuleDefinition(SQLTranslatorDistSQLStatementParser.SqlTranslatorRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#useOriginalSQLDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUseOriginalSQLDefinition(SQLTranslatorDistSQLStatementParser.UseOriginalSQLDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#useOriginalSQLDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUseOriginalSQLDefinition(SQLTranslatorDistSQLStatementParser.UseOriginalSQLDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#useOriginalSQL}.
	 * @param ctx the parse tree
	 */
	void enterUseOriginalSQL(SQLTranslatorDistSQLStatementParser.UseOriginalSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#useOriginalSQL}.
	 * @param ctx the parse tree
	 */
	void exitUseOriginalSQL(SQLTranslatorDistSQLStatementParser.UseOriginalSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(SQLTranslatorDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(SQLTranslatorDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(SQLTranslatorDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(SQLTranslatorDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#buildInProviderTypeName}.
	 * @param ctx the parse tree
	 */
	void enterBuildInProviderTypeName(SQLTranslatorDistSQLStatementParser.BuildInProviderTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#buildInProviderTypeName}.
	 * @param ctx the parse tree
	 */
	void exitBuildInProviderTypeName(SQLTranslatorDistSQLStatementParser.BuildInProviderTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(SQLTranslatorDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(SQLTranslatorDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(SQLTranslatorDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(SQLTranslatorDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(SQLTranslatorDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(SQLTranslatorDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SQLTranslatorDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLTranslatorDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SQLTranslatorDistSQLStatementParser.LiteralContext ctx);
}