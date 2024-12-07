// Generated from /Users/code/gitcode/shardingsphere/features/broadcast/distsql/parser/src/main/antlr4/broadcast/org/apache/shardingsphere/distsql/parser/autogen/BroadcastDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BroadcastDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BroadcastDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(BroadcastDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#createBroadcastTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateBroadcastTableRule(BroadcastDistSQLStatementParser.CreateBroadcastTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#dropBroadcastTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBroadcastTableRule(BroadcastDistSQLStatementParser.DropBroadcastTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BroadcastDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(BroadcastDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(BroadcastDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(BroadcastDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(BroadcastDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#showBroadcastTableRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBroadcastTableRules(BroadcastDistSQLStatementParser.ShowBroadcastTableRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroadcastDistSQLStatementParser#countBroadcastRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountBroadcastRule(BroadcastDistSQLStatementParser.CountBroadcastRuleContext ctx);
}