// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/mysql/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/MySQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLStatementParser}.
 */
public interface MySQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(MySQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(MySQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatement(MySQLStatementParser.AlterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatement(MySQLStatementParser.AlterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(MySQLStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(MySQLStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(MySQLStatementParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(MySQLStatementParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(MySQLStatementParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(MySQLStatementParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionTypeDef}.
	 * @param ctx the parse tree
	 */
	void enterPartitionTypeDef(MySQLStatementParser.PartitionTypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionTypeDef}.
	 * @param ctx the parse tree
	 */
	void exitPartitionTypeDef(MySQLStatementParser.PartitionTypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#subPartitions}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitions(MySQLStatementParser.SubPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#subPartitions}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitions(MySQLStatementParser.SubPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionKeyAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterPartitionKeyAlgorithm(MySQLStatementParser.PartitionKeyAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionKeyAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitPartitionKeyAlgorithm(MySQLStatementParser.PartitionKeyAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateAsQueryExpression(MySQLStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateAsQueryExpression(MySQLStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(MySQLStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(MySQLStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#standaloneAlterTableAction}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneAlterTableAction(MySQLStatementParser.StandaloneAlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#standaloneAlterTableAction}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneAlterTableAction(MySQLStatementParser.StandaloneAlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableActions(MySQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableActions(MySQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTablePartitionOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablePartitionOptions(MySQLStatementParser.AlterTablePartitionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTablePartitionOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablePartitionOptions(MySQLStatementParser.AlterTablePartitionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 */
	void enterAlterCommandList(MySQLStatementParser.AlterCommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 */
	void exitAlterCommandList(MySQLStatementParser.AlterCommandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterList}.
	 * @param ctx the parse tree
	 */
	void enterAlterList(MySQLStatementParser.AlterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterList}.
	 * @param ctx the parse tree
	 */
	void exitAlterList(MySQLStatementParser.AlterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTableOptionsSpaceSeparated}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableOptionsSpaceSeparated(MySQLStatementParser.CreateTableOptionsSpaceSeparatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTableOptionsSpaceSeparated}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableOptionsSpaceSeparated(MySQLStatementParser.CreateTableOptionsSpaceSeparatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(MySQLStatementParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(MySQLStatementParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAddTableConstraint(MySQLStatementParser.AddTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAddTableConstraint(MySQLStatementParser.AddTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumn(MySQLStatementParser.ChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumn(MySQLStatementParser.ChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumn(MySQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumn(MySQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDrop(MySQLStatementParser.AlterTableDropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDrop(MySQLStatementParser.AlterTableDropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code disableKeys}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterDisableKeys(MySQLStatementParser.DisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code disableKeys}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitDisableKeys(MySQLStatementParser.DisableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enableKeys}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterEnableKeys(MySQLStatementParser.EnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enableKeys}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitEnableKeys(MySQLStatementParser.EnableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumn(MySQLStatementParser.AlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumn(MySQLStatementParser.AlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterIndex}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(MySQLStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterIndex}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(MySQLStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterCheck}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterCheck(MySQLStatementParser.AlterCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterCheck}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterCheck(MySQLStatementParser.AlterCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterConstraint}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterConstraint(MySQLStatementParser.AlterConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterConstraint}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterConstraint(MySQLStatementParser.AlterConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumn(MySQLStatementParser.RenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumn(MySQLStatementParser.RenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterRenameTable(MySQLStatementParser.AlterRenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterRenameTable(MySQLStatementParser.AlterRenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameIndex}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterRenameIndex(MySQLStatementParser.RenameIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameIndex}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitRenameIndex(MySQLStatementParser.RenameIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterConvert}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterConvert(MySQLStatementParser.AlterConvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterConvert}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterConvert(MySQLStatementParser.AlterConvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableForce}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableForce(MySQLStatementParser.AlterTableForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableForce}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableForce(MySQLStatementParser.AlterTableForceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableOrder}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableOrder(MySQLStatementParser.AlterTableOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableOrder}
	 * labeled alternative in {@link MySQLStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableOrder(MySQLStatementParser.AlterTableOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterOrderList}.
	 * @param ctx the parse tree
	 */
	void enterAlterOrderList(MySQLStatementParser.AlterOrderListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterOrderList}.
	 * @param ctx the parse tree
	 */
	void exitAlterOrderList(MySQLStatementParser.AlterOrderListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableConstraintDef}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintDef(MySQLStatementParser.TableConstraintDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableConstraintDef}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintDef(MySQLStatementParser.TableConstraintDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterCommandsModifierList}.
	 * @param ctx the parse tree
	 */
	void enterAlterCommandsModifierList(MySQLStatementParser.AlterCommandsModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterCommandsModifierList}.
	 * @param ctx the parse tree
	 */
	void exitAlterCommandsModifierList(MySQLStatementParser.AlterCommandsModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterCommandsModifier}.
	 * @param ctx the parse tree
	 */
	void enterAlterCommandsModifier(MySQLStatementParser.AlterCommandsModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterCommandsModifier}.
	 * @param ctx the parse tree
	 */
	void exitAlterCommandsModifier(MySQLStatementParser.AlterCommandsModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#withValidation}.
	 * @param ctx the parse tree
	 */
	void enterWithValidation(MySQLStatementParser.WithValidationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#withValidation}.
	 * @param ctx the parse tree
	 */
	void exitWithValidation(MySQLStatementParser.WithValidationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#standaloneAlterCommands}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneAlterCommands(MySQLStatementParser.StandaloneAlterCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#standaloneAlterCommands}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneAlterCommands(MySQLStatementParser.StandaloneAlterCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterPartition}.
	 * @param ctx the parse tree
	 */
	void enterAlterPartition(MySQLStatementParser.AlterPartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterPartition}.
	 * @param ctx the parse tree
	 */
	void exitAlterPartition(MySQLStatementParser.AlterPartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void enterConstraintClause(MySQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void exitConstraintClause(MySQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(MySQLStatementParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(MySQLStatementParser.TableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(MySQLStatementParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(MySQLStatementParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#restrict}.
	 * @param ctx the parse tree
	 */
	void enterRestrict(MySQLStatementParser.RestrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#restrict}.
	 * @param ctx the parse tree
	 */
	void exitRestrict(MySQLStatementParser.RestrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fulltextIndexOption}.
	 * @param ctx the parse tree
	 */
	void enterFulltextIndexOption(MySQLStatementParser.FulltextIndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fulltextIndexOption}.
	 * @param ctx the parse tree
	 */
	void exitFulltextIndexOption(MySQLStatementParser.FulltextIndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(MySQLStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(MySQLStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(MySQLStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(MySQLStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#algorithmOptionAndLockOption}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmOptionAndLockOption(MySQLStatementParser.AlgorithmOptionAndLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#algorithmOptionAndLockOption}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmOptionAndLockOption(MySQLStatementParser.AlgorithmOptionAndLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterAlgorithmOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterAlgorithmOption(MySQLStatementParser.AlterAlgorithmOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterAlgorithmOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterAlgorithmOption(MySQLStatementParser.AlterAlgorithmOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterLockOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterLockOption(MySQLStatementParser.AlterLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterLockOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterLockOption(MySQLStatementParser.AlterLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(MySQLStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(MySQLStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(MySQLStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(MySQLStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(MySQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(MySQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(MySQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(MySQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification_(MySQLStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification_(MySQLStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseSpecification_(MySQLStatementParser.AlterDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseSpecification_(MySQLStatementParser.AlterDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(MySQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(MySQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(MySQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(MySQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAction(MySQLStatementParser.InstanceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAction(MySQLStatementParser.InstanceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#channel}.
	 * @param ctx the parse tree
	 */
	void enterChannel(MySQLStatementParser.ChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#channel}.
	 * @param ctx the parse tree
	 */
	void exitChannel(MySQLStatementParser.ChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(MySQLStatementParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(MySQLStatementParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(MySQLStatementParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(MySQLStatementParser.AlterEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(MySQLStatementParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(MySQLStatementParser.DropEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(MySQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(MySQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(MySQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(MySQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(MySQLStatementParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(MySQLStatementParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(MySQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(MySQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(MySQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(MySQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(MySQLStatementParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(MySQLStatementParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(MySQLStatementParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(MySQLStatementParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(MySQLStatementParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(MySQLStatementParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(MySQLStatementParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(MySQLStatementParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(MySQLStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(MySQLStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(MySQLStatementParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(MySQLStatementParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(MySQLStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(MySQLStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespace(MySQLStatementParser.CreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespace(MySQLStatementParser.CreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(MySQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(MySQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(MySQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(MySQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTablespaceInnodbAndNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodbAndNdb(MySQLStatementParser.CreateTablespaceInnodbAndNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTablespaceInnodbAndNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodbAndNdb(MySQLStatementParser.CreateTablespaceInnodbAndNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(MySQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(MySQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespaceNdb(MySQLStatementParser.AlterTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespaceNdb(MySQLStatementParser.AlterTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespaceInnodb(MySQLStatementParser.AlterTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespaceInnodb(MySQLStatementParser.AlterTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(MySQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(MySQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(MySQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(MySQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(MySQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(MySQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(MySQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(MySQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(MySQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(MySQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(MySQLStatementParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(MySQLStatementParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(MySQLStatementParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(MySQLStatementParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(MySQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(MySQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(MySQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(MySQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(MySQLStatementParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(MySQLStatementParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnAttribute}.
	 * @param ctx the parse tree
	 */
	void enterColumnAttribute(MySQLStatementParser.ColumnAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnAttribute}.
	 * @param ctx the parse tree
	 */
	void exitColumnAttribute(MySQLStatementParser.ColumnAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraint(MySQLStatementParser.CheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraint(MySQLStatementParser.CheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#constraintEnforcement}.
	 * @param ctx the parse tree
	 */
	void enterConstraintEnforcement(MySQLStatementParser.ConstraintEnforcementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#constraintEnforcement}.
	 * @param ctx the parse tree
	 */
	void exitConstraintEnforcement(MySQLStatementParser.ConstraintEnforcementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedOption(MySQLStatementParser.GeneratedOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedOption(MySQLStatementParser.GeneratedOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(MySQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(MySQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#onUpdateDelete}.
	 * @param ctx the parse tree
	 */
	void enterOnUpdateDelete(MySQLStatementParser.OnUpdateDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#onUpdateDelete}.
	 * @param ctx the parse tree
	 */
	void exitOnUpdateDelete(MySQLStatementParser.OnUpdateDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption(MySQLStatementParser.ReferenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption(MySQLStatementParser.ReferenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(MySQLStatementParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(MySQLStatementParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexTypeClause(MySQLStatementParser.IndexTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexTypeClause(MySQLStatementParser.IndexTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#keyParts}.
	 * @param ctx the parse tree
	 */
	void enterKeyParts(MySQLStatementParser.KeyPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#keyParts}.
	 * @param ctx the parse tree
	 */
	void exitKeyParts(MySQLStatementParser.KeyPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#keyPart}.
	 * @param ctx the parse tree
	 */
	void enterKeyPart(MySQLStatementParser.KeyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#keyPart}.
	 * @param ctx the parse tree
	 */
	void exitKeyPart(MySQLStatementParser.KeyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#keyPartWithExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyPartWithExpression(MySQLStatementParser.KeyPartWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#keyPartWithExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyPartWithExpression(MySQLStatementParser.KeyPartWithExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#keyListWithExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyListWithExpression(MySQLStatementParser.KeyListWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#keyListWithExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyListWithExpression(MySQLStatementParser.KeyListWithExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(MySQLStatementParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(MySQLStatementParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#commonIndexOption}.
	 * @param ctx the parse tree
	 */
	void enterCommonIndexOption(MySQLStatementParser.CommonIndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#commonIndexOption}.
	 * @param ctx the parse tree
	 */
	void exitCommonIndexOption(MySQLStatementParser.CommonIndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(MySQLStatementParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(MySQLStatementParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLikeClause(MySQLStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLikeClause(MySQLStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification(MySQLStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification(MySQLStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTableOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableOptions(MySQLStatementParser.CreateTableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTableOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableOptions(MySQLStatementParser.CreateTableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableOption(MySQLStatementParser.CreateTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableOption(MySQLStatementParser.CreateTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createSRSStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSRSStatement(MySQLStatementParser.CreateSRSStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createSRSStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSRSStatement(MySQLStatementParser.CreateSRSStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropSRSStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropSRSStatement(MySQLStatementParser.DropSRSStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropSRSStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropSRSStatement(MySQLStatementParser.DropSRSStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#srsAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSrsAttribute(MySQLStatementParser.SrsAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#srsAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSrsAttribute(MySQLStatementParser.SrsAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(MySQLStatementParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(MySQLStatementParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(MySQLStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(MySQLStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinition(MySQLStatementParser.PartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinition(MySQLStatementParser.PartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionLessThanValue}.
	 * @param ctx the parse tree
	 */
	void enterPartitionLessThanValue(MySQLStatementParser.PartitionLessThanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionLessThanValue}.
	 * @param ctx the parse tree
	 */
	void exitPartitionLessThanValue(MySQLStatementParser.PartitionLessThanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionValueList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionValueList(MySQLStatementParser.PartitionValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionValueList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionValueList(MySQLStatementParser.PartitionValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitionOption(MySQLStatementParser.PartitionDefinitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitionOption(MySQLStatementParser.PartitionDefinitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(MySQLStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(MySQLStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(MySQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(MySQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterScheduleExpression(MySQLStatementParser.ScheduleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitScheduleExpression(MySQLStatementParser.ScheduleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(MySQLStatementParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(MySQLStatementParser.TimestampValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(MySQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(MySQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void enterServerOption(MySQLStatementParser.ServerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void exitServerOption(MySQLStatementParser.ServerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineOption(MySQLStatementParser.RoutineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineOption(MySQLStatementParser.RoutineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(MySQLStatementParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(MySQLStatementParser.ProcedureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(MySQLStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(MySQLStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(MySQLStatementParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(MySQLStatementParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MySQLStatementParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MySQLStatementParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#validStatement}.
	 * @param ctx the parse tree
	 */
	void enterValidStatement(MySQLStatementParser.ValidStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#validStatement}.
	 * @param ctx the parse tree
	 */
	void exitValidStatement(MySQLStatementParser.ValidStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeginStatement(MySQLStatementParser.BeginStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeginStatement(MySQLStatementParser.BeginStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStatement(MySQLStatementParser.DeclareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStatement(MySQLStatementParser.DeclareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlowControlStatement(MySQLStatementParser.FlowControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlowControlStatement(MySQLStatementParser.FlowControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(MySQLStatementParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(MySQLStatementParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MySQLStatementParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MySQLStatementParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(MySQLStatementParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(MySQLStatementParser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(MySQLStatementParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(MySQLStatementParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MySQLStatementParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MySQLStatementParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(MySQLStatementParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(MySQLStatementParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MySQLStatementParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MySQLStatementParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MySQLStatementParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MySQLStatementParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorStatement(MySQLStatementParser.CursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorStatement(MySQLStatementParser.CursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorCloseStatement(MySQLStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorCloseStatement(MySQLStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cursorDeclareStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorDeclareStatement(MySQLStatementParser.CursorDeclareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cursorDeclareStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorDeclareStatement(MySQLStatementParser.CursorDeclareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cursorFetchStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorFetchStatement(MySQLStatementParser.CursorFetchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cursorFetchStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorFetchStatement(MySQLStatementParser.CursorFetchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorOpenStatement(MySQLStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorOpenStatement(MySQLStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#conditionHandlingStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionHandlingStatement(MySQLStatementParser.ConditionHandlingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#conditionHandlingStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionHandlingStatement(MySQLStatementParser.ConditionHandlingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#declareConditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareConditionStatement(MySQLStatementParser.DeclareConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#declareConditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareConditionStatement(MySQLStatementParser.DeclareConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#declareHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandlerStatement(MySQLStatementParser.DeclareHandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#declareHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandlerStatement(MySQLStatementParser.DeclareHandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void enterGetDiagnosticsStatement(MySQLStatementParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void exitGetDiagnosticsStatement(MySQLStatementParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#statementInformationItem}.
	 * @param ctx the parse tree
	 */
	void enterStatementInformationItem(MySQLStatementParser.StatementInformationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#statementInformationItem}.
	 * @param ctx the parse tree
	 */
	void exitStatementInformationItem(MySQLStatementParser.StatementInformationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#conditionInformationItem}.
	 * @param ctx the parse tree
	 */
	void enterConditionInformationItem(MySQLStatementParser.ConditionInformationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#conditionInformationItem}.
	 * @param ctx the parse tree
	 */
	void exitConditionInformationItem(MySQLStatementParser.ConditionInformationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#conditionNumber}.
	 * @param ctx the parse tree
	 */
	void enterConditionNumber(MySQLStatementParser.ConditionNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#conditionNumber}.
	 * @param ctx the parse tree
	 */
	void exitConditionNumber(MySQLStatementParser.ConditionNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 */
	void enterStatementInformationItemName(MySQLStatementParser.StatementInformationItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 */
	void exitStatementInformationItemName(MySQLStatementParser.StatementInformationItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void enterConditionInformationItemName(MySQLStatementParser.ConditionInformationItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void exitConditionInformationItemName(MySQLStatementParser.ConditionInformationItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerAction}.
	 * @param ctx the parse tree
	 */
	void enterHandlerAction(MySQLStatementParser.HandlerActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerAction}.
	 * @param ctx the parse tree
	 */
	void exitHandlerAction(MySQLStatementParser.HandlerActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#conditionValue}.
	 * @param ctx the parse tree
	 */
	void enterConditionValue(MySQLStatementParser.ConditionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#conditionValue}.
	 * @param ctx the parse tree
	 */
	void exitConditionValue(MySQLStatementParser.ConditionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void enterResignalStatement(MySQLStatementParser.ResignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void exitResignalStatement(MySQLStatementParser.ResignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(MySQLStatementParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(MySQLStatementParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#signalInformationItem}.
	 * @param ctx the parse tree
	 */
	void enterSignalInformationItem(MySQLStatementParser.SignalInformationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#signalInformationItem}.
	 * @param ctx the parse tree
	 */
	void exitSignalInformationItem(MySQLStatementParser.SignalInformationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void enterPrepare(MySQLStatementParser.PrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void exitPrepare(MySQLStatementParser.PrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(MySQLStatementParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(MySQLStatementParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#executeVarList}.
	 * @param ctx the parse tree
	 */
	void enterExecuteVarList(MySQLStatementParser.ExecuteVarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#executeVarList}.
	 * @param ctx the parse tree
	 */
	void exitExecuteVarList(MySQLStatementParser.ExecuteVarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate(MySQLStatementParser.DeallocateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate(MySQLStatementParser.DeallocateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(MySQLStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(MySQLStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void enterInsertSpecification(MySQLStatementParser.InsertSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void exitInsertSpecification(MySQLStatementParser.InsertSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(MySQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(MySQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(MySQLStatementParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(MySQLStatementParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInsertIdentifier(MySQLStatementParser.InsertIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInsertIdentifier(MySQLStatementParser.InsertIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void enterTableWild(MySQLStatementParser.TableWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void exitTableWild(MySQLStatementParser.TableWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(MySQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(MySQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateKeyClause(MySQLStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateKeyClause(MySQLStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void enterValueReference(MySQLStatementParser.ValueReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void exitValueReference(MySQLStatementParser.ValueReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void enterDerivedColumns(MySQLStatementParser.DerivedColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void exitDerivedColumns(MySQLStatementParser.DerivedColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(MySQLStatementParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(MySQLStatementParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterReplaceSpecification(MySQLStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitReplaceSpecification(MySQLStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterReplaceValuesClause(MySQLStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitReplaceValuesClause(MySQLStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterReplaceSelectClause(MySQLStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitReplaceSelectClause(MySQLStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(MySQLStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(MySQLStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(MySQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(MySQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MySQLStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MySQLStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(MySQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(MySQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(MySQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(MySQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(MySQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(MySQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(MySQLStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(MySQLStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(MySQLStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(MySQLStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification(MySQLStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification(MySQLStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(MySQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(MySQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(MySQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(MySQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(MySQLStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(MySQLStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithInto(MySQLStatementParser.SelectWithIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithInto(MySQLStatementParser.SelectWithIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(MySQLStatementParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(MySQLStatementParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionBody(MySQLStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionBody(MySQLStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(MySQLStatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(MySQLStatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionParens(MySQLStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionParens(MySQLStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimary(MySQLStatementParser.QueryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimary(MySQLStatementParser.QueryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(MySQLStatementParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(MySQLStatementParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MySQLStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MySQLStatementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(MySQLStatementParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(MySQLStatementParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(MySQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(MySQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(MySQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(MySQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(MySQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(MySQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(MySQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(MySQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(MySQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(MySQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(MySQLStatementParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(MySQLStatementParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadStatement(MySQLStatementParser.LoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadStatement(MySQLStatementParser.LoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(MySQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(MySQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(MySQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(MySQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void enterTableStatement(MySQLStatementParser.TableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void exitTableStatement(MySQLStatementParser.TableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableValueConstructor(MySQLStatementParser.TableValueConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableValueConstructor(MySQLStatementParser.TableValueConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructorList(MySQLStatementParser.RowConstructorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructorList(MySQLStatementParser.RowConstructorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(MySQLStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(MySQLStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void enterCteClause(MySQLStatementParser.CteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void exitCteClause(MySQLStatementParser.CteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(MySQLStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(MySQLStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(MySQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(MySQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(MySQLStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(MySQLStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(MySQLStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(MySQLStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(MySQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(MySQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(MySQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(MySQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(MySQLStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(MySQLStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(MySQLStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(MySQLStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(MySQLStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(MySQLStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(MySQLStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(MySQLStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(MySQLStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(MySQLStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames(MySQLStatementParser.PartitionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames(MySQLStatementParser.PartitionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintList(MySQLStatementParser.IndexHintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintList(MySQLStatementParser.IndexHintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(MySQLStatementParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(MySQLStatementParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexHintClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintClause(MySQLStatementParser.IndexHintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexHintClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintClause(MySQLStatementParser.IndexHintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexNameList}.
	 * @param ctx the parse tree
	 */
	void enterIndexNameList(MySQLStatementParser.IndexNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexNameList}.
	 * @param ctx the parse tree
	 */
	void exitIndexNameList(MySQLStatementParser.IndexNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(MySQLStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(MySQLStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinType(MySQLStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinType(MySQLStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinType(MySQLStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinType(MySQLStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinType(MySQLStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinType(MySQLStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(MySQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(MySQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MySQLStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MySQLStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(MySQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(MySQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(MySQLStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(MySQLStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(MySQLStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(MySQLStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(MySQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(MySQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(MySQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(MySQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(MySQLStatementParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(MySQLStatementParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void enterWindowItem(MySQLStatementParser.WindowItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void exitWindowItem(MySQLStatementParser.WindowItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(MySQLStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(MySQLStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(MySQLStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(MySQLStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(MySQLStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(MySQLStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoExpression(MySQLStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoExpression(MySQLStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(MySQLStatementParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(MySQLStatementParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void enterLockClauseList(MySQLStatementParser.LockClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void exitLockClauseList(MySQLStatementParser.LockClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void enterLockStrength(MySQLStatementParser.LockStrengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void exitLockStrength(MySQLStatementParser.LockStrengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void enterLockedRowAction(MySQLStatementParser.LockedRowActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void exitLockedRowAction(MySQLStatementParser.LockedRowActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void enterTableLockingList(MySQLStatementParser.TableLockingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void exitTableLockingList(MySQLStatementParser.TableLockingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentOptWild(MySQLStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentOptWild(MySQLStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void enterTableAliasRefList(MySQLStatementParser.TableAliasRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void exitTableAliasRefList(MySQLStatementParser.TableAliasRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void enterReturningClause(MySQLStatementParser.ReturningClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void exitReturningClause(MySQLStatementParser.ReturningClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#targetList}.
	 * @param ctx the parse tree
	 */
	void enterTargetList(MySQLStatementParser.TargetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#targetList}.
	 * @param ctx the parse tree
	 */
	void exitTargetList(MySQLStatementParser.TargetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(MySQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(MySQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCustomKeyword(MySQLStatementParser.CustomKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCustomKeyword(MySQLStatementParser.CustomKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(MySQLStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(MySQLStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(MySQLStatementParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(MySQLStatementParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(MySQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(MySQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(MySQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(MySQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterTemporalLiterals(MySQLStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitTemporalLiterals(MySQLStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(MySQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(MySQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(MySQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(MySQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(MySQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(MySQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(MySQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(MySQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(MySQLStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(MySQLStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MySQLStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MySQLStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsUnambiguous(MySQLStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsUnambiguous(MySQLStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous1RolesAndLabels(MySQLStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous1RolesAndLabels(MySQLStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous2Labels(MySQLStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous2Labels(MySQLStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous3Roles(MySQLStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous3Roles(MySQLStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous4SystemVariables(MySQLStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous4SystemVariables(MySQLStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTextOrIdentifier(MySQLStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTextOrIdentifier(MySQLStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(MySQLStatementParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(MySQLStatementParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MySQLStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MySQLStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(MySQLStatementParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(MySQLStatementParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(MySQLStatementParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(MySQLStatementParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterRvalueSystemVariable(MySQLStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitRvalueSystemVariable(MySQLStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariable(MySQLStatementParser.SetSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariable(MySQLStatementParser.SetSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionType(MySQLStatementParser.OptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionType(MySQLStatementParser.OptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariableName(MySQLStatementParser.InternalVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariableName(MySQLStatementParser.InternalVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterSetExprOrDefault(MySQLStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitSetExprOrDefault(MySQLStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristics(MySQLStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristics(MySQLStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(MySQLStatementParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(MySQLStatementParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void enterIsolationTypes(MySQLStatementParser.IsolationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void exitIsolationTypes(MySQLStatementParser.IsolationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(MySQLStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(MySQLStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(MySQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(MySQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#databaseNames}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseNames(MySQLStatementParser.DatabaseNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#databaseNames}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseNames(MySQLStatementParser.DatabaseNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(MySQLStatementParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(MySQLStatementParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#databasePairs}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePairs(MySQLStatementParser.DatabasePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#databasePairs}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePairs(MySQLStatementParser.DatabasePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#databasePair}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePair(MySQLStatementParser.DatabasePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#databasePair}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePair(MySQLStatementParser.DatabasePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MySQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MySQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(MySQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(MySQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(MySQLStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(MySQLStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(MySQLStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(MySQLStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void enterOldColumn(MySQLStatementParser.OldColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void exitOldColumn(MySQLStatementParser.OldColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void enterNewColumn(MySQLStatementParser.NewColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void exitNewColumn(MySQLStatementParser.NewColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void enterDelimiterName(MySQLStatementParser.DelimiterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void exitDelimiterName(MySQLStatementParser.DelimiterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterUserIdentifierOrText(MySQLStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitUserIdentifierOrText(MySQLStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(MySQLStatementParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(MySQLStatementParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(MySQLStatementParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(MySQLStatementParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(MySQLStatementParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(MySQLStatementParser.ServerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void enterWrapperName(MySQLStatementParser.WrapperNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void exitWrapperName(MySQLStatementParser.WrapperNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(MySQLStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(MySQLStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(MySQLStatementParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(MySQLStatementParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(MySQLStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(MySQLStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(MySQLStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(MySQLStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(MySQLStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(MySQLStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MySQLStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MySQLStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(MySQLStatementParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(MySQLStatementParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void enterViewNames(MySQLStatementParser.ViewNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void exitViewNames(MySQLStatementParser.ViewNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(MySQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(MySQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(MySQLStatementParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(MySQLStatementParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(MySQLStatementParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(MySQLStatementParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void enterShardLibraryName(MySQLStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void exitShardLibraryName(MySQLStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(MySQLStatementParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(MySQLStatementParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(MySQLStatementParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(MySQLStatementParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(MySQLStatementParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(MySQLStatementParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(MySQLStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(MySQLStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void enterCloneInstance(MySQLStatementParser.CloneInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void exitCloneInstance(MySQLStatementParser.CloneInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void enterCloneDir(MySQLStatementParser.CloneDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void exitCloneDir(MySQLStatementParser.CloneDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(MySQLStatementParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(MySQLStatementParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void enterLogName(MySQLStatementParser.LogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void exitLogName(MySQLStatementParser.LogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(MySQLStatementParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(MySQLStatementParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterRoleIdentifierOrText(MySQLStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitRoleIdentifierOrText(MySQLStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void enterEngineRef(MySQLStatementParser.EngineRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void exitEngineRef(MySQLStatementParser.EngineRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(MySQLStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(MySQLStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTime(MySQLStatementParser.TriggerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTime(MySQLStatementParser.TriggerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void enterTableOrTables(MySQLStatementParser.TableOrTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void exitTableOrTables(MySQLStatementParser.TableOrTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRole(MySQLStatementParser.UserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRole(MySQLStatementParser.UserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(MySQLStatementParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(MySQLStatementParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(MySQLStatementParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(MySQLStatementParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void enterAllOrPartitionNameList(MySQLStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void exitAllOrPartitionNameList(MySQLStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(MySQLStatementParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(MySQLStatementParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOrder(MySQLStatementParser.TriggerOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOrder(MySQLStatementParser.TriggerOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MySQLStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MySQLStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(MySQLStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(MySQLStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(MySQLStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(MySQLStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(MySQLStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(MySQLStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(MySQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(MySQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(MySQLStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(MySQLStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MySQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MySQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(MySQLStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(MySQLStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(MySQLStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(MySQLStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(MySQLStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(MySQLStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(MySQLStatementParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(MySQLStatementParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#onEmpty}.
	 * @param ctx the parse tree
	 */
	void enterOnEmpty(MySQLStatementParser.OnEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#onEmpty}.
	 * @param ctx the parse tree
	 */
	void exitOnEmpty(MySQLStatementParser.OnEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#onError}.
	 * @param ctx the parse tree
	 */
	void enterOnError(MySQLStatementParser.OnErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#onError}.
	 * @param ctx the parse tree
	 */
	void exitOnError(MySQLStatementParser.OnErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(MySQLStatementParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(MySQLStatementParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnRefList(MySQLStatementParser.ColumnRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnRefList(MySQLStatementParser.ColumnRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MySQLStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MySQLStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunction(MySQLStatementParser.UdfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunction(MySQLStatementParser.UdfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#separatorName}.
	 * @param ctx the parse tree
	 */
	void enterSeparatorName(MySQLStatementParser.SeparatorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#separatorName}.
	 * @param ctx the parse tree
	 */
	void exitSeparatorName(MySQLStatementParser.SeparatorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#aggregationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAggregationExpression(MySQLStatementParser.AggregationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#aggregationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAggregationExpression(MySQLStatementParser.AggregationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(MySQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(MySQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunction(MySQLStatementParser.JsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunction(MySQLStatementParser.JsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#jsonTableFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableFunction(MySQLStatementParser.JsonTableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#jsonTableFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableFunction(MySQLStatementParser.JsonTableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#jsonTableColumns}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableColumns(MySQLStatementParser.JsonTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#jsonTableColumns}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableColumns(MySQLStatementParser.JsonTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableColumn(MySQLStatementParser.JsonTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableColumn(MySQLStatementParser.JsonTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#jsonTableColumnOnEmpty}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableColumnOnEmpty(MySQLStatementParser.JsonTableColumnOnEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#jsonTableColumnOnEmpty}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableColumnOnEmpty(MySQLStatementParser.JsonTableColumnOnEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#jsonTableColumnOnError}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableColumnOnError(MySQLStatementParser.JsonTableColumnOnErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#jsonTableColumnOnError}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableColumnOnError(MySQLStatementParser.JsonTableColumnOnErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunctionName(MySQLStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunctionName(MySQLStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(MySQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(MySQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(MySQLStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(MySQLStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(MySQLStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(MySQLStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(MySQLStatementParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(MySQLStatementParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(MySQLStatementParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(MySQLStatementParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(MySQLStatementParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(MySQLStatementParser.FrameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd(MySQLStatementParser.FrameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd(MySQLStatementParser.FrameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(MySQLStatementParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(MySQLStatementParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(MySQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(MySQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUserFunction(MySQLStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUserFunction(MySQLStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupingFunction(MySQLStatementParser.GroupingFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupingFunction(MySQLStatementParser.GroupingFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#timeStampDiffFunction}.
	 * @param ctx the parse tree
	 */
	void enterTimeStampDiffFunction(MySQLStatementParser.TimeStampDiffFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#timeStampDiffFunction}.
	 * @param ctx the parse tree
	 */
	void exitTimeStampDiffFunction(MySQLStatementParser.TimeStampDiffFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcatFunction(MySQLStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcatFunction(MySQLStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(MySQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(MySQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(MySQLStatementParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(MySQLStatementParser.WindowingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void enterLeadLagInfo(MySQLStatementParser.LeadLagInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void exitLeadLagInfo(MySQLStatementParser.LeadLagInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(MySQLStatementParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(MySQLStatementParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(MySQLStatementParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(MySQLStatementParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void enterRepairType(MySQLStatementParser.RepairTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void exitRepairType(MySQLStatementParser.RepairTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(MySQLStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(MySQLStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(MySQLStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(MySQLStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(MySQLStatementParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(MySQLStatementParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(MySQLStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(MySQLStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(MySQLStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(MySQLStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(MySQLStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(MySQLStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(MySQLStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(MySQLStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(MySQLStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(MySQLStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunction(MySQLStatementParser.ValuesFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunction(MySQLStatementParser.ValuesFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightStringFunction(MySQLStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightStringFunction(MySQLStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void enterLevelClause(MySQLStatementParser.LevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void exitLevelClause(MySQLStatementParser.LevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(MySQLStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(MySQLStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(MySQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(MySQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterShorthandRegularFunction(MySQLStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitShorthandRegularFunction(MySQLStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterCompleteRegularFunction(MySQLStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitCompleteRegularFunction(MySQLStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(MySQLStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(MySQLStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(MySQLStatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(MySQLStatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void enterMatchSearchModifier(MySQLStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void exitMatchSearchModifier(MySQLStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(MySQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(MySQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeExpr(MySQLStatementParser.DatetimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeExpr(MySQLStatementParser.DatetimeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogFileIndexNumber(MySQLStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogFileIndexNumber(MySQLStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(MySQLStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(MySQLStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(MySQLStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(MySQLStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(MySQLStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(MySQLStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(MySQLStatementParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(MySQLStatementParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(MySQLStatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(MySQLStatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(MySQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(MySQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(MySQLStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(MySQLStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(MySQLStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(MySQLStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(MySQLStatementParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(MySQLStatementParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void enterTextString(MySQLStatementParser.TextStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void exitTextString(MySQLStatementParser.TextStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void enterTextStringHash(MySQLStatementParser.TextStringHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void exitTextStringHash(MySQLStatementParser.TextStringHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void enterFieldOptions(MySQLStatementParser.FieldOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void exitFieldOptions(MySQLStatementParser.FieldOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(MySQLStatementParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(MySQLStatementParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterTypeDatetimePrecision(MySQLStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitTypeDatetimePrecision(MySQLStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void enterCharsetWithOptBinary(MySQLStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void exitCharsetWithOptBinary(MySQLStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void enterAscii(MySQLStatementParser.AsciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void exitAscii(MySQLStatementParser.AsciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void enterUnicode(MySQLStatementParser.UnicodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void exitUnicode(MySQLStatementParser.UnicodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(MySQLStatementParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(MySQLStatementParser.CharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCollation(MySQLStatementParser.DefaultCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCollation(MySQLStatementParser.DefaultCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultEncryption(MySQLStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultEncryption(MySQLStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCharset(MySQLStatementParser.DefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCharset(MySQLStatementParser.DefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void enterNow(MySQLStatementParser.NowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void exitNow(MySQLStatementParser.NowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void enterColumnFormat(MySQLStatementParser.ColumnFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void exitColumnFormat(MySQLStatementParser.ColumnFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void enterStorageMedia(MySQLStatementParser.StorageMediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void exitStorageMedia(MySQLStatementParser.StorageMediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(MySQLStatementParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(MySQLStatementParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void enterKeyOrIndex(MySQLStatementParser.KeyOrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void exitKeyOrIndex(MySQLStatementParser.KeyOrIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(MySQLStatementParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(MySQLStatementParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(MySQLStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(MySQLStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(MySQLStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(MySQLStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrVarSpec(MySQLStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrVarSpec(MySQLStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(MySQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(MySQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(MySQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(MySQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void enterConnectionId(MySQLStatementParser.ConnectionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void exitConnectionId(MySQLStatementParser.ConnectionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(MySQLStatementParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(MySQLStatementParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(MySQLStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(MySQLStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(MySQLStatementParser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(MySQLStatementParser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void enterCombineOption(MySQLStatementParser.CombineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void exitCombineOption(MySQLStatementParser.CombineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void enterNoWriteToBinLog(MySQLStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void exitNoWriteToBinLog(MySQLStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(MySQLStatementParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(MySQLStatementParser.ChannelOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(MySQLStatementParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(MySQLStatementParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(MySQLStatementParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(MySQLStatementParser.HelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(MySQLStatementParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(MySQLStatementParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fromDatabase}.
	 * @param ctx the parse tree
	 */
	void enterFromDatabase(MySQLStatementParser.FromDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fromDatabase}.
	 * @param ctx the parse tree
	 */
	void exitFromDatabase(MySQLStatementParser.FromDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(MySQLStatementParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(MySQLStatementParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void enterShowLike(MySQLStatementParser.ShowLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void exitShowLike(MySQLStatementParser.ShowLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterShowWhereClause(MySQLStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitShowWhereClause(MySQLStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(MySQLStatementParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(MySQLStatementParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(MySQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(MySQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(MySQLStatementParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(MySQLStatementParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 */
	void enterOptionValueList(MySQLStatementParser.OptionValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 */
	void exitOptionValueList(MySQLStatementParser.OptionValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionValueNoOptionType(MySQLStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionValueNoOptionType(MySQLStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MySQLStatementParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MySQLStatementParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optionValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionValue(MySQLStatementParser.OptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optionValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionValue(MySQLStatementParser.OptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterShowBinaryLogs(MySQLStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitShowBinaryLogs(MySQLStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowBinlogEvents(MySQLStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowBinlogEvents(MySQLStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void enterShowCharacterSet(MySQLStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void exitShowCharacterSet(MySQLStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void enterShowCollation(MySQLStatementParser.ShowCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void exitShowCollation(MySQLStatementParser.ShowCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(MySQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(MySQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDatabase(MySQLStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDatabase(MySQLStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateEvent(MySQLStatementParser.ShowCreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateEvent(MySQLStatementParser.ShowCreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFunction(MySQLStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFunction(MySQLStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateProcedure(MySQLStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateProcedure(MySQLStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(MySQLStatementParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(MySQLStatementParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTrigger(MySQLStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTrigger(MySQLStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(MySQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(MySQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateView(MySQLStatementParser.ShowCreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateView(MySQLStatementParser.ShowCreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(MySQLStatementParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(MySQLStatementParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(MySQLStatementParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(MySQLStatementParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void enterShowEngines(MySQLStatementParser.ShowEnginesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void exitShowEngines(MySQLStatementParser.ShowEnginesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(MySQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(MySQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowEvents(MySQLStatementParser.ShowEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowEvents(MySQLStatementParser.ShowEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionCode(MySQLStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionCode(MySQLStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionStatus(MySQLStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionStatus(MySQLStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showGrants}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(MySQLStatementParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showGrants}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(MySQLStatementParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void enterShowIndex(MySQLStatementParser.ShowIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void exitShowIndex(MySQLStatementParser.ShowIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterStatus(MySQLStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterStatus(MySQLStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(MySQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(MySQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowPlugins(MySQLStatementParser.ShowPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowPlugins(MySQLStatementParser.ShowPluginsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterShowPrivileges(MySQLStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitShowPrivileges(MySQLStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureCode(MySQLStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureCode(MySQLStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureStatus(MySQLStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureStatus(MySQLStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void enterShowProcesslist(MySQLStatementParser.ShowProcesslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void exitShowProcesslist(MySQLStatementParser.ShowProcesslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(MySQLStatementParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(MySQLStatementParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void enterShowProfiles(MySQLStatementParser.ShowProfilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void exitShowProfiles(MySQLStatementParser.ShowProfilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowRelaylogEvent(MySQLStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowRelaylogEvent(MySQLStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 */
	void enterShowReplicas(MySQLStatementParser.ShowReplicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 */
	void exitShowReplicas(MySQLStatementParser.ShowReplicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveHosts(MySQLStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveHosts(MySQLStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowReplicaStatus(MySQLStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowReplicaStatus(MySQLStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(MySQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(MySQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowStatus(MySQLStatementParser.ShowStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowStatus(MySQLStatementParser.ShowStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowTableStatus(MySQLStatementParser.ShowTableStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowTableStatus(MySQLStatementParser.ShowTableStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(MySQLStatementParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(MySQLStatementParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 */
	void enterShowTriggers(MySQLStatementParser.ShowTriggersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 */
	void exitShowTriggers(MySQLStatementParser.ShowTriggersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void enterShowVariables(MySQLStatementParser.ShowVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void exitShowVariables(MySQLStatementParser.ShowVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void enterShowWarnings(MySQLStatementParser.ShowWarningsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void exitShowWarnings(MySQLStatementParser.ShowWarningsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCharset}.
	 * @param ctx the parse tree
	 */
	void enterShowCharset(MySQLStatementParser.ShowCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCharset}.
	 * @param ctx the parse tree
	 */
	void exitShowCharset(MySQLStatementParser.ShowCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void enterSetCharacter(MySQLStatementParser.SetCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void exitSetCharacter(MySQLStatementParser.SetCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void enterClone(MySQLStatementParser.CloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void exitClone(MySQLStatementParser.CloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 */
	void enterCloneAction(MySQLStatementParser.CloneActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 */
	void exitCloneAction(MySQLStatementParser.CloneActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoadableFunction(MySQLStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoadableFunction(MySQLStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#install}.
	 * @param ctx the parse tree
	 */
	void enterInstall(MySQLStatementParser.InstallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#install}.
	 * @param ctx the parse tree
	 */
	void exitInstall(MySQLStatementParser.InstallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#uninstall}.
	 * @param ctx the parse tree
	 */
	void enterUninstall(MySQLStatementParser.UninstallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#uninstall}.
	 * @param ctx the parse tree
	 */
	void exitUninstall(MySQLStatementParser.UninstallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void enterInstallComponent(MySQLStatementParser.InstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void exitInstallComponent(MySQLStatementParser.InstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(MySQLStatementParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(MySQLStatementParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void enterUninstallComponent(MySQLStatementParser.UninstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void exitUninstallComponent(MySQLStatementParser.UninstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(MySQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(MySQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(MySQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(MySQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#histogram}.
	 * @param ctx the parse tree
	 */
	void enterHistogram(MySQLStatementParser.HistogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#histogram}.
	 * @param ctx the parse tree
	 */
	void exitHistogram(MySQLStatementParser.HistogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(MySQLStatementParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(MySQLStatementParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(MySQLStatementParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(MySQLStatementParser.CheckTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(MySQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(MySQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(MySQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(MySQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(MySQLStatementParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(MySQLStatementParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterResourceGroup(MySQLStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterResourceGroup(MySQLStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 */
	void enterVcpuSpec(MySQLStatementParser.VcpuSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 */
	void exitVcpuSpec(MySQLStatementParser.VcpuSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateResourceGroup(MySQLStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateResourceGroup(MySQLStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropResourceGroup(MySQLStatementParser.DropResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropResourceGroup(MySQLStatementParser.DropResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterSetResourceGroup(MySQLStatementParser.SetResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitSetResourceGroup(MySQLStatementParser.SetResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void enterBinlog(MySQLStatementParser.BinlogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void exitBinlog(MySQLStatementParser.BinlogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndex(MySQLStatementParser.CacheIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndex(MySQLStatementParser.CacheIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 */
	void enterCacheTableIndexList(MySQLStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 */
	void exitCacheTableIndexList(MySQLStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionList(MySQLStatementParser.PartitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionList(MySQLStatementParser.PartitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void enterFlush(MySQLStatementParser.FlushContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void exitFlush(MySQLStatementParser.FlushContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushOption(MySQLStatementParser.FlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushOption(MySQLStatementParser.FlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 */
	void enterTablesOption(MySQLStatementParser.TablesOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 */
	void exitTablesOption(MySQLStatementParser.TablesOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void enterKill(MySQLStatementParser.KillContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void exitKill(MySQLStatementParser.KillContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexInfo(MySQLStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexInfo(MySQLStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 */
	void enterLoadTableIndexList(MySQLStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 */
	void exitLoadTableIndexList(MySQLStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(MySQLStatementParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(MySQLStatementParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resetOption}.
	 * @param ctx the parse tree
	 */
	void enterResetOption(MySQLStatementParser.ResetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resetOption}.
	 * @param ctx the parse tree
	 */
	void exitResetOption(MySQLStatementParser.ResetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void enterResetPersist(MySQLStatementParser.ResetPersistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void exitResetPersist(MySQLStatementParser.ResetPersistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void enterRestart(MySQLStatementParser.RestartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void exitRestart(MySQLStatementParser.RestartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void enterShutdown(MySQLStatementParser.ShutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void exitShutdown(MySQLStatementParser.ShutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#explainType}.
	 * @param ctx the parse tree
	 */
	void enterExplainType(MySQLStatementParser.ExplainTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#explainType}.
	 * @param ctx the parse tree
	 */
	void exitExplainType(MySQLStatementParser.ExplainTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStatement(MySQLStatementParser.ExplainableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStatement(MySQLStatementParser.ExplainableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#formatName}.
	 * @param ctx the parse tree
	 */
	void enterFormatName(MySQLStatementParser.FormatNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#formatName}.
	 * @param ctx the parse tree
	 */
	void exitFormatName(MySQLStatementParser.FormatNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void enterDelimiter(MySQLStatementParser.DelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void exitDelimiter(MySQLStatementParser.DelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(MySQLStatementParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(MySQLStatementParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(MySQLStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(MySQLStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 */
	void enterSetAutoCommit(MySQLStatementParser.SetAutoCommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 */
	void exitSetAutoCommit(MySQLStatementParser.SetAutoCommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(MySQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(MySQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#transactionCharacteristic}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristic(MySQLStatementParser.TransactionCharacteristicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#transactionCharacteristic}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristic(MySQLStatementParser.TransactionCharacteristicContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(MySQLStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(MySQLStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(MySQLStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(MySQLStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(MySQLStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(MySQLStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(MySQLStatementParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(MySQLStatementParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void enterLock(MySQLStatementParser.LockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void exitLock(MySQLStatementParser.LockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#unlock}.
	 * @param ctx the parse tree
	 */
	void enterUnlock(MySQLStatementParser.UnlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#unlock}.
	 * @param ctx the parse tree
	 */
	void exitUnlock(MySQLStatementParser.UnlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void enterReleaseSavepoint(MySQLStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void exitReleaseSavepoint(MySQLStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optionChain}.
	 * @param ctx the parse tree
	 */
	void enterOptionChain(MySQLStatementParser.OptionChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optionChain}.
	 * @param ctx the parse tree
	 */
	void exitOptionChain(MySQLStatementParser.OptionChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optionRelease}.
	 * @param ctx the parse tree
	 */
	void enterOptionRelease(MySQLStatementParser.OptionReleaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optionRelease}.
	 * @param ctx the parse tree
	 */
	void exitOptionRelease(MySQLStatementParser.OptionReleaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableLock}.
	 * @param ctx the parse tree
	 */
	void enterTableLock(MySQLStatementParser.TableLockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableLock}.
	 * @param ctx the parse tree
	 */
	void exitTableLock(MySQLStatementParser.TableLockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lockOption}.
	 * @param ctx the parse tree
	 */
	void enterLockOption(MySQLStatementParser.LockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lockOption}.
	 * @param ctx the parse tree
	 */
	void exitLockOption(MySQLStatementParser.LockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#xaBegin}.
	 * @param ctx the parse tree
	 */
	void enterXaBegin(MySQLStatementParser.XaBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#xaBegin}.
	 * @param ctx the parse tree
	 */
	void exitXaBegin(MySQLStatementParser.XaBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#xaPrepare}.
	 * @param ctx the parse tree
	 */
	void enterXaPrepare(MySQLStatementParser.XaPrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#xaPrepare}.
	 * @param ctx the parse tree
	 */
	void exitXaPrepare(MySQLStatementParser.XaPrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#xaCommit}.
	 * @param ctx the parse tree
	 */
	void enterXaCommit(MySQLStatementParser.XaCommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#xaCommit}.
	 * @param ctx the parse tree
	 */
	void exitXaCommit(MySQLStatementParser.XaCommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#xaRollback}.
	 * @param ctx the parse tree
	 */
	void enterXaRollback(MySQLStatementParser.XaRollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#xaRollback}.
	 * @param ctx the parse tree
	 */
	void exitXaRollback(MySQLStatementParser.XaRollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#xaEnd}.
	 * @param ctx the parse tree
	 */
	void enterXaEnd(MySQLStatementParser.XaEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#xaEnd}.
	 * @param ctx the parse tree
	 */
	void exitXaEnd(MySQLStatementParser.XaEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#xaRecovery}.
	 * @param ctx the parse tree
	 */
	void enterXaRecovery(MySQLStatementParser.XaRecoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#xaRecovery}.
	 * @param ctx the parse tree
	 */
	void exitXaRecovery(MySQLStatementParser.XaRecoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#xid}.
	 * @param ctx the parse tree
	 */
	void enterXid(MySQLStatementParser.XidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#xid}.
	 * @param ctx the parse tree
	 */
	void exitXid(MySQLStatementParser.XidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantRoleOrPrivilegeTo}
	 * labeled alternative in {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrantRoleOrPrivilegeTo(MySQLStatementParser.GrantRoleOrPrivilegeToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantRoleOrPrivilegeTo}
	 * labeled alternative in {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrantRoleOrPrivilegeTo(MySQLStatementParser.GrantRoleOrPrivilegeToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantRoleOrPrivilegeOnTo}
	 * labeled alternative in {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrantRoleOrPrivilegeOnTo(MySQLStatementParser.GrantRoleOrPrivilegeOnToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantRoleOrPrivilegeOnTo}
	 * labeled alternative in {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrantRoleOrPrivilegeOnTo(MySQLStatementParser.GrantRoleOrPrivilegeOnToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantProxy}
	 * labeled alternative in {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrantProxy(MySQLStatementParser.GrantProxyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantProxy}
	 * labeled alternative in {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrantProxy(MySQLStatementParser.GrantProxyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code revokeFrom}
	 * labeled alternative in {@link MySQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevokeFrom(MySQLStatementParser.RevokeFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code revokeFrom}
	 * labeled alternative in {@link MySQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevokeFrom(MySQLStatementParser.RevokeFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code revokeOnFrom}
	 * labeled alternative in {@link MySQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevokeOnFrom(MySQLStatementParser.RevokeOnFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code revokeOnFrom}
	 * labeled alternative in {@link MySQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevokeOnFrom(MySQLStatementParser.RevokeOnFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userList}.
	 * @param ctx the parse tree
	 */
	void enterUserList(MySQLStatementParser.UserListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userList}.
	 * @param ctx the parse tree
	 */
	void exitUserList(MySQLStatementParser.UserListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#roleOrPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterRoleOrPrivileges(MySQLStatementParser.RoleOrPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#roleOrPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitRoleOrPrivileges(MySQLStatementParser.RoleOrPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleOrDynamicPrivilege}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterRoleOrDynamicPrivilege(MySQLStatementParser.RoleOrDynamicPrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleOrDynamicPrivilege}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitRoleOrDynamicPrivilege(MySQLStatementParser.RoleOrDynamicPrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleAtHost}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterRoleAtHost(MySQLStatementParser.RoleAtHostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleAtHost}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitRoleAtHost(MySQLStatementParser.RoleAtHostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeSelect}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeSelect(MySQLStatementParser.StaticPrivilegeSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeSelect}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeSelect(MySQLStatementParser.StaticPrivilegeSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeInsert}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeInsert(MySQLStatementParser.StaticPrivilegeInsertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeInsert}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeInsert(MySQLStatementParser.StaticPrivilegeInsertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeUpdate}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeUpdate(MySQLStatementParser.StaticPrivilegeUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeUpdate}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeUpdate(MySQLStatementParser.StaticPrivilegeUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReferences}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReferences(MySQLStatementParser.StaticPrivilegeReferencesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReferences}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReferences(MySQLStatementParser.StaticPrivilegeReferencesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeDelete}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeDelete(MySQLStatementParser.StaticPrivilegeDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeDelete}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeDelete(MySQLStatementParser.StaticPrivilegeDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeUsage}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeUsage(MySQLStatementParser.StaticPrivilegeUsageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeUsage}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeUsage(MySQLStatementParser.StaticPrivilegeUsageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeIndex}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeIndex(MySQLStatementParser.StaticPrivilegeIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeIndex}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeIndex(MySQLStatementParser.StaticPrivilegeIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeAlter}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeAlter(MySQLStatementParser.StaticPrivilegeAlterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeAlter}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeAlter(MySQLStatementParser.StaticPrivilegeAlterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreate}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreate(MySQLStatementParser.StaticPrivilegeCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreate}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreate(MySQLStatementParser.StaticPrivilegeCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeDrop}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeDrop(MySQLStatementParser.StaticPrivilegeDropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeDrop}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeDrop(MySQLStatementParser.StaticPrivilegeDropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeExecute}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeExecute(MySQLStatementParser.StaticPrivilegeExecuteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeExecute}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeExecute(MySQLStatementParser.StaticPrivilegeExecuteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReload}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReload(MySQLStatementParser.StaticPrivilegeReloadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReload}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReload(MySQLStatementParser.StaticPrivilegeReloadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeShutdown}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeShutdown(MySQLStatementParser.StaticPrivilegeShutdownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeShutdown}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeShutdown(MySQLStatementParser.StaticPrivilegeShutdownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeProcess}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeProcess(MySQLStatementParser.StaticPrivilegeProcessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeProcess}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeProcess(MySQLStatementParser.StaticPrivilegeProcessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeFile}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeFile(MySQLStatementParser.StaticPrivilegeFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeFile}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeFile(MySQLStatementParser.StaticPrivilegeFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeGrant}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeGrant(MySQLStatementParser.StaticPrivilegeGrantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeGrant}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeGrant(MySQLStatementParser.StaticPrivilegeGrantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeShowDatabases}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeShowDatabases(MySQLStatementParser.StaticPrivilegeShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeShowDatabases}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeShowDatabases(MySQLStatementParser.StaticPrivilegeShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeSuper}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeSuper(MySQLStatementParser.StaticPrivilegeSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeSuper}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeSuper(MySQLStatementParser.StaticPrivilegeSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateTemporaryTables}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateTemporaryTables(MySQLStatementParser.StaticPrivilegeCreateTemporaryTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateTemporaryTables}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateTemporaryTables(MySQLStatementParser.StaticPrivilegeCreateTemporaryTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeLockTables}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeLockTables(MySQLStatementParser.StaticPrivilegeLockTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeLockTables}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeLockTables(MySQLStatementParser.StaticPrivilegeLockTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReplicationSlave}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReplicationSlave(MySQLStatementParser.StaticPrivilegeReplicationSlaveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReplicationSlave}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReplicationSlave(MySQLStatementParser.StaticPrivilegeReplicationSlaveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReplicationClient}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReplicationClient(MySQLStatementParser.StaticPrivilegeReplicationClientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReplicationClient}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReplicationClient(MySQLStatementParser.StaticPrivilegeReplicationClientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateView}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateView(MySQLStatementParser.StaticPrivilegeCreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateView}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateView(MySQLStatementParser.StaticPrivilegeCreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeShowView}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeShowView(MySQLStatementParser.StaticPrivilegeShowViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeShowView}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeShowView(MySQLStatementParser.StaticPrivilegeShowViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateRoutine}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateRoutine(MySQLStatementParser.StaticPrivilegeCreateRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateRoutine}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateRoutine(MySQLStatementParser.StaticPrivilegeCreateRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeAlterRoutine}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeAlterRoutine(MySQLStatementParser.StaticPrivilegeAlterRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeAlterRoutine}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeAlterRoutine(MySQLStatementParser.StaticPrivilegeAlterRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateUser}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateUser(MySQLStatementParser.StaticPrivilegeCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateUser}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateUser(MySQLStatementParser.StaticPrivilegeCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeEvent}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeEvent(MySQLStatementParser.StaticPrivilegeEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeEvent}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeEvent(MySQLStatementParser.StaticPrivilegeEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeTrigger}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeTrigger(MySQLStatementParser.StaticPrivilegeTriggerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeTrigger}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeTrigger(MySQLStatementParser.StaticPrivilegeTriggerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateTablespace}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateTablespace(MySQLStatementParser.StaticPrivilegeCreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateTablespace}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateTablespace(MySQLStatementParser.StaticPrivilegeCreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateRole}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateRole(MySQLStatementParser.StaticPrivilegeCreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateRole}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateRole(MySQLStatementParser.StaticPrivilegeCreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeDropRole}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeDropRole(MySQLStatementParser.StaticPrivilegeDropRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeDropRole}
	 * labeled alternative in {@link MySQLStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeDropRole(MySQLStatementParser.StaticPrivilegeDropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#aclType}.
	 * @param ctx the parse tree
	 */
	void enterAclType(MySQLStatementParser.AclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#aclType}.
	 * @param ctx the parse tree
	 */
	void exitAclType(MySQLStatementParser.AclTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantLevelGlobal}
	 * labeled alternative in {@link MySQLStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGrantLevelGlobal(MySQLStatementParser.GrantLevelGlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantLevelGlobal}
	 * labeled alternative in {@link MySQLStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGrantLevelGlobal(MySQLStatementParser.GrantLevelGlobalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantLevelDatabaseGlobal}
	 * labeled alternative in {@link MySQLStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGrantLevelDatabaseGlobal(MySQLStatementParser.GrantLevelDatabaseGlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantLevelDatabaseGlobal}
	 * labeled alternative in {@link MySQLStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGrantLevelDatabaseGlobal(MySQLStatementParser.GrantLevelDatabaseGlobalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantLevelTable}
	 * labeled alternative in {@link MySQLStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGrantLevelTable(MySQLStatementParser.GrantLevelTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantLevelTable}
	 * labeled alternative in {@link MySQLStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGrantLevelTable(MySQLStatementParser.GrantLevelTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(MySQLStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(MySQLStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createUserOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserOption(MySQLStatementParser.CreateUserOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createUserOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserOption(MySQLStatementParser.CreateUserOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserEntryNoOption}
	 * labeled alternative in {@link MySQLStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserEntryNoOption(MySQLStatementParser.CreateUserEntryNoOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserEntryNoOption}
	 * labeled alternative in {@link MySQLStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserEntryNoOption(MySQLStatementParser.CreateUserEntryNoOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserEntryIdentifiedBy}
	 * labeled alternative in {@link MySQLStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserEntryIdentifiedBy(MySQLStatementParser.CreateUserEntryIdentifiedByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserEntryIdentifiedBy}
	 * labeled alternative in {@link MySQLStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserEntryIdentifiedBy(MySQLStatementParser.CreateUserEntryIdentifiedByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserEntryIdentifiedWith}
	 * labeled alternative in {@link MySQLStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserEntryIdentifiedWith(MySQLStatementParser.CreateUserEntryIdentifiedWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserEntryIdentifiedWith}
	 * labeled alternative in {@link MySQLStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserEntryIdentifiedWith(MySQLStatementParser.CreateUserEntryIdentifiedWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createUserList}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserList(MySQLStatementParser.CreateUserListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createUserList}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserList(MySQLStatementParser.CreateUserListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#defaultRoleClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultRoleClause(MySQLStatementParser.DefaultRoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#defaultRoleClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultRoleClause(MySQLStatementParser.DefaultRoleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#requireClause}.
	 * @param ctx the parse tree
	 */
	void enterRequireClause(MySQLStatementParser.RequireClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#requireClause}.
	 * @param ctx the parse tree
	 */
	void exitRequireClause(MySQLStatementParser.RequireClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#connectOptions}.
	 * @param ctx the parse tree
	 */
	void enterConnectOptions(MySQLStatementParser.ConnectOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#connectOptions}.
	 * @param ctx the parse tree
	 */
	void exitConnectOptions(MySQLStatementParser.ConnectOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#accountLockPasswordExpireOptions}.
	 * @param ctx the parse tree
	 */
	void enterAccountLockPasswordExpireOptions(MySQLStatementParser.AccountLockPasswordExpireOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#accountLockPasswordExpireOptions}.
	 * @param ctx the parse tree
	 */
	void exitAccountLockPasswordExpireOptions(MySQLStatementParser.AccountLockPasswordExpireOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#accountLockPasswordExpireOption}.
	 * @param ctx the parse tree
	 */
	void enterAccountLockPasswordExpireOption(MySQLStatementParser.AccountLockPasswordExpireOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#accountLockPasswordExpireOption}.
	 * @param ctx the parse tree
	 */
	void exitAccountLockPasswordExpireOption(MySQLStatementParser.AccountLockPasswordExpireOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(MySQLStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(MySQLStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserEntry(MySQLStatementParser.AlterUserEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserEntry(MySQLStatementParser.AlterUserEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterUserList}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserList(MySQLStatementParser.AlterUserListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterUserList}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserList(MySQLStatementParser.AlterUserListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperation(MySQLStatementParser.AlterOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperation(MySQLStatementParser.AlterOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#factoryOperation}.
	 * @param ctx the parse tree
	 */
	void enterFactoryOperation(MySQLStatementParser.FactoryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#factoryOperation}.
	 * @param ctx the parse tree
	 */
	void exitFactoryOperation(MySQLStatementParser.FactoryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#authentication_fido}.
	 * @param ctx the parse tree
	 */
	void enterAuthentication_fido(MySQLStatementParser.Authentication_fidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#authentication_fido}.
	 * @param ctx the parse tree
	 */
	void exitAuthentication_fido(MySQLStatementParser.Authentication_fidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(MySQLStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(MySQLStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(MySQLStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(MySQLStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(MySQLStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(MySQLStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(MySQLStatementParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(MySQLStatementParser.RenameUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 */
	void enterSetDefaultRole(MySQLStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 */
	void exitSetDefaultRole(MySQLStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setRole}.
	 * @param ctx the parse tree
	 */
	void enterSetRole(MySQLStatementParser.SetRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setRole}.
	 * @param ctx the parse tree
	 */
	void exitSetRole(MySQLStatementParser.SetRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setPassword}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(MySQLStatementParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setPassword}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(MySQLStatementParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#authOption}.
	 * @param ctx the parse tree
	 */
	void enterAuthOption(MySQLStatementParser.AuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#authOption}.
	 * @param ctx the parse tree
	 */
	void exitAuthOption(MySQLStatementParser.AuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void enterWithGrantOption(MySQLStatementParser.WithGrantOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void exitWithGrantOption(MySQLStatementParser.WithGrantOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userOrRoles}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoles(MySQLStatementParser.UserOrRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userOrRoles}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoles(MySQLStatementParser.UserOrRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#roles}.
	 * @param ctx the parse tree
	 */
	void enterRoles(MySQLStatementParser.RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#roles}.
	 * @param ctx the parse tree
	 */
	void exitRoles(MySQLStatementParser.RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#grantAs}.
	 * @param ctx the parse tree
	 */
	void enterGrantAs(MySQLStatementParser.GrantAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#grantAs}.
	 * @param ctx the parse tree
	 */
	void exitGrantAs(MySQLStatementParser.GrantAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#withRoles}.
	 * @param ctx the parse tree
	 */
	void enterWithRoles(MySQLStatementParser.WithRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#withRoles}.
	 * @param ctx the parse tree
	 */
	void exitWithRoles(MySQLStatementParser.WithRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterUserAuthOption(MySQLStatementParser.UserAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitUserAuthOption(MySQLStatementParser.UserAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifiedBy}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiedBy(MySQLStatementParser.IdentifiedByContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifiedBy}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiedBy(MySQLStatementParser.IdentifiedByContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifiedWith}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiedWith(MySQLStatementParser.IdentifiedWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifiedWith}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiedWith(MySQLStatementParser.IdentifiedWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#connectOption}.
	 * @param ctx the parse tree
	 */
	void enterConnectOption(MySQLStatementParser.ConnectOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#connectOption}.
	 * @param ctx the parse tree
	 */
	void exitConnectOption(MySQLStatementParser.ConnectOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption(MySQLStatementParser.TlsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption(MySQLStatementParser.TlsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userFuncAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterUserFuncAuthOption(MySQLStatementParser.UserFuncAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userFuncAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitUserFuncAuthOption(MySQLStatementParser.UserFuncAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#change}.
	 * @param ctx the parse tree
	 */
	void enterChange(MySQLStatementParser.ChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#change}.
	 * @param ctx the parse tree
	 */
	void exitChange(MySQLStatementParser.ChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 */
	void enterChangeMasterTo(MySQLStatementParser.ChangeMasterToContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 */
	void exitChangeMasterTo(MySQLStatementParser.ChangeMasterToContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationFilter(MySQLStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationFilter(MySQLStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#changeReplicationSourceTo}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationSourceTo(MySQLStatementParser.ChangeReplicationSourceToContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#changeReplicationSourceTo}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationSourceTo(MySQLStatementParser.ChangeReplicationSourceToContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(MySQLStatementParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(MySQLStatementParser.StartSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(MySQLStatementParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(MySQLStatementParser.StopSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#startReplica}.
	 * @param ctx the parse tree
	 */
	void enterStartReplica(MySQLStatementParser.StartReplicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#startReplica}.
	 * @param ctx the parse tree
	 */
	void exitStartReplica(MySQLStatementParser.StartReplicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupReplication}.
	 * @param ctx the parse tree
	 */
	void enterGroupReplication(MySQLStatementParser.GroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupReplication}.
	 * @param ctx the parse tree
	 */
	void exitGroupReplication(MySQLStatementParser.GroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStartGroupReplication(MySQLStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStartGroupReplication(MySQLStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStopGroupReplication(MySQLStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStopGroupReplication(MySQLStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#purgeBinaryLog}.
	 * @param ctx the parse tree
	 */
	void enterPurgeBinaryLog(MySQLStatementParser.PurgeBinaryLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#purgeBinaryLog}.
	 * @param ctx the parse tree
	 */
	void exitPurgeBinaryLog(MySQLStatementParser.PurgeBinaryLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#threadTypes}.
	 * @param ctx the parse tree
	 */
	void enterThreadTypes(MySQLStatementParser.ThreadTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#threadTypes}.
	 * @param ctx the parse tree
	 */
	void exitThreadTypes(MySQLStatementParser.ThreadTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#threadType}.
	 * @param ctx the parse tree
	 */
	void enterThreadType(MySQLStatementParser.ThreadTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#threadType}.
	 * @param ctx the parse tree
	 */
	void exitThreadType(MySQLStatementParser.ThreadTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#utilOption}.
	 * @param ctx the parse tree
	 */
	void enterUtilOption(MySQLStatementParser.UtilOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#utilOption}.
	 * @param ctx the parse tree
	 */
	void exitUtilOption(MySQLStatementParser.UtilOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#connectionOptions}.
	 * @param ctx the parse tree
	 */
	void enterConnectionOptions(MySQLStatementParser.ConnectionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#connectionOptions}.
	 * @param ctx the parse tree
	 */
	void exitConnectionOptions(MySQLStatementParser.ConnectionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#masterDefs}.
	 * @param ctx the parse tree
	 */
	void enterMasterDefs(MySQLStatementParser.MasterDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#masterDefs}.
	 * @param ctx the parse tree
	 */
	void exitMasterDefs(MySQLStatementParser.MasterDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#masterDef}.
	 * @param ctx the parse tree
	 */
	void enterMasterDef(MySQLStatementParser.MasterDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#masterDef}.
	 * @param ctx the parse tree
	 */
	void exitMasterDef(MySQLStatementParser.MasterDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ignoreServerIds}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreServerIds(MySQLStatementParser.IgnoreServerIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ignoreServerIds}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreServerIds(MySQLStatementParser.IgnoreServerIdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ignoreServerId}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreServerId(MySQLStatementParser.IgnoreServerIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ignoreServerId}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreServerId(MySQLStatementParser.IgnoreServerIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#filterDefs}.
	 * @param ctx the parse tree
	 */
	void enterFilterDefs(MySQLStatementParser.FilterDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#filterDefs}.
	 * @param ctx the parse tree
	 */
	void exitFilterDefs(MySQLStatementParser.FilterDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#filterDef}.
	 * @param ctx the parse tree
	 */
	void enterFilterDef(MySQLStatementParser.FilterDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#filterDef}.
	 * @param ctx the parse tree
	 */
	void exitFilterDef(MySQLStatementParser.FilterDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#wildTables}.
	 * @param ctx the parse tree
	 */
	void enterWildTables(MySQLStatementParser.WildTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#wildTables}.
	 * @param ctx the parse tree
	 */
	void exitWildTables(MySQLStatementParser.WildTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#wildTable}.
	 * @param ctx the parse tree
	 */
	void enterWildTable(MySQLStatementParser.WildTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#wildTable}.
	 * @param ctx the parse tree
	 */
	void exitWildTable(MySQLStatementParser.WildTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#changeReplicationSourceOptionDefs}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationSourceOptionDefs(MySQLStatementParser.ChangeReplicationSourceOptionDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#changeReplicationSourceOptionDefs}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationSourceOptionDefs(MySQLStatementParser.ChangeReplicationSourceOptionDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#changeReplicationSourceOption}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationSourceOption(MySQLStatementParser.ChangeReplicationSourceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#changeReplicationSourceOption}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationSourceOption(MySQLStatementParser.ChangeReplicationSourceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tablePrimaryKeyCheckDef}.
	 * @param ctx the parse tree
	 */
	void enterTablePrimaryKeyCheckDef(MySQLStatementParser.TablePrimaryKeyCheckDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tablePrimaryKeyCheckDef}.
	 * @param ctx the parse tree
	 */
	void exitTablePrimaryKeyCheckDef(MySQLStatementParser.TablePrimaryKeyCheckDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignGtidsToAnonymousTransactionsDef}.
	 * @param ctx the parse tree
	 */
	void enterAssignGtidsToAnonymousTransactionsDef(MySQLStatementParser.AssignGtidsToAnonymousTransactionsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignGtidsToAnonymousTransactionsDef}.
	 * @param ctx the parse tree
	 */
	void exitAssignGtidsToAnonymousTransactionsDef(MySQLStatementParser.AssignGtidsToAnonymousTransactionsDefContext ctx);
}