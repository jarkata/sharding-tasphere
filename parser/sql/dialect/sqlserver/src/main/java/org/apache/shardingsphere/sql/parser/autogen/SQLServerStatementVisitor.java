// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/sqlserver/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/SQLServerStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLServerStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLServerStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SQLServerStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(SQLServerStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(SQLServerStatementParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setImplicitTransactions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetImplicitTransactions(SQLServerStatementParser.SetImplicitTransactionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#implicitTransactionsValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitTransactionsValue(SQLServerStatementParser.ImplicitTransactionsValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTransaction(SQLServerStatementParser.BeginTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#beginDistributedTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginDistributedTransaction(SQLServerStatementParser.BeginDistributedTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(SQLServerStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#commitWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitWork(SQLServerStatementParser.CommitWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(SQLServerStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#rollbackWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackWork(SQLServerStatementParser.RollbackWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(SQLServerStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(SQLServerStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(SQLServerStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(SQLServerStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(SQLServerStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeLiterals(SQLServerStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(SQLServerStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(SQLServerStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(SQLServerStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(SQLServerStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQLServerStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#regularIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularIdentifier(SQLServerStatementParser.RegularIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#delimitedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimitedIdentifier(SQLServerStatementParser.DelimitedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(SQLServerStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(SQLServerStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(SQLServerStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SQLServerStatementParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(SQLServerStatementParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(SQLServerStatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(SQLServerStatementParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#sequenceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceName(SQLServerStatementParser.SequenceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLServerStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#queueName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueName(SQLServerStatementParser.QueueNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#contractName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractName(SQLServerStatementParser.ContractNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceName(SQLServerStatementParser.ServiceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQLServerStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#scriptVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptVariableName(SQLServerStatementParser.ScriptVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(SQLServerStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLServerStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(SQLServerStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnNamesWithSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNamesWithSort(SQLServerStatementParser.ColumnNamesWithSortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(SQLServerStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(SQLServerStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(SQLServerStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(SQLServerStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SQLServerStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(SQLServerStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(SQLServerStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLServerStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(SQLServerStatementParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(SQLServerStatementParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#distinctFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctFrom(SQLServerStatementParser.DistinctFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(SQLServerStatementParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(SQLServerStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SQLServerStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SQLServerStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(SQLServerStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(SQLServerStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SQLServerStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(SQLServerStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(SQLServerStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(SQLServerStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(SQLServerStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction(SQLServerStatementParser.TrimFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#graphFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphFunction(SQLServerStatementParser.GraphFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#graphAggFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphAggFunction(SQLServerStatementParser.GraphAggFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#graphAggFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphAggFunctionName(SQLServerStatementParser.GraphAggFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#rowNumberFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowNumberFunction(SQLServerStatementParser.RowNumberFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#openDatasourceFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenDatasourceFunction(SQLServerStatementParser.OpenDatasourceFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#approxFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApproxFunction(SQLServerStatementParser.ApproxFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#conversionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionFunction(SQLServerStatementParser.ConversionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(SQLServerStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(SQLServerStatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunction(SQLServerStatementParser.JsonFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#jsonObjectFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObjectFunction(SQLServerStatementParser.JsonObjectFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#jsonArrayFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArrayFunction(SQLServerStatementParser.JsonArrayFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#jsonKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonKeyValue(SQLServerStatementParser.JsonKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#jsonNullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonNullClause(SQLServerStatementParser.JsonNullClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(SQLServerStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#openJsonFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenJsonFunction(SQLServerStatementParser.OpenJsonFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#openJsonWithclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenJsonWithclause(SQLServerStatementParser.OpenJsonWithclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#jsonColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonColumnDefinition(SQLServerStatementParser.JsonColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#openRowSetFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenRowSetFunction(SQLServerStatementParser.OpenRowSetFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#openQueryFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenQueryFunction(SQLServerStatementParser.OpenQueryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#rowSetFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowSetFunction(SQLServerStatementParser.RowSetFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(SQLServerStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(SQLServerStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(SQLServerStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(SQLServerStatementParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(SQLServerStatementParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateExprOfDb(SQLServerStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SQLServerStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(SQLServerStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SQLServerStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(SQLServerStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#atTimeZoneExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTimeZoneExpr(SQLServerStatementParser.AtTimeZoneExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#castExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(SQLServerStatementParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#convertExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertExpr(SQLServerStatementParser.ConvertExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(SQLServerStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(SQLServerStatementParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(SQLServerStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(SQLServerStatementParser.PartitionByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#rowRangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowRangeClause(SQLServerStatementParser.RowRangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameExtent(SQLServerStatementParser.WindowFrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameBetween(SQLServerStatementParser.WindowFrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameBound(SQLServerStatementParser.WindowFrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFramePreceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFramePreceding(SQLServerStatementParser.WindowFramePrecedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameFollowing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameFollowing(SQLServerStatementParser.WindowFrameFollowingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnNameWithSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameWithSort(SQLServerStatementParser.ColumnNameWithSortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption(SQLServerStatementParser.IndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#compressionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompressionOption(SQLServerStatementParser.CompressionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqTime(SQLServerStatementParser.EqTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqOnOffOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOnOffOption(SQLServerStatementParser.EqOnOffOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqKey(SQLServerStatementParser.EqKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqOnOff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOnOff(SQLServerStatementParser.EqOnOffContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPartitionClause(SQLServerStatementParser.OnPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpressions(SQLServerStatementParser.PartitionExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpression(SQLServerStatementParser.PartitionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#numberRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberRange(SQLServerStatementParser.NumberRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#lowPriorityLockWait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowPriorityLockWait(SQLServerStatementParser.LowPriorityLockWaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onLowPriorLockWait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnLowPriorLockWait(SQLServerStatementParser.OnLowPriorLockWaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier(SQLServerStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifiers(SQLServerStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#matchNone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchNone(SQLServerStatementParser.MatchNoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(SQLServerStatementParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#executeAsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteAsClause(SQLServerStatementParser.ExecuteAsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#transactionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionName(SQLServerStatementParser.TransactionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#transactionVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionVariableName(SQLServerStatementParser.TransactionVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#savepointName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointName(SQLServerStatementParser.SavepointNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#savepointVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointVariableName(SQLServerStatementParser.SavepointVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#entityType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityType(SQLServerStatementParser.EntityTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(SQLServerStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableHintLimited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableHintLimited(SQLServerStatementParser.TableHintLimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(SQLServerStatementParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#simpleMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleMatch(SQLServerStatementParser.SimpleMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#simpleMatchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleMatchClause(SQLServerStatementParser.SimpleMatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#lastNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastNode(SQLServerStatementParser.LastNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#arbitratyLengthMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitratyLengthMatch(SQLServerStatementParser.ArbitratyLengthMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#arbitraryLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitraryLength(SQLServerStatementParser.ArbitraryLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#arbitraryLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitraryLengthClause(SQLServerStatementParser.ArbitraryLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#edgeNodeAl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeNodeAl(SQLServerStatementParser.EdgeNodeAlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#edgeAliasPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeAliasPath(SQLServerStatementParser.EdgeAliasPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#outEdgePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEdgePath(SQLServerStatementParser.OutEdgePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#inEdgePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEdgePath(SQLServerStatementParser.InEdgePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alPatternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlPatternQuantifier(SQLServerStatementParser.AlPatternQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#nodeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAlias(SQLServerStatementParser.NodeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#edgeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeAlias(SQLServerStatementParser.EdgeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(SQLServerStatementParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SQLServerStatementParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStatement(SQLServerStatementParser.ExplainableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SQLServerStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableClause(SQLServerStatementParser.CreateTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(SQLServerStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(SQLServerStatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SQLServerStatementParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(SQLServerStatementParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SQLServerStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(SQLServerStatementParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequence(SQLServerStatementParser.CreateSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createService}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateService(SQLServerStatementParser.CreateServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchema(SQLServerStatementParser.CreateSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(SQLServerStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndex(SQLServerStatementParser.AlterIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(SQLServerStatementParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(SQLServerStatementParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(SQLServerStatementParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(SQLServerStatementParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTrigger(SQLServerStatementParser.AlterTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequence(SQLServerStatementParser.AlterSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterService}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterService(SQLServerStatementParser.AlterServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSchema(SQLServerStatementParser.AlterSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#securableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurableName(SQLServerStatementParser.SecurableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SQLServerStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(SQLServerStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(SQLServerStatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SQLServerStatementParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(SQLServerStatementParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(SQLServerStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigger(SQLServerStatementParser.DropTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSequence(SQLServerStatementParser.DropSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropService}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropService(SQLServerStatementParser.DropServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSchema(SQLServerStatementParser.DropSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SQLServerStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#updateStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatistics(SQLServerStatementParser.UpdateStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#statisticsWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatisticsWithClause(SQLServerStatementParser.StatisticsWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#sampleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleOption(SQLServerStatementParser.SampleOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#statisticsOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatisticsOptions(SQLServerStatementParser.StatisticsOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#statisticsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatisticsOption(SQLServerStatementParser.StatisticsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileTableClause(SQLServerStatementParser.FileTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(SQLServerStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTableDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableDefinitions(SQLServerStatementParser.CreateTableDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableDefinition(SQLServerStatementParser.CreateTableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(SQLServerStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnDefinitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinitionOption(SQLServerStatementParser.ColumnDefinitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#encryptedOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptedOptions(SQLServerStatementParser.EncryptedOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(SQLServerStatementParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#computedColumnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedColumnConstraint(SQLServerStatementParser.ComputedColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#computedColumnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedColumnForeignKeyConstraint(SQLServerStatementParser.ComputedColumnForeignKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#computedColumnForeignKeyOnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedColumnForeignKeyOnAction(SQLServerStatementParser.ComputedColumnForeignKeyOnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyConstraint(SQLServerStatementParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiskTablePrimaryKeyConstraintOption(SQLServerStatementParser.DiskTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#clusterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterOption(SQLServerStatementParser.ClusterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyWithClause(SQLServerStatementParser.PrimaryKeyWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyOnClause(SQLServerStatementParser.PrimaryKeyOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onSchemaColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnSchemaColumn(SQLServerStatementParser.OnSchemaColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onFileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnFileGroup(SQLServerStatementParser.OnFileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnString(SQLServerStatementParser.OnStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryTablePrimaryKeyConstraintOption(SQLServerStatementParser.MemoryTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withBucket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithBucket(SQLServerStatementParser.WithBucketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnForeignKeyConstraint(SQLServerStatementParser.ColumnForeignKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyOnAction(SQLServerStatementParser.ForeignKeyOnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyOn(SQLServerStatementParser.ForeignKeyOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraint(SQLServerStatementParser.CheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnIndex(SQLServerStatementParser.ColumnIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withIndexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithIndexOption(SQLServerStatementParser.WithIndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOnClause(SQLServerStatementParser.IndexOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDefault(SQLServerStatementParser.OnDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileStreamOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStreamOn(SQLServerStatementParser.FileStreamOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraints(SQLServerStatementParser.ColumnConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedColumnDefinition(SQLServerStatementParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnSetDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnSetDefinition(SQLServerStatementParser.ColumnSetDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(SQLServerStatementParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#edgeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeConstraint(SQLServerStatementParser.EdgeConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#connectionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionClause(SQLServerStatementParser.ConnectionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tablePrimaryConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePrimaryConstraint(SQLServerStatementParser.TablePrimaryConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyUnique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyUnique(SQLServerStatementParser.PrimaryKeyUniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiskTablePrimaryConstraintOption(SQLServerStatementParser.DiskTablePrimaryConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryTablePrimaryConstraintOption(SQLServerStatementParser.MemoryTablePrimaryConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#hashWithBucket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashWithBucket(SQLServerStatementParser.HashWithBucketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableForeignKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableForeignKeyConstraint(SQLServerStatementParser.TableForeignKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndex(SQLServerStatementParser.TableIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexNameOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNameOption(SQLServerStatementParser.IndexNameOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOptions(SQLServerStatementParser.IndexOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#periodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodClause(SQLServerStatementParser.PeriodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionScheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionScheme(SQLServerStatementParser.PartitionSchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileGroup(SQLServerStatementParser.FileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptions(SQLServerStatementParser.TableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOption(SQLServerStatementParser.TableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataDelectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDelectionOption(SQLServerStatementParser.DataDelectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableStretchOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStretchOptions(SQLServerStatementParser.TableStretchOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableStretchOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStretchOption(SQLServerStatementParser.TableStretchOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#migrationState_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMigrationState_(SQLServerStatementParser.MigrationState_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableOperationOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOperationOption(SQLServerStatementParser.TableOperationOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#distributionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributionOption(SQLServerStatementParser.DistributionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataWareHouseTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataWareHouseTableOption(SQLServerStatementParser.DataWareHouseTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataWareHousePartitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataWareHousePartitionOption(SQLServerStatementParser.DataWareHousePartitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification(SQLServerStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(SQLServerStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(SQLServerStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(SQLServerStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterColumnOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnOperation(SQLServerStatementParser.AlterColumnOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAddOptions(SQLServerStatementParser.AlterColumnAddOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAddOption(SQLServerStatementParser.AlterColumnAddOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#constraintForColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintForColumn(SQLServerStatementParser.ConstraintForColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnNamesClause(SQLServerStatementParser.GeneratedColumnNamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnNameClause(SQLServerStatementParser.GeneratedColumnNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#generatedColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnName(SQLServerStatementParser.GeneratedColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterDrop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDrop(SQLServerStatementParser.AlterDropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableDropConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableDropConstraint(SQLServerStatementParser.AlterTableDropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropConstraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintName(SQLServerStatementParser.DropConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropConstraintWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintWithClause(SQLServerStatementParser.DropConstraintWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintOption(SQLServerStatementParser.DropConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onOffOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnOffOption(SQLServerStatementParser.OnOffOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(SQLServerStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexSpecification(SQLServerStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterCheckConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCheckConstraint(SQLServerStatementParser.AlterCheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableTrigger(SQLServerStatementParser.AlterTableTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSwitch(SQLServerStatementParser.AlterSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSet(SQLServerStatementParser.AlterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setFileStreamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetFileStreamClause(SQLServerStatementParser.SetFileStreamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setSystemVersionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVersionClause(SQLServerStatementParser.SetSystemVersionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSetOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSetOnClause(SQLServerStatementParser.AlterSetOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataConsistencyCheckClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataConsistencyCheckClause(SQLServerStatementParser.DataConsistencyCheckClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistoryRetentionPeriodClause(SQLServerStatementParser.HistoryRetentionPeriodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistoryRetentionPeriod(SQLServerStatementParser.HistoryRetentionPeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableTableIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableTableIndex(SQLServerStatementParser.AlterTableTableIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexWithName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexWithName(SQLServerStatementParser.IndexWithNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexNonClusterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNonClusterClause(SQLServerStatementParser.IndexNonClusterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableIndexOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableIndexOnClause(SQLServerStatementParser.AlterTableIndexOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexClusterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexClusterClause(SQLServerStatementParser.IndexClusterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableOption(SQLServerStatementParser.AlterTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onHistoryTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnHistoryTableClause(SQLServerStatementParser.OnHistoryTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createDatabaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseClause(SQLServerStatementParser.CreateDatabaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDefinitionClause(SQLServerStatementParser.FileDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseOption(SQLServerStatementParser.DatabaseOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileStreamOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStreamOption(SQLServerStatementParser.FileStreamOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSpec(SQLServerStatementParser.FileSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseFileSpecOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseFileSpecOption(SQLServerStatementParser.DatabaseFileSpecOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseFileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseFileGroup(SQLServerStatementParser.DatabaseFileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseFileGroupContains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseFileGroupContains(SQLServerStatementParser.DatabaseFileGroupContainsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseLogOns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseLogOns(SQLServerStatementParser.DatabaseLogOnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#declareVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable(SQLServerStatementParser.DeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SQLServerStatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableVariable(SQLServerStatementParser.TableVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#variTableTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariTableTypeDefinition(SQLServerStatementParser.VariTableTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableVariableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableVariableClause(SQLServerStatementParser.TableVariableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#variableTableColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTableColumnDefinition(SQLServerStatementParser.VariableTableColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#variableTableColumnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTableColumnConstraint(SQLServerStatementParser.VariableTableColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#variableTableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTableConstraint(SQLServerStatementParser.VariableTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(SQLServerStatementParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setVariableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariableClause(SQLServerStatementParser.SetVariableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#cursorVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorVariable(SQLServerStatementParser.CursorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#cursorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorClause(SQLServerStatementParser.CursorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#compoundOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundOperation(SQLServerStatementParser.CompoundOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#funcParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameters(SQLServerStatementParser.FuncParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#funcReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturns(SQLServerStatementParser.FuncReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#funcMutiReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncMutiReturn(SQLServerStatementParser.FuncMutiReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#funcInlineReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInlineReturn(SQLServerStatementParser.FuncInlineReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#funcScalarReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncScalarReturn(SQLServerStatementParser.FuncScalarReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableTypeDefinition(SQLServerStatementParser.TableTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(SQLServerStatementParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#functionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOption(SQLServerStatementParser.FunctionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#validStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidStatement(SQLServerStatementParser.ValidStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#procParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcParameters(SQLServerStatementParser.ProcParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#procParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcParameter(SQLServerStatementParser.ProcParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createOrAlterProcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrAlterProcClause(SQLServerStatementParser.CreateOrAlterProcClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withCreateProcOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithCreateProcOption(SQLServerStatementParser.WithCreateProcOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#procOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcOption(SQLServerStatementParser.ProcOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#procAsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcAsClause(SQLServerStatementParser.ProcAsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#procSetOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcSetOption(SQLServerStatementParser.ProcSetOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createOrAlterViewClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrAlterViewClause(SQLServerStatementParser.CreateOrAlterViewClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#viewAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewAttribute(SQLServerStatementParser.ViewAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withCommonTableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithCommonTableExpr(SQLServerStatementParser.WithCommonTableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonTableExpr(SQLServerStatementParser.CommonTableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTriggerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTriggerClause(SQLServerStatementParser.CreateTriggerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dmlTriggerOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlTriggerOption(SQLServerStatementParser.DmlTriggerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#methodSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSpecifier(SQLServerStatementParser.MethodSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#triggerTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTarget(SQLServerStatementParser.TriggerTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createOrAlterSequenceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrAlterSequenceClause(SQLServerStatementParser.CreateOrAlterSequenceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexClause(SQLServerStatementParser.CreateIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#filterPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterPredicate(SQLServerStatementParser.FilterPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#conjunct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunct(SQLServerStatementParser.ConjunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexClause(SQLServerStatementParser.AlterIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#relationalIndexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalIndexOption(SQLServerStatementParser.RelationalIndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionNumberRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNumberRange(SQLServerStatementParser.PartitionNumberRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#reorganizeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReorganizeOption(SQLServerStatementParser.ReorganizeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setIndexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetIndexOption(SQLServerStatementParser.SetIndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#resumableIndexOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumableIndexOptions(SQLServerStatementParser.ResumableIndexOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseClause(SQLServerStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#addSecondaryOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSecondaryOption(SQLServerStatementParser.AddSecondaryOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#editionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditionOptions(SQLServerStatementParser.EditionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceObjective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceObjective(SQLServerStatementParser.ServiceObjectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterDatabaseOptionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseOptionSpec(SQLServerStatementParser.AlterDatabaseOptionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileAndFilegroupOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAndFilegroupOptions(SQLServerStatementParser.FileAndFilegroupOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#addOrModifyFilegroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrModifyFilegroups(SQLServerStatementParser.AddOrModifyFilegroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#filegroupUpdatabilityOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilegroupUpdatabilityOption(SQLServerStatementParser.FilegroupUpdatabilityOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#addOrModifyFiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrModifyFiles(SQLServerStatementParser.AddOrModifyFilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#acceleratedDatabaseRecovery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceleratedDatabaseRecovery(SQLServerStatementParser.AcceleratedDatabaseRecoveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#autoOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoOption(SQLServerStatementParser.AutoOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#automaticTuningOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomaticTuningOption(SQLServerStatementParser.AutomaticTuningOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#changeTrackingOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeTrackingOption(SQLServerStatementParser.ChangeTrackingOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#changeTrackingOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeTrackingOptionList(SQLServerStatementParser.ChangeTrackingOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorOption(SQLServerStatementParser.CursorOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#externalAccessOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalAccessOption(SQLServerStatementParser.ExternalAccessOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#queryStoreOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStoreOptions(SQLServerStatementParser.QueryStoreOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#queryStoreOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStoreOptionList(SQLServerStatementParser.QueryStoreOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#queryCapturePolicyOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryCapturePolicyOptionList(SQLServerStatementParser.QueryCapturePolicyOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#recoveryOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoveryOption(SQLServerStatementParser.RecoveryOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#sqlOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlOption(SQLServerStatementParser.SqlOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#snapshotOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshotOption(SQLServerStatementParser.SnapshotOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerOption(SQLServerStatementParser.ServiceBrokerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#targetRecoveryTimeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetRecoveryTimeOption(SQLServerStatementParser.TargetRecoveryTimeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermination(SQLServerStatementParser.TerminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createServiceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServiceClause(SQLServerStatementParser.CreateServiceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterServiceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServiceClause(SQLServerStatementParser.AlterServiceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterServiceOptArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServiceOptArg(SQLServerStatementParser.AlterServiceOptArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#schemaNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaNameClause(SQLServerStatementParser.SchemaNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#schemaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaElement(SQLServerStatementParser.SchemaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTableAsSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableAsSelectClause(SQLServerStatementParser.CreateTableAsSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTableAsSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableAsSelect(SQLServerStatementParser.CreateTableAsSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createRemoteTableAsSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRemoteTableAsSelect(SQLServerStatementParser.CreateRemoteTableAsSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withDistributionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithDistributionOption(SQLServerStatementParser.WithDistributionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#optionQueryHintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionQueryHintClause(SQLServerStatementParser.OptionQueryHintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(SQLServerStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insertDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertDefaultValue(SQLServerStatementParser.InsertDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(SQLServerStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(SQLServerStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insertExecClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertExecClause(SQLServerStatementParser.InsertExecClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#merge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge(SQLServerStatementParser.MergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#mergeIntoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeIntoClause(SQLServerStatementParser.MergeIntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#mergeUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeUsingClause(SQLServerStatementParser.MergeUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withMergeHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithMergeHint(SQLServerStatementParser.WithMergeHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#mergeWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeWhenClause(SQLServerStatementParser.MergeWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#mergeUpdateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeUpdateClause(SQLServerStatementParser.MergeUpdateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#mergeDeleteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeDeleteClause(SQLServerStatementParser.MergeDeleteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#mergeInsertClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeInsertClause(SQLServerStatementParser.MergeInsertClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withTableHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithTableHint(SQLServerStatementParser.WithTableHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#exec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec(SQLServerStatementParser.ExecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(SQLServerStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SQLServerStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(SQLServerStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(SQLServerStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(SQLServerStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(SQLServerStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#optionHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionHint(SQLServerStatementParser.OptionHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(SQLServerStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(SQLServerStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTableNames(SQLServerStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SQLServerStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#aggregationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationClause(SQLServerStatementParser.AggregationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SQLServerStatementParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(SQLServerStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(SQLServerStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(SQLServerStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(SQLServerStatementParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#topNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopNum(SQLServerStatementParser.TopNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(SQLServerStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(SQLServerStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(SQLServerStatementParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SQLServerStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(SQLServerStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(SQLServerStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(SQLServerStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(SQLServerStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(SQLServerStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SQLServerStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SQLServerStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SQLServerStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SQLServerStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withTempTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithTempTable(SQLServerStatementParser.WithTempTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(SQLServerStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#cteClauseSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClauseSet(SQLServerStatementParser.CteClauseSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#cteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClause(SQLServerStatementParser.CteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#outputClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputClause(SQLServerStatementParser.OutputClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#outputWithColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputWithColumns(SQLServerStatementParser.OutputWithColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#scalarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarExpression(SQLServerStatementParser.ScalarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#outputWithColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputWithColumn(SQLServerStatementParser.OutputWithColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#outputWithAaterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputWithAaterisk(SQLServerStatementParser.OutputWithAateriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#outputTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputTableName(SQLServerStatementParser.OutputTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#queryHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryHint(SQLServerStatementParser.QueryHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#useHitName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseHitName(SQLServerStatementParser.UseHitNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(SQLServerStatementParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#forXmlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForXmlClause(SQLServerStatementParser.ForXmlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#commonDirectivesForXml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonDirectivesForXml(SQLServerStatementParser.CommonDirectivesForXmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#forJsonClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForJsonClause(SQLServerStatementParser.ForJsonClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#selectWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithClause(SQLServerStatementParser.SelectWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#xmlNamespacesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespacesClause(SQLServerStatementParser.XmlNamespacesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#xmlNamespaceDeclarationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespaceDeclarationItem(SQLServerStatementParser.XmlNamespaceDeclarationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#xmlNamespaceUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespaceUri(SQLServerStatementParser.XmlNamespaceUriContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#xmlNamespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespacePrefix(SQLServerStatementParser.XmlNamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#xmlDefaultNamespaceDeclarationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlDefaultNamespaceDeclarationItem(SQLServerStatementParser.XmlDefaultNamespaceDeclarationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(SQLServerStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#grantClassPrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantClassPrivilegesClause(SQLServerStatementParser.GrantClassPrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#grantClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantClassTypePrivilegesClause(SQLServerStatementParser.GrantClassTypePrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPrivileges(SQLServerStatementParser.ClassPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onClassClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClassClause(SQLServerStatementParser.OnClassClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classTypePrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTypePrivileges(SQLServerStatementParser.ClassTypePrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onClassTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClassTypeClause(SQLServerStatementParser.OnClassTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#securable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurable(SQLServerStatementParser.SecurableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(SQLServerStatementParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(SQLServerStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#revokeClassPrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeClassPrivilegesClause(SQLServerStatementParser.RevokeClassPrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#revokeClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeClassTypePrivilegesClause(SQLServerStatementParser.RevokeClassTypePrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#deny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeny(SQLServerStatementParser.DenyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#denyClassPrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDenyClassPrivilegesClause(SQLServerStatementParser.DenyClassPrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#denyClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDenyClassTypePrivilegesClause(SQLServerStatementParser.DenyClassTypePrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionForClause(SQLServerStatementParser.OptionForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType(SQLServerStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#objectPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPermission(SQLServerStatementParser.ObjectPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serverPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerPermission(SQLServerStatementParser.ServerPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serverPrincipalPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerPrincipalPermission(SQLServerStatementParser.ServerPrincipalPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databasePermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePermission(SQLServerStatementParser.DatabasePermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databasePrincipalPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePrincipalPermission(SQLServerStatementParser.DatabasePrincipalPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseUserPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseUserPermission(SQLServerStatementParser.DatabaseUserPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseRolePermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseRolePermission(SQLServerStatementParser.DatabaseRolePermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#applicationRolePermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationRolePermission(SQLServerStatementParser.ApplicationRolePermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databaseScopedCredentialPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseScopedCredentialPermission(SQLServerStatementParser.DatabaseScopedCredentialPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#schemaPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPermission(SQLServerStatementParser.SchemaPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#searchPropertyListPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchPropertyListPermission(SQLServerStatementParser.SearchPropertyListPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerPermission(SQLServerStatementParser.ServiceBrokerPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerContractsPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerContractsPermission(SQLServerStatementParser.ServiceBrokerContractsPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerMessageTypesPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerMessageTypesPermission(SQLServerStatementParser.ServiceBrokerMessageTypesPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerRemoteServiceBindingsPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerRemoteServiceBindingsPermission(SQLServerStatementParser.ServiceBrokerRemoteServiceBindingsPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerRoutesPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerRoutesPermission(SQLServerStatementParser.ServiceBrokerRoutesPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerServicesPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerServicesPermission(SQLServerStatementParser.ServiceBrokerServicesPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#endpointPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndpointPermission(SQLServerStatementParser.EndpointPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#certificatePermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertificatePermission(SQLServerStatementParser.CertificatePermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#symmetricKeyPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymmetricKeyPermission(SQLServerStatementParser.SymmetricKeyPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#asymmetricKeyPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetricKeyPermission(SQLServerStatementParser.AsymmetricKeyPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assemblyPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyPermission(SQLServerStatementParser.AssemblyPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#availabilityGroupPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailabilityGroupPermission(SQLServerStatementParser.AvailabilityGroupPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fullTextPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTextPermission(SQLServerStatementParser.FullTextPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fullTextCatalogPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTextCatalogPermission(SQLServerStatementParser.FullTextCatalogPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fullTextStoplistPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTextStoplistPermission(SQLServerStatementParser.FullTextStoplistPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#typePermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePermission(SQLServerStatementParser.TypePermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#xmlSchemaCollectionPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlSchemaCollectionPermission(SQLServerStatementParser.XmlSchemaCollectionPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#systemObjectPermission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemObjectPermission(SQLServerStatementParser.SystemObjectPermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#class_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_(SQLServerStatementParser.Class_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassItem(SQLServerStatementParser.ClassItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(SQLServerStatementParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#roleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleClause(SQLServerStatementParser.RoleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUser(SQLServerStatementParser.SetUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(SQLServerStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUserLoginClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserLoginClause(SQLServerStatementParser.CreateUserLoginClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUserWindowsPrincipalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserWindowsPrincipalClause(SQLServerStatementParser.CreateUserWindowsPrincipalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUserLoginWindowsPrincipalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserLoginWindowsPrincipalClause(SQLServerStatementParser.CreateUserLoginWindowsPrincipalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUserWithoutLoginClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserWithoutLoginClause(SQLServerStatementParser.CreateUserWithoutLoginClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#optionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsList(SQLServerStatementParser.OptionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#limitedOptionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitedOptionsList(SQLServerStatementParser.LimitedOptionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUserFromExternalProviderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserFromExternalProviderClause(SQLServerStatementParser.CreateUserFromExternalProviderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUserWithDefaultSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserWithDefaultSchema(SQLServerStatementParser.CreateUserWithDefaultSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUserWithAzureActiveDirectoryPrincipalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserWithAzureActiveDirectoryPrincipalClause(SQLServerStatementParser.CreateUserWithAzureActiveDirectoryPrincipalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowsPrincipal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowsPrincipal(SQLServerStatementParser.WindowsPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#azureActiveDirectoryPrincipal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzureActiveDirectoryPrincipal(SQLServerStatementParser.AzureActiveDirectoryPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(SQLServerStatementParser.UserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#ignoredNameIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredNameIdentifier(SQLServerStatementParser.IgnoredNameIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(SQLServerStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(SQLServerStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetItem(SQLServerStatementParser.SetItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(SQLServerStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(SQLServerStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRole(SQLServerStatementParser.AlterRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLogin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLogin(SQLServerStatementParser.CreateLoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForSQLServerClause(SQLServerStatementParser.CreateLoginForSQLServerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForSQLServerOptionList(SQLServerStatementParser.CreateLoginForSQLServerOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerOptionListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForSQLServerOptionListClause(SQLServerStatementParser.CreateLoginForSQLServerOptionListClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#hashedPassword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashedPassword(SQLServerStatementParser.HashedPasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#sid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSid(SQLServerStatementParser.SidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSources(SQLServerStatementParser.SourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowsOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowsOptions(SQLServerStatementParser.WindowsOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSQLDatabaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAzureSQLDatabaseClause(SQLServerStatementParser.CreateLoginForAzureSQLDatabaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSQLDatabaseOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAzureSQLDatabaseOptionList(SQLServerStatementParser.CreateLoginForAzureSQLDatabaseOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureManagedInstanceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAzureManagedInstanceClause(SQLServerStatementParser.CreateLoginForAzureManagedInstanceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#azureManagedInstanceOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzureManagedInstanceOptionList(SQLServerStatementParser.AzureManagedInstanceOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSynapseAnalyticsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAzureSynapseAnalyticsClause(SQLServerStatementParser.CreateLoginForAzureSynapseAnalyticsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSynapseAnalyticsOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAzureSynapseAnalyticsOptionList(SQLServerStatementParser.CreateLoginForAzureSynapseAnalyticsOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAnalyticsPlatformSystemClause(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAnalyticsPlatformSystemOptionList(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemOptionListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoginForAnalyticsPlatformSystemOptionListClause(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemOptionListClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropLogin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLogin(SQLServerStatementParser.DropLoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterLogin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLogin(SQLServerStatementParser.AlterLoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#statusOptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusOptionClause(SQLServerStatementParser.StatusOptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setOptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOptionClause(SQLServerStatementParser.SetOptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#passwordOptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordOptionClause(SQLServerStatementParser.PasswordOptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#cryptographicCredentialsOptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCryptographicCredentialsOptionClause(SQLServerStatementParser.CryptographicCredentialsOptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#revert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevert(SQLServerStatementParser.RevertContext ctx);
}