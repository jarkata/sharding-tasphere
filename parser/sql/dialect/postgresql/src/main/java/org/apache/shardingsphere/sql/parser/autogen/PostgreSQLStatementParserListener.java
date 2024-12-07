// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/postgresql/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/PostgreSQLStatementParser.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostgreSQLStatementParser}.
 */
public interface PostgreSQLStatementParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(PostgreSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(PostgreSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(PostgreSQLStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(PostgreSQLStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(PostgreSQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(PostgreSQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(PostgreSQLStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(PostgreSQLStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(PostgreSQLStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(PostgreSQLStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#abort}.
	 * @param ctx the parse tree
	 */
	void enterAbort(PostgreSQLStatementParser.AbortContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#abort}.
	 * @param ctx the parse tree
	 */
	void exitAbort(PostgreSQLStatementParser.AbortContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(PostgreSQLStatementParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(PostgreSQLStatementParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(PostgreSQLStatementParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(PostgreSQLStatementParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(PostgreSQLStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(PostgreSQLStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void enterReleaseSavepoint(PostgreSQLStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void exitReleaseSavepoint(PostgreSQLStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rollbackToSavepoint}.
	 * @param ctx the parse tree
	 */
	void enterRollbackToSavepoint(PostgreSQLStatementParser.RollbackToSavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rollbackToSavepoint}.
	 * @param ctx the parse tree
	 */
	void exitRollbackToSavepoint(PostgreSQLStatementParser.RollbackToSavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#commitPrepared}.
	 * @param ctx the parse tree
	 */
	void enterCommitPrepared(PostgreSQLStatementParser.CommitPreparedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#commitPrepared}.
	 * @param ctx the parse tree
	 */
	void exitCommitPrepared(PostgreSQLStatementParser.CommitPreparedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rollbackPrepared}.
	 * @param ctx the parse tree
	 */
	void enterRollbackPrepared(PostgreSQLStatementParser.RollbackPreparedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rollbackPrepared}.
	 * @param ctx the parse tree
	 */
	void exitRollbackPrepared(PostgreSQLStatementParser.RollbackPreparedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setConstraints}.
	 * @param ctx the parse tree
	 */
	void enterSetConstraints(PostgreSQLStatementParser.SetConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setConstraints}.
	 * @param ctx the parse tree
	 */
	void exitSetConstraints(PostgreSQLStatementParser.SetConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintsSetMode}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsSetMode(PostgreSQLStatementParser.ConstraintsSetModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintsSetMode}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsSetMode(PostgreSQLStatementParser.ConstraintsSetModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintsSetList}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsSetList(PostgreSQLStatementParser.ConstraintsSetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintsSetList}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsSetList(PostgreSQLStatementParser.ConstraintsSetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void enterLock(PostgreSQLStatementParser.LockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void exitLock(PostgreSQLStatementParser.LockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#lockType}.
	 * @param ctx the parse tree
	 */
	void enterLockType(PostgreSQLStatementParser.LockTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#lockType}.
	 * @param ctx the parse tree
	 */
	void exitLockType(PostgreSQLStatementParser.LockTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#prepareTransaction}.
	 * @param ctx the parse tree
	 */
	void enterPrepareTransaction(PostgreSQLStatementParser.PrepareTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#prepareTransaction}.
	 * @param ctx the parse tree
	 */
	void exitPrepareTransaction(PostgreSQLStatementParser.PrepareTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#checkpoint}.
	 * @param ctx the parse tree
	 */
	void enterCheckpoint(PostgreSQLStatementParser.CheckpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#checkpoint}.
	 * @param ctx the parse tree
	 */
	void exitCheckpoint(PostgreSQLStatementParser.CheckpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(PostgreSQLStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(PostgreSQLStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insertTarget}.
	 * @param ctx the parse tree
	 */
	void enterInsertTarget(PostgreSQLStatementParser.InsertTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insertTarget}.
	 * @param ctx the parse tree
	 */
	void exitInsertTarget(PostgreSQLStatementParser.InsertTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insertRest}.
	 * @param ctx the parse tree
	 */
	void enterInsertRest(PostgreSQLStatementParser.InsertRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insertRest}.
	 * @param ctx the parse tree
	 */
	void exitInsertRest(PostgreSQLStatementParser.InsertRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#overrideKind}.
	 * @param ctx the parse tree
	 */
	void enterOverrideKind(PostgreSQLStatementParser.OverrideKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#overrideKind}.
	 * @param ctx the parse tree
	 */
	void exitOverrideKind(PostgreSQLStatementParser.OverrideKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnList(PostgreSQLStatementParser.InsertColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnList(PostgreSQLStatementParser.InsertColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insertColumnItem}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnItem(PostgreSQLStatementParser.InsertColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insertColumnItem}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnItem(PostgreSQLStatementParser.InsertColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optOnConflict}.
	 * @param ctx the parse tree
	 */
	void enterOptOnConflict(PostgreSQLStatementParser.OptOnConflictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optOnConflict}.
	 * @param ctx the parse tree
	 */
	void exitOptOnConflict(PostgreSQLStatementParser.OptOnConflictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optConfExpr}.
	 * @param ctx the parse tree
	 */
	void enterOptConfExpr(PostgreSQLStatementParser.OptConfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optConfExpr}.
	 * @param ctx the parse tree
	 */
	void exitOptConfExpr(PostgreSQLStatementParser.OptConfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(PostgreSQLStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(PostgreSQLStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setClauseList}.
	 * @param ctx the parse tree
	 */
	void enterSetClauseList(PostgreSQLStatementParser.SetClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setClauseList}.
	 * @param ctx the parse tree
	 */
	void exitSetClauseList(PostgreSQLStatementParser.SetClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(PostgreSQLStatementParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(PostgreSQLStatementParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setTarget}.
	 * @param ctx the parse tree
	 */
	void enterSetTarget(PostgreSQLStatementParser.SetTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setTarget}.
	 * @param ctx the parse tree
	 */
	void exitSetTarget(PostgreSQLStatementParser.SetTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setTargetList}.
	 * @param ctx the parse tree
	 */
	void enterSetTargetList(PostgreSQLStatementParser.SetTargetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setTargetList}.
	 * @param ctx the parse tree
	 */
	void exitSetTargetList(PostgreSQLStatementParser.SetTargetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void enterReturningClause(PostgreSQLStatementParser.ReturningClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void exitReturningClause(PostgreSQLStatementParser.ReturningClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(PostgreSQLStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(PostgreSQLStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#relationExprOptAlias}.
	 * @param ctx the parse tree
	 */
	void enterRelationExprOptAlias(PostgreSQLStatementParser.RelationExprOptAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#relationExprOptAlias}.
	 * @param ctx the parse tree
	 */
	void exitRelationExprOptAlias(PostgreSQLStatementParser.RelationExprOptAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingClause(PostgreSQLStatementParser.UsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingClause(PostgreSQLStatementParser.UsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(PostgreSQLStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(PostgreSQLStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectWithParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithParens(PostgreSQLStatementParser.SelectWithParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectWithParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithParens(PostgreSQLStatementParser.SelectWithParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectNoParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectNoParens(PostgreSQLStatementParser.SelectNoParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectNoParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectNoParens(PostgreSQLStatementParser.SelectNoParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectClauseN}.
	 * @param ctx the parse tree
	 */
	void enterSelectClauseN(PostgreSQLStatementParser.SelectClauseNContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectClauseN}.
	 * @param ctx the parse tree
	 */
	void exitSelectClauseN(PostgreSQLStatementParser.SelectClauseNContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#simpleSelect}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(PostgreSQLStatementParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#simpleSelect}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(PostgreSQLStatementParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(PostgreSQLStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(PostgreSQLStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(PostgreSQLStatementParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(PostgreSQLStatementParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void enterOptTempTableName(PostgreSQLStatementParser.OptTempTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void exitOptTempTableName(PostgreSQLStatementParser.OptTempTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#cteList}.
	 * @param ctx the parse tree
	 */
	void enterCteList(PostgreSQLStatementParser.CteListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#cteList}.
	 * @param ctx the parse tree
	 */
	void exitCteList(PostgreSQLStatementParser.CteListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommonTableExpr(PostgreSQLStatementParser.CommonTableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommonTableExpr(PostgreSQLStatementParser.CommonTableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optMaterialized}.
	 * @param ctx the parse tree
	 */
	void enterOptMaterialized(PostgreSQLStatementParser.OptMaterializedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optMaterialized}.
	 * @param ctx the parse tree
	 */
	void exitOptMaterialized(PostgreSQLStatementParser.OptMaterializedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optNameList}.
	 * @param ctx the parse tree
	 */
	void enterOptNameList(PostgreSQLStatementParser.OptNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optNameList}.
	 * @param ctx the parse tree
	 */
	void exitOptNameList(PostgreSQLStatementParser.OptNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void enterPreparableStmt(PostgreSQLStatementParser.PreparableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void exitPreparableStmt(PostgreSQLStatementParser.PreparableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#forLockingClause}.
	 * @param ctx the parse tree
	 */
	void enterForLockingClause(PostgreSQLStatementParser.ForLockingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#forLockingClause}.
	 * @param ctx the parse tree
	 */
	void exitForLockingClause(PostgreSQLStatementParser.ForLockingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#forLockingItems}.
	 * @param ctx the parse tree
	 */
	void enterForLockingItems(PostgreSQLStatementParser.ForLockingItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#forLockingItems}.
	 * @param ctx the parse tree
	 */
	void exitForLockingItems(PostgreSQLStatementParser.ForLockingItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#forLockingItem}.
	 * @param ctx the parse tree
	 */
	void enterForLockingItem(PostgreSQLStatementParser.ForLockingItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#forLockingItem}.
	 * @param ctx the parse tree
	 */
	void exitForLockingItem(PostgreSQLStatementParser.ForLockingItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#nowaitOrSkip}.
	 * @param ctx the parse tree
	 */
	void enterNowaitOrSkip(PostgreSQLStatementParser.NowaitOrSkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#nowaitOrSkip}.
	 * @param ctx the parse tree
	 */
	void exitNowaitOrSkip(PostgreSQLStatementParser.NowaitOrSkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#forLockingStrength}.
	 * @param ctx the parse tree
	 */
	void enterForLockingStrength(PostgreSQLStatementParser.ForLockingStrengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#forLockingStrength}.
	 * @param ctx the parse tree
	 */
	void exitForLockingStrength(PostgreSQLStatementParser.ForLockingStrengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#lockedRelsList}.
	 * @param ctx the parse tree
	 */
	void enterLockedRelsList(PostgreSQLStatementParser.LockedRelsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#lockedRelsList}.
	 * @param ctx the parse tree
	 */
	void exitLockedRelsList(PostgreSQLStatementParser.LockedRelsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(PostgreSQLStatementParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(PostgreSQLStatementParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectLimit}.
	 * @param ctx the parse tree
	 */
	void enterSelectLimit(PostgreSQLStatementParser.SelectLimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectLimit}.
	 * @param ctx the parse tree
	 */
	void exitSelectLimit(PostgreSQLStatementParser.SelectLimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void enterValuesClause(PostgreSQLStatementParser.ValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void exitValuesClause(PostgreSQLStatementParser.ValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(PostgreSQLStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(PostgreSQLStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(PostgreSQLStatementParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(PostgreSQLStatementParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectLimitValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectLimitValue(PostgreSQLStatementParser.SelectLimitValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectLimitValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectLimitValue(PostgreSQLStatementParser.SelectLimitValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectOffsetValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectOffsetValue(PostgreSQLStatementParser.SelectOffsetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectOffsetValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectOffsetValue(PostgreSQLStatementParser.SelectOffsetValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectFetchValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectFetchValue(PostgreSQLStatementParser.SelectFetchValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectFetchValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectFetchValue(PostgreSQLStatementParser.SelectFetchValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rowOrRows}.
	 * @param ctx the parse tree
	 */
	void enterRowOrRows(PostgreSQLStatementParser.RowOrRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rowOrRows}.
	 * @param ctx the parse tree
	 */
	void exitRowOrRows(PostgreSQLStatementParser.RowOrRowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#firstOrNext}.
	 * @param ctx the parse tree
	 */
	void enterFirstOrNext(PostgreSQLStatementParser.FirstOrNextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#firstOrNext}.
	 * @param ctx the parse tree
	 */
	void exitFirstOrNext(PostgreSQLStatementParser.FirstOrNextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#onlyOrWithTies}.
	 * @param ctx the parse tree
	 */
	void enterOnlyOrWithTies(PostgreSQLStatementParser.OnlyOrWithTiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#onlyOrWithTies}.
	 * @param ctx the parse tree
	 */
	void exitOnlyOrWithTies(PostgreSQLStatementParser.OnlyOrWithTiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#targetList}.
	 * @param ctx the parse tree
	 */
	void enterTargetList(PostgreSQLStatementParser.TargetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#targetList}.
	 * @param ctx the parse tree
	 */
	void exitTargetList(PostgreSQLStatementParser.TargetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#targetEl}.
	 * @param ctx the parse tree
	 */
	void enterTargetEl(PostgreSQLStatementParser.TargetElContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#targetEl}.
	 * @param ctx the parse tree
	 */
	void exitTargetEl(PostgreSQLStatementParser.TargetElContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupClause(PostgreSQLStatementParser.GroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupClause(PostgreSQLStatementParser.GroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#groupByList}.
	 * @param ctx the parse tree
	 */
	void enterGroupByList(PostgreSQLStatementParser.GroupByListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#groupByList}.
	 * @param ctx the parse tree
	 */
	void exitGroupByList(PostgreSQLStatementParser.GroupByListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(PostgreSQLStatementParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(PostgreSQLStatementParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#emptyGroupingSet}.
	 * @param ctx the parse tree
	 */
	void enterEmptyGroupingSet(PostgreSQLStatementParser.EmptyGroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#emptyGroupingSet}.
	 * @param ctx the parse tree
	 */
	void exitEmptyGroupingSet(PostgreSQLStatementParser.EmptyGroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rollupClause}.
	 * @param ctx the parse tree
	 */
	void enterRollupClause(PostgreSQLStatementParser.RollupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rollupClause}.
	 * @param ctx the parse tree
	 */
	void exitRollupClause(PostgreSQLStatementParser.RollupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#cubeClause}.
	 * @param ctx the parse tree
	 */
	void enterCubeClause(PostgreSQLStatementParser.CubeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#cubeClause}.
	 * @param ctx the parse tree
	 */
	void exitCubeClause(PostgreSQLStatementParser.CubeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#groupingSetsClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSetsClause(PostgreSQLStatementParser.GroupingSetsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#groupingSetsClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSetsClause(PostgreSQLStatementParser.GroupingSetsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(PostgreSQLStatementParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(PostgreSQLStatementParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinitionList(PostgreSQLStatementParser.WindowDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinitionList(PostgreSQLStatementParser.WindowDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition(PostgreSQLStatementParser.WindowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition(PostgreSQLStatementParser.WindowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(PostgreSQLStatementParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(PostgreSQLStatementParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#existingWindowName}.
	 * @param ctx the parse tree
	 */
	void enterExistingWindowName(PostgreSQLStatementParser.ExistingWindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#existingWindowName}.
	 * @param ctx the parse tree
	 */
	void exitExistingWindowName(PostgreSQLStatementParser.ExistingWindowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(PostgreSQLStatementParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(PostgreSQLStatementParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(PostgreSQLStatementParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(PostgreSQLStatementParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void enterFrameExtent(PostgreSQLStatementParser.FrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void exitFrameExtent(PostgreSQLStatementParser.FrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(PostgreSQLStatementParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(PostgreSQLStatementParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optWindowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void enterOptWindowExclusionClause(PostgreSQLStatementParser.OptWindowExclusionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optWindowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void exitOptWindowExclusionClause(PostgreSQLStatementParser.OptWindowExclusionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(PostgreSQLStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(PostgreSQLStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(PostgreSQLStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(PostgreSQLStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#fromList}.
	 * @param ctx the parse tree
	 */
	void enterFromList(PostgreSQLStatementParser.FromListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#fromList}.
	 * @param ctx the parse tree
	 */
	void exitFromList(PostgreSQLStatementParser.FromListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(PostgreSQLStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(PostgreSQLStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(PostgreSQLStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(PostgreSQLStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#crossJoinType}.
	 * @param ctx the parse tree
	 */
	void enterCrossJoinType(PostgreSQLStatementParser.CrossJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#crossJoinType}.
	 * @param ctx the parse tree
	 */
	void exitCrossJoinType(PostgreSQLStatementParser.CrossJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinType(PostgreSQLStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinType(PostgreSQLStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinType(PostgreSQLStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinType(PostgreSQLStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinType(PostgreSQLStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinType(PostgreSQLStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#joinOuter}.
	 * @param ctx the parse tree
	 */
	void enterJoinOuter(PostgreSQLStatementParser.JoinOuterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#joinOuter}.
	 * @param ctx the parse tree
	 */
	void exitJoinOuter(PostgreSQLStatementParser.JoinOuterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#joinQual}.
	 * @param ctx the parse tree
	 */
	void enterJoinQual(PostgreSQLStatementParser.JoinQualContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#joinQual}.
	 * @param ctx the parse tree
	 */
	void exitJoinQual(PostgreSQLStatementParser.JoinQualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(PostgreSQLStatementParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(PostgreSQLStatementParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PostgreSQLStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PostgreSQLStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#whereOrCurrentClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereOrCurrentClause(PostgreSQLStatementParser.WhereOrCurrentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#whereOrCurrentClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereOrCurrentClause(PostgreSQLStatementParser.WhereOrCurrentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(PostgreSQLStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(PostgreSQLStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(PostgreSQLStatementParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(PostgreSQLStatementParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dostmtOptList}.
	 * @param ctx the parse tree
	 */
	void enterDostmtOptList(PostgreSQLStatementParser.DostmtOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dostmtOptList}.
	 * @param ctx the parse tree
	 */
	void exitDostmtOptList(PostgreSQLStatementParser.DostmtOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dostmtOptItem}.
	 * @param ctx the parse tree
	 */
	void enterDostmtOptItem(PostgreSQLStatementParser.DostmtOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dostmtOptItem}.
	 * @param ctx the parse tree
	 */
	void exitDostmtOptItem(PostgreSQLStatementParser.DostmtOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#copy}.
	 * @param ctx the parse tree
	 */
	void enterCopy(PostgreSQLStatementParser.CopyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#copy}.
	 * @param ctx the parse tree
	 */
	void exitCopy(PostgreSQLStatementParser.CopyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#copyWithTableOrQuery}.
	 * @param ctx the parse tree
	 */
	void enterCopyWithTableOrQuery(PostgreSQLStatementParser.CopyWithTableOrQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#copyWithTableOrQuery}.
	 * @param ctx the parse tree
	 */
	void exitCopyWithTableOrQuery(PostgreSQLStatementParser.CopyWithTableOrQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#copyOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptionList(PostgreSQLStatementParser.CopyOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#copyOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptionList(PostgreSQLStatementParser.CopyOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#copyOption}.
	 * @param ctx the parse tree
	 */
	void enterCopyOption(PostgreSQLStatementParser.CopyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#copyOption}.
	 * @param ctx the parse tree
	 */
	void exitCopyOption(PostgreSQLStatementParser.CopyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#copyWithTableOrQueryBinaryCsv}.
	 * @param ctx the parse tree
	 */
	void enterCopyWithTableOrQueryBinaryCsv(PostgreSQLStatementParser.CopyWithTableOrQueryBinaryCsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#copyWithTableOrQueryBinaryCsv}.
	 * @param ctx the parse tree
	 */
	void exitCopyWithTableOrQueryBinaryCsv(PostgreSQLStatementParser.CopyWithTableOrQueryBinaryCsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#copyWithTableBinary}.
	 * @param ctx the parse tree
	 */
	void enterCopyWithTableBinary(PostgreSQLStatementParser.CopyWithTableBinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#copyWithTableBinary}.
	 * @param ctx the parse tree
	 */
	void exitCopyWithTableBinary(PostgreSQLStatementParser.CopyWithTableBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(PostgreSQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(PostgreSQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reservedKeyword}.
	 * @param ctx the parse tree
	 */
	void enterReservedKeyword(PostgreSQLStatementParser.ReservedKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reservedKeyword}.
	 * @param ctx the parse tree
	 */
	void exitReservedKeyword(PostgreSQLStatementParser.ReservedKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(PostgreSQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(PostgreSQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#literalsType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralsType(PostgreSQLStatementParser.LiteralsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#literalsType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralsType(PostgreSQLStatementParser.LiteralsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PostgreSQLStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PostgreSQLStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#uescape}.
	 * @param ctx the parse tree
	 */
	void enterUescape(PostgreSQLStatementParser.UescapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#uescape}.
	 * @param ctx the parse tree
	 */
	void exitUescape(PostgreSQLStatementParser.UescapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(PostgreSQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(PostgreSQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeFuncNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTypeFuncNameKeyword(PostgreSQLStatementParser.TypeFuncNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeFuncNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTypeFuncNameKeyword(PostgreSQLStatementParser.TypeFuncNameKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(PostgreSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(PostgreSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(PostgreSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(PostgreSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(PostgreSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(PostgreSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(PostgreSQLStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(PostgreSQLStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PostgreSQLStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PostgreSQLStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(PostgreSQLStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(PostgreSQLStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(PostgreSQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(PostgreSQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(PostgreSQLStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(PostgreSQLStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(PostgreSQLStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(PostgreSQLStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(PostgreSQLStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(PostgreSQLStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(PostgreSQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(PostgreSQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(PostgreSQLStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(PostgreSQLStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(PostgreSQLStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(PostgreSQLStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PostgreSQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PostgreSQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#patternMatchingOperator}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchingOperator(PostgreSQLStatementParser.PatternMatchingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#patternMatchingOperator}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchingOperator(PostgreSQLStatementParser.PatternMatchingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(PostgreSQLStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(PostgreSQLStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aExpr}.
	 * @param ctx the parse tree
	 */
	void enterAExpr(PostgreSQLStatementParser.AExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aExpr}.
	 * @param ctx the parse tree
	 */
	void exitAExpr(PostgreSQLStatementParser.AExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void enterBExpr(PostgreSQLStatementParser.BExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void exitBExpr(PostgreSQLStatementParser.BExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#cExpr}.
	 * @param ctx the parse tree
	 */
	void enterCExpr(PostgreSQLStatementParser.CExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#cExpr}.
	 * @param ctx the parse tree
	 */
	void exitCExpr(PostgreSQLStatementParser.CExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indirection}.
	 * @param ctx the parse tree
	 */
	void enterIndirection(PostgreSQLStatementParser.IndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indirection}.
	 * @param ctx the parse tree
	 */
	void exitIndirection(PostgreSQLStatementParser.IndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optIndirection}.
	 * @param ctx the parse tree
	 */
	void enterOptIndirection(PostgreSQLStatementParser.OptIndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optIndirection}.
	 * @param ctx the parse tree
	 */
	void exitOptIndirection(PostgreSQLStatementParser.OptIndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indirectionEl}.
	 * @param ctx the parse tree
	 */
	void enterIndirectionEl(PostgreSQLStatementParser.IndirectionElContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indirectionEl}.
	 * @param ctx the parse tree
	 */
	void exitIndirectionEl(PostgreSQLStatementParser.IndirectionElContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sliceBound}.
	 * @param ctx the parse tree
	 */
	void enterSliceBound(PostgreSQLStatementParser.SliceBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sliceBound}.
	 * @param ctx the parse tree
	 */
	void exitSliceBound(PostgreSQLStatementParser.SliceBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void enterInExpr(PostgreSQLStatementParser.InExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void exitInExpr(PostgreSQLStatementParser.InExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(PostgreSQLStatementParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(PostgreSQLStatementParser.CaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#whenClauseList}.
	 * @param ctx the parse tree
	 */
	void enterWhenClauseList(PostgreSQLStatementParser.WhenClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#whenClauseList}.
	 * @param ctx the parse tree
	 */
	void exitWhenClauseList(PostgreSQLStatementParser.WhenClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(PostgreSQLStatementParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(PostgreSQLStatementParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#caseDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaseDefault(PostgreSQLStatementParser.CaseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#caseDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaseDefault(PostgreSQLStatementParser.CaseDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#caseArg}.
	 * @param ctx the parse tree
	 */
	void enterCaseArg(PostgreSQLStatementParser.CaseArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#caseArg}.
	 * @param ctx the parse tree
	 */
	void exitCaseArg(PostgreSQLStatementParser.CaseArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnref}.
	 * @param ctx the parse tree
	 */
	void enterColumnref(PostgreSQLStatementParser.ColumnrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnref}.
	 * @param ctx the parse tree
	 */
	void exitColumnref(PostgreSQLStatementParser.ColumnrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#qualOp}.
	 * @param ctx the parse tree
	 */
	void enterQualOp(PostgreSQLStatementParser.QualOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#qualOp}.
	 * @param ctx the parse tree
	 */
	void exitQualOp(PostgreSQLStatementParser.QualOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#subqueryOp}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryOp(PostgreSQLStatementParser.SubqueryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#subqueryOp}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryOp(PostgreSQLStatementParser.SubqueryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#allOp}.
	 * @param ctx the parse tree
	 */
	void enterAllOp(PostgreSQLStatementParser.AllOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#allOp}.
	 * @param ctx the parse tree
	 */
	void exitAllOp(PostgreSQLStatementParser.AllOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(PostgreSQLStatementParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(PostgreSQLStatementParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(PostgreSQLStatementParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(PostgreSQLStatementParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExtract}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonExtract(PostgreSQLStatementParser.JsonExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExtract}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonExtract(PostgreSQLStatementParser.JsonExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExtractText}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonExtractText(PostgreSQLStatementParser.JsonExtractTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExtractText}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonExtractText(PostgreSQLStatementParser.JsonExtractTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonPathExtract}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonPathExtract(PostgreSQLStatementParser.JsonPathExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonPathExtract}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonPathExtract(PostgreSQLStatementParser.JsonPathExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonPathExtractText}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonPathExtractText(PostgreSQLStatementParser.JsonPathExtractTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonPathExtractText}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonPathExtractText(PostgreSQLStatementParser.JsonPathExtractTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainRight}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainRight(PostgreSQLStatementParser.JsonbContainRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainRight}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainRight(PostgreSQLStatementParser.JsonbContainRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainLeft}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainLeft(PostgreSQLStatementParser.JsonbContainLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainLeft}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainLeft(PostgreSQLStatementParser.JsonbContainLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainTopKey}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainTopKey(PostgreSQLStatementParser.JsonbContainTopKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainTopKey}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainTopKey(PostgreSQLStatementParser.JsonbContainTopKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainAnyTopKey}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainAnyTopKey(PostgreSQLStatementParser.JsonbContainAnyTopKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainAnyTopKey}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainAnyTopKey(PostgreSQLStatementParser.JsonbContainAnyTopKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainAllTopKey}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainAllTopKey(PostgreSQLStatementParser.JsonbContainAllTopKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainAllTopKey}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainAllTopKey(PostgreSQLStatementParser.JsonbContainAllTopKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbConcat}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbConcat(PostgreSQLStatementParser.JsonbConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbConcat}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbConcat(PostgreSQLStatementParser.JsonbConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbDelete}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbDelete(PostgreSQLStatementParser.JsonbDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbDelete}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbDelete(PostgreSQLStatementParser.JsonbDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbPathDelete}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbPathDelete(PostgreSQLStatementParser.JsonbPathDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbPathDelete}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbPathDelete(PostgreSQLStatementParser.JsonbPathDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbPathContainAnyValue}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbPathContainAnyValue(PostgreSQLStatementParser.JsonbPathContainAnyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbPathContainAnyValue}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbPathContainAnyValue(PostgreSQLStatementParser.JsonbPathContainAnyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbPathPredicateCheck}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbPathPredicateCheck(PostgreSQLStatementParser.JsonbPathPredicateCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbPathPredicateCheck}
	 * labeled alternative in {@link PostgreSQLStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbPathPredicateCheck(PostgreSQLStatementParser.JsonbPathPredicateCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#geometricOperator}.
	 * @param ctx the parse tree
	 */
	void enterGeometricOperator(PostgreSQLStatementParser.GeometricOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#geometricOperator}.
	 * @param ctx the parse tree
	 */
	void exitGeometricOperator(PostgreSQLStatementParser.GeometricOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#qualAllOp}.
	 * @param ctx the parse tree
	 */
	void enterQualAllOp(PostgreSQLStatementParser.QualAllOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#qualAllOp}.
	 * @param ctx the parse tree
	 */
	void exitQualAllOp(PostgreSQLStatementParser.QualAllOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ascDesc}.
	 * @param ctx the parse tree
	 */
	void enterAscDesc(PostgreSQLStatementParser.AscDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ascDesc}.
	 * @param ctx the parse tree
	 */
	void exitAscDesc(PostgreSQLStatementParser.AscDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#anyOperator}.
	 * @param ctx the parse tree
	 */
	void enterAnyOperator(PostgreSQLStatementParser.AnyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#anyOperator}.
	 * @param ctx the parse tree
	 */
	void exitAnyOperator(PostgreSQLStatementParser.AnyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowExclusionClause(PostgreSQLStatementParser.WindowExclusionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowExclusionClause(PostgreSQLStatementParser.WindowExclusionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(PostgreSQLStatementParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(PostgreSQLStatementParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#explicitRow}.
	 * @param ctx the parse tree
	 */
	void enterExplicitRow(PostgreSQLStatementParser.ExplicitRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#explicitRow}.
	 * @param ctx the parse tree
	 */
	void exitExplicitRow(PostgreSQLStatementParser.ExplicitRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#implicitRow}.
	 * @param ctx the parse tree
	 */
	void enterImplicitRow(PostgreSQLStatementParser.ImplicitRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#implicitRow}.
	 * @param ctx the parse tree
	 */
	void exitImplicitRow(PostgreSQLStatementParser.ImplicitRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#subType}.
	 * @param ctx the parse tree
	 */
	void enterSubType(PostgreSQLStatementParser.SubTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#subType}.
	 * @param ctx the parse tree
	 */
	void exitSubType(PostgreSQLStatementParser.SubTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(PostgreSQLStatementParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(PostgreSQLStatementParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#arrayExprList}.
	 * @param ctx the parse tree
	 */
	void enterArrayExprList(PostgreSQLStatementParser.ArrayExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#arrayExprList}.
	 * @param ctx the parse tree
	 */
	void exitArrayExprList(PostgreSQLStatementParser.ArrayExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArgList}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgList(PostgreSQLStatementParser.FuncArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArgList}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgList(PostgreSQLStatementParser.FuncArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(PostgreSQLStatementParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(PostgreSQLStatementParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgExpr(PostgreSQLStatementParser.FuncArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgExpr(PostgreSQLStatementParser.FuncArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(PostgreSQLStatementParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(PostgreSQLStatementParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcApplication}.
	 * @param ctx the parse tree
	 */
	void enterFuncApplication(PostgreSQLStatementParser.FuncApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcApplication}.
	 * @param ctx the parse tree
	 */
	void exitFuncApplication(PostgreSQLStatementParser.FuncApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(PostgreSQLStatementParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(PostgreSQLStatementParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void enterAexprConst(PostgreSQLStatementParser.AexprConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void exitAexprConst(PostgreSQLStatementParser.AexprConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#numberConst}.
	 * @param ctx the parse tree
	 */
	void enterNumberConst(PostgreSQLStatementParser.NumberConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#numberConst}.
	 * @param ctx the parse tree
	 */
	void exitNumberConst(PostgreSQLStatementParser.NumberConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(PostgreSQLStatementParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(PostgreSQLStatementParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#colId}.
	 * @param ctx the parse tree
	 */
	void enterColId(PostgreSQLStatementParser.ColIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#colId}.
	 * @param ctx the parse tree
	 */
	void exitColId(PostgreSQLStatementParser.ColIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(PostgreSQLStatementParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(PostgreSQLStatementParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctionName(PostgreSQLStatementParser.TypeFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctionName(PostgreSQLStatementParser.TypeFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(PostgreSQLStatementParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(PostgreSQLStatementParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlTable}.
	 * @param ctx the parse tree
	 */
	void enterXmlTable(PostgreSQLStatementParser.XmlTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlTable}.
	 * @param ctx the parse tree
	 */
	void exitXmlTable(PostgreSQLStatementParser.XmlTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnList}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnList(PostgreSQLStatementParser.XmlTableColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnList}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnList(PostgreSQLStatementParser.XmlTableColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnEl(PostgreSQLStatementParser.XmlTableColumnElContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnEl(PostgreSQLStatementParser.XmlTableColumnElContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnOptionList(PostgreSQLStatementParser.XmlTableColumnOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnOptionList(PostgreSQLStatementParser.XmlTableColumnOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnOptionEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnOptionEl(PostgreSQLStatementParser.XmlTableColumnOptionElContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnOptionEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnOptionEl(PostgreSQLStatementParser.XmlTableColumnOptionElContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlNamespaceList}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespaceList(PostgreSQLStatementParser.XmlNamespaceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlNamespaceList}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespaceList(PostgreSQLStatementParser.XmlNamespaceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlNamespaceEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespaceEl(PostgreSQLStatementParser.XmlNamespaceElContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlNamespaceEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespaceEl(PostgreSQLStatementParser.XmlNamespaceElContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(PostgreSQLStatementParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(PostgreSQLStatementParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#withinGroupClause}.
	 * @param ctx the parse tree
	 */
	void enterWithinGroupClause(PostgreSQLStatementParser.WithinGroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#withinGroupClause}.
	 * @param ctx the parse tree
	 */
	void exitWithinGroupClause(PostgreSQLStatementParser.WithinGroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(PostgreSQLStatementParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(PostgreSQLStatementParser.FilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#functionExprWindowless}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExprWindowless(PostgreSQLStatementParser.FunctionExprWindowlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#functionExprWindowless}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExprWindowless(PostgreSQLStatementParser.FunctionExprWindowlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ordinality}.
	 * @param ctx the parse tree
	 */
	void enterOrdinality(PostgreSQLStatementParser.OrdinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ordinality}.
	 * @param ctx the parse tree
	 */
	void exitOrdinality(PostgreSQLStatementParser.OrdinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#functionExprCommonSubexpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExprCommonSubexpr(PostgreSQLStatementParser.FunctionExprCommonSubexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#functionExprCommonSubexpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExprCommonSubexpr(PostgreSQLStatementParser.FunctionExprCommonSubexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(PostgreSQLStatementParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(PostgreSQLStatementParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(PostgreSQLStatementParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(PostgreSQLStatementParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constTypeName}.
	 * @param ctx the parse tree
	 */
	void enterConstTypeName(PostgreSQLStatementParser.ConstTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constTypeName}.
	 * @param ctx the parse tree
	 */
	void exitConstTypeName(PostgreSQLStatementParser.ConstTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(PostgreSQLStatementParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(PostgreSQLStatementParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#extractList}.
	 * @param ctx the parse tree
	 */
	void enterExtractList(PostgreSQLStatementParser.ExtractListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#extractList}.
	 * @param ctx the parse tree
	 */
	void exitExtractList(PostgreSQLStatementParser.ExtractListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#extractArg}.
	 * @param ctx the parse tree
	 */
	void enterExtractArg(PostgreSQLStatementParser.ExtractArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#extractArg}.
	 * @param ctx the parse tree
	 */
	void exitExtractArg(PostgreSQLStatementParser.ExtractArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(PostgreSQLStatementParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(PostgreSQLStatementParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifiers(PostgreSQLStatementParser.TypeModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifiers(PostgreSQLStatementParser.TypeModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(PostgreSQLStatementParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(PostgreSQLStatementParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void enterConstDatetime(PostgreSQLStatementParser.ConstDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void exitConstDatetime(PostgreSQLStatementParser.ConstDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#timezone}.
	 * @param ctx the parse tree
	 */
	void enterTimezone(PostgreSQLStatementParser.TimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#timezone}.
	 * @param ctx the parse tree
	 */
	void exitTimezone(PostgreSQLStatementParser.TimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(PostgreSQLStatementParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(PostgreSQLStatementParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithLength(PostgreSQLStatementParser.CharacterWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithLength(PostgreSQLStatementParser.CharacterWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithoutLength(PostgreSQLStatementParser.CharacterWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithoutLength(PostgreSQLStatementParser.CharacterWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#characterClause}.
	 * @param ctx the parse tree
	 */
	void enterCharacterClause(PostgreSQLStatementParser.CharacterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#characterClause}.
	 * @param ctx the parse tree
	 */
	void exitCharacterClause(PostgreSQLStatementParser.CharacterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optFloat}.
	 * @param ctx the parse tree
	 */
	void enterOptFloat(PostgreSQLStatementParser.OptFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optFloat}.
	 * @param ctx the parse tree
	 */
	void exitOptFloat(PostgreSQLStatementParser.OptFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(PostgreSQLStatementParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(PostgreSQLStatementParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(PostgreSQLStatementParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(PostgreSQLStatementParser.AttrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#colLable}.
	 * @param ctx the parse tree
	 */
	void enterColLable(PostgreSQLStatementParser.ColLableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#colLable}.
	 * @param ctx the parse tree
	 */
	void exitColLable(PostgreSQLStatementParser.ColLableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBit(PostgreSQLStatementParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBit(PostgreSQLStatementParser.BitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithLength(PostgreSQLStatementParser.BitWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithLength(PostgreSQLStatementParser.BitWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithoutLength(PostgreSQLStatementParser.BitWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithoutLength(PostgreSQLStatementParser.BitWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void enterConstInterval(PostgreSQLStatementParser.ConstIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void exitConstInterval(PostgreSQLStatementParser.ConstIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optInterval}.
	 * @param ctx the parse tree
	 */
	void enterOptInterval(PostgreSQLStatementParser.OptIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optInterval}.
	 * @param ctx the parse tree
	 */
	void exitOptInterval(PostgreSQLStatementParser.OptIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optArrayBounds}.
	 * @param ctx the parse tree
	 */
	void enterOptArrayBounds(PostgreSQLStatementParser.OptArrayBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optArrayBounds}.
	 * @param ctx the parse tree
	 */
	void exitOptArrayBounds(PostgreSQLStatementParser.OptArrayBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#intervalSecond}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSecond(PostgreSQLStatementParser.IntervalSecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#intervalSecond}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSecond(PostgreSQLStatementParser.IntervalSecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#unicodeNormalForm}.
	 * @param ctx the parse tree
	 */
	void enterUnicodeNormalForm(PostgreSQLStatementParser.UnicodeNormalFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#unicodeNormalForm}.
	 * @param ctx the parse tree
	 */
	void exitUnicodeNormalForm(PostgreSQLStatementParser.UnicodeNormalFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#trimList}.
	 * @param ctx the parse tree
	 */
	void enterTrimList(PostgreSQLStatementParser.TrimListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#trimList}.
	 * @param ctx the parse tree
	 */
	void exitTrimList(PostgreSQLStatementParser.TrimListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#overlayList}.
	 * @param ctx the parse tree
	 */
	void enterOverlayList(PostgreSQLStatementParser.OverlayListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#overlayList}.
	 * @param ctx the parse tree
	 */
	void exitOverlayList(PostgreSQLStatementParser.OverlayListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#overlayPlacing}.
	 * @param ctx the parse tree
	 */
	void enterOverlayPlacing(PostgreSQLStatementParser.OverlayPlacingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#overlayPlacing}.
	 * @param ctx the parse tree
	 */
	void exitOverlayPlacing(PostgreSQLStatementParser.OverlayPlacingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#substrFrom}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFrom(PostgreSQLStatementParser.SubstrFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#substrFrom}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFrom(PostgreSQLStatementParser.SubstrFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#substrFor}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFor(PostgreSQLStatementParser.SubstrForContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#substrFor}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFor(PostgreSQLStatementParser.SubstrForContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#positionList}.
	 * @param ctx the parse tree
	 */
	void enterPositionList(PostgreSQLStatementParser.PositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#positionList}.
	 * @param ctx the parse tree
	 */
	void exitPositionList(PostgreSQLStatementParser.PositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#substrList}.
	 * @param ctx the parse tree
	 */
	void enterSubstrList(PostgreSQLStatementParser.SubstrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#substrList}.
	 * @param ctx the parse tree
	 */
	void exitSubstrList(PostgreSQLStatementParser.SubstrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttributes(PostgreSQLStatementParser.XmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttributes(PostgreSQLStatementParser.XmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttributeList(PostgreSQLStatementParser.XmlAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttributeList(PostgreSQLStatementParser.XmlAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributeEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttributeEl(PostgreSQLStatementParser.XmlAttributeElContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributeEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttributeEl(PostgreSQLStatementParser.XmlAttributeElContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlExistsArgument}.
	 * @param ctx the parse tree
	 */
	void enterXmlExistsArgument(PostgreSQLStatementParser.XmlExistsArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlExistsArgument}.
	 * @param ctx the parse tree
	 */
	void exitXmlExistsArgument(PostgreSQLStatementParser.XmlExistsArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlPassingMech}.
	 * @param ctx the parse tree
	 */
	void enterXmlPassingMech(PostgreSQLStatementParser.XmlPassingMechContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlPassingMech}.
	 * @param ctx the parse tree
	 */
	void exitXmlPassingMech(PostgreSQLStatementParser.XmlPassingMechContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#documentOrContent}.
	 * @param ctx the parse tree
	 */
	void enterDocumentOrContent(PostgreSQLStatementParser.DocumentOrContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#documentOrContent}.
	 * @param ctx the parse tree
	 */
	void exitDocumentOrContent(PostgreSQLStatementParser.DocumentOrContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlWhitespaceOption}.
	 * @param ctx the parse tree
	 */
	void enterXmlWhitespaceOption(PostgreSQLStatementParser.XmlWhitespaceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlWhitespaceOption}.
	 * @param ctx the parse tree
	 */
	void exitXmlWhitespaceOption(PostgreSQLStatementParser.XmlWhitespaceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlRootVersion}.
	 * @param ctx the parse tree
	 */
	void enterXmlRootVersion(PostgreSQLStatementParser.XmlRootVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlRootVersion}.
	 * @param ctx the parse tree
	 */
	void exitXmlRootVersion(PostgreSQLStatementParser.XmlRootVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#xmlRootStandalone}.
	 * @param ctx the parse tree
	 */
	void enterXmlRootStandalone(PostgreSQLStatementParser.XmlRootStandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#xmlRootStandalone}.
	 * @param ctx the parse tree
	 */
	void exitXmlRootStandalone(PostgreSQLStatementParser.XmlRootStandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rowsFromItem}.
	 * @param ctx the parse tree
	 */
	void enterRowsFromItem(PostgreSQLStatementParser.RowsFromItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rowsFromItem}.
	 * @param ctx the parse tree
	 */
	void exitRowsFromItem(PostgreSQLStatementParser.RowsFromItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rowsFromList}.
	 * @param ctx the parse tree
	 */
	void enterRowsFromList(PostgreSQLStatementParser.RowsFromListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rowsFromList}.
	 * @param ctx the parse tree
	 */
	void exitRowsFromList(PostgreSQLStatementParser.RowsFromListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnDefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefList(PostgreSQLStatementParser.ColumnDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnDefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefList(PostgreSQLStatementParser.ColumnDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElementList(PostgreSQLStatementParser.TableFuncElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElementList(PostgreSQLStatementParser.TableFuncElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElement(PostgreSQLStatementParser.TableFuncElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElement(PostgreSQLStatementParser.TableFuncElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(PostgreSQLStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(PostgreSQLStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#anyName}.
	 * @param ctx the parse tree
	 */
	void enterAnyName(PostgreSQLStatementParser.AnyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#anyName}.
	 * @param ctx the parse tree
	 */
	void exitAnyName(PostgreSQLStatementParser.AnyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aliasClause}.
	 * @param ctx the parse tree
	 */
	void enterAliasClause(PostgreSQLStatementParser.AliasClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aliasClause}.
	 * @param ctx the parse tree
	 */
	void exitAliasClause(PostgreSQLStatementParser.AliasClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(PostgreSQLStatementParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(PostgreSQLStatementParser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcAliasClause}.
	 * @param ctx the parse tree
	 */
	void enterFuncAliasClause(PostgreSQLStatementParser.FuncAliasClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcAliasClause}.
	 * @param ctx the parse tree
	 */
	void exitFuncAliasClause(PostgreSQLStatementParser.FuncAliasClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tablesampleClause}.
	 * @param ctx the parse tree
	 */
	void enterTablesampleClause(PostgreSQLStatementParser.TablesampleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tablesampleClause}.
	 * @param ctx the parse tree
	 */
	void exitTablesampleClause(PostgreSQLStatementParser.TablesampleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#repeatableClause}.
	 * @param ctx the parse tree
	 */
	void enterRepeatableClause(PostgreSQLStatementParser.RepeatableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#repeatableClause}.
	 * @param ctx the parse tree
	 */
	void exitRepeatableClause(PostgreSQLStatementParser.RepeatableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#allOrDistinct}.
	 * @param ctx the parse tree
	 */
	void enterAllOrDistinct(PostgreSQLStatementParser.AllOrDistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#allOrDistinct}.
	 * @param ctx the parse tree
	 */
	void exitAllOrDistinct(PostgreSQLStatementParser.AllOrDistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void enterSortClause(PostgreSQLStatementParser.SortClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void exitSortClause(PostgreSQLStatementParser.SortClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sortbyList}.
	 * @param ctx the parse tree
	 */
	void enterSortbyList(PostgreSQLStatementParser.SortbyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sortbyList}.
	 * @param ctx the parse tree
	 */
	void exitSortbyList(PostgreSQLStatementParser.SortbyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sortby}.
	 * @param ctx the parse tree
	 */
	void enterSortby(PostgreSQLStatementParser.SortbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sortby}.
	 * @param ctx the parse tree
	 */
	void exitSortby(PostgreSQLStatementParser.SortbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#nullsOrder}.
	 * @param ctx the parse tree
	 */
	void enterNullsOrder(PostgreSQLStatementParser.NullsOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#nullsOrder}.
	 * @param ctx the parse tree
	 */
	void exitNullsOrder(PostgreSQLStatementParser.NullsOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void enterDistinctClause(PostgreSQLStatementParser.DistinctClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void exitDistinctClause(PostgreSQLStatementParser.DistinctClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(PostgreSQLStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(PostgreSQLStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(PostgreSQLStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(PostgreSQLStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowName}.
	 * @param ctx the parse tree
	 */
	void enterWindowName(PostgreSQLStatementParser.WindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowName}.
	 * @param ctx the parse tree
	 */
	void exitWindowName(PostgreSQLStatementParser.WindowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexParams}.
	 * @param ctx the parse tree
	 */
	void enterIndexParams(PostgreSQLStatementParser.IndexParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexParams}.
	 * @param ctx the parse tree
	 */
	void exitIndexParams(PostgreSQLStatementParser.IndexParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexElemOptions}.
	 * @param ctx the parse tree
	 */
	void enterIndexElemOptions(PostgreSQLStatementParser.IndexElemOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexElemOptions}.
	 * @param ctx the parse tree
	 */
	void exitIndexElemOptions(PostgreSQLStatementParser.IndexElemOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexElem}.
	 * @param ctx the parse tree
	 */
	void enterIndexElem(PostgreSQLStatementParser.IndexElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexElem}.
	 * @param ctx the parse tree
	 */
	void exitIndexElem(PostgreSQLStatementParser.IndexElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#collate}.
	 * @param ctx the parse tree
	 */
	void enterCollate(PostgreSQLStatementParser.CollateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#collate}.
	 * @param ctx the parse tree
	 */
	void exitCollate(PostgreSQLStatementParser.CollateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optClass}.
	 * @param ctx the parse tree
	 */
	void enterOptClass(PostgreSQLStatementParser.OptClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optClass}.
	 * @param ctx the parse tree
	 */
	void exitOptClass(PostgreSQLStatementParser.OptClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void enterReloptions(PostgreSQLStatementParser.ReloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void exitReloptions(PostgreSQLStatementParser.ReloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reloptionList}.
	 * @param ctx the parse tree
	 */
	void enterReloptionList(PostgreSQLStatementParser.ReloptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reloptionList}.
	 * @param ctx the parse tree
	 */
	void exitReloptionList(PostgreSQLStatementParser.ReloptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reloptionElem}.
	 * @param ctx the parse tree
	 */
	void enterReloptionElem(PostgreSQLStatementParser.ReloptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reloptionElem}.
	 * @param ctx the parse tree
	 */
	void exitReloptionElem(PostgreSQLStatementParser.ReloptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defArg}.
	 * @param ctx the parse tree
	 */
	void enterDefArg(PostgreSQLStatementParser.DefArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defArg}.
	 * @param ctx the parse tree
	 */
	void exitDefArg(PostgreSQLStatementParser.DefArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(PostgreSQLStatementParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(PostgreSQLStatementParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PostgreSQLStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PostgreSQLStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(PostgreSQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(PostgreSQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(PostgreSQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(PostgreSQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(PostgreSQLStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(PostgreSQLStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier(PostgreSQLStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier(PostgreSQLStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifiers(PostgreSQLStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifiers(PostgreSQLStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void enterSignedIconst(PostgreSQLStatementParser.SignedIconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void exitSignedIconst(PostgreSQLStatementParser.SignedIconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#booleanOrString}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrString(PostgreSQLStatementParser.BooleanOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#booleanOrString}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrString(PostgreSQLStatementParser.BooleanOrStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#nonReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterNonReservedWord(PostgreSQLStatementParser.NonReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#nonReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitNonReservedWord(PostgreSQLStatementParser.NonReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#colNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterColNameKeyword(PostgreSQLStatementParser.ColNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#colNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitColNameKeyword(PostgreSQLStatementParser.ColNameKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(PostgreSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(PostgreSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#roleSpec}.
	 * @param ctx the parse tree
	 */
	void enterRoleSpec(PostgreSQLStatementParser.RoleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#roleSpec}.
	 * @param ctx the parse tree
	 */
	void exitRoleSpec(PostgreSQLStatementParser.RoleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(PostgreSQLStatementParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(PostgreSQLStatementParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(PostgreSQLStatementParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(PostgreSQLStatementParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#varValue}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(PostgreSQLStatementParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#varValue}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(PostgreSQLStatementParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#zoneValue}.
	 * @param ctx the parse tree
	 */
	void enterZoneValue(PostgreSQLStatementParser.ZoneValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#zoneValue}.
	 * @param ctx the parse tree
	 */
	void exitZoneValue(PostgreSQLStatementParser.ZoneValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnly(PostgreSQLStatementParser.NumericOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnly(PostgreSQLStatementParser.NumericOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#isoLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsoLevel(PostgreSQLStatementParser.IsoLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#isoLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsoLevel(PostgreSQLStatementParser.IsoLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(PostgreSQLStatementParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(PostgreSQLStatementParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void enterColQualList(PostgreSQLStatementParser.ColQualListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void exitColQualList(PostgreSQLStatementParser.ColQualListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColConstraint(PostgreSQLStatementParser.ColConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColConstraint(PostgreSQLStatementParser.ColConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttr(PostgreSQLStatementParser.ConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttr(PostgreSQLStatementParser.ConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#colConstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterColConstraintElem(PostgreSQLStatementParser.ColConstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#colConstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitColConstraintElem(PostgreSQLStatementParser.ColConstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#parenthesizedSeqOptList}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedSeqOptList(PostgreSQLStatementParser.ParenthesizedSeqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#parenthesizedSeqOptList}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedSeqOptList(PostgreSQLStatementParser.ParenthesizedSeqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptList(PostgreSQLStatementParser.SeqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptList(PostgreSQLStatementParser.SeqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptElem(PostgreSQLStatementParser.SeqOptElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptElem(PostgreSQLStatementParser.SeqOptElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optColumnList}.
	 * @param ctx the parse tree
	 */
	void enterOptColumnList(PostgreSQLStatementParser.OptColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optColumnList}.
	 * @param ctx the parse tree
	 */
	void exitOptColumnList(PostgreSQLStatementParser.OptColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void enterColumnElem(PostgreSQLStatementParser.ColumnElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void exitColumnElem(PostgreSQLStatementParser.ColumnElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(PostgreSQLStatementParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(PostgreSQLStatementParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#generatedWhen}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedWhen(PostgreSQLStatementParser.GeneratedWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#generatedWhen}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedWhen(PostgreSQLStatementParser.GeneratedWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#noInherit}.
	 * @param ctx the parse tree
	 */
	void enterNoInherit(PostgreSQLStatementParser.NoInheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#noInherit}.
	 * @param ctx the parse tree
	 */
	void exitNoInherit(PostgreSQLStatementParser.NoInheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#consTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterConsTableSpace(PostgreSQLStatementParser.ConsTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#consTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitConsTableSpace(PostgreSQLStatementParser.ConsTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(PostgreSQLStatementParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(PostgreSQLStatementParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defList}.
	 * @param ctx the parse tree
	 */
	void enterDefList(PostgreSQLStatementParser.DefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defList}.
	 * @param ctx the parse tree
	 */
	void exitDefList(PostgreSQLStatementParser.DefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defElem}.
	 * @param ctx the parse tree
	 */
	void enterDefElem(PostgreSQLStatementParser.DefElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defElem}.
	 * @param ctx the parse tree
	 */
	void exitDefElem(PostgreSQLStatementParser.DefElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void enterColLabel(PostgreSQLStatementParser.ColLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void exitColLabel(PostgreSQLStatementParser.ColLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#keyActions}.
	 * @param ctx the parse tree
	 */
	void enterKeyActions(PostgreSQLStatementParser.KeyActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#keyActions}.
	 * @param ctx the parse tree
	 */
	void exitKeyActions(PostgreSQLStatementParser.KeyActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#keyDelete}.
	 * @param ctx the parse tree
	 */
	void enterKeyDelete(PostgreSQLStatementParser.KeyDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#keyDelete}.
	 * @param ctx the parse tree
	 */
	void exitKeyDelete(PostgreSQLStatementParser.KeyDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#keyUpdate}.
	 * @param ctx the parse tree
	 */
	void enterKeyUpdate(PostgreSQLStatementParser.KeyUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#keyUpdate}.
	 * @param ctx the parse tree
	 */
	void exitKeyUpdate(PostgreSQLStatementParser.KeyUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#keyAction}.
	 * @param ctx the parse tree
	 */
	void enterKeyAction(PostgreSQLStatementParser.KeyActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#keyAction}.
	 * @param ctx the parse tree
	 */
	void exitKeyAction(PostgreSQLStatementParser.KeyActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#keyMatch}.
	 * @param ctx the parse tree
	 */
	void enterKeyMatch(PostgreSQLStatementParser.KeyMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#keyMatch}.
	 * @param ctx the parse tree
	 */
	void exitKeyMatch(PostgreSQLStatementParser.KeyMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createGenericOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateGenericOptions(PostgreSQLStatementParser.CreateGenericOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createGenericOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateGenericOptions(PostgreSQLStatementParser.CreateGenericOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#genericOptionList}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionList(PostgreSQLStatementParser.GenericOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionList}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionList(PostgreSQLStatementParser.GenericOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#genericOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionElem(PostgreSQLStatementParser.GenericOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionElem(PostgreSQLStatementParser.GenericOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#genericOptionArg}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionArg(PostgreSQLStatementParser.GenericOptionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionArg}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionArg(PostgreSQLStatementParser.GenericOptionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#genericOptionName}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionName(PostgreSQLStatementParser.GenericOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionName}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionName(PostgreSQLStatementParser.GenericOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#replicaIdentity}.
	 * @param ctx the parse tree
	 */
	void enterReplicaIdentity(PostgreSQLStatementParser.ReplicaIdentityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#replicaIdentity}.
	 * @param ctx the parse tree
	 */
	void exitReplicaIdentity(PostgreSQLStatementParser.ReplicaIdentityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#operArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterOperArgtypes(PostgreSQLStatementParser.OperArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#operArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitOperArgtypes(PostgreSQLStatementParser.OperArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(PostgreSQLStatementParser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(PostgreSQLStatementParser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#argClass}.
	 * @param ctx the parse tree
	 */
	void enterArgClass(PostgreSQLStatementParser.ArgClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#argClass}.
	 * @param ctx the parse tree
	 */
	void exitArgClass(PostgreSQLStatementParser.ArgClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArgsList}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgsList(PostgreSQLStatementParser.FuncArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArgsList}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgsList(PostgreSQLStatementParser.FuncArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#nonReservedWordOrSconst}.
	 * @param ctx the parse tree
	 */
	void enterNonReservedWordOrSconst(PostgreSQLStatementParser.NonReservedWordOrSconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#nonReservedWordOrSconst}.
	 * @param ctx the parse tree
	 */
	void exitNonReservedWordOrSconst(PostgreSQLStatementParser.NonReservedWordOrSconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(PostgreSQLStatementParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(PostgreSQLStatementParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#roleList}.
	 * @param ctx the parse tree
	 */
	void enterRoleList(PostgreSQLStatementParser.RoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#roleList}.
	 * @param ctx the parse tree
	 */
	void exitRoleList(PostgreSQLStatementParser.RoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void enterSetResetClause(PostgreSQLStatementParser.SetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void exitSetResetClause(PostgreSQLStatementParser.SetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setRest}.
	 * @param ctx the parse tree
	 */
	void enterSetRest(PostgreSQLStatementParser.SetRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setRest}.
	 * @param ctx the parse tree
	 */
	void exitSetRest(PostgreSQLStatementParser.SetRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#transactionModeList}.
	 * @param ctx the parse tree
	 */
	void enterTransactionModeList(PostgreSQLStatementParser.TransactionModeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#transactionModeList}.
	 * @param ctx the parse tree
	 */
	void exitTransactionModeList(PostgreSQLStatementParser.TransactionModeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#transactionModeItem}.
	 * @param ctx the parse tree
	 */
	void enterTransactionModeItem(PostgreSQLStatementParser.TransactionModeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#transactionModeItem}.
	 * @param ctx the parse tree
	 */
	void exitTransactionModeItem(PostgreSQLStatementParser.TransactionModeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setRestMore}.
	 * @param ctx the parse tree
	 */
	void enterSetRestMore(PostgreSQLStatementParser.SetRestMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setRestMore}.
	 * @param ctx the parse tree
	 */
	void exitSetRestMore(PostgreSQLStatementParser.SetRestMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#encoding}.
	 * @param ctx the parse tree
	 */
	void enterEncoding(PostgreSQLStatementParser.EncodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#encoding}.
	 * @param ctx the parse tree
	 */
	void exitEncoding(PostgreSQLStatementParser.EncodingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#genericSet}.
	 * @param ctx the parse tree
	 */
	void enterGenericSet(PostgreSQLStatementParser.GenericSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#genericSet}.
	 * @param ctx the parse tree
	 */
	void exitGenericSet(PostgreSQLStatementParser.GenericSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableResetStmt(PostgreSQLStatementParser.VariableResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableResetStmt(PostgreSQLStatementParser.VariableResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#resetRest}.
	 * @param ctx the parse tree
	 */
	void enterResetRest(PostgreSQLStatementParser.ResetRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#resetRest}.
	 * @param ctx the parse tree
	 */
	void exitResetRest(PostgreSQLStatementParser.ResetRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#genericReset}.
	 * @param ctx the parse tree
	 */
	void enterGenericReset(PostgreSQLStatementParser.GenericResetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#genericReset}.
	 * @param ctx the parse tree
	 */
	void exitGenericReset(PostgreSQLStatementParser.GenericResetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#relationExprList}.
	 * @param ctx the parse tree
	 */
	void enterRelationExprList(PostgreSQLStatementParser.RelationExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#relationExprList}.
	 * @param ctx the parse tree
	 */
	void exitRelationExprList(PostgreSQLStatementParser.RelationExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#commonFuncOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCommonFuncOptItem(PostgreSQLStatementParser.CommonFuncOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#commonFuncOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCommonFuncOptItem(PostgreSQLStatementParser.CommonFuncOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSetResetClause(PostgreSQLStatementParser.FunctionSetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSetResetClause(PostgreSQLStatementParser.FunctionSetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rowSecurityCmd}.
	 * @param ctx the parse tree
	 */
	void enterRowSecurityCmd(PostgreSQLStatementParser.RowSecurityCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rowSecurityCmd}.
	 * @param ctx the parse tree
	 */
	void exitRowSecurityCmd(PostgreSQLStatementParser.RowSecurityCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(PostgreSQLStatementParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(PostgreSQLStatementParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeNameList}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameList(PostgreSQLStatementParser.TypeNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeNameList}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameList(PostgreSQLStatementParser.TypeNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(PostgreSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(PostgreSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(PostgreSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(PostgreSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(PostgreSQLStatementParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(PostgreSQLStatementParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#hostVariable}.
	 * @param ctx the parse tree
	 */
	void enterHostVariable(PostgreSQLStatementParser.HostVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#hostVariable}.
	 * @param ctx the parse tree
	 */
	void exitHostVariable(PostgreSQLStatementParser.HostVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(PostgreSQLStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(PostgreSQLStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(PostgreSQLStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(PostgreSQLStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 */
	void enterOptionForClause(PostgreSQLStatementParser.OptionForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 */
	void exitOptionForClause(PostgreSQLStatementParser.OptionForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(PostgreSQLStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(PostgreSQLStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterCreateOptRoleElem(PostgreSQLStatementParser.CreateOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitCreateOptRoleElem(PostgreSQLStatementParser.CreateOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterAlterOptRoleElem(PostgreSQLStatementParser.AlterOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitAlterOptRoleElem(PostgreSQLStatementParser.AlterOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(PostgreSQLStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(PostgreSQLStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(PostgreSQLStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(PostgreSQLStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterUserClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserClauses(PostgreSQLStatementParser.AlterUserClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterUserClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserClauses(PostgreSQLStatementParser.AlterUserClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 */
	void enterAlterOptRoleList(PostgreSQLStatementParser.AlterOptRoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 */
	void exitAlterOptRoleList(PostgreSQLStatementParser.AlterOptRoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(PostgreSQLStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(PostgreSQLStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(PostgreSQLStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(PostgreSQLStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(PostgreSQLStatementParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(PostgreSQLStatementParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateGroup(PostgreSQLStatementParser.CreateGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateGroup(PostgreSQLStatementParser.CreateGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reassignOwned}.
	 * @param ctx the parse tree
	 */
	void enterReassignOwned(PostgreSQLStatementParser.ReassignOwnedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reassignOwned}.
	 * @param ctx the parse tree
	 */
	void exitReassignOwned(PostgreSQLStatementParser.ReassignOwnedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropDroup}.
	 * @param ctx the parse tree
	 */
	void enterDropDroup(PostgreSQLStatementParser.DropDroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropDroup}.
	 * @param ctx the parse tree
	 */
	void exitDropDroup(PostgreSQLStatementParser.DropDroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(PostgreSQLStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(PostgreSQLStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#executeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterExecuteParamClause(PostgreSQLStatementParser.ExecuteParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#executeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitExecuteParamClause(PostgreSQLStatementParser.ExecuteParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionBoundSpec(PostgreSQLStatementParser.PartitionBoundSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionBoundSpec(PostgreSQLStatementParser.PartitionBoundSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#hashPartbound}.
	 * @param ctx the parse tree
	 */
	void enterHashPartbound(PostgreSQLStatementParser.HashPartboundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#hashPartbound}.
	 * @param ctx the parse tree
	 */
	void exitHashPartbound(PostgreSQLStatementParser.HashPartboundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#hashPartboundElem}.
	 * @param ctx the parse tree
	 */
	void enterHashPartboundElem(PostgreSQLStatementParser.HashPartboundElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#hashPartboundElem}.
	 * @param ctx the parse tree
	 */
	void exitHashPartboundElem(PostgreSQLStatementParser.HashPartboundElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typedTableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTypedTableElementList(PostgreSQLStatementParser.TypedTableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typedTableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTypedTableElementList(PostgreSQLStatementParser.TypedTableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typedTableElement}.
	 * @param ctx the parse tree
	 */
	void enterTypedTableElement(PostgreSQLStatementParser.TypedTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typedTableElement}.
	 * @param ctx the parse tree
	 */
	void exitTypedTableElement(PostgreSQLStatementParser.TypedTableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void enterColumnOptions(PostgreSQLStatementParser.ColumnOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void exitColumnOptions(PostgreSQLStatementParser.ColumnOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#withData}.
	 * @param ctx the parse tree
	 */
	void enterWithData(PostgreSQLStatementParser.WithDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#withData}.
	 * @param ctx the parse tree
	 */
	void exitWithData(PostgreSQLStatementParser.WithDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableSpace}.
	 * @param ctx the parse tree
	 */
	void enterTableSpace(PostgreSQLStatementParser.TableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableSpace}.
	 * @param ctx the parse tree
	 */
	void exitTableSpace(PostgreSQLStatementParser.TableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void enterOnCommitOption(PostgreSQLStatementParser.OnCommitOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void exitOnCommitOption(PostgreSQLStatementParser.OnCommitOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#withOption}.
	 * @param ctx the parse tree
	 */
	void enterWithOption(PostgreSQLStatementParser.WithOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#withOption}.
	 * @param ctx the parse tree
	 */
	void exitWithOption(PostgreSQLStatementParser.WithOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableAccessMethodClause}.
	 * @param ctx the parse tree
	 */
	void enterTableAccessMethodClause(PostgreSQLStatementParser.TableAccessMethodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableAccessMethodClause}.
	 * @param ctx the parse tree
	 */
	void exitTableAccessMethodClause(PostgreSQLStatementParser.TableAccessMethodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#accessMethod}.
	 * @param ctx the parse tree
	 */
	void enterAccessMethod(PostgreSQLStatementParser.AccessMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#accessMethod}.
	 * @param ctx the parse tree
	 */
	void exitAccessMethod(PostgreSQLStatementParser.AccessMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(PostgreSQLStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(PostgreSQLStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(PostgreSQLStatementParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(PostgreSQLStatementParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexIncludingParams}.
	 * @param ctx the parse tree
	 */
	void enterIndexIncludingParams(PostgreSQLStatementParser.IndexIncludingParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexIncludingParams}.
	 * @param ctx the parse tree
	 */
	void exitIndexIncludingParams(PostgreSQLStatementParser.IndexIncludingParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#accessMethodClause}.
	 * @param ctx the parse tree
	 */
	void enterAccessMethodClause(PostgreSQLStatementParser.AccessMethodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#accessMethodClause}.
	 * @param ctx the parse tree
	 */
	void exitAccessMethodClause(PostgreSQLStatementParser.AccessMethodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(PostgreSQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(PostgreSQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(PostgreSQLStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(PostgreSQLStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(PostgreSQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(PostgreSQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropGroup(PostgreSQLStatementParser.DropGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropGroup(PostgreSQLStatementParser.DropGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createDatabaseSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification(PostgreSQLStatementParser.CreateDatabaseSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createDatabaseSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification(PostgreSQLStatementParser.CreateDatabaseSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createdbOptName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbOptName(PostgreSQLStatementParser.CreatedbOptNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createdbOptName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbOptName(PostgreSQLStatementParser.CreatedbOptNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(PostgreSQLStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(PostgreSQLStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(PostgreSQLStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(PostgreSQLStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(PostgreSQLStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(PostgreSQLStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTableOpt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableOpt(PostgreSQLStatementParser.DropTableOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTableOpt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableOpt(PostgreSQLStatementParser.DropTableOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(PostgreSQLStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(PostgreSQLStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropIndexOpt}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexOpt(PostgreSQLStatementParser.DropIndexOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropIndexOpt}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexOpt(PostgreSQLStatementParser.DropIndexOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(PostgreSQLStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(PostgreSQLStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#restartSeqs}.
	 * @param ctx the parse tree
	 */
	void enterRestartSeqs(PostgreSQLStatementParser.RestartSeqsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#restartSeqs}.
	 * @param ctx the parse tree
	 */
	void exitRestartSeqs(PostgreSQLStatementParser.RestartSeqsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpecification(PostgreSQLStatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpecification(PostgreSQLStatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(PostgreSQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(PostgreSQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinition(PostgreSQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinition(PostgreSQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(PostgreSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(PostgreSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(PostgreSQLStatementParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(PostgreSQLStatementParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void enterConstraintClause(PostgreSQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void exitConstraintClause(PostgreSQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraintOption(PostgreSQLStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraintOption(PostgreSQLStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#checkOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckOption(PostgreSQLStatementParser.CheckOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#checkOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckOption(PostgreSQLStatementParser.CheckOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpr(PostgreSQLStatementParser.DefaultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpr(PostgreSQLStatementParser.DefaultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOptions(PostgreSQLStatementParser.SequenceOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOptions(PostgreSQLStatementParser.SequenceOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOption(PostgreSQLStatementParser.SequenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOption(PostgreSQLStatementParser.SequenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void enterIndexParameters(PostgreSQLStatementParser.IndexParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void exitIndexParameters(PostgreSQLStatementParser.IndexParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PostgreSQLStatementParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PostgreSQLStatementParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 */
	void enterConstraintOptionalParam(PostgreSQLStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 */
	void exitConstraintOptionalParam(PostgreSQLStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void enterLikeOption(PostgreSQLStatementParser.LikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void exitLikeOption(PostgreSQLStatementParser.LikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(PostgreSQLStatementParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(PostgreSQLStatementParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintOption(PostgreSQLStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintOption(PostgreSQLStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterExclusionWhereClause(PostgreSQLStatementParser.ExclusionWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitExclusionWhereClause(PostgreSQLStatementParser.ExclusionWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void enterExclusionConstraintList(PostgreSQLStatementParser.ExclusionConstraintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void exitExclusionConstraintList(PostgreSQLStatementParser.ExclusionConstraintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterExclusionConstraintElem(PostgreSQLStatementParser.ExclusionConstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitExclusionConstraintElem(PostgreSQLStatementParser.ExclusionConstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#inheritClause}.
	 * @param ctx the parse tree
	 */
	void enterInheritClause(PostgreSQLStatementParser.InheritClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#inheritClause}.
	 * @param ctx the parse tree
	 */
	void exitInheritClause(PostgreSQLStatementParser.InheritClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(PostgreSQLStatementParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(PostgreSQLStatementParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#partParams}.
	 * @param ctx the parse tree
	 */
	void enterPartParams(PostgreSQLStatementParser.PartParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#partParams}.
	 * @param ctx the parse tree
	 */
	void exitPartParams(PostgreSQLStatementParser.PartParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#partElem}.
	 * @param ctx the parse tree
	 */
	void enterPartElem(PostgreSQLStatementParser.PartElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#partElem}.
	 * @param ctx the parse tree
	 */
	void exitPartElem(PostgreSQLStatementParser.PartElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcExprWindowless}.
	 * @param ctx the parse tree
	 */
	void enterFuncExprWindowless(PostgreSQLStatementParser.FuncExprWindowlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcExprWindowless}.
	 * @param ctx the parse tree
	 */
	void exitFuncExprWindowless(PostgreSQLStatementParser.FuncExprWindowlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#partStrategy}.
	 * @param ctx the parse tree
	 */
	void enterPartStrategy(PostgreSQLStatementParser.PartStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#partStrategy}.
	 * @param ctx the parse tree
	 */
	void exitPartStrategy(PostgreSQLStatementParser.PartStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification(PostgreSQLStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification(PostgreSQLStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#concurrentlyClause}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentlyClause(PostgreSQLStatementParser.ConcurrentlyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#concurrentlyClause}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentlyClause(PostgreSQLStatementParser.ConcurrentlyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#onlyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnlyClause(PostgreSQLStatementParser.OnlyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#onlyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnlyClause(PostgreSQLStatementParser.OnlyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#asteriskClause}.
	 * @param ctx the parse tree
	 */
	void enterAsteriskClause(PostgreSQLStatementParser.AsteriskClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#asteriskClause}.
	 * @param ctx the parse tree
	 */
	void exitAsteriskClause(PostgreSQLStatementParser.AsteriskClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(PostgreSQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(PostgreSQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#partitionCmd}.
	 * @param ctx the parse tree
	 */
	void enterPartitionCmd(PostgreSQLStatementParser.PartitionCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#partitionCmd}.
	 * @param ctx the parse tree
	 */
	void exitPartitionCmd(PostgreSQLStatementParser.PartitionCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexDefinitionClause(PostgreSQLStatementParser.AlterIndexDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexDefinitionClause(PostgreSQLStatementParser.AlterIndexDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexPartitionCmd}.
	 * @param ctx the parse tree
	 */
	void enterIndexPartitionCmd(PostgreSQLStatementParser.IndexPartitionCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexPartitionCmd}.
	 * @param ctx the parse tree
	 */
	void exitIndexPartitionCmd(PostgreSQLStatementParser.IndexPartitionCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameIndexSpecification(PostgreSQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameIndexSpecification(PostgreSQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexDependsOnExtension(PostgreSQLStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexDependsOnExtension(PostgreSQLStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexSetTableSpace(PostgreSQLStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexSetTableSpace(PostgreSQLStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 */
	void enterTableNamesClause(PostgreSQLStatementParser.TableNamesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 */
	void exitTableNamesClause(PostgreSQLStatementParser.TableNamesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 */
	void enterTableNameClause(PostgreSQLStatementParser.TableNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 */
	void exitTableNameClause(PostgreSQLStatementParser.TableNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableActions(PostgreSQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableActions(PostgreSQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAction(PostgreSQLStatementParser.AlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAction(PostgreSQLStatementParser.AlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(PostgreSQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(PostgreSQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(PostgreSQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(PostgreSQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(PostgreSQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(PostgreSQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumn(PostgreSQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumn(PostgreSQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnSetOption(PostgreSQLStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnSetOption(PostgreSQLStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOptions(PostgreSQLStatementParser.AttributeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOptions(PostgreSQLStatementParser.AttributeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOption(PostgreSQLStatementParser.AttributeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOption(PostgreSQLStatementParser.AttributeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(PostgreSQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(PostgreSQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintUsingIndex(PostgreSQLStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintUsingIndex(PostgreSQLStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#modifyConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyConstraintSpecification(PostgreSQLStatementParser.ModifyConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#modifyConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyConstraintSpecification(PostgreSQLStatementParser.ModifyConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#validateConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterValidateConstraintSpecification(PostgreSQLStatementParser.ValidateConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#validateConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitValidateConstraintSpecification(PostgreSQLStatementParser.ValidateConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintSpecification(PostgreSQLStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintSpecification(PostgreSQLStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameterWithValue(PostgreSQLStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameterWithValue(PostgreSQLStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameter(PostgreSQLStatementParser.StorageParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameter(PostgreSQLStatementParser.StorageParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumnSpecification(PostgreSQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumnSpecification(PostgreSQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 */
	void enterRenameConstraint(PostgreSQLStatementParser.RenameConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 */
	void exitRenameConstraint(PostgreSQLStatementParser.RenameConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableSpecification(PostgreSQLStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableSpecification(PostgreSQLStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexNames(PostgreSQLStatementParser.IndexNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexNames(PostgreSQLStatementParser.IndexNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(PostgreSQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(PostgreSQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseClause(PostgreSQLStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseClause(PostgreSQLStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createdbOptItems}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbOptItems(PostgreSQLStatementParser.CreatedbOptItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createdbOptItems}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbOptItems(PostgreSQLStatementParser.CreatedbOptItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createdbOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbOptItem(PostgreSQLStatementParser.CreatedbOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createdbOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbOptItem(PostgreSQLStatementParser.CreatedbOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTableCmds}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableCmds(PostgreSQLStatementParser.AlterTableCmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTableCmds}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableCmds(PostgreSQLStatementParser.AlterTableCmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTableCmd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableCmd(PostgreSQLStatementParser.AlterTableCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTableCmd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableCmd(PostgreSQLStatementParser.AlterTableCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnCompression}.
	 * @param ctx the parse tree
	 */
	void enterColumnCompression(PostgreSQLStatementParser.ColumnCompressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnCompression}.
	 * @param ctx the parse tree
	 */
	void exitColumnCompression(PostgreSQLStatementParser.ColumnCompressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeSpec(PostgreSQLStatementParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeSpec(PostgreSQLStatementParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeElem(PostgreSQLStatementParser.ConstraintAttributeElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeElem(PostgreSQLStatementParser.ConstraintAttributeElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterGenericOptions(PostgreSQLStatementParser.AlterGenericOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterGenericOptions(PostgreSQLStatementParser.AlterGenericOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterGenericOptionList(PostgreSQLStatementParser.AlterGenericOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterGenericOptionList(PostgreSQLStatementParser.AlterGenericOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterAlterGenericOptionElem(PostgreSQLStatementParser.AlterGenericOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitAlterGenericOptionElem(PostgreSQLStatementParser.AlterGenericOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropBehavior}.
	 * @param ctx the parse tree
	 */
	void enterDropBehavior(PostgreSQLStatementParser.DropBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropBehavior}.
	 * @param ctx the parse tree
	 */
	void exitDropBehavior(PostgreSQLStatementParser.DropBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterUsing}.
	 * @param ctx the parse tree
	 */
	void enterAlterUsing(PostgreSQLStatementParser.AlterUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterUsing}.
	 * @param ctx the parse tree
	 */
	void exitAlterUsing(PostgreSQLStatementParser.AlterUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setData}.
	 * @param ctx the parse tree
	 */
	void enterSetData(PostgreSQLStatementParser.SetDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setData}.
	 * @param ctx the parse tree
	 */
	void exitSetData(PostgreSQLStatementParser.SetDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIdentityColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterIdentityColumnOptionList(PostgreSQLStatementParser.AlterIdentityColumnOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIdentityColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterIdentityColumnOptionList(PostgreSQLStatementParser.AlterIdentityColumnOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIdentityColumnOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterIdentityColumnOption(PostgreSQLStatementParser.AlterIdentityColumnOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIdentityColumnOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterIdentityColumnOption(PostgreSQLStatementParser.AlterIdentityColumnOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterColumnDefault}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnDefault(PostgreSQLStatementParser.AlterColumnDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterColumnDefault}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnDefault(PostgreSQLStatementParser.AlterColumnDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOperator}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperator(PostgreSQLStatementParser.AlterOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOperator}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperator(PostgreSQLStatementParser.AlterOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClass}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorClass(PostgreSQLStatementParser.AlterOperatorClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClass}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorClass(PostgreSQLStatementParser.AlterOperatorClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClassClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorClassClauses(PostgreSQLStatementParser.AlterOperatorClassClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClassClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorClassClauses(PostgreSQLStatementParser.AlterOperatorClassClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorFamily(PostgreSQLStatementParser.AlterOperatorFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorFamily(PostgreSQLStatementParser.AlterOperatorFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorFamilyClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorFamilyClauses(PostgreSQLStatementParser.AlterOperatorFamilyClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorFamilyClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorFamilyClauses(PostgreSQLStatementParser.AlterOperatorFamilyClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#opclassItemList}.
	 * @param ctx the parse tree
	 */
	void enterOpclassItemList(PostgreSQLStatementParser.OpclassItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#opclassItemList}.
	 * @param ctx the parse tree
	 */
	void exitOpclassItemList(PostgreSQLStatementParser.OpclassItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#opclassItem}.
	 * @param ctx the parse tree
	 */
	void enterOpclassItem(PostgreSQLStatementParser.OpclassItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#opclassItem}.
	 * @param ctx the parse tree
	 */
	void exitOpclassItem(PostgreSQLStatementParser.OpclassItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#opclassPurpose}.
	 * @param ctx the parse tree
	 */
	void enterOpclassPurpose(PostgreSQLStatementParser.OpclassPurposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#opclassPurpose}.
	 * @param ctx the parse tree
	 */
	void exitOpclassPurpose(PostgreSQLStatementParser.OpclassPurposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorClauses(PostgreSQLStatementParser.AlterOperatorClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorClauses(PostgreSQLStatementParser.AlterOperatorClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#operatorDefList}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDefList(PostgreSQLStatementParser.OperatorDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#operatorDefList}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDefList(PostgreSQLStatementParser.OperatorDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#operatorDefElem}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDefElem(PostgreSQLStatementParser.OperatorDefElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#operatorDefElem}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDefElem(PostgreSQLStatementParser.OperatorDefElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#operatorDefArg}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDefArg(PostgreSQLStatementParser.OperatorDefArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#operatorDefArg}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDefArg(PostgreSQLStatementParser.OperatorDefArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#operatorWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterOperatorWithArgtypes(PostgreSQLStatementParser.OperatorWithArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#operatorWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitOperatorWithArgtypes(PostgreSQLStatementParser.OperatorWithArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterAggregate}.
	 * @param ctx the parse tree
	 */
	void enterAlterAggregate(PostgreSQLStatementParser.AlterAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterAggregate}.
	 * @param ctx the parse tree
	 */
	void exitAlterAggregate(PostgreSQLStatementParser.AlterAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggregateSignature}.
	 * @param ctx the parse tree
	 */
	void enterAggregateSignature(PostgreSQLStatementParser.AggregateSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggregateSignature}.
	 * @param ctx the parse tree
	 */
	void exitAggregateSignature(PostgreSQLStatementParser.AggregateSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggrArgs}.
	 * @param ctx the parse tree
	 */
	void enterAggrArgs(PostgreSQLStatementParser.AggrArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggrArgs}.
	 * @param ctx the parse tree
	 */
	void exitAggrArgs(PostgreSQLStatementParser.AggrArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggrArgsList}.
	 * @param ctx the parse tree
	 */
	void enterAggrArgsList(PostgreSQLStatementParser.AggrArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggrArgsList}.
	 * @param ctx the parse tree
	 */
	void exitAggrArgsList(PostgreSQLStatementParser.AggrArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggrArg}.
	 * @param ctx the parse tree
	 */
	void enterAggrArg(PostgreSQLStatementParser.AggrArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggrArg}.
	 * @param ctx the parse tree
	 */
	void exitAggrArg(PostgreSQLStatementParser.AggrArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterAggregateDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterAggregateDefinitionClause(PostgreSQLStatementParser.AlterAggregateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterAggregateDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterAggregateDefinitionClause(PostgreSQLStatementParser.AlterAggregateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterCollation}.
	 * @param ctx the parse tree
	 */
	void enterAlterCollation(PostgreSQLStatementParser.AlterCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterCollation}.
	 * @param ctx the parse tree
	 */
	void exitAlterCollation(PostgreSQLStatementParser.AlterCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterCollationClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterCollationClause(PostgreSQLStatementParser.AlterCollationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterCollationClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterCollationClause(PostgreSQLStatementParser.AlterCollationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterConversion}.
	 * @param ctx the parse tree
	 */
	void enterAlterConversion(PostgreSQLStatementParser.AlterConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterConversion}.
	 * @param ctx the parse tree
	 */
	void exitAlterConversion(PostgreSQLStatementParser.AlterConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterConversionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterConversionClause(PostgreSQLStatementParser.AlterConversionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterConversionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterConversionClause(PostgreSQLStatementParser.AlterConversionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefaultPrivileges(PostgreSQLStatementParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefaultPrivileges(PostgreSQLStatementParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void enterDefACLAction(PostgreSQLStatementParser.DefACLActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void exitDefACLAction(PostgreSQLStatementParser.DefACLActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#grantGrantOption}.
	 * @param ctx the parse tree
	 */
	void enterGrantGrantOption(PostgreSQLStatementParser.GrantGrantOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#grantGrantOption}.
	 * @param ctx the parse tree
	 */
	void exitGrantGrantOption(PostgreSQLStatementParser.GrantGrantOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#granteeList}.
	 * @param ctx the parse tree
	 */
	void enterGranteeList(PostgreSQLStatementParser.GranteeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#granteeList}.
	 * @param ctx the parse tree
	 */
	void exitGranteeList(PostgreSQLStatementParser.GranteeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(PostgreSQLStatementParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(PostgreSQLStatementParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defaclPrivilegeTarget}.
	 * @param ctx the parse tree
	 */
	void enterDefaclPrivilegeTarget(PostgreSQLStatementParser.DefaclPrivilegeTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defaclPrivilegeTarget}.
	 * @param ctx the parse tree
	 */
	void exitDefaclPrivilegeTarget(PostgreSQLStatementParser.DefaclPrivilegeTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(PostgreSQLStatementParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(PostgreSQLStatementParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilegeList}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeList(PostgreSQLStatementParser.PrivilegeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilegeList}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeList(PostgreSQLStatementParser.PrivilegeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(PostgreSQLStatementParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(PostgreSQLStatementParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOptionList(PostgreSQLStatementParser.DefACLOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOptionList(PostgreSQLStatementParser.DefACLOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOption(PostgreSQLStatementParser.DefACLOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOption(PostgreSQLStatementParser.DefACLOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#schemaNameList}.
	 * @param ctx the parse tree
	 */
	void enterSchemaNameList(PostgreSQLStatementParser.SchemaNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#schemaNameList}.
	 * @param ctx the parse tree
	 */
	void exitSchemaNameList(PostgreSQLStatementParser.SchemaNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomain(PostgreSQLStatementParser.AlterDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomain(PostgreSQLStatementParser.AlterDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterDomainClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomainClause(PostgreSQLStatementParser.AlterDomainClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterDomainClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomainClause(PostgreSQLStatementParser.AlterDomainClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterEventTrigger(PostgreSQLStatementParser.AlterEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterEventTrigger(PostgreSQLStatementParser.AlterEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterEventTriggerClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterEventTriggerClause(PostgreSQLStatementParser.AlterEventTriggerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterEventTriggerClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterEventTriggerClause(PostgreSQLStatementParser.AlterEventTriggerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tiggerName}.
	 * @param ctx the parse tree
	 */
	void enterTiggerName(PostgreSQLStatementParser.TiggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tiggerName}.
	 * @param ctx the parse tree
	 */
	void exitTiggerName(PostgreSQLStatementParser.TiggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterExtension}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtension(PostgreSQLStatementParser.AlterExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterExtension}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtension(PostgreSQLStatementParser.AlterExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionClauses(PostgreSQLStatementParser.AlterExtensionClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionClauses(PostgreSQLStatementParser.AlterExtensionClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#functionWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithArgtypes(PostgreSQLStatementParser.FunctionWithArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#functionWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithArgtypes(PostgreSQLStatementParser.FunctionWithArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(PostgreSQLStatementParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(PostgreSQLStatementParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggregateWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWithArgtypes(PostgreSQLStatementParser.AggregateWithArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggregateWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWithArgtypes(PostgreSQLStatementParser.AggregateWithArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionOptList(PostgreSQLStatementParser.AlterExtensionOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionOptList(PostgreSQLStatementParser.AlterExtensionOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionOptItem(PostgreSQLStatementParser.AlterExtensionOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionOptItem(PostgreSQLStatementParser.AlterExtensionOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignDataWrapper(PostgreSQLStatementParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignDataWrapper(PostgreSQLStatementParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterForeignDataWrapperClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignDataWrapperClauses(PostgreSQLStatementParser.AlterForeignDataWrapperClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignDataWrapperClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignDataWrapperClauses(PostgreSQLStatementParser.AlterForeignDataWrapperClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#fdwOptions}.
	 * @param ctx the parse tree
	 */
	void enterFdwOptions(PostgreSQLStatementParser.FdwOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#fdwOptions}.
	 * @param ctx the parse tree
	 */
	void exitFdwOptions(PostgreSQLStatementParser.FdwOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#fdwOption}.
	 * @param ctx the parse tree
	 */
	void enterFdwOption(PostgreSQLStatementParser.FdwOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#fdwOption}.
	 * @param ctx the parse tree
	 */
	void exitFdwOption(PostgreSQLStatementParser.FdwOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#handlerName}.
	 * @param ctx the parse tree
	 */
	void enterHandlerName(PostgreSQLStatementParser.HandlerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#handlerName}.
	 * @param ctx the parse tree
	 */
	void exitHandlerName(PostgreSQLStatementParser.HandlerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroup(PostgreSQLStatementParser.AlterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroup(PostgreSQLStatementParser.AlterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterGroupClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroupClauses(PostgreSQLStatementParser.AlterGroupClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterGroupClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroupClauses(PostgreSQLStatementParser.AlterGroupClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterLanguage}.
	 * @param ctx the parse tree
	 */
	void enterAlterLanguage(PostgreSQLStatementParser.AlterLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterLanguage}.
	 * @param ctx the parse tree
	 */
	void exitAlterLanguage(PostgreSQLStatementParser.AlterLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterLargeObject}.
	 * @param ctx the parse tree
	 */
	void enterAlterLargeObject(PostgreSQLStatementParser.AlterLargeObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterLargeObject}.
	 * @param ctx the parse tree
	 */
	void exitAlterLargeObject(PostgreSQLStatementParser.AlterLargeObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaterializedView(PostgreSQLStatementParser.AlterMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaterializedView(PostgreSQLStatementParser.AlterMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterMaterializedViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaterializedViewClauses(PostgreSQLStatementParser.AlterMaterializedViewClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterMaterializedViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaterializedViewClauses(PostgreSQLStatementParser.AlterMaterializedViewClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(PostgreSQLStatementParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(PostgreSQLStatementParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaterializedView(PostgreSQLStatementParser.CreateMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaterializedView(PostgreSQLStatementParser.CreateMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createMvTarget}.
	 * @param ctx the parse tree
	 */
	void enterCreateMvTarget(PostgreSQLStatementParser.CreateMvTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createMvTarget}.
	 * @param ctx the parse tree
	 */
	void exitCreateMvTarget(PostgreSQLStatementParser.CreateMvTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterPolicy}.
	 * @param ctx the parse tree
	 */
	void enterAlterPolicy(PostgreSQLStatementParser.AlterPolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterPolicy}.
	 * @param ctx the parse tree
	 */
	void exitAlterPolicy(PostgreSQLStatementParser.AlterPolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterPolicyClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterPolicyClauses(PostgreSQLStatementParser.AlterPolicyClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterPolicyClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterPolicyClauses(PostgreSQLStatementParser.AlterPolicyClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#refreshMatViewStmt}.
	 * @param ctx the parse tree
	 */
	void enterRefreshMatViewStmt(PostgreSQLStatementParser.RefreshMatViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#refreshMatViewStmt}.
	 * @param ctx the parse tree
	 */
	void exitRefreshMatViewStmt(PostgreSQLStatementParser.RefreshMatViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(PostgreSQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(PostgreSQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterProcedureClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedureClauses(PostgreSQLStatementParser.AlterProcedureClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterProcedureClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedureClauses(PostgreSQLStatementParser.AlterProcedureClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterfuncOptList}.
	 * @param ctx the parse tree
	 */
	void enterAlterfuncOptList(PostgreSQLStatementParser.AlterfuncOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterfuncOptList}.
	 * @param ctx the parse tree
	 */
	void exitAlterfuncOptList(PostgreSQLStatementParser.AlterfuncOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(PostgreSQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(PostgreSQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterFunctionClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunctionClauses(PostgreSQLStatementParser.AlterFunctionClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterFunctionClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunctionClauses(PostgreSQLStatementParser.AlterFunctionClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterPublication}.
	 * @param ctx the parse tree
	 */
	void enterAlterPublication(PostgreSQLStatementParser.AlterPublicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterPublication}.
	 * @param ctx the parse tree
	 */
	void exitAlterPublication(PostgreSQLStatementParser.AlterPublicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterRoutine}.
	 * @param ctx the parse tree
	 */
	void enterAlterRoutine(PostgreSQLStatementParser.AlterRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterRoutine}.
	 * @param ctx the parse tree
	 */
	void exitAlterRoutine(PostgreSQLStatementParser.AlterRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterRule(PostgreSQLStatementParser.AlterRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterRule(PostgreSQLStatementParser.AlterRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequence(PostgreSQLStatementParser.AlterSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequence(PostgreSQLStatementParser.AlterSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterSequenceClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequenceClauses(PostgreSQLStatementParser.AlterSequenceClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterSequenceClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequenceClauses(PostgreSQLStatementParser.AlterSequenceClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(PostgreSQLStatementParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(PostgreSQLStatementParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#foreignServerVersion}.
	 * @param ctx the parse tree
	 */
	void enterForeignServerVersion(PostgreSQLStatementParser.ForeignServerVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#foreignServerVersion}.
	 * @param ctx the parse tree
	 */
	void exitForeignServerVersion(PostgreSQLStatementParser.ForeignServerVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterStatistics}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatistics(PostgreSQLStatementParser.AlterStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterStatistics}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatistics(PostgreSQLStatementParser.AlterStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterSubscription}.
	 * @param ctx the parse tree
	 */
	void enterAlterSubscription(PostgreSQLStatementParser.AlterSubscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterSubscription}.
	 * @param ctx the parse tree
	 */
	void exitAlterSubscription(PostgreSQLStatementParser.AlterSubscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#publicationNameList}.
	 * @param ctx the parse tree
	 */
	void enterPublicationNameList(PostgreSQLStatementParser.PublicationNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#publicationNameList}.
	 * @param ctx the parse tree
	 */
	void exitPublicationNameList(PostgreSQLStatementParser.PublicationNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#publicationNameItem}.
	 * @param ctx the parse tree
	 */
	void enterPublicationNameItem(PostgreSQLStatementParser.PublicationNameItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#publicationNameItem}.
	 * @param ctx the parse tree
	 */
	void exitPublicationNameItem(PostgreSQLStatementParser.PublicationNameItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterSystem}.
	 * @param ctx the parse tree
	 */
	void enterAlterSystem(PostgreSQLStatementParser.AlterSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterSystem}.
	 * @param ctx the parse tree
	 */
	void exitAlterSystem(PostgreSQLStatementParser.AlterSystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(PostgreSQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(PostgreSQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchConfiguration(PostgreSQLStatementParser.AlterTextSearchConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchConfiguration(PostgreSQLStatementParser.AlterTextSearchConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchConfigurationClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchConfigurationClauses(PostgreSQLStatementParser.AlterTextSearchConfigurationClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchConfigurationClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchConfigurationClauses(PostgreSQLStatementParser.AlterTextSearchConfigurationClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#anyNameList}.
	 * @param ctx the parse tree
	 */
	void enterAnyNameList(PostgreSQLStatementParser.AnyNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#anyNameList}.
	 * @param ctx the parse tree
	 */
	void exitAnyNameList(PostgreSQLStatementParser.AnyNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchDictionary}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchDictionary(PostgreSQLStatementParser.AlterTextSearchDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchDictionary}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchDictionary(PostgreSQLStatementParser.AlterTextSearchDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchParser}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchParser(PostgreSQLStatementParser.AlterTextSearchParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchParser}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchParser(PostgreSQLStatementParser.AlterTextSearchParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchTemplate}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchTemplate(PostgreSQLStatementParser.AlterTextSearchTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchTemplate}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchTemplate(PostgreSQLStatementParser.AlterTextSearchTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterTrigger(PostgreSQLStatementParser.AlterTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterTrigger(PostgreSQLStatementParser.AlterTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterType}.
	 * @param ctx the parse tree
	 */
	void enterAlterType(PostgreSQLStatementParser.AlterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterType}.
	 * @param ctx the parse tree
	 */
	void exitAlterType(PostgreSQLStatementParser.AlterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTypeClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeClauses(PostgreSQLStatementParser.AlterTypeClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTypeClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeClauses(PostgreSQLStatementParser.AlterTypeClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTypeCmds}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeCmds(PostgreSQLStatementParser.AlterTypeCmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTypeCmds}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeCmds(PostgreSQLStatementParser.AlterTypeCmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTypeCmd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeCmd(PostgreSQLStatementParser.AlterTypeCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTypeCmd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeCmd(PostgreSQLStatementParser.AlterTypeCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeDefList}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefList(PostgreSQLStatementParser.TypeDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeDefList}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefList(PostgreSQLStatementParser.TypeDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeDefElem}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefElem(PostgreSQLStatementParser.TypeDefElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeDefElem}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefElem(PostgreSQLStatementParser.TypeDefElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#typeDefArg}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefArg(PostgreSQLStatementParser.TypeDefArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#typeDefArg}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefArg(PostgreSQLStatementParser.TypeDefArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMapping(PostgreSQLStatementParser.AlterUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMapping(PostgreSQLStatementParser.AlterUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#authIdent}.
	 * @param ctx the parse tree
	 */
	void enterAuthIdent(PostgreSQLStatementParser.AuthIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#authIdent}.
	 * @param ctx the parse tree
	 */
	void exitAuthIdent(PostgreSQLStatementParser.AuthIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(PostgreSQLStatementParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(PostgreSQLStatementParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewCmds}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewCmds(PostgreSQLStatementParser.AlterViewCmdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewCmds}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewCmds(PostgreSQLStatementParser.AlterViewCmdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterRenameView}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterRenameView(PostgreSQLStatementParser.AlterRenameViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterRenameView}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterRenameView(PostgreSQLStatementParser.AlterRenameViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterRenameColumn}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterRenameColumn(PostgreSQLStatementParser.AlterRenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterRenameColumn}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterRenameColumn(PostgreSQLStatementParser.AlterRenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterSetSchema}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterSetSchema(PostgreSQLStatementParser.AlterSetSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterSetSchema}
	 * labeled alternative in {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterSetSchema(PostgreSQLStatementParser.AlterSetSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(PostgreSQLStatementParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(PostgreSQLStatementParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#cluster}.
	 * @param ctx the parse tree
	 */
	void enterCluster(PostgreSQLStatementParser.ClusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#cluster}.
	 * @param ctx the parse tree
	 */
	void exitCluster(PostgreSQLStatementParser.ClusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#clusterVerboseSpecification}.
	 * @param ctx the parse tree
	 */
	void enterClusterVerboseSpecification(PostgreSQLStatementParser.ClusterVerboseSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#clusterVerboseSpecification}.
	 * @param ctx the parse tree
	 */
	void exitClusterVerboseSpecification(PostgreSQLStatementParser.ClusterVerboseSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#clusterIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterClusterIndexSpecification(PostgreSQLStatementParser.ClusterIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#clusterIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitClusterIndexSpecification(PostgreSQLStatementParser.ClusterIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#clusterVerboseOptionList}.
	 * @param ctx the parse tree
	 */
	void enterClusterVerboseOptionList(PostgreSQLStatementParser.ClusterVerboseOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#clusterVerboseOptionList}.
	 * @param ctx the parse tree
	 */
	void exitClusterVerboseOptionList(PostgreSQLStatementParser.ClusterVerboseOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#clusterVerboseOption}.
	 * @param ctx the parse tree
	 */
	void enterClusterVerboseOption(PostgreSQLStatementParser.ClusterVerboseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#clusterVerboseOption}.
	 * @param ctx the parse tree
	 */
	void exitClusterVerboseOption(PostgreSQLStatementParser.ClusterVerboseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(PostgreSQLStatementParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(PostgreSQLStatementParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#commentClauses}.
	 * @param ctx the parse tree
	 */
	void enterCommentClauses(PostgreSQLStatementParser.CommentClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#commentClauses}.
	 * @param ctx the parse tree
	 */
	void exitCommentClauses(PostgreSQLStatementParser.CommentClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#objectTypeNameOnAnyName}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeNameOnAnyName(PostgreSQLStatementParser.ObjectTypeNameOnAnyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#objectTypeNameOnAnyName}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeNameOnAnyName(PostgreSQLStatementParser.ObjectTypeNameOnAnyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#objectTypeName}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeName(PostgreSQLStatementParser.ObjectTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#objectTypeName}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeName(PostgreSQLStatementParser.ObjectTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDropTypeName(PostgreSQLStatementParser.DropTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDropTypeName(PostgreSQLStatementParser.DropTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#objectTypeAnyName}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeAnyName(PostgreSQLStatementParser.ObjectTypeAnyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#objectTypeAnyName}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeAnyName(PostgreSQLStatementParser.ObjectTypeAnyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(PostgreSQLStatementParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(PostgreSQLStatementParser.CommentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createAccessMethod}.
	 * @param ctx the parse tree
	 */
	void enterCreateAccessMethod(PostgreSQLStatementParser.CreateAccessMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createAccessMethod}.
	 * @param ctx the parse tree
	 */
	void exitCreateAccessMethod(PostgreSQLStatementParser.CreateAccessMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void enterCreateAggregate(PostgreSQLStatementParser.CreateAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void exitCreateAggregate(PostgreSQLStatementParser.CreateAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#oldAggrDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOldAggrDefinition(PostgreSQLStatementParser.OldAggrDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#oldAggrDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOldAggrDefinition(PostgreSQLStatementParser.OldAggrDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#oldAggrList}.
	 * @param ctx the parse tree
	 */
	void enterOldAggrList(PostgreSQLStatementParser.OldAggrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#oldAggrList}.
	 * @param ctx the parse tree
	 */
	void exitOldAggrList(PostgreSQLStatementParser.OldAggrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#oldAggrElem}.
	 * @param ctx the parse tree
	 */
	void enterOldAggrElem(PostgreSQLStatementParser.OldAggrElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#oldAggrElem}.
	 * @param ctx the parse tree
	 */
	void exitOldAggrElem(PostgreSQLStatementParser.OldAggrElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createCast}.
	 * @param ctx the parse tree
	 */
	void enterCreateCast(PostgreSQLStatementParser.CreateCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createCast}.
	 * @param ctx the parse tree
	 */
	void exitCreateCast(PostgreSQLStatementParser.CreateCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#castContext}.
	 * @param ctx the parse tree
	 */
	void enterCastContext(PostgreSQLStatementParser.CastContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#castContext}.
	 * @param ctx the parse tree
	 */
	void exitCastContext(PostgreSQLStatementParser.CastContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void enterCreateCollation(PostgreSQLStatementParser.CreateCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void exitCreateCollation(PostgreSQLStatementParser.CreateCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createConversion}.
	 * @param ctx the parse tree
	 */
	void enterCreateConversion(PostgreSQLStatementParser.CreateConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createConversion}.
	 * @param ctx the parse tree
	 */
	void exitCreateConversion(PostgreSQLStatementParser.CreateConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createDomain}.
	 * @param ctx the parse tree
	 */
	void enterCreateDomain(PostgreSQLStatementParser.CreateDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createDomain}.
	 * @param ctx the parse tree
	 */
	void exitCreateDomain(PostgreSQLStatementParser.CreateDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateEventTrigger(PostgreSQLStatementParser.CreateEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateEventTrigger(PostgreSQLStatementParser.CreateEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerWhenList}.
	 * @param ctx the parse tree
	 */
	void enterEventTriggerWhenList(PostgreSQLStatementParser.EventTriggerWhenListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerWhenList}.
	 * @param ctx the parse tree
	 */
	void exitEventTriggerWhenList(PostgreSQLStatementParser.EventTriggerWhenListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerWhenItem}.
	 * @param ctx the parse tree
	 */
	void enterEventTriggerWhenItem(PostgreSQLStatementParser.EventTriggerWhenItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerWhenItem}.
	 * @param ctx the parse tree
	 */
	void exitEventTriggerWhenItem(PostgreSQLStatementParser.EventTriggerWhenItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerValueList}.
	 * @param ctx the parse tree
	 */
	void enterEventTriggerValueList(PostgreSQLStatementParser.EventTriggerValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerValueList}.
	 * @param ctx the parse tree
	 */
	void exitEventTriggerValueList(PostgreSQLStatementParser.EventTriggerValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createExtension}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtension(PostgreSQLStatementParser.CreateExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createExtension}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtension(PostgreSQLStatementParser.CreateExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtensionOptList(PostgreSQLStatementParser.CreateExtensionOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtensionOptList(PostgreSQLStatementParser.CreateExtensionOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtensionOptItem(PostgreSQLStatementParser.CreateExtensionOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtensionOptItem(PostgreSQLStatementParser.CreateExtensionOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignDataWrapper(PostgreSQLStatementParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignDataWrapper(PostgreSQLStatementParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createForeignTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignTable(PostgreSQLStatementParser.CreateForeignTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createForeignTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignTable(PostgreSQLStatementParser.CreateForeignTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignTableClauses(PostgreSQLStatementParser.CreateForeignTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignTableClauses(PostgreSQLStatementParser.CreateForeignTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(PostgreSQLStatementParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(PostgreSQLStatementParser.TableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(PostgreSQLStatementParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(PostgreSQLStatementParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeClause(PostgreSQLStatementParser.TableLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeClause(PostgreSQLStatementParser.TableLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOptionList(PostgreSQLStatementParser.TableLikeOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOptionList(PostgreSQLStatementParser.TableLikeOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOption(PostgreSQLStatementParser.TableLikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOption(PostgreSQLStatementParser.TableLikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(PostgreSQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(PostgreSQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableFuncColumnList}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncColumnList(PostgreSQLStatementParser.TableFuncColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncColumnList}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncColumnList(PostgreSQLStatementParser.TableFuncColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableFuncColumn}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncColumn(PostgreSQLStatementParser.TableFuncColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncColumn}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncColumn(PostgreSQLStatementParser.TableFuncColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createfuncOptList}.
	 * @param ctx the parse tree
	 */
	void enterCreatefuncOptList(PostgreSQLStatementParser.CreatefuncOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createfuncOptList}.
	 * @param ctx the parse tree
	 */
	void exitCreatefuncOptList(PostgreSQLStatementParser.CreatefuncOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createfuncOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCreatefuncOptItem(PostgreSQLStatementParser.CreatefuncOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createfuncOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCreatefuncOptItem(PostgreSQLStatementParser.CreatefuncOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#transformTypeList}.
	 * @param ctx the parse tree
	 */
	void enterTransformTypeList(PostgreSQLStatementParser.TransformTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#transformTypeList}.
	 * @param ctx the parse tree
	 */
	void exitTransformTypeList(PostgreSQLStatementParser.TransformTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcAs}.
	 * @param ctx the parse tree
	 */
	void enterFuncAs(PostgreSQLStatementParser.FuncAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcAs}.
	 * @param ctx the parse tree
	 */
	void exitFuncAs(PostgreSQLStatementParser.FuncAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturn(PostgreSQLStatementParser.FuncReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturn(PostgreSQLStatementParser.FuncReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArgsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgsWithDefaults(PostgreSQLStatementParser.FuncArgsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArgsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgsWithDefaults(PostgreSQLStatementParser.FuncArgsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArgsWithDefaultsList}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgsWithDefaultsList(PostgreSQLStatementParser.FuncArgsWithDefaultsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArgsWithDefaultsList}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgsWithDefaultsList(PostgreSQLStatementParser.FuncArgsWithDefaultsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#funcArgWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgWithDefault(PostgreSQLStatementParser.FuncArgWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#funcArgWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgWithDefault(PostgreSQLStatementParser.FuncArgWithDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createLanguage}.
	 * @param ctx the parse tree
	 */
	void enterCreateLanguage(PostgreSQLStatementParser.CreateLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createLanguage}.
	 * @param ctx the parse tree
	 */
	void exitCreateLanguage(PostgreSQLStatementParser.CreateLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#transformElementList}.
	 * @param ctx the parse tree
	 */
	void enterTransformElementList(PostgreSQLStatementParser.TransformElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#transformElementList}.
	 * @param ctx the parse tree
	 */
	void exitTransformElementList(PostgreSQLStatementParser.TransformElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#validatorClause}.
	 * @param ctx the parse tree
	 */
	void enterValidatorClause(PostgreSQLStatementParser.ValidatorClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#validatorClause}.
	 * @param ctx the parse tree
	 */
	void exitValidatorClause(PostgreSQLStatementParser.ValidatorClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createPolicy}.
	 * @param ctx the parse tree
	 */
	void enterCreatePolicy(PostgreSQLStatementParser.CreatePolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createPolicy}.
	 * @param ctx the parse tree
	 */
	void exitCreatePolicy(PostgreSQLStatementParser.CreatePolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(PostgreSQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(PostgreSQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createPublication}.
	 * @param ctx the parse tree
	 */
	void enterCreatePublication(PostgreSQLStatementParser.CreatePublicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createPublication}.
	 * @param ctx the parse tree
	 */
	void exitCreatePublication(PostgreSQLStatementParser.CreatePublicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#publicationForTables}.
	 * @param ctx the parse tree
	 */
	void enterPublicationForTables(PostgreSQLStatementParser.PublicationForTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#publicationForTables}.
	 * @param ctx the parse tree
	 */
	void exitPublicationForTables(PostgreSQLStatementParser.PublicationForTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateRule(PostgreSQLStatementParser.CreateRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateRule(PostgreSQLStatementParser.CreateRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionList(PostgreSQLStatementParser.RuleActionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionList(PostgreSQLStatementParser.RuleActionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionStmt(PostgreSQLStatementParser.RuleActionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionStmt(PostgreSQLStatementParser.RuleActionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionMulti(PostgreSQLStatementParser.RuleActionMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionMulti(PostgreSQLStatementParser.RuleActionMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(PostgreSQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(PostgreSQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvents(PostgreSQLStatementParser.TriggerEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvents(PostgreSQLStatementParser.TriggerEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOneEvent(PostgreSQLStatementParser.TriggerOneEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOneEvent(PostgreSQLStatementParser.TriggerOneEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerActionTime(PostgreSQLStatementParser.TriggerActionTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerActionTime(PostgreSQLStatementParser.TriggerActionTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArgs(PostgreSQLStatementParser.TriggerFuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArgs(PostgreSQLStatementParser.TriggerFuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArg(PostgreSQLStatementParser.TriggerFuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArg(PostgreSQLStatementParser.TriggerFuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void enterTriggerWhen(PostgreSQLStatementParser.TriggerWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void exitTriggerWhen(PostgreSQLStatementParser.TriggerWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForSpec(PostgreSQLStatementParser.TriggerForSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForSpec(PostgreSQLStatementParser.TriggerForSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerReferencing}.
	 * @param ctx the parse tree
	 */
	void enterTriggerReferencing(PostgreSQLStatementParser.TriggerReferencingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerReferencing}.
	 * @param ctx the parse tree
	 */
	void exitTriggerReferencing(PostgreSQLStatementParser.TriggerReferencingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerTransitions}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTransitions(PostgreSQLStatementParser.TriggerTransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerTransitions}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTransitions(PostgreSQLStatementParser.TriggerTransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#triggerTransition}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTransition(PostgreSQLStatementParser.TriggerTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#triggerTransition}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTransition(PostgreSQLStatementParser.TriggerTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#transitionRelName}.
	 * @param ctx the parse tree
	 */
	void enterTransitionRelName(PostgreSQLStatementParser.TransitionRelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#transitionRelName}.
	 * @param ctx the parse tree
	 */
	void exitTransitionRelName(PostgreSQLStatementParser.TransitionRelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#transitionRowOrTable}.
	 * @param ctx the parse tree
	 */
	void enterTransitionRowOrTable(PostgreSQLStatementParser.TransitionRowOrTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#transitionRowOrTable}.
	 * @param ctx the parse tree
	 */
	void exitTransitionRowOrTable(PostgreSQLStatementParser.TransitionRowOrTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#transitionOldOrNew}.
	 * @param ctx the parse tree
	 */
	void enterTransitionOldOrNew(PostgreSQLStatementParser.TransitionOldOrNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#transitionOldOrNew}.
	 * @param ctx the parse tree
	 */
	void exitTransitionOldOrNew(PostgreSQLStatementParser.TransitionOldOrNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequence(PostgreSQLStatementParser.CreateSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequence(PostgreSQLStatementParser.CreateSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tempOption}.
	 * @param ctx the parse tree
	 */
	void enterTempOption(PostgreSQLStatementParser.TempOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tempOption}.
	 * @param ctx the parse tree
	 */
	void exitTempOption(PostgreSQLStatementParser.TempOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(PostgreSQLStatementParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(PostgreSQLStatementParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createStatistics}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatistics(PostgreSQLStatementParser.CreateStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createStatistics}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatistics(PostgreSQLStatementParser.CreateStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createSubscription}.
	 * @param ctx the parse tree
	 */
	void enterCreateSubscription(PostgreSQLStatementParser.CreateSubscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createSubscription}.
	 * @param ctx the parse tree
	 */
	void exitCreateSubscription(PostgreSQLStatementParser.CreateSubscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespace(PostgreSQLStatementParser.CreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespace(PostgreSQLStatementParser.CreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTextSearch}.
	 * @param ctx the parse tree
	 */
	void enterCreateTextSearch(PostgreSQLStatementParser.CreateTextSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTextSearch}.
	 * @param ctx the parse tree
	 */
	void exitCreateTextSearch(PostgreSQLStatementParser.CreateTextSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTransform}.
	 * @param ctx the parse tree
	 */
	void enterCreateTransform(PostgreSQLStatementParser.CreateTransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTransform}.
	 * @param ctx the parse tree
	 */
	void exitCreateTransform(PostgreSQLStatementParser.CreateTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createType}.
	 * @param ctx the parse tree
	 */
	void enterCreateType(PostgreSQLStatementParser.CreateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createType}.
	 * @param ctx the parse tree
	 */
	void exitCreateType(PostgreSQLStatementParser.CreateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTypeClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeClauses(PostgreSQLStatementParser.CreateTypeClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTypeClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeClauses(PostgreSQLStatementParser.CreateTypeClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#enumValList}.
	 * @param ctx the parse tree
	 */
	void enterEnumValList(PostgreSQLStatementParser.EnumValListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#enumValList}.
	 * @param ctx the parse tree
	 */
	void exitEnumValList(PostgreSQLStatementParser.EnumValListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMapping(PostgreSQLStatementParser.CreateUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMapping(PostgreSQLStatementParser.CreateUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscard(PostgreSQLStatementParser.DiscardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscard(PostgreSQLStatementParser.DiscardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropAccessMethod}.
	 * @param ctx the parse tree
	 */
	void enterDropAccessMethod(PostgreSQLStatementParser.DropAccessMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropAccessMethod}.
	 * @param ctx the parse tree
	 */
	void exitDropAccessMethod(PostgreSQLStatementParser.DropAccessMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void enterDropAggregate(PostgreSQLStatementParser.DropAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void exitDropAggregate(PostgreSQLStatementParser.DropAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggregateWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWithArgtypesList(PostgreSQLStatementParser.AggregateWithArgtypesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggregateWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWithArgtypesList(PostgreSQLStatementParser.AggregateWithArgtypesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropCast}.
	 * @param ctx the parse tree
	 */
	void enterDropCast(PostgreSQLStatementParser.DropCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropCast}.
	 * @param ctx the parse tree
	 */
	void exitDropCast(PostgreSQLStatementParser.DropCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropCollation}.
	 * @param ctx the parse tree
	 */
	void enterDropCollation(PostgreSQLStatementParser.DropCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropCollation}.
	 * @param ctx the parse tree
	 */
	void exitDropCollation(PostgreSQLStatementParser.DropCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropConversion}.
	 * @param ctx the parse tree
	 */
	void enterDropConversion(PostgreSQLStatementParser.DropConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropConversion}.
	 * @param ctx the parse tree
	 */
	void exitDropConversion(PostgreSQLStatementParser.DropConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropDomain}.
	 * @param ctx the parse tree
	 */
	void enterDropDomain(PostgreSQLStatementParser.DropDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropDomain}.
	 * @param ctx the parse tree
	 */
	void exitDropDomain(PostgreSQLStatementParser.DropDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropEventTrigger(PostgreSQLStatementParser.DropEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropEventTrigger(PostgreSQLStatementParser.DropEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropExtension}.
	 * @param ctx the parse tree
	 */
	void enterDropExtension(PostgreSQLStatementParser.DropExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropExtension}.
	 * @param ctx the parse tree
	 */
	void exitDropExtension(PostgreSQLStatementParser.DropExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterDropForeignDataWrapper(PostgreSQLStatementParser.DropForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitDropForeignDataWrapper(PostgreSQLStatementParser.DropForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropForeignTable}.
	 * @param ctx the parse tree
	 */
	void enterDropForeignTable(PostgreSQLStatementParser.DropForeignTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropForeignTable}.
	 * @param ctx the parse tree
	 */
	void exitDropForeignTable(PostgreSQLStatementParser.DropForeignTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(PostgreSQLStatementParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(PostgreSQLStatementParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#functionWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithArgtypesList(PostgreSQLStatementParser.FunctionWithArgtypesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#functionWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithArgtypesList(PostgreSQLStatementParser.FunctionWithArgtypesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropLanguage}.
	 * @param ctx the parse tree
	 */
	void enterDropLanguage(PostgreSQLStatementParser.DropLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropLanguage}.
	 * @param ctx the parse tree
	 */
	void exitDropLanguage(PostgreSQLStatementParser.DropLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterDropMaterializedView(PostgreSQLStatementParser.DropMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitDropMaterializedView(PostgreSQLStatementParser.DropMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropOperator}.
	 * @param ctx the parse tree
	 */
	void enterDropOperator(PostgreSQLStatementParser.DropOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropOperator}.
	 * @param ctx the parse tree
	 */
	void exitDropOperator(PostgreSQLStatementParser.DropOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#operatorWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void enterOperatorWithArgtypesList(PostgreSQLStatementParser.OperatorWithArgtypesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#operatorWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void exitOperatorWithArgtypesList(PostgreSQLStatementParser.OperatorWithArgtypesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropOperatorClass}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorClass(PostgreSQLStatementParser.DropOperatorClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropOperatorClass}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorClass(PostgreSQLStatementParser.DropOperatorClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorFamily(PostgreSQLStatementParser.DropOperatorFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorFamily(PostgreSQLStatementParser.DropOperatorFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropOwned}.
	 * @param ctx the parse tree
	 */
	void enterDropOwned(PostgreSQLStatementParser.DropOwnedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropOwned}.
	 * @param ctx the parse tree
	 */
	void exitDropOwned(PostgreSQLStatementParser.DropOwnedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropPolicy}.
	 * @param ctx the parse tree
	 */
	void enterDropPolicy(PostgreSQLStatementParser.DropPolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropPolicy}.
	 * @param ctx the parse tree
	 */
	void exitDropPolicy(PostgreSQLStatementParser.DropPolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(PostgreSQLStatementParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(PostgreSQLStatementParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropPublication}.
	 * @param ctx the parse tree
	 */
	void enterDropPublication(PostgreSQLStatementParser.DropPublicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropPublication}.
	 * @param ctx the parse tree
	 */
	void exitDropPublication(PostgreSQLStatementParser.DropPublicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropRoutine}.
	 * @param ctx the parse tree
	 */
	void enterDropRoutine(PostgreSQLStatementParser.DropRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropRoutine}.
	 * @param ctx the parse tree
	 */
	void exitDropRoutine(PostgreSQLStatementParser.DropRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropRule}.
	 * @param ctx the parse tree
	 */
	void enterDropRule(PostgreSQLStatementParser.DropRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropRule}.
	 * @param ctx the parse tree
	 */
	void exitDropRule(PostgreSQLStatementParser.DropRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 */
	void enterDropSequence(PostgreSQLStatementParser.DropSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 */
	void exitDropSequence(PostgreSQLStatementParser.DropSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(PostgreSQLStatementParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(PostgreSQLStatementParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropStatistics}.
	 * @param ctx the parse tree
	 */
	void enterDropStatistics(PostgreSQLStatementParser.DropStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropStatistics}.
	 * @param ctx the parse tree
	 */
	void exitDropStatistics(PostgreSQLStatementParser.DropStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropSubscription}.
	 * @param ctx the parse tree
	 */
	void enterDropSubscription(PostgreSQLStatementParser.DropSubscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropSubscription}.
	 * @param ctx the parse tree
	 */
	void exitDropSubscription(PostgreSQLStatementParser.DropSubscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(PostgreSQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(PostgreSQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTextSearch}.
	 * @param ctx the parse tree
	 */
	void enterDropTextSearch(PostgreSQLStatementParser.DropTextSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTextSearch}.
	 * @param ctx the parse tree
	 */
	void exitDropTextSearch(PostgreSQLStatementParser.DropTextSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTransform}.
	 * @param ctx the parse tree
	 */
	void enterDropTransform(PostgreSQLStatementParser.DropTransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTransform}.
	 * @param ctx the parse tree
	 */
	void exitDropTransform(PostgreSQLStatementParser.DropTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(PostgreSQLStatementParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(PostgreSQLStatementParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropType}.
	 * @param ctx the parse tree
	 */
	void enterDropType(PostgreSQLStatementParser.DropTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropType}.
	 * @param ctx the parse tree
	 */
	void exitDropType(PostgreSQLStatementParser.DropTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterDropUserMapping(PostgreSQLStatementParser.DropUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitDropUserMapping(PostgreSQLStatementParser.DropUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(PostgreSQLStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(PostgreSQLStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#importForeignSchema}.
	 * @param ctx the parse tree
	 */
	void enterImportForeignSchema(PostgreSQLStatementParser.ImportForeignSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#importForeignSchema}.
	 * @param ctx the parse tree
	 */
	void exitImportForeignSchema(PostgreSQLStatementParser.ImportForeignSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#importQualification}.
	 * @param ctx the parse tree
	 */
	void enterImportQualification(PostgreSQLStatementParser.ImportQualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#importQualification}.
	 * @param ctx the parse tree
	 */
	void exitImportQualification(PostgreSQLStatementParser.ImportQualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#importQualificationType}.
	 * @param ctx the parse tree
	 */
	void enterImportQualificationType(PostgreSQLStatementParser.ImportQualificationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#importQualificationType}.
	 * @param ctx the parse tree
	 */
	void exitImportQualificationType(PostgreSQLStatementParser.ImportQualificationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(PostgreSQLStatementParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(PostgreSQLStatementParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 */
	void enterCursorOption(PostgreSQLStatementParser.CursorOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 */
	void exitCursorOption(PostgreSQLStatementParser.CursorOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(PostgreSQLStatementParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(PostgreSQLStatementParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#usingValueClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingValueClause(PostgreSQLStatementParser.UsingValueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#usingValueClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingValueClause(PostgreSQLStatementParser.UsingValueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PostgreSQLStatementParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PostgreSQLStatementParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#usingSqlDescriptorClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingSqlDescriptorClause(PostgreSQLStatementParser.UsingSqlDescriptorClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#usingSqlDescriptorClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingSqlDescriptorClause(PostgreSQLStatementParser.UsingSqlDescriptorClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#descriptorName}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorName(PostgreSQLStatementParser.DescriptorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#descriptorName}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorName(PostgreSQLStatementParser.DescriptorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(PostgreSQLStatementParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(PostgreSQLStatementParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#fetch}.
	 * @param ctx the parse tree
	 */
	void enterFetch(PostgreSQLStatementParser.FetchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#fetch}.
	 * @param ctx the parse tree
	 */
	void exitFetch(PostgreSQLStatementParser.FetchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#listen}.
	 * @param ctx the parse tree
	 */
	void enterListen(PostgreSQLStatementParser.ListenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#listen}.
	 * @param ctx the parse tree
	 */
	void exitListen(PostgreSQLStatementParser.ListenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#unlisten}.
	 * @param ctx the parse tree
	 */
	void enterUnlisten(PostgreSQLStatementParser.UnlistenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#unlisten}.
	 * @param ctx the parse tree
	 */
	void exitUnlisten(PostgreSQLStatementParser.UnlistenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStmt(PostgreSQLStatementParser.NotifyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStmt(PostgreSQLStatementParser.NotifyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code next}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterNext(PostgreSQLStatementParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code next}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitNext(PostgreSQLStatementParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prior}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterPrior(PostgreSQLStatementParser.PriorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prior}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitPrior(PostgreSQLStatementParser.PriorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterFirst(PostgreSQLStatementParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitFirst(PostgreSQLStatementParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterLast(PostgreSQLStatementParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitLast(PostgreSQLStatementParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absoluteCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteCount(PostgreSQLStatementParser.AbsoluteCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absoluteCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteCount(PostgreSQLStatementParser.AbsoluteCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterRelativeCount(PostgreSQLStatementParser.RelativeCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitRelativeCount(PostgreSQLStatementParser.RelativeCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code count}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterCount(PostgreSQLStatementParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code count}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitCount(PostgreSQLStatementParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code all}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterAll(PostgreSQLStatementParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code all}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitAll(PostgreSQLStatementParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forward}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterForward(PostgreSQLStatementParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitForward(PostgreSQLStatementParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forwardCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterForwardCount(PostgreSQLStatementParser.ForwardCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forwardCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitForwardCount(PostgreSQLStatementParser.ForwardCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forwardAll}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterForwardAll(PostgreSQLStatementParser.ForwardAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forwardAll}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitForwardAll(PostgreSQLStatementParser.ForwardAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backward}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterBackward(PostgreSQLStatementParser.BackwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitBackward(PostgreSQLStatementParser.BackwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backwardCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterBackwardCount(PostgreSQLStatementParser.BackwardCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backwardCount}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitBackwardCount(PostgreSQLStatementParser.BackwardCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backwardAll}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterBackwardAll(PostgreSQLStatementParser.BackwardAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backwardAll}
	 * labeled alternative in {@link PostgreSQLStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitBackwardAll(PostgreSQLStatementParser.BackwardAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void enterPrepare(PostgreSQLStatementParser.PrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void exitPrepare(PostgreSQLStatementParser.PrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reindex}.
	 * @param ctx the parse tree
	 */
	void enterReindex(PostgreSQLStatementParser.ReindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reindex}.
	 * @param ctx the parse tree
	 */
	void exitReindex(PostgreSQLStatementParser.ReindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reIndexClauses}.
	 * @param ctx the parse tree
	 */
	void enterReIndexClauses(PostgreSQLStatementParser.ReIndexClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reIndexClauses}.
	 * @param ctx the parse tree
	 */
	void exitReIndexClauses(PostgreSQLStatementParser.ReIndexClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reindexOptionList}.
	 * @param ctx the parse tree
	 */
	void enterReindexOptionList(PostgreSQLStatementParser.ReindexOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reindexOptionList}.
	 * @param ctx the parse tree
	 */
	void exitReindexOptionList(PostgreSQLStatementParser.ReindexOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reindexOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterReindexOptionElem(PostgreSQLStatementParser.ReindexOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reindexOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitReindexOptionElem(PostgreSQLStatementParser.ReindexOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reindexTargetMultitable}.
	 * @param ctx the parse tree
	 */
	void enterReindexTargetMultitable(PostgreSQLStatementParser.ReindexTargetMultitableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reindexTargetMultitable}.
	 * @param ctx the parse tree
	 */
	void exitReindexTargetMultitable(PostgreSQLStatementParser.ReindexTargetMultitableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#reindexTargetType}.
	 * @param ctx the parse tree
	 */
	void enterReindexTargetType(PostgreSQLStatementParser.ReindexTargetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#reindexTargetType}.
	 * @param ctx the parse tree
	 */
	void exitReindexTargetType(PostgreSQLStatementParser.ReindexTargetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate(PostgreSQLStatementParser.DeallocateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate(PostgreSQLStatementParser.DeallocateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#prepTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrepTypeClause(PostgreSQLStatementParser.PrepTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#prepTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrepTypeClause(PostgreSQLStatementParser.PrepTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#refreshMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterRefreshMaterializedView(PostgreSQLStatementParser.RefreshMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#refreshMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitRefreshMaterializedView(PostgreSQLStatementParser.RefreshMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterForeignTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignTable(PostgreSQLStatementParser.AlterForeignTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignTable(PostgreSQLStatementParser.AlterForeignTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignTableClauses(PostgreSQLStatementParser.AlterForeignTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignTableClauses(PostgreSQLStatementParser.AlterForeignTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createOperator}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperator(PostgreSQLStatementParser.CreateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createOperator}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperator(PostgreSQLStatementParser.CreateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createOperatorClass}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorClass(PostgreSQLStatementParser.CreateOperatorClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createOperatorClass}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorClass(PostgreSQLStatementParser.CreateOperatorClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorFamily(PostgreSQLStatementParser.CreateOperatorFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorFamily(PostgreSQLStatementParser.CreateOperatorFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchema(PostgreSQLStatementParser.CreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchema(PostgreSQLStatementParser.CreateSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createSchemaClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchemaClauses(PostgreSQLStatementParser.CreateSchemaClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createSchemaClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchemaClauses(PostgreSQLStatementParser.CreateSchemaClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#schemaEltList}.
	 * @param ctx the parse tree
	 */
	void enterSchemaEltList(PostgreSQLStatementParser.SchemaEltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#schemaEltList}.
	 * @param ctx the parse tree
	 */
	void exitSchemaEltList(PostgreSQLStatementParser.SchemaEltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#schemaStmt}.
	 * @param ctx the parse tree
	 */
	void enterSchemaStmt(PostgreSQLStatementParser.SchemaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#schemaStmt}.
	 * @param ctx the parse tree
	 */
	void exitSchemaStmt(PostgreSQLStatementParser.SchemaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#securityLabelStmt}.
	 * @param ctx the parse tree
	 */
	void enterSecurityLabelStmt(PostgreSQLStatementParser.SecurityLabelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#securityLabelStmt}.
	 * @param ctx the parse tree
	 */
	void exitSecurityLabelStmt(PostgreSQLStatementParser.SecurityLabelStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#securityLabel}.
	 * @param ctx the parse tree
	 */
	void enterSecurityLabel(PostgreSQLStatementParser.SecurityLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#securityLabel}.
	 * @param ctx the parse tree
	 */
	void exitSecurityLabel(PostgreSQLStatementParser.SecurityLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#securityLabelClausces}.
	 * @param ctx the parse tree
	 */
	void enterSecurityLabelClausces(PostgreSQLStatementParser.SecurityLabelClauscesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#securityLabelClausces}.
	 * @param ctx the parse tree
	 */
	void exitSecurityLabelClausces(PostgreSQLStatementParser.SecurityLabelClauscesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeClause(PostgreSQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeClause(PostgreSQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#roleClause}.
	 * @param ctx the parse tree
	 */
	void enterRoleClause(PostgreSQLStatementParser.RoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#roleClause}.
	 * @param ctx the parse tree
	 */
	void exitRoleClause(PostgreSQLStatementParser.RoleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilegeTypes}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeTypes(PostgreSQLStatementParser.PrivilegeTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilegeTypes}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeTypes(PostgreSQLStatementParser.PrivilegeTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(PostgreSQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(PostgreSQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#numericOnlyList}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnlyList(PostgreSQLStatementParser.NumericOnlyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#numericOnlyList}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnlyList(PostgreSQLStatementParser.NumericOnlyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeLevel(PostgreSQLStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeLevel(PostgreSQLStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(PostgreSQLStatementParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(PostgreSQLStatementParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType(PostgreSQLStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType(PostgreSQLStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void enterAlterSchema(PostgreSQLStatementParser.AlterSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void exitAlterSchema(PostgreSQLStatementParser.AlterSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void enterDropSchema(PostgreSQLStatementParser.DropSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void exitDropSchema(PostgreSQLStatementParser.DropSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(PostgreSQLStatementParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(PostgreSQLStatementParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PostgreSQLStatementParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PostgreSQLStatementParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#runtimeScope}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeScope(PostgreSQLStatementParser.RuntimeScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#runtimeScope}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeScope(PostgreSQLStatementParser.RuntimeScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#timeZoneClause}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneClause(PostgreSQLStatementParser.TimeZoneClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#timeZoneClause}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneClause(PostgreSQLStatementParser.TimeZoneClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationParameterClause(PostgreSQLStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationParameterClause(PostgreSQLStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 */
	void enterResetParameter(PostgreSQLStatementParser.ResetParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 */
	void exitResetParameter(PostgreSQLStatementParser.ResetParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(PostgreSQLStatementParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(PostgreSQLStatementParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStmt(PostgreSQLStatementParser.ExplainableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStmt(PostgreSQLStatementParser.ExplainableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#explainOptionList}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionList(PostgreSQLStatementParser.ExplainOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionList}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionList(PostgreSQLStatementParser.ExplainOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#explainOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionElem(PostgreSQLStatementParser.ExplainOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionElem(PostgreSQLStatementParser.ExplainOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#explainOptionArg}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionArg(PostgreSQLStatementParser.ExplainOptionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionArg}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionArg(PostgreSQLStatementParser.ExplainOptionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#explainOptionName}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionName(PostgreSQLStatementParser.ExplainOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionName}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionName(PostgreSQLStatementParser.ExplainOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#analyzeKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeKeyword(PostgreSQLStatementParser.AnalyzeKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#analyzeKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeKeyword(PostgreSQLStatementParser.AnalyzeKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(PostgreSQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(PostgreSQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#vacuumRelationList}.
	 * @param ctx the parse tree
	 */
	void enterVacuumRelationList(PostgreSQLStatementParser.VacuumRelationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#vacuumRelationList}.
	 * @param ctx the parse tree
	 */
	void exitVacuumRelationList(PostgreSQLStatementParser.VacuumRelationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#vacuumRelation}.
	 * @param ctx the parse tree
	 */
	void enterVacuumRelation(PostgreSQLStatementParser.VacuumRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#vacuumRelation}.
	 * @param ctx the parse tree
	 */
	void exitVacuumRelation(PostgreSQLStatementParser.VacuumRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionList}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionList(PostgreSQLStatementParser.VacAnalyzeOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionList}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionList(PostgreSQLStatementParser.VacAnalyzeOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionElem(PostgreSQLStatementParser.VacAnalyzeOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionElem(PostgreSQLStatementParser.VacAnalyzeOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionArg}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionArg(PostgreSQLStatementParser.VacAnalyzeOptionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionArg}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionArg(PostgreSQLStatementParser.VacAnalyzeOptionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionName}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionName(PostgreSQLStatementParser.VacAnalyzeOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionName}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionName(PostgreSQLStatementParser.VacAnalyzeOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(PostgreSQLStatementParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(PostgreSQLStatementParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#vacuum}.
	 * @param ctx the parse tree
	 */
	void enterVacuum(PostgreSQLStatementParser.VacuumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#vacuum}.
	 * @param ctx the parse tree
	 */
	void exitVacuum(PostgreSQLStatementParser.VacuumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PostgreSQLStatementParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PostgreSQLStatementParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(PostgreSQLStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(PostgreSQLStatementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void enterCallArguments(PostgreSQLStatementParser.CallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void exitCallArguments(PostgreSQLStatementParser.CallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void enterCallArgument(PostgreSQLStatementParser.CallArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void exitCallArgument(PostgreSQLStatementParser.CallArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#positionalNotation}.
	 * @param ctx the parse tree
	 */
	void enterPositionalNotation(PostgreSQLStatementParser.PositionalNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#positionalNotation}.
	 * @param ctx the parse tree
	 */
	void exitPositionalNotation(PostgreSQLStatementParser.PositionalNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#namedNotation}.
	 * @param ctx the parse tree
	 */
	void enterNamedNotation(PostgreSQLStatementParser.NamedNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#namedNotation}.
	 * @param ctx the parse tree
	 */
	void exitNamedNotation(PostgreSQLStatementParser.NamedNotationContext ctx);
}