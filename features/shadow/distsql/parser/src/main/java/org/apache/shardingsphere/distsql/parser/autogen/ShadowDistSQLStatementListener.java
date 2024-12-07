// Generated from /Users/code/gitcode/shardingsphere/features/shadow/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/ShadowDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShadowDistSQLStatementParser}.
 */
public interface ShadowDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(ShadowDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(ShadowDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#createShadowRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateShadowRule(ShadowDistSQLStatementParser.CreateShadowRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#createShadowRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateShadowRule(ShadowDistSQLStatementParser.CreateShadowRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#alterShadowRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterShadowRule(ShadowDistSQLStatementParser.AlterShadowRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#alterShadowRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterShadowRule(ShadowDistSQLStatementParser.AlterShadowRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#dropShadowRule}.
	 * @param ctx the parse tree
	 */
	void enterDropShadowRule(ShadowDistSQLStatementParser.DropShadowRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#dropShadowRule}.
	 * @param ctx the parse tree
	 */
	void exitDropShadowRule(ShadowDistSQLStatementParser.DropShadowRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#dropShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterDropShadowAlgorithm(ShadowDistSQLStatementParser.DropShadowAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#dropShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitDropShadowAlgorithm(ShadowDistSQLStatementParser.DropShadowAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#createDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefaultShadowAlgorithm(ShadowDistSQLStatementParser.CreateDefaultShadowAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#createDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefaultShadowAlgorithm(ShadowDistSQLStatementParser.CreateDefaultShadowAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#dropDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterDropDefaultShadowAlgorithm(ShadowDistSQLStatementParser.DropDefaultShadowAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#dropDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitDropDefaultShadowAlgorithm(ShadowDistSQLStatementParser.DropDefaultShadowAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#alterDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefaultShadowAlgorithm(ShadowDistSQLStatementParser.AlterDefaultShadowAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#alterDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefaultShadowAlgorithm(ShadowDistSQLStatementParser.AlterDefaultShadowAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#shadowRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterShadowRuleDefinition(ShadowDistSQLStatementParser.ShadowRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#shadowRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitShadowRuleDefinition(ShadowDistSQLStatementParser.ShadowRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#shadowTableRule}.
	 * @param ctx the parse tree
	 */
	void enterShadowTableRule(ShadowDistSQLStatementParser.ShadowTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#shadowTableRule}.
	 * @param ctx the parse tree
	 */
	void exitShadowTableRule(ShadowDistSQLStatementParser.ShadowTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(ShadowDistSQLStatementParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(ShadowDistSQLStatementParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#shadow}.
	 * @param ctx the parse tree
	 */
	void enterShadow(ShadowDistSQLStatementParser.ShadowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#shadow}.
	 * @param ctx the parse tree
	 */
	void exitShadow(ShadowDistSQLStatementParser.ShadowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ShadowDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ShadowDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmName(ShadowDistSQLStatementParser.AlgorithmNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmName(ShadowDistSQLStatementParser.AlgorithmNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(ShadowDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(ShadowDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(ShadowDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(ShadowDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ShadowDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ShadowDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(ShadowDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(ShadowDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(ShadowDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(ShadowDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#buildInShadowAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInShadowAlgorithmType(ShadowDistSQLStatementParser.BuildInShadowAlgorithmTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#buildInShadowAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInShadowAlgorithmType(ShadowDistSQLStatementParser.BuildInShadowAlgorithmTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(ShadowDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(ShadowDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(ShadowDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(ShadowDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ShadowDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ShadowDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(ShadowDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(ShadowDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowRules}.
	 * @param ctx the parse tree
	 */
	void enterShowShadowRules(ShadowDistSQLStatementParser.ShowShadowRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowRules}.
	 * @param ctx the parse tree
	 */
	void exitShowShadowRules(ShadowDistSQLStatementParser.ShowShadowRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowTableRules}.
	 * @param ctx the parse tree
	 */
	void enterShowShadowTableRules(ShadowDistSQLStatementParser.ShowShadowTableRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowTableRules}.
	 * @param ctx the parse tree
	 */
	void exitShowShadowTableRules(ShadowDistSQLStatementParser.ShowShadowTableRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowAlgorithms}.
	 * @param ctx the parse tree
	 */
	void enterShowShadowAlgorithms(ShadowDistSQLStatementParser.ShowShadowAlgorithmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowAlgorithms}.
	 * @param ctx the parse tree
	 */
	void exitShowShadowAlgorithms(ShadowDistSQLStatementParser.ShowShadowAlgorithmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#showDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterShowDefaultShadowAlgorithm(ShadowDistSQLStatementParser.ShowDefaultShadowAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#showDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitShowDefaultShadowAlgorithm(ShadowDistSQLStatementParser.ShowDefaultShadowAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#shadowRule}.
	 * @param ctx the parse tree
	 */
	void enterShadowRule(ShadowDistSQLStatementParser.ShadowRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#shadowRule}.
	 * @param ctx the parse tree
	 */
	void exitShadowRule(ShadowDistSQLStatementParser.ShadowRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#countShadowRule}.
	 * @param ctx the parse tree
	 */
	void enterCountShadowRule(ShadowDistSQLStatementParser.CountShadowRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#countShadowRule}.
	 * @param ctx the parse tree
	 */
	void exitCountShadowRule(ShadowDistSQLStatementParser.CountShadowRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 */
	void enterTableRule(ShadowDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 */
	void exitTableRule(ShadowDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(ShadowDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(ShadowDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowShadowAlgorithmPlugins(ShadowDistSQLStatementParser.ShowShadowAlgorithmPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowShadowAlgorithmPlugins(ShadowDistSQLStatementParser.ShowShadowAlgorithmPluginsContext ctx);
}