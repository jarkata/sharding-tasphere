// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/opengauss/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/OpenGaussStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OpenGaussStatementParser}.
 */
public interface OpenGaussStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(OpenGaussStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(OpenGaussStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(OpenGaussStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(OpenGaussStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(OpenGaussStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(OpenGaussStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(OpenGaussStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(OpenGaussStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(OpenGaussStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(OpenGaussStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#abort}.
	 * @param ctx the parse tree
	 */
	void enterAbort(OpenGaussStatementParser.AbortContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#abort}.
	 * @param ctx the parse tree
	 */
	void exitAbort(OpenGaussStatementParser.AbortContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(OpenGaussStatementParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(OpenGaussStatementParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(OpenGaussStatementParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(OpenGaussStatementParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(OpenGaussStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(OpenGaussStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void enterReleaseSavepoint(OpenGaussStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 */
	void exitReleaseSavepoint(OpenGaussStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rollbackToSavepoint}.
	 * @param ctx the parse tree
	 */
	void enterRollbackToSavepoint(OpenGaussStatementParser.RollbackToSavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rollbackToSavepoint}.
	 * @param ctx the parse tree
	 */
	void exitRollbackToSavepoint(OpenGaussStatementParser.RollbackToSavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#prepareTransaction}.
	 * @param ctx the parse tree
	 */
	void enterPrepareTransaction(OpenGaussStatementParser.PrepareTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#prepareTransaction}.
	 * @param ctx the parse tree
	 */
	void exitPrepareTransaction(OpenGaussStatementParser.PrepareTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#commitPrepared}.
	 * @param ctx the parse tree
	 */
	void enterCommitPrepared(OpenGaussStatementParser.CommitPreparedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#commitPrepared}.
	 * @param ctx the parse tree
	 */
	void exitCommitPrepared(OpenGaussStatementParser.CommitPreparedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rollbackPrepared}.
	 * @param ctx the parse tree
	 */
	void enterRollbackPrepared(OpenGaussStatementParser.RollbackPreparedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rollbackPrepared}.
	 * @param ctx the parse tree
	 */
	void exitRollbackPrepared(OpenGaussStatementParser.RollbackPreparedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setConstraints}.
	 * @param ctx the parse tree
	 */
	void enterSetConstraints(OpenGaussStatementParser.SetConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setConstraints}.
	 * @param ctx the parse tree
	 */
	void exitSetConstraints(OpenGaussStatementParser.SetConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintsSetMode}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsSetMode(OpenGaussStatementParser.ConstraintsSetModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintsSetMode}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsSetMode(OpenGaussStatementParser.ConstraintsSetModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintsSetList}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsSetList(OpenGaussStatementParser.ConstraintsSetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintsSetList}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsSetList(OpenGaussStatementParser.ConstraintsSetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#checkpoint}.
	 * @param ctx the parse tree
	 */
	void enterCheckpoint(OpenGaussStatementParser.CheckpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#checkpoint}.
	 * @param ctx the parse tree
	 */
	void exitCheckpoint(OpenGaussStatementParser.CheckpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void enterLock(OpenGaussStatementParser.LockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#lock}.
	 * @param ctx the parse tree
	 */
	void exitLock(OpenGaussStatementParser.LockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#lockType}.
	 * @param ctx the parse tree
	 */
	void enterLockType(OpenGaussStatementParser.LockTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#lockType}.
	 * @param ctx the parse tree
	 */
	void exitLockType(OpenGaussStatementParser.LockTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(OpenGaussStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(OpenGaussStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#insertTarget}.
	 * @param ctx the parse tree
	 */
	void enterInsertTarget(OpenGaussStatementParser.InsertTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#insertTarget}.
	 * @param ctx the parse tree
	 */
	void exitInsertTarget(OpenGaussStatementParser.InsertTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#insertRest}.
	 * @param ctx the parse tree
	 */
	void enterInsertRest(OpenGaussStatementParser.InsertRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#insertRest}.
	 * @param ctx the parse tree
	 */
	void exitInsertRest(OpenGaussStatementParser.InsertRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#overrideKind}.
	 * @param ctx the parse tree
	 */
	void enterOverrideKind(OpenGaussStatementParser.OverrideKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#overrideKind}.
	 * @param ctx the parse tree
	 */
	void exitOverrideKind(OpenGaussStatementParser.OverrideKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnList(OpenGaussStatementParser.InsertColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnList(OpenGaussStatementParser.InsertColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#insertColumnItem}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnItem(OpenGaussStatementParser.InsertColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#insertColumnItem}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnItem(OpenGaussStatementParser.InsertColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optOnDuplicateKey}.
	 * @param ctx the parse tree
	 */
	void enterOptOnDuplicateKey(OpenGaussStatementParser.OptOnDuplicateKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optOnDuplicateKey}.
	 * @param ctx the parse tree
	 */
	void exitOptOnDuplicateKey(OpenGaussStatementParser.OptOnDuplicateKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OpenGaussStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OpenGaussStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(OpenGaussStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(OpenGaussStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setClauseList}.
	 * @param ctx the parse tree
	 */
	void enterSetClauseList(OpenGaussStatementParser.SetClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setClauseList}.
	 * @param ctx the parse tree
	 */
	void exitSetClauseList(OpenGaussStatementParser.SetClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(OpenGaussStatementParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(OpenGaussStatementParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setTarget}.
	 * @param ctx the parse tree
	 */
	void enterSetTarget(OpenGaussStatementParser.SetTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setTarget}.
	 * @param ctx the parse tree
	 */
	void exitSetTarget(OpenGaussStatementParser.SetTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setTargetList}.
	 * @param ctx the parse tree
	 */
	void enterSetTargetList(OpenGaussStatementParser.SetTargetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setTargetList}.
	 * @param ctx the parse tree
	 */
	void exitSetTargetList(OpenGaussStatementParser.SetTargetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void enterReturningClause(OpenGaussStatementParser.ReturningClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void exitReturningClause(OpenGaussStatementParser.ReturningClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(OpenGaussStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(OpenGaussStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#relationExprOptAlias}.
	 * @param ctx the parse tree
	 */
	void enterRelationExprOptAlias(OpenGaussStatementParser.RelationExprOptAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#relationExprOptAlias}.
	 * @param ctx the parse tree
	 */
	void exitRelationExprOptAlias(OpenGaussStatementParser.RelationExprOptAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingClause(OpenGaussStatementParser.UsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingClause(OpenGaussStatementParser.UsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(OpenGaussStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(OpenGaussStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#selectWithParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithParens(OpenGaussStatementParser.SelectWithParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#selectWithParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithParens(OpenGaussStatementParser.SelectWithParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#selectNoParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectNoParens(OpenGaussStatementParser.SelectNoParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#selectNoParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectNoParens(OpenGaussStatementParser.SelectNoParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#selectClauseN}.
	 * @param ctx the parse tree
	 */
	void enterSelectClauseN(OpenGaussStatementParser.SelectClauseNContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#selectClauseN}.
	 * @param ctx the parse tree
	 */
	void exitSelectClauseN(OpenGaussStatementParser.SelectClauseNContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#simpleSelect}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(OpenGaussStatementParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#simpleSelect}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(OpenGaussStatementParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(OpenGaussStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(OpenGaussStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(OpenGaussStatementParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(OpenGaussStatementParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void enterOptTempTableName(OpenGaussStatementParser.OptTempTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void exitOptTempTableName(OpenGaussStatementParser.OptTempTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cteList}.
	 * @param ctx the parse tree
	 */
	void enterCteList(OpenGaussStatementParser.CteListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cteList}.
	 * @param ctx the parse tree
	 */
	void exitCteList(OpenGaussStatementParser.CteListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommonTableExpr(OpenGaussStatementParser.CommonTableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommonTableExpr(OpenGaussStatementParser.CommonTableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optMaterialized}.
	 * @param ctx the parse tree
	 */
	void enterOptMaterialized(OpenGaussStatementParser.OptMaterializedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optMaterialized}.
	 * @param ctx the parse tree
	 */
	void exitOptMaterialized(OpenGaussStatementParser.OptMaterializedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optNameList}.
	 * @param ctx the parse tree
	 */
	void enterOptNameList(OpenGaussStatementParser.OptNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optNameList}.
	 * @param ctx the parse tree
	 */
	void exitOptNameList(OpenGaussStatementParser.OptNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void enterPreparableStmt(OpenGaussStatementParser.PreparableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void exitPreparableStmt(OpenGaussStatementParser.PreparableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#forLockingClause}.
	 * @param ctx the parse tree
	 */
	void enterForLockingClause(OpenGaussStatementParser.ForLockingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#forLockingClause}.
	 * @param ctx the parse tree
	 */
	void exitForLockingClause(OpenGaussStatementParser.ForLockingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#forLockingItems}.
	 * @param ctx the parse tree
	 */
	void enterForLockingItems(OpenGaussStatementParser.ForLockingItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#forLockingItems}.
	 * @param ctx the parse tree
	 */
	void exitForLockingItems(OpenGaussStatementParser.ForLockingItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#forLockingItem}.
	 * @param ctx the parse tree
	 */
	void enterForLockingItem(OpenGaussStatementParser.ForLockingItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#forLockingItem}.
	 * @param ctx the parse tree
	 */
	void exitForLockingItem(OpenGaussStatementParser.ForLockingItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#nowaitOrSkip}.
	 * @param ctx the parse tree
	 */
	void enterNowaitOrSkip(OpenGaussStatementParser.NowaitOrSkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#nowaitOrSkip}.
	 * @param ctx the parse tree
	 */
	void exitNowaitOrSkip(OpenGaussStatementParser.NowaitOrSkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#forLockingStrength}.
	 * @param ctx the parse tree
	 */
	void enterForLockingStrength(OpenGaussStatementParser.ForLockingStrengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#forLockingStrength}.
	 * @param ctx the parse tree
	 */
	void exitForLockingStrength(OpenGaussStatementParser.ForLockingStrengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#lockedRelsList}.
	 * @param ctx the parse tree
	 */
	void enterLockedRelsList(OpenGaussStatementParser.LockedRelsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#lockedRelsList}.
	 * @param ctx the parse tree
	 */
	void exitLockedRelsList(OpenGaussStatementParser.LockedRelsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(OpenGaussStatementParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(OpenGaussStatementParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#selectLimit}.
	 * @param ctx the parse tree
	 */
	void enterSelectLimit(OpenGaussStatementParser.SelectLimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#selectLimit}.
	 * @param ctx the parse tree
	 */
	void exitSelectLimit(OpenGaussStatementParser.SelectLimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void enterValuesClause(OpenGaussStatementParser.ValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void exitValuesClause(OpenGaussStatementParser.ValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(OpenGaussStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(OpenGaussStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(OpenGaussStatementParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(OpenGaussStatementParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#selectLimitValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectLimitValue(OpenGaussStatementParser.SelectLimitValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#selectLimitValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectLimitValue(OpenGaussStatementParser.SelectLimitValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#selectOffsetValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectOffsetValue(OpenGaussStatementParser.SelectOffsetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#selectOffsetValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectOffsetValue(OpenGaussStatementParser.SelectOffsetValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#selectFetchValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectFetchValue(OpenGaussStatementParser.SelectFetchValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#selectFetchValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectFetchValue(OpenGaussStatementParser.SelectFetchValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rowOrRows}.
	 * @param ctx the parse tree
	 */
	void enterRowOrRows(OpenGaussStatementParser.RowOrRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rowOrRows}.
	 * @param ctx the parse tree
	 */
	void exitRowOrRows(OpenGaussStatementParser.RowOrRowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#firstOrNext}.
	 * @param ctx the parse tree
	 */
	void enterFirstOrNext(OpenGaussStatementParser.FirstOrNextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#firstOrNext}.
	 * @param ctx the parse tree
	 */
	void exitFirstOrNext(OpenGaussStatementParser.FirstOrNextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#onlyOrWithTies}.
	 * @param ctx the parse tree
	 */
	void enterOnlyOrWithTies(OpenGaussStatementParser.OnlyOrWithTiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#onlyOrWithTies}.
	 * @param ctx the parse tree
	 */
	void exitOnlyOrWithTies(OpenGaussStatementParser.OnlyOrWithTiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#targetList}.
	 * @param ctx the parse tree
	 */
	void enterTargetList(OpenGaussStatementParser.TargetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#targetList}.
	 * @param ctx the parse tree
	 */
	void exitTargetList(OpenGaussStatementParser.TargetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#targetEl}.
	 * @param ctx the parse tree
	 */
	void enterTargetEl(OpenGaussStatementParser.TargetElContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#targetEl}.
	 * @param ctx the parse tree
	 */
	void exitTargetEl(OpenGaussStatementParser.TargetElContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupClause(OpenGaussStatementParser.GroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupClause(OpenGaussStatementParser.GroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#groupByList}.
	 * @param ctx the parse tree
	 */
	void enterGroupByList(OpenGaussStatementParser.GroupByListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#groupByList}.
	 * @param ctx the parse tree
	 */
	void exitGroupByList(OpenGaussStatementParser.GroupByListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(OpenGaussStatementParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(OpenGaussStatementParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#emptyGroupingSet}.
	 * @param ctx the parse tree
	 */
	void enterEmptyGroupingSet(OpenGaussStatementParser.EmptyGroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#emptyGroupingSet}.
	 * @param ctx the parse tree
	 */
	void exitEmptyGroupingSet(OpenGaussStatementParser.EmptyGroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rollupClause}.
	 * @param ctx the parse tree
	 */
	void enterRollupClause(OpenGaussStatementParser.RollupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rollupClause}.
	 * @param ctx the parse tree
	 */
	void exitRollupClause(OpenGaussStatementParser.RollupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cubeClause}.
	 * @param ctx the parse tree
	 */
	void enterCubeClause(OpenGaussStatementParser.CubeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cubeClause}.
	 * @param ctx the parse tree
	 */
	void exitCubeClause(OpenGaussStatementParser.CubeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#groupingSetsClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSetsClause(OpenGaussStatementParser.GroupingSetsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#groupingSetsClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSetsClause(OpenGaussStatementParser.GroupingSetsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(OpenGaussStatementParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(OpenGaussStatementParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#windowDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinitionList(OpenGaussStatementParser.WindowDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#windowDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinitionList(OpenGaussStatementParser.WindowDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition(OpenGaussStatementParser.WindowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition(OpenGaussStatementParser.WindowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(OpenGaussStatementParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(OpenGaussStatementParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#existingWindowName}.
	 * @param ctx the parse tree
	 */
	void enterExistingWindowName(OpenGaussStatementParser.ExistingWindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#existingWindowName}.
	 * @param ctx the parse tree
	 */
	void exitExistingWindowName(OpenGaussStatementParser.ExistingWindowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(OpenGaussStatementParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(OpenGaussStatementParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(OpenGaussStatementParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(OpenGaussStatementParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void enterFrameExtent(OpenGaussStatementParser.FrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void exitFrameExtent(OpenGaussStatementParser.FrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(OpenGaussStatementParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(OpenGaussStatementParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optWindowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void enterOptWindowExclusionClause(OpenGaussStatementParser.OptWindowExclusionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optWindowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void exitOptWindowExclusionClause(OpenGaussStatementParser.OptWindowExclusionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(OpenGaussStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(OpenGaussStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(OpenGaussStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(OpenGaussStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#fromList}.
	 * @param ctx the parse tree
	 */
	void enterFromList(OpenGaussStatementParser.FromListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#fromList}.
	 * @param ctx the parse tree
	 */
	void exitFromList(OpenGaussStatementParser.FromListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(OpenGaussStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(OpenGaussStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(OpenGaussStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(OpenGaussStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#crossJoinType}.
	 * @param ctx the parse tree
	 */
	void enterCrossJoinType(OpenGaussStatementParser.CrossJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#crossJoinType}.
	 * @param ctx the parse tree
	 */
	void exitCrossJoinType(OpenGaussStatementParser.CrossJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinType(OpenGaussStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinType(OpenGaussStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinType(OpenGaussStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinType(OpenGaussStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinType(OpenGaussStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinType(OpenGaussStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#joinQual}.
	 * @param ctx the parse tree
	 */
	void enterJoinQual(OpenGaussStatementParser.JoinQualContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#joinQual}.
	 * @param ctx the parse tree
	 */
	void exitJoinQual(OpenGaussStatementParser.JoinQualContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(OpenGaussStatementParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(OpenGaussStatementParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(OpenGaussStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(OpenGaussStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#whereOrCurrentClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereOrCurrentClause(OpenGaussStatementParser.WhereOrCurrentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#whereOrCurrentClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereOrCurrentClause(OpenGaussStatementParser.WhereOrCurrentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(OpenGaussStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(OpenGaussStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(OpenGaussStatementParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(OpenGaussStatementParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dostmtOptList}.
	 * @param ctx the parse tree
	 */
	void enterDostmtOptList(OpenGaussStatementParser.DostmtOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dostmtOptList}.
	 * @param ctx the parse tree
	 */
	void exitDostmtOptList(OpenGaussStatementParser.DostmtOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dostmtOptItem}.
	 * @param ctx the parse tree
	 */
	void enterDostmtOptItem(OpenGaussStatementParser.DostmtOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dostmtOptItem}.
	 * @param ctx the parse tree
	 */
	void exitDostmtOptItem(OpenGaussStatementParser.DostmtOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copy}.
	 * @param ctx the parse tree
	 */
	void enterCopy(OpenGaussStatementParser.CopyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copy}.
	 * @param ctx the parse tree
	 */
	void exitCopy(OpenGaussStatementParser.CopyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyOptions}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptions(OpenGaussStatementParser.CopyOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyOptions}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptions(OpenGaussStatementParser.CopyOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptList}.
	 * @param ctx the parse tree
	 */
	void enterCopyGenericOptList(OpenGaussStatementParser.CopyGenericOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptList}.
	 * @param ctx the parse tree
	 */
	void exitCopyGenericOptList(OpenGaussStatementParser.CopyGenericOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptElem}.
	 * @param ctx the parse tree
	 */
	void enterCopyGenericOptElem(OpenGaussStatementParser.CopyGenericOptElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptElem}.
	 * @param ctx the parse tree
	 */
	void exitCopyGenericOptElem(OpenGaussStatementParser.CopyGenericOptElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArg}.
	 * @param ctx the parse tree
	 */
	void enterCopyGenericOptArg(OpenGaussStatementParser.CopyGenericOptArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArg}.
	 * @param ctx the parse tree
	 */
	void exitCopyGenericOptArg(OpenGaussStatementParser.CopyGenericOptArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArgList}.
	 * @param ctx the parse tree
	 */
	void enterCopyGenericOptArgList(OpenGaussStatementParser.CopyGenericOptArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArgList}.
	 * @param ctx the parse tree
	 */
	void exitCopyGenericOptArgList(OpenGaussStatementParser.CopyGenericOptArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArgListItem}.
	 * @param ctx the parse tree
	 */
	void enterCopyGenericOptArgListItem(OpenGaussStatementParser.CopyGenericOptArgListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArgListItem}.
	 * @param ctx the parse tree
	 */
	void exitCopyGenericOptArgListItem(OpenGaussStatementParser.CopyGenericOptArgListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyOptList}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptList(OpenGaussStatementParser.CopyOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyOptList}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptList(OpenGaussStatementParser.CopyOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptItem(OpenGaussStatementParser.CopyOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptItem(OpenGaussStatementParser.CopyOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#copyDelimiter}.
	 * @param ctx the parse tree
	 */
	void enterCopyDelimiter(OpenGaussStatementParser.CopyDelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#copyDelimiter}.
	 * @param ctx the parse tree
	 */
	void exitCopyDelimiter(OpenGaussStatementParser.CopyDelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(OpenGaussStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(OpenGaussStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reservedKeyword}.
	 * @param ctx the parse tree
	 */
	void enterReservedKeyword(OpenGaussStatementParser.ReservedKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reservedKeyword}.
	 * @param ctx the parse tree
	 */
	void exitReservedKeyword(OpenGaussStatementParser.ReservedKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(OpenGaussStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(OpenGaussStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#literalsType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralsType(OpenGaussStatementParser.LiteralsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#literalsType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralsType(OpenGaussStatementParser.LiteralsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OpenGaussStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OpenGaussStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#uescape}.
	 * @param ctx the parse tree
	 */
	void enterUescape(OpenGaussStatementParser.UescapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#uescape}.
	 * @param ctx the parse tree
	 */
	void exitUescape(OpenGaussStatementParser.UescapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(OpenGaussStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(OpenGaussStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typeFuncNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTypeFuncNameKeyword(OpenGaussStatementParser.TypeFuncNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typeFuncNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTypeFuncNameKeyword(OpenGaussStatementParser.TypeFuncNameKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(OpenGaussStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(OpenGaussStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#synonymName}.
	 * @param ctx the parse tree
	 */
	void enterSynonymName(OpenGaussStatementParser.SynonymNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#synonymName}.
	 * @param ctx the parse tree
	 */
	void exitSynonymName(OpenGaussStatementParser.SynonymNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(OpenGaussStatementParser.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(OpenGaussStatementParser.ObjectNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(OpenGaussStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(OpenGaussStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(OpenGaussStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(OpenGaussStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(OpenGaussStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(OpenGaussStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(OpenGaussStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(OpenGaussStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#modelName}.
	 * @param ctx the parse tree
	 */
	void enterModelName(OpenGaussStatementParser.ModelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#modelName}.
	 * @param ctx the parse tree
	 */
	void exitModelName(OpenGaussStatementParser.ModelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(OpenGaussStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(OpenGaussStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(OpenGaussStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(OpenGaussStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(OpenGaussStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(OpenGaussStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(OpenGaussStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(OpenGaussStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(OpenGaussStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(OpenGaussStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(OpenGaussStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(OpenGaussStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(OpenGaussStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(OpenGaussStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(OpenGaussStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(OpenGaussStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(OpenGaussStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(OpenGaussStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#inetOperator}.
	 * @param ctx the parse tree
	 */
	void enterInetOperator(OpenGaussStatementParser.InetOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#inetOperator}.
	 * @param ctx the parse tree
	 */
	void exitInetOperator(OpenGaussStatementParser.InetOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#patternMatchingOperator}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchingOperator(OpenGaussStatementParser.PatternMatchingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#patternMatchingOperator}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchingOperator(OpenGaussStatementParser.PatternMatchingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(OpenGaussStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(OpenGaussStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aExpr}.
	 * @param ctx the parse tree
	 */
	void enterAExpr(OpenGaussStatementParser.AExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aExpr}.
	 * @param ctx the parse tree
	 */
	void exitAExpr(OpenGaussStatementParser.AExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void enterBExpr(OpenGaussStatementParser.BExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void exitBExpr(OpenGaussStatementParser.BExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cExpr}.
	 * @param ctx the parse tree
	 */
	void enterCExpr(OpenGaussStatementParser.CExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cExpr}.
	 * @param ctx the parse tree
	 */
	void exitCExpr(OpenGaussStatementParser.CExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indirection}.
	 * @param ctx the parse tree
	 */
	void enterIndirection(OpenGaussStatementParser.IndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indirection}.
	 * @param ctx the parse tree
	 */
	void exitIndirection(OpenGaussStatementParser.IndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optIndirection}.
	 * @param ctx the parse tree
	 */
	void enterOptIndirection(OpenGaussStatementParser.OptIndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optIndirection}.
	 * @param ctx the parse tree
	 */
	void exitOptIndirection(OpenGaussStatementParser.OptIndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indirectionEl}.
	 * @param ctx the parse tree
	 */
	void enterIndirectionEl(OpenGaussStatementParser.IndirectionElContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indirectionEl}.
	 * @param ctx the parse tree
	 */
	void exitIndirectionEl(OpenGaussStatementParser.IndirectionElContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#sliceBound}.
	 * @param ctx the parse tree
	 */
	void enterSliceBound(OpenGaussStatementParser.SliceBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#sliceBound}.
	 * @param ctx the parse tree
	 */
	void exitSliceBound(OpenGaussStatementParser.SliceBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void enterInExpr(OpenGaussStatementParser.InExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void exitInExpr(OpenGaussStatementParser.InExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(OpenGaussStatementParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(OpenGaussStatementParser.CaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#whenClauseList}.
	 * @param ctx the parse tree
	 */
	void enterWhenClauseList(OpenGaussStatementParser.WhenClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#whenClauseList}.
	 * @param ctx the parse tree
	 */
	void exitWhenClauseList(OpenGaussStatementParser.WhenClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(OpenGaussStatementParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(OpenGaussStatementParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#caseDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaseDefault(OpenGaussStatementParser.CaseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#caseDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaseDefault(OpenGaussStatementParser.CaseDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#caseArg}.
	 * @param ctx the parse tree
	 */
	void enterCaseArg(OpenGaussStatementParser.CaseArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#caseArg}.
	 * @param ctx the parse tree
	 */
	void exitCaseArg(OpenGaussStatementParser.CaseArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnref}.
	 * @param ctx the parse tree
	 */
	void enterColumnref(OpenGaussStatementParser.ColumnrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnref}.
	 * @param ctx the parse tree
	 */
	void exitColumnref(OpenGaussStatementParser.ColumnrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#qualOp}.
	 * @param ctx the parse tree
	 */
	void enterQualOp(OpenGaussStatementParser.QualOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#qualOp}.
	 * @param ctx the parse tree
	 */
	void exitQualOp(OpenGaussStatementParser.QualOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#subqueryOp}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryOp(OpenGaussStatementParser.SubqueryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#subqueryOp}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryOp(OpenGaussStatementParser.SubqueryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#allOp}.
	 * @param ctx the parse tree
	 */
	void enterAllOp(OpenGaussStatementParser.AllOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#allOp}.
	 * @param ctx the parse tree
	 */
	void exitAllOp(OpenGaussStatementParser.AllOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(OpenGaussStatementParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(OpenGaussStatementParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(OpenGaussStatementParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(OpenGaussStatementParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExtract}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonExtract(OpenGaussStatementParser.JsonExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExtract}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonExtract(OpenGaussStatementParser.JsonExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExtractText}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonExtractText(OpenGaussStatementParser.JsonExtractTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExtractText}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonExtractText(OpenGaussStatementParser.JsonExtractTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonPathExtract}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonPathExtract(OpenGaussStatementParser.JsonPathExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonPathExtract}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonPathExtract(OpenGaussStatementParser.JsonPathExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonPathExtractText}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonPathExtractText(OpenGaussStatementParser.JsonPathExtractTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonPathExtractText}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonPathExtractText(OpenGaussStatementParser.JsonPathExtractTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainRight}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainRight(OpenGaussStatementParser.JsonbContainRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainRight}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainRight(OpenGaussStatementParser.JsonbContainRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainLeft}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainLeft(OpenGaussStatementParser.JsonbContainLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainLeft}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainLeft(OpenGaussStatementParser.JsonbContainLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainTopKey(OpenGaussStatementParser.JsonbContainTopKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainTopKey(OpenGaussStatementParser.JsonbContainTopKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainAnyTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainAnyTopKey(OpenGaussStatementParser.JsonbContainAnyTopKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainAnyTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainAnyTopKey(OpenGaussStatementParser.JsonbContainAnyTopKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbContainAllTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbContainAllTopKey(OpenGaussStatementParser.JsonbContainAllTopKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbContainAllTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbContainAllTopKey(OpenGaussStatementParser.JsonbContainAllTopKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbConcat}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbConcat(OpenGaussStatementParser.JsonbConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbConcat}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbConcat(OpenGaussStatementParser.JsonbConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbDelete}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbDelete(OpenGaussStatementParser.JsonbDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbDelete}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbDelete(OpenGaussStatementParser.JsonbDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbPathDelete}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbPathDelete(OpenGaussStatementParser.JsonbPathDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbPathDelete}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbPathDelete(OpenGaussStatementParser.JsonbPathDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbPathContainAnyValue}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbPathContainAnyValue(OpenGaussStatementParser.JsonbPathContainAnyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbPathContainAnyValue}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbPathContainAnyValue(OpenGaussStatementParser.JsonbPathContainAnyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonbPathPredicateCheck}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonbPathPredicateCheck(OpenGaussStatementParser.JsonbPathPredicateCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonbPathPredicateCheck}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonbPathPredicateCheck(OpenGaussStatementParser.JsonbPathPredicateCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#geometricOperator}.
	 * @param ctx the parse tree
	 */
	void enterGeometricOperator(OpenGaussStatementParser.GeometricOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#geometricOperator}.
	 * @param ctx the parse tree
	 */
	void exitGeometricOperator(OpenGaussStatementParser.GeometricOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#qualAllOp}.
	 * @param ctx the parse tree
	 */
	void enterQualAllOp(OpenGaussStatementParser.QualAllOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#qualAllOp}.
	 * @param ctx the parse tree
	 */
	void exitQualAllOp(OpenGaussStatementParser.QualAllOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ascDesc}.
	 * @param ctx the parse tree
	 */
	void enterAscDesc(OpenGaussStatementParser.AscDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ascDesc}.
	 * @param ctx the parse tree
	 */
	void exitAscDesc(OpenGaussStatementParser.AscDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#anyOperator}.
	 * @param ctx the parse tree
	 */
	void enterAnyOperator(OpenGaussStatementParser.AnyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#anyOperator}.
	 * @param ctx the parse tree
	 */
	void exitAnyOperator(OpenGaussStatementParser.AnyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#windowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowExclusionClause(OpenGaussStatementParser.WindowExclusionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#windowExclusionClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowExclusionClause(OpenGaussStatementParser.WindowExclusionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(OpenGaussStatementParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(OpenGaussStatementParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#explicitRow}.
	 * @param ctx the parse tree
	 */
	void enterExplicitRow(OpenGaussStatementParser.ExplicitRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#explicitRow}.
	 * @param ctx the parse tree
	 */
	void exitExplicitRow(OpenGaussStatementParser.ExplicitRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#implicitRow}.
	 * @param ctx the parse tree
	 */
	void enterImplicitRow(OpenGaussStatementParser.ImplicitRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#implicitRow}.
	 * @param ctx the parse tree
	 */
	void exitImplicitRow(OpenGaussStatementParser.ImplicitRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#subType}.
	 * @param ctx the parse tree
	 */
	void enterSubType(OpenGaussStatementParser.SubTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#subType}.
	 * @param ctx the parse tree
	 */
	void exitSubType(OpenGaussStatementParser.SubTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(OpenGaussStatementParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(OpenGaussStatementParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#arrayExprList}.
	 * @param ctx the parse tree
	 */
	void enterArrayExprList(OpenGaussStatementParser.ArrayExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#arrayExprList}.
	 * @param ctx the parse tree
	 */
	void exitArrayExprList(OpenGaussStatementParser.ArrayExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArgList}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgList(OpenGaussStatementParser.FuncArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArgList}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgList(OpenGaussStatementParser.FuncArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(OpenGaussStatementParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(OpenGaussStatementParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgExpr(OpenGaussStatementParser.FuncArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgExpr(OpenGaussStatementParser.FuncArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(OpenGaussStatementParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(OpenGaussStatementParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcApplication}.
	 * @param ctx the parse tree
	 */
	void enterFuncApplication(OpenGaussStatementParser.FuncApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcApplication}.
	 * @param ctx the parse tree
	 */
	void exitFuncApplication(OpenGaussStatementParser.FuncApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(OpenGaussStatementParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(OpenGaussStatementParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void enterAexprConst(OpenGaussStatementParser.AexprConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void exitAexprConst(OpenGaussStatementParser.AexprConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#numberConst}.
	 * @param ctx the parse tree
	 */
	void enterNumberConst(OpenGaussStatementParser.NumberConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#numberConst}.
	 * @param ctx the parse tree
	 */
	void exitNumberConst(OpenGaussStatementParser.NumberConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(OpenGaussStatementParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(OpenGaussStatementParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#colId}.
	 * @param ctx the parse tree
	 */
	void enterColId(OpenGaussStatementParser.ColIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#colId}.
	 * @param ctx the parse tree
	 */
	void exitColId(OpenGaussStatementParser.ColIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typeFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctionName(OpenGaussStatementParser.TypeFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typeFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctionName(OpenGaussStatementParser.TypeFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(OpenGaussStatementParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(OpenGaussStatementParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlTable}.
	 * @param ctx the parse tree
	 */
	void enterXmlTable(OpenGaussStatementParser.XmlTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlTable}.
	 * @param ctx the parse tree
	 */
	void exitXmlTable(OpenGaussStatementParser.XmlTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnList}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnList(OpenGaussStatementParser.XmlTableColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnList}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnList(OpenGaussStatementParser.XmlTableColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnEl(OpenGaussStatementParser.XmlTableColumnElContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnEl(OpenGaussStatementParser.XmlTableColumnElContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnOptionList(OpenGaussStatementParser.XmlTableColumnOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnOptionList(OpenGaussStatementParser.XmlTableColumnOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnOptionEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumnOptionEl(OpenGaussStatementParser.XmlTableColumnOptionElContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnOptionEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumnOptionEl(OpenGaussStatementParser.XmlTableColumnOptionElContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlNamespaceList}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespaceList(OpenGaussStatementParser.XmlNamespaceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlNamespaceList}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespaceList(OpenGaussStatementParser.XmlNamespaceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlNamespaceEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespaceEl(OpenGaussStatementParser.XmlNamespaceElContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlNamespaceEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespaceEl(OpenGaussStatementParser.XmlNamespaceElContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(OpenGaussStatementParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(OpenGaussStatementParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#withinGroupClause}.
	 * @param ctx the parse tree
	 */
	void enterWithinGroupClause(OpenGaussStatementParser.WithinGroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#withinGroupClause}.
	 * @param ctx the parse tree
	 */
	void exitWithinGroupClause(OpenGaussStatementParser.WithinGroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(OpenGaussStatementParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(OpenGaussStatementParser.FilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#functionExprWindowless}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExprWindowless(OpenGaussStatementParser.FunctionExprWindowlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#functionExprWindowless}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExprWindowless(OpenGaussStatementParser.FunctionExprWindowlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ordinality}.
	 * @param ctx the parse tree
	 */
	void enterOrdinality(OpenGaussStatementParser.OrdinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ordinality}.
	 * @param ctx the parse tree
	 */
	void exitOrdinality(OpenGaussStatementParser.OrdinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#functionExprCommonSubexpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExprCommonSubexpr(OpenGaussStatementParser.FunctionExprCommonSubexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#functionExprCommonSubexpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExprCommonSubexpr(OpenGaussStatementParser.FunctionExprCommonSubexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(OpenGaussStatementParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(OpenGaussStatementParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(OpenGaussStatementParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(OpenGaussStatementParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constTypeName}.
	 * @param ctx the parse tree
	 */
	void enterConstTypeName(OpenGaussStatementParser.ConstTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constTypeName}.
	 * @param ctx the parse tree
	 */
	void exitConstTypeName(OpenGaussStatementParser.ConstTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(OpenGaussStatementParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(OpenGaussStatementParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#extractList}.
	 * @param ctx the parse tree
	 */
	void enterExtractList(OpenGaussStatementParser.ExtractListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#extractList}.
	 * @param ctx the parse tree
	 */
	void exitExtractList(OpenGaussStatementParser.ExtractListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#extractArg}.
	 * @param ctx the parse tree
	 */
	void enterExtractArg(OpenGaussStatementParser.ExtractArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#extractArg}.
	 * @param ctx the parse tree
	 */
	void exitExtractArg(OpenGaussStatementParser.ExtractArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(OpenGaussStatementParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(OpenGaussStatementParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifiers(OpenGaussStatementParser.TypeModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifiers(OpenGaussStatementParser.TypeModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(OpenGaussStatementParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(OpenGaussStatementParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void enterConstDatetime(OpenGaussStatementParser.ConstDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void exitConstDatetime(OpenGaussStatementParser.ConstDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#timezone}.
	 * @param ctx the parse tree
	 */
	void enterTimezone(OpenGaussStatementParser.TimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#timezone}.
	 * @param ctx the parse tree
	 */
	void exitTimezone(OpenGaussStatementParser.TimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(OpenGaussStatementParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(OpenGaussStatementParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithLength(OpenGaussStatementParser.CharacterWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithLength(OpenGaussStatementParser.CharacterWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithoutLength(OpenGaussStatementParser.CharacterWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithoutLength(OpenGaussStatementParser.CharacterWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#characterClause}.
	 * @param ctx the parse tree
	 */
	void enterCharacterClause(OpenGaussStatementParser.CharacterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#characterClause}.
	 * @param ctx the parse tree
	 */
	void exitCharacterClause(OpenGaussStatementParser.CharacterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optFloat}.
	 * @param ctx the parse tree
	 */
	void enterOptFloat(OpenGaussStatementParser.OptFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optFloat}.
	 * @param ctx the parse tree
	 */
	void exitOptFloat(OpenGaussStatementParser.OptFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(OpenGaussStatementParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(OpenGaussStatementParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(OpenGaussStatementParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(OpenGaussStatementParser.AttrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#colLable}.
	 * @param ctx the parse tree
	 */
	void enterColLable(OpenGaussStatementParser.ColLableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#colLable}.
	 * @param ctx the parse tree
	 */
	void exitColLable(OpenGaussStatementParser.ColLableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBit(OpenGaussStatementParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBit(OpenGaussStatementParser.BitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithLength(OpenGaussStatementParser.BitWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithLength(OpenGaussStatementParser.BitWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithoutLength(OpenGaussStatementParser.BitWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithoutLength(OpenGaussStatementParser.BitWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void enterConstInterval(OpenGaussStatementParser.ConstIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void exitConstInterval(OpenGaussStatementParser.ConstIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optInterval}.
	 * @param ctx the parse tree
	 */
	void enterOptInterval(OpenGaussStatementParser.OptIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optInterval}.
	 * @param ctx the parse tree
	 */
	void exitOptInterval(OpenGaussStatementParser.OptIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optArrayBounds}.
	 * @param ctx the parse tree
	 */
	void enterOptArrayBounds(OpenGaussStatementParser.OptArrayBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optArrayBounds}.
	 * @param ctx the parse tree
	 */
	void exitOptArrayBounds(OpenGaussStatementParser.OptArrayBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#intervalSecond}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSecond(OpenGaussStatementParser.IntervalSecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#intervalSecond}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSecond(OpenGaussStatementParser.IntervalSecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#unicodeNormalForm}.
	 * @param ctx the parse tree
	 */
	void enterUnicodeNormalForm(OpenGaussStatementParser.UnicodeNormalFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#unicodeNormalForm}.
	 * @param ctx the parse tree
	 */
	void exitUnicodeNormalForm(OpenGaussStatementParser.UnicodeNormalFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#trimList}.
	 * @param ctx the parse tree
	 */
	void enterTrimList(OpenGaussStatementParser.TrimListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#trimList}.
	 * @param ctx the parse tree
	 */
	void exitTrimList(OpenGaussStatementParser.TrimListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#overlayList}.
	 * @param ctx the parse tree
	 */
	void enterOverlayList(OpenGaussStatementParser.OverlayListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#overlayList}.
	 * @param ctx the parse tree
	 */
	void exitOverlayList(OpenGaussStatementParser.OverlayListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#overlayPlacing}.
	 * @param ctx the parse tree
	 */
	void enterOverlayPlacing(OpenGaussStatementParser.OverlayPlacingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#overlayPlacing}.
	 * @param ctx the parse tree
	 */
	void exitOverlayPlacing(OpenGaussStatementParser.OverlayPlacingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#substrFrom}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFrom(OpenGaussStatementParser.SubstrFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#substrFrom}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFrom(OpenGaussStatementParser.SubstrFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#substrFor}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFor(OpenGaussStatementParser.SubstrForContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#substrFor}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFor(OpenGaussStatementParser.SubstrForContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#positionList}.
	 * @param ctx the parse tree
	 */
	void enterPositionList(OpenGaussStatementParser.PositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#positionList}.
	 * @param ctx the parse tree
	 */
	void exitPositionList(OpenGaussStatementParser.PositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#substrList}.
	 * @param ctx the parse tree
	 */
	void enterSubstrList(OpenGaussStatementParser.SubstrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#substrList}.
	 * @param ctx the parse tree
	 */
	void exitSubstrList(OpenGaussStatementParser.SubstrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttributes(OpenGaussStatementParser.XmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttributes(OpenGaussStatementParser.XmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttributeList(OpenGaussStatementParser.XmlAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttributeList(OpenGaussStatementParser.XmlAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlAttributeEl}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttributeEl(OpenGaussStatementParser.XmlAttributeElContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlAttributeEl}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttributeEl(OpenGaussStatementParser.XmlAttributeElContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlExistsArgument}.
	 * @param ctx the parse tree
	 */
	void enterXmlExistsArgument(OpenGaussStatementParser.XmlExistsArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlExistsArgument}.
	 * @param ctx the parse tree
	 */
	void exitXmlExistsArgument(OpenGaussStatementParser.XmlExistsArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlPassingMech}.
	 * @param ctx the parse tree
	 */
	void enterXmlPassingMech(OpenGaussStatementParser.XmlPassingMechContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlPassingMech}.
	 * @param ctx the parse tree
	 */
	void exitXmlPassingMech(OpenGaussStatementParser.XmlPassingMechContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#documentOrContent}.
	 * @param ctx the parse tree
	 */
	void enterDocumentOrContent(OpenGaussStatementParser.DocumentOrContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#documentOrContent}.
	 * @param ctx the parse tree
	 */
	void exitDocumentOrContent(OpenGaussStatementParser.DocumentOrContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlWhitespaceOption}.
	 * @param ctx the parse tree
	 */
	void enterXmlWhitespaceOption(OpenGaussStatementParser.XmlWhitespaceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlWhitespaceOption}.
	 * @param ctx the parse tree
	 */
	void exitXmlWhitespaceOption(OpenGaussStatementParser.XmlWhitespaceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlRootVersion}.
	 * @param ctx the parse tree
	 */
	void enterXmlRootVersion(OpenGaussStatementParser.XmlRootVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlRootVersion}.
	 * @param ctx the parse tree
	 */
	void exitXmlRootVersion(OpenGaussStatementParser.XmlRootVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#xmlRootStandalone}.
	 * @param ctx the parse tree
	 */
	void enterXmlRootStandalone(OpenGaussStatementParser.XmlRootStandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#xmlRootStandalone}.
	 * @param ctx the parse tree
	 */
	void exitXmlRootStandalone(OpenGaussStatementParser.XmlRootStandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rowsFromItem}.
	 * @param ctx the parse tree
	 */
	void enterRowsFromItem(OpenGaussStatementParser.RowsFromItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rowsFromItem}.
	 * @param ctx the parse tree
	 */
	void exitRowsFromItem(OpenGaussStatementParser.RowsFromItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rowsFromList}.
	 * @param ctx the parse tree
	 */
	void enterRowsFromList(OpenGaussStatementParser.RowsFromListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rowsFromList}.
	 * @param ctx the parse tree
	 */
	void exitRowsFromList(OpenGaussStatementParser.RowsFromListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnDefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefList(OpenGaussStatementParser.ColumnDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnDefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefList(OpenGaussStatementParser.ColumnDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElementList(OpenGaussStatementParser.TableFuncElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElementList(OpenGaussStatementParser.TableFuncElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElement(OpenGaussStatementParser.TableFuncElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElement(OpenGaussStatementParser.TableFuncElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(OpenGaussStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(OpenGaussStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#anyName}.
	 * @param ctx the parse tree
	 */
	void enterAnyName(OpenGaussStatementParser.AnyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#anyName}.
	 * @param ctx the parse tree
	 */
	void exitAnyName(OpenGaussStatementParser.AnyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aliasClause}.
	 * @param ctx the parse tree
	 */
	void enterAliasClause(OpenGaussStatementParser.AliasClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aliasClause}.
	 * @param ctx the parse tree
	 */
	void exitAliasClause(OpenGaussStatementParser.AliasClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#directoryName}.
	 * @param ctx the parse tree
	 */
	void enterDirectoryName(OpenGaussStatementParser.DirectoryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#directoryName}.
	 * @param ctx the parse tree
	 */
	void exitDirectoryName(OpenGaussStatementParser.DirectoryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(OpenGaussStatementParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(OpenGaussStatementParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#pathString}.
	 * @param ctx the parse tree
	 */
	void enterPathString(OpenGaussStatementParser.PathStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#pathString}.
	 * @param ctx the parse tree
	 */
	void exitPathString(OpenGaussStatementParser.PathStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(OpenGaussStatementParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(OpenGaussStatementParser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcAliasClause}.
	 * @param ctx the parse tree
	 */
	void enterFuncAliasClause(OpenGaussStatementParser.FuncAliasClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcAliasClause}.
	 * @param ctx the parse tree
	 */
	void exitFuncAliasClause(OpenGaussStatementParser.FuncAliasClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tablesampleClause}.
	 * @param ctx the parse tree
	 */
	void enterTablesampleClause(OpenGaussStatementParser.TablesampleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tablesampleClause}.
	 * @param ctx the parse tree
	 */
	void exitTablesampleClause(OpenGaussStatementParser.TablesampleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#repeatableClause}.
	 * @param ctx the parse tree
	 */
	void enterRepeatableClause(OpenGaussStatementParser.RepeatableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#repeatableClause}.
	 * @param ctx the parse tree
	 */
	void exitRepeatableClause(OpenGaussStatementParser.RepeatableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#allOrDistinct}.
	 * @param ctx the parse tree
	 */
	void enterAllOrDistinct(OpenGaussStatementParser.AllOrDistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#allOrDistinct}.
	 * @param ctx the parse tree
	 */
	void exitAllOrDistinct(OpenGaussStatementParser.AllOrDistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void enterSortClause(OpenGaussStatementParser.SortClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void exitSortClause(OpenGaussStatementParser.SortClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#sortbyList}.
	 * @param ctx the parse tree
	 */
	void enterSortbyList(OpenGaussStatementParser.SortbyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#sortbyList}.
	 * @param ctx the parse tree
	 */
	void exitSortbyList(OpenGaussStatementParser.SortbyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#sortby}.
	 * @param ctx the parse tree
	 */
	void enterSortby(OpenGaussStatementParser.SortbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#sortby}.
	 * @param ctx the parse tree
	 */
	void exitSortby(OpenGaussStatementParser.SortbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#nullsOrder}.
	 * @param ctx the parse tree
	 */
	void enterNullsOrder(OpenGaussStatementParser.NullsOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#nullsOrder}.
	 * @param ctx the parse tree
	 */
	void exitNullsOrder(OpenGaussStatementParser.NullsOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void enterDistinctClause(OpenGaussStatementParser.DistinctClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void exitDistinctClause(OpenGaussStatementParser.DistinctClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(OpenGaussStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(OpenGaussStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(OpenGaussStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(OpenGaussStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#windowName}.
	 * @param ctx the parse tree
	 */
	void enterWindowName(OpenGaussStatementParser.WindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#windowName}.
	 * @param ctx the parse tree
	 */
	void exitWindowName(OpenGaussStatementParser.WindowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexParams}.
	 * @param ctx the parse tree
	 */
	void enterIndexParams(OpenGaussStatementParser.IndexParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexParams}.
	 * @param ctx the parse tree
	 */
	void exitIndexParams(OpenGaussStatementParser.IndexParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexElemOptions}.
	 * @param ctx the parse tree
	 */
	void enterIndexElemOptions(OpenGaussStatementParser.IndexElemOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexElemOptions}.
	 * @param ctx the parse tree
	 */
	void exitIndexElemOptions(OpenGaussStatementParser.IndexElemOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexElem}.
	 * @param ctx the parse tree
	 */
	void enterIndexElem(OpenGaussStatementParser.IndexElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexElem}.
	 * @param ctx the parse tree
	 */
	void exitIndexElem(OpenGaussStatementParser.IndexElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#collate}.
	 * @param ctx the parse tree
	 */
	void enterCollate(OpenGaussStatementParser.CollateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#collate}.
	 * @param ctx the parse tree
	 */
	void exitCollate(OpenGaussStatementParser.CollateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optClass}.
	 * @param ctx the parse tree
	 */
	void enterOptClass(OpenGaussStatementParser.OptClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optClass}.
	 * @param ctx the parse tree
	 */
	void exitOptClass(OpenGaussStatementParser.OptClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void enterReloptions(OpenGaussStatementParser.ReloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void exitReloptions(OpenGaussStatementParser.ReloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reloptionList}.
	 * @param ctx the parse tree
	 */
	void enterReloptionList(OpenGaussStatementParser.ReloptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reloptionList}.
	 * @param ctx the parse tree
	 */
	void exitReloptionList(OpenGaussStatementParser.ReloptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reloptionElem}.
	 * @param ctx the parse tree
	 */
	void enterReloptionElem(OpenGaussStatementParser.ReloptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reloptionElem}.
	 * @param ctx the parse tree
	 */
	void exitReloptionElem(OpenGaussStatementParser.ReloptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defArg}.
	 * @param ctx the parse tree
	 */
	void enterDefArg(OpenGaussStatementParser.DefArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defArg}.
	 * @param ctx the parse tree
	 */
	void exitDefArg(OpenGaussStatementParser.DefArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(OpenGaussStatementParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(OpenGaussStatementParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(OpenGaussStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(OpenGaussStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(OpenGaussStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(OpenGaussStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(OpenGaussStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(OpenGaussStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(OpenGaussStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(OpenGaussStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier(OpenGaussStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier(OpenGaussStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifiers(OpenGaussStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifiers(OpenGaussStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void enterSignedIconst(OpenGaussStatementParser.SignedIconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void exitSignedIconst(OpenGaussStatementParser.SignedIconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#booleanOrString}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrString(OpenGaussStatementParser.BooleanOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#booleanOrString}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrString(OpenGaussStatementParser.BooleanOrStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#nonReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterNonReservedWord(OpenGaussStatementParser.NonReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#nonReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitNonReservedWord(OpenGaussStatementParser.NonReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#colNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterColNameKeyword(OpenGaussStatementParser.ColNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#colNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitColNameKeyword(OpenGaussStatementParser.ColNameKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(OpenGaussStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(OpenGaussStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#roleSpec}.
	 * @param ctx the parse tree
	 */
	void enterRoleSpec(OpenGaussStatementParser.RoleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#roleSpec}.
	 * @param ctx the parse tree
	 */
	void exitRoleSpec(OpenGaussStatementParser.RoleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(OpenGaussStatementParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(OpenGaussStatementParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(OpenGaussStatementParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(OpenGaussStatementParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#varValue}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(OpenGaussStatementParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#varValue}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(OpenGaussStatementParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#zoneValue}.
	 * @param ctx the parse tree
	 */
	void enterZoneValue(OpenGaussStatementParser.ZoneValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#zoneValue}.
	 * @param ctx the parse tree
	 */
	void exitZoneValue(OpenGaussStatementParser.ZoneValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnly(OpenGaussStatementParser.NumericOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnly(OpenGaussStatementParser.NumericOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#isoLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsoLevel(OpenGaussStatementParser.IsoLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#isoLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsoLevel(OpenGaussStatementParser.IsoLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(OpenGaussStatementParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(OpenGaussStatementParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void enterColQualList(OpenGaussStatementParser.ColQualListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void exitColQualList(OpenGaussStatementParser.ColQualListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColConstraint(OpenGaussStatementParser.ColConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColConstraint(OpenGaussStatementParser.ColConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttr(OpenGaussStatementParser.ConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttr(OpenGaussStatementParser.ConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#colConstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterColConstraintElem(OpenGaussStatementParser.ColConstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#colConstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitColConstraintElem(OpenGaussStatementParser.ColConstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#parenthesizedSeqOptList}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedSeqOptList(OpenGaussStatementParser.ParenthesizedSeqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#parenthesizedSeqOptList}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedSeqOptList(OpenGaussStatementParser.ParenthesizedSeqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptList(OpenGaussStatementParser.SeqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptList(OpenGaussStatementParser.SeqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptElem(OpenGaussStatementParser.SeqOptElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptElem(OpenGaussStatementParser.SeqOptElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optColumnList}.
	 * @param ctx the parse tree
	 */
	void enterOptColumnList(OpenGaussStatementParser.OptColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optColumnList}.
	 * @param ctx the parse tree
	 */
	void exitOptColumnList(OpenGaussStatementParser.OptColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void enterColumnElem(OpenGaussStatementParser.ColumnElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void exitColumnElem(OpenGaussStatementParser.ColumnElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(OpenGaussStatementParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(OpenGaussStatementParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#generatedWhen}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedWhen(OpenGaussStatementParser.GeneratedWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#generatedWhen}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedWhen(OpenGaussStatementParser.GeneratedWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#noInherit}.
	 * @param ctx the parse tree
	 */
	void enterNoInherit(OpenGaussStatementParser.NoInheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#noInherit}.
	 * @param ctx the parse tree
	 */
	void exitNoInherit(OpenGaussStatementParser.NoInheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#consTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterConsTableSpace(OpenGaussStatementParser.ConsTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#consTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitConsTableSpace(OpenGaussStatementParser.ConsTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(OpenGaussStatementParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(OpenGaussStatementParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defList}.
	 * @param ctx the parse tree
	 */
	void enterDefList(OpenGaussStatementParser.DefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defList}.
	 * @param ctx the parse tree
	 */
	void exitDefList(OpenGaussStatementParser.DefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defElem}.
	 * @param ctx the parse tree
	 */
	void enterDefElem(OpenGaussStatementParser.DefElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defElem}.
	 * @param ctx the parse tree
	 */
	void exitDefElem(OpenGaussStatementParser.DefElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void enterColLabel(OpenGaussStatementParser.ColLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void exitColLabel(OpenGaussStatementParser.ColLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#keyActions}.
	 * @param ctx the parse tree
	 */
	void enterKeyActions(OpenGaussStatementParser.KeyActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#keyActions}.
	 * @param ctx the parse tree
	 */
	void exitKeyActions(OpenGaussStatementParser.KeyActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#keyDelete}.
	 * @param ctx the parse tree
	 */
	void enterKeyDelete(OpenGaussStatementParser.KeyDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#keyDelete}.
	 * @param ctx the parse tree
	 */
	void exitKeyDelete(OpenGaussStatementParser.KeyDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#keyUpdate}.
	 * @param ctx the parse tree
	 */
	void enterKeyUpdate(OpenGaussStatementParser.KeyUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#keyUpdate}.
	 * @param ctx the parse tree
	 */
	void exitKeyUpdate(OpenGaussStatementParser.KeyUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#keyAction}.
	 * @param ctx the parse tree
	 */
	void enterKeyAction(OpenGaussStatementParser.KeyActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#keyAction}.
	 * @param ctx the parse tree
	 */
	void exitKeyAction(OpenGaussStatementParser.KeyActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#keyMatch}.
	 * @param ctx the parse tree
	 */
	void enterKeyMatch(OpenGaussStatementParser.KeyMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#keyMatch}.
	 * @param ctx the parse tree
	 */
	void exitKeyMatch(OpenGaussStatementParser.KeyMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createGenericOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateGenericOptions(OpenGaussStatementParser.CreateGenericOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createGenericOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateGenericOptions(OpenGaussStatementParser.CreateGenericOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#genericOptionList}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionList(OpenGaussStatementParser.GenericOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#genericOptionList}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionList(OpenGaussStatementParser.GenericOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#genericOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionElem(OpenGaussStatementParser.GenericOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#genericOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionElem(OpenGaussStatementParser.GenericOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#genericOptionArg}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionArg(OpenGaussStatementParser.GenericOptionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#genericOptionArg}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionArg(OpenGaussStatementParser.GenericOptionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#genericOptionName}.
	 * @param ctx the parse tree
	 */
	void enterGenericOptionName(OpenGaussStatementParser.GenericOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#genericOptionName}.
	 * @param ctx the parse tree
	 */
	void exitGenericOptionName(OpenGaussStatementParser.GenericOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#replicaIdentity}.
	 * @param ctx the parse tree
	 */
	void enterReplicaIdentity(OpenGaussStatementParser.ReplicaIdentityContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#replicaIdentity}.
	 * @param ctx the parse tree
	 */
	void exitReplicaIdentity(OpenGaussStatementParser.ReplicaIdentityContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#operArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterOperArgtypes(OpenGaussStatementParser.OperArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#operArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitOperArgtypes(OpenGaussStatementParser.OperArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(OpenGaussStatementParser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(OpenGaussStatementParser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#argClass}.
	 * @param ctx the parse tree
	 */
	void enterArgClass(OpenGaussStatementParser.ArgClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#argClass}.
	 * @param ctx the parse tree
	 */
	void exitArgClass(OpenGaussStatementParser.ArgClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArgsList}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgsList(OpenGaussStatementParser.FuncArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArgsList}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgsList(OpenGaussStatementParser.FuncArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#nonReservedWordOrSconst}.
	 * @param ctx the parse tree
	 */
	void enterNonReservedWordOrSconst(OpenGaussStatementParser.NonReservedWordOrSconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#nonReservedWordOrSconst}.
	 * @param ctx the parse tree
	 */
	void exitNonReservedWordOrSconst(OpenGaussStatementParser.NonReservedWordOrSconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(OpenGaussStatementParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(OpenGaussStatementParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#roleList}.
	 * @param ctx the parse tree
	 */
	void enterRoleList(OpenGaussStatementParser.RoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#roleList}.
	 * @param ctx the parse tree
	 */
	void exitRoleList(OpenGaussStatementParser.RoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void enterSetResetClause(OpenGaussStatementParser.SetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void exitSetResetClause(OpenGaussStatementParser.SetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setRest}.
	 * @param ctx the parse tree
	 */
	void enterSetRest(OpenGaussStatementParser.SetRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setRest}.
	 * @param ctx the parse tree
	 */
	void exitSetRest(OpenGaussStatementParser.SetRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#transactionModeList}.
	 * @param ctx the parse tree
	 */
	void enterTransactionModeList(OpenGaussStatementParser.TransactionModeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#transactionModeList}.
	 * @param ctx the parse tree
	 */
	void exitTransactionModeList(OpenGaussStatementParser.TransactionModeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#transactionModeItem}.
	 * @param ctx the parse tree
	 */
	void enterTransactionModeItem(OpenGaussStatementParser.TransactionModeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#transactionModeItem}.
	 * @param ctx the parse tree
	 */
	void exitTransactionModeItem(OpenGaussStatementParser.TransactionModeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setRestMore}.
	 * @param ctx the parse tree
	 */
	void enterSetRestMore(OpenGaussStatementParser.SetRestMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setRestMore}.
	 * @param ctx the parse tree
	 */
	void exitSetRestMore(OpenGaussStatementParser.SetRestMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#encoding}.
	 * @param ctx the parse tree
	 */
	void enterEncoding(OpenGaussStatementParser.EncodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#encoding}.
	 * @param ctx the parse tree
	 */
	void exitEncoding(OpenGaussStatementParser.EncodingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#genericSet}.
	 * @param ctx the parse tree
	 */
	void enterGenericSet(OpenGaussStatementParser.GenericSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#genericSet}.
	 * @param ctx the parse tree
	 */
	void exitGenericSet(OpenGaussStatementParser.GenericSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableResetStmt(OpenGaussStatementParser.VariableResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableResetStmt(OpenGaussStatementParser.VariableResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#resetRest}.
	 * @param ctx the parse tree
	 */
	void enterResetRest(OpenGaussStatementParser.ResetRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#resetRest}.
	 * @param ctx the parse tree
	 */
	void exitResetRest(OpenGaussStatementParser.ResetRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#genericReset}.
	 * @param ctx the parse tree
	 */
	void enterGenericReset(OpenGaussStatementParser.GenericResetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#genericReset}.
	 * @param ctx the parse tree
	 */
	void exitGenericReset(OpenGaussStatementParser.GenericResetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#relationExprList}.
	 * @param ctx the parse tree
	 */
	void enterRelationExprList(OpenGaussStatementParser.RelationExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#relationExprList}.
	 * @param ctx the parse tree
	 */
	void exitRelationExprList(OpenGaussStatementParser.RelationExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#commonFuncOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCommonFuncOptItem(OpenGaussStatementParser.CommonFuncOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#commonFuncOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCommonFuncOptItem(OpenGaussStatementParser.CommonFuncOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSetResetClause(OpenGaussStatementParser.FunctionSetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSetResetClause(OpenGaussStatementParser.FunctionSetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#rowSecurityCmd}.
	 * @param ctx the parse tree
	 */
	void enterRowSecurityCmd(OpenGaussStatementParser.RowSecurityCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#rowSecurityCmd}.
	 * @param ctx the parse tree
	 */
	void exitRowSecurityCmd(OpenGaussStatementParser.RowSecurityCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(OpenGaussStatementParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(OpenGaussStatementParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typeNameList}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameList(OpenGaussStatementParser.TypeNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typeNameList}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameList(OpenGaussStatementParser.TypeNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(OpenGaussStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(OpenGaussStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(OpenGaussStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(OpenGaussStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(OpenGaussStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(OpenGaussStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(OpenGaussStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(OpenGaussStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 */
	void enterOptionForClause(OpenGaussStatementParser.OptionForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 */
	void exitOptionForClause(OpenGaussStatementParser.OptionForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(OpenGaussStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(OpenGaussStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterCreateOptRoleElem(OpenGaussStatementParser.CreateOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitCreateOptRoleElem(OpenGaussStatementParser.CreateOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterAlterOptRoleElem(OpenGaussStatementParser.AlterOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitAlterOptRoleElem(OpenGaussStatementParser.AlterOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropBehavior}.
	 * @param ctx the parse tree
	 */
	void enterDropBehavior(OpenGaussStatementParser.DropBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropBehavior}.
	 * @param ctx the parse tree
	 */
	void exitDropBehavior(OpenGaussStatementParser.DropBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(OpenGaussStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(OpenGaussStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(OpenGaussStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(OpenGaussStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterUserClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserClauses(OpenGaussStatementParser.AlterUserClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterUserClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserClauses(OpenGaussStatementParser.AlterUserClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 */
	void enterAlterOptRoleList(OpenGaussStatementParser.AlterOptRoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 */
	void exitAlterOptRoleList(OpenGaussStatementParser.AlterOptRoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(OpenGaussStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(OpenGaussStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(OpenGaussStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(OpenGaussStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(OpenGaussStatementParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(OpenGaussStatementParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateGroup(OpenGaussStatementParser.CreateGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateGroup(OpenGaussStatementParser.CreateGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropDroup}.
	 * @param ctx the parse tree
	 */
	void enterDropDroup(OpenGaussStatementParser.DropDroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropDroup}.
	 * @param ctx the parse tree
	 */
	void exitDropDroup(OpenGaussStatementParser.DropDroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reassignOwned}.
	 * @param ctx the parse tree
	 */
	void enterReassignOwned(OpenGaussStatementParser.ReassignOwnedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reassignOwned}.
	 * @param ctx the parse tree
	 */
	void exitReassignOwned(OpenGaussStatementParser.ReassignOwnedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(OpenGaussStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(OpenGaussStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#executeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterExecuteParamClause(OpenGaussStatementParser.ExecuteParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#executeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitExecuteParamClause(OpenGaussStatementParser.ExecuteParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionBoundSpec(OpenGaussStatementParser.PartitionBoundSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionBoundSpec(OpenGaussStatementParser.PartitionBoundSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#hashPartbound}.
	 * @param ctx the parse tree
	 */
	void enterHashPartbound(OpenGaussStatementParser.HashPartboundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#hashPartbound}.
	 * @param ctx the parse tree
	 */
	void exitHashPartbound(OpenGaussStatementParser.HashPartboundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#hashPartboundElem}.
	 * @param ctx the parse tree
	 */
	void enterHashPartboundElem(OpenGaussStatementParser.HashPartboundElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#hashPartboundElem}.
	 * @param ctx the parse tree
	 */
	void exitHashPartboundElem(OpenGaussStatementParser.HashPartboundElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typedTableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTypedTableElementList(OpenGaussStatementParser.TypedTableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typedTableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTypedTableElementList(OpenGaussStatementParser.TypedTableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#typedTableElement}.
	 * @param ctx the parse tree
	 */
	void enterTypedTableElement(OpenGaussStatementParser.TypedTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#typedTableElement}.
	 * @param ctx the parse tree
	 */
	void exitTypedTableElement(OpenGaussStatementParser.TypedTableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void enterColumnOptions(OpenGaussStatementParser.ColumnOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void exitColumnOptions(OpenGaussStatementParser.ColumnOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#withData}.
	 * @param ctx the parse tree
	 */
	void enterWithData(OpenGaussStatementParser.WithDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#withData}.
	 * @param ctx the parse tree
	 */
	void exitWithData(OpenGaussStatementParser.WithDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableSpace}.
	 * @param ctx the parse tree
	 */
	void enterTableSpace(OpenGaussStatementParser.TableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableSpace}.
	 * @param ctx the parse tree
	 */
	void exitTableSpace(OpenGaussStatementParser.TableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void enterOnCommitOption(OpenGaussStatementParser.OnCommitOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void exitOnCommitOption(OpenGaussStatementParser.OnCommitOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#withOption}.
	 * @param ctx the parse tree
	 */
	void enterWithOption(OpenGaussStatementParser.WithOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#withOption}.
	 * @param ctx the parse tree
	 */
	void exitWithOption(OpenGaussStatementParser.WithOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableAccessMethodClause}.
	 * @param ctx the parse tree
	 */
	void enterTableAccessMethodClause(OpenGaussStatementParser.TableAccessMethodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableAccessMethodClause}.
	 * @param ctx the parse tree
	 */
	void exitTableAccessMethodClause(OpenGaussStatementParser.TableAccessMethodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#accessMethod}.
	 * @param ctx the parse tree
	 */
	void enterAccessMethod(OpenGaussStatementParser.AccessMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#accessMethod}.
	 * @param ctx the parse tree
	 */
	void exitAccessMethod(OpenGaussStatementParser.AccessMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(OpenGaussStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(OpenGaussStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(OpenGaussStatementParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(OpenGaussStatementParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexIncludingParams}.
	 * @param ctx the parse tree
	 */
	void enterIndexIncludingParams(OpenGaussStatementParser.IndexIncludingParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexIncludingParams}.
	 * @param ctx the parse tree
	 */
	void exitIndexIncludingParams(OpenGaussStatementParser.IndexIncludingParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#accessMethodClause}.
	 * @param ctx the parse tree
	 */
	void enterAccessMethodClause(OpenGaussStatementParser.AccessMethodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#accessMethodClause}.
	 * @param ctx the parse tree
	 */
	void exitAccessMethodClause(OpenGaussStatementParser.AccessMethodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(OpenGaussStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(OpenGaussStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(OpenGaussStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(OpenGaussStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(OpenGaussStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(OpenGaussStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropDirectory}.
	 * @param ctx the parse tree
	 */
	void enterDropDirectory(OpenGaussStatementParser.DropDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropDirectory}.
	 * @param ctx the parse tree
	 */
	void exitDropDirectory(OpenGaussStatementParser.DropDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createDatabaseSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification(OpenGaussStatementParser.CreateDatabaseSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createDatabaseSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification(OpenGaussStatementParser.CreateDatabaseSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createdbOptName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbOptName(OpenGaussStatementParser.CreatedbOptNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createdbOptName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbOptName(OpenGaussStatementParser.CreatedbOptNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(OpenGaussStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(OpenGaussStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(OpenGaussStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(OpenGaussStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(OpenGaussStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(OpenGaussStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropTableOpt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableOpt(OpenGaussStatementParser.DropTableOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropTableOpt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableOpt(OpenGaussStatementParser.DropTableOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(OpenGaussStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(OpenGaussStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropIndexOpt}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexOpt(OpenGaussStatementParser.DropIndexOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropIndexOpt}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexOpt(OpenGaussStatementParser.DropIndexOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(OpenGaussStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(OpenGaussStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#restartSeqs}.
	 * @param ctx the parse tree
	 */
	void enterRestartSeqs(OpenGaussStatementParser.RestartSeqsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#restartSeqs}.
	 * @param ctx the parse tree
	 */
	void exitRestartSeqs(OpenGaussStatementParser.RestartSeqsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpecification(OpenGaussStatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpecification(OpenGaussStatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(OpenGaussStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(OpenGaussStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinition(OpenGaussStatementParser.CreateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinition(OpenGaussStatementParser.CreateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(OpenGaussStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(OpenGaussStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(OpenGaussStatementParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(OpenGaussStatementParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void enterConstraintClause(OpenGaussStatementParser.ConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void exitConstraintClause(OpenGaussStatementParser.ConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraintOption(OpenGaussStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraintOption(OpenGaussStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#checkOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckOption(OpenGaussStatementParser.CheckOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#checkOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckOption(OpenGaussStatementParser.CheckOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpr(OpenGaussStatementParser.DefaultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpr(OpenGaussStatementParser.DefaultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOptions(OpenGaussStatementParser.SequenceOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOptions(OpenGaussStatementParser.SequenceOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOption(OpenGaussStatementParser.SequenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOption(OpenGaussStatementParser.SequenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void enterIndexParameters(OpenGaussStatementParser.IndexParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void exitIndexParameters(OpenGaussStatementParser.IndexParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(OpenGaussStatementParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(OpenGaussStatementParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 */
	void enterConstraintOptionalParam(OpenGaussStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 */
	void exitConstraintOptionalParam(OpenGaussStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void enterLikeOption(OpenGaussStatementParser.LikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void exitLikeOption(OpenGaussStatementParser.LikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(OpenGaussStatementParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(OpenGaussStatementParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintOption(OpenGaussStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintOption(OpenGaussStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterExclusionWhereClause(OpenGaussStatementParser.ExclusionWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitExclusionWhereClause(OpenGaussStatementParser.ExclusionWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void enterExclusionConstraintList(OpenGaussStatementParser.ExclusionConstraintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void exitExclusionConstraintList(OpenGaussStatementParser.ExclusionConstraintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterExclusionConstraintElem(OpenGaussStatementParser.ExclusionConstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitExclusionConstraintElem(OpenGaussStatementParser.ExclusionConstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#inheritClause}.
	 * @param ctx the parse tree
	 */
	void enterInheritClause(OpenGaussStatementParser.InheritClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#inheritClause}.
	 * @param ctx the parse tree
	 */
	void exitInheritClause(OpenGaussStatementParser.InheritClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(OpenGaussStatementParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(OpenGaussStatementParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#partParams}.
	 * @param ctx the parse tree
	 */
	void enterPartParams(OpenGaussStatementParser.PartParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#partParams}.
	 * @param ctx the parse tree
	 */
	void exitPartParams(OpenGaussStatementParser.PartParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#partElem}.
	 * @param ctx the parse tree
	 */
	void enterPartElem(OpenGaussStatementParser.PartElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#partElem}.
	 * @param ctx the parse tree
	 */
	void exitPartElem(OpenGaussStatementParser.PartElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcExprWindowless}.
	 * @param ctx the parse tree
	 */
	void enterFuncExprWindowless(OpenGaussStatementParser.FuncExprWindowlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcExprWindowless}.
	 * @param ctx the parse tree
	 */
	void exitFuncExprWindowless(OpenGaussStatementParser.FuncExprWindowlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#partStrategy}.
	 * @param ctx the parse tree
	 */
	void enterPartStrategy(OpenGaussStatementParser.PartStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#partStrategy}.
	 * @param ctx the parse tree
	 */
	void exitPartStrategy(OpenGaussStatementParser.PartStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification(OpenGaussStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification(OpenGaussStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#concurrentlyClause}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentlyClause(OpenGaussStatementParser.ConcurrentlyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#concurrentlyClause}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentlyClause(OpenGaussStatementParser.ConcurrentlyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#onlyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnlyClause(OpenGaussStatementParser.OnlyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#onlyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnlyClause(OpenGaussStatementParser.OnlyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(OpenGaussStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(OpenGaussStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#asteriskClause}.
	 * @param ctx the parse tree
	 */
	void enterAsteriskClause(OpenGaussStatementParser.AsteriskClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#asteriskClause}.
	 * @param ctx the parse tree
	 */
	void exitAsteriskClause(OpenGaussStatementParser.AsteriskClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(OpenGaussStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(OpenGaussStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#partitionCmd}.
	 * @param ctx the parse tree
	 */
	void enterPartitionCmd(OpenGaussStatementParser.PartitionCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#partitionCmd}.
	 * @param ctx the parse tree
	 */
	void exitPartitionCmd(OpenGaussStatementParser.PartitionCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterIndexDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexDefinitionClause(OpenGaussStatementParser.AlterIndexDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterIndexDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexDefinitionClause(OpenGaussStatementParser.AlterIndexDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexPartitionCmd}.
	 * @param ctx the parse tree
	 */
	void enterIndexPartitionCmd(OpenGaussStatementParser.IndexPartitionCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexPartitionCmd}.
	 * @param ctx the parse tree
	 */
	void exitIndexPartitionCmd(OpenGaussStatementParser.IndexPartitionCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameIndexSpecification(OpenGaussStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameIndexSpecification(OpenGaussStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexDependsOnExtension(OpenGaussStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexDependsOnExtension(OpenGaussStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexSetTableSpace(OpenGaussStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexSetTableSpace(OpenGaussStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 */
	void enterTableNamesClause(OpenGaussStatementParser.TableNamesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 */
	void exitTableNamesClause(OpenGaussStatementParser.TableNamesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 */
	void enterTableNameClause(OpenGaussStatementParser.TableNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 */
	void exitTableNameClause(OpenGaussStatementParser.TableNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableActions(OpenGaussStatementParser.AlterTableActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableActions(OpenGaussStatementParser.AlterTableActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAction(OpenGaussStatementParser.AlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAction(OpenGaussStatementParser.AlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(OpenGaussStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(OpenGaussStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(OpenGaussStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(OpenGaussStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(OpenGaussStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(OpenGaussStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumn(OpenGaussStatementParser.ModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumn(OpenGaussStatementParser.ModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnSetOption(OpenGaussStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnSetOption(OpenGaussStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOptions(OpenGaussStatementParser.AttributeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOptions(OpenGaussStatementParser.AttributeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOption(OpenGaussStatementParser.AttributeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOption(OpenGaussStatementParser.AttributeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(OpenGaussStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(OpenGaussStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintUsingIndex(OpenGaussStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintUsingIndex(OpenGaussStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#modifyConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyConstraintSpecification(OpenGaussStatementParser.ModifyConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#modifyConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyConstraintSpecification(OpenGaussStatementParser.ModifyConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#validateConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterValidateConstraintSpecification(OpenGaussStatementParser.ValidateConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#validateConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitValidateConstraintSpecification(OpenGaussStatementParser.ValidateConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintSpecification(OpenGaussStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintSpecification(OpenGaussStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameterWithValue(OpenGaussStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameterWithValue(OpenGaussStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameter(OpenGaussStatementParser.StorageParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameter(OpenGaussStatementParser.StorageParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumnSpecification(OpenGaussStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumnSpecification(OpenGaussStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 */
	void enterRenameConstraint(OpenGaussStatementParser.RenameConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 */
	void exitRenameConstraint(OpenGaussStatementParser.RenameConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableSpecification(OpenGaussStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableSpecification(OpenGaussStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#indexNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexNames(OpenGaussStatementParser.IndexNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#indexNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexNames(OpenGaussStatementParser.IndexNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(OpenGaussStatementParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(OpenGaussStatementParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseClause(OpenGaussStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseClause(OpenGaussStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createdbOptItems}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbOptItems(OpenGaussStatementParser.CreatedbOptItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createdbOptItems}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbOptItems(OpenGaussStatementParser.CreatedbOptItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createdbOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbOptItem(OpenGaussStatementParser.CreatedbOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createdbOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbOptItem(OpenGaussStatementParser.CreatedbOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTableCmds}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableCmds(OpenGaussStatementParser.AlterTableCmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTableCmds}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableCmds(OpenGaussStatementParser.AlterTableCmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTableCmd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableCmd(OpenGaussStatementParser.AlterTableCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTableCmd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableCmd(OpenGaussStatementParser.AlterTableCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeSpec(OpenGaussStatementParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeSpec(OpenGaussStatementParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeElem(OpenGaussStatementParser.ConstraintAttributeElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeElem(OpenGaussStatementParser.ConstraintAttributeElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterGenericOptions(OpenGaussStatementParser.AlterGenericOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterGenericOptions(OpenGaussStatementParser.AlterGenericOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterGenericOptionList(OpenGaussStatementParser.AlterGenericOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterGenericOptionList(OpenGaussStatementParser.AlterGenericOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterAlterGenericOptionElem(OpenGaussStatementParser.AlterGenericOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitAlterGenericOptionElem(OpenGaussStatementParser.AlterGenericOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterUsing}.
	 * @param ctx the parse tree
	 */
	void enterAlterUsing(OpenGaussStatementParser.AlterUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterUsing}.
	 * @param ctx the parse tree
	 */
	void exitAlterUsing(OpenGaussStatementParser.AlterUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#setData}.
	 * @param ctx the parse tree
	 */
	void enterSetData(OpenGaussStatementParser.SetDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#setData}.
	 * @param ctx the parse tree
	 */
	void exitSetData(OpenGaussStatementParser.SetDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterIdentityColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterIdentityColumnOptionList(OpenGaussStatementParser.AlterIdentityColumnOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterIdentityColumnOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterIdentityColumnOptionList(OpenGaussStatementParser.AlterIdentityColumnOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterIdentityColumnOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterIdentityColumnOption(OpenGaussStatementParser.AlterIdentityColumnOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterIdentityColumnOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterIdentityColumnOption(OpenGaussStatementParser.AlterIdentityColumnOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterColumnDefault}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnDefault(OpenGaussStatementParser.AlterColumnDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterColumnDefault}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnDefault(OpenGaussStatementParser.AlterColumnDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOperator}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperator(OpenGaussStatementParser.AlterOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOperator}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperator(OpenGaussStatementParser.AlterOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClass}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorClass(OpenGaussStatementParser.AlterOperatorClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClass}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorClass(OpenGaussStatementParser.AlterOperatorClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClassClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorClassClauses(OpenGaussStatementParser.AlterOperatorClassClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClassClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorClassClauses(OpenGaussStatementParser.AlterOperatorClassClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorFamily(OpenGaussStatementParser.AlterOperatorFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorFamily(OpenGaussStatementParser.AlterOperatorFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOperatorFamilyClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorFamilyClauses(OpenGaussStatementParser.AlterOperatorFamilyClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorFamilyClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorFamilyClauses(OpenGaussStatementParser.AlterOperatorFamilyClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#opclassItemList}.
	 * @param ctx the parse tree
	 */
	void enterOpclassItemList(OpenGaussStatementParser.OpclassItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#opclassItemList}.
	 * @param ctx the parse tree
	 */
	void exitOpclassItemList(OpenGaussStatementParser.OpclassItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#opclassItem}.
	 * @param ctx the parse tree
	 */
	void enterOpclassItem(OpenGaussStatementParser.OpclassItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#opclassItem}.
	 * @param ctx the parse tree
	 */
	void exitOpclassItem(OpenGaussStatementParser.OpclassItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#opclassPurpose}.
	 * @param ctx the parse tree
	 */
	void enterOpclassPurpose(OpenGaussStatementParser.OpclassPurposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#opclassPurpose}.
	 * @param ctx the parse tree
	 */
	void exitOpclassPurpose(OpenGaussStatementParser.OpclassPurposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorClauses(OpenGaussStatementParser.AlterOperatorClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorClauses(OpenGaussStatementParser.AlterOperatorClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#operatorDefList}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDefList(OpenGaussStatementParser.OperatorDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#operatorDefList}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDefList(OpenGaussStatementParser.OperatorDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#operatorDefElem}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDefElem(OpenGaussStatementParser.OperatorDefElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#operatorDefElem}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDefElem(OpenGaussStatementParser.OperatorDefElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#operatorDefArg}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDefArg(OpenGaussStatementParser.OperatorDefArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#operatorDefArg}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDefArg(OpenGaussStatementParser.OperatorDefArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#operatorWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterOperatorWithArgtypes(OpenGaussStatementParser.OperatorWithArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#operatorWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitOperatorWithArgtypes(OpenGaussStatementParser.OperatorWithArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterAggregate}.
	 * @param ctx the parse tree
	 */
	void enterAlterAggregate(OpenGaussStatementParser.AlterAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterAggregate}.
	 * @param ctx the parse tree
	 */
	void exitAlterAggregate(OpenGaussStatementParser.AlterAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aggregateSignature}.
	 * @param ctx the parse tree
	 */
	void enterAggregateSignature(OpenGaussStatementParser.AggregateSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aggregateSignature}.
	 * @param ctx the parse tree
	 */
	void exitAggregateSignature(OpenGaussStatementParser.AggregateSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aggrArgs}.
	 * @param ctx the parse tree
	 */
	void enterAggrArgs(OpenGaussStatementParser.AggrArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aggrArgs}.
	 * @param ctx the parse tree
	 */
	void exitAggrArgs(OpenGaussStatementParser.AggrArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aggrArgsList}.
	 * @param ctx the parse tree
	 */
	void enterAggrArgsList(OpenGaussStatementParser.AggrArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aggrArgsList}.
	 * @param ctx the parse tree
	 */
	void exitAggrArgsList(OpenGaussStatementParser.AggrArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aggrArg}.
	 * @param ctx the parse tree
	 */
	void enterAggrArg(OpenGaussStatementParser.AggrArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aggrArg}.
	 * @param ctx the parse tree
	 */
	void exitAggrArg(OpenGaussStatementParser.AggrArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterAggregateDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterAggregateDefinitionClause(OpenGaussStatementParser.AlterAggregateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterAggregateDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterAggregateDefinitionClause(OpenGaussStatementParser.AlterAggregateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterCollation}.
	 * @param ctx the parse tree
	 */
	void enterAlterCollation(OpenGaussStatementParser.AlterCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterCollation}.
	 * @param ctx the parse tree
	 */
	void exitAlterCollation(OpenGaussStatementParser.AlterCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterCollationClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterCollationClause(OpenGaussStatementParser.AlterCollationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterCollationClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterCollationClause(OpenGaussStatementParser.AlterCollationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterSynonym}.
	 * @param ctx the parse tree
	 */
	void enterAlterSynonym(OpenGaussStatementParser.AlterSynonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterSynonym}.
	 * @param ctx the parse tree
	 */
	void exitAlterSynonym(OpenGaussStatementParser.AlterSynonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterDirectory}.
	 * @param ctx the parse tree
	 */
	void enterAlterDirectory(OpenGaussStatementParser.AlterDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterDirectory}.
	 * @param ctx the parse tree
	 */
	void exitAlterDirectory(OpenGaussStatementParser.AlterDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterConversion}.
	 * @param ctx the parse tree
	 */
	void enterAlterConversion(OpenGaussStatementParser.AlterConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterConversion}.
	 * @param ctx the parse tree
	 */
	void exitAlterConversion(OpenGaussStatementParser.AlterConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterConversionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterConversionClause(OpenGaussStatementParser.AlterConversionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterConversionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterConversionClause(OpenGaussStatementParser.AlterConversionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefaultPrivileges(OpenGaussStatementParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefaultPrivileges(OpenGaussStatementParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void enterDefACLAction(OpenGaussStatementParser.DefACLActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void exitDefACLAction(OpenGaussStatementParser.DefACLActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#grantGrantOption}.
	 * @param ctx the parse tree
	 */
	void enterGrantGrantOption(OpenGaussStatementParser.GrantGrantOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#grantGrantOption}.
	 * @param ctx the parse tree
	 */
	void exitGrantGrantOption(OpenGaussStatementParser.GrantGrantOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#granteeList}.
	 * @param ctx the parse tree
	 */
	void enterGranteeList(OpenGaussStatementParser.GranteeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#granteeList}.
	 * @param ctx the parse tree
	 */
	void exitGranteeList(OpenGaussStatementParser.GranteeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(OpenGaussStatementParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(OpenGaussStatementParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defaclPrivilegeTarget}.
	 * @param ctx the parse tree
	 */
	void enterDefaclPrivilegeTarget(OpenGaussStatementParser.DefaclPrivilegeTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defaclPrivilegeTarget}.
	 * @param ctx the parse tree
	 */
	void exitDefaclPrivilegeTarget(OpenGaussStatementParser.DefaclPrivilegeTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(OpenGaussStatementParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(OpenGaussStatementParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#privilegeList}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeList(OpenGaussStatementParser.PrivilegeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#privilegeList}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeList(OpenGaussStatementParser.PrivilegeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(OpenGaussStatementParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(OpenGaussStatementParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOptionList(OpenGaussStatementParser.DefACLOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOptionList(OpenGaussStatementParser.DefACLOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOption(OpenGaussStatementParser.DefACLOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOption(OpenGaussStatementParser.DefACLOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#schemaNameList}.
	 * @param ctx the parse tree
	 */
	void enterSchemaNameList(OpenGaussStatementParser.SchemaNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#schemaNameList}.
	 * @param ctx the parse tree
	 */
	void exitSchemaNameList(OpenGaussStatementParser.SchemaNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomain(OpenGaussStatementParser.AlterDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomain(OpenGaussStatementParser.AlterDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterDomainClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomainClause(OpenGaussStatementParser.AlterDomainClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterDomainClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomainClause(OpenGaussStatementParser.AlterDomainClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterEventTrigger(OpenGaussStatementParser.AlterEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterEventTrigger(OpenGaussStatementParser.AlterEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterEventTriggerClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterEventTriggerClause(OpenGaussStatementParser.AlterEventTriggerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterEventTriggerClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterEventTriggerClause(OpenGaussStatementParser.AlterEventTriggerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tiggerName}.
	 * @param ctx the parse tree
	 */
	void enterTiggerName(OpenGaussStatementParser.TiggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tiggerName}.
	 * @param ctx the parse tree
	 */
	void exitTiggerName(OpenGaussStatementParser.TiggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterExtension}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtension(OpenGaussStatementParser.AlterExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterExtension}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtension(OpenGaussStatementParser.AlterExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createSynonym}.
	 * @param ctx the parse tree
	 */
	void enterCreateSynonym(OpenGaussStatementParser.CreateSynonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createSynonym}.
	 * @param ctx the parse tree
	 */
	void exitCreateSynonym(OpenGaussStatementParser.CreateSynonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterExtensionClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionClauses(OpenGaussStatementParser.AlterExtensionClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterExtensionClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionClauses(OpenGaussStatementParser.AlterExtensionClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#functionWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithArgtypes(OpenGaussStatementParser.FunctionWithArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#functionWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithArgtypes(OpenGaussStatementParser.FunctionWithArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(OpenGaussStatementParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(OpenGaussStatementParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aggregateWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWithArgtypes(OpenGaussStatementParser.AggregateWithArgtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aggregateWithArgtypes}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWithArgtypes(OpenGaussStatementParser.AggregateWithArgtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionOptList(OpenGaussStatementParser.AlterExtensionOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionOptList(OpenGaussStatementParser.AlterExtensionOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionOptItem(OpenGaussStatementParser.AlterExtensionOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionOptItem(OpenGaussStatementParser.AlterExtensionOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignDataWrapper(OpenGaussStatementParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignDataWrapper(OpenGaussStatementParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterForeignDataWrapperClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignDataWrapperClauses(OpenGaussStatementParser.AlterForeignDataWrapperClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterForeignDataWrapperClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignDataWrapperClauses(OpenGaussStatementParser.AlterForeignDataWrapperClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#fdwOptions}.
	 * @param ctx the parse tree
	 */
	void enterFdwOptions(OpenGaussStatementParser.FdwOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#fdwOptions}.
	 * @param ctx the parse tree
	 */
	void exitFdwOptions(OpenGaussStatementParser.FdwOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#fdwOption}.
	 * @param ctx the parse tree
	 */
	void enterFdwOption(OpenGaussStatementParser.FdwOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#fdwOption}.
	 * @param ctx the parse tree
	 */
	void exitFdwOption(OpenGaussStatementParser.FdwOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#handlerName}.
	 * @param ctx the parse tree
	 */
	void enterHandlerName(OpenGaussStatementParser.HandlerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#handlerName}.
	 * @param ctx the parse tree
	 */
	void exitHandlerName(OpenGaussStatementParser.HandlerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroup(OpenGaussStatementParser.AlterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroup(OpenGaussStatementParser.AlterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterGroupClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroupClauses(OpenGaussStatementParser.AlterGroupClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterGroupClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroupClauses(OpenGaussStatementParser.AlterGroupClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterLanguage}.
	 * @param ctx the parse tree
	 */
	void enterAlterLanguage(OpenGaussStatementParser.AlterLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterLanguage}.
	 * @param ctx the parse tree
	 */
	void exitAlterLanguage(OpenGaussStatementParser.AlterLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterLargeObject}.
	 * @param ctx the parse tree
	 */
	void enterAlterLargeObject(OpenGaussStatementParser.AlterLargeObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterLargeObject}.
	 * @param ctx the parse tree
	 */
	void exitAlterLargeObject(OpenGaussStatementParser.AlterLargeObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaterializedView(OpenGaussStatementParser.AlterMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaterializedView(OpenGaussStatementParser.AlterMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterMaterializedViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaterializedViewClauses(OpenGaussStatementParser.AlterMaterializedViewClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterMaterializedViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaterializedViewClauses(OpenGaussStatementParser.AlterMaterializedViewClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(OpenGaussStatementParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(OpenGaussStatementParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cursor}.
	 * @param ctx the parse tree
	 */
	void enterCursor(OpenGaussStatementParser.CursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cursor}.
	 * @param ctx the parse tree
	 */
	void exitCursor(OpenGaussStatementParser.CursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cursorOptions}.
	 * @param ctx the parse tree
	 */
	void enterCursorOptions(OpenGaussStatementParser.CursorOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cursorOptions}.
	 * @param ctx the parse tree
	 */
	void exitCursorOptions(OpenGaussStatementParser.CursorOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 */
	void enterCursorOption(OpenGaussStatementParser.CursorOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 */
	void exitCursorOption(OpenGaussStatementParser.CursorOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(OpenGaussStatementParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(OpenGaussStatementParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaterializedView(OpenGaussStatementParser.CreateMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaterializedView(OpenGaussStatementParser.CreateMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createMvTarget}.
	 * @param ctx the parse tree
	 */
	void enterCreateMvTarget(OpenGaussStatementParser.CreateMvTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createMvTarget}.
	 * @param ctx the parse tree
	 */
	void exitCreateMvTarget(OpenGaussStatementParser.CreateMvTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#refreshMatViewStmt}.
	 * @param ctx the parse tree
	 */
	void enterRefreshMatViewStmt(OpenGaussStatementParser.RefreshMatViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#refreshMatViewStmt}.
	 * @param ctx the parse tree
	 */
	void exitRefreshMatViewStmt(OpenGaussStatementParser.RefreshMatViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterPolicy}.
	 * @param ctx the parse tree
	 */
	void enterAlterPolicy(OpenGaussStatementParser.AlterPolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterPolicy}.
	 * @param ctx the parse tree
	 */
	void exitAlterPolicy(OpenGaussStatementParser.AlterPolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterPolicyClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterPolicyClauses(OpenGaussStatementParser.AlterPolicyClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterPolicyClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterPolicyClauses(OpenGaussStatementParser.AlterPolicyClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(OpenGaussStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(OpenGaussStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterProcedureClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedureClauses(OpenGaussStatementParser.AlterProcedureClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterProcedureClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedureClauses(OpenGaussStatementParser.AlterProcedureClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterfuncOptList}.
	 * @param ctx the parse tree
	 */
	void enterAlterfuncOptList(OpenGaussStatementParser.AlterfuncOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterfuncOptList}.
	 * @param ctx the parse tree
	 */
	void exitAlterfuncOptList(OpenGaussStatementParser.AlterfuncOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(OpenGaussStatementParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(OpenGaussStatementParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterFunctionClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunctionClauses(OpenGaussStatementParser.AlterFunctionClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterFunctionClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunctionClauses(OpenGaussStatementParser.AlterFunctionClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterPublication}.
	 * @param ctx the parse tree
	 */
	void enterAlterPublication(OpenGaussStatementParser.AlterPublicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterPublication}.
	 * @param ctx the parse tree
	 */
	void exitAlterPublication(OpenGaussStatementParser.AlterPublicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterRoutine}.
	 * @param ctx the parse tree
	 */
	void enterAlterRoutine(OpenGaussStatementParser.AlterRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterRoutine}.
	 * @param ctx the parse tree
	 */
	void exitAlterRoutine(OpenGaussStatementParser.AlterRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterRule(OpenGaussStatementParser.AlterRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterRule(OpenGaussStatementParser.AlterRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequence(OpenGaussStatementParser.AlterSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequence(OpenGaussStatementParser.AlterSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterSequenceClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequenceClauses(OpenGaussStatementParser.AlterSequenceClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterSequenceClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequenceClauses(OpenGaussStatementParser.AlterSequenceClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(OpenGaussStatementParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(OpenGaussStatementParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#foreignServerVersion}.
	 * @param ctx the parse tree
	 */
	void enterForeignServerVersion(OpenGaussStatementParser.ForeignServerVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#foreignServerVersion}.
	 * @param ctx the parse tree
	 */
	void exitForeignServerVersion(OpenGaussStatementParser.ForeignServerVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterStatistics}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatistics(OpenGaussStatementParser.AlterStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterStatistics}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatistics(OpenGaussStatementParser.AlterStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterSubscription}.
	 * @param ctx the parse tree
	 */
	void enterAlterSubscription(OpenGaussStatementParser.AlterSubscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterSubscription}.
	 * @param ctx the parse tree
	 */
	void exitAlterSubscription(OpenGaussStatementParser.AlterSubscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#publicationNameList}.
	 * @param ctx the parse tree
	 */
	void enterPublicationNameList(OpenGaussStatementParser.PublicationNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#publicationNameList}.
	 * @param ctx the parse tree
	 */
	void exitPublicationNameList(OpenGaussStatementParser.PublicationNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#publicationNameItem}.
	 * @param ctx the parse tree
	 */
	void enterPublicationNameItem(OpenGaussStatementParser.PublicationNameItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#publicationNameItem}.
	 * @param ctx the parse tree
	 */
	void exitPublicationNameItem(OpenGaussStatementParser.PublicationNameItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterSystem}.
	 * @param ctx the parse tree
	 */
	void enterAlterSystem(OpenGaussStatementParser.AlterSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterSystem}.
	 * @param ctx the parse tree
	 */
	void exitAlterSystem(OpenGaussStatementParser.AlterSystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(OpenGaussStatementParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(OpenGaussStatementParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchConfiguration(OpenGaussStatementParser.AlterTextSearchConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchConfiguration(OpenGaussStatementParser.AlterTextSearchConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchConfigurationClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchConfigurationClauses(OpenGaussStatementParser.AlterTextSearchConfigurationClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchConfigurationClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchConfigurationClauses(OpenGaussStatementParser.AlterTextSearchConfigurationClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#anyNameList}.
	 * @param ctx the parse tree
	 */
	void enterAnyNameList(OpenGaussStatementParser.AnyNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#anyNameList}.
	 * @param ctx the parse tree
	 */
	void exitAnyNameList(OpenGaussStatementParser.AnyNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchDictionary}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchDictionary(OpenGaussStatementParser.AlterTextSearchDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchDictionary}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchDictionary(OpenGaussStatementParser.AlterTextSearchDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchParser}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchParser(OpenGaussStatementParser.AlterTextSearchParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchParser}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchParser(OpenGaussStatementParser.AlterTextSearchParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchTemplate}.
	 * @param ctx the parse tree
	 */
	void enterAlterTextSearchTemplate(OpenGaussStatementParser.AlterTextSearchTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchTemplate}.
	 * @param ctx the parse tree
	 */
	void exitAlterTextSearchTemplate(OpenGaussStatementParser.AlterTextSearchTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterTrigger(OpenGaussStatementParser.AlterTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterTrigger(OpenGaussStatementParser.AlterTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterType}.
	 * @param ctx the parse tree
	 */
	void enterAlterType(OpenGaussStatementParser.AlterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterType}.
	 * @param ctx the parse tree
	 */
	void exitAlterType(OpenGaussStatementParser.AlterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTypeClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeClauses(OpenGaussStatementParser.AlterTypeClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTypeClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeClauses(OpenGaussStatementParser.AlterTypeClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTypeCmds}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeCmds(OpenGaussStatementParser.AlterTypeCmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTypeCmds}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeCmds(OpenGaussStatementParser.AlterTypeCmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterTypeCmd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeCmd(OpenGaussStatementParser.AlterTypeCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterTypeCmd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeCmd(OpenGaussStatementParser.AlterTypeCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMapping(OpenGaussStatementParser.AlterUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMapping(OpenGaussStatementParser.AlterUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#authIdent}.
	 * @param ctx the parse tree
	 */
	void enterAuthIdent(OpenGaussStatementParser.AuthIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#authIdent}.
	 * @param ctx the parse tree
	 */
	void exitAuthIdent(OpenGaussStatementParser.AuthIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(OpenGaussStatementParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(OpenGaussStatementParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewCmds}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewCmds(OpenGaussStatementParser.AlterViewCmdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewCmds}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewCmds(OpenGaussStatementParser.AlterViewCmdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterRenameView}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterRenameView(OpenGaussStatementParser.AlterRenameViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterRenameView}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterRenameView(OpenGaussStatementParser.AlterRenameViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterRenameColumn}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterRenameColumn(OpenGaussStatementParser.AlterRenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterRenameColumn}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterRenameColumn(OpenGaussStatementParser.AlterRenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterSetSchema}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterSetSchema(OpenGaussStatementParser.AlterSetSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterSetSchema}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterSetSchema(OpenGaussStatementParser.AlterSetSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(OpenGaussStatementParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(OpenGaussStatementParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#cluster}.
	 * @param ctx the parse tree
	 */
	void enterCluster(OpenGaussStatementParser.ClusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#cluster}.
	 * @param ctx the parse tree
	 */
	void exitCluster(OpenGaussStatementParser.ClusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#clusterIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterClusterIndexSpecification(OpenGaussStatementParser.ClusterIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#clusterIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitClusterIndexSpecification(OpenGaussStatementParser.ClusterIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(OpenGaussStatementParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(OpenGaussStatementParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#commentClauses}.
	 * @param ctx the parse tree
	 */
	void enterCommentClauses(OpenGaussStatementParser.CommentClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#commentClauses}.
	 * @param ctx the parse tree
	 */
	void exitCommentClauses(OpenGaussStatementParser.CommentClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#objectTypeNameOnAnyName}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeNameOnAnyName(OpenGaussStatementParser.ObjectTypeNameOnAnyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#objectTypeNameOnAnyName}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeNameOnAnyName(OpenGaussStatementParser.ObjectTypeNameOnAnyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#objectTypeName}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeName(OpenGaussStatementParser.ObjectTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#objectTypeName}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeName(OpenGaussStatementParser.ObjectTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDropTypeName(OpenGaussStatementParser.DropTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDropTypeName(OpenGaussStatementParser.DropTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#objectTypeAnyName}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeAnyName(OpenGaussStatementParser.ObjectTypeAnyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#objectTypeAnyName}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeAnyName(OpenGaussStatementParser.ObjectTypeAnyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(OpenGaussStatementParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(OpenGaussStatementParser.CommentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createAccessMethod}.
	 * @param ctx the parse tree
	 */
	void enterCreateAccessMethod(OpenGaussStatementParser.CreateAccessMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createAccessMethod}.
	 * @param ctx the parse tree
	 */
	void exitCreateAccessMethod(OpenGaussStatementParser.CreateAccessMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void enterCreateAggregate(OpenGaussStatementParser.CreateAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void exitCreateAggregate(OpenGaussStatementParser.CreateAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#oldAggrDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOldAggrDefinition(OpenGaussStatementParser.OldAggrDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#oldAggrDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOldAggrDefinition(OpenGaussStatementParser.OldAggrDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#oldAggrList}.
	 * @param ctx the parse tree
	 */
	void enterOldAggrList(OpenGaussStatementParser.OldAggrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#oldAggrList}.
	 * @param ctx the parse tree
	 */
	void exitOldAggrList(OpenGaussStatementParser.OldAggrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#oldAggrElem}.
	 * @param ctx the parse tree
	 */
	void enterOldAggrElem(OpenGaussStatementParser.OldAggrElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#oldAggrElem}.
	 * @param ctx the parse tree
	 */
	void exitOldAggrElem(OpenGaussStatementParser.OldAggrElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createCast}.
	 * @param ctx the parse tree
	 */
	void enterCreateCast(OpenGaussStatementParser.CreateCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createCast}.
	 * @param ctx the parse tree
	 */
	void exitCreateCast(OpenGaussStatementParser.CreateCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#castContext}.
	 * @param ctx the parse tree
	 */
	void enterCastContext(OpenGaussStatementParser.CastContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#castContext}.
	 * @param ctx the parse tree
	 */
	void exitCastContext(OpenGaussStatementParser.CastContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void enterCreateCollation(OpenGaussStatementParser.CreateCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void exitCreateCollation(OpenGaussStatementParser.CreateCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createConversion}.
	 * @param ctx the parse tree
	 */
	void enterCreateConversion(OpenGaussStatementParser.CreateConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createConversion}.
	 * @param ctx the parse tree
	 */
	void exitCreateConversion(OpenGaussStatementParser.CreateConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createDomain}.
	 * @param ctx the parse tree
	 */
	void enterCreateDomain(OpenGaussStatementParser.CreateDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createDomain}.
	 * @param ctx the parse tree
	 */
	void exitCreateDomain(OpenGaussStatementParser.CreateDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateEventTrigger(OpenGaussStatementParser.CreateEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateEventTrigger(OpenGaussStatementParser.CreateEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#eventTriggerWhenList}.
	 * @param ctx the parse tree
	 */
	void enterEventTriggerWhenList(OpenGaussStatementParser.EventTriggerWhenListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#eventTriggerWhenList}.
	 * @param ctx the parse tree
	 */
	void exitEventTriggerWhenList(OpenGaussStatementParser.EventTriggerWhenListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#eventTriggerWhenItem}.
	 * @param ctx the parse tree
	 */
	void enterEventTriggerWhenItem(OpenGaussStatementParser.EventTriggerWhenItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#eventTriggerWhenItem}.
	 * @param ctx the parse tree
	 */
	void exitEventTriggerWhenItem(OpenGaussStatementParser.EventTriggerWhenItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#eventTriggerValueList}.
	 * @param ctx the parse tree
	 */
	void enterEventTriggerValueList(OpenGaussStatementParser.EventTriggerValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#eventTriggerValueList}.
	 * @param ctx the parse tree
	 */
	void exitEventTriggerValueList(OpenGaussStatementParser.EventTriggerValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createExtension}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtension(OpenGaussStatementParser.CreateExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createExtension}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtension(OpenGaussStatementParser.CreateExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtensionOptList(OpenGaussStatementParser.CreateExtensionOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createExtensionOptList}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtensionOptList(OpenGaussStatementParser.CreateExtensionOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtensionOptItem(OpenGaussStatementParser.CreateExtensionOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createExtensionOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtensionOptItem(OpenGaussStatementParser.CreateExtensionOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignDataWrapper(OpenGaussStatementParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignDataWrapper(OpenGaussStatementParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createForeignTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignTable(OpenGaussStatementParser.CreateForeignTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createForeignTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignTable(OpenGaussStatementParser.CreateForeignTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignTableClauses(OpenGaussStatementParser.CreateForeignTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignTableClauses(OpenGaussStatementParser.CreateForeignTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(OpenGaussStatementParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(OpenGaussStatementParser.TableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(OpenGaussStatementParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(OpenGaussStatementParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeClause(OpenGaussStatementParser.TableLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeClause(OpenGaussStatementParser.TableLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOptionList(OpenGaussStatementParser.TableLikeOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOptionList(OpenGaussStatementParser.TableLikeOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOption(OpenGaussStatementParser.TableLikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOption(OpenGaussStatementParser.TableLikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(OpenGaussStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(OpenGaussStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableFuncColumnList}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncColumnList(OpenGaussStatementParser.TableFuncColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableFuncColumnList}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncColumnList(OpenGaussStatementParser.TableFuncColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tableFuncColumn}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncColumn(OpenGaussStatementParser.TableFuncColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tableFuncColumn}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncColumn(OpenGaussStatementParser.TableFuncColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createfuncOptList}.
	 * @param ctx the parse tree
	 */
	void enterCreatefuncOptList(OpenGaussStatementParser.CreatefuncOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createfuncOptList}.
	 * @param ctx the parse tree
	 */
	void exitCreatefuncOptList(OpenGaussStatementParser.CreatefuncOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createfuncOptItem}.
	 * @param ctx the parse tree
	 */
	void enterCreatefuncOptItem(OpenGaussStatementParser.CreatefuncOptItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createfuncOptItem}.
	 * @param ctx the parse tree
	 */
	void exitCreatefuncOptItem(OpenGaussStatementParser.CreatefuncOptItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#transformTypeList}.
	 * @param ctx the parse tree
	 */
	void enterTransformTypeList(OpenGaussStatementParser.TransformTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#transformTypeList}.
	 * @param ctx the parse tree
	 */
	void exitTransformTypeList(OpenGaussStatementParser.TransformTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcAs}.
	 * @param ctx the parse tree
	 */
	void enterFuncAs(OpenGaussStatementParser.FuncAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcAs}.
	 * @param ctx the parse tree
	 */
	void exitFuncAs(OpenGaussStatementParser.FuncAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturn(OpenGaussStatementParser.FuncReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturn(OpenGaussStatementParser.FuncReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArgsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgsWithDefaults(OpenGaussStatementParser.FuncArgsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArgsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgsWithDefaults(OpenGaussStatementParser.FuncArgsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArgsWithDefaultsList}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgsWithDefaultsList(OpenGaussStatementParser.FuncArgsWithDefaultsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArgsWithDefaultsList}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgsWithDefaultsList(OpenGaussStatementParser.FuncArgsWithDefaultsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#funcArgWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgWithDefault(OpenGaussStatementParser.FuncArgWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#funcArgWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgWithDefault(OpenGaussStatementParser.FuncArgWithDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createLanguage}.
	 * @param ctx the parse tree
	 */
	void enterCreateLanguage(OpenGaussStatementParser.CreateLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createLanguage}.
	 * @param ctx the parse tree
	 */
	void exitCreateLanguage(OpenGaussStatementParser.CreateLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#transformElementList}.
	 * @param ctx the parse tree
	 */
	void enterTransformElementList(OpenGaussStatementParser.TransformElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#transformElementList}.
	 * @param ctx the parse tree
	 */
	void exitTransformElementList(OpenGaussStatementParser.TransformElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#validatorClause}.
	 * @param ctx the parse tree
	 */
	void enterValidatorClause(OpenGaussStatementParser.ValidatorClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#validatorClause}.
	 * @param ctx the parse tree
	 */
	void exitValidatorClause(OpenGaussStatementParser.ValidatorClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createPolicy}.
	 * @param ctx the parse tree
	 */
	void enterCreatePolicy(OpenGaussStatementParser.CreatePolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createPolicy}.
	 * @param ctx the parse tree
	 */
	void exitCreatePolicy(OpenGaussStatementParser.CreatePolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(OpenGaussStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(OpenGaussStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createPublication}.
	 * @param ctx the parse tree
	 */
	void enterCreatePublication(OpenGaussStatementParser.CreatePublicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createPublication}.
	 * @param ctx the parse tree
	 */
	void exitCreatePublication(OpenGaussStatementParser.CreatePublicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#publicationForTables}.
	 * @param ctx the parse tree
	 */
	void enterPublicationForTables(OpenGaussStatementParser.PublicationForTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#publicationForTables}.
	 * @param ctx the parse tree
	 */
	void exitPublicationForTables(OpenGaussStatementParser.PublicationForTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateRule(OpenGaussStatementParser.CreateRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateRule(OpenGaussStatementParser.CreateRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionList(OpenGaussStatementParser.RuleActionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionList(OpenGaussStatementParser.RuleActionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionStmt(OpenGaussStatementParser.RuleActionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionStmt(OpenGaussStatementParser.RuleActionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionMulti(OpenGaussStatementParser.RuleActionMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionMulti(OpenGaussStatementParser.RuleActionMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStmt(OpenGaussStatementParser.NotifyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStmt(OpenGaussStatementParser.NotifyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(OpenGaussStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(OpenGaussStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvents(OpenGaussStatementParser.TriggerEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvents(OpenGaussStatementParser.TriggerEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOneEvent(OpenGaussStatementParser.TriggerOneEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOneEvent(OpenGaussStatementParser.TriggerOneEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerActionTime(OpenGaussStatementParser.TriggerActionTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerActionTime(OpenGaussStatementParser.TriggerActionTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArgs(OpenGaussStatementParser.TriggerFuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArgs(OpenGaussStatementParser.TriggerFuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArg(OpenGaussStatementParser.TriggerFuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArg(OpenGaussStatementParser.TriggerFuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void enterTriggerWhen(OpenGaussStatementParser.TriggerWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void exitTriggerWhen(OpenGaussStatementParser.TriggerWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForSpec(OpenGaussStatementParser.TriggerForSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForSpec(OpenGaussStatementParser.TriggerForSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerReferencing}.
	 * @param ctx the parse tree
	 */
	void enterTriggerReferencing(OpenGaussStatementParser.TriggerReferencingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerReferencing}.
	 * @param ctx the parse tree
	 */
	void exitTriggerReferencing(OpenGaussStatementParser.TriggerReferencingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerTransitions}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTransitions(OpenGaussStatementParser.TriggerTransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerTransitions}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTransitions(OpenGaussStatementParser.TriggerTransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#triggerTransition}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTransition(OpenGaussStatementParser.TriggerTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#triggerTransition}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTransition(OpenGaussStatementParser.TriggerTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#transitionRelName}.
	 * @param ctx the parse tree
	 */
	void enterTransitionRelName(OpenGaussStatementParser.TransitionRelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#transitionRelName}.
	 * @param ctx the parse tree
	 */
	void exitTransitionRelName(OpenGaussStatementParser.TransitionRelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#transitionRowOrTable}.
	 * @param ctx the parse tree
	 */
	void enterTransitionRowOrTable(OpenGaussStatementParser.TransitionRowOrTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#transitionRowOrTable}.
	 * @param ctx the parse tree
	 */
	void exitTransitionRowOrTable(OpenGaussStatementParser.TransitionRowOrTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#transitionOldOrNew}.
	 * @param ctx the parse tree
	 */
	void enterTransitionOldOrNew(OpenGaussStatementParser.TransitionOldOrNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#transitionOldOrNew}.
	 * @param ctx the parse tree
	 */
	void exitTransitionOldOrNew(OpenGaussStatementParser.TransitionOldOrNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequence(OpenGaussStatementParser.CreateSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequence(OpenGaussStatementParser.CreateSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#tempOption}.
	 * @param ctx the parse tree
	 */
	void enterTempOption(OpenGaussStatementParser.TempOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#tempOption}.
	 * @param ctx the parse tree
	 */
	void exitTempOption(OpenGaussStatementParser.TempOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(OpenGaussStatementParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(OpenGaussStatementParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createStatistics}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatistics(OpenGaussStatementParser.CreateStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createStatistics}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatistics(OpenGaussStatementParser.CreateStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createSubscription}.
	 * @param ctx the parse tree
	 */
	void enterCreateSubscription(OpenGaussStatementParser.CreateSubscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createSubscription}.
	 * @param ctx the parse tree
	 */
	void exitCreateSubscription(OpenGaussStatementParser.CreateSubscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespace(OpenGaussStatementParser.CreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespace(OpenGaussStatementParser.CreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createTextSearch}.
	 * @param ctx the parse tree
	 */
	void enterCreateTextSearch(OpenGaussStatementParser.CreateTextSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createTextSearch}.
	 * @param ctx the parse tree
	 */
	void exitCreateTextSearch(OpenGaussStatementParser.CreateTextSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createTransform}.
	 * @param ctx the parse tree
	 */
	void enterCreateTransform(OpenGaussStatementParser.CreateTransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createTransform}.
	 * @param ctx the parse tree
	 */
	void exitCreateTransform(OpenGaussStatementParser.CreateTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createType}.
	 * @param ctx the parse tree
	 */
	void enterCreateType(OpenGaussStatementParser.CreateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createType}.
	 * @param ctx the parse tree
	 */
	void exitCreateType(OpenGaussStatementParser.CreateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createTypeClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeClauses(OpenGaussStatementParser.CreateTypeClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createTypeClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeClauses(OpenGaussStatementParser.CreateTypeClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#enumValList}.
	 * @param ctx the parse tree
	 */
	void enterEnumValList(OpenGaussStatementParser.EnumValListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#enumValList}.
	 * @param ctx the parse tree
	 */
	void exitEnumValList(OpenGaussStatementParser.EnumValListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMapping(OpenGaussStatementParser.CreateUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMapping(OpenGaussStatementParser.CreateUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscard(OpenGaussStatementParser.DiscardContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscard(OpenGaussStatementParser.DiscardContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropAccessMethod}.
	 * @param ctx the parse tree
	 */
	void enterDropAccessMethod(OpenGaussStatementParser.DropAccessMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropAccessMethod}.
	 * @param ctx the parse tree
	 */
	void exitDropAccessMethod(OpenGaussStatementParser.DropAccessMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void enterDropAggregate(OpenGaussStatementParser.DropAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void exitDropAggregate(OpenGaussStatementParser.DropAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#aggregateWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWithArgtypesList(OpenGaussStatementParser.AggregateWithArgtypesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#aggregateWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWithArgtypesList(OpenGaussStatementParser.AggregateWithArgtypesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropCast}.
	 * @param ctx the parse tree
	 */
	void enterDropCast(OpenGaussStatementParser.DropCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropCast}.
	 * @param ctx the parse tree
	 */
	void exitDropCast(OpenGaussStatementParser.DropCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropCollation}.
	 * @param ctx the parse tree
	 */
	void enterDropCollation(OpenGaussStatementParser.DropCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropCollation}.
	 * @param ctx the parse tree
	 */
	void exitDropCollation(OpenGaussStatementParser.DropCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropConversion}.
	 * @param ctx the parse tree
	 */
	void enterDropConversion(OpenGaussStatementParser.DropConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropConversion}.
	 * @param ctx the parse tree
	 */
	void exitDropConversion(OpenGaussStatementParser.DropConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropDomain}.
	 * @param ctx the parse tree
	 */
	void enterDropDomain(OpenGaussStatementParser.DropDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropDomain}.
	 * @param ctx the parse tree
	 */
	void exitDropDomain(OpenGaussStatementParser.DropDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropEventTrigger(OpenGaussStatementParser.DropEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropEventTrigger(OpenGaussStatementParser.DropEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropExtension}.
	 * @param ctx the parse tree
	 */
	void enterDropExtension(OpenGaussStatementParser.DropExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropExtension}.
	 * @param ctx the parse tree
	 */
	void exitDropExtension(OpenGaussStatementParser.DropExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterDropForeignDataWrapper(OpenGaussStatementParser.DropForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitDropForeignDataWrapper(OpenGaussStatementParser.DropForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropForeignTable}.
	 * @param ctx the parse tree
	 */
	void enterDropForeignTable(OpenGaussStatementParser.DropForeignTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropForeignTable}.
	 * @param ctx the parse tree
	 */
	void exitDropForeignTable(OpenGaussStatementParser.DropForeignTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(OpenGaussStatementParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(OpenGaussStatementParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#functionWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithArgtypesList(OpenGaussStatementParser.FunctionWithArgtypesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#functionWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithArgtypesList(OpenGaussStatementParser.FunctionWithArgtypesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropLanguage}.
	 * @param ctx the parse tree
	 */
	void enterDropLanguage(OpenGaussStatementParser.DropLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropLanguage}.
	 * @param ctx the parse tree
	 */
	void exitDropLanguage(OpenGaussStatementParser.DropLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterDropMaterializedView(OpenGaussStatementParser.DropMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitDropMaterializedView(OpenGaussStatementParser.DropMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropOperator}.
	 * @param ctx the parse tree
	 */
	void enterDropOperator(OpenGaussStatementParser.DropOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropOperator}.
	 * @param ctx the parse tree
	 */
	void exitDropOperator(OpenGaussStatementParser.DropOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#operatorWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void enterOperatorWithArgtypesList(OpenGaussStatementParser.OperatorWithArgtypesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#operatorWithArgtypesList}.
	 * @param ctx the parse tree
	 */
	void exitOperatorWithArgtypesList(OpenGaussStatementParser.OperatorWithArgtypesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropOperatorClass}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorClass(OpenGaussStatementParser.DropOperatorClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropOperatorClass}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorClass(OpenGaussStatementParser.DropOperatorClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorFamily(OpenGaussStatementParser.DropOperatorFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorFamily(OpenGaussStatementParser.DropOperatorFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropOwned}.
	 * @param ctx the parse tree
	 */
	void enterDropOwned(OpenGaussStatementParser.DropOwnedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropOwned}.
	 * @param ctx the parse tree
	 */
	void exitDropOwned(OpenGaussStatementParser.DropOwnedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropPolicy}.
	 * @param ctx the parse tree
	 */
	void enterDropPolicy(OpenGaussStatementParser.DropPolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropPolicy}.
	 * @param ctx the parse tree
	 */
	void exitDropPolicy(OpenGaussStatementParser.DropPolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(OpenGaussStatementParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(OpenGaussStatementParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropPublication}.
	 * @param ctx the parse tree
	 */
	void enterDropPublication(OpenGaussStatementParser.DropPublicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropPublication}.
	 * @param ctx the parse tree
	 */
	void exitDropPublication(OpenGaussStatementParser.DropPublicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropRoutine}.
	 * @param ctx the parse tree
	 */
	void enterDropRoutine(OpenGaussStatementParser.DropRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropRoutine}.
	 * @param ctx the parse tree
	 */
	void exitDropRoutine(OpenGaussStatementParser.DropRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropRule}.
	 * @param ctx the parse tree
	 */
	void enterDropRule(OpenGaussStatementParser.DropRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropRule}.
	 * @param ctx the parse tree
	 */
	void exitDropRule(OpenGaussStatementParser.DropRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 */
	void enterDropSequence(OpenGaussStatementParser.DropSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 */
	void exitDropSequence(OpenGaussStatementParser.DropSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropSynonym}.
	 * @param ctx the parse tree
	 */
	void enterDropSynonym(OpenGaussStatementParser.DropSynonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropSynonym}.
	 * @param ctx the parse tree
	 */
	void exitDropSynonym(OpenGaussStatementParser.DropSynonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(OpenGaussStatementParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(OpenGaussStatementParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropStatistics}.
	 * @param ctx the parse tree
	 */
	void enterDropStatistics(OpenGaussStatementParser.DropStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropStatistics}.
	 * @param ctx the parse tree
	 */
	void exitDropStatistics(OpenGaussStatementParser.DropStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropSubscription}.
	 * @param ctx the parse tree
	 */
	void enterDropSubscription(OpenGaussStatementParser.DropSubscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropSubscription}.
	 * @param ctx the parse tree
	 */
	void exitDropSubscription(OpenGaussStatementParser.DropSubscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(OpenGaussStatementParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(OpenGaussStatementParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropTextSearch}.
	 * @param ctx the parse tree
	 */
	void enterDropTextSearch(OpenGaussStatementParser.DropTextSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropTextSearch}.
	 * @param ctx the parse tree
	 */
	void exitDropTextSearch(OpenGaussStatementParser.DropTextSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropTransform}.
	 * @param ctx the parse tree
	 */
	void enterDropTransform(OpenGaussStatementParser.DropTransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropTransform}.
	 * @param ctx the parse tree
	 */
	void exitDropTransform(OpenGaussStatementParser.DropTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(OpenGaussStatementParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(OpenGaussStatementParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropType}.
	 * @param ctx the parse tree
	 */
	void enterDropType(OpenGaussStatementParser.DropTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropType}.
	 * @param ctx the parse tree
	 */
	void exitDropType(OpenGaussStatementParser.DropTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterDropUserMapping(OpenGaussStatementParser.DropUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitDropUserMapping(OpenGaussStatementParser.DropUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(OpenGaussStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(OpenGaussStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#importForeignSchema}.
	 * @param ctx the parse tree
	 */
	void enterImportForeignSchema(OpenGaussStatementParser.ImportForeignSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#importForeignSchema}.
	 * @param ctx the parse tree
	 */
	void exitImportForeignSchema(OpenGaussStatementParser.ImportForeignSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#importQualification}.
	 * @param ctx the parse tree
	 */
	void enterImportQualification(OpenGaussStatementParser.ImportQualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#importQualification}.
	 * @param ctx the parse tree
	 */
	void exitImportQualification(OpenGaussStatementParser.ImportQualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#importQualificationType}.
	 * @param ctx the parse tree
	 */
	void enterImportQualificationType(OpenGaussStatementParser.ImportQualificationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#importQualificationType}.
	 * @param ctx the parse tree
	 */
	void exitImportQualificationType(OpenGaussStatementParser.ImportQualificationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#listen}.
	 * @param ctx the parse tree
	 */
	void enterListen(OpenGaussStatementParser.ListenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#listen}.
	 * @param ctx the parse tree
	 */
	void exitListen(OpenGaussStatementParser.ListenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(OpenGaussStatementParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(OpenGaussStatementParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void enterPrepare(OpenGaussStatementParser.PrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#prepare}.
	 * @param ctx the parse tree
	 */
	void exitPrepare(OpenGaussStatementParser.PrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate(OpenGaussStatementParser.DeallocateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#deallocate}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate(OpenGaussStatementParser.DeallocateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#prepTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrepTypeClause(OpenGaussStatementParser.PrepTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#prepTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrepTypeClause(OpenGaussStatementParser.PrepTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#refreshMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterRefreshMaterializedView(OpenGaussStatementParser.RefreshMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#refreshMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitRefreshMaterializedView(OpenGaussStatementParser.RefreshMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reIndex}.
	 * @param ctx the parse tree
	 */
	void enterReIndex(OpenGaussStatementParser.ReIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reIndex}.
	 * @param ctx the parse tree
	 */
	void exitReIndex(OpenGaussStatementParser.ReIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reIndexClauses}.
	 * @param ctx the parse tree
	 */
	void enterReIndexClauses(OpenGaussStatementParser.ReIndexClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reIndexClauses}.
	 * @param ctx the parse tree
	 */
	void exitReIndexClauses(OpenGaussStatementParser.ReIndexClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reindexOptionList}.
	 * @param ctx the parse tree
	 */
	void enterReindexOptionList(OpenGaussStatementParser.ReindexOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reindexOptionList}.
	 * @param ctx the parse tree
	 */
	void exitReindexOptionList(OpenGaussStatementParser.ReindexOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reindexOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterReindexOptionElem(OpenGaussStatementParser.ReindexOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reindexOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitReindexOptionElem(OpenGaussStatementParser.ReindexOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reindexTargetMultitable}.
	 * @param ctx the parse tree
	 */
	void enterReindexTargetMultitable(OpenGaussStatementParser.ReindexTargetMultitableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reindexTargetMultitable}.
	 * @param ctx the parse tree
	 */
	void exitReindexTargetMultitable(OpenGaussStatementParser.ReindexTargetMultitableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#reindexTargetType}.
	 * @param ctx the parse tree
	 */
	void enterReindexTargetType(OpenGaussStatementParser.ReindexTargetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#reindexTargetType}.
	 * @param ctx the parse tree
	 */
	void exitReindexTargetType(OpenGaussStatementParser.ReindexTargetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterForeignTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignTable(OpenGaussStatementParser.AlterForeignTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterForeignTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignTable(OpenGaussStatementParser.AlterForeignTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignTableClauses(OpenGaussStatementParser.AlterForeignTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterForeignTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignTableClauses(OpenGaussStatementParser.AlterForeignTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createOperator}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperator(OpenGaussStatementParser.CreateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createOperator}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperator(OpenGaussStatementParser.CreateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createOperatorClass}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorClass(OpenGaussStatementParser.CreateOperatorClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createOperatorClass}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorClass(OpenGaussStatementParser.CreateOperatorClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorFamily(OpenGaussStatementParser.CreateOperatorFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createOperatorFamily}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorFamily(OpenGaussStatementParser.CreateOperatorFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#securityLabelStmt}.
	 * @param ctx the parse tree
	 */
	void enterSecurityLabelStmt(OpenGaussStatementParser.SecurityLabelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#securityLabelStmt}.
	 * @param ctx the parse tree
	 */
	void exitSecurityLabelStmt(OpenGaussStatementParser.SecurityLabelStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#securityLabel}.
	 * @param ctx the parse tree
	 */
	void enterSecurityLabel(OpenGaussStatementParser.SecurityLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#securityLabel}.
	 * @param ctx the parse tree
	 */
	void exitSecurityLabel(OpenGaussStatementParser.SecurityLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#securityLabelClausces}.
	 * @param ctx the parse tree
	 */
	void enterSecurityLabelClausces(OpenGaussStatementParser.SecurityLabelClauscesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#securityLabelClausces}.
	 * @param ctx the parse tree
	 */
	void exitSecurityLabelClausces(OpenGaussStatementParser.SecurityLabelClauscesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#unlisten}.
	 * @param ctx the parse tree
	 */
	void enterUnlisten(OpenGaussStatementParser.UnlistenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#unlisten}.
	 * @param ctx the parse tree
	 */
	void exitUnlisten(OpenGaussStatementParser.UnlistenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchema(OpenGaussStatementParser.CreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchema(OpenGaussStatementParser.CreateSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createSchemaClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchemaClauses(OpenGaussStatementParser.CreateSchemaClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createSchemaClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchemaClauses(OpenGaussStatementParser.CreateSchemaClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#schemaEltList}.
	 * @param ctx the parse tree
	 */
	void enterSchemaEltList(OpenGaussStatementParser.SchemaEltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#schemaEltList}.
	 * @param ctx the parse tree
	 */
	void exitSchemaEltList(OpenGaussStatementParser.SchemaEltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#schemaStmt}.
	 * @param ctx the parse tree
	 */
	void enterSchemaStmt(OpenGaussStatementParser.SchemaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#schemaStmt}.
	 * @param ctx the parse tree
	 */
	void exitSchemaStmt(OpenGaussStatementParser.SchemaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeClause(OpenGaussStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeClause(OpenGaussStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#roleClause}.
	 * @param ctx the parse tree
	 */
	void enterRoleClause(OpenGaussStatementParser.RoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#roleClause}.
	 * @param ctx the parse tree
	 */
	void exitRoleClause(OpenGaussStatementParser.RoleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#privilegeTypes}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeTypes(OpenGaussStatementParser.PrivilegeTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#privilegeTypes}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeTypes(OpenGaussStatementParser.PrivilegeTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(OpenGaussStatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(OpenGaussStatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#numericOnlyList}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnlyList(OpenGaussStatementParser.NumericOnlyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#numericOnlyList}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnlyList(OpenGaussStatementParser.NumericOnlyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeLevel(OpenGaussStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeLevel(OpenGaussStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(OpenGaussStatementParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(OpenGaussStatementParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType(OpenGaussStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType(OpenGaussStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#createDirectory}.
	 * @param ctx the parse tree
	 */
	void enterCreateDirectory(OpenGaussStatementParser.CreateDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#createDirectory}.
	 * @param ctx the parse tree
	 */
	void exitCreateDirectory(OpenGaussStatementParser.CreateDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void enterAlterSchema(OpenGaussStatementParser.AlterSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void exitAlterSchema(OpenGaussStatementParser.AlterSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void enterDropSchema(OpenGaussStatementParser.DropSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void exitDropSchema(OpenGaussStatementParser.DropSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#fetch}.
	 * @param ctx the parse tree
	 */
	void enterFetch(OpenGaussStatementParser.FetchContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#fetch}.
	 * @param ctx the parse tree
	 */
	void exitFetch(OpenGaussStatementParser.FetchContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#alterPackage}.
	 * @param ctx the parse tree
	 */
	void enterAlterPackage(OpenGaussStatementParser.AlterPackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#alterPackage}.
	 * @param ctx the parse tree
	 */
	void exitAlterPackage(OpenGaussStatementParser.AlterPackageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code next}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterNext(OpenGaussStatementParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code next}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitNext(OpenGaussStatementParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prior}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterPrior(OpenGaussStatementParser.PriorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prior}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitPrior(OpenGaussStatementParser.PriorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterFirst(OpenGaussStatementParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitFirst(OpenGaussStatementParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterLast(OpenGaussStatementParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitLast(OpenGaussStatementParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absoluteCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteCount(OpenGaussStatementParser.AbsoluteCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absoluteCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteCount(OpenGaussStatementParser.AbsoluteCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterRelativeCount(OpenGaussStatementParser.RelativeCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitRelativeCount(OpenGaussStatementParser.RelativeCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code count}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterCount(OpenGaussStatementParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code count}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitCount(OpenGaussStatementParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code all}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterAll(OpenGaussStatementParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code all}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitAll(OpenGaussStatementParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forward}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterForward(OpenGaussStatementParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitForward(OpenGaussStatementParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forwardCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterForwardCount(OpenGaussStatementParser.ForwardCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forwardCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitForwardCount(OpenGaussStatementParser.ForwardCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forwardAll}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterForwardAll(OpenGaussStatementParser.ForwardAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forwardAll}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitForwardAll(OpenGaussStatementParser.ForwardAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backward}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterBackward(OpenGaussStatementParser.BackwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitBackward(OpenGaussStatementParser.BackwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backwardCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterBackwardCount(OpenGaussStatementParser.BackwardCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backwardCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitBackwardCount(OpenGaussStatementParser.BackwardCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backwardAll}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterBackwardAll(OpenGaussStatementParser.BackwardAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backwardAll}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitBackwardAll(OpenGaussStatementParser.BackwardAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(OpenGaussStatementParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(OpenGaussStatementParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(OpenGaussStatementParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(OpenGaussStatementParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#runtimeScope}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeScope(OpenGaussStatementParser.RuntimeScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#runtimeScope}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeScope(OpenGaussStatementParser.RuntimeScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#timeZoneClause}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneClause(OpenGaussStatementParser.TimeZoneClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#timeZoneClause}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneClause(OpenGaussStatementParser.TimeZoneClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationParameterClause(OpenGaussStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationParameterClause(OpenGaussStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 */
	void enterResetParameter(OpenGaussStatementParser.ResetParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 */
	void exitResetParameter(OpenGaussStatementParser.ResetParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(OpenGaussStatementParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(OpenGaussStatementParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStmt(OpenGaussStatementParser.ExplainableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStmt(OpenGaussStatementParser.ExplainableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#explainOptionList}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionList(OpenGaussStatementParser.ExplainOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#explainOptionList}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionList(OpenGaussStatementParser.ExplainOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#explainOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionElem(OpenGaussStatementParser.ExplainOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#explainOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionElem(OpenGaussStatementParser.ExplainOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#explainOptionArg}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionArg(OpenGaussStatementParser.ExplainOptionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#explainOptionArg}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionArg(OpenGaussStatementParser.ExplainOptionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#explainOptionName}.
	 * @param ctx the parse tree
	 */
	void enterExplainOptionName(OpenGaussStatementParser.ExplainOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#explainOptionName}.
	 * @param ctx the parse tree
	 */
	void exitExplainOptionName(OpenGaussStatementParser.ExplainOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#analyzeKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeKeyword(OpenGaussStatementParser.AnalyzeKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#analyzeKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeKeyword(OpenGaussStatementParser.AnalyzeKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(OpenGaussStatementParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(OpenGaussStatementParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#vacuumRelationList}.
	 * @param ctx the parse tree
	 */
	void enterVacuumRelationList(OpenGaussStatementParser.VacuumRelationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#vacuumRelationList}.
	 * @param ctx the parse tree
	 */
	void exitVacuumRelationList(OpenGaussStatementParser.VacuumRelationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#vacuumRelation}.
	 * @param ctx the parse tree
	 */
	void enterVacuumRelation(OpenGaussStatementParser.VacuumRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#vacuumRelation}.
	 * @param ctx the parse tree
	 */
	void exitVacuumRelation(OpenGaussStatementParser.VacuumRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionList}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionList(OpenGaussStatementParser.VacAnalyzeOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionList}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionList(OpenGaussStatementParser.VacAnalyzeOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionElem}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionElem(OpenGaussStatementParser.VacAnalyzeOptionElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionElem}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionElem(OpenGaussStatementParser.VacAnalyzeOptionElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionArg}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionArg(OpenGaussStatementParser.VacAnalyzeOptionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionArg}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionArg(OpenGaussStatementParser.VacAnalyzeOptionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionName}.
	 * @param ctx the parse tree
	 */
	void enterVacAnalyzeOptionName(OpenGaussStatementParser.VacAnalyzeOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionName}.
	 * @param ctx the parse tree
	 */
	void exitVacAnalyzeOptionName(OpenGaussStatementParser.VacAnalyzeOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(OpenGaussStatementParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(OpenGaussStatementParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#vacuum}.
	 * @param ctx the parse tree
	 */
	void enterVacuum(OpenGaussStatementParser.VacuumContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#vacuum}.
	 * @param ctx the parse tree
	 */
	void exitVacuum(OpenGaussStatementParser.VacuumContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(OpenGaussStatementParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(OpenGaussStatementParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(OpenGaussStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(OpenGaussStatementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenGaussStatementParser#callClauses}.
	 * @param ctx the parse tree
	 */
	void enterCallClauses(OpenGaussStatementParser.CallClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenGaussStatementParser#callClauses}.
	 * @param ctx the parse tree
	 */
	void exitCallClauses(OpenGaussStatementParser.CallClausesContext ctx);
}