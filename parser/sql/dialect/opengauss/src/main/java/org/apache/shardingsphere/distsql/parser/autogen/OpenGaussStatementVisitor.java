// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/opengauss/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/OpenGaussStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OpenGaussStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OpenGaussStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(OpenGaussStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(OpenGaussStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTransaction(OpenGaussStatementParser.BeginTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(OpenGaussStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(OpenGaussStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#abort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort(OpenGaussStatementParser.AbortContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(OpenGaussStatementParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(OpenGaussStatementParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(OpenGaussStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseSavepoint(OpenGaussStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rollbackToSavepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackToSavepoint(OpenGaussStatementParser.RollbackToSavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#prepareTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareTransaction(OpenGaussStatementParser.PrepareTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#commitPrepared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitPrepared(OpenGaussStatementParser.CommitPreparedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rollbackPrepared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackPrepared(OpenGaussStatementParser.RollbackPreparedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConstraints(OpenGaussStatementParser.SetConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintsSetMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetMode(OpenGaussStatementParser.ConstraintsSetModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintsSetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetList(OpenGaussStatementParser.ConstraintsSetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#checkpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckpoint(OpenGaussStatementParser.CheckpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock(OpenGaussStatementParser.LockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#lockType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockType(OpenGaussStatementParser.LockTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(OpenGaussStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#insertTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertTarget(OpenGaussStatementParser.InsertTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#insertRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertRest(OpenGaussStatementParser.InsertRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#overrideKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideKind(OpenGaussStatementParser.OverrideKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#insertColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnList(OpenGaussStatementParser.InsertColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#insertColumnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnItem(OpenGaussStatementParser.InsertColumnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optOnDuplicateKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptOnDuplicateKey(OpenGaussStatementParser.OptOnDuplicateKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(OpenGaussStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(OpenGaussStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClauseList(OpenGaussStatementParser.SetClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(OpenGaussStatementParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTarget(OpenGaussStatementParser.SetTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setTargetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTargetList(OpenGaussStatementParser.SetTargetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#returningClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningClause(OpenGaussStatementParser.ReturningClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(OpenGaussStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#relationExprOptAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExprOptAlias(OpenGaussStatementParser.RelationExprOptAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#usingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClause(OpenGaussStatementParser.UsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(OpenGaussStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#selectWithParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithParens(OpenGaussStatementParser.SelectWithParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#selectNoParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectNoParens(OpenGaussStatementParser.SelectNoParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#selectClauseN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClauseN(OpenGaussStatementParser.SelectClauseNContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#simpleSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelect(OpenGaussStatementParser.SimpleSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(OpenGaussStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(OpenGaussStatementParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optTempTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTempTableName(OpenGaussStatementParser.OptTempTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cteList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteList(OpenGaussStatementParser.CteListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonTableExpr(OpenGaussStatementParser.CommonTableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optMaterialized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptMaterialized(OpenGaussStatementParser.OptMaterializedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptNameList(OpenGaussStatementParser.OptNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#preparableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparableStmt(OpenGaussStatementParser.PreparableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#forLockingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingClause(OpenGaussStatementParser.ForLockingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#forLockingItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingItems(OpenGaussStatementParser.ForLockingItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#forLockingItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingItem(OpenGaussStatementParser.ForLockingItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#nowaitOrSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowaitOrSkip(OpenGaussStatementParser.NowaitOrSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#forLockingStrength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingStrength(OpenGaussStatementParser.ForLockingStrengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#lockedRelsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedRelsList(OpenGaussStatementParser.LockedRelsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(OpenGaussStatementParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#selectLimit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLimit(OpenGaussStatementParser.SelectLimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#valuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesClause(OpenGaussStatementParser.ValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(OpenGaussStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(OpenGaussStatementParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#selectLimitValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLimitValue(OpenGaussStatementParser.SelectLimitValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#selectOffsetValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOffsetValue(OpenGaussStatementParser.SelectOffsetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#selectFetchValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFetchValue(OpenGaussStatementParser.SelectFetchValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rowOrRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowOrRows(OpenGaussStatementParser.RowOrRowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#firstOrNext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstOrNext(OpenGaussStatementParser.FirstOrNextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#onlyOrWithTies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyOrWithTies(OpenGaussStatementParser.OnlyOrWithTiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#targetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetList(OpenGaussStatementParser.TargetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#targetEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetEl(OpenGaussStatementParser.TargetElContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#groupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClause(OpenGaussStatementParser.GroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#groupByList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByList(OpenGaussStatementParser.GroupByListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(OpenGaussStatementParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#emptyGroupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyGroupingSet(OpenGaussStatementParser.EmptyGroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rollupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupClause(OpenGaussStatementParser.RollupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cubeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCubeClause(OpenGaussStatementParser.CubeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#groupingSetsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSetsClause(OpenGaussStatementParser.GroupingSetsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(OpenGaussStatementParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#windowDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinitionList(OpenGaussStatementParser.WindowDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#windowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition(OpenGaussStatementParser.WindowDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(OpenGaussStatementParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#existingWindowName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingWindowName(OpenGaussStatementParser.ExistingWindowNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(OpenGaussStatementParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(OpenGaussStatementParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#frameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameExtent(OpenGaussStatementParser.FrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(OpenGaussStatementParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optWindowExclusionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptWindowExclusionClause(OpenGaussStatementParser.OptWindowExclusionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(OpenGaussStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(OpenGaussStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#fromList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromList(OpenGaussStatementParser.FromListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(OpenGaussStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(OpenGaussStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#crossJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossJoinType(OpenGaussStatementParser.CrossJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoinType(OpenGaussStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoinType(OpenGaussStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoinType(OpenGaussStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#joinQual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinQual(OpenGaussStatementParser.JoinQualContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(OpenGaussStatementParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(OpenGaussStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#whereOrCurrentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereOrCurrentClause(OpenGaussStatementParser.WhereOrCurrentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(OpenGaussStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(OpenGaussStatementParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dostmtOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmtOptList(OpenGaussStatementParser.DostmtOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dostmtOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmtOptItem(OpenGaussStatementParser.DostmtOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy(OpenGaussStatementParser.CopyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptions(OpenGaussStatementParser.CopyOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptList(OpenGaussStatementParser.CopyGenericOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptElem(OpenGaussStatementParser.CopyGenericOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptArg(OpenGaussStatementParser.CopyGenericOptArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptArgList(OpenGaussStatementParser.CopyGenericOptArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyGenericOptArgListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptArgListItem(OpenGaussStatementParser.CopyGenericOptArgListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptList(OpenGaussStatementParser.CopyOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptItem(OpenGaussStatementParser.CopyOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#copyDelimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyDelimiter(OpenGaussStatementParser.CopyDelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(OpenGaussStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reservedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedKeyword(OpenGaussStatementParser.ReservedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(OpenGaussStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#literalsType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralsType(OpenGaussStatementParser.LiteralsTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OpenGaussStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#uescape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUescape(OpenGaussStatementParser.UescapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(OpenGaussStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typeFuncNameKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFuncNameKeyword(OpenGaussStatementParser.TypeFuncNameKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(OpenGaussStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#synonymName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynonymName(OpenGaussStatementParser.SynonymNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#objectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectName(OpenGaussStatementParser.ObjectNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(OpenGaussStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(OpenGaussStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(OpenGaussStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(OpenGaussStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#modelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelName(OpenGaussStatementParser.ModelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(OpenGaussStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(OpenGaussStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(OpenGaussStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(OpenGaussStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(OpenGaussStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(OpenGaussStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(OpenGaussStatementParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(OpenGaussStatementParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(OpenGaussStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#inetOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInetOperator(OpenGaussStatementParser.InetOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#patternMatchingOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternMatchingOperator(OpenGaussStatementParser.PatternMatchingOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(OpenGaussStatementParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAExpr(OpenGaussStatementParser.AExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#bExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBExpr(OpenGaussStatementParser.BExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCExpr(OpenGaussStatementParser.CExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(OpenGaussStatementParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optIndirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptIndirection(OpenGaussStatementParser.OptIndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indirectionEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectionEl(OpenGaussStatementParser.IndirectionElContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#sliceBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceBound(OpenGaussStatementParser.SliceBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#inExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(OpenGaussStatementParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(OpenGaussStatementParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#whenClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClauseList(OpenGaussStatementParser.WhenClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(OpenGaussStatementParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#caseDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseDefault(OpenGaussStatementParser.CaseDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#caseArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseArg(OpenGaussStatementParser.CaseArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnref(OpenGaussStatementParser.ColumnrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#qualOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualOp(OpenGaussStatementParser.QualOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#subqueryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryOp(OpenGaussStatementParser.SubqueryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#allOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOp(OpenGaussStatementParser.AllOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(OpenGaussStatementParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(OpenGaussStatementParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonExtract}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExtract(OpenGaussStatementParser.JsonExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonExtractText}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExtractText(OpenGaussStatementParser.JsonExtractTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonPathExtract}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPathExtract(OpenGaussStatementParser.JsonPathExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonPathExtractText}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPathExtractText(OpenGaussStatementParser.JsonPathExtractTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbContainRight}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbContainRight(OpenGaussStatementParser.JsonbContainRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbContainLeft}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbContainLeft(OpenGaussStatementParser.JsonbContainLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbContainTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbContainTopKey(OpenGaussStatementParser.JsonbContainTopKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbContainAnyTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbContainAnyTopKey(OpenGaussStatementParser.JsonbContainAnyTopKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbContainAllTopKey}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbContainAllTopKey(OpenGaussStatementParser.JsonbContainAllTopKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbConcat}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbConcat(OpenGaussStatementParser.JsonbConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbDelete}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbDelete(OpenGaussStatementParser.JsonbDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbPathDelete}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbPathDelete(OpenGaussStatementParser.JsonbPathDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbPathContainAnyValue}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbPathContainAnyValue(OpenGaussStatementParser.JsonbPathContainAnyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonbPathPredicateCheck}
	 * labeled alternative in {@link OpenGaussStatementParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonbPathPredicateCheck(OpenGaussStatementParser.JsonbPathPredicateCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#geometricOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometricOperator(OpenGaussStatementParser.GeometricOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#qualAllOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualAllOp(OpenGaussStatementParser.QualAllOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ascDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscDesc(OpenGaussStatementParser.AscDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#anyOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyOperator(OpenGaussStatementParser.AnyOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#windowExclusionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowExclusionClause(OpenGaussStatementParser.WindowExclusionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(OpenGaussStatementParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#explicitRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitRow(OpenGaussStatementParser.ExplicitRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#implicitRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitRow(OpenGaussStatementParser.ImplicitRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#subType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubType(OpenGaussStatementParser.SubTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(OpenGaussStatementParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#arrayExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExprList(OpenGaussStatementParser.ArrayExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgList(OpenGaussStatementParser.FuncArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#paramName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamName(OpenGaussStatementParser.ParamNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgExpr(OpenGaussStatementParser.FuncArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(OpenGaussStatementParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncApplication(OpenGaussStatementParser.FuncApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(OpenGaussStatementParser.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aexprConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprConst(OpenGaussStatementParser.AexprConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#numberConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConst(OpenGaussStatementParser.NumberConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(OpenGaussStatementParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(OpenGaussStatementParser.ColIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typeFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunctionName(OpenGaussStatementParser.TypeFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(OpenGaussStatementParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTable(OpenGaussStatementParser.XmlTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnList(OpenGaussStatementParser.XmlTableColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnEl(OpenGaussStatementParser.XmlTableColumnElContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnOptionList(OpenGaussStatementParser.XmlTableColumnOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlTableColumnOptionEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnOptionEl(OpenGaussStatementParser.XmlTableColumnOptionElContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlNamespaceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespaceList(OpenGaussStatementParser.XmlNamespaceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlNamespaceEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespaceEl(OpenGaussStatementParser.XmlNamespaceElContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(OpenGaussStatementParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#withinGroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithinGroupClause(OpenGaussStatementParser.WithinGroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(OpenGaussStatementParser.FilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#functionExprWindowless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExprWindowless(OpenGaussStatementParser.FunctionExprWindowlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ordinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinality(OpenGaussStatementParser.OrdinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#functionExprCommonSubexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExprCommonSubexpr(OpenGaussStatementParser.FunctionExprCommonSubexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(OpenGaussStatementParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(OpenGaussStatementParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTypeName(OpenGaussStatementParser.ConstTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(OpenGaussStatementParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#extractList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractList(OpenGaussStatementParser.ExtractListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#extractArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractArg(OpenGaussStatementParser.ExtractArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(OpenGaussStatementParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typeModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifiers(OpenGaussStatementParser.TypeModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(OpenGaussStatementParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constDatetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDatetime(OpenGaussStatementParser.ConstDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone(OpenGaussStatementParser.TimezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(OpenGaussStatementParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#characterWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithLength(OpenGaussStatementParser.CharacterWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithoutLength(OpenGaussStatementParser.CharacterWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#characterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClause(OpenGaussStatementParser.CharacterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptFloat(OpenGaussStatementParser.OptFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(OpenGaussStatementParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#attrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrName(OpenGaussStatementParser.AttrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#colLable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLable(OpenGaussStatementParser.ColLableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(OpenGaussStatementParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#bitWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithLength(OpenGaussStatementParser.BitWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithoutLength(OpenGaussStatementParser.BitWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInterval(OpenGaussStatementParser.ConstIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptInterval(OpenGaussStatementParser.OptIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optArrayBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptArrayBounds(OpenGaussStatementParser.OptArrayBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#intervalSecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalSecond(OpenGaussStatementParser.IntervalSecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#unicodeNormalForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeNormalForm(OpenGaussStatementParser.UnicodeNormalFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#trimList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimList(OpenGaussStatementParser.TrimListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#overlayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlayList(OpenGaussStatementParser.OverlayListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#overlayPlacing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlayPlacing(OpenGaussStatementParser.OverlayPlacingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#substrFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFrom(OpenGaussStatementParser.SubstrFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#substrFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFor(OpenGaussStatementParser.SubstrForContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#positionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionList(OpenGaussStatementParser.PositionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#substrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrList(OpenGaussStatementParser.SubstrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlAttributes(OpenGaussStatementParser.XmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlAttributeList(OpenGaussStatementParser.XmlAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlAttributeEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlAttributeEl(OpenGaussStatementParser.XmlAttributeElContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlExistsArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlExistsArgument(OpenGaussStatementParser.XmlExistsArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlPassingMech}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlPassingMech(OpenGaussStatementParser.XmlPassingMechContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#documentOrContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentOrContent(OpenGaussStatementParser.DocumentOrContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlWhitespaceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlWhitespaceOption(OpenGaussStatementParser.XmlWhitespaceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlRootVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlRootVersion(OpenGaussStatementParser.XmlRootVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#xmlRootStandalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlRootStandalone(OpenGaussStatementParser.XmlRootStandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rowsFromItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsFromItem(OpenGaussStatementParser.RowsFromItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rowsFromList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsFromList(OpenGaussStatementParser.RowsFromListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefList(OpenGaussStatementParser.ColumnDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElementList(OpenGaussStatementParser.TableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableFuncElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElement(OpenGaussStatementParser.TableFuncElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(OpenGaussStatementParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#anyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyName(OpenGaussStatementParser.AnyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aliasClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasClause(OpenGaussStatementParser.AliasClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#directoryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectoryName(OpenGaussStatementParser.DirectoryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(OpenGaussStatementParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#pathString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathString(OpenGaussStatementParser.PathStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(OpenGaussStatementParser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcAliasClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAliasClause(OpenGaussStatementParser.FuncAliasClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tablesampleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesampleClause(OpenGaussStatementParser.TablesampleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#repeatableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatableClause(OpenGaussStatementParser.RepeatableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#allOrDistinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrDistinct(OpenGaussStatementParser.AllOrDistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#sortClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortClause(OpenGaussStatementParser.SortClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#sortbyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortbyList(OpenGaussStatementParser.SortbyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#sortby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby(OpenGaussStatementParser.SortbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#nullsOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullsOrder(OpenGaussStatementParser.NullsOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#distinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctClause(OpenGaussStatementParser.DistinctClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(OpenGaussStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(OpenGaussStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#windowName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowName(OpenGaussStatementParser.WindowNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexParams(OpenGaussStatementParser.IndexParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexElemOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexElemOptions(OpenGaussStatementParser.IndexElemOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexElem(OpenGaussStatementParser.IndexElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate(OpenGaussStatementParser.CollateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptClass(OpenGaussStatementParser.OptClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptions(OpenGaussStatementParser.ReloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reloptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptionList(OpenGaussStatementParser.ReloptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reloptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptionElem(OpenGaussStatementParser.ReloptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefArg(OpenGaussStatementParser.DefArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(OpenGaussStatementParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(OpenGaussStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(OpenGaussStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(OpenGaussStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(OpenGaussStatementParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier(OpenGaussStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifiers(OpenGaussStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#signedIconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedIconst(OpenGaussStatementParser.SignedIconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#booleanOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOrString(OpenGaussStatementParser.BooleanOrStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#nonReservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReservedWord(OpenGaussStatementParser.NonReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#colNameKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColNameKeyword(OpenGaussStatementParser.ColNameKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(OpenGaussStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#roleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleSpec(OpenGaussStatementParser.RoleSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(OpenGaussStatementParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(OpenGaussStatementParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#varValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(OpenGaussStatementParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#zoneValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZoneValue(OpenGaussStatementParser.ZoneValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#numericOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly(OpenGaussStatementParser.NumericOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#isoLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsoLevel(OpenGaussStatementParser.IsoLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(OpenGaussStatementParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#colQualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColQualList(OpenGaussStatementParser.ColQualListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#colConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraint(OpenGaussStatementParser.ColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttr(OpenGaussStatementParser.ConstraintAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#colConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraintElem(OpenGaussStatementParser.ColConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#parenthesizedSeqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedSeqOptList(OpenGaussStatementParser.ParenthesizedSeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#seqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptList(OpenGaussStatementParser.SeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#seqOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptElem(OpenGaussStatementParser.SeqOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptColumnList(OpenGaussStatementParser.OptColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnElem(OpenGaussStatementParser.ColumnElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(OpenGaussStatementParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#generatedWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedWhen(OpenGaussStatementParser.GeneratedWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#noInherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoInherit(OpenGaussStatementParser.NoInheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#consTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsTableSpace(OpenGaussStatementParser.ConsTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(OpenGaussStatementParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefList(OpenGaussStatementParser.DefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefElem(OpenGaussStatementParser.DefElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#colLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLabel(OpenGaussStatementParser.ColLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#keyActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyActions(OpenGaussStatementParser.KeyActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#keyDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyDelete(OpenGaussStatementParser.KeyDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#keyUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyUpdate(OpenGaussStatementParser.KeyUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#keyAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyAction(OpenGaussStatementParser.KeyActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#keyMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyMatch(OpenGaussStatementParser.KeyMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createGenericOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGenericOptions(OpenGaussStatementParser.CreateGenericOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#genericOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionList(OpenGaussStatementParser.GenericOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#genericOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionElem(OpenGaussStatementParser.GenericOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#genericOptionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionArg(OpenGaussStatementParser.GenericOptionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#genericOptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionName(OpenGaussStatementParser.GenericOptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#replicaIdentity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicaIdentity(OpenGaussStatementParser.ReplicaIdentityContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#operArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperArgtypes(OpenGaussStatementParser.OperArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArg(OpenGaussStatementParser.FuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#argClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgClass(OpenGaussStatementParser.ArgClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgsList(OpenGaussStatementParser.FuncArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#nonReservedWordOrSconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReservedWordOrSconst(OpenGaussStatementParser.NonReservedWordOrSconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(OpenGaussStatementParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#roleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleList(OpenGaussStatementParser.RoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResetClause(OpenGaussStatementParser.SetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRest(OpenGaussStatementParser.SetRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#transactionModeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionModeList(OpenGaussStatementParser.TransactionModeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#transactionModeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionModeItem(OpenGaussStatementParser.TransactionModeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setRestMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRestMore(OpenGaussStatementParser.SetRestMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding(OpenGaussStatementParser.EncodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#genericSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSet(OpenGaussStatementParser.GenericSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#variableResetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableResetStmt(OpenGaussStatementParser.VariableResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#resetRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetRest(OpenGaussStatementParser.ResetRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#genericReset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericReset(OpenGaussStatementParser.GenericResetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#relationExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExprList(OpenGaussStatementParser.RelationExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#commonFuncOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonFuncOptItem(OpenGaussStatementParser.CommonFuncOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSetResetClause(OpenGaussStatementParser.FunctionSetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#rowSecurityCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowSecurityCmd(OpenGaussStatementParser.RowSecurityCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(OpenGaussStatementParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typeNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameList(OpenGaussStatementParser.TypeNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(OpenGaussStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(OpenGaussStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(OpenGaussStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(OpenGaussStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionForClause(OpenGaussStatementParser.OptionForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(OpenGaussStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOptRoleElem(OpenGaussStatementParser.CreateOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleElem(OpenGaussStatementParser.AlterOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBehavior(OpenGaussStatementParser.DropBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(OpenGaussStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(OpenGaussStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterUserClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserClauses(OpenGaussStatementParser.AlterUserClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleList(OpenGaussStatementParser.AlterOptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(OpenGaussStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(OpenGaussStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRole(OpenGaussStatementParser.AlterRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroup(OpenGaussStatementParser.CreateGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropDroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDroup(OpenGaussStatementParser.DropDroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reassignOwned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignOwned(OpenGaussStatementParser.ReassignOwnedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(OpenGaussStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#executeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteParamClause(OpenGaussStatementParser.ExecuteParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionBoundSpec(OpenGaussStatementParser.PartitionBoundSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#hashPartbound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashPartbound(OpenGaussStatementParser.HashPartboundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#hashPartboundElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashPartboundElem(OpenGaussStatementParser.HashPartboundElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typedTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElementList(OpenGaussStatementParser.TypedTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#typedTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElement(OpenGaussStatementParser.TypedTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptions(OpenGaussStatementParser.ColumnOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#withData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithData(OpenGaussStatementParser.WithDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSpace(OpenGaussStatementParser.TableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#onCommitOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommitOption(OpenGaussStatementParser.OnCommitOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#withOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithOption(OpenGaussStatementParser.WithOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableAccessMethodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAccessMethodClause(OpenGaussStatementParser.TableAccessMethodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#accessMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMethod(OpenGaussStatementParser.AccessMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(OpenGaussStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(OpenGaussStatementParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexIncludingParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexIncludingParams(OpenGaussStatementParser.IndexIncludingParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#accessMethodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMethodClause(OpenGaussStatementParser.AccessMethodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(OpenGaussStatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(OpenGaussStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(OpenGaussStatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropDirectory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDirectory(OpenGaussStatementParser.DropDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createDatabaseSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseSpecification(OpenGaussStatementParser.CreateDatabaseSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createdbOptName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbOptName(OpenGaussStatementParser.CreatedbOptNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(OpenGaussStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndex(OpenGaussStatementParser.AlterIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(OpenGaussStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropTableOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableOpt(OpenGaussStatementParser.DropTableOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(OpenGaussStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropIndexOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexOpt(OpenGaussStatementParser.DropIndexOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(OpenGaussStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#restartSeqs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestartSeqs(OpenGaussStatementParser.RestartSeqsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpecification(OpenGaussStatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(OpenGaussStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinition(OpenGaussStatementParser.CreateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(OpenGaussStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(OpenGaussStatementParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintClause(OpenGaussStatementParser.ConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraintOption(OpenGaussStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#checkOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckOption(OpenGaussStatementParser.CheckOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpr(OpenGaussStatementParser.DefaultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOptions(OpenGaussStatementParser.SequenceOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOption(OpenGaussStatementParser.SequenceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexParameters(OpenGaussStatementParser.IndexParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(OpenGaussStatementParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintOptionalParam(OpenGaussStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#likeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeOption(OpenGaussStatementParser.LikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(OpenGaussStatementParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintOption(OpenGaussStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionWhereClause(OpenGaussStatementParser.ExclusionWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintList(OpenGaussStatementParser.ExclusionConstraintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintElem(OpenGaussStatementParser.ExclusionConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#inheritClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritClause(OpenGaussStatementParser.InheritClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(OpenGaussStatementParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#partParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartParams(OpenGaussStatementParser.PartParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#partElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartElem(OpenGaussStatementParser.PartElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcExprWindowless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExprWindowless(OpenGaussStatementParser.FuncExprWindowlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#partStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartStrategy(OpenGaussStatementParser.PartStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification(OpenGaussStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#concurrentlyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrentlyClause(OpenGaussStatementParser.ConcurrentlyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#onlyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyClause(OpenGaussStatementParser.OnlyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSizeLiteral(OpenGaussStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#asteriskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskClause(OpenGaussStatementParser.AsteriskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(OpenGaussStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#partitionCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionCmd(OpenGaussStatementParser.PartitionCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterIndexDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexDefinitionClause(OpenGaussStatementParser.AlterIndexDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexPartitionCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexPartitionCmd(OpenGaussStatementParser.IndexPartitionCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameIndexSpecification(OpenGaussStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexDependsOnExtension(OpenGaussStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexSetTableSpace(OpenGaussStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNamesClause(OpenGaussStatementParser.TableNamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameClause(OpenGaussStatementParser.TableNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableActions(OpenGaussStatementParser.AlterTableActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAction(OpenGaussStatementParser.AlterTableActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(OpenGaussStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(OpenGaussStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(OpenGaussStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumn(OpenGaussStatementParser.ModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnSetOption(OpenGaussStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOptions(OpenGaussStatementParser.AttributeOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOption(OpenGaussStatementParser.AttributeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintSpecification(OpenGaussStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintUsingIndex(OpenGaussStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#modifyConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyConstraintSpecification(OpenGaussStatementParser.ModifyConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#validateConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateConstraintSpecification(OpenGaussStatementParser.ValidateConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintSpecification(OpenGaussStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameterWithValue(OpenGaussStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameter(OpenGaussStatementParser.StorageParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumnSpecification(OpenGaussStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameConstraint(OpenGaussStatementParser.RenameConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableSpecification(OpenGaussStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#indexNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNames(OpenGaussStatementParser.IndexNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(OpenGaussStatementParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseClause(OpenGaussStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createdbOptItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbOptItems(OpenGaussStatementParser.CreatedbOptItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createdbOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbOptItem(OpenGaussStatementParser.CreatedbOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTableCmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableCmds(OpenGaussStatementParser.AlterTableCmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTableCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableCmd(OpenGaussStatementParser.AlterTableCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeSpec(OpenGaussStatementParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeElem(OpenGaussStatementParser.ConstraintAttributeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGenericOptions(OpenGaussStatementParser.AlterGenericOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGenericOptionList(OpenGaussStatementParser.AlterGenericOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterGenericOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGenericOptionElem(OpenGaussStatementParser.AlterGenericOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUsing(OpenGaussStatementParser.AlterUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#setData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetData(OpenGaussStatementParser.SetDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterIdentityColumnOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIdentityColumnOptionList(OpenGaussStatementParser.AlterIdentityColumnOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterIdentityColumnOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIdentityColumnOption(OpenGaussStatementParser.AlterIdentityColumnOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterColumnDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnDefault(OpenGaussStatementParser.AlterColumnDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperator(OpenGaussStatementParser.AlterOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorClass(OpenGaussStatementParser.AlterOperatorClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClassClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorClassClauses(OpenGaussStatementParser.AlterOperatorClassClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorFamily(OpenGaussStatementParser.AlterOperatorFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorFamilyClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorFamilyClauses(OpenGaussStatementParser.AlterOperatorFamilyClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#opclassItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclassItemList(OpenGaussStatementParser.OpclassItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#opclassItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclassItem(OpenGaussStatementParser.OpclassItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#opclassPurpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclassPurpose(OpenGaussStatementParser.OpclassPurposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterOperatorClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorClauses(OpenGaussStatementParser.AlterOperatorClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#operatorDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDefList(OpenGaussStatementParser.OperatorDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#operatorDefElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDefElem(OpenGaussStatementParser.OperatorDefElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#operatorDefArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDefArg(OpenGaussStatementParser.OperatorDefArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#operatorWithArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorWithArgtypes(OpenGaussStatementParser.OperatorWithArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterAggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAggregate(OpenGaussStatementParser.AlterAggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aggregateSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateSignature(OpenGaussStatementParser.AggregateSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aggrArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrArgs(OpenGaussStatementParser.AggrArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aggrArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrArgsList(OpenGaussStatementParser.AggrArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aggrArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrArg(OpenGaussStatementParser.AggrArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterAggregateDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAggregateDefinitionClause(OpenGaussStatementParser.AlterAggregateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCollation(OpenGaussStatementParser.AlterCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterCollationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCollationClause(OpenGaussStatementParser.AlterCollationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterSynonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSynonym(OpenGaussStatementParser.AlterSynonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterDirectory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDirectory(OpenGaussStatementParser.AlterDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterConversion(OpenGaussStatementParser.AlterConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterConversionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterConversionClause(OpenGaussStatementParser.AlterConversionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultPrivileges(OpenGaussStatementParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defACLAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLAction(OpenGaussStatementParser.DefACLActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#grantGrantOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantGrantOption(OpenGaussStatementParser.GrantGrantOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#granteeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGranteeList(OpenGaussStatementParser.GranteeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(OpenGaussStatementParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defaclPrivilegeTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaclPrivilegeTarget(OpenGaussStatementParser.DefaclPrivilegeTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(OpenGaussStatementParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#privilegeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeList(OpenGaussStatementParser.PrivilegeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(OpenGaussStatementParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defACLOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOptionList(OpenGaussStatementParser.DefACLOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#defACLOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOption(OpenGaussStatementParser.DefACLOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#schemaNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaNameList(OpenGaussStatementParser.SchemaNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomain(OpenGaussStatementParser.AlterDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterDomainClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomainClause(OpenGaussStatementParser.AlterDomainClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEventTrigger(OpenGaussStatementParser.AlterEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterEventTriggerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEventTriggerClause(OpenGaussStatementParser.AlterEventTriggerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tiggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiggerName(OpenGaussStatementParser.TiggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtension(OpenGaussStatementParser.AlterExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createSynonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSynonym(OpenGaussStatementParser.CreateSynonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterExtensionClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionClauses(OpenGaussStatementParser.AlterExtensionClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#functionWithArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithArgtypes(OpenGaussStatementParser.FunctionWithArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(OpenGaussStatementParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aggregateWithArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWithArgtypes(OpenGaussStatementParser.AggregateWithArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterExtensionOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionOptList(OpenGaussStatementParser.AlterExtensionOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterExtensionOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionOptItem(OpenGaussStatementParser.AlterExtensionOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignDataWrapper(OpenGaussStatementParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterForeignDataWrapperClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignDataWrapperClauses(OpenGaussStatementParser.AlterForeignDataWrapperClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#fdwOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdwOptions(OpenGaussStatementParser.FdwOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#fdwOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdwOption(OpenGaussStatementParser.FdwOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#handlerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerName(OpenGaussStatementParser.HandlerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroup(OpenGaussStatementParser.AlterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterGroupClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroupClauses(OpenGaussStatementParser.AlterGroupClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLanguage(OpenGaussStatementParser.AlterLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterLargeObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLargeObject(OpenGaussStatementParser.AlterLargeObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaterializedView(OpenGaussStatementParser.AlterMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterMaterializedViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaterializedViewClauses(OpenGaussStatementParser.AlterMaterializedViewClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(OpenGaussStatementParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor(OpenGaussStatementParser.CursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cursorOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorOptions(OpenGaussStatementParser.CursorOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorOption(OpenGaussStatementParser.CursorOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(OpenGaussStatementParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaterializedView(OpenGaussStatementParser.CreateMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createMvTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMvTarget(OpenGaussStatementParser.CreateMvTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#refreshMatViewStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMatViewStmt(OpenGaussStatementParser.RefreshMatViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPolicy(OpenGaussStatementParser.AlterPolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterPolicyClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPolicyClauses(OpenGaussStatementParser.AlterPolicyClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(OpenGaussStatementParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterProcedureClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedureClauses(OpenGaussStatementParser.AlterProcedureClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterfuncOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfuncOptList(OpenGaussStatementParser.AlterfuncOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(OpenGaussStatementParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterFunctionClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionClauses(OpenGaussStatementParser.AlterFunctionClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterPublication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPublication(OpenGaussStatementParser.AlterPublicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoutine(OpenGaussStatementParser.AlterRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRule(OpenGaussStatementParser.AlterRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequence(OpenGaussStatementParser.AlterSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterSequenceClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequenceClauses(OpenGaussStatementParser.AlterSequenceClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServer(OpenGaussStatementParser.AlterServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#foreignServerVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignServerVersion(OpenGaussStatementParser.ForeignServerVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStatistics(OpenGaussStatementParser.AlterStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterSubscription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSubscription(OpenGaussStatementParser.AlterSubscriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#publicationNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicationNameList(OpenGaussStatementParser.PublicationNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#publicationNameItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicationNameItem(OpenGaussStatementParser.PublicationNameItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterSystem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSystem(OpenGaussStatementParser.AlterSystemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(OpenGaussStatementParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchConfiguration(OpenGaussStatementParser.AlterTextSearchConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchConfigurationClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchConfigurationClauses(OpenGaussStatementParser.AlterTextSearchConfigurationClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#anyNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyNameList(OpenGaussStatementParser.AnyNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchDictionary(OpenGaussStatementParser.AlterTextSearchDictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchParser(OpenGaussStatementParser.AlterTextSearchParserContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTextSearchTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchTemplate(OpenGaussStatementParser.AlterTextSearchTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTrigger(OpenGaussStatementParser.AlterTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterType(OpenGaussStatementParser.AlterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTypeClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTypeClauses(OpenGaussStatementParser.AlterTypeClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTypeCmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTypeCmds(OpenGaussStatementParser.AlterTypeCmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterTypeCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTypeCmd(OpenGaussStatementParser.AlterTypeCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMapping(OpenGaussStatementParser.AlterUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#authIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthIdent(OpenGaussStatementParser.AuthIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(OpenGaussStatementParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewCmds}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewCmds(OpenGaussStatementParser.AlterViewCmdsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterRenameView}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRenameView(OpenGaussStatementParser.AlterRenameViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterRenameColumn}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRenameColumn(OpenGaussStatementParser.AlterRenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterSetSchema}
	 * labeled alternative in {@link OpenGaussStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSetSchema(OpenGaussStatementParser.AlterSetSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose(OpenGaussStatementParser.CloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#cluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster(OpenGaussStatementParser.ClusterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#clusterIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterIndexSpecification(OpenGaussStatementParser.ClusterIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(OpenGaussStatementParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#commentClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentClauses(OpenGaussStatementParser.CommentClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#objectTypeNameOnAnyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeNameOnAnyName(OpenGaussStatementParser.ObjectTypeNameOnAnyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#objectTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeName(OpenGaussStatementParser.ObjectTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTypeName(OpenGaussStatementParser.DropTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#objectTypeAnyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeAnyName(OpenGaussStatementParser.ObjectTypeAnyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#commentText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentText(OpenGaussStatementParser.CommentTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createAccessMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAccessMethod(OpenGaussStatementParser.CreateAccessMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createAggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAggregate(OpenGaussStatementParser.CreateAggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#oldAggrDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldAggrDefinition(OpenGaussStatementParser.OldAggrDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#oldAggrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldAggrList(OpenGaussStatementParser.OldAggrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#oldAggrElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldAggrElem(OpenGaussStatementParser.OldAggrElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCast(OpenGaussStatementParser.CreateCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#castContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastContext(OpenGaussStatementParser.CastContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCollation(OpenGaussStatementParser.CreateCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConversion(OpenGaussStatementParser.CreateConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomain(OpenGaussStatementParser.CreateDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEventTrigger(OpenGaussStatementParser.CreateEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#eventTriggerWhenList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventTriggerWhenList(OpenGaussStatementParser.EventTriggerWhenListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#eventTriggerWhenItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventTriggerWhenItem(OpenGaussStatementParser.EventTriggerWhenItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#eventTriggerValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventTriggerValueList(OpenGaussStatementParser.EventTriggerValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtension(OpenGaussStatementParser.CreateExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createExtensionOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionOptList(OpenGaussStatementParser.CreateExtensionOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createExtensionOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionOptItem(OpenGaussStatementParser.CreateExtensionOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignDataWrapper(OpenGaussStatementParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createForeignTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTable(OpenGaussStatementParser.CreateForeignTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createForeignTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTableClauses(OpenGaussStatementParser.CreateForeignTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(OpenGaussStatementParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(OpenGaussStatementParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeClause(OpenGaussStatementParser.TableLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOptionList(OpenGaussStatementParser.TableLikeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableLikeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOption(OpenGaussStatementParser.TableLikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(OpenGaussStatementParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableFuncColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncColumnList(OpenGaussStatementParser.TableFuncColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tableFuncColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncColumn(OpenGaussStatementParser.TableFuncColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createfuncOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefuncOptList(OpenGaussStatementParser.CreatefuncOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createfuncOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefuncOptItem(OpenGaussStatementParser.CreatefuncOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#transformTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformTypeList(OpenGaussStatementParser.TransformTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcAs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAs(OpenGaussStatementParser.FuncAsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturn(OpenGaussStatementParser.FuncReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArgsWithDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgsWithDefaults(OpenGaussStatementParser.FuncArgsWithDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArgsWithDefaultsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgsWithDefaultsList(OpenGaussStatementParser.FuncArgsWithDefaultsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#funcArgWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgWithDefault(OpenGaussStatementParser.FuncArgWithDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLanguage(OpenGaussStatementParser.CreateLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#transformElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformElementList(OpenGaussStatementParser.TransformElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#validatorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidatorClause(OpenGaussStatementParser.ValidatorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePolicy(OpenGaussStatementParser.CreatePolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(OpenGaussStatementParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createPublication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePublication(OpenGaussStatementParser.CreatePublicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#publicationForTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicationForTables(OpenGaussStatementParser.PublicationForTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRule(OpenGaussStatementParser.CreateRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ruleActionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionList(OpenGaussStatementParser.RuleActionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmt(OpenGaussStatementParser.RuleActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionMulti(OpenGaussStatementParser.RuleActionMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#notifyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStmt(OpenGaussStatementParser.NotifyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(OpenGaussStatementParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvents(OpenGaussStatementParser.TriggerEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOneEvent(OpenGaussStatementParser.TriggerOneEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerActionTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerActionTime(OpenGaussStatementParser.TriggerActionTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArgs(OpenGaussStatementParser.TriggerFuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArg(OpenGaussStatementParser.TriggerFuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerWhen(OpenGaussStatementParser.TriggerWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerForSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForSpec(OpenGaussStatementParser.TriggerForSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerReferencing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerReferencing(OpenGaussStatementParser.TriggerReferencingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerTransitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTransitions(OpenGaussStatementParser.TriggerTransitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#triggerTransition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTransition(OpenGaussStatementParser.TriggerTransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#transitionRelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionRelName(OpenGaussStatementParser.TransitionRelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#transitionRowOrTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionRowOrTable(OpenGaussStatementParser.TransitionRowOrTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#transitionOldOrNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionOldOrNew(OpenGaussStatementParser.TransitionOldOrNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequence(OpenGaussStatementParser.CreateSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#tempOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempOption(OpenGaussStatementParser.TempOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServer(OpenGaussStatementParser.CreateServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatistics(OpenGaussStatementParser.CreateStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createSubscription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSubscription(OpenGaussStatementParser.CreateSubscriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespace(OpenGaussStatementParser.CreateTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createTextSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTextSearch(OpenGaussStatementParser.CreateTextSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTransform(OpenGaussStatementParser.CreateTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateType(OpenGaussStatementParser.CreateTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createTypeClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeClauses(OpenGaussStatementParser.CreateTypeClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#enumValList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValList(OpenGaussStatementParser.EnumValListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMapping(OpenGaussStatementParser.CreateUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#discard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscard(OpenGaussStatementParser.DiscardContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropAccessMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAccessMethod(OpenGaussStatementParser.DropAccessMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropAggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAggregate(OpenGaussStatementParser.DropAggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#aggregateWithArgtypesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWithArgtypesList(OpenGaussStatementParser.AggregateWithArgtypesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCast(OpenGaussStatementParser.DropCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCollation(OpenGaussStatementParser.DropCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConversion(OpenGaussStatementParser.DropConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDomain(OpenGaussStatementParser.DropDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEventTrigger(OpenGaussStatementParser.DropEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropExtension(OpenGaussStatementParser.DropExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignDataWrapper(OpenGaussStatementParser.DropForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropForeignTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignTable(OpenGaussStatementParser.DropForeignTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(OpenGaussStatementParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#functionWithArgtypesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithArgtypesList(OpenGaussStatementParser.FunctionWithArgtypesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLanguage(OpenGaussStatementParser.DropLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMaterializedView(OpenGaussStatementParser.DropMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperator(OpenGaussStatementParser.DropOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#operatorWithArgtypesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorWithArgtypesList(OpenGaussStatementParser.OperatorWithArgtypesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropOperatorClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorClass(OpenGaussStatementParser.DropOperatorClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropOperatorFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorFamily(OpenGaussStatementParser.DropOperatorFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropOwned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOwned(OpenGaussStatementParser.DropOwnedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPolicy(OpenGaussStatementParser.DropPolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(OpenGaussStatementParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropPublication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPublication(OpenGaussStatementParser.DropPublicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoutine(OpenGaussStatementParser.DropRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRule(OpenGaussStatementParser.DropRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSequence(OpenGaussStatementParser.DropSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropSynonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSynonym(OpenGaussStatementParser.DropSynonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropServer(OpenGaussStatementParser.DropServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatistics(OpenGaussStatementParser.DropStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropSubscription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSubscription(OpenGaussStatementParser.DropSubscriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespace(OpenGaussStatementParser.DropTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropTextSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTextSearch(OpenGaussStatementParser.DropTextSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTransform(OpenGaussStatementParser.DropTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigger(OpenGaussStatementParser.DropTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropType(OpenGaussStatementParser.DropTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserMapping(OpenGaussStatementParser.DropUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(OpenGaussStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#importForeignSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportForeignSchema(OpenGaussStatementParser.ImportForeignSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#importQualification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportQualification(OpenGaussStatementParser.ImportQualificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#importQualificationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportQualificationType(OpenGaussStatementParser.ImportQualificationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#listen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListen(OpenGaussStatementParser.ListenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(OpenGaussStatementParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#prepare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare(OpenGaussStatementParser.PrepareContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#deallocate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate(OpenGaussStatementParser.DeallocateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#prepTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepTypeClause(OpenGaussStatementParser.PrepTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#refreshMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMaterializedView(OpenGaussStatementParser.RefreshMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReIndex(OpenGaussStatementParser.ReIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reIndexClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReIndexClauses(OpenGaussStatementParser.ReIndexClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reindexOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexOptionList(OpenGaussStatementParser.ReindexOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reindexOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexOptionElem(OpenGaussStatementParser.ReindexOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reindexTargetMultitable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexTargetMultitable(OpenGaussStatementParser.ReindexTargetMultitableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#reindexTargetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexTargetType(OpenGaussStatementParser.ReindexTargetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterForeignTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTable(OpenGaussStatementParser.AlterForeignTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterForeignTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTableClauses(OpenGaussStatementParser.AlterForeignTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperator(OpenGaussStatementParser.CreateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createOperatorClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorClass(OpenGaussStatementParser.CreateOperatorClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createOperatorFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorFamily(OpenGaussStatementParser.CreateOperatorFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#securityLabelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityLabelStmt(OpenGaussStatementParser.SecurityLabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#securityLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityLabel(OpenGaussStatementParser.SecurityLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#securityLabelClausces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityLabelClausces(OpenGaussStatementParser.SecurityLabelClauscesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#unlisten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlisten(OpenGaussStatementParser.UnlistenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchema(OpenGaussStatementParser.CreateSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createSchemaClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaClauses(OpenGaussStatementParser.CreateSchemaClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#schemaEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaEltList(OpenGaussStatementParser.SchemaEltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#schemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaStmt(OpenGaussStatementParser.SchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeClause(OpenGaussStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#roleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleClause(OpenGaussStatementParser.RoleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#privilegeTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeTypes(OpenGaussStatementParser.PrivilegeTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnObjectClause(OpenGaussStatementParser.OnObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#numericOnlyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnlyList(OpenGaussStatementParser.NumericOnlyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeLevel(OpenGaussStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(OpenGaussStatementParser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType(OpenGaussStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#createDirectory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDirectory(OpenGaussStatementParser.CreateDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSchema(OpenGaussStatementParser.AlterSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSchema(OpenGaussStatementParser.DropSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#fetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch(OpenGaussStatementParser.FetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#alterPackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPackage(OpenGaussStatementParser.AlterPackageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code next}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(OpenGaussStatementParser.NextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prior}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrior(OpenGaussStatementParser.PriorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(OpenGaussStatementParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(OpenGaussStatementParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absoluteCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteCount(OpenGaussStatementParser.AbsoluteCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativeCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeCount(OpenGaussStatementParser.RelativeCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code count}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(OpenGaussStatementParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code all}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(OpenGaussStatementParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(OpenGaussStatementParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forwardCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwardCount(OpenGaussStatementParser.ForwardCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forwardAll}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwardAll(OpenGaussStatementParser.ForwardAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackward(OpenGaussStatementParser.BackwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backwardCount}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackwardCount(OpenGaussStatementParser.BackwardCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backwardAll}
	 * labeled alternative in {@link OpenGaussStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackwardAll(OpenGaussStatementParser.BackwardAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(OpenGaussStatementParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(OpenGaussStatementParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#runtimeScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntimeScope(OpenGaussStatementParser.RuntimeScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#timeZoneClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneClause(OpenGaussStatementParser.TimeZoneClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationParameterClause(OpenGaussStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetParameter(OpenGaussStatementParser.ResetParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(OpenGaussStatementParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#explainableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStmt(OpenGaussStatementParser.ExplainableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#explainOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionList(OpenGaussStatementParser.ExplainOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#explainOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionElem(OpenGaussStatementParser.ExplainOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#explainOptionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionArg(OpenGaussStatementParser.ExplainOptionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#explainOptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionName(OpenGaussStatementParser.ExplainOptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#analyzeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeKeyword(OpenGaussStatementParser.AnalyzeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTable(OpenGaussStatementParser.AnalyzeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#vacuumRelationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumRelationList(OpenGaussStatementParser.VacuumRelationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#vacuumRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumRelation(OpenGaussStatementParser.VacuumRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionList(OpenGaussStatementParser.VacAnalyzeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionElem(OpenGaussStatementParser.VacAnalyzeOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionArg(OpenGaussStatementParser.VacAnalyzeOptionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#vacAnalyzeOptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionName(OpenGaussStatementParser.VacAnalyzeOptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(OpenGaussStatementParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#vacuum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum(OpenGaussStatementParser.VacuumContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(OpenGaussStatementParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(OpenGaussStatementParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpenGaussStatementParser#callClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallClauses(OpenGaussStatementParser.CallClausesContext ctx);
}