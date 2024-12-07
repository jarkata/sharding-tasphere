// Generated from /Users/code/gitcode/shardingsphere/features/mask/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/MaskDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MaskDistSQLStatementParser}.
 */
public interface MaskDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(MaskDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(MaskDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#createMaskRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaskRule(MaskDistSQLStatementParser.CreateMaskRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#createMaskRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaskRule(MaskDistSQLStatementParser.CreateMaskRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#alterMaskRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaskRule(MaskDistSQLStatementParser.AlterMaskRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#alterMaskRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaskRule(MaskDistSQLStatementParser.AlterMaskRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#dropMaskRule}.
	 * @param ctx the parse tree
	 */
	void enterDropMaskRule(MaskDistSQLStatementParser.DropMaskRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#dropMaskRule}.
	 * @param ctx the parse tree
	 */
	void exitDropMaskRule(MaskDistSQLStatementParser.DropMaskRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#maskRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMaskRuleDefinition(MaskDistSQLStatementParser.MaskRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#maskRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMaskRuleDefinition(MaskDistSQLStatementParser.MaskRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(MaskDistSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(MaskDistSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(MaskDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(MaskDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(MaskDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(MaskDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(MaskDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(MaskDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MaskDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MaskDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(MaskDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(MaskDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(MaskDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(MaskDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#buildInMaskAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInMaskAlgorithmType(MaskDistSQLStatementParser.BuildInMaskAlgorithmTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#buildInMaskAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInMaskAlgorithmType(MaskDistSQLStatementParser.BuildInMaskAlgorithmTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(MaskDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(MaskDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(MaskDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(MaskDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(MaskDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(MaskDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(MaskDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(MaskDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#showMaskRules}.
	 * @param ctx the parse tree
	 */
	void enterShowMaskRules(MaskDistSQLStatementParser.ShowMaskRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#showMaskRules}.
	 * @param ctx the parse tree
	 */
	void exitShowMaskRules(MaskDistSQLStatementParser.ShowMaskRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#countMaskRule}.
	 * @param ctx the parse tree
	 */
	void enterCountMaskRule(MaskDistSQLStatementParser.CountMaskRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#countMaskRule}.
	 * @param ctx the parse tree
	 */
	void exitCountMaskRule(MaskDistSQLStatementParser.CountMaskRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(MaskDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(MaskDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaskDistSQLStatementParser#showMaskAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowMaskAlgorithmPlugins(MaskDistSQLStatementParser.ShowMaskAlgorithmPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaskDistSQLStatementParser#showMaskAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowMaskAlgorithmPlugins(MaskDistSQLStatementParser.ShowMaskAlgorithmPluginsContext ctx);
}