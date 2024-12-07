// Generated from /Users/code/gitcode/shardingsphere/parser/distsql/engine/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/UtilityDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UtilityDistSQLStatementParser}.
 */
public interface UtilityDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UtilityDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(UtilityDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link UtilityDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(UtilityDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link UtilityDistSQLStatementParser#previewSQL}.
	 * @param ctx the parse tree
	 */
	void enterPreviewSQL(UtilityDistSQLStatementParser.PreviewSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link UtilityDistSQLStatementParser#previewSQL}.
	 * @param ctx the parse tree
	 */
	void exitPreviewSQL(UtilityDistSQLStatementParser.PreviewSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link UtilityDistSQLStatementParser#parseSQL}.
	 * @param ctx the parse tree
	 */
	void enterParseSQL(UtilityDistSQLStatementParser.ParseSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link UtilityDistSQLStatementParser#parseSQL}.
	 * @param ctx the parse tree
	 */
	void exitParseSQL(UtilityDistSQLStatementParser.ParseSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link UtilityDistSQLStatementParser#formatSQL}.
	 * @param ctx the parse tree
	 */
	void enterFormatSQL(UtilityDistSQLStatementParser.FormatSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link UtilityDistSQLStatementParser#formatSQL}.
	 * @param ctx the parse tree
	 */
	void exitFormatSQL(UtilityDistSQLStatementParser.FormatSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link UtilityDistSQLStatementParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(UtilityDistSQLStatementParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link UtilityDistSQLStatementParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(UtilityDistSQLStatementParser.SqlContext ctx);
}