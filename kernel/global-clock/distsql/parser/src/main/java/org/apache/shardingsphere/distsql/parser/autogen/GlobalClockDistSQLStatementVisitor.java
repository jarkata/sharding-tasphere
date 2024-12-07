// Generated from /Users/code/gitcode/shardingsphere/kernel/global-clock/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/GlobalClockDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GlobalClockDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GlobalClockDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(GlobalClockDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#showGlobalClockRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGlobalClockRule(GlobalClockDistSQLStatementParser.ShowGlobalClockRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#alterGlobalClockRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGlobalClockRule(GlobalClockDistSQLStatementParser.AlterGlobalClockRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#globalClockRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalClockRuleDefinition(GlobalClockDistSQLStatementParser.GlobalClockRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(GlobalClockDistSQLStatementParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#providerDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProviderDefinition(GlobalClockDistSQLStatementParser.ProviderDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#enabledDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnabledDefinition(GlobalClockDistSQLStatementParser.EnabledDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(GlobalClockDistSQLStatementParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#providerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProviderName(GlobalClockDistSQLStatementParser.ProviderNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#enabled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnabled(GlobalClockDistSQLStatementParser.EnabledContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(GlobalClockDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(GlobalClockDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(GlobalClockDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalClockDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GlobalClockDistSQLStatementParser.LiteralContext ctx);
}