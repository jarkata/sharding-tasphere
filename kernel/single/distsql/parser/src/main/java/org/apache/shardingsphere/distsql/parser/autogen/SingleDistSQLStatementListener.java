// Generated from /Users/code/gitcode/shardingsphere/kernel/single/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/SingleDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SingleDistSQLStatementParser}.
 */
public interface SingleDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SingleDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SingleDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#setDefaultSingleTableStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterSetDefaultSingleTableStorageUnit(SingleDistSQLStatementParser.SetDefaultSingleTableStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#setDefaultSingleTableStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitSetDefaultSingleTableStorageUnit(SingleDistSQLStatementParser.SetDefaultSingleTableStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#loadSingleTable}.
	 * @param ctx the parse tree
	 */
	void enterLoadSingleTable(SingleDistSQLStatementParser.LoadSingleTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#loadSingleTable}.
	 * @param ctx the parse tree
	 */
	void exitLoadSingleTable(SingleDistSQLStatementParser.LoadSingleTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#unloadSingleTable}.
	 * @param ctx the parse tree
	 */
	void enterUnloadSingleTable(SingleDistSQLStatementParser.UnloadSingleTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#unloadSingleTable}.
	 * @param ctx the parse tree
	 */
	void exitUnloadSingleTable(SingleDistSQLStatementParser.UnloadSingleTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableDefinition(SingleDistSQLStatementParser.TableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableDefinition(SingleDistSQLStatementParser.TableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(SingleDistSQLStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(SingleDistSQLStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allTables}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAllTables(SingleDistSQLStatementParser.AllTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allTables}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAllTables(SingleDistSQLStatementParser.AllTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allTablesWithSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAllTablesWithSchema(SingleDistSQLStatementParser.AllTablesWithSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allTablesWithSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAllTablesWithSchema(SingleDistSQLStatementParser.AllTablesWithSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allTablesFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAllTablesFromStorageUnit(SingleDistSQLStatementParser.AllTablesFromStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allTablesFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAllTablesFromStorageUnit(SingleDistSQLStatementParser.AllTablesFromStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allSchamesAndTablesFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAllSchamesAndTablesFromStorageUnit(SingleDistSQLStatementParser.AllSchamesAndTablesFromStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allSchamesAndTablesFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAllSchamesAndTablesFromStorageUnit(SingleDistSQLStatementParser.AllSchamesAndTablesFromStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allTablesFromSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAllTablesFromSchema(SingleDistSQLStatementParser.AllTablesFromSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allTablesFromSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAllTablesFromSchema(SingleDistSQLStatementParser.AllTablesFromSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableFromStorageUnit(SingleDistSQLStatementParser.TableFromStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFromStorageUnit}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableFromStorageUnit(SingleDistSQLStatementParser.TableFromStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFromSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableFromSchema(SingleDistSQLStatementParser.TableFromSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFromSchema}
	 * labeled alternative in {@link SingleDistSQLStatementParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableFromSchema(SingleDistSQLStatementParser.TableFromSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnitName(SingleDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnitName(SingleDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(SingleDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(SingleDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SingleDistSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SingleDistSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SingleDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SingleDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#showDefaultSingleTableStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterShowDefaultSingleTableStorageUnit(SingleDistSQLStatementParser.ShowDefaultSingleTableStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#showDefaultSingleTableStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitShowDefaultSingleTableStorageUnit(SingleDistSQLStatementParser.ShowDefaultSingleTableStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#showSingleTables}.
	 * @param ctx the parse tree
	 */
	void enterShowSingleTables(SingleDistSQLStatementParser.ShowSingleTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#showSingleTables}.
	 * @param ctx the parse tree
	 */
	void exitShowSingleTables(SingleDistSQLStatementParser.ShowSingleTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#showUnloadedSingleTables}.
	 * @param ctx the parse tree
	 */
	void enterShowUnloadedSingleTables(SingleDistSQLStatementParser.ShowUnloadedSingleTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#showUnloadedSingleTables}.
	 * @param ctx the parse tree
	 */
	void exitShowUnloadedSingleTables(SingleDistSQLStatementParser.ShowUnloadedSingleTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SingleDistSQLStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SingleDistSQLStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#countSingleTable}.
	 * @param ctx the parse tree
	 */
	void enterCountSingleTable(SingleDistSQLStatementParser.CountSingleTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#countSingleTable}.
	 * @param ctx the parse tree
	 */
	void exitCountSingleTable(SingleDistSQLStatementParser.CountSingleTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void enterShowLike(SingleDistSQLStatementParser.ShowLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void exitShowLike(SingleDistSQLStatementParser.ShowLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SingleDistSQLStatementParser#likePattern}.
	 * @param ctx the parse tree
	 */
	void enterLikePattern(SingleDistSQLStatementParser.LikePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SingleDistSQLStatementParser#likePattern}.
	 * @param ctx the parse tree
	 */
	void exitLikePattern(SingleDistSQLStatementParser.LikePatternContext ctx);
}