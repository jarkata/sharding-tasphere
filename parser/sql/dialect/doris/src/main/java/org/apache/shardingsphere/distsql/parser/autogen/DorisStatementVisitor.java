// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/doris/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/DorisStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DorisStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DorisStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(DorisStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStatement(DorisStatementParser.AlterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(DorisStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#duplicatekeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicatekeyClause(DorisStatementParser.DuplicatekeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#commentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentClause(DorisStatementParser.CommentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#distributedbyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributedbyClause(DorisStatementParser.DistributedbyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#propertiesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesClause(DorisStatementParser.PropertiesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(DorisStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DorisStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(DorisStatementParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(DorisStatementParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionTypeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionTypeDef(DorisStatementParser.PartitionTypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#subPartitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPartitions(DorisStatementParser.SubPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionKeyAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionKeyAlgorithm(DorisStatementParser.PartitionKeyAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateAsQueryExpression(DorisStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(DorisStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#standaloneAlterTableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneAlterTableAction(DorisStatementParser.StandaloneAlterTableActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableActions(DorisStatementParser.AlterTableActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterTablePartitionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablePartitionOptions(DorisStatementParser.AlterTablePartitionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCommandList(DorisStatementParser.AlterCommandListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterList(DorisStatementParser.AlterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTableOptionsSpaceSeparated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableOptionsSpaceSeparated(DorisStatementParser.CreateTableOptionsSpaceSeparatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(DorisStatementParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableConstraint(DorisStatementParser.AddTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeColumn(DorisStatementParser.ChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumn(DorisStatementParser.ModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableDrop(DorisStatementParser.AlterTableDropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code disableKeys}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisableKeys(DorisStatementParser.DisableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enableKeys}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableKeys(DorisStatementParser.EnableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumn(DorisStatementParser.AlterColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterIndex}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndex(DorisStatementParser.AlterIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterCheck}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCheck(DorisStatementParser.AlterCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterConstraint}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterConstraint(DorisStatementParser.AlterConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumn(DorisStatementParser.RenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRenameTable(DorisStatementParser.AlterRenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameIndex}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameIndex(DorisStatementParser.RenameIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterConvert}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterConvert(DorisStatementParser.AlterConvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableForce}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableForce(DorisStatementParser.AlterTableForceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableOrder}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableOrder(DorisStatementParser.AlterTableOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterOrderList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOrderList(DorisStatementParser.AlterOrderListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableConstraintDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintDef(DorisStatementParser.TableConstraintDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterCommandsModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCommandsModifierList(DorisStatementParser.AlterCommandsModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterCommandsModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCommandsModifier(DorisStatementParser.AlterCommandsModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#withValidation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithValidation(DorisStatementParser.WithValidationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#standaloneAlterCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneAlterCommands(DorisStatementParser.StandaloneAlterCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterPartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPartition(DorisStatementParser.AlterPartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintClause(DorisStatementParser.ConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(DorisStatementParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(DorisStatementParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrict(DorisStatementParser.RestrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fulltextIndexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFulltextIndexOption(DorisStatementParser.FulltextIndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(DorisStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(DorisStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#algorithmOptionAndLockOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmOptionAndLockOption(DorisStatementParser.AlgorithmOptionAndLockOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterAlgorithmOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAlgorithmOption(DorisStatementParser.AlterAlgorithmOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterLockOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLockOption(DorisStatementParser.AlterLockOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(DorisStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(DorisStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(DorisStatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(DorisStatementParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseSpecification_(DorisStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterDatabaseSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseSpecification_(DorisStatementParser.AlterDatabaseSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(DorisStatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterInstance(DorisStatementParser.AlterInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceAction(DorisStatementParser.InstanceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#channel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannel(DorisStatementParser.ChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEvent(DorisStatementParser.CreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEvent(DorisStatementParser.AlterEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEvent(DorisStatementParser.DropEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(DorisStatementParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(DorisStatementParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(DorisStatementParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(DorisStatementParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(DorisStatementParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(DorisStatementParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServer(DorisStatementParser.CreateServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServer(DorisStatementParser.AlterServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropServer(DorisStatementParser.DropServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(DorisStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(DorisStatementParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(DorisStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespace(DorisStatementParser.CreateTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceInnodb(DorisStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceNdb(DorisStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTablespaceInnodbAndNdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceInnodbAndNdb(DorisStatementParser.CreateTablespaceInnodbAndNdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(DorisStatementParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterTablespaceNdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespaceNdb(DorisStatementParser.AlterTablespaceNdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterTablespaceInnodb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespaceInnodb(DorisStatementParser.AlterTablespaceInnodbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespace(DorisStatementParser.DropTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLogfileGroup(DorisStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLogfileGroup(DorisStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLogfileGroup(DorisStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(DorisStatementParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigger(DorisStatementParser.DropTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#renameTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(DorisStatementParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(DorisStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(DorisStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(DorisStatementParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#columnAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAttribute(DorisStatementParser.ColumnAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraint(DorisStatementParser.CheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#constraintEnforcement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintEnforcement(DorisStatementParser.ConstraintEnforcementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedOption(DorisStatementParser.GeneratedOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(DorisStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#onUpdateDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnUpdateDelete(DorisStatementParser.OnUpdateDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceOption(DorisStatementParser.ReferenceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(DorisStatementParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTypeClause(DorisStatementParser.IndexTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#keyParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyParts(DorisStatementParser.KeyPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#keyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPart(DorisStatementParser.KeyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#keyPartWithExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPartWithExpression(DorisStatementParser.KeyPartWithExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#keyListWithExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyListWithExpression(DorisStatementParser.KeyListWithExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption(DorisStatementParser.IndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#commonIndexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonIndexOption(DorisStatementParser.CommonIndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(DorisStatementParser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLikeClause(DorisStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification(DorisStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableOptions(DorisStatementParser.CreateTableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableOption(DorisStatementParser.CreateTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createSRSStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSRSStatement(DorisStatementParser.CreateSRSStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropSRSStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSRSStatement(DorisStatementParser.DropSRSStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#srsAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrsAttribute(DorisStatementParser.SrsAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#place}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace(DorisStatementParser.PlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinitions(DorisStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinition(DorisStatementParser.PartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionLessThanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionLessThanValue(DorisStatementParser.PartitionLessThanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionValueList(DorisStatementParser.PartitionValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionDefinitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinitionOption(DorisStatementParser.PartitionDefinitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartitionDefinition(DorisStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerStatement(DorisStatementParser.OwnerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleExpression(DorisStatementParser.ScheduleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampValue(DorisStatementParser.TimestampValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#routineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBody(DorisStatementParser.RoutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#serverOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerOption(DorisStatementParser.ServerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineOption(DorisStatementParser.RoutineOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureParameter(DorisStatementParser.ProcedureParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSizeLiteral(DorisStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(DorisStatementParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(DorisStatementParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#validStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidStatement(DorisStatementParser.ValidStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginStatement(DorisStatementParser.BeginStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#declareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStatement(DorisStatementParser.DeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#flowControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowControlStatement(DorisStatementParser.FlowControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(DorisStatementParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DorisStatementParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateStatement(DorisStatementParser.IterateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeaveStatement(DorisStatementParser.LeaveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(DorisStatementParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(DorisStatementParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DorisStatementParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DorisStatementParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorStatement(DorisStatementParser.CursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorCloseStatement(DorisStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cursorDeclareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorDeclareStatement(DorisStatementParser.CursorDeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cursorFetchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorFetchStatement(DorisStatementParser.CursorFetchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorOpenStatement(DorisStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#conditionHandlingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionHandlingStatement(DorisStatementParser.ConditionHandlingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#declareConditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareConditionStatement(DorisStatementParser.DeclareConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#declareHandlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareHandlerStatement(DorisStatementParser.DeclareHandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetDiagnosticsStatement(DorisStatementParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#statementInformationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInformationItem(DorisStatementParser.StatementInformationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#conditionInformationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionInformationItem(DorisStatementParser.ConditionInformationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#conditionNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionNumber(DorisStatementParser.ConditionNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInformationItemName(DorisStatementParser.StatementInformationItemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionInformationItemName(DorisStatementParser.ConditionInformationItemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#handlerAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerAction(DorisStatementParser.HandlerActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#conditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionValue(DorisStatementParser.ConditionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#resignalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignalStatement(DorisStatementParser.ResignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#signalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalStatement(DorisStatementParser.SignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#signalInformationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalInformationItem(DorisStatementParser.SignalInformationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#prepare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare(DorisStatementParser.PrepareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(DorisStatementParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#executeVarList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteVarList(DorisStatementParser.ExecuteVarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#deallocate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate(DorisStatementParser.DeallocateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(DorisStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSpecification(DorisStatementParser.InsertSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(DorisStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(DorisStatementParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIdentifier(DorisStatementParser.InsertIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableWild(DorisStatementParser.TableWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(DorisStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDuplicateKeyClause(DorisStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#valueReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueReference(DorisStatementParser.ValueReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedColumns(DorisStatementParser.DerivedColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace(DorisStatementParser.ReplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceSpecification(DorisStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceValuesClause(DorisStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceSelectClause(DorisStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DorisStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpecification_(DorisStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DorisStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(DorisStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(DorisStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(DorisStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#blobValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobValue(DorisStatementParser.BlobValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(DorisStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpecification(DorisStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(DorisStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(DorisStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(DorisStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithInto(DorisStatementParser.SelectWithIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(DorisStatementParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionBody(DorisStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#combineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineClause(DorisStatementParser.CombineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionParens(DorisStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimary(DorisStatementParser.QueryPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(DorisStatementParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(DorisStatementParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(DorisStatementParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerStatement(DorisStatementParser.HandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerOpenStatement(DorisStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadIndexStatement(DorisStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadStatement(DorisStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerCloseStatement(DorisStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(DorisStatementParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStatement(DorisStatementParser.LoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadDataStatement(DorisStatementParser.LoadDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadXmlStatement(DorisStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStatement(DorisStatementParser.TableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValueConstructor(DorisStatementParser.TableValueConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructorList(DorisStatementParser.RowConstructorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(DorisStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClause(DorisStatementParser.CteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecification(DorisStatementParser.SelectSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(DorisStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(DorisStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(DorisStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(DorisStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(DorisStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DorisStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(DorisStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedTableReference(DorisStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(DorisStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(DorisStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames(DorisStatementParser.PartitionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintList(DorisStatementParser.IndexHintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(DorisStatementParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexHintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintClause(DorisStatementParser.IndexHintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNameList(DorisStatementParser.IndexNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(DorisStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoinType(DorisStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoinType(DorisStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoinType(DorisStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(DorisStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DorisStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(DorisStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(DorisStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(DorisStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(DorisStatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(DorisStatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(DorisStatementParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#windowItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowItem(DorisStatementParser.WindowItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(DorisStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(DorisStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(DorisStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoExpression(DorisStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(DorisStatementParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClauseList(DorisStatementParser.LockClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStrength(DorisStatementParser.LockStrengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedRowAction(DorisStatementParser.LockedRowActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLockingList(DorisStatementParser.TableLockingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentOptWild(DorisStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAliasRefList(DorisStatementParser.TableAliasRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(DorisStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomKeyword(DorisStatementParser.CustomKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(DorisStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(DorisStatementParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(DorisStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(DorisStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalLiterals(DorisStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(DorisStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(DorisStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(DorisStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(DorisStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(DorisStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DorisStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsUnambiguous(DorisStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous1RolesAndLabels(DorisStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous2Labels(DorisStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous3Roles(DorisStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous4SystemVariables(DorisStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextOrIdentifier(DorisStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(DorisStatementParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DorisStatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#userVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(DorisStatementParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(DorisStatementParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalueSystemVariable(DorisStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariable(DorisStatementParser.SetSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#optionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionType(DorisStatementParser.OptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalVariableName(DorisStatementParser.InternalVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprOrDefault(DorisStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionCharacteristics(DorisStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(DorisStatementParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationTypes(DorisStatementParser.IsolationTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(DorisStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(DorisStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#databaseNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseNames(DorisStatementParser.DatabaseNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(DorisStatementParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#databasePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePairs(DorisStatementParser.DatabasePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#databasePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePair(DorisStatementParser.DatabasePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DorisStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DorisStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(DorisStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(DorisStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldColumn(DorisStatementParser.OldColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#newColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewColumn(DorisStatementParser.NewColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiterName(DorisStatementParser.DelimiterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserIdentifierOrText(DorisStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#username}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsername(DorisStatementParser.UsernameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(DorisStatementParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#serverName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerName(DorisStatementParser.ServerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapperName(DorisStatementParser.WrapperNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(DorisStatementParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(DorisStatementParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(DorisStatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(DorisStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(DorisStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DorisStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(DorisStatementParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#viewNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewNames(DorisStatementParser.ViewNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(DorisStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(DorisStatementParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(DorisStatementParser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardLibraryName(DorisStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(DorisStatementParser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#pluginName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginName(DorisStatementParser.PluginNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(DorisStatementParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(DorisStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneInstance(DorisStatementParser.CloneInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneDir(DorisStatementParser.CloneDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#channelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelName(DorisStatementParser.ChannelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#logName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogName(DorisStatementParser.LogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(DorisStatementParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleIdentifierOrText(DorisStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#engineRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineRef(DorisStatementParser.EngineRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(DorisStatementParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTime(DorisStatementParser.TriggerTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOrTables(DorisStatementParser.TableOrTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRole(DorisStatementParser.UserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionName(DorisStatementParser.PartitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(DorisStatementParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrPartitionNameList(DorisStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(DorisStatementParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOrder(DorisStatementParser.TriggerOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DorisStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(DorisStatementParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(DorisStatementParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(DorisStatementParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(DorisStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DorisStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(DorisStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(DorisStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(DorisStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(DorisStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(DorisStatementParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEmptyError(DorisStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#columnRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRef(DorisStatementParser.ColumnRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRefList(DorisStatementParser.ColumnRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DorisStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunction(DorisStatementParser.UdfFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(DorisStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#bitwiseFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseFunction(DorisStatementParser.BitwiseFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunction(DorisStatementParser.JsonFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#jsonTableFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonTableFunction(DorisStatementParser.JsonTableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#jsonTableColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonTableColumns(DorisStatementParser.JsonTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonTableColumn(DorisStatementParser.JsonTableColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunctionName(DorisStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(DorisStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#bitwiseBinaryFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseBinaryFunctionName(DorisStatementParser.BitwiseBinaryFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(DorisStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(DorisStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(DorisStatementParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(DorisStatementParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#frameStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart(DorisStatementParser.FrameStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd(DorisStatementParser.FrameEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(DorisStatementParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(DorisStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUserFunction(DorisStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingFunction(DorisStatementParser.GroupingFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#timeStampDiffFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeStampDiffFunction(DorisStatementParser.TimeStampDiffFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupConcatFunction(DorisStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#instrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrFunction(DorisStatementParser.InstrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(DorisStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(DorisStatementParser.WindowingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadLagInfo(DorisStatementParser.LeadLagInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(DorisStatementParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#checkType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(DorisStatementParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#repairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairType(DorisStatementParser.RepairTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(DorisStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(DorisStatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(DorisStatementParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(DorisStatementParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(DorisStatementParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(DorisStatementParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(DorisStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction(DorisStatementParser.TrimFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunction(DorisStatementParser.ValuesFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightStringFunction(DorisStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#levelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelClause(DorisStatementParser.LevelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(DorisStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(DorisStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandRegularFunction(DorisStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteRegularFunction(DorisStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#indexAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAlias(DorisStatementParser.IndexAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(DorisStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(DorisStatementParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchSearchModifier(DorisStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(DorisStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeExpr(DorisStatementParser.DatetimeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogFileIndexNumber(DorisStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(DorisStatementParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(DorisStatementParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(DorisStatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(DorisStatementParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(DorisStatementParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(DorisStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(DorisStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(DorisStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(DorisStatementParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#textString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextString(DorisStatementParser.TextStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStringHash(DorisStatementParser.TextStringHashContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOptions(DorisStatementParser.FieldOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(DorisStatementParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDatetimePrecision(DorisStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetWithOptBinary(DorisStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ascii}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscii(DorisStatementParser.AsciiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#unicode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicode(DorisStatementParser.UnicodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset(DorisStatementParser.CharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCollation(DorisStatementParser.DefaultCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultEncryption(DorisStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCharset(DorisStatementParser.DefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#now}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNow(DorisStatementParser.NowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnFormat(DorisStatementParser.ColumnFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageMedia(DorisStatementParser.StorageMediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(DorisStatementParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyOrIndex(DorisStatementParser.KeyOrIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(DorisStatementParser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(DorisStatementParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(DorisStatementParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOrVarSpec(DorisStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(DorisStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(DorisStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#connectionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionId(DorisStatementParser.ConnectionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(DorisStatementParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(DorisStatementParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(DorisStatementParser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#combineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineOption(DorisStatementParser.CombineOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoWriteToBinLog(DorisStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(DorisStatementParser.ChannelOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(DorisStatementParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#help}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelp(DorisStatementParser.HelpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(DorisStatementParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fromDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromDatabase(DorisStatementParser.FromDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(DorisStatementParser.FromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLike(DorisStatementParser.ShowLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWhereClause(DorisStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFilter(DorisStatementParser.ShowFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfileType(DorisStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(DorisStatementParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValueList(DorisStatementParser.OptionValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValueNoOptionType(DorisStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(DorisStatementParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#optionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValue(DorisStatementParser.OptionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBinaryLogs(DorisStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBinlogEvents(DorisStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCharacterSet(DorisStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCollation(DorisStatementParser.ShowCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(DorisStatementParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDatabase(DorisStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateEvent(DorisStatementParser.ShowCreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateFunction(DorisStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateProcedure(DorisStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(DorisStatementParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTrigger(DorisStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateUser(DorisStatementParser.ShowCreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateView(DorisStatementParser.ShowCreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(DorisStatementParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngine(DorisStatementParser.ShowEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showEngines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngines(DorisStatementParser.ShowEnginesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowErrors(DorisStatementParser.ShowErrorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEvents(DorisStatementParser.ShowEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionCode(DorisStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionStatus(DorisStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showGrants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrants(DorisStatementParser.ShowGrantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndex(DorisStatementParser.ShowIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMasterStatus(DorisStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpenTables(DorisStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPlugins(DorisStatementParser.ShowPluginsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPrivileges(DorisStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureCode(DorisStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureStatus(DorisStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcesslist(DorisStatementParser.ShowProcesslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showProfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfile(DorisStatementParser.ShowProfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfiles(DorisStatementParser.ShowProfilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRelaylogEvent(DorisStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowReplicas(DorisStatementParser.ShowReplicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveHosts(DorisStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowReplicaStatus(DorisStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveStatus(DorisStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatus(DorisStatementParser.ShowStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableStatus(DorisStatementParser.ShowTableStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(DorisStatementParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTriggers(DorisStatementParser.ShowTriggersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowVariables(DorisStatementParser.ShowVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWarnings(DorisStatementParser.ShowWarningsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#showCharset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCharset(DorisStatementParser.ShowCharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCharacter(DorisStatementParser.SetCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#clone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClone(DorisStatementParser.CloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneAction(DorisStatementParser.CloneActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoadableFunction(DorisStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#install}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstall(DorisStatementParser.InstallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#uninstall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstall(DorisStatementParser.UninstallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#installComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallComponent(DorisStatementParser.InstallComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallPlugin(DorisStatementParser.InstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallComponent(DorisStatementParser.UninstallComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallPlugin(DorisStatementParser.UninstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTable(DorisStatementParser.AnalyzeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#histogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistogram(DorisStatementParser.HistogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#checkTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTable(DorisStatementParser.CheckTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableOption(DorisStatementParser.CheckTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksumTable(DorisStatementParser.ChecksumTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeTable(DorisStatementParser.OptimizeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#repairTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(DorisStatementParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterResourceGroup(DorisStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVcpuSpec(DorisStatementParser.VcpuSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateResourceGroup(DorisStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropResourceGroup(DorisStatementParser.DropResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResourceGroup(DorisStatementParser.SetResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#binlog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinlog(DorisStatementParser.BinlogContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheIndex(DorisStatementParser.CacheIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTableIndexList(DorisStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#partitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionList(DorisStatementParser.PartitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#flush}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlush(DorisStatementParser.FlushContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushOption(DorisStatementParser.FlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesOption(DorisStatementParser.TablesOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#kill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill(DorisStatementParser.KillContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadIndexInfo(DorisStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadTableIndexList(DorisStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStatement(DorisStatementParser.ResetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#resetOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetOption(DorisStatementParser.ResetOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetPersist(DorisStatementParser.ResetPersistContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#restart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestart(DorisStatementParser.RestartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#shutdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdown(DorisStatementParser.ShutdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#explainType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainType(DorisStatementParser.ExplainTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStatement(DorisStatementParser.ExplainableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#formatName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatName(DorisStatementParser.FormatNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiter(DorisStatementParser.DelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(DorisStatementParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(DorisStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutoCommit(DorisStatementParser.SetAutoCommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTransaction(DorisStatementParser.BeginTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#transactionCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionCharacteristic(DorisStatementParser.TransactionCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(DorisStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(DorisStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(DorisStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(DorisStatementParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock(DorisStatementParser.LockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#unlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlock(DorisStatementParser.UnlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseSavepoint(DorisStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#optionChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionChain(DorisStatementParser.OptionChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#optionRelease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionRelease(DorisStatementParser.OptionReleaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tableLock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLock(DorisStatementParser.TableLockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#lockOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockOption(DorisStatementParser.LockOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#xaBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaBegin(DorisStatementParser.XaBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#xaPrepare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaPrepare(DorisStatementParser.XaPrepareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#xaCommit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaCommit(DorisStatementParser.XaCommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#xaRollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRollback(DorisStatementParser.XaRollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#xaEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaEnd(DorisStatementParser.XaEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#xaRecovery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRecovery(DorisStatementParser.XaRecoveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#xid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXid(DorisStatementParser.XidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantRoleOrPrivilegeTo}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleOrPrivilegeTo(DorisStatementParser.GrantRoleOrPrivilegeToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantRoleOrPrivilegeOnTo}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleOrPrivilegeOnTo(DorisStatementParser.GrantRoleOrPrivilegeOnToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantProxy}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantProxy(DorisStatementParser.GrantProxyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeFrom}
	 * labeled alternative in {@link DorisStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeFrom(DorisStatementParser.RevokeFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeOnFrom}
	 * labeled alternative in {@link DorisStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeOnFrom(DorisStatementParser.RevokeOnFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#userList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserList(DorisStatementParser.UserListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#roleOrPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleOrPrivileges(DorisStatementParser.RoleOrPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roleOrDynamicPrivilege}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleOrDynamicPrivilege(DorisStatementParser.RoleOrDynamicPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roleAtHost}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleAtHost(DorisStatementParser.RoleAtHostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeSelect}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeSelect(DorisStatementParser.StaticPrivilegeSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeInsert}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeInsert(DorisStatementParser.StaticPrivilegeInsertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeUpdate}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeUpdate(DorisStatementParser.StaticPrivilegeUpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeReferences}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeReferences(DorisStatementParser.StaticPrivilegeReferencesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeDelete}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeDelete(DorisStatementParser.StaticPrivilegeDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeUsage}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeUsage(DorisStatementParser.StaticPrivilegeUsageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeIndex}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeIndex(DorisStatementParser.StaticPrivilegeIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeAlter}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeAlter(DorisStatementParser.StaticPrivilegeAlterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeCreate}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeCreate(DorisStatementParser.StaticPrivilegeCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeDrop}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeDrop(DorisStatementParser.StaticPrivilegeDropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeExecute}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeExecute(DorisStatementParser.StaticPrivilegeExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeReload}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeReload(DorisStatementParser.StaticPrivilegeReloadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeShutdown}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeShutdown(DorisStatementParser.StaticPrivilegeShutdownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeProcess}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeProcess(DorisStatementParser.StaticPrivilegeProcessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeFile}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeFile(DorisStatementParser.StaticPrivilegeFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeGrant}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeGrant(DorisStatementParser.StaticPrivilegeGrantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeShowDatabases}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeShowDatabases(DorisStatementParser.StaticPrivilegeShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeSuper}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeSuper(DorisStatementParser.StaticPrivilegeSuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeCreateTemporaryTables}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeCreateTemporaryTables(DorisStatementParser.StaticPrivilegeCreateTemporaryTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeLockTables}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeLockTables(DorisStatementParser.StaticPrivilegeLockTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeReplicationSlave}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeReplicationSlave(DorisStatementParser.StaticPrivilegeReplicationSlaveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeReplicationClient}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeReplicationClient(DorisStatementParser.StaticPrivilegeReplicationClientContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeCreateView}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeCreateView(DorisStatementParser.StaticPrivilegeCreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeShowView}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeShowView(DorisStatementParser.StaticPrivilegeShowViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeCreateRoutine}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeCreateRoutine(DorisStatementParser.StaticPrivilegeCreateRoutineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeAlterRoutine}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeAlterRoutine(DorisStatementParser.StaticPrivilegeAlterRoutineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeCreateUser}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeCreateUser(DorisStatementParser.StaticPrivilegeCreateUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeEvent}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeEvent(DorisStatementParser.StaticPrivilegeEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeTrigger}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeTrigger(DorisStatementParser.StaticPrivilegeTriggerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeCreateTablespace}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeCreateTablespace(DorisStatementParser.StaticPrivilegeCreateTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeCreateRole}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeCreateRole(DorisStatementParser.StaticPrivilegeCreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticPrivilegeDropRole}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticPrivilegeDropRole(DorisStatementParser.StaticPrivilegeDropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#aclType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAclType(DorisStatementParser.AclTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantLevelGlobal}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantLevelGlobal(DorisStatementParser.GrantLevelGlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantLevelDatabaseGlobal}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantLevelDatabaseGlobal(DorisStatementParser.GrantLevelDatabaseGlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantLevelTable}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantLevelTable(DorisStatementParser.GrantLevelTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(DorisStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createUserOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserOption(DorisStatementParser.CreateUserOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserEntryNoOption}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserEntryNoOption(DorisStatementParser.CreateUserEntryNoOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserEntryIdentifiedBy}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserEntryIdentifiedBy(DorisStatementParser.CreateUserEntryIdentifiedByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserEntryIdentifiedWith}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserEntryIdentifiedWith(DorisStatementParser.CreateUserEntryIdentifiedWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createUserList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserList(DorisStatementParser.CreateUserListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#defaultRoleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultRoleClause(DorisStatementParser.DefaultRoleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#requireClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequireClause(DorisStatementParser.RequireClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#connectOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectOptions(DorisStatementParser.ConnectOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#accountLockPasswordExpireOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccountLockPasswordExpireOptions(DorisStatementParser.AccountLockPasswordExpireOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#accountLockPasswordExpireOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccountLockPasswordExpireOption(DorisStatementParser.AccountLockPasswordExpireOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(DorisStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterUserEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserEntry(DorisStatementParser.AlterUserEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterUserList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserList(DorisStatementParser.AlterUserListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#alterOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperation(DorisStatementParser.AlterOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#factoryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryOperation(DorisStatementParser.FactoryOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#authentication_fido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthentication_fido(DorisStatementParser.Authentication_fidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(DorisStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(DorisStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(DorisStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#renameUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUser(DorisStatementParser.RenameUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefaultRole(DorisStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRole(DorisStatementParser.SetRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#setPassword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPassword(DorisStatementParser.SetPasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#authOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthOption(DorisStatementParser.AuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#withGrantOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithGrantOption(DorisStatementParser.WithGrantOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#userOrRoles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoles(DorisStatementParser.UserOrRolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoles(DorisStatementParser.RolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#grantAs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantAs(DorisStatementParser.GrantAsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#withRoles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithRoles(DorisStatementParser.WithRolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserAuthOption(DorisStatementParser.UserAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifiedBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiedBy(DorisStatementParser.IdentifiedByContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#identifiedWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiedWith(DorisStatementParser.IdentifiedWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#connectOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectOption(DorisStatementParser.ConnectOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlsOption(DorisStatementParser.TlsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#userFuncAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserFuncAuthOption(DorisStatementParser.UserFuncAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#change}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange(DorisStatementParser.ChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeMasterTo(DorisStatementParser.ChangeMasterToContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeReplicationFilter(DorisStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#changeReplicationSourceTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeReplicationSourceTo(DorisStatementParser.ChangeReplicationSourceToContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#startSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartSlave(DorisStatementParser.StartSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopSlave(DorisStatementParser.StopSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#startReplica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartReplica(DorisStatementParser.StartReplicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#groupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupReplication(DorisStatementParser.GroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartGroupReplication(DorisStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopGroupReplication(DorisStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#purgeBinaryLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurgeBinaryLog(DorisStatementParser.PurgeBinaryLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#threadTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadTypes(DorisStatementParser.ThreadTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#threadType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadType(DorisStatementParser.ThreadTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#utilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtilOption(DorisStatementParser.UtilOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#connectionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionOptions(DorisStatementParser.ConnectionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#masterDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterDefs(DorisStatementParser.MasterDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#masterDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterDef(DorisStatementParser.MasterDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ignoreServerIds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreServerIds(DorisStatementParser.IgnoreServerIdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#ignoreServerId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreServerId(DorisStatementParser.IgnoreServerIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#filterDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterDefs(DorisStatementParser.FilterDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#filterDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterDef(DorisStatementParser.FilterDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#wildTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildTables(DorisStatementParser.WildTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#wildTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildTable(DorisStatementParser.WildTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#changeReplicationSourceOptionDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeReplicationSourceOptionDefs(DorisStatementParser.ChangeReplicationSourceOptionDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#changeReplicationSourceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeReplicationSourceOption(DorisStatementParser.ChangeReplicationSourceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#tablePrimaryKeyCheckDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePrimaryKeyCheckDef(DorisStatementParser.TablePrimaryKeyCheckDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisStatementParser#assignGtidsToAnonymousTransactionsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignGtidsToAnonymousTransactionsDef(DorisStatementParser.AssignGtidsToAnonymousTransactionsDefContext ctx);
}