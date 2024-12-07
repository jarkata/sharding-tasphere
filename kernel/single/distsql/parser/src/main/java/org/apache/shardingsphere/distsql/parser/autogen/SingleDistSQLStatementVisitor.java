// Generated from /Users/code/gitcode/shardingsphere/kernel/single/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SingleDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SingleDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SingleDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SingleDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#setDefaultSingleTableStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefaultSingleTableStorageUnit(SingleDistSQLStatementParser.SetDefaultSingleTableStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#loadSingleTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadSingleTable(SingleDistSQLStatementParser.LoadSingleTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#unloadSingleTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnloadSingleTable(SingleDistSQLStatementParser.UnloadSingleTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#tableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDefinition(SingleDistSQLStatementParser.TableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(SingleDistSQLStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allTables}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllTables(SingleDistSQLStatementParser.AllTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allTablesWithSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllTablesWithSchema(SingleDistSQLStatementParser.AllTablesWithSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allTablesFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllTablesFromStorageUnit(SingleDistSQLStatementParser.AllTablesFromStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allSchamesAndTablesFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllSchamesAndTablesFromStorageUnit(SingleDistSQLStatementParser.AllSchamesAndTablesFromStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allTablesFromSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllTablesFromSchema(SingleDistSQLStatementParser.AllTablesFromSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFromStorageUnit(SingleDistSQLStatementParser.TableFromStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFromSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFromSchema(SingleDistSQLStatementParser.TableFromSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnitName(SingleDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(SingleDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(SingleDistSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SingleDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#showDefaultSingleTableStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDefaultSingleTableStorageUnit(SingleDistSQLStatementParser.ShowDefaultSingleTableStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#showSingleTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSingleTables(SingleDistSQLStatementParser.ShowSingleTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#showUnloadedSingleTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowUnloadedSingleTables(SingleDistSQLStatementParser.ShowUnloadedSingleTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SingleDistSQLStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#countSingleTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountSingleTable(SingleDistSQLStatementParser.CountSingleTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLike(SingleDistSQLStatementParser.ShowLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SingleDistSQLStatementParser#likePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePattern(SingleDistSQLStatementParser.LikePatternContext ctx);
}