// Generated from /Users/code/gitcode/shardingsphere/kernel/global-clock/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/GlobalClockDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GlobalClockDistSQLStatementParser}.
 */
public interface GlobalClockDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(GlobalClockDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(GlobalClockDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#showGlobalClockRule}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalClockRule(GlobalClockDistSQLStatementParser.ShowGlobalClockRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#showGlobalClockRule}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalClockRule(GlobalClockDistSQLStatementParser.ShowGlobalClockRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#alterGlobalClockRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterGlobalClockRule(GlobalClockDistSQLStatementParser.AlterGlobalClockRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#alterGlobalClockRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterGlobalClockRule(GlobalClockDistSQLStatementParser.AlterGlobalClockRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#globalClockRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGlobalClockRuleDefinition(GlobalClockDistSQLStatementParser.GlobalClockRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#globalClockRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGlobalClockRuleDefinition(GlobalClockDistSQLStatementParser.GlobalClockRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(GlobalClockDistSQLStatementParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(GlobalClockDistSQLStatementParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#providerDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProviderDefinition(GlobalClockDistSQLStatementParser.ProviderDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#providerDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProviderDefinition(GlobalClockDistSQLStatementParser.ProviderDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#enabledDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnabledDefinition(GlobalClockDistSQLStatementParser.EnabledDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#enabledDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnabledDefinition(GlobalClockDistSQLStatementParser.EnabledDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(GlobalClockDistSQLStatementParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(GlobalClockDistSQLStatementParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#providerName}.
	 * @param ctx the parse tree
	 */
	void enterProviderName(GlobalClockDistSQLStatementParser.ProviderNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#providerName}.
	 * @param ctx the parse tree
	 */
	void exitProviderName(GlobalClockDistSQLStatementParser.ProviderNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#enabled}.
	 * @param ctx the parse tree
	 */
	void enterEnabled(GlobalClockDistSQLStatementParser.EnabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#enabled}.
	 * @param ctx the parse tree
	 */
	void exitEnabled(GlobalClockDistSQLStatementParser.EnabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(GlobalClockDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(GlobalClockDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(GlobalClockDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(GlobalClockDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(GlobalClockDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(GlobalClockDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalClockDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GlobalClockDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalClockDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GlobalClockDistSQLStatementParser.LiteralContext ctx);
}