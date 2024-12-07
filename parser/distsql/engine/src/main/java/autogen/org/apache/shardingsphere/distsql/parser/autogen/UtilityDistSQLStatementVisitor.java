// Generated from /Users/code/gitcode/shardingsphere/parser/distsql/engine/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/UtilityDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UtilityDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UtilityDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UtilityDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(UtilityDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link UtilityDistSQLStatementParser#previewSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreviewSQL(UtilityDistSQLStatementParser.PreviewSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link UtilityDistSQLStatementParser#parseSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseSQL(UtilityDistSQLStatementParser.ParseSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link UtilityDistSQLStatementParser#formatSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatSQL(UtilityDistSQLStatementParser.FormatSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link UtilityDistSQLStatementParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(UtilityDistSQLStatementParser.SqlContext ctx);
}