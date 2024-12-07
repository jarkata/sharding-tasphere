// Generated from /Users/code/gitcode/shardingsphere/features/shadow/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/ShadowDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShadowDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShadowDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(ShadowDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#createShadowRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateShadowRule(ShadowDistSQLStatementParser.CreateShadowRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#alterShadowRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterShadowRule(ShadowDistSQLStatementParser.AlterShadowRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#dropShadowRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropShadowRule(ShadowDistSQLStatementParser.DropShadowRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#dropShadowAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropShadowAlgorithm(ShadowDistSQLStatementParser.DropShadowAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#createDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefaultShadowAlgorithm(ShadowDistSQLStatementParser.CreateDefaultShadowAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#dropDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDefaultShadowAlgorithm(ShadowDistSQLStatementParser.DropDefaultShadowAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#alterDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultShadowAlgorithm(ShadowDistSQLStatementParser.AlterDefaultShadowAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#shadowRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShadowRuleDefinition(ShadowDistSQLStatementParser.ShadowRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#shadowTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShadowTableRule(ShadowDistSQLStatementParser.ShadowTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(ShadowDistSQLStatementParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#shadow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShadow(ShadowDistSQLStatementParser.ShadowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(ShadowDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmName(ShadowDistSQLStatementParser.AlgorithmNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(ShadowDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(ShadowDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ShadowDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(ShadowDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(ShadowDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#buildInShadowAlgorithmType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInShadowAlgorithmType(ShadowDistSQLStatementParser.BuildInShadowAlgorithmTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(ShadowDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(ShadowDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ShadowDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleName(ShadowDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShadowRules(ShadowDistSQLStatementParser.ShowShadowRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowTableRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShadowTableRules(ShadowDistSQLStatementParser.ShowShadowTableRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowAlgorithms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShadowAlgorithms(ShadowDistSQLStatementParser.ShowShadowAlgorithmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#showDefaultShadowAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDefaultShadowAlgorithm(ShadowDistSQLStatementParser.ShowDefaultShadowAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#shadowRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShadowRule(ShadowDistSQLStatementParser.ShadowRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#countShadowRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountShadowRule(ShadowDistSQLStatementParser.CountShadowRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRule(ShadowDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(ShadowDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShadowDistSQLStatementParser#showShadowAlgorithmPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShadowAlgorithmPlugins(ShadowDistSQLStatementParser.ShowShadowAlgorithmPluginsContext ctx);
}