// Generated from /Users/code/gitcode/shardingsphere/features/mask/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/MaskDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MaskDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MaskDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(MaskDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#createMaskRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaskRule(MaskDistSQLStatementParser.CreateMaskRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#alterMaskRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaskRule(MaskDistSQLStatementParser.AlterMaskRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#dropMaskRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMaskRule(MaskDistSQLStatementParser.DropMaskRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#maskRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaskRuleDefinition(MaskDistSQLStatementParser.MaskRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(MaskDistSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MaskDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(MaskDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(MaskDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MaskDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(MaskDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(MaskDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#buildInMaskAlgorithmType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInMaskAlgorithmType(MaskDistSQLStatementParser.BuildInMaskAlgorithmTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(MaskDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(MaskDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(MaskDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleName(MaskDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#showMaskRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMaskRules(MaskDistSQLStatementParser.ShowMaskRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#countMaskRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountMaskRule(MaskDistSQLStatementParser.CountMaskRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(MaskDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaskDistSQLStatementParser#showMaskAlgorithmPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMaskAlgorithmPlugins(MaskDistSQLStatementParser.ShowMaskAlgorithmPluginsContext ctx);
}