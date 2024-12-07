// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/doris/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/DorisStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DorisStatementParser}.
 */
public interface DorisStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(DorisStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(DorisStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatement(DorisStatementParser.AlterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatement(DorisStatementParser.AlterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(DorisStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(DorisStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#duplicatekeyClause}.
	 * @param ctx the parse tree
	 */
	void enterDuplicatekeyClause(DorisStatementParser.DuplicatekeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#duplicatekeyClause}.
	 * @param ctx the parse tree
	 */
	void exitDuplicatekeyClause(DorisStatementParser.DuplicatekeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#commentClause}.
	 * @param ctx the parse tree
	 */
	void enterCommentClause(DorisStatementParser.CommentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#commentClause}.
	 * @param ctx the parse tree
	 */
	void exitCommentClause(DorisStatementParser.CommentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#distributedbyClause}.
	 * @param ctx the parse tree
	 */
	void enterDistributedbyClause(DorisStatementParser.DistributedbyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#distributedbyClause}.
	 * @param ctx the parse tree
	 */
	void exitDistributedbyClause(DorisStatementParser.DistributedbyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#propertiesClause}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesClause(DorisStatementParser.PropertiesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#propertiesClause}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesClause(DorisStatementParser.PropertiesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(DorisStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(DorisStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DorisStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DorisStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(DorisStatementParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(DorisStatementParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(DorisStatementParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(DorisStatementParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionTypeDef}.
	 * @param ctx the parse tree
	 */
	void enterPartitionTypeDef(DorisStatementParser.PartitionTypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionTypeDef}.
	 * @param ctx the parse tree
	 */
	void exitPartitionTypeDef(DorisStatementParser.PartitionTypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#subPartitions}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitions(DorisStatementParser.SubPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#subPartitions}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitions(DorisStatementParser.SubPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionKeyAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterPartitionKeyAlgorithm(DorisStatementParser.PartitionKeyAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionKeyAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitPartitionKeyAlgorithm(DorisStatementParser.PartitionKeyAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateAsQueryExpression(DorisStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateAsQueryExpression(DorisStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(DorisStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(DorisStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#standaloneAlterTableAction}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneAlterTableAction(DorisStatementParser.StandaloneAlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#standaloneAlterTableAction}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneAlterTableAction(DorisStatementParser.StandaloneAlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableActions(DorisStatementParser.AlterTableActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableActions(DorisStatementParser.AlterTableActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterTablePartitionOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablePartitionOptions(DorisStatementParser.AlterTablePartitionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterTablePartitionOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablePartitionOptions(DorisStatementParser.AlterTablePartitionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 */
	void enterAlterCommandList(DorisStatementParser.AlterCommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 */
	void exitAlterCommandList(DorisStatementParser.AlterCommandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterList}.
	 * @param ctx the parse tree
	 */
	void enterAlterList(DorisStatementParser.AlterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterList}.
	 * @param ctx the parse tree
	 */
	void exitAlterList(DorisStatementParser.AlterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTableOptionsSpaceSeparated}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableOptionsSpaceSeparated(DorisStatementParser.CreateTableOptionsSpaceSeparatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTableOptionsSpaceSeparated}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableOptionsSpaceSeparated(DorisStatementParser.CreateTableOptionsSpaceSeparatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(DorisStatementParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(DorisStatementParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAddTableConstraint(DorisStatementParser.AddTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAddTableConstraint(DorisStatementParser.AddTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumn(DorisStatementParser.ChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumn(DorisStatementParser.ChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumn(DorisStatementParser.ModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumn(DorisStatementParser.ModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDrop(DorisStatementParser.AlterTableDropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDrop(DorisStatementParser.AlterTableDropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code disableKeys}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterDisableKeys(DorisStatementParser.DisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code disableKeys}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitDisableKeys(DorisStatementParser.DisableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enableKeys}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterEnableKeys(DorisStatementParser.EnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enableKeys}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitEnableKeys(DorisStatementParser.EnableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumn(DorisStatementParser.AlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumn(DorisStatementParser.AlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterIndex}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(DorisStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterIndex}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(DorisStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterCheck}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterCheck(DorisStatementParser.AlterCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterCheck}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterCheck(DorisStatementParser.AlterCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterConstraint}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterConstraint(DorisStatementParser.AlterConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterConstraint}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterConstraint(DorisStatementParser.AlterConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumn(DorisStatementParser.RenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumn(DorisStatementParser.RenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterRenameTable(DorisStatementParser.AlterRenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterRenameTable(DorisStatementParser.AlterRenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameIndex}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterRenameIndex(DorisStatementParser.RenameIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameIndex}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitRenameIndex(DorisStatementParser.RenameIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterConvert}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterConvert(DorisStatementParser.AlterConvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterConvert}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterConvert(DorisStatementParser.AlterConvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableForce}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableForce(DorisStatementParser.AlterTableForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableForce}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableForce(DorisStatementParser.AlterTableForceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableOrder}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableOrder(DorisStatementParser.AlterTableOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableOrder}
	 * labeled alternative in {@link DorisStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableOrder(DorisStatementParser.AlterTableOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterOrderList}.
	 * @param ctx the parse tree
	 */
	void enterAlterOrderList(DorisStatementParser.AlterOrderListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterOrderList}.
	 * @param ctx the parse tree
	 */
	void exitAlterOrderList(DorisStatementParser.AlterOrderListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableConstraintDef}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintDef(DorisStatementParser.TableConstraintDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableConstraintDef}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintDef(DorisStatementParser.TableConstraintDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterCommandsModifierList}.
	 * @param ctx the parse tree
	 */
	void enterAlterCommandsModifierList(DorisStatementParser.AlterCommandsModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterCommandsModifierList}.
	 * @param ctx the parse tree
	 */
	void exitAlterCommandsModifierList(DorisStatementParser.AlterCommandsModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterCommandsModifier}.
	 * @param ctx the parse tree
	 */
	void enterAlterCommandsModifier(DorisStatementParser.AlterCommandsModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterCommandsModifier}.
	 * @param ctx the parse tree
	 */
	void exitAlterCommandsModifier(DorisStatementParser.AlterCommandsModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#withValidation}.
	 * @param ctx the parse tree
	 */
	void enterWithValidation(DorisStatementParser.WithValidationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#withValidation}.
	 * @param ctx the parse tree
	 */
	void exitWithValidation(DorisStatementParser.WithValidationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#standaloneAlterCommands}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneAlterCommands(DorisStatementParser.StandaloneAlterCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#standaloneAlterCommands}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneAlterCommands(DorisStatementParser.StandaloneAlterCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterPartition}.
	 * @param ctx the parse tree
	 */
	void enterAlterPartition(DorisStatementParser.AlterPartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterPartition}.
	 * @param ctx the parse tree
	 */
	void exitAlterPartition(DorisStatementParser.AlterPartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void enterConstraintClause(DorisStatementParser.ConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void exitConstraintClause(DorisStatementParser.ConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(DorisStatementParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(DorisStatementParser.TableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(DorisStatementParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(DorisStatementParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#restrict}.
	 * @param ctx the parse tree
	 */
	void enterRestrict(DorisStatementParser.RestrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#restrict}.
	 * @param ctx the parse tree
	 */
	void exitRestrict(DorisStatementParser.RestrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fulltextIndexOption}.
	 * @param ctx the parse tree
	 */
	void enterFulltextIndexOption(DorisStatementParser.FulltextIndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fulltextIndexOption}.
	 * @param ctx the parse tree
	 */
	void exitFulltextIndexOption(DorisStatementParser.FulltextIndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(DorisStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(DorisStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(DorisStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(DorisStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#algorithmOptionAndLockOption}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmOptionAndLockOption(DorisStatementParser.AlgorithmOptionAndLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#algorithmOptionAndLockOption}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmOptionAndLockOption(DorisStatementParser.AlgorithmOptionAndLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterAlgorithmOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterAlgorithmOption(DorisStatementParser.AlterAlgorithmOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterAlgorithmOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterAlgorithmOption(DorisStatementParser.AlterAlgorithmOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterLockOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterLockOption(DorisStatementParser.AlterLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterLockOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterLockOption(DorisStatementParser.AlterLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(DorisStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(DorisStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(DorisStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(DorisStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(DorisStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(DorisStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(DorisStatementParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(DorisStatementParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification_(DorisStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification_(DorisStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseSpecification_(DorisStatementParser.AlterDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseSpecification_(DorisStatementParser.AlterDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(DorisStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(DorisStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(DorisStatementParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(DorisStatementParser.AlterInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAction(DorisStatementParser.InstanceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAction(DorisStatementParser.InstanceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#channel}.
	 * @param ctx the parse tree
	 */
	void enterChannel(DorisStatementParser.ChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#channel}.
	 * @param ctx the parse tree
	 */
	void exitChannel(DorisStatementParser.ChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(DorisStatementParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(DorisStatementParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(DorisStatementParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(DorisStatementParser.AlterEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(DorisStatementParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(DorisStatementParser.DropEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(DorisStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(DorisStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(DorisStatementParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(DorisStatementParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(DorisStatementParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(DorisStatementParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(DorisStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(DorisStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(DorisStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(DorisStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(DorisStatementParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(DorisStatementParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(DorisStatementParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(DorisStatementParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(DorisStatementParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(DorisStatementParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(DorisStatementParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(DorisStatementParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(DorisStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(DorisStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(DorisStatementParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(DorisStatementParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(DorisStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(DorisStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespace(DorisStatementParser.CreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespace(DorisStatementParser.CreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(DorisStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(DorisStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(DorisStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(DorisStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTablespaceInnodbAndNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodbAndNdb(DorisStatementParser.CreateTablespaceInnodbAndNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTablespaceInnodbAndNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodbAndNdb(DorisStatementParser.CreateTablespaceInnodbAndNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(DorisStatementParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(DorisStatementParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespaceNdb(DorisStatementParser.AlterTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespaceNdb(DorisStatementParser.AlterTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespaceInnodb(DorisStatementParser.AlterTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespaceInnodb(DorisStatementParser.AlterTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(DorisStatementParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(DorisStatementParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(DorisStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(DorisStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(DorisStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(DorisStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(DorisStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(DorisStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(DorisStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(DorisStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(DorisStatementParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(DorisStatementParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(DorisStatementParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(DorisStatementParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(DorisStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(DorisStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(DorisStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(DorisStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(DorisStatementParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(DorisStatementParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#columnAttribute}.
	 * @param ctx the parse tree
	 */
	void enterColumnAttribute(DorisStatementParser.ColumnAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#columnAttribute}.
	 * @param ctx the parse tree
	 */
	void exitColumnAttribute(DorisStatementParser.ColumnAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraint(DorisStatementParser.CheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraint(DorisStatementParser.CheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#constraintEnforcement}.
	 * @param ctx the parse tree
	 */
	void enterConstraintEnforcement(DorisStatementParser.ConstraintEnforcementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#constraintEnforcement}.
	 * @param ctx the parse tree
	 */
	void exitConstraintEnforcement(DorisStatementParser.ConstraintEnforcementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedOption(DorisStatementParser.GeneratedOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedOption(DorisStatementParser.GeneratedOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(DorisStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(DorisStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#onUpdateDelete}.
	 * @param ctx the parse tree
	 */
	void enterOnUpdateDelete(DorisStatementParser.OnUpdateDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#onUpdateDelete}.
	 * @param ctx the parse tree
	 */
	void exitOnUpdateDelete(DorisStatementParser.OnUpdateDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption(DorisStatementParser.ReferenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption(DorisStatementParser.ReferenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(DorisStatementParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(DorisStatementParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexTypeClause(DorisStatementParser.IndexTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexTypeClause(DorisStatementParser.IndexTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#keyParts}.
	 * @param ctx the parse tree
	 */
	void enterKeyParts(DorisStatementParser.KeyPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#keyParts}.
	 * @param ctx the parse tree
	 */
	void exitKeyParts(DorisStatementParser.KeyPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#keyPart}.
	 * @param ctx the parse tree
	 */
	void enterKeyPart(DorisStatementParser.KeyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#keyPart}.
	 * @param ctx the parse tree
	 */
	void exitKeyPart(DorisStatementParser.KeyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#keyPartWithExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyPartWithExpression(DorisStatementParser.KeyPartWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#keyPartWithExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyPartWithExpression(DorisStatementParser.KeyPartWithExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#keyListWithExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyListWithExpression(DorisStatementParser.KeyListWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#keyListWithExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyListWithExpression(DorisStatementParser.KeyListWithExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(DorisStatementParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(DorisStatementParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#commonIndexOption}.
	 * @param ctx the parse tree
	 */
	void enterCommonIndexOption(DorisStatementParser.CommonIndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#commonIndexOption}.
	 * @param ctx the parse tree
	 */
	void exitCommonIndexOption(DorisStatementParser.CommonIndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(DorisStatementParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(DorisStatementParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLikeClause(DorisStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLikeClause(DorisStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification(DorisStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification(DorisStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTableOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableOptions(DorisStatementParser.CreateTableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTableOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableOptions(DorisStatementParser.CreateTableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableOption(DorisStatementParser.CreateTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableOption(DorisStatementParser.CreateTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createSRSStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSRSStatement(DorisStatementParser.CreateSRSStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createSRSStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSRSStatement(DorisStatementParser.CreateSRSStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropSRSStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropSRSStatement(DorisStatementParser.DropSRSStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropSRSStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropSRSStatement(DorisStatementParser.DropSRSStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#srsAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSrsAttribute(DorisStatementParser.SrsAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#srsAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSrsAttribute(DorisStatementParser.SrsAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(DorisStatementParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(DorisStatementParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(DorisStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(DorisStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinition(DorisStatementParser.PartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinition(DorisStatementParser.PartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionLessThanValue}.
	 * @param ctx the parse tree
	 */
	void enterPartitionLessThanValue(DorisStatementParser.PartitionLessThanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionLessThanValue}.
	 * @param ctx the parse tree
	 */
	void exitPartitionLessThanValue(DorisStatementParser.PartitionLessThanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionValueList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionValueList(DorisStatementParser.PartitionValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionValueList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionValueList(DorisStatementParser.PartitionValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitionOption(DorisStatementParser.PartitionDefinitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitionOption(DorisStatementParser.PartitionDefinitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(DorisStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(DorisStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(DorisStatementParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(DorisStatementParser.OwnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterScheduleExpression(DorisStatementParser.ScheduleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitScheduleExpression(DorisStatementParser.ScheduleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(DorisStatementParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(DorisStatementParser.TimestampValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(DorisStatementParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(DorisStatementParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void enterServerOption(DorisStatementParser.ServerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void exitServerOption(DorisStatementParser.ServerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineOption(DorisStatementParser.RoutineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineOption(DorisStatementParser.RoutineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(DorisStatementParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(DorisStatementParser.ProcedureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(DorisStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(DorisStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(DorisStatementParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(DorisStatementParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(DorisStatementParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(DorisStatementParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#validStatement}.
	 * @param ctx the parse tree
	 */
	void enterValidStatement(DorisStatementParser.ValidStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#validStatement}.
	 * @param ctx the parse tree
	 */
	void exitValidStatement(DorisStatementParser.ValidStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeginStatement(DorisStatementParser.BeginStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeginStatement(DorisStatementParser.BeginStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStatement(DorisStatementParser.DeclareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStatement(DorisStatementParser.DeclareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlowControlStatement(DorisStatementParser.FlowControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlowControlStatement(DorisStatementParser.FlowControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(DorisStatementParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(DorisStatementParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DorisStatementParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DorisStatementParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(DorisStatementParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(DorisStatementParser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(DorisStatementParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(DorisStatementParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(DorisStatementParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(DorisStatementParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(DorisStatementParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(DorisStatementParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(DorisStatementParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(DorisStatementParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(DorisStatementParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(DorisStatementParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorStatement(DorisStatementParser.CursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorStatement(DorisStatementParser.CursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorCloseStatement(DorisStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorCloseStatement(DorisStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cursorDeclareStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorDeclareStatement(DorisStatementParser.CursorDeclareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cursorDeclareStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorDeclareStatement(DorisStatementParser.CursorDeclareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cursorFetchStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorFetchStatement(DorisStatementParser.CursorFetchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cursorFetchStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorFetchStatement(DorisStatementParser.CursorFetchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorOpenStatement(DorisStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorOpenStatement(DorisStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#conditionHandlingStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionHandlingStatement(DorisStatementParser.ConditionHandlingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#conditionHandlingStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionHandlingStatement(DorisStatementParser.ConditionHandlingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#declareConditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareConditionStatement(DorisStatementParser.DeclareConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#declareConditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareConditionStatement(DorisStatementParser.DeclareConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#declareHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandlerStatement(DorisStatementParser.DeclareHandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#declareHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandlerStatement(DorisStatementParser.DeclareHandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void enterGetDiagnosticsStatement(DorisStatementParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void exitGetDiagnosticsStatement(DorisStatementParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#statementInformationItem}.
	 * @param ctx the parse tree
	 */
	void enterStatementInformationItem(DorisStatementParser.StatementInformationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#statementInformationItem}.
	 * @param ctx the parse tree
	 */
	void exitStatementInformationItem(DorisStatementParser.StatementInformationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#conditionInformationItem}.
	 * @param ctx the parse tree
	 */
	void enterConditionInformationItem(DorisStatementParser.ConditionInformationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#conditionInformationItem}.
	 * @param ctx the parse tree
	 */
	void exitConditionInformationItem(DorisStatementParser.ConditionInformationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#conditionNumber}.
	 * @param ctx the parse tree
	 */
	void enterConditionNumber(DorisStatementParser.ConditionNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#conditionNumber}.
	 * @param ctx the parse tree
	 */
	void exitConditionNumber(DorisStatementParser.ConditionNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 */
	void enterStatementInformationItemName(DorisStatementParser.StatementInformationItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 */
	void exitStatementInformationItemName(DorisStatementParser.StatementInformationItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void enterConditionInformationItemName(DorisStatementParser.ConditionInformationItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void exitConditionInformationItemName(DorisStatementParser.ConditionInformationItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#handlerAction}.
	 * @param ctx the parse tree
	 */
	void enterHandlerAction(DorisStatementParser.HandlerActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#handlerAction}.
	 * @param ctx the parse tree
	 */
	void exitHandlerAction(DorisStatementParser.HandlerActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#conditionValue}.
	 * @param ctx the parse tree
	 */
	void enterConditionValue(DorisStatementParser.ConditionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#conditionValue}.
	 * @param ctx the parse tree
	 */
	void exitConditionValue(DorisStatementParser.ConditionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void enterResignalStatement(DorisStatementParser.ResignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void exitResignalStatement(DorisStatementParser.ResignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(DorisStatementParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(DorisStatementParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#signalInformationItem}.
	 * @param ctx the parse tree
	 */
	void enterSignalInformationItem(DorisStatementParser.SignalInformationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#signalInformationItem}.
	 * @param ctx the parse tree
	 */
	void exitSignalInformationItem(DorisStatementParser.SignalInformationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void enterPrepare(DorisStatementParser.PrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void exitPrepare(DorisStatementParser.PrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(DorisStatementParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(DorisStatementParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#executeVarList}.
	 * @param ctx the parse tree
	 */
	void enterExecuteVarList(DorisStatementParser.ExecuteVarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#executeVarList}.
	 * @param ctx the parse tree
	 */
	void exitExecuteVarList(DorisStatementParser.ExecuteVarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate(DorisStatementParser.DeallocateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate(DorisStatementParser.DeallocateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(DorisStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(DorisStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void enterInsertSpecification(DorisStatementParser.InsertSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void exitInsertSpecification(DorisStatementParser.InsertSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(DorisStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(DorisStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(DorisStatementParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(DorisStatementParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInsertIdentifier(DorisStatementParser.InsertIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInsertIdentifier(DorisStatementParser.InsertIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void enterTableWild(DorisStatementParser.TableWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void exitTableWild(DorisStatementParser.TableWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(DorisStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(DorisStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateKeyClause(DorisStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateKeyClause(DorisStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void enterValueReference(DorisStatementParser.ValueReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void exitValueReference(DorisStatementParser.ValueReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void enterDerivedColumns(DorisStatementParser.DerivedColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void exitDerivedColumns(DorisStatementParser.DerivedColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(DorisStatementParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(DorisStatementParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterReplaceSpecification(DorisStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitReplaceSpecification(DorisStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterReplaceValuesClause(DorisStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitReplaceValuesClause(DorisStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterReplaceSelectClause(DorisStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitReplaceSelectClause(DorisStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(DorisStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(DorisStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(DorisStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(DorisStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DorisStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DorisStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(DorisStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(DorisStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(DorisStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(DorisStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(DorisStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(DorisStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(DorisStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(DorisStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(DorisStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(DorisStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification(DorisStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification(DorisStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(DorisStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(DorisStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(DorisStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(DorisStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(DorisStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(DorisStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithInto(DorisStatementParser.SelectWithIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithInto(DorisStatementParser.SelectWithIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(DorisStatementParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(DorisStatementParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionBody(DorisStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionBody(DorisStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(DorisStatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(DorisStatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionParens(DorisStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionParens(DorisStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimary(DorisStatementParser.QueryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimary(DorisStatementParser.QueryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(DorisStatementParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(DorisStatementParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(DorisStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(DorisStatementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(DorisStatementParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(DorisStatementParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(DorisStatementParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(DorisStatementParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(DorisStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(DorisStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(DorisStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(DorisStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(DorisStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(DorisStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(DorisStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(DorisStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(DorisStatementParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(DorisStatementParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadStatement(DorisStatementParser.LoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadStatement(DorisStatementParser.LoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(DorisStatementParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(DorisStatementParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(DorisStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(DorisStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void enterTableStatement(DorisStatementParser.TableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void exitTableStatement(DorisStatementParser.TableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableValueConstructor(DorisStatementParser.TableValueConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableValueConstructor(DorisStatementParser.TableValueConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructorList(DorisStatementParser.RowConstructorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructorList(DorisStatementParser.RowConstructorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(DorisStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(DorisStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void enterCteClause(DorisStatementParser.CteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void exitCteClause(DorisStatementParser.CteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(DorisStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(DorisStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(DorisStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(DorisStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(DorisStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(DorisStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(DorisStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(DorisStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(DorisStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(DorisStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(DorisStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(DorisStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DorisStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DorisStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(DorisStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(DorisStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(DorisStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(DorisStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(DorisStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(DorisStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(DorisStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(DorisStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames(DorisStatementParser.PartitionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames(DorisStatementParser.PartitionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintList(DorisStatementParser.IndexHintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintList(DorisStatementParser.IndexHintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(DorisStatementParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(DorisStatementParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexHintClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintClause(DorisStatementParser.IndexHintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexHintClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintClause(DorisStatementParser.IndexHintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexNameList}.
	 * @param ctx the parse tree
	 */
	void enterIndexNameList(DorisStatementParser.IndexNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexNameList}.
	 * @param ctx the parse tree
	 */
	void exitIndexNameList(DorisStatementParser.IndexNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(DorisStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(DorisStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinType(DorisStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinType(DorisStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinType(DorisStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinType(DorisStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinType(DorisStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinType(DorisStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(DorisStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(DorisStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(DorisStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(DorisStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(DorisStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(DorisStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(DorisStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(DorisStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(DorisStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(DorisStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(DorisStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(DorisStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(DorisStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(DorisStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(DorisStatementParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(DorisStatementParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void enterWindowItem(DorisStatementParser.WindowItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void exitWindowItem(DorisStatementParser.WindowItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(DorisStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(DorisStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(DorisStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(DorisStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(DorisStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(DorisStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoExpression(DorisStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoExpression(DorisStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(DorisStatementParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(DorisStatementParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void enterLockClauseList(DorisStatementParser.LockClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void exitLockClauseList(DorisStatementParser.LockClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void enterLockStrength(DorisStatementParser.LockStrengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void exitLockStrength(DorisStatementParser.LockStrengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void enterLockedRowAction(DorisStatementParser.LockedRowActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void exitLockedRowAction(DorisStatementParser.LockedRowActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void enterTableLockingList(DorisStatementParser.TableLockingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void exitTableLockingList(DorisStatementParser.TableLockingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentOptWild(DorisStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentOptWild(DorisStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void enterTableAliasRefList(DorisStatementParser.TableAliasRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void exitTableAliasRefList(DorisStatementParser.TableAliasRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(DorisStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(DorisStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCustomKeyword(DorisStatementParser.CustomKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCustomKeyword(DorisStatementParser.CustomKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(DorisStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(DorisStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(DorisStatementParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(DorisStatementParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(DorisStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(DorisStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(DorisStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(DorisStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterTemporalLiterals(DorisStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitTemporalLiterals(DorisStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(DorisStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(DorisStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(DorisStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(DorisStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(DorisStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(DorisStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(DorisStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(DorisStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(DorisStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(DorisStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DorisStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DorisStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsUnambiguous(DorisStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsUnambiguous(DorisStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous1RolesAndLabels(DorisStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous1RolesAndLabels(DorisStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous2Labels(DorisStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous2Labels(DorisStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous3Roles(DorisStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous3Roles(DorisStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous4SystemVariables(DorisStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous4SystemVariables(DorisStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTextOrIdentifier(DorisStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTextOrIdentifier(DorisStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(DorisStatementParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(DorisStatementParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DorisStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DorisStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(DorisStatementParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(DorisStatementParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(DorisStatementParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(DorisStatementParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterRvalueSystemVariable(DorisStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitRvalueSystemVariable(DorisStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariable(DorisStatementParser.SetSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariable(DorisStatementParser.SetSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionType(DorisStatementParser.OptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionType(DorisStatementParser.OptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariableName(DorisStatementParser.InternalVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariableName(DorisStatementParser.InternalVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterSetExprOrDefault(DorisStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitSetExprOrDefault(DorisStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristics(DorisStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristics(DorisStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(DorisStatementParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(DorisStatementParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void enterIsolationTypes(DorisStatementParser.IsolationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void exitIsolationTypes(DorisStatementParser.IsolationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(DorisStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(DorisStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(DorisStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(DorisStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#databaseNames}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseNames(DorisStatementParser.DatabaseNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#databaseNames}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseNames(DorisStatementParser.DatabaseNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(DorisStatementParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(DorisStatementParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#databasePairs}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePairs(DorisStatementParser.DatabasePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#databasePairs}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePairs(DorisStatementParser.DatabasePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#databasePair}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePair(DorisStatementParser.DatabasePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#databasePair}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePair(DorisStatementParser.DatabasePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DorisStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DorisStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DorisStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DorisStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(DorisStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(DorisStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(DorisStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(DorisStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void enterOldColumn(DorisStatementParser.OldColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void exitOldColumn(DorisStatementParser.OldColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void enterNewColumn(DorisStatementParser.NewColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void exitNewColumn(DorisStatementParser.NewColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void enterDelimiterName(DorisStatementParser.DelimiterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void exitDelimiterName(DorisStatementParser.DelimiterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterUserIdentifierOrText(DorisStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitUserIdentifierOrText(DorisStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(DorisStatementParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(DorisStatementParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(DorisStatementParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(DorisStatementParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(DorisStatementParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(DorisStatementParser.ServerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void enterWrapperName(DorisStatementParser.WrapperNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void exitWrapperName(DorisStatementParser.WrapperNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(DorisStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(DorisStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(DorisStatementParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(DorisStatementParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(DorisStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(DorisStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(DorisStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(DorisStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(DorisStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(DorisStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DorisStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DorisStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(DorisStatementParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(DorisStatementParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void enterViewNames(DorisStatementParser.ViewNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void exitViewNames(DorisStatementParser.ViewNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(DorisStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(DorisStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(DorisStatementParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(DorisStatementParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(DorisStatementParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(DorisStatementParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void enterShardLibraryName(DorisStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void exitShardLibraryName(DorisStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(DorisStatementParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(DorisStatementParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(DorisStatementParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(DorisStatementParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(DorisStatementParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(DorisStatementParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(DorisStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(DorisStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void enterCloneInstance(DorisStatementParser.CloneInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void exitCloneInstance(DorisStatementParser.CloneInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void enterCloneDir(DorisStatementParser.CloneDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void exitCloneDir(DorisStatementParser.CloneDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(DorisStatementParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(DorisStatementParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void enterLogName(DorisStatementParser.LogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void exitLogName(DorisStatementParser.LogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(DorisStatementParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(DorisStatementParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterRoleIdentifierOrText(DorisStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitRoleIdentifierOrText(DorisStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void enterEngineRef(DorisStatementParser.EngineRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void exitEngineRef(DorisStatementParser.EngineRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(DorisStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(DorisStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTime(DorisStatementParser.TriggerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTime(DorisStatementParser.TriggerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void enterTableOrTables(DorisStatementParser.TableOrTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void exitTableOrTables(DorisStatementParser.TableOrTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRole(DorisStatementParser.UserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRole(DorisStatementParser.UserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(DorisStatementParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(DorisStatementParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(DorisStatementParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(DorisStatementParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void enterAllOrPartitionNameList(DorisStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void exitAllOrPartitionNameList(DorisStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(DorisStatementParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(DorisStatementParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOrder(DorisStatementParser.TriggerOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOrder(DorisStatementParser.TriggerOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DorisStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DorisStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(DorisStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(DorisStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(DorisStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(DorisStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(DorisStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(DorisStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(DorisStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(DorisStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(DorisStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(DorisStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(DorisStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(DorisStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DorisStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DorisStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(DorisStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(DorisStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(DorisStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(DorisStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(DorisStatementParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(DorisStatementParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void enterOnEmptyError(DorisStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void exitOnEmptyError(DorisStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(DorisStatementParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(DorisStatementParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnRefList(DorisStatementParser.ColumnRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnRefList(DorisStatementParser.ColumnRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DorisStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DorisStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunction(DorisStatementParser.UdfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunction(DorisStatementParser.UdfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(DorisStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(DorisStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#bitwiseFunction}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseFunction(DorisStatementParser.BitwiseFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#bitwiseFunction}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseFunction(DorisStatementParser.BitwiseFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunction(DorisStatementParser.JsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunction(DorisStatementParser.JsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#jsonTableFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableFunction(DorisStatementParser.JsonTableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#jsonTableFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableFunction(DorisStatementParser.JsonTableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#jsonTableColumns}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableColumns(DorisStatementParser.JsonTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#jsonTableColumns}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableColumns(DorisStatementParser.JsonTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 */
	void enterJsonTableColumn(DorisStatementParser.JsonTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 */
	void exitJsonTableColumn(DorisStatementParser.JsonTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunctionName(DorisStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunctionName(DorisStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(DorisStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(DorisStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#bitwiseBinaryFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseBinaryFunctionName(DorisStatementParser.BitwiseBinaryFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#bitwiseBinaryFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseBinaryFunctionName(DorisStatementParser.BitwiseBinaryFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(DorisStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(DorisStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(DorisStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(DorisStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(DorisStatementParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(DorisStatementParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(DorisStatementParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(DorisStatementParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(DorisStatementParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(DorisStatementParser.FrameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd(DorisStatementParser.FrameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd(DorisStatementParser.FrameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(DorisStatementParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(DorisStatementParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(DorisStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(DorisStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUserFunction(DorisStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUserFunction(DorisStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupingFunction(DorisStatementParser.GroupingFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupingFunction(DorisStatementParser.GroupingFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#timeStampDiffFunction}.
	 * @param ctx the parse tree
	 */
	void enterTimeStampDiffFunction(DorisStatementParser.TimeStampDiffFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#timeStampDiffFunction}.
	 * @param ctx the parse tree
	 */
	void exitTimeStampDiffFunction(DorisStatementParser.TimeStampDiffFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcatFunction(DorisStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcatFunction(DorisStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#instrFunction}.
	 * @param ctx the parse tree
	 */
	void enterInstrFunction(DorisStatementParser.InstrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#instrFunction}.
	 * @param ctx the parse tree
	 */
	void exitInstrFunction(DorisStatementParser.InstrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(DorisStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(DorisStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(DorisStatementParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(DorisStatementParser.WindowingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void enterLeadLagInfo(DorisStatementParser.LeadLagInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void exitLeadLagInfo(DorisStatementParser.LeadLagInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(DorisStatementParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(DorisStatementParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(DorisStatementParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(DorisStatementParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void enterRepairType(DorisStatementParser.RepairTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void exitRepairType(DorisStatementParser.RepairTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(DorisStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(DorisStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(DorisStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(DorisStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(DorisStatementParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(DorisStatementParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(DorisStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(DorisStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(DorisStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(DorisStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(DorisStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(DorisStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(DorisStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(DorisStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(DorisStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(DorisStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunction(DorisStatementParser.ValuesFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunction(DorisStatementParser.ValuesFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightStringFunction(DorisStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightStringFunction(DorisStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void enterLevelClause(DorisStatementParser.LevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void exitLevelClause(DorisStatementParser.LevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(DorisStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(DorisStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(DorisStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(DorisStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterShorthandRegularFunction(DorisStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitShorthandRegularFunction(DorisStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterCompleteRegularFunction(DorisStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitCompleteRegularFunction(DorisStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#indexAlias}.
	 * @param ctx the parse tree
	 */
	void enterIndexAlias(DorisStatementParser.IndexAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#indexAlias}.
	 * @param ctx the parse tree
	 */
	void exitIndexAlias(DorisStatementParser.IndexAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(DorisStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(DorisStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(DorisStatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(DorisStatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void enterMatchSearchModifier(DorisStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void exitMatchSearchModifier(DorisStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(DorisStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(DorisStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeExpr(DorisStatementParser.DatetimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeExpr(DorisStatementParser.DatetimeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogFileIndexNumber(DorisStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogFileIndexNumber(DorisStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(DorisStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(DorisStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(DorisStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(DorisStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(DorisStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(DorisStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(DorisStatementParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(DorisStatementParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(DorisStatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(DorisStatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(DorisStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(DorisStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(DorisStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(DorisStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(DorisStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(DorisStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(DorisStatementParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(DorisStatementParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void enterTextString(DorisStatementParser.TextStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void exitTextString(DorisStatementParser.TextStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void enterTextStringHash(DorisStatementParser.TextStringHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void exitTextStringHash(DorisStatementParser.TextStringHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void enterFieldOptions(DorisStatementParser.FieldOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void exitFieldOptions(DorisStatementParser.FieldOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(DorisStatementParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(DorisStatementParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterTypeDatetimePrecision(DorisStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitTypeDatetimePrecision(DorisStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void enterCharsetWithOptBinary(DorisStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void exitCharsetWithOptBinary(DorisStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void enterAscii(DorisStatementParser.AsciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void exitAscii(DorisStatementParser.AsciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void enterUnicode(DorisStatementParser.UnicodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void exitUnicode(DorisStatementParser.UnicodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(DorisStatementParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(DorisStatementParser.CharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCollation(DorisStatementParser.DefaultCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCollation(DorisStatementParser.DefaultCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultEncryption(DorisStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultEncryption(DorisStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCharset(DorisStatementParser.DefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCharset(DorisStatementParser.DefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void enterNow(DorisStatementParser.NowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void exitNow(DorisStatementParser.NowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void enterColumnFormat(DorisStatementParser.ColumnFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void exitColumnFormat(DorisStatementParser.ColumnFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void enterStorageMedia(DorisStatementParser.StorageMediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void exitStorageMedia(DorisStatementParser.StorageMediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(DorisStatementParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(DorisStatementParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void enterKeyOrIndex(DorisStatementParser.KeyOrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void exitKeyOrIndex(DorisStatementParser.KeyOrIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(DorisStatementParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(DorisStatementParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(DorisStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(DorisStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(DorisStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(DorisStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrVarSpec(DorisStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrVarSpec(DorisStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(DorisStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(DorisStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(DorisStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(DorisStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void enterConnectionId(DorisStatementParser.ConnectionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void exitConnectionId(DorisStatementParser.ConnectionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(DorisStatementParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(DorisStatementParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(DorisStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(DorisStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(DorisStatementParser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(DorisStatementParser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void enterCombineOption(DorisStatementParser.CombineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void exitCombineOption(DorisStatementParser.CombineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void enterNoWriteToBinLog(DorisStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void exitNoWriteToBinLog(DorisStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(DorisStatementParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(DorisStatementParser.ChannelOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(DorisStatementParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(DorisStatementParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(DorisStatementParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(DorisStatementParser.HelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(DorisStatementParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(DorisStatementParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fromDatabase}.
	 * @param ctx the parse tree
	 */
	void enterFromDatabase(DorisStatementParser.FromDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fromDatabase}.
	 * @param ctx the parse tree
	 */
	void exitFromDatabase(DorisStatementParser.FromDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(DorisStatementParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(DorisStatementParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void enterShowLike(DorisStatementParser.ShowLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void exitShowLike(DorisStatementParser.ShowLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterShowWhereClause(DorisStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitShowWhereClause(DorisStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(DorisStatementParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(DorisStatementParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(DorisStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(DorisStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(DorisStatementParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(DorisStatementParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 */
	void enterOptionValueList(DorisStatementParser.OptionValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 */
	void exitOptionValueList(DorisStatementParser.OptionValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionValueNoOptionType(DorisStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionValueNoOptionType(DorisStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(DorisStatementParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(DorisStatementParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#optionValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionValue(DorisStatementParser.OptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#optionValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionValue(DorisStatementParser.OptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterShowBinaryLogs(DorisStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitShowBinaryLogs(DorisStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowBinlogEvents(DorisStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowBinlogEvents(DorisStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void enterShowCharacterSet(DorisStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void exitShowCharacterSet(DorisStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void enterShowCollation(DorisStatementParser.ShowCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void exitShowCollation(DorisStatementParser.ShowCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(DorisStatementParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(DorisStatementParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDatabase(DorisStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDatabase(DorisStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateEvent(DorisStatementParser.ShowCreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateEvent(DorisStatementParser.ShowCreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFunction(DorisStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFunction(DorisStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateProcedure(DorisStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateProcedure(DorisStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(DorisStatementParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(DorisStatementParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTrigger(DorisStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTrigger(DorisStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(DorisStatementParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(DorisStatementParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateView(DorisStatementParser.ShowCreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateView(DorisStatementParser.ShowCreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(DorisStatementParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(DorisStatementParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(DorisStatementParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(DorisStatementParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void enterShowEngines(DorisStatementParser.ShowEnginesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void exitShowEngines(DorisStatementParser.ShowEnginesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(DorisStatementParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(DorisStatementParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowEvents(DorisStatementParser.ShowEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowEvents(DorisStatementParser.ShowEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionCode(DorisStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionCode(DorisStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionStatus(DorisStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionStatus(DorisStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showGrants}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(DorisStatementParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showGrants}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(DorisStatementParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void enterShowIndex(DorisStatementParser.ShowIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void exitShowIndex(DorisStatementParser.ShowIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterStatus(DorisStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterStatus(DorisStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(DorisStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(DorisStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowPlugins(DorisStatementParser.ShowPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowPlugins(DorisStatementParser.ShowPluginsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterShowPrivileges(DorisStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitShowPrivileges(DorisStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureCode(DorisStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureCode(DorisStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureStatus(DorisStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureStatus(DorisStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void enterShowProcesslist(DorisStatementParser.ShowProcesslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void exitShowProcesslist(DorisStatementParser.ShowProcesslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(DorisStatementParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(DorisStatementParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void enterShowProfiles(DorisStatementParser.ShowProfilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void exitShowProfiles(DorisStatementParser.ShowProfilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowRelaylogEvent(DorisStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowRelaylogEvent(DorisStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 */
	void enterShowReplicas(DorisStatementParser.ShowReplicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 */
	void exitShowReplicas(DorisStatementParser.ShowReplicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveHosts(DorisStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveHosts(DorisStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowReplicaStatus(DorisStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowReplicaStatus(DorisStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(DorisStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(DorisStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowStatus(DorisStatementParser.ShowStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowStatus(DorisStatementParser.ShowStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowTableStatus(DorisStatementParser.ShowTableStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowTableStatus(DorisStatementParser.ShowTableStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(DorisStatementParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(DorisStatementParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 */
	void enterShowTriggers(DorisStatementParser.ShowTriggersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 */
	void exitShowTriggers(DorisStatementParser.ShowTriggersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void enterShowVariables(DorisStatementParser.ShowVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void exitShowVariables(DorisStatementParser.ShowVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void enterShowWarnings(DorisStatementParser.ShowWarningsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void exitShowWarnings(DorisStatementParser.ShowWarningsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#showCharset}.
	 * @param ctx the parse tree
	 */
	void enterShowCharset(DorisStatementParser.ShowCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#showCharset}.
	 * @param ctx the parse tree
	 */
	void exitShowCharset(DorisStatementParser.ShowCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void enterSetCharacter(DorisStatementParser.SetCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void exitSetCharacter(DorisStatementParser.SetCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void enterClone(DorisStatementParser.CloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void exitClone(DorisStatementParser.CloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 */
	void enterCloneAction(DorisStatementParser.CloneActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 */
	void exitCloneAction(DorisStatementParser.CloneActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoadableFunction(DorisStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoadableFunction(DorisStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#install}.
	 * @param ctx the parse tree
	 */
	void enterInstall(DorisStatementParser.InstallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#install}.
	 * @param ctx the parse tree
	 */
	void exitInstall(DorisStatementParser.InstallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#uninstall}.
	 * @param ctx the parse tree
	 */
	void enterUninstall(DorisStatementParser.UninstallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#uninstall}.
	 * @param ctx the parse tree
	 */
	void exitUninstall(DorisStatementParser.UninstallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void enterInstallComponent(DorisStatementParser.InstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void exitInstallComponent(DorisStatementParser.InstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(DorisStatementParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(DorisStatementParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void enterUninstallComponent(DorisStatementParser.UninstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void exitUninstallComponent(DorisStatementParser.UninstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(DorisStatementParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(DorisStatementParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(DorisStatementParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(DorisStatementParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#histogram}.
	 * @param ctx the parse tree
	 */
	void enterHistogram(DorisStatementParser.HistogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#histogram}.
	 * @param ctx the parse tree
	 */
	void exitHistogram(DorisStatementParser.HistogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(DorisStatementParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(DorisStatementParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(DorisStatementParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(DorisStatementParser.CheckTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(DorisStatementParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(DorisStatementParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(DorisStatementParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(DorisStatementParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(DorisStatementParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(DorisStatementParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterResourceGroup(DorisStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterResourceGroup(DorisStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 */
	void enterVcpuSpec(DorisStatementParser.VcpuSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 */
	void exitVcpuSpec(DorisStatementParser.VcpuSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateResourceGroup(DorisStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateResourceGroup(DorisStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropResourceGroup(DorisStatementParser.DropResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropResourceGroup(DorisStatementParser.DropResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterSetResourceGroup(DorisStatementParser.SetResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitSetResourceGroup(DorisStatementParser.SetResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void enterBinlog(DorisStatementParser.BinlogContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void exitBinlog(DorisStatementParser.BinlogContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndex(DorisStatementParser.CacheIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndex(DorisStatementParser.CacheIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 */
	void enterCacheTableIndexList(DorisStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 */
	void exitCacheTableIndexList(DorisStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionList(DorisStatementParser.PartitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionList(DorisStatementParser.PartitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void enterFlush(DorisStatementParser.FlushContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void exitFlush(DorisStatementParser.FlushContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushOption(DorisStatementParser.FlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushOption(DorisStatementParser.FlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 */
	void enterTablesOption(DorisStatementParser.TablesOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 */
	void exitTablesOption(DorisStatementParser.TablesOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void enterKill(DorisStatementParser.KillContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void exitKill(DorisStatementParser.KillContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexInfo(DorisStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexInfo(DorisStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 */
	void enterLoadTableIndexList(DorisStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 */
	void exitLoadTableIndexList(DorisStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(DorisStatementParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(DorisStatementParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#resetOption}.
	 * @param ctx the parse tree
	 */
	void enterResetOption(DorisStatementParser.ResetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#resetOption}.
	 * @param ctx the parse tree
	 */
	void exitResetOption(DorisStatementParser.ResetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void enterResetPersist(DorisStatementParser.ResetPersistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void exitResetPersist(DorisStatementParser.ResetPersistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void enterRestart(DorisStatementParser.RestartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void exitRestart(DorisStatementParser.RestartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void enterShutdown(DorisStatementParser.ShutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void exitShutdown(DorisStatementParser.ShutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#explainType}.
	 * @param ctx the parse tree
	 */
	void enterExplainType(DorisStatementParser.ExplainTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#explainType}.
	 * @param ctx the parse tree
	 */
	void exitExplainType(DorisStatementParser.ExplainTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStatement(DorisStatementParser.ExplainableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStatement(DorisStatementParser.ExplainableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#formatName}.
	 * @param ctx the parse tree
	 */
	void enterFormatName(DorisStatementParser.FormatNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#formatName}.
	 * @param ctx the parse tree
	 */
	void exitFormatName(DorisStatementParser.FormatNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void enterDelimiter(DorisStatementParser.DelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void exitDelimiter(DorisStatementParser.DelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(DorisStatementParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(DorisStatementParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(DorisStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(DorisStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 */
	void enterSetAutoCommit(DorisStatementParser.SetAutoCommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 */
	void exitSetAutoCommit(DorisStatementParser.SetAutoCommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(DorisStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(DorisStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#transactionCharacteristic}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristic(DorisStatementParser.TransactionCharacteristicContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#transactionCharacteristic}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristic(DorisStatementParser.TransactionCharacteristicContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(DorisStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(DorisStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(DorisStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(DorisStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(DorisStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(DorisStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(DorisStatementParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(DorisStatementParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void enterLock(DorisStatementParser.LockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void exitLock(DorisStatementParser.LockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#unlock}.
	 * @param ctx the parse tree
	 */
	void enterUnlock(DorisStatementParser.UnlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#unlock}.
	 * @param ctx the parse tree
	 */
	void exitUnlock(DorisStatementParser.UnlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void enterReleaseSavepoint(DorisStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void exitReleaseSavepoint(DorisStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#optionChain}.
	 * @param ctx the parse tree
	 */
	void enterOptionChain(DorisStatementParser.OptionChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#optionChain}.
	 * @param ctx the parse tree
	 */
	void exitOptionChain(DorisStatementParser.OptionChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#optionRelease}.
	 * @param ctx the parse tree
	 */
	void enterOptionRelease(DorisStatementParser.OptionReleaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#optionRelease}.
	 * @param ctx the parse tree
	 */
	void exitOptionRelease(DorisStatementParser.OptionReleaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tableLock}.
	 * @param ctx the parse tree
	 */
	void enterTableLock(DorisStatementParser.TableLockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tableLock}.
	 * @param ctx the parse tree
	 */
	void exitTableLock(DorisStatementParser.TableLockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#lockOption}.
	 * @param ctx the parse tree
	 */
	void enterLockOption(DorisStatementParser.LockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#lockOption}.
	 * @param ctx the parse tree
	 */
	void exitLockOption(DorisStatementParser.LockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#xaBegin}.
	 * @param ctx the parse tree
	 */
	void enterXaBegin(DorisStatementParser.XaBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#xaBegin}.
	 * @param ctx the parse tree
	 */
	void exitXaBegin(DorisStatementParser.XaBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#xaPrepare}.
	 * @param ctx the parse tree
	 */
	void enterXaPrepare(DorisStatementParser.XaPrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#xaPrepare}.
	 * @param ctx the parse tree
	 */
	void exitXaPrepare(DorisStatementParser.XaPrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#xaCommit}.
	 * @param ctx the parse tree
	 */
	void enterXaCommit(DorisStatementParser.XaCommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#xaCommit}.
	 * @param ctx the parse tree
	 */
	void exitXaCommit(DorisStatementParser.XaCommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#xaRollback}.
	 * @param ctx the parse tree
	 */
	void enterXaRollback(DorisStatementParser.XaRollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#xaRollback}.
	 * @param ctx the parse tree
	 */
	void exitXaRollback(DorisStatementParser.XaRollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#xaEnd}.
	 * @param ctx the parse tree
	 */
	void enterXaEnd(DorisStatementParser.XaEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#xaEnd}.
	 * @param ctx the parse tree
	 */
	void exitXaEnd(DorisStatementParser.XaEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#xaRecovery}.
	 * @param ctx the parse tree
	 */
	void enterXaRecovery(DorisStatementParser.XaRecoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#xaRecovery}.
	 * @param ctx the parse tree
	 */
	void exitXaRecovery(DorisStatementParser.XaRecoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#xid}.
	 * @param ctx the parse tree
	 */
	void enterXid(DorisStatementParser.XidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#xid}.
	 * @param ctx the parse tree
	 */
	void exitXid(DorisStatementParser.XidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantRoleOrPrivilegeTo}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrantRoleOrPrivilegeTo(DorisStatementParser.GrantRoleOrPrivilegeToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantRoleOrPrivilegeTo}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrantRoleOrPrivilegeTo(DorisStatementParser.GrantRoleOrPrivilegeToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantRoleOrPrivilegeOnTo}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrantRoleOrPrivilegeOnTo(DorisStatementParser.GrantRoleOrPrivilegeOnToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantRoleOrPrivilegeOnTo}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrantRoleOrPrivilegeOnTo(DorisStatementParser.GrantRoleOrPrivilegeOnToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantProxy}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrantProxy(DorisStatementParser.GrantProxyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantProxy}
	 * labeled alternative in {@link DorisStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrantProxy(DorisStatementParser.GrantProxyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code revokeFrom}
	 * labeled alternative in {@link DorisStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevokeFrom(DorisStatementParser.RevokeFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code revokeFrom}
	 * labeled alternative in {@link DorisStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevokeFrom(DorisStatementParser.RevokeFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code revokeOnFrom}
	 * labeled alternative in {@link DorisStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevokeOnFrom(DorisStatementParser.RevokeOnFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code revokeOnFrom}
	 * labeled alternative in {@link DorisStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevokeOnFrom(DorisStatementParser.RevokeOnFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#userList}.
	 * @param ctx the parse tree
	 */
	void enterUserList(DorisStatementParser.UserListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#userList}.
	 * @param ctx the parse tree
	 */
	void exitUserList(DorisStatementParser.UserListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#roleOrPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterRoleOrPrivileges(DorisStatementParser.RoleOrPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#roleOrPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitRoleOrPrivileges(DorisStatementParser.RoleOrPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleOrDynamicPrivilege}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterRoleOrDynamicPrivilege(DorisStatementParser.RoleOrDynamicPrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleOrDynamicPrivilege}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitRoleOrDynamicPrivilege(DorisStatementParser.RoleOrDynamicPrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleAtHost}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterRoleAtHost(DorisStatementParser.RoleAtHostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleAtHost}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitRoleAtHost(DorisStatementParser.RoleAtHostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeSelect}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeSelect(DorisStatementParser.StaticPrivilegeSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeSelect}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeSelect(DorisStatementParser.StaticPrivilegeSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeInsert}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeInsert(DorisStatementParser.StaticPrivilegeInsertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeInsert}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeInsert(DorisStatementParser.StaticPrivilegeInsertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeUpdate}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeUpdate(DorisStatementParser.StaticPrivilegeUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeUpdate}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeUpdate(DorisStatementParser.StaticPrivilegeUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReferences}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReferences(DorisStatementParser.StaticPrivilegeReferencesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReferences}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReferences(DorisStatementParser.StaticPrivilegeReferencesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeDelete}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeDelete(DorisStatementParser.StaticPrivilegeDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeDelete}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeDelete(DorisStatementParser.StaticPrivilegeDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeUsage}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeUsage(DorisStatementParser.StaticPrivilegeUsageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeUsage}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeUsage(DorisStatementParser.StaticPrivilegeUsageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeIndex}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeIndex(DorisStatementParser.StaticPrivilegeIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeIndex}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeIndex(DorisStatementParser.StaticPrivilegeIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeAlter}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeAlter(DorisStatementParser.StaticPrivilegeAlterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeAlter}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeAlter(DorisStatementParser.StaticPrivilegeAlterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreate}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreate(DorisStatementParser.StaticPrivilegeCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreate}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreate(DorisStatementParser.StaticPrivilegeCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeDrop}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeDrop(DorisStatementParser.StaticPrivilegeDropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeDrop}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeDrop(DorisStatementParser.StaticPrivilegeDropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeExecute}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeExecute(DorisStatementParser.StaticPrivilegeExecuteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeExecute}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeExecute(DorisStatementParser.StaticPrivilegeExecuteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReload}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReload(DorisStatementParser.StaticPrivilegeReloadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReload}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReload(DorisStatementParser.StaticPrivilegeReloadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeShutdown}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeShutdown(DorisStatementParser.StaticPrivilegeShutdownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeShutdown}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeShutdown(DorisStatementParser.StaticPrivilegeShutdownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeProcess}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeProcess(DorisStatementParser.StaticPrivilegeProcessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeProcess}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeProcess(DorisStatementParser.StaticPrivilegeProcessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeFile}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeFile(DorisStatementParser.StaticPrivilegeFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeFile}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeFile(DorisStatementParser.StaticPrivilegeFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeGrant}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeGrant(DorisStatementParser.StaticPrivilegeGrantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeGrant}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeGrant(DorisStatementParser.StaticPrivilegeGrantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeShowDatabases}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeShowDatabases(DorisStatementParser.StaticPrivilegeShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeShowDatabases}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeShowDatabases(DorisStatementParser.StaticPrivilegeShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeSuper}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeSuper(DorisStatementParser.StaticPrivilegeSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeSuper}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeSuper(DorisStatementParser.StaticPrivilegeSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateTemporaryTables}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateTemporaryTables(DorisStatementParser.StaticPrivilegeCreateTemporaryTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateTemporaryTables}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateTemporaryTables(DorisStatementParser.StaticPrivilegeCreateTemporaryTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeLockTables}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeLockTables(DorisStatementParser.StaticPrivilegeLockTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeLockTables}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeLockTables(DorisStatementParser.StaticPrivilegeLockTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReplicationSlave}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReplicationSlave(DorisStatementParser.StaticPrivilegeReplicationSlaveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReplicationSlave}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReplicationSlave(DorisStatementParser.StaticPrivilegeReplicationSlaveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeReplicationClient}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeReplicationClient(DorisStatementParser.StaticPrivilegeReplicationClientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeReplicationClient}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeReplicationClient(DorisStatementParser.StaticPrivilegeReplicationClientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateView}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateView(DorisStatementParser.StaticPrivilegeCreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateView}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateView(DorisStatementParser.StaticPrivilegeCreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeShowView}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeShowView(DorisStatementParser.StaticPrivilegeShowViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeShowView}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeShowView(DorisStatementParser.StaticPrivilegeShowViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateRoutine}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateRoutine(DorisStatementParser.StaticPrivilegeCreateRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateRoutine}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateRoutine(DorisStatementParser.StaticPrivilegeCreateRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeAlterRoutine}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeAlterRoutine(DorisStatementParser.StaticPrivilegeAlterRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeAlterRoutine}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeAlterRoutine(DorisStatementParser.StaticPrivilegeAlterRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateUser}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateUser(DorisStatementParser.StaticPrivilegeCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateUser}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateUser(DorisStatementParser.StaticPrivilegeCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeEvent}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeEvent(DorisStatementParser.StaticPrivilegeEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeEvent}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeEvent(DorisStatementParser.StaticPrivilegeEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeTrigger}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeTrigger(DorisStatementParser.StaticPrivilegeTriggerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeTrigger}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeTrigger(DorisStatementParser.StaticPrivilegeTriggerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateTablespace}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateTablespace(DorisStatementParser.StaticPrivilegeCreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateTablespace}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateTablespace(DorisStatementParser.StaticPrivilegeCreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeCreateRole}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeCreateRole(DorisStatementParser.StaticPrivilegeCreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeCreateRole}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeCreateRole(DorisStatementParser.StaticPrivilegeCreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticPrivilegeDropRole}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterStaticPrivilegeDropRole(DorisStatementParser.StaticPrivilegeDropRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticPrivilegeDropRole}
	 * labeled alternative in {@link DorisStatementParser#roleOrPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitStaticPrivilegeDropRole(DorisStatementParser.StaticPrivilegeDropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#aclType}.
	 * @param ctx the parse tree
	 */
	void enterAclType(DorisStatementParser.AclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#aclType}.
	 * @param ctx the parse tree
	 */
	void exitAclType(DorisStatementParser.AclTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantLevelGlobal}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGrantLevelGlobal(DorisStatementParser.GrantLevelGlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantLevelGlobal}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGrantLevelGlobal(DorisStatementParser.GrantLevelGlobalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantLevelDatabaseGlobal}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGrantLevelDatabaseGlobal(DorisStatementParser.GrantLevelDatabaseGlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantLevelDatabaseGlobal}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGrantLevelDatabaseGlobal(DorisStatementParser.GrantLevelDatabaseGlobalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantLevelTable}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGrantLevelTable(DorisStatementParser.GrantLevelTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantLevelTable}
	 * labeled alternative in {@link DorisStatementParser#grantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGrantLevelTable(DorisStatementParser.GrantLevelTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(DorisStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(DorisStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createUserOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserOption(DorisStatementParser.CreateUserOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createUserOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserOption(DorisStatementParser.CreateUserOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserEntryNoOption}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserEntryNoOption(DorisStatementParser.CreateUserEntryNoOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserEntryNoOption}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserEntryNoOption(DorisStatementParser.CreateUserEntryNoOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserEntryIdentifiedBy}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserEntryIdentifiedBy(DorisStatementParser.CreateUserEntryIdentifiedByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserEntryIdentifiedBy}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserEntryIdentifiedBy(DorisStatementParser.CreateUserEntryIdentifiedByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserEntryIdentifiedWith}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserEntryIdentifiedWith(DorisStatementParser.CreateUserEntryIdentifiedWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserEntryIdentifiedWith}
	 * labeled alternative in {@link DorisStatementParser#createUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserEntryIdentifiedWith(DorisStatementParser.CreateUserEntryIdentifiedWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createUserList}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserList(DorisStatementParser.CreateUserListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createUserList}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserList(DorisStatementParser.CreateUserListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#defaultRoleClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultRoleClause(DorisStatementParser.DefaultRoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#defaultRoleClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultRoleClause(DorisStatementParser.DefaultRoleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#requireClause}.
	 * @param ctx the parse tree
	 */
	void enterRequireClause(DorisStatementParser.RequireClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#requireClause}.
	 * @param ctx the parse tree
	 */
	void exitRequireClause(DorisStatementParser.RequireClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#connectOptions}.
	 * @param ctx the parse tree
	 */
	void enterConnectOptions(DorisStatementParser.ConnectOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#connectOptions}.
	 * @param ctx the parse tree
	 */
	void exitConnectOptions(DorisStatementParser.ConnectOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#accountLockPasswordExpireOptions}.
	 * @param ctx the parse tree
	 */
	void enterAccountLockPasswordExpireOptions(DorisStatementParser.AccountLockPasswordExpireOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#accountLockPasswordExpireOptions}.
	 * @param ctx the parse tree
	 */
	void exitAccountLockPasswordExpireOptions(DorisStatementParser.AccountLockPasswordExpireOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#accountLockPasswordExpireOption}.
	 * @param ctx the parse tree
	 */
	void enterAccountLockPasswordExpireOption(DorisStatementParser.AccountLockPasswordExpireOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#accountLockPasswordExpireOption}.
	 * @param ctx the parse tree
	 */
	void exitAccountLockPasswordExpireOption(DorisStatementParser.AccountLockPasswordExpireOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(DorisStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(DorisStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterUserEntry}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserEntry(DorisStatementParser.AlterUserEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterUserEntry}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserEntry(DorisStatementParser.AlterUserEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterUserList}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserList(DorisStatementParser.AlterUserListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterUserList}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserList(DorisStatementParser.AlterUserListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperation(DorisStatementParser.AlterOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperation(DorisStatementParser.AlterOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#factoryOperation}.
	 * @param ctx the parse tree
	 */
	void enterFactoryOperation(DorisStatementParser.FactoryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#factoryOperation}.
	 * @param ctx the parse tree
	 */
	void exitFactoryOperation(DorisStatementParser.FactoryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#authentication_fido}.
	 * @param ctx the parse tree
	 */
	void enterAuthentication_fido(DorisStatementParser.Authentication_fidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#authentication_fido}.
	 * @param ctx the parse tree
	 */
	void exitAuthentication_fido(DorisStatementParser.Authentication_fidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(DorisStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(DorisStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(DorisStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(DorisStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(DorisStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(DorisStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(DorisStatementParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(DorisStatementParser.RenameUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 */
	void enterSetDefaultRole(DorisStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 */
	void exitSetDefaultRole(DorisStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setRole}.
	 * @param ctx the parse tree
	 */
	void enterSetRole(DorisStatementParser.SetRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setRole}.
	 * @param ctx the parse tree
	 */
	void exitSetRole(DorisStatementParser.SetRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#setPassword}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(DorisStatementParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#setPassword}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(DorisStatementParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#authOption}.
	 * @param ctx the parse tree
	 */
	void enterAuthOption(DorisStatementParser.AuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#authOption}.
	 * @param ctx the parse tree
	 */
	void exitAuthOption(DorisStatementParser.AuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void enterWithGrantOption(DorisStatementParser.WithGrantOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void exitWithGrantOption(DorisStatementParser.WithGrantOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#userOrRoles}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoles(DorisStatementParser.UserOrRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#userOrRoles}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoles(DorisStatementParser.UserOrRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#roles}.
	 * @param ctx the parse tree
	 */
	void enterRoles(DorisStatementParser.RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#roles}.
	 * @param ctx the parse tree
	 */
	void exitRoles(DorisStatementParser.RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#grantAs}.
	 * @param ctx the parse tree
	 */
	void enterGrantAs(DorisStatementParser.GrantAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#grantAs}.
	 * @param ctx the parse tree
	 */
	void exitGrantAs(DorisStatementParser.GrantAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#withRoles}.
	 * @param ctx the parse tree
	 */
	void enterWithRoles(DorisStatementParser.WithRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#withRoles}.
	 * @param ctx the parse tree
	 */
	void exitWithRoles(DorisStatementParser.WithRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterUserAuthOption(DorisStatementParser.UserAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitUserAuthOption(DorisStatementParser.UserAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifiedBy}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiedBy(DorisStatementParser.IdentifiedByContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifiedBy}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiedBy(DorisStatementParser.IdentifiedByContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#identifiedWith}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiedWith(DorisStatementParser.IdentifiedWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#identifiedWith}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiedWith(DorisStatementParser.IdentifiedWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#connectOption}.
	 * @param ctx the parse tree
	 */
	void enterConnectOption(DorisStatementParser.ConnectOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#connectOption}.
	 * @param ctx the parse tree
	 */
	void exitConnectOption(DorisStatementParser.ConnectOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption(DorisStatementParser.TlsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption(DorisStatementParser.TlsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#userFuncAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterUserFuncAuthOption(DorisStatementParser.UserFuncAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#userFuncAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitUserFuncAuthOption(DorisStatementParser.UserFuncAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#change}.
	 * @param ctx the parse tree
	 */
	void enterChange(DorisStatementParser.ChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#change}.
	 * @param ctx the parse tree
	 */
	void exitChange(DorisStatementParser.ChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 */
	void enterChangeMasterTo(DorisStatementParser.ChangeMasterToContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 */
	void exitChangeMasterTo(DorisStatementParser.ChangeMasterToContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationFilter(DorisStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationFilter(DorisStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#changeReplicationSourceTo}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationSourceTo(DorisStatementParser.ChangeReplicationSourceToContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#changeReplicationSourceTo}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationSourceTo(DorisStatementParser.ChangeReplicationSourceToContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(DorisStatementParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(DorisStatementParser.StartSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(DorisStatementParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(DorisStatementParser.StopSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#startReplica}.
	 * @param ctx the parse tree
	 */
	void enterStartReplica(DorisStatementParser.StartReplicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#startReplica}.
	 * @param ctx the parse tree
	 */
	void exitStartReplica(DorisStatementParser.StartReplicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#groupReplication}.
	 * @param ctx the parse tree
	 */
	void enterGroupReplication(DorisStatementParser.GroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#groupReplication}.
	 * @param ctx the parse tree
	 */
	void exitGroupReplication(DorisStatementParser.GroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStartGroupReplication(DorisStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStartGroupReplication(DorisStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStopGroupReplication(DorisStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStopGroupReplication(DorisStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#purgeBinaryLog}.
	 * @param ctx the parse tree
	 */
	void enterPurgeBinaryLog(DorisStatementParser.PurgeBinaryLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#purgeBinaryLog}.
	 * @param ctx the parse tree
	 */
	void exitPurgeBinaryLog(DorisStatementParser.PurgeBinaryLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#threadTypes}.
	 * @param ctx the parse tree
	 */
	void enterThreadTypes(DorisStatementParser.ThreadTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#threadTypes}.
	 * @param ctx the parse tree
	 */
	void exitThreadTypes(DorisStatementParser.ThreadTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#threadType}.
	 * @param ctx the parse tree
	 */
	void enterThreadType(DorisStatementParser.ThreadTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#threadType}.
	 * @param ctx the parse tree
	 */
	void exitThreadType(DorisStatementParser.ThreadTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#utilOption}.
	 * @param ctx the parse tree
	 */
	void enterUtilOption(DorisStatementParser.UtilOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#utilOption}.
	 * @param ctx the parse tree
	 */
	void exitUtilOption(DorisStatementParser.UtilOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#connectionOptions}.
	 * @param ctx the parse tree
	 */
	void enterConnectionOptions(DorisStatementParser.ConnectionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#connectionOptions}.
	 * @param ctx the parse tree
	 */
	void exitConnectionOptions(DorisStatementParser.ConnectionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#masterDefs}.
	 * @param ctx the parse tree
	 */
	void enterMasterDefs(DorisStatementParser.MasterDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#masterDefs}.
	 * @param ctx the parse tree
	 */
	void exitMasterDefs(DorisStatementParser.MasterDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#masterDef}.
	 * @param ctx the parse tree
	 */
	void enterMasterDef(DorisStatementParser.MasterDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#masterDef}.
	 * @param ctx the parse tree
	 */
	void exitMasterDef(DorisStatementParser.MasterDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ignoreServerIds}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreServerIds(DorisStatementParser.IgnoreServerIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ignoreServerIds}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreServerIds(DorisStatementParser.IgnoreServerIdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#ignoreServerId}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreServerId(DorisStatementParser.IgnoreServerIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#ignoreServerId}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreServerId(DorisStatementParser.IgnoreServerIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#filterDefs}.
	 * @param ctx the parse tree
	 */
	void enterFilterDefs(DorisStatementParser.FilterDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#filterDefs}.
	 * @param ctx the parse tree
	 */
	void exitFilterDefs(DorisStatementParser.FilterDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#filterDef}.
	 * @param ctx the parse tree
	 */
	void enterFilterDef(DorisStatementParser.FilterDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#filterDef}.
	 * @param ctx the parse tree
	 */
	void exitFilterDef(DorisStatementParser.FilterDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#wildTables}.
	 * @param ctx the parse tree
	 */
	void enterWildTables(DorisStatementParser.WildTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#wildTables}.
	 * @param ctx the parse tree
	 */
	void exitWildTables(DorisStatementParser.WildTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#wildTable}.
	 * @param ctx the parse tree
	 */
	void enterWildTable(DorisStatementParser.WildTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#wildTable}.
	 * @param ctx the parse tree
	 */
	void exitWildTable(DorisStatementParser.WildTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#changeReplicationSourceOptionDefs}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationSourceOptionDefs(DorisStatementParser.ChangeReplicationSourceOptionDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#changeReplicationSourceOptionDefs}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationSourceOptionDefs(DorisStatementParser.ChangeReplicationSourceOptionDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#changeReplicationSourceOption}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationSourceOption(DorisStatementParser.ChangeReplicationSourceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#changeReplicationSourceOption}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationSourceOption(DorisStatementParser.ChangeReplicationSourceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#tablePrimaryKeyCheckDef}.
	 * @param ctx the parse tree
	 */
	void enterTablePrimaryKeyCheckDef(DorisStatementParser.TablePrimaryKeyCheckDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#tablePrimaryKeyCheckDef}.
	 * @param ctx the parse tree
	 */
	void exitTablePrimaryKeyCheckDef(DorisStatementParser.TablePrimaryKeyCheckDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisStatementParser#assignGtidsToAnonymousTransactionsDef}.
	 * @param ctx the parse tree
	 */
	void enterAssignGtidsToAnonymousTransactionsDef(DorisStatementParser.AssignGtidsToAnonymousTransactionsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisStatementParser#assignGtidsToAnonymousTransactionsDef}.
	 * @param ctx the parse tree
	 */
	void exitAssignGtidsToAnonymousTransactionsDef(DorisStatementParser.AssignGtidsToAnonymousTransactionsDefContext ctx);
}