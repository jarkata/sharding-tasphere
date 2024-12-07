// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/sqlserver/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/SQLServerStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLServerStatementParser}.
 */
public interface SQLServerStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SQLServerStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SQLServerStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(SQLServerStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(SQLServerStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(SQLServerStatementParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(SQLServerStatementParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setImplicitTransactions}.
	 * @param ctx the parse tree
	 */
	void enterSetImplicitTransactions(SQLServerStatementParser.SetImplicitTransactionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setImplicitTransactions}.
	 * @param ctx the parse tree
	 */
	void exitSetImplicitTransactions(SQLServerStatementParser.SetImplicitTransactionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#implicitTransactionsValue}.
	 * @param ctx the parse tree
	 */
	void enterImplicitTransactionsValue(SQLServerStatementParser.ImplicitTransactionsValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#implicitTransactionsValue}.
	 * @param ctx the parse tree
	 */
	void exitImplicitTransactionsValue(SQLServerStatementParser.ImplicitTransactionsValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(SQLServerStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(SQLServerStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#beginDistributedTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginDistributedTransaction(SQLServerStatementParser.BeginDistributedTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#beginDistributedTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginDistributedTransaction(SQLServerStatementParser.BeginDistributedTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(SQLServerStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(SQLServerStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void enterCommitWork(SQLServerStatementParser.CommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void exitCommitWork(SQLServerStatementParser.CommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(SQLServerStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(SQLServerStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterRollbackWork(SQLServerStatementParser.RollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitRollbackWork(SQLServerStatementParser.RollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(SQLServerStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(SQLServerStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(SQLServerStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(SQLServerStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(SQLServerStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(SQLServerStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(SQLServerStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(SQLServerStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(SQLServerStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(SQLServerStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(SQLServerStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(SQLServerStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(SQLServerStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(SQLServerStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(SQLServerStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(SQLServerStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(SQLServerStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(SQLServerStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(SQLServerStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(SQLServerStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQLServerStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQLServerStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#regularIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterRegularIdentifier(SQLServerStatementParser.RegularIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#regularIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitRegularIdentifier(SQLServerStatementParser.RegularIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#delimitedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDelimitedIdentifier(SQLServerStatementParser.DelimitedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#delimitedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDelimitedIdentifier(SQLServerStatementParser.DelimitedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(SQLServerStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(SQLServerStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(SQLServerStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(SQLServerStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQLServerStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQLServerStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SQLServerStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SQLServerStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(SQLServerStatementParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(SQLServerStatementParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(SQLServerStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(SQLServerStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(SQLServerStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(SQLServerStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#sequenceName}.
	 * @param ctx the parse tree
	 */
	void enterSequenceName(SQLServerStatementParser.SequenceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#sequenceName}.
	 * @param ctx the parse tree
	 */
	void exitSequenceName(SQLServerStatementParser.SequenceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLServerStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLServerStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#queueName}.
	 * @param ctx the parse tree
	 */
	void enterQueueName(SQLServerStatementParser.QueueNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#queueName}.
	 * @param ctx the parse tree
	 */
	void exitQueueName(SQLServerStatementParser.QueueNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#contractName}.
	 * @param ctx the parse tree
	 */
	void enterContractName(SQLServerStatementParser.ContractNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#contractName}.
	 * @param ctx the parse tree
	 */
	void exitContractName(SQLServerStatementParser.ContractNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceName}.
	 * @param ctx the parse tree
	 */
	void enterServiceName(SQLServerStatementParser.ServiceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceName}.
	 * @param ctx the parse tree
	 */
	void exitServiceName(SQLServerStatementParser.ServiceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLServerStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLServerStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#scriptVariableName}.
	 * @param ctx the parse tree
	 */
	void enterScriptVariableName(SQLServerStatementParser.ScriptVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#scriptVariableName}.
	 * @param ctx the parse tree
	 */
	void exitScriptVariableName(SQLServerStatementParser.ScriptVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(SQLServerStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(SQLServerStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLServerStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLServerStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(SQLServerStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(SQLServerStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnNamesWithSort}.
	 * @param ctx the parse tree
	 */
	void enterColumnNamesWithSort(SQLServerStatementParser.ColumnNamesWithSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnNamesWithSort}.
	 * @param ctx the parse tree
	 */
	void exitColumnNamesWithSort(SQLServerStatementParser.ColumnNamesWithSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(SQLServerStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(SQLServerStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(SQLServerStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(SQLServerStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(SQLServerStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(SQLServerStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(SQLServerStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(SQLServerStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SQLServerStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SQLServerStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(SQLServerStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(SQLServerStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(SQLServerStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(SQLServerStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLServerStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLServerStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(SQLServerStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(SQLServerStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(SQLServerStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(SQLServerStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#distinctFrom}.
	 * @param ctx the parse tree
	 */
	void enterDistinctFrom(SQLServerStatementParser.DistinctFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#distinctFrom}.
	 * @param ctx the parse tree
	 */
	void exitDistinctFrom(SQLServerStatementParser.DistinctFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(SQLServerStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(SQLServerStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(SQLServerStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(SQLServerStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SQLServerStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SQLServerStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SQLServerStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SQLServerStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(SQLServerStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(SQLServerStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(SQLServerStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(SQLServerStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SQLServerStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SQLServerStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(SQLServerStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(SQLServerStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(SQLServerStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(SQLServerStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(SQLServerStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(SQLServerStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(SQLServerStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(SQLServerStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(SQLServerStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(SQLServerStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#graphFunction}.
	 * @param ctx the parse tree
	 */
	void enterGraphFunction(SQLServerStatementParser.GraphFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#graphFunction}.
	 * @param ctx the parse tree
	 */
	void exitGraphFunction(SQLServerStatementParser.GraphFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#graphAggFunction}.
	 * @param ctx the parse tree
	 */
	void enterGraphAggFunction(SQLServerStatementParser.GraphAggFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#graphAggFunction}.
	 * @param ctx the parse tree
	 */
	void exitGraphAggFunction(SQLServerStatementParser.GraphAggFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#graphAggFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterGraphAggFunctionName(SQLServerStatementParser.GraphAggFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#graphAggFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitGraphAggFunctionName(SQLServerStatementParser.GraphAggFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#rowNumberFunction}.
	 * @param ctx the parse tree
	 */
	void enterRowNumberFunction(SQLServerStatementParser.RowNumberFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#rowNumberFunction}.
	 * @param ctx the parse tree
	 */
	void exitRowNumberFunction(SQLServerStatementParser.RowNumberFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#openDatasourceFunction}.
	 * @param ctx the parse tree
	 */
	void enterOpenDatasourceFunction(SQLServerStatementParser.OpenDatasourceFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#openDatasourceFunction}.
	 * @param ctx the parse tree
	 */
	void exitOpenDatasourceFunction(SQLServerStatementParser.OpenDatasourceFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#approxFunction}.
	 * @param ctx the parse tree
	 */
	void enterApproxFunction(SQLServerStatementParser.ApproxFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#approxFunction}.
	 * @param ctx the parse tree
	 */
	void exitApproxFunction(SQLServerStatementParser.ApproxFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#conversionFunction}.
	 * @param ctx the parse tree
	 */
	void enterConversionFunction(SQLServerStatementParser.ConversionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#conversionFunction}.
	 * @param ctx the parse tree
	 */
	void exitConversionFunction(SQLServerStatementParser.ConversionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(SQLServerStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(SQLServerStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(SQLServerStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(SQLServerStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunction(SQLServerStatementParser.JsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunction(SQLServerStatementParser.JsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#jsonObjectFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonObjectFunction(SQLServerStatementParser.JsonObjectFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#jsonObjectFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonObjectFunction(SQLServerStatementParser.JsonObjectFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#jsonArrayFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonArrayFunction(SQLServerStatementParser.JsonArrayFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#jsonArrayFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonArrayFunction(SQLServerStatementParser.JsonArrayFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#jsonKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonKeyValue(SQLServerStatementParser.JsonKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#jsonKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonKeyValue(SQLServerStatementParser.JsonKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#jsonNullClause}.
	 * @param ctx the parse tree
	 */
	void enterJsonNullClause(SQLServerStatementParser.JsonNullClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#jsonNullClause}.
	 * @param ctx the parse tree
	 */
	void exitJsonNullClause(SQLServerStatementParser.JsonNullClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(SQLServerStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(SQLServerStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#openJsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterOpenJsonFunction(SQLServerStatementParser.OpenJsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#openJsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitOpenJsonFunction(SQLServerStatementParser.OpenJsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#openJsonWithclause}.
	 * @param ctx the parse tree
	 */
	void enterOpenJsonWithclause(SQLServerStatementParser.OpenJsonWithclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#openJsonWithclause}.
	 * @param ctx the parse tree
	 */
	void exitOpenJsonWithclause(SQLServerStatementParser.OpenJsonWithclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#jsonColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterJsonColumnDefinition(SQLServerStatementParser.JsonColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#jsonColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitJsonColumnDefinition(SQLServerStatementParser.JsonColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#openRowSetFunction}.
	 * @param ctx the parse tree
	 */
	void enterOpenRowSetFunction(SQLServerStatementParser.OpenRowSetFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#openRowSetFunction}.
	 * @param ctx the parse tree
	 */
	void exitOpenRowSetFunction(SQLServerStatementParser.OpenRowSetFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#openQueryFunction}.
	 * @param ctx the parse tree
	 */
	void enterOpenQueryFunction(SQLServerStatementParser.OpenQueryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#openQueryFunction}.
	 * @param ctx the parse tree
	 */
	void exitOpenQueryFunction(SQLServerStatementParser.OpenQueryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#rowSetFunction}.
	 * @param ctx the parse tree
	 */
	void enterRowSetFunction(SQLServerStatementParser.RowSetFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#rowSetFunction}.
	 * @param ctx the parse tree
	 */
	void exitRowSetFunction(SQLServerStatementParser.RowSetFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(SQLServerStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(SQLServerStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(SQLServerStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(SQLServerStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SQLServerStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SQLServerStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(SQLServerStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(SQLServerStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(SQLServerStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(SQLServerStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 */
	void enterPrivateExprOfDb(SQLServerStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 */
	void exitPrivateExprOfDb(SQLServerStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQLServerStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQLServerStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(SQLServerStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(SQLServerStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SQLServerStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SQLServerStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(SQLServerStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(SQLServerStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#atTimeZoneExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeZoneExpr(SQLServerStatementParser.AtTimeZoneExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#atTimeZoneExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeZoneExpr(SQLServerStatementParser.AtTimeZoneExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(SQLServerStatementParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(SQLServerStatementParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#convertExpr}.
	 * @param ctx the parse tree
	 */
	void enterConvertExpr(SQLServerStatementParser.ConvertExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#convertExpr}.
	 * @param ctx the parse tree
	 */
	void exitConvertExpr(SQLServerStatementParser.ConvertExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(SQLServerStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(SQLServerStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(SQLServerStatementParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(SQLServerStatementParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(SQLServerStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(SQLServerStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(SQLServerStatementParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(SQLServerStatementParser.PartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#rowRangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRowRangeClause(SQLServerStatementParser.RowRangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#rowRangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRowRangeClause(SQLServerStatementParser.RowRangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameExtent}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameExtent(SQLServerStatementParser.WindowFrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameExtent}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameExtent(SQLServerStatementParser.WindowFrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameBetween}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameBetween(SQLServerStatementParser.WindowFrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameBetween}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameBetween(SQLServerStatementParser.WindowFrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameBound}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameBound(SQLServerStatementParser.WindowFrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameBound}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameBound(SQLServerStatementParser.WindowFrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFramePreceding}.
	 * @param ctx the parse tree
	 */
	void enterWindowFramePreceding(SQLServerStatementParser.WindowFramePrecedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFramePreceding}.
	 * @param ctx the parse tree
	 */
	void exitWindowFramePreceding(SQLServerStatementParser.WindowFramePrecedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameFollowing}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameFollowing(SQLServerStatementParser.WindowFrameFollowingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameFollowing}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameFollowing(SQLServerStatementParser.WindowFrameFollowingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnNameWithSort}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameWithSort(SQLServerStatementParser.ColumnNameWithSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnNameWithSort}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameWithSort(SQLServerStatementParser.ColumnNameWithSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(SQLServerStatementParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(SQLServerStatementParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#compressionOption}.
	 * @param ctx the parse tree
	 */
	void enterCompressionOption(SQLServerStatementParser.CompressionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#compressionOption}.
	 * @param ctx the parse tree
	 */
	void exitCompressionOption(SQLServerStatementParser.CompressionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqTime}.
	 * @param ctx the parse tree
	 */
	void enterEqTime(SQLServerStatementParser.EqTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqTime}.
	 * @param ctx the parse tree
	 */
	void exitEqTime(SQLServerStatementParser.EqTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqOnOffOption}.
	 * @param ctx the parse tree
	 */
	void enterEqOnOffOption(SQLServerStatementParser.EqOnOffOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqOnOffOption}.
	 * @param ctx the parse tree
	 */
	void exitEqOnOffOption(SQLServerStatementParser.EqOnOffOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqKey}.
	 * @param ctx the parse tree
	 */
	void enterEqKey(SQLServerStatementParser.EqKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqKey}.
	 * @param ctx the parse tree
	 */
	void exitEqKey(SQLServerStatementParser.EqKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqOnOff}.
	 * @param ctx the parse tree
	 */
	void enterEqOnOff(SQLServerStatementParser.EqOnOffContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqOnOff}.
	 * @param ctx the parse tree
	 */
	void exitEqOnOff(SQLServerStatementParser.EqOnOffContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onPartitionClause}.
	 * @param ctx the parse tree
	 */
	void enterOnPartitionClause(SQLServerStatementParser.OnPartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onPartitionClause}.
	 * @param ctx the parse tree
	 */
	void exitOnPartitionClause(SQLServerStatementParser.OnPartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionExpressions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpressions(SQLServerStatementParser.PartitionExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionExpressions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpressions(SQLServerStatementParser.PartitionExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpression(SQLServerStatementParser.PartitionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpression(SQLServerStatementParser.PartitionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#numberRange}.
	 * @param ctx the parse tree
	 */
	void enterNumberRange(SQLServerStatementParser.NumberRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#numberRange}.
	 * @param ctx the parse tree
	 */
	void exitNumberRange(SQLServerStatementParser.NumberRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#lowPriorityLockWait}.
	 * @param ctx the parse tree
	 */
	void enterLowPriorityLockWait(SQLServerStatementParser.LowPriorityLockWaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#lowPriorityLockWait}.
	 * @param ctx the parse tree
	 */
	void exitLowPriorityLockWait(SQLServerStatementParser.LowPriorityLockWaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onLowPriorLockWait}.
	 * @param ctx the parse tree
	 */
	void enterOnLowPriorLockWait(SQLServerStatementParser.OnLowPriorLockWaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onLowPriorLockWait}.
	 * @param ctx the parse tree
	 */
	void exitOnLowPriorLockWait(SQLServerStatementParser.OnLowPriorLockWaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier(SQLServerStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier(SQLServerStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifiers(SQLServerStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifiers(SQLServerStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#matchNone}.
	 * @param ctx the parse tree
	 */
	void enterMatchNone(SQLServerStatementParser.MatchNoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#matchNone}.
	 * @param ctx the parse tree
	 */
	void exitMatchNone(SQLServerStatementParser.MatchNoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(SQLServerStatementParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(SQLServerStatementParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#executeAsClause}.
	 * @param ctx the parse tree
	 */
	void enterExecuteAsClause(SQLServerStatementParser.ExecuteAsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#executeAsClause}.
	 * @param ctx the parse tree
	 */
	void exitExecuteAsClause(SQLServerStatementParser.ExecuteAsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#transactionName}.
	 * @param ctx the parse tree
	 */
	void enterTransactionName(SQLServerStatementParser.TransactionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#transactionName}.
	 * @param ctx the parse tree
	 */
	void exitTransactionName(SQLServerStatementParser.TransactionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#transactionVariableName}.
	 * @param ctx the parse tree
	 */
	void enterTransactionVariableName(SQLServerStatementParser.TransactionVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#transactionVariableName}.
	 * @param ctx the parse tree
	 */
	void exitTransactionVariableName(SQLServerStatementParser.TransactionVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#savepointName}.
	 * @param ctx the parse tree
	 */
	void enterSavepointName(SQLServerStatementParser.SavepointNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#savepointName}.
	 * @param ctx the parse tree
	 */
	void exitSavepointName(SQLServerStatementParser.SavepointNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#savepointVariableName}.
	 * @param ctx the parse tree
	 */
	void enterSavepointVariableName(SQLServerStatementParser.SavepointVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#savepointVariableName}.
	 * @param ctx the parse tree
	 */
	void exitSavepointVariableName(SQLServerStatementParser.SavepointVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#entityType}.
	 * @param ctx the parse tree
	 */
	void enterEntityType(SQLServerStatementParser.EntityTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#entityType}.
	 * @param ctx the parse tree
	 */
	void exitEntityType(SQLServerStatementParser.EntityTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(SQLServerStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(SQLServerStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableHintLimited}.
	 * @param ctx the parse tree
	 */
	void enterTableHintLimited(SQLServerStatementParser.TableHintLimitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableHintLimited}.
	 * @param ctx the parse tree
	 */
	void exitTableHintLimited(SQLServerStatementParser.TableHintLimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(SQLServerStatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(SQLServerStatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#simpleMatch}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMatch(SQLServerStatementParser.SimpleMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#simpleMatch}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMatch(SQLServerStatementParser.SimpleMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#simpleMatchClause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMatchClause(SQLServerStatementParser.SimpleMatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#simpleMatchClause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMatchClause(SQLServerStatementParser.SimpleMatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#lastNode}.
	 * @param ctx the parse tree
	 */
	void enterLastNode(SQLServerStatementParser.LastNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#lastNode}.
	 * @param ctx the parse tree
	 */
	void exitLastNode(SQLServerStatementParser.LastNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#arbitratyLengthMatch}.
	 * @param ctx the parse tree
	 */
	void enterArbitratyLengthMatch(SQLServerStatementParser.ArbitratyLengthMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#arbitratyLengthMatch}.
	 * @param ctx the parse tree
	 */
	void exitArbitratyLengthMatch(SQLServerStatementParser.ArbitratyLengthMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#arbitraryLength}.
	 * @param ctx the parse tree
	 */
	void enterArbitraryLength(SQLServerStatementParser.ArbitraryLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#arbitraryLength}.
	 * @param ctx the parse tree
	 */
	void exitArbitraryLength(SQLServerStatementParser.ArbitraryLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#arbitraryLengthClause}.
	 * @param ctx the parse tree
	 */
	void enterArbitraryLengthClause(SQLServerStatementParser.ArbitraryLengthClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#arbitraryLengthClause}.
	 * @param ctx the parse tree
	 */
	void exitArbitraryLengthClause(SQLServerStatementParser.ArbitraryLengthClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#edgeNodeAl}.
	 * @param ctx the parse tree
	 */
	void enterEdgeNodeAl(SQLServerStatementParser.EdgeNodeAlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#edgeNodeAl}.
	 * @param ctx the parse tree
	 */
	void exitEdgeNodeAl(SQLServerStatementParser.EdgeNodeAlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#edgeAliasPath}.
	 * @param ctx the parse tree
	 */
	void enterEdgeAliasPath(SQLServerStatementParser.EdgeAliasPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#edgeAliasPath}.
	 * @param ctx the parse tree
	 */
	void exitEdgeAliasPath(SQLServerStatementParser.EdgeAliasPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#outEdgePath}.
	 * @param ctx the parse tree
	 */
	void enterOutEdgePath(SQLServerStatementParser.OutEdgePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#outEdgePath}.
	 * @param ctx the parse tree
	 */
	void exitOutEdgePath(SQLServerStatementParser.OutEdgePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#inEdgePath}.
	 * @param ctx the parse tree
	 */
	void enterInEdgePath(SQLServerStatementParser.InEdgePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#inEdgePath}.
	 * @param ctx the parse tree
	 */
	void exitInEdgePath(SQLServerStatementParser.InEdgePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alPatternQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterAlPatternQuantifier(SQLServerStatementParser.AlPatternQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alPatternQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitAlPatternQuantifier(SQLServerStatementParser.AlPatternQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#nodeAlias}.
	 * @param ctx the parse tree
	 */
	void enterNodeAlias(SQLServerStatementParser.NodeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#nodeAlias}.
	 * @param ctx the parse tree
	 */
	void exitNodeAlias(SQLServerStatementParser.NodeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#edgeAlias}.
	 * @param ctx the parse tree
	 */
	void enterEdgeAlias(SQLServerStatementParser.EdgeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#edgeAlias}.
	 * @param ctx the parse tree
	 */
	void exitEdgeAlias(SQLServerStatementParser.EdgeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(SQLServerStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(SQLServerStatementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SQLServerStatementParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SQLServerStatementParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStatement(SQLServerStatementParser.ExplainableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStatement(SQLServerStatementParser.ExplainableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SQLServerStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SQLServerStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTableClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClause(SQLServerStatementParser.CreateTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTableClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClause(SQLServerStatementParser.CreateTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(SQLServerStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(SQLServerStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SQLServerStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SQLServerStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SQLServerStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SQLServerStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(SQLServerStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(SQLServerStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SQLServerStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SQLServerStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(SQLServerStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(SQLServerStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequence(SQLServerStatementParser.CreateSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequence(SQLServerStatementParser.CreateSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createService}.
	 * @param ctx the parse tree
	 */
	void enterCreateService(SQLServerStatementParser.CreateServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createService}.
	 * @param ctx the parse tree
	 */
	void exitCreateService(SQLServerStatementParser.CreateServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchema(SQLServerStatementParser.CreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchema(SQLServerStatementParser.CreateSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SQLServerStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SQLServerStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(SQLServerStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(SQLServerStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(SQLServerStatementParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(SQLServerStatementParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(SQLServerStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(SQLServerStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(SQLServerStatementParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(SQLServerStatementParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(SQLServerStatementParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(SQLServerStatementParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterTrigger(SQLServerStatementParser.AlterTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterTrigger(SQLServerStatementParser.AlterTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequence(SQLServerStatementParser.AlterSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequence(SQLServerStatementParser.AlterSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterService}.
	 * @param ctx the parse tree
	 */
	void enterAlterService(SQLServerStatementParser.AlterServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterService}.
	 * @param ctx the parse tree
	 */
	void exitAlterService(SQLServerStatementParser.AlterServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void enterAlterSchema(SQLServerStatementParser.AlterSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void exitAlterSchema(SQLServerStatementParser.AlterSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#securableName}.
	 * @param ctx the parse tree
	 */
	void enterSecurableName(SQLServerStatementParser.SecurableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#securableName}.
	 * @param ctx the parse tree
	 */
	void exitSecurableName(SQLServerStatementParser.SecurableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SQLServerStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SQLServerStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(SQLServerStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(SQLServerStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SQLServerStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SQLServerStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SQLServerStatementParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SQLServerStatementParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(SQLServerStatementParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(SQLServerStatementParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SQLServerStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SQLServerStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(SQLServerStatementParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(SQLServerStatementParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 */
	void enterDropSequence(SQLServerStatementParser.DropSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 */
	void exitDropSequence(SQLServerStatementParser.DropSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropService}.
	 * @param ctx the parse tree
	 */
	void enterDropService(SQLServerStatementParser.DropServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropService}.
	 * @param ctx the parse tree
	 */
	void exitDropService(SQLServerStatementParser.DropServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void enterDropSchema(SQLServerStatementParser.DropSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void exitDropSchema(SQLServerStatementParser.DropSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SQLServerStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SQLServerStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#updateStatistics}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatistics(SQLServerStatementParser.UpdateStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#updateStatistics}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatistics(SQLServerStatementParser.UpdateStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#statisticsWithClause}.
	 * @param ctx the parse tree
	 */
	void enterStatisticsWithClause(SQLServerStatementParser.StatisticsWithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#statisticsWithClause}.
	 * @param ctx the parse tree
	 */
	void exitStatisticsWithClause(SQLServerStatementParser.StatisticsWithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#sampleOption}.
	 * @param ctx the parse tree
	 */
	void enterSampleOption(SQLServerStatementParser.SampleOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#sampleOption}.
	 * @param ctx the parse tree
	 */
	void exitSampleOption(SQLServerStatementParser.SampleOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#statisticsOptions}.
	 * @param ctx the parse tree
	 */
	void enterStatisticsOptions(SQLServerStatementParser.StatisticsOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#statisticsOptions}.
	 * @param ctx the parse tree
	 */
	void exitStatisticsOptions(SQLServerStatementParser.StatisticsOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#statisticsOption}.
	 * @param ctx the parse tree
	 */
	void enterStatisticsOption(SQLServerStatementParser.StatisticsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#statisticsOption}.
	 * @param ctx the parse tree
	 */
	void exitStatisticsOption(SQLServerStatementParser.StatisticsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileTableClause}.
	 * @param ctx the parse tree
	 */
	void enterFileTableClause(SQLServerStatementParser.FileTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileTableClause}.
	 * @param ctx the parse tree
	 */
	void exitFileTableClause(SQLServerStatementParser.FileTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(SQLServerStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(SQLServerStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTableDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableDefinitions(SQLServerStatementParser.CreateTableDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTableDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableDefinitions(SQLServerStatementParser.CreateTableDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableDefinition(SQLServerStatementParser.CreateTableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableDefinition(SQLServerStatementParser.CreateTableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQLServerStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQLServerStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinitionOption(SQLServerStatementParser.ColumnDefinitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinitionOption(SQLServerStatementParser.ColumnDefinitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#encryptedOptions}.
	 * @param ctx the parse tree
	 */
	void enterEncryptedOptions(SQLServerStatementParser.EncryptedOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#encryptedOptions}.
	 * @param ctx the parse tree
	 */
	void exitEncryptedOptions(SQLServerStatementParser.EncryptedOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(SQLServerStatementParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(SQLServerStatementParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#computedColumnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterComputedColumnConstraint(SQLServerStatementParser.ComputedColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#computedColumnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitComputedColumnConstraint(SQLServerStatementParser.ComputedColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#computedColumnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterComputedColumnForeignKeyConstraint(SQLServerStatementParser.ComputedColumnForeignKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#computedColumnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitComputedColumnForeignKeyConstraint(SQLServerStatementParser.ComputedColumnForeignKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#computedColumnForeignKeyOnAction}.
	 * @param ctx the parse tree
	 */
	void enterComputedColumnForeignKeyOnAction(SQLServerStatementParser.ComputedColumnForeignKeyOnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#computedColumnForeignKeyOnAction}.
	 * @param ctx the parse tree
	 */
	void exitComputedColumnForeignKeyOnAction(SQLServerStatementParser.ComputedColumnForeignKeyOnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyConstraint(SQLServerStatementParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyConstraint(SQLServerStatementParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterDiskTablePrimaryKeyConstraintOption(SQLServerStatementParser.DiskTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitDiskTablePrimaryKeyConstraintOption(SQLServerStatementParser.DiskTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#clusterOption}.
	 * @param ctx the parse tree
	 */
	void enterClusterOption(SQLServerStatementParser.ClusterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#clusterOption}.
	 * @param ctx the parse tree
	 */
	void exitClusterOption(SQLServerStatementParser.ClusterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyWithClause}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyWithClause(SQLServerStatementParser.PrimaryKeyWithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyWithClause}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyWithClause(SQLServerStatementParser.PrimaryKeyWithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyOnClause}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyOnClause(SQLServerStatementParser.PrimaryKeyOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyOnClause}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyOnClause(SQLServerStatementParser.PrimaryKeyOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onSchemaColumn}.
	 * @param ctx the parse tree
	 */
	void enterOnSchemaColumn(SQLServerStatementParser.OnSchemaColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onSchemaColumn}.
	 * @param ctx the parse tree
	 */
	void exitOnSchemaColumn(SQLServerStatementParser.OnSchemaColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onFileGroup}.
	 * @param ctx the parse tree
	 */
	void enterOnFileGroup(SQLServerStatementParser.OnFileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onFileGroup}.
	 * @param ctx the parse tree
	 */
	void exitOnFileGroup(SQLServerStatementParser.OnFileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onString}.
	 * @param ctx the parse tree
	 */
	void enterOnString(SQLServerStatementParser.OnStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onString}.
	 * @param ctx the parse tree
	 */
	void exitOnString(SQLServerStatementParser.OnStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterMemoryTablePrimaryKeyConstraintOption(SQLServerStatementParser.MemoryTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitMemoryTablePrimaryKeyConstraintOption(SQLServerStatementParser.MemoryTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withBucket}.
	 * @param ctx the parse tree
	 */
	void enterWithBucket(SQLServerStatementParser.WithBucketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withBucket}.
	 * @param ctx the parse tree
	 */
	void exitWithBucket(SQLServerStatementParser.WithBucketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnForeignKeyConstraint(SQLServerStatementParser.ColumnForeignKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnForeignKeyConstraint(SQLServerStatementParser.ColumnForeignKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#foreignKeyOnAction}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOnAction(SQLServerStatementParser.ForeignKeyOnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOnAction}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOnAction(SQLServerStatementParser.ForeignKeyOnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#foreignKeyOn}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOn(SQLServerStatementParser.ForeignKeyOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOn}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOn(SQLServerStatementParser.ForeignKeyOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraint(SQLServerStatementParser.CheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraint(SQLServerStatementParser.CheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnIndex}.
	 * @param ctx the parse tree
	 */
	void enterColumnIndex(SQLServerStatementParser.ColumnIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnIndex}.
	 * @param ctx the parse tree
	 */
	void exitColumnIndex(SQLServerStatementParser.ColumnIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withIndexOption}.
	 * @param ctx the parse tree
	 */
	void enterWithIndexOption(SQLServerStatementParser.WithIndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withIndexOption}.
	 * @param ctx the parse tree
	 */
	void exitWithIndexOption(SQLServerStatementParser.WithIndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexOnClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexOnClause(SQLServerStatementParser.IndexOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexOnClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexOnClause(SQLServerStatementParser.IndexOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onDefault}.
	 * @param ctx the parse tree
	 */
	void enterOnDefault(SQLServerStatementParser.OnDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onDefault}.
	 * @param ctx the parse tree
	 */
	void exitOnDefault(SQLServerStatementParser.OnDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileStreamOn}.
	 * @param ctx the parse tree
	 */
	void enterFileStreamOn(SQLServerStatementParser.FileStreamOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileStreamOn}.
	 * @param ctx the parse tree
	 */
	void exitFileStreamOn(SQLServerStatementParser.FileStreamOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnConstraints}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraints(SQLServerStatementParser.ColumnConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnConstraints}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraints(SQLServerStatementParser.ColumnConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComputedColumnDefinition(SQLServerStatementParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComputedColumnDefinition(SQLServerStatementParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnSetDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnSetDefinition(SQLServerStatementParser.ColumnSetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnSetDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnSetDefinition(SQLServerStatementParser.ColumnSetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(SQLServerStatementParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(SQLServerStatementParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#edgeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterEdgeConstraint(SQLServerStatementParser.EdgeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#edgeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitEdgeConstraint(SQLServerStatementParser.EdgeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#connectionClause}.
	 * @param ctx the parse tree
	 */
	void enterConnectionClause(SQLServerStatementParser.ConnectionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#connectionClause}.
	 * @param ctx the parse tree
	 */
	void exitConnectionClause(SQLServerStatementParser.ConnectionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tablePrimaryConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTablePrimaryConstraint(SQLServerStatementParser.TablePrimaryConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tablePrimaryConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTablePrimaryConstraint(SQLServerStatementParser.TablePrimaryConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyUnique}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyUnique(SQLServerStatementParser.PrimaryKeyUniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyUnique}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyUnique(SQLServerStatementParser.PrimaryKeyUniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterDiskTablePrimaryConstraintOption(SQLServerStatementParser.DiskTablePrimaryConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitDiskTablePrimaryConstraintOption(SQLServerStatementParser.DiskTablePrimaryConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterMemoryTablePrimaryConstraintOption(SQLServerStatementParser.MemoryTablePrimaryConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitMemoryTablePrimaryConstraintOption(SQLServerStatementParser.MemoryTablePrimaryConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#hashWithBucket}.
	 * @param ctx the parse tree
	 */
	void enterHashWithBucket(SQLServerStatementParser.HashWithBucketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#hashWithBucket}.
	 * @param ctx the parse tree
	 */
	void exitHashWithBucket(SQLServerStatementParser.HashWithBucketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableForeignKeyConstraint(SQLServerStatementParser.TableForeignKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableForeignKeyConstraint(SQLServerStatementParser.TableForeignKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableIndex}.
	 * @param ctx the parse tree
	 */
	void enterTableIndex(SQLServerStatementParser.TableIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableIndex}.
	 * @param ctx the parse tree
	 */
	void exitTableIndex(SQLServerStatementParser.TableIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexNameOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexNameOption(SQLServerStatementParser.IndexNameOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexNameOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexNameOption(SQLServerStatementParser.IndexNameOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexOptions}.
	 * @param ctx the parse tree
	 */
	void enterIndexOptions(SQLServerStatementParser.IndexOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexOptions}.
	 * @param ctx the parse tree
	 */
	void exitIndexOptions(SQLServerStatementParser.IndexOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void enterPeriodClause(SQLServerStatementParser.PeriodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void exitPeriodClause(SQLServerStatementParser.PeriodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionScheme}.
	 * @param ctx the parse tree
	 */
	void enterPartitionScheme(SQLServerStatementParser.PartitionSchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionScheme}.
	 * @param ctx the parse tree
	 */
	void exitPartitionScheme(SQLServerStatementParser.PartitionSchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileGroup}.
	 * @param ctx the parse tree
	 */
	void enterFileGroup(SQLServerStatementParser.FileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileGroup}.
	 * @param ctx the parse tree
	 */
	void exitFileGroup(SQLServerStatementParser.FileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(SQLServerStatementParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(SQLServerStatementParser.TableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOption(SQLServerStatementParser.TableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOption(SQLServerStatementParser.TableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataDelectionOption}.
	 * @param ctx the parse tree
	 */
	void enterDataDelectionOption(SQLServerStatementParser.DataDelectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataDelectionOption}.
	 * @param ctx the parse tree
	 */
	void exitDataDelectionOption(SQLServerStatementParser.DataDelectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableStretchOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableStretchOptions(SQLServerStatementParser.TableStretchOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableStretchOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableStretchOptions(SQLServerStatementParser.TableStretchOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableStretchOption}.
	 * @param ctx the parse tree
	 */
	void enterTableStretchOption(SQLServerStatementParser.TableStretchOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableStretchOption}.
	 * @param ctx the parse tree
	 */
	void exitTableStretchOption(SQLServerStatementParser.TableStretchOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#migrationState_}.
	 * @param ctx the parse tree
	 */
	void enterMigrationState_(SQLServerStatementParser.MigrationState_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#migrationState_}.
	 * @param ctx the parse tree
	 */
	void exitMigrationState_(SQLServerStatementParser.MigrationState_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableOperationOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOperationOption(SQLServerStatementParser.TableOperationOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableOperationOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOperationOption(SQLServerStatementParser.TableOperationOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#distributionOption}.
	 * @param ctx the parse tree
	 */
	void enterDistributionOption(SQLServerStatementParser.DistributionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#distributionOption}.
	 * @param ctx the parse tree
	 */
	void exitDistributionOption(SQLServerStatementParser.DistributionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataWareHouseTableOption}.
	 * @param ctx the parse tree
	 */
	void enterDataWareHouseTableOption(SQLServerStatementParser.DataWareHouseTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataWareHouseTableOption}.
	 * @param ctx the parse tree
	 */
	void exitDataWareHouseTableOption(SQLServerStatementParser.DataWareHouseTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataWareHousePartitionOption}.
	 * @param ctx the parse tree
	 */
	void enterDataWareHousePartitionOption(SQLServerStatementParser.DataWareHousePartitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataWareHousePartitionOption}.
	 * @param ctx the parse tree
	 */
	void exitDataWareHousePartitionOption(SQLServerStatementParser.DataWareHousePartitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification(SQLServerStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification(SQLServerStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(SQLServerStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(SQLServerStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(SQLServerStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(SQLServerStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(SQLServerStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(SQLServerStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterColumnOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnOperation(SQLServerStatementParser.AlterColumnOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterColumnOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnOperation(SQLServerStatementParser.AlterColumnOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAddOptions(SQLServerStatementParser.AlterColumnAddOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAddOptions(SQLServerStatementParser.AlterColumnAddOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAddOption(SQLServerStatementParser.AlterColumnAddOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAddOption(SQLServerStatementParser.AlterColumnAddOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#constraintForColumn}.
	 * @param ctx the parse tree
	 */
	void enterConstraintForColumn(SQLServerStatementParser.ConstraintForColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#constraintForColumn}.
	 * @param ctx the parse tree
	 */
	void exitConstraintForColumn(SQLServerStatementParser.ConstraintForColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#generatedColumnNamesClause}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnNamesClause(SQLServerStatementParser.GeneratedColumnNamesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNamesClause}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnNamesClause(SQLServerStatementParser.GeneratedColumnNamesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#generatedColumnNameClause}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnNameClause(SQLServerStatementParser.GeneratedColumnNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNameClause}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnNameClause(SQLServerStatementParser.GeneratedColumnNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#generatedColumnName}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnName(SQLServerStatementParser.GeneratedColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#generatedColumnName}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnName(SQLServerStatementParser.GeneratedColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterDrop}.
	 * @param ctx the parse tree
	 */
	void enterAlterDrop(SQLServerStatementParser.AlterDropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterDrop}.
	 * @param ctx the parse tree
	 */
	void exitAlterDrop(SQLServerStatementParser.AlterDropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableDropConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropConstraint(SQLServerStatementParser.AlterTableDropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableDropConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropConstraint(SQLServerStatementParser.AlterTableDropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropConstraintName}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintName(SQLServerStatementParser.DropConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropConstraintName}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintName(SQLServerStatementParser.DropConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropConstraintWithClause}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintWithClause(SQLServerStatementParser.DropConstraintWithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropConstraintWithClause}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintWithClause(SQLServerStatementParser.DropConstraintWithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintOption(SQLServerStatementParser.DropConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintOption(SQLServerStatementParser.DropConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onOffOption}.
	 * @param ctx the parse tree
	 */
	void enterOnOffOption(SQLServerStatementParser.OnOffOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onOffOption}.
	 * @param ctx the parse tree
	 */
	void exitOnOffOption(SQLServerStatementParser.OnOffOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(SQLServerStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(SQLServerStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexSpecification(SQLServerStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexSpecification(SQLServerStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterCheckConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAlterCheckConstraint(SQLServerStatementParser.AlterCheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterCheckConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAlterCheckConstraint(SQLServerStatementParser.AlterCheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableTrigger(SQLServerStatementParser.AlterTableTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableTrigger(SQLServerStatementParser.AlterTableTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSwitch}.
	 * @param ctx the parse tree
	 */
	void enterAlterSwitch(SQLServerStatementParser.AlterSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSwitch}.
	 * @param ctx the parse tree
	 */
	void exitAlterSwitch(SQLServerStatementParser.AlterSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSet}.
	 * @param ctx the parse tree
	 */
	void enterAlterSet(SQLServerStatementParser.AlterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSet}.
	 * @param ctx the parse tree
	 */
	void exitAlterSet(SQLServerStatementParser.AlterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setFileStreamClause}.
	 * @param ctx the parse tree
	 */
	void enterSetFileStreamClause(SQLServerStatementParser.SetFileStreamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setFileStreamClause}.
	 * @param ctx the parse tree
	 */
	void exitSetFileStreamClause(SQLServerStatementParser.SetFileStreamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setSystemVersionClause}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVersionClause(SQLServerStatementParser.SetSystemVersionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setSystemVersionClause}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVersionClause(SQLServerStatementParser.SetSystemVersionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSetOnClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterSetOnClause(SQLServerStatementParser.AlterSetOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSetOnClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterSetOnClause(SQLServerStatementParser.AlterSetOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataConsistencyCheckClause}.
	 * @param ctx the parse tree
	 */
	void enterDataConsistencyCheckClause(SQLServerStatementParser.DataConsistencyCheckClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataConsistencyCheckClause}.
	 * @param ctx the parse tree
	 */
	void exitDataConsistencyCheckClause(SQLServerStatementParser.DataConsistencyCheckClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriodClause}.
	 * @param ctx the parse tree
	 */
	void enterHistoryRetentionPeriodClause(SQLServerStatementParser.HistoryRetentionPeriodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriodClause}.
	 * @param ctx the parse tree
	 */
	void exitHistoryRetentionPeriodClause(SQLServerStatementParser.HistoryRetentionPeriodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriod}.
	 * @param ctx the parse tree
	 */
	void enterHistoryRetentionPeriod(SQLServerStatementParser.HistoryRetentionPeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriod}.
	 * @param ctx the parse tree
	 */
	void exitHistoryRetentionPeriod(SQLServerStatementParser.HistoryRetentionPeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableTableIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableTableIndex(SQLServerStatementParser.AlterTableTableIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableTableIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableTableIndex(SQLServerStatementParser.AlterTableTableIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexWithName}.
	 * @param ctx the parse tree
	 */
	void enterIndexWithName(SQLServerStatementParser.IndexWithNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexWithName}.
	 * @param ctx the parse tree
	 */
	void exitIndexWithName(SQLServerStatementParser.IndexWithNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexNonClusterClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexNonClusterClause(SQLServerStatementParser.IndexNonClusterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexNonClusterClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexNonClusterClause(SQLServerStatementParser.IndexNonClusterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableIndexOnClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableIndexOnClause(SQLServerStatementParser.AlterTableIndexOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableIndexOnClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableIndexOnClause(SQLServerStatementParser.AlterTableIndexOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexClusterClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexClusterClause(SQLServerStatementParser.IndexClusterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexClusterClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexClusterClause(SQLServerStatementParser.IndexClusterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableOption(SQLServerStatementParser.AlterTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableOption(SQLServerStatementParser.AlterTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onHistoryTableClause}.
	 * @param ctx the parse tree
	 */
	void enterOnHistoryTableClause(SQLServerStatementParser.OnHistoryTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onHistoryTableClause}.
	 * @param ctx the parse tree
	 */
	void exitOnHistoryTableClause(SQLServerStatementParser.OnHistoryTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseClause(SQLServerStatementParser.CreateDatabaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseClause(SQLServerStatementParser.CreateDatabaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterFileDefinitionClause(SQLServerStatementParser.FileDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitFileDefinitionClause(SQLServerStatementParser.FileDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseOption}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseOption(SQLServerStatementParser.DatabaseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseOption}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseOption(SQLServerStatementParser.DatabaseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileStreamOption}.
	 * @param ctx the parse tree
	 */
	void enterFileStreamOption(SQLServerStatementParser.FileStreamOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileStreamOption}.
	 * @param ctx the parse tree
	 */
	void exitFileStreamOption(SQLServerStatementParser.FileStreamOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileSpec}.
	 * @param ctx the parse tree
	 */
	void enterFileSpec(SQLServerStatementParser.FileSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileSpec}.
	 * @param ctx the parse tree
	 */
	void exitFileSpec(SQLServerStatementParser.FileSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseFileSpecOption}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseFileSpecOption(SQLServerStatementParser.DatabaseFileSpecOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseFileSpecOption}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseFileSpecOption(SQLServerStatementParser.DatabaseFileSpecOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseFileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseFileGroup(SQLServerStatementParser.DatabaseFileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseFileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseFileGroup(SQLServerStatementParser.DatabaseFileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseFileGroupContains}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseFileGroupContains(SQLServerStatementParser.DatabaseFileGroupContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseFileGroupContains}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseFileGroupContains(SQLServerStatementParser.DatabaseFileGroupContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseLogOns}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseLogOns(SQLServerStatementParser.DatabaseLogOnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseLogOns}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseLogOns(SQLServerStatementParser.DatabaseLogOnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(SQLServerStatementParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(SQLServerStatementParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SQLServerStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SQLServerStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableVariable}.
	 * @param ctx the parse tree
	 */
	void enterTableVariable(SQLServerStatementParser.TableVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableVariable}.
	 * @param ctx the parse tree
	 */
	void exitTableVariable(SQLServerStatementParser.TableVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#variTableTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariTableTypeDefinition(SQLServerStatementParser.VariTableTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#variTableTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariTableTypeDefinition(SQLServerStatementParser.VariTableTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableVariableClause}.
	 * @param ctx the parse tree
	 */
	void enterTableVariableClause(SQLServerStatementParser.TableVariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableVariableClause}.
	 * @param ctx the parse tree
	 */
	void exitTableVariableClause(SQLServerStatementParser.TableVariableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#variableTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableTableColumnDefinition(SQLServerStatementParser.VariableTableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#variableTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableTableColumnDefinition(SQLServerStatementParser.VariableTableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#variableTableColumnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVariableTableColumnConstraint(SQLServerStatementParser.VariableTableColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#variableTableColumnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVariableTableColumnConstraint(SQLServerStatementParser.VariableTableColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#variableTableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVariableTableConstraint(SQLServerStatementParser.VariableTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#variableTableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVariableTableConstraint(SQLServerStatementParser.VariableTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(SQLServerStatementParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(SQLServerStatementParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setVariableClause}.
	 * @param ctx the parse tree
	 */
	void enterSetVariableClause(SQLServerStatementParser.SetVariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setVariableClause}.
	 * @param ctx the parse tree
	 */
	void exitSetVariableClause(SQLServerStatementParser.SetVariableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#cursorVariable}.
	 * @param ctx the parse tree
	 */
	void enterCursorVariable(SQLServerStatementParser.CursorVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#cursorVariable}.
	 * @param ctx the parse tree
	 */
	void exitCursorVariable(SQLServerStatementParser.CursorVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#cursorClause}.
	 * @param ctx the parse tree
	 */
	void enterCursorClause(SQLServerStatementParser.CursorClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#cursorClause}.
	 * @param ctx the parse tree
	 */
	void exitCursorClause(SQLServerStatementParser.CursorClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#compoundOperation}.
	 * @param ctx the parse tree
	 */
	void enterCompoundOperation(SQLServerStatementParser.CompoundOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#compoundOperation}.
	 * @param ctx the parse tree
	 */
	void exitCompoundOperation(SQLServerStatementParser.CompoundOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameters(SQLServerStatementParser.FuncParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameters(SQLServerStatementParser.FuncParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#funcReturns}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturns(SQLServerStatementParser.FuncReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#funcReturns}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturns(SQLServerStatementParser.FuncReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#funcMutiReturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncMutiReturn(SQLServerStatementParser.FuncMutiReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#funcMutiReturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncMutiReturn(SQLServerStatementParser.FuncMutiReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#funcInlineReturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncInlineReturn(SQLServerStatementParser.FuncInlineReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#funcInlineReturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncInlineReturn(SQLServerStatementParser.FuncInlineReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#funcScalarReturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncScalarReturn(SQLServerStatementParser.FuncScalarReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#funcScalarReturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncScalarReturn(SQLServerStatementParser.FuncScalarReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableTypeDefinition(SQLServerStatementParser.TableTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableTypeDefinition(SQLServerStatementParser.TableTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(SQLServerStatementParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(SQLServerStatementParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#functionOption}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOption(SQLServerStatementParser.FunctionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#functionOption}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOption(SQLServerStatementParser.FunctionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#validStatement}.
	 * @param ctx the parse tree
	 */
	void enterValidStatement(SQLServerStatementParser.ValidStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#validStatement}.
	 * @param ctx the parse tree
	 */
	void exitValidStatement(SQLServerStatementParser.ValidStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#procParameters}.
	 * @param ctx the parse tree
	 */
	void enterProcParameters(SQLServerStatementParser.ProcParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#procParameters}.
	 * @param ctx the parse tree
	 */
	void exitProcParameters(SQLServerStatementParser.ProcParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#procParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcParameter(SQLServerStatementParser.ProcParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#procParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcParameter(SQLServerStatementParser.ProcParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createOrAlterProcClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateOrAlterProcClause(SQLServerStatementParser.CreateOrAlterProcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createOrAlterProcClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateOrAlterProcClause(SQLServerStatementParser.CreateOrAlterProcClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withCreateProcOption}.
	 * @param ctx the parse tree
	 */
	void enterWithCreateProcOption(SQLServerStatementParser.WithCreateProcOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withCreateProcOption}.
	 * @param ctx the parse tree
	 */
	void exitWithCreateProcOption(SQLServerStatementParser.WithCreateProcOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#procOption}.
	 * @param ctx the parse tree
	 */
	void enterProcOption(SQLServerStatementParser.ProcOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#procOption}.
	 * @param ctx the parse tree
	 */
	void exitProcOption(SQLServerStatementParser.ProcOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#procAsClause}.
	 * @param ctx the parse tree
	 */
	void enterProcAsClause(SQLServerStatementParser.ProcAsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#procAsClause}.
	 * @param ctx the parse tree
	 */
	void exitProcAsClause(SQLServerStatementParser.ProcAsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#procSetOption}.
	 * @param ctx the parse tree
	 */
	void enterProcSetOption(SQLServerStatementParser.ProcSetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#procSetOption}.
	 * @param ctx the parse tree
	 */
	void exitProcSetOption(SQLServerStatementParser.ProcSetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createOrAlterViewClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateOrAlterViewClause(SQLServerStatementParser.CreateOrAlterViewClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createOrAlterViewClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateOrAlterViewClause(SQLServerStatementParser.CreateOrAlterViewClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#viewAttribute}.
	 * @param ctx the parse tree
	 */
	void enterViewAttribute(SQLServerStatementParser.ViewAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#viewAttribute}.
	 * @param ctx the parse tree
	 */
	void exitViewAttribute(SQLServerStatementParser.ViewAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withCommonTableExpr}.
	 * @param ctx the parse tree
	 */
	void enterWithCommonTableExpr(SQLServerStatementParser.WithCommonTableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withCommonTableExpr}.
	 * @param ctx the parse tree
	 */
	void exitWithCommonTableExpr(SQLServerStatementParser.WithCommonTableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommonTableExpr(SQLServerStatementParser.CommonTableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommonTableExpr(SQLServerStatementParser.CommonTableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTriggerClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateTriggerClause(SQLServerStatementParser.CreateTriggerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTriggerClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateTriggerClause(SQLServerStatementParser.CreateTriggerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dmlTriggerOption}.
	 * @param ctx the parse tree
	 */
	void enterDmlTriggerOption(SQLServerStatementParser.DmlTriggerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dmlTriggerOption}.
	 * @param ctx the parse tree
	 */
	void exitDmlTriggerOption(SQLServerStatementParser.DmlTriggerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#methodSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodSpecifier(SQLServerStatementParser.MethodSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#methodSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodSpecifier(SQLServerStatementParser.MethodSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#triggerTarget}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTarget(SQLServerStatementParser.TriggerTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#triggerTarget}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTarget(SQLServerStatementParser.TriggerTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createOrAlterSequenceClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateOrAlterSequenceClause(SQLServerStatementParser.CreateOrAlterSequenceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createOrAlterSequenceClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateOrAlterSequenceClause(SQLServerStatementParser.CreateOrAlterSequenceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createIndexClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexClause(SQLServerStatementParser.CreateIndexClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createIndexClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexClause(SQLServerStatementParser.CreateIndexClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#filterPredicate}.
	 * @param ctx the parse tree
	 */
	void enterFilterPredicate(SQLServerStatementParser.FilterPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#filterPredicate}.
	 * @param ctx the parse tree
	 */
	void exitFilterPredicate(SQLServerStatementParser.FilterPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#conjunct}.
	 * @param ctx the parse tree
	 */
	void enterConjunct(SQLServerStatementParser.ConjunctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#conjunct}.
	 * @param ctx the parse tree
	 */
	void exitConjunct(SQLServerStatementParser.ConjunctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterIndexClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexClause(SQLServerStatementParser.AlterIndexClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterIndexClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexClause(SQLServerStatementParser.AlterIndexClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#relationalIndexOption}.
	 * @param ctx the parse tree
	 */
	void enterRelationalIndexOption(SQLServerStatementParser.RelationalIndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#relationalIndexOption}.
	 * @param ctx the parse tree
	 */
	void exitRelationalIndexOption(SQLServerStatementParser.RelationalIndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionNumberRange}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNumberRange(SQLServerStatementParser.PartitionNumberRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionNumberRange}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNumberRange(SQLServerStatementParser.PartitionNumberRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#reorganizeOption}.
	 * @param ctx the parse tree
	 */
	void enterReorganizeOption(SQLServerStatementParser.ReorganizeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#reorganizeOption}.
	 * @param ctx the parse tree
	 */
	void exitReorganizeOption(SQLServerStatementParser.ReorganizeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setIndexOption}.
	 * @param ctx the parse tree
	 */
	void enterSetIndexOption(SQLServerStatementParser.SetIndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setIndexOption}.
	 * @param ctx the parse tree
	 */
	void exitSetIndexOption(SQLServerStatementParser.SetIndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#resumableIndexOptions}.
	 * @param ctx the parse tree
	 */
	void enterResumableIndexOptions(SQLServerStatementParser.ResumableIndexOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#resumableIndexOptions}.
	 * @param ctx the parse tree
	 */
	void exitResumableIndexOptions(SQLServerStatementParser.ResumableIndexOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseClause(SQLServerStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseClause(SQLServerStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#addSecondaryOption}.
	 * @param ctx the parse tree
	 */
	void enterAddSecondaryOption(SQLServerStatementParser.AddSecondaryOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#addSecondaryOption}.
	 * @param ctx the parse tree
	 */
	void exitAddSecondaryOption(SQLServerStatementParser.AddSecondaryOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#editionOptions}.
	 * @param ctx the parse tree
	 */
	void enterEditionOptions(SQLServerStatementParser.EditionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#editionOptions}.
	 * @param ctx the parse tree
	 */
	void exitEditionOptions(SQLServerStatementParser.EditionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceObjective}.
	 * @param ctx the parse tree
	 */
	void enterServiceObjective(SQLServerStatementParser.ServiceObjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceObjective}.
	 * @param ctx the parse tree
	 */
	void exitServiceObjective(SQLServerStatementParser.ServiceObjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterDatabaseOptionSpec}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseOptionSpec(SQLServerStatementParser.AlterDatabaseOptionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterDatabaseOptionSpec}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseOptionSpec(SQLServerStatementParser.AlterDatabaseOptionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileAndFilegroupOptions}.
	 * @param ctx the parse tree
	 */
	void enterFileAndFilegroupOptions(SQLServerStatementParser.FileAndFilegroupOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileAndFilegroupOptions}.
	 * @param ctx the parse tree
	 */
	void exitFileAndFilegroupOptions(SQLServerStatementParser.FileAndFilegroupOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#addOrModifyFilegroups}.
	 * @param ctx the parse tree
	 */
	void enterAddOrModifyFilegroups(SQLServerStatementParser.AddOrModifyFilegroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#addOrModifyFilegroups}.
	 * @param ctx the parse tree
	 */
	void exitAddOrModifyFilegroups(SQLServerStatementParser.AddOrModifyFilegroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#filegroupUpdatabilityOption}.
	 * @param ctx the parse tree
	 */
	void enterFilegroupUpdatabilityOption(SQLServerStatementParser.FilegroupUpdatabilityOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#filegroupUpdatabilityOption}.
	 * @param ctx the parse tree
	 */
	void exitFilegroupUpdatabilityOption(SQLServerStatementParser.FilegroupUpdatabilityOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#addOrModifyFiles}.
	 * @param ctx the parse tree
	 */
	void enterAddOrModifyFiles(SQLServerStatementParser.AddOrModifyFilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#addOrModifyFiles}.
	 * @param ctx the parse tree
	 */
	void exitAddOrModifyFiles(SQLServerStatementParser.AddOrModifyFilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#acceleratedDatabaseRecovery}.
	 * @param ctx the parse tree
	 */
	void enterAcceleratedDatabaseRecovery(SQLServerStatementParser.AcceleratedDatabaseRecoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#acceleratedDatabaseRecovery}.
	 * @param ctx the parse tree
	 */
	void exitAcceleratedDatabaseRecovery(SQLServerStatementParser.AcceleratedDatabaseRecoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#autoOption}.
	 * @param ctx the parse tree
	 */
	void enterAutoOption(SQLServerStatementParser.AutoOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#autoOption}.
	 * @param ctx the parse tree
	 */
	void exitAutoOption(SQLServerStatementParser.AutoOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#automaticTuningOption}.
	 * @param ctx the parse tree
	 */
	void enterAutomaticTuningOption(SQLServerStatementParser.AutomaticTuningOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#automaticTuningOption}.
	 * @param ctx the parse tree
	 */
	void exitAutomaticTuningOption(SQLServerStatementParser.AutomaticTuningOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#changeTrackingOption}.
	 * @param ctx the parse tree
	 */
	void enterChangeTrackingOption(SQLServerStatementParser.ChangeTrackingOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#changeTrackingOption}.
	 * @param ctx the parse tree
	 */
	void exitChangeTrackingOption(SQLServerStatementParser.ChangeTrackingOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#changeTrackingOptionList}.
	 * @param ctx the parse tree
	 */
	void enterChangeTrackingOptionList(SQLServerStatementParser.ChangeTrackingOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#changeTrackingOptionList}.
	 * @param ctx the parse tree
	 */
	void exitChangeTrackingOptionList(SQLServerStatementParser.ChangeTrackingOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 */
	void enterCursorOption(SQLServerStatementParser.CursorOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 */
	void exitCursorOption(SQLServerStatementParser.CursorOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#externalAccessOption}.
	 * @param ctx the parse tree
	 */
	void enterExternalAccessOption(SQLServerStatementParser.ExternalAccessOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#externalAccessOption}.
	 * @param ctx the parse tree
	 */
	void exitExternalAccessOption(SQLServerStatementParser.ExternalAccessOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#queryStoreOptions}.
	 * @param ctx the parse tree
	 */
	void enterQueryStoreOptions(SQLServerStatementParser.QueryStoreOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#queryStoreOptions}.
	 * @param ctx the parse tree
	 */
	void exitQueryStoreOptions(SQLServerStatementParser.QueryStoreOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#queryStoreOptionList}.
	 * @param ctx the parse tree
	 */
	void enterQueryStoreOptionList(SQLServerStatementParser.QueryStoreOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#queryStoreOptionList}.
	 * @param ctx the parse tree
	 */
	void exitQueryStoreOptionList(SQLServerStatementParser.QueryStoreOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#queryCapturePolicyOptionList}.
	 * @param ctx the parse tree
	 */
	void enterQueryCapturePolicyOptionList(SQLServerStatementParser.QueryCapturePolicyOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#queryCapturePolicyOptionList}.
	 * @param ctx the parse tree
	 */
	void exitQueryCapturePolicyOptionList(SQLServerStatementParser.QueryCapturePolicyOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#recoveryOption}.
	 * @param ctx the parse tree
	 */
	void enterRecoveryOption(SQLServerStatementParser.RecoveryOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#recoveryOption}.
	 * @param ctx the parse tree
	 */
	void exitRecoveryOption(SQLServerStatementParser.RecoveryOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#sqlOption}.
	 * @param ctx the parse tree
	 */
	void enterSqlOption(SQLServerStatementParser.SqlOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#sqlOption}.
	 * @param ctx the parse tree
	 */
	void exitSqlOption(SQLServerStatementParser.SqlOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#snapshotOption}.
	 * @param ctx the parse tree
	 */
	void enterSnapshotOption(SQLServerStatementParser.SnapshotOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#snapshotOption}.
	 * @param ctx the parse tree
	 */
	void exitSnapshotOption(SQLServerStatementParser.SnapshotOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerOption}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerOption(SQLServerStatementParser.ServiceBrokerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerOption}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerOption(SQLServerStatementParser.ServiceBrokerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#targetRecoveryTimeOption}.
	 * @param ctx the parse tree
	 */
	void enterTargetRecoveryTimeOption(SQLServerStatementParser.TargetRecoveryTimeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#targetRecoveryTimeOption}.
	 * @param ctx the parse tree
	 */
	void exitTargetRecoveryTimeOption(SQLServerStatementParser.TargetRecoveryTimeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(SQLServerStatementParser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(SQLServerStatementParser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createServiceClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateServiceClause(SQLServerStatementParser.CreateServiceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createServiceClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateServiceClause(SQLServerStatementParser.CreateServiceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterServiceClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterServiceClause(SQLServerStatementParser.AlterServiceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterServiceClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterServiceClause(SQLServerStatementParser.AlterServiceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterServiceOptArg}.
	 * @param ctx the parse tree
	 */
	void enterAlterServiceOptArg(SQLServerStatementParser.AlterServiceOptArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterServiceOptArg}.
	 * @param ctx the parse tree
	 */
	void exitAlterServiceOptArg(SQLServerStatementParser.AlterServiceOptArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#schemaNameClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaNameClause(SQLServerStatementParser.SchemaNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#schemaNameClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaNameClause(SQLServerStatementParser.SchemaNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#schemaElement}.
	 * @param ctx the parse tree
	 */
	void enterSchemaElement(SQLServerStatementParser.SchemaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#schemaElement}.
	 * @param ctx the parse tree
	 */
	void exitSchemaElement(SQLServerStatementParser.SchemaElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTableAsSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableAsSelectClause(SQLServerStatementParser.CreateTableAsSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTableAsSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableAsSelectClause(SQLServerStatementParser.CreateTableAsSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTableAsSelect}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableAsSelect(SQLServerStatementParser.CreateTableAsSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTableAsSelect}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableAsSelect(SQLServerStatementParser.CreateTableAsSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createRemoteTableAsSelect}.
	 * @param ctx the parse tree
	 */
	void enterCreateRemoteTableAsSelect(SQLServerStatementParser.CreateRemoteTableAsSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createRemoteTableAsSelect}.
	 * @param ctx the parse tree
	 */
	void exitCreateRemoteTableAsSelect(SQLServerStatementParser.CreateRemoteTableAsSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withDistributionOption}.
	 * @param ctx the parse tree
	 */
	void enterWithDistributionOption(SQLServerStatementParser.WithDistributionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withDistributionOption}.
	 * @param ctx the parse tree
	 */
	void exitWithDistributionOption(SQLServerStatementParser.WithDistributionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#optionQueryHintClause}.
	 * @param ctx the parse tree
	 */
	void enterOptionQueryHintClause(SQLServerStatementParser.OptionQueryHintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#optionQueryHintClause}.
	 * @param ctx the parse tree
	 */
	void exitOptionQueryHintClause(SQLServerStatementParser.OptionQueryHintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SQLServerStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SQLServerStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insertDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertDefaultValue(SQLServerStatementParser.InsertDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insertDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertDefaultValue(SQLServerStatementParser.InsertDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(SQLServerStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(SQLServerStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(SQLServerStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(SQLServerStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insertExecClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertExecClause(SQLServerStatementParser.InsertExecClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insertExecClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertExecClause(SQLServerStatementParser.InsertExecClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#merge}.
	 * @param ctx the parse tree
	 */
	void enterMerge(SQLServerStatementParser.MergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#merge}.
	 * @param ctx the parse tree
	 */
	void exitMerge(SQLServerStatementParser.MergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#mergeIntoClause}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoClause(SQLServerStatementParser.MergeIntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#mergeIntoClause}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoClause(SQLServerStatementParser.MergeIntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#mergeUsingClause}.
	 * @param ctx the parse tree
	 */
	void enterMergeUsingClause(SQLServerStatementParser.MergeUsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#mergeUsingClause}.
	 * @param ctx the parse tree
	 */
	void exitMergeUsingClause(SQLServerStatementParser.MergeUsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withMergeHint}.
	 * @param ctx the parse tree
	 */
	void enterWithMergeHint(SQLServerStatementParser.WithMergeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withMergeHint}.
	 * @param ctx the parse tree
	 */
	void exitWithMergeHint(SQLServerStatementParser.WithMergeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#mergeWhenClause}.
	 * @param ctx the parse tree
	 */
	void enterMergeWhenClause(SQLServerStatementParser.MergeWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#mergeWhenClause}.
	 * @param ctx the parse tree
	 */
	void exitMergeWhenClause(SQLServerStatementParser.MergeWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#mergeUpdateClause}.
	 * @param ctx the parse tree
	 */
	void enterMergeUpdateClause(SQLServerStatementParser.MergeUpdateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#mergeUpdateClause}.
	 * @param ctx the parse tree
	 */
	void exitMergeUpdateClause(SQLServerStatementParser.MergeUpdateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#mergeDeleteClause}.
	 * @param ctx the parse tree
	 */
	void enterMergeDeleteClause(SQLServerStatementParser.MergeDeleteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#mergeDeleteClause}.
	 * @param ctx the parse tree
	 */
	void exitMergeDeleteClause(SQLServerStatementParser.MergeDeleteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#mergeInsertClause}.
	 * @param ctx the parse tree
	 */
	void enterMergeInsertClause(SQLServerStatementParser.MergeInsertClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#mergeInsertClause}.
	 * @param ctx the parse tree
	 */
	void exitMergeInsertClause(SQLServerStatementParser.MergeInsertClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withTableHint}.
	 * @param ctx the parse tree
	 */
	void enterWithTableHint(SQLServerStatementParser.WithTableHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withTableHint}.
	 * @param ctx the parse tree
	 */
	void exitWithTableHint(SQLServerStatementParser.WithTableHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#exec}.
	 * @param ctx the parse tree
	 */
	void enterExec(SQLServerStatementParser.ExecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#exec}.
	 * @param ctx the parse tree
	 */
	void exitExec(SQLServerStatementParser.ExecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SQLServerStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SQLServerStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SQLServerStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SQLServerStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(SQLServerStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(SQLServerStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(SQLServerStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(SQLServerStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(SQLServerStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(SQLServerStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SQLServerStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SQLServerStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#optionHint}.
	 * @param ctx the parse tree
	 */
	void enterOptionHint(SQLServerStatementParser.OptionHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#optionHint}.
	 * @param ctx the parse tree
	 */
	void exitOptionHint(SQLServerStatementParser.OptionHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(SQLServerStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(SQLServerStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(SQLServerStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(SQLServerStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTableNames(SQLServerStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTableNames(SQLServerStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQLServerStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQLServerStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(SQLServerStatementParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(SQLServerStatementParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SQLServerStatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SQLServerStatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(SQLServerStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(SQLServerStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(SQLServerStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(SQLServerStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(SQLServerStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(SQLServerStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(SQLServerStatementParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(SQLServerStatementParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#topNum}.
	 * @param ctx the parse tree
	 */
	void enterTopNum(SQLServerStatementParser.TopNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#topNum}.
	 * @param ctx the parse tree
	 */
	void exitTopNum(SQLServerStatementParser.TopNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(SQLServerStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(SQLServerStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(SQLServerStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(SQLServerStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(SQLServerStatementParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(SQLServerStatementParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SQLServerStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SQLServerStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(SQLServerStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(SQLServerStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SQLServerStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SQLServerStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(SQLServerStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(SQLServerStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(SQLServerStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(SQLServerStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(SQLServerStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(SQLServerStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQLServerStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQLServerStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SQLServerStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SQLServerStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SQLServerStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SQLServerStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SQLServerStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SQLServerStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withTempTable}.
	 * @param ctx the parse tree
	 */
	void enterWithTempTable(SQLServerStatementParser.WithTempTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withTempTable}.
	 * @param ctx the parse tree
	 */
	void exitWithTempTable(SQLServerStatementParser.WithTempTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(SQLServerStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(SQLServerStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#cteClauseSet}.
	 * @param ctx the parse tree
	 */
	void enterCteClauseSet(SQLServerStatementParser.CteClauseSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#cteClauseSet}.
	 * @param ctx the parse tree
	 */
	void exitCteClauseSet(SQLServerStatementParser.CteClauseSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void enterCteClause(SQLServerStatementParser.CteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void exitCteClause(SQLServerStatementParser.CteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#outputClause}.
	 * @param ctx the parse tree
	 */
	void enterOutputClause(SQLServerStatementParser.OutputClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#outputClause}.
	 * @param ctx the parse tree
	 */
	void exitOutputClause(SQLServerStatementParser.OutputClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#outputWithColumns}.
	 * @param ctx the parse tree
	 */
	void enterOutputWithColumns(SQLServerStatementParser.OutputWithColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#outputWithColumns}.
	 * @param ctx the parse tree
	 */
	void exitOutputWithColumns(SQLServerStatementParser.OutputWithColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#scalarExpression}.
	 * @param ctx the parse tree
	 */
	void enterScalarExpression(SQLServerStatementParser.ScalarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#scalarExpression}.
	 * @param ctx the parse tree
	 */
	void exitScalarExpression(SQLServerStatementParser.ScalarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#outputWithColumn}.
	 * @param ctx the parse tree
	 */
	void enterOutputWithColumn(SQLServerStatementParser.OutputWithColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#outputWithColumn}.
	 * @param ctx the parse tree
	 */
	void exitOutputWithColumn(SQLServerStatementParser.OutputWithColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#outputWithAaterisk}.
	 * @param ctx the parse tree
	 */
	void enterOutputWithAaterisk(SQLServerStatementParser.OutputWithAateriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#outputWithAaterisk}.
	 * @param ctx the parse tree
	 */
	void exitOutputWithAaterisk(SQLServerStatementParser.OutputWithAateriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#outputTableName}.
	 * @param ctx the parse tree
	 */
	void enterOutputTableName(SQLServerStatementParser.OutputTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#outputTableName}.
	 * @param ctx the parse tree
	 */
	void exitOutputTableName(SQLServerStatementParser.OutputTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#queryHint}.
	 * @param ctx the parse tree
	 */
	void enterQueryHint(SQLServerStatementParser.QueryHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#queryHint}.
	 * @param ctx the parse tree
	 */
	void exitQueryHint(SQLServerStatementParser.QueryHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#useHitName}.
	 * @param ctx the parse tree
	 */
	void enterUseHitName(SQLServerStatementParser.UseHitNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#useHitName}.
	 * @param ctx the parse tree
	 */
	void exitUseHitName(SQLServerStatementParser.UseHitNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(SQLServerStatementParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(SQLServerStatementParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#forXmlClause}.
	 * @param ctx the parse tree
	 */
	void enterForXmlClause(SQLServerStatementParser.ForXmlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#forXmlClause}.
	 * @param ctx the parse tree
	 */
	void exitForXmlClause(SQLServerStatementParser.ForXmlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#commonDirectivesForXml}.
	 * @param ctx the parse tree
	 */
	void enterCommonDirectivesForXml(SQLServerStatementParser.CommonDirectivesForXmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#commonDirectivesForXml}.
	 * @param ctx the parse tree
	 */
	void exitCommonDirectivesForXml(SQLServerStatementParser.CommonDirectivesForXmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#forJsonClause}.
	 * @param ctx the parse tree
	 */
	void enterForJsonClause(SQLServerStatementParser.ForJsonClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#forJsonClause}.
	 * @param ctx the parse tree
	 */
	void exitForJsonClause(SQLServerStatementParser.ForJsonClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#selectWithClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithClause(SQLServerStatementParser.SelectWithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#selectWithClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithClause(SQLServerStatementParser.SelectWithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#xmlNamespacesClause}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespacesClause(SQLServerStatementParser.XmlNamespacesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#xmlNamespacesClause}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespacesClause(SQLServerStatementParser.XmlNamespacesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#xmlNamespaceDeclarationItem}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespaceDeclarationItem(SQLServerStatementParser.XmlNamespaceDeclarationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#xmlNamespaceDeclarationItem}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespaceDeclarationItem(SQLServerStatementParser.XmlNamespaceDeclarationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#xmlNamespaceUri}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespaceUri(SQLServerStatementParser.XmlNamespaceUriContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#xmlNamespaceUri}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespaceUri(SQLServerStatementParser.XmlNamespaceUriContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#xmlNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespacePrefix(SQLServerStatementParser.XmlNamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#xmlNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespacePrefix(SQLServerStatementParser.XmlNamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#xmlDefaultNamespaceDeclarationItem}.
	 * @param ctx the parse tree
	 */
	void enterXmlDefaultNamespaceDeclarationItem(SQLServerStatementParser.XmlDefaultNamespaceDeclarationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#xmlDefaultNamespaceDeclarationItem}.
	 * @param ctx the parse tree
	 */
	void exitXmlDefaultNamespaceDeclarationItem(SQLServerStatementParser.XmlDefaultNamespaceDeclarationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(SQLServerStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(SQLServerStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#grantClassPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterGrantClassPrivilegesClause(SQLServerStatementParser.GrantClassPrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#grantClassPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitGrantClassPrivilegesClause(SQLServerStatementParser.GrantClassPrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#grantClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterGrantClassTypePrivilegesClause(SQLServerStatementParser.GrantClassTypePrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#grantClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitGrantClassTypePrivilegesClause(SQLServerStatementParser.GrantClassTypePrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterClassPrivileges(SQLServerStatementParser.ClassPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitClassPrivileges(SQLServerStatementParser.ClassPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onClassClause}.
	 * @param ctx the parse tree
	 */
	void enterOnClassClause(SQLServerStatementParser.OnClassClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onClassClause}.
	 * @param ctx the parse tree
	 */
	void exitOnClassClause(SQLServerStatementParser.OnClassClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classTypePrivileges}.
	 * @param ctx the parse tree
	 */
	void enterClassTypePrivileges(SQLServerStatementParser.ClassTypePrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classTypePrivileges}.
	 * @param ctx the parse tree
	 */
	void exitClassTypePrivileges(SQLServerStatementParser.ClassTypePrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onClassTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterOnClassTypeClause(SQLServerStatementParser.OnClassTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onClassTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitOnClassTypeClause(SQLServerStatementParser.OnClassTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#securable}.
	 * @param ctx the parse tree
	 */
	void enterSecurable(SQLServerStatementParser.SecurableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#securable}.
	 * @param ctx the parse tree
	 */
	void exitSecurable(SQLServerStatementParser.SecurableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(SQLServerStatementParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(SQLServerStatementParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(SQLServerStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(SQLServerStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#revokeClassPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterRevokeClassPrivilegesClause(SQLServerStatementParser.RevokeClassPrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#revokeClassPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitRevokeClassPrivilegesClause(SQLServerStatementParser.RevokeClassPrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#revokeClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterRevokeClassTypePrivilegesClause(SQLServerStatementParser.RevokeClassTypePrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#revokeClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitRevokeClassTypePrivilegesClause(SQLServerStatementParser.RevokeClassTypePrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#deny}.
	 * @param ctx the parse tree
	 */
	void enterDeny(SQLServerStatementParser.DenyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#deny}.
	 * @param ctx the parse tree
	 */
	void exitDeny(SQLServerStatementParser.DenyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#denyClassPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterDenyClassPrivilegesClause(SQLServerStatementParser.DenyClassPrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#denyClassPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitDenyClassPrivilegesClause(SQLServerStatementParser.DenyClassPrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#denyClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterDenyClassTypePrivilegesClause(SQLServerStatementParser.DenyClassTypePrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#denyClassTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitDenyClassTypePrivilegesClause(SQLServerStatementParser.DenyClassTypePrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 */
	void enterOptionForClause(SQLServerStatementParser.OptionForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 */
	void exitOptionForClause(SQLServerStatementParser.OptionForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType(SQLServerStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType(SQLServerStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#objectPermission}.
	 * @param ctx the parse tree
	 */
	void enterObjectPermission(SQLServerStatementParser.ObjectPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#objectPermission}.
	 * @param ctx the parse tree
	 */
	void exitObjectPermission(SQLServerStatementParser.ObjectPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serverPermission}.
	 * @param ctx the parse tree
	 */
	void enterServerPermission(SQLServerStatementParser.ServerPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serverPermission}.
	 * @param ctx the parse tree
	 */
	void exitServerPermission(SQLServerStatementParser.ServerPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serverPrincipalPermission}.
	 * @param ctx the parse tree
	 */
	void enterServerPrincipalPermission(SQLServerStatementParser.ServerPrincipalPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serverPrincipalPermission}.
	 * @param ctx the parse tree
	 */
	void exitServerPrincipalPermission(SQLServerStatementParser.ServerPrincipalPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databasePermission}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePermission(SQLServerStatementParser.DatabasePermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databasePermission}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePermission(SQLServerStatementParser.DatabasePermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databasePrincipalPermission}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePrincipalPermission(SQLServerStatementParser.DatabasePrincipalPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databasePrincipalPermission}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePrincipalPermission(SQLServerStatementParser.DatabasePrincipalPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseUserPermission}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseUserPermission(SQLServerStatementParser.DatabaseUserPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseUserPermission}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseUserPermission(SQLServerStatementParser.DatabaseUserPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseRolePermission}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseRolePermission(SQLServerStatementParser.DatabaseRolePermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseRolePermission}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseRolePermission(SQLServerStatementParser.DatabaseRolePermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#applicationRolePermission}.
	 * @param ctx the parse tree
	 */
	void enterApplicationRolePermission(SQLServerStatementParser.ApplicationRolePermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#applicationRolePermission}.
	 * @param ctx the parse tree
	 */
	void exitApplicationRolePermission(SQLServerStatementParser.ApplicationRolePermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databaseScopedCredentialPermission}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseScopedCredentialPermission(SQLServerStatementParser.DatabaseScopedCredentialPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databaseScopedCredentialPermission}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseScopedCredentialPermission(SQLServerStatementParser.DatabaseScopedCredentialPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#schemaPermission}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPermission(SQLServerStatementParser.SchemaPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#schemaPermission}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPermission(SQLServerStatementParser.SchemaPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#searchPropertyListPermission}.
	 * @param ctx the parse tree
	 */
	void enterSearchPropertyListPermission(SQLServerStatementParser.SearchPropertyListPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#searchPropertyListPermission}.
	 * @param ctx the parse tree
	 */
	void exitSearchPropertyListPermission(SQLServerStatementParser.SearchPropertyListPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerPermission}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerPermission(SQLServerStatementParser.ServiceBrokerPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerPermission}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerPermission(SQLServerStatementParser.ServiceBrokerPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerContractsPermission}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerContractsPermission(SQLServerStatementParser.ServiceBrokerContractsPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerContractsPermission}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerContractsPermission(SQLServerStatementParser.ServiceBrokerContractsPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerMessageTypesPermission}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerMessageTypesPermission(SQLServerStatementParser.ServiceBrokerMessageTypesPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerMessageTypesPermission}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerMessageTypesPermission(SQLServerStatementParser.ServiceBrokerMessageTypesPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerRemoteServiceBindingsPermission}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerRemoteServiceBindingsPermission(SQLServerStatementParser.ServiceBrokerRemoteServiceBindingsPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerRemoteServiceBindingsPermission}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerRemoteServiceBindingsPermission(SQLServerStatementParser.ServiceBrokerRemoteServiceBindingsPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerRoutesPermission}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerRoutesPermission(SQLServerStatementParser.ServiceBrokerRoutesPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerRoutesPermission}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerRoutesPermission(SQLServerStatementParser.ServiceBrokerRoutesPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerServicesPermission}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerServicesPermission(SQLServerStatementParser.ServiceBrokerServicesPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerServicesPermission}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerServicesPermission(SQLServerStatementParser.ServiceBrokerServicesPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#endpointPermission}.
	 * @param ctx the parse tree
	 */
	void enterEndpointPermission(SQLServerStatementParser.EndpointPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#endpointPermission}.
	 * @param ctx the parse tree
	 */
	void exitEndpointPermission(SQLServerStatementParser.EndpointPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#certificatePermission}.
	 * @param ctx the parse tree
	 */
	void enterCertificatePermission(SQLServerStatementParser.CertificatePermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#certificatePermission}.
	 * @param ctx the parse tree
	 */
	void exitCertificatePermission(SQLServerStatementParser.CertificatePermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#symmetricKeyPermission}.
	 * @param ctx the parse tree
	 */
	void enterSymmetricKeyPermission(SQLServerStatementParser.SymmetricKeyPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#symmetricKeyPermission}.
	 * @param ctx the parse tree
	 */
	void exitSymmetricKeyPermission(SQLServerStatementParser.SymmetricKeyPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#asymmetricKeyPermission}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetricKeyPermission(SQLServerStatementParser.AsymmetricKeyPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#asymmetricKeyPermission}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetricKeyPermission(SQLServerStatementParser.AsymmetricKeyPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assemblyPermission}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyPermission(SQLServerStatementParser.AssemblyPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assemblyPermission}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyPermission(SQLServerStatementParser.AssemblyPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#availabilityGroupPermission}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityGroupPermission(SQLServerStatementParser.AvailabilityGroupPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#availabilityGroupPermission}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityGroupPermission(SQLServerStatementParser.AvailabilityGroupPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fullTextPermission}.
	 * @param ctx the parse tree
	 */
	void enterFullTextPermission(SQLServerStatementParser.FullTextPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fullTextPermission}.
	 * @param ctx the parse tree
	 */
	void exitFullTextPermission(SQLServerStatementParser.FullTextPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fullTextCatalogPermission}.
	 * @param ctx the parse tree
	 */
	void enterFullTextCatalogPermission(SQLServerStatementParser.FullTextCatalogPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fullTextCatalogPermission}.
	 * @param ctx the parse tree
	 */
	void exitFullTextCatalogPermission(SQLServerStatementParser.FullTextCatalogPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fullTextStoplistPermission}.
	 * @param ctx the parse tree
	 */
	void enterFullTextStoplistPermission(SQLServerStatementParser.FullTextStoplistPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fullTextStoplistPermission}.
	 * @param ctx the parse tree
	 */
	void exitFullTextStoplistPermission(SQLServerStatementParser.FullTextStoplistPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#typePermission}.
	 * @param ctx the parse tree
	 */
	void enterTypePermission(SQLServerStatementParser.TypePermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#typePermission}.
	 * @param ctx the parse tree
	 */
	void exitTypePermission(SQLServerStatementParser.TypePermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#xmlSchemaCollectionPermission}.
	 * @param ctx the parse tree
	 */
	void enterXmlSchemaCollectionPermission(SQLServerStatementParser.XmlSchemaCollectionPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#xmlSchemaCollectionPermission}.
	 * @param ctx the parse tree
	 */
	void exitXmlSchemaCollectionPermission(SQLServerStatementParser.XmlSchemaCollectionPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#systemObjectPermission}.
	 * @param ctx the parse tree
	 */
	void enterSystemObjectPermission(SQLServerStatementParser.SystemObjectPermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#systemObjectPermission}.
	 * @param ctx the parse tree
	 */
	void exitSystemObjectPermission(SQLServerStatementParser.SystemObjectPermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(SQLServerStatementParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(SQLServerStatementParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classItem}.
	 * @param ctx the parse tree
	 */
	void enterClassItem(SQLServerStatementParser.ClassItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classItem}.
	 * @param ctx the parse tree
	 */
	void exitClassItem(SQLServerStatementParser.ClassItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(SQLServerStatementParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(SQLServerStatementParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#roleClause}.
	 * @param ctx the parse tree
	 */
	void enterRoleClause(SQLServerStatementParser.RoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#roleClause}.
	 * @param ctx the parse tree
	 */
	void exitRoleClause(SQLServerStatementParser.RoleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setUser}.
	 * @param ctx the parse tree
	 */
	void enterSetUser(SQLServerStatementParser.SetUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setUser}.
	 * @param ctx the parse tree
	 */
	void exitSetUser(SQLServerStatementParser.SetUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(SQLServerStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(SQLServerStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUserLoginClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserLoginClause(SQLServerStatementParser.CreateUserLoginClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUserLoginClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserLoginClause(SQLServerStatementParser.CreateUserLoginClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUserWindowsPrincipalClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserWindowsPrincipalClause(SQLServerStatementParser.CreateUserWindowsPrincipalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUserWindowsPrincipalClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserWindowsPrincipalClause(SQLServerStatementParser.CreateUserWindowsPrincipalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUserLoginWindowsPrincipalClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserLoginWindowsPrincipalClause(SQLServerStatementParser.CreateUserLoginWindowsPrincipalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUserLoginWindowsPrincipalClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserLoginWindowsPrincipalClause(SQLServerStatementParser.CreateUserLoginWindowsPrincipalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUserWithoutLoginClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserWithoutLoginClause(SQLServerStatementParser.CreateUserWithoutLoginClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUserWithoutLoginClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserWithoutLoginClause(SQLServerStatementParser.CreateUserWithoutLoginClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#optionsList}.
	 * @param ctx the parse tree
	 */
	void enterOptionsList(SQLServerStatementParser.OptionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#optionsList}.
	 * @param ctx the parse tree
	 */
	void exitOptionsList(SQLServerStatementParser.OptionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#limitedOptionsList}.
	 * @param ctx the parse tree
	 */
	void enterLimitedOptionsList(SQLServerStatementParser.LimitedOptionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#limitedOptionsList}.
	 * @param ctx the parse tree
	 */
	void exitLimitedOptionsList(SQLServerStatementParser.LimitedOptionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUserFromExternalProviderClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserFromExternalProviderClause(SQLServerStatementParser.CreateUserFromExternalProviderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUserFromExternalProviderClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserFromExternalProviderClause(SQLServerStatementParser.CreateUserFromExternalProviderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUserWithDefaultSchema}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserWithDefaultSchema(SQLServerStatementParser.CreateUserWithDefaultSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUserWithDefaultSchema}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserWithDefaultSchema(SQLServerStatementParser.CreateUserWithDefaultSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUserWithAzureActiveDirectoryPrincipalClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserWithAzureActiveDirectoryPrincipalClause(SQLServerStatementParser.CreateUserWithAzureActiveDirectoryPrincipalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUserWithAzureActiveDirectoryPrincipalClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserWithAzureActiveDirectoryPrincipalClause(SQLServerStatementParser.CreateUserWithAzureActiveDirectoryPrincipalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowsPrincipal}.
	 * @param ctx the parse tree
	 */
	void enterWindowsPrincipal(SQLServerStatementParser.WindowsPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowsPrincipal}.
	 * @param ctx the parse tree
	 */
	void exitWindowsPrincipal(SQLServerStatementParser.WindowsPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#azureActiveDirectoryPrincipal}.
	 * @param ctx the parse tree
	 */
	void enterAzureActiveDirectoryPrincipal(SQLServerStatementParser.AzureActiveDirectoryPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#azureActiveDirectoryPrincipal}.
	 * @param ctx the parse tree
	 */
	void exitAzureActiveDirectoryPrincipal(SQLServerStatementParser.AzureActiveDirectoryPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(SQLServerStatementParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(SQLServerStatementParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#ignoredNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredNameIdentifier(SQLServerStatementParser.IgnoredNameIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#ignoredNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredNameIdentifier(SQLServerStatementParser.IgnoredNameIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(SQLServerStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(SQLServerStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(SQLServerStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(SQLServerStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setItem}.
	 * @param ctx the parse tree
	 */
	void enterSetItem(SQLServerStatementParser.SetItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setItem}.
	 * @param ctx the parse tree
	 */
	void exitSetItem(SQLServerStatementParser.SetItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(SQLServerStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(SQLServerStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(SQLServerStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(SQLServerStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(SQLServerStatementParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(SQLServerStatementParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLogin}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogin(SQLServerStatementParser.CreateLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLogin}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogin(SQLServerStatementParser.CreateLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForSQLServerClause(SQLServerStatementParser.CreateLoginForSQLServerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForSQLServerClause(SQLServerStatementParser.CreateLoginForSQLServerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForSQLServerOptionList(SQLServerStatementParser.CreateLoginForSQLServerOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForSQLServerOptionList(SQLServerStatementParser.CreateLoginForSQLServerOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerOptionListClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForSQLServerOptionListClause(SQLServerStatementParser.CreateLoginForSQLServerOptionListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForSQLServerOptionListClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForSQLServerOptionListClause(SQLServerStatementParser.CreateLoginForSQLServerOptionListClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#hashedPassword}.
	 * @param ctx the parse tree
	 */
	void enterHashedPassword(SQLServerStatementParser.HashedPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#hashedPassword}.
	 * @param ctx the parse tree
	 */
	void exitHashedPassword(SQLServerStatementParser.HashedPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#sid}.
	 * @param ctx the parse tree
	 */
	void enterSid(SQLServerStatementParser.SidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#sid}.
	 * @param ctx the parse tree
	 */
	void exitSid(SQLServerStatementParser.SidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#sources}.
	 * @param ctx the parse tree
	 */
	void enterSources(SQLServerStatementParser.SourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#sources}.
	 * @param ctx the parse tree
	 */
	void exitSources(SQLServerStatementParser.SourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowsOptions}.
	 * @param ctx the parse tree
	 */
	void enterWindowsOptions(SQLServerStatementParser.WindowsOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowsOptions}.
	 * @param ctx the parse tree
	 */
	void exitWindowsOptions(SQLServerStatementParser.WindowsOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSQLDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAzureSQLDatabaseClause(SQLServerStatementParser.CreateLoginForAzureSQLDatabaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSQLDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAzureSQLDatabaseClause(SQLServerStatementParser.CreateLoginForAzureSQLDatabaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSQLDatabaseOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAzureSQLDatabaseOptionList(SQLServerStatementParser.CreateLoginForAzureSQLDatabaseOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSQLDatabaseOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAzureSQLDatabaseOptionList(SQLServerStatementParser.CreateLoginForAzureSQLDatabaseOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureManagedInstanceClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAzureManagedInstanceClause(SQLServerStatementParser.CreateLoginForAzureManagedInstanceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureManagedInstanceClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAzureManagedInstanceClause(SQLServerStatementParser.CreateLoginForAzureManagedInstanceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#azureManagedInstanceOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAzureManagedInstanceOptionList(SQLServerStatementParser.AzureManagedInstanceOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#azureManagedInstanceOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAzureManagedInstanceOptionList(SQLServerStatementParser.AzureManagedInstanceOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSynapseAnalyticsClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAzureSynapseAnalyticsClause(SQLServerStatementParser.CreateLoginForAzureSynapseAnalyticsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSynapseAnalyticsClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAzureSynapseAnalyticsClause(SQLServerStatementParser.CreateLoginForAzureSynapseAnalyticsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSynapseAnalyticsOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAzureSynapseAnalyticsOptionList(SQLServerStatementParser.CreateLoginForAzureSynapseAnalyticsOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAzureSynapseAnalyticsOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAzureSynapseAnalyticsOptionList(SQLServerStatementParser.CreateLoginForAzureSynapseAnalyticsOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAnalyticsPlatformSystemClause(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAnalyticsPlatformSystemClause(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAnalyticsPlatformSystemOptionList(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAnalyticsPlatformSystemOptionList(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemOptionListClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoginForAnalyticsPlatformSystemOptionListClause(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemOptionListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLoginForAnalyticsPlatformSystemOptionListClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoginForAnalyticsPlatformSystemOptionListClause(SQLServerStatementParser.CreateLoginForAnalyticsPlatformSystemOptionListClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropLogin}.
	 * @param ctx the parse tree
	 */
	void enterDropLogin(SQLServerStatementParser.DropLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropLogin}.
	 * @param ctx the parse tree
	 */
	void exitDropLogin(SQLServerStatementParser.DropLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterLogin}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogin(SQLServerStatementParser.AlterLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterLogin}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogin(SQLServerStatementParser.AlterLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#statusOptionClause}.
	 * @param ctx the parse tree
	 */
	void enterStatusOptionClause(SQLServerStatementParser.StatusOptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#statusOptionClause}.
	 * @param ctx the parse tree
	 */
	void exitStatusOptionClause(SQLServerStatementParser.StatusOptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setOptionClause}.
	 * @param ctx the parse tree
	 */
	void enterSetOptionClause(SQLServerStatementParser.SetOptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setOptionClause}.
	 * @param ctx the parse tree
	 */
	void exitSetOptionClause(SQLServerStatementParser.SetOptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#passwordOptionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordOptionClause(SQLServerStatementParser.PasswordOptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#passwordOptionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordOptionClause(SQLServerStatementParser.PasswordOptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#cryptographicCredentialsOptionClause}.
	 * @param ctx the parse tree
	 */
	void enterCryptographicCredentialsOptionClause(SQLServerStatementParser.CryptographicCredentialsOptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#cryptographicCredentialsOptionClause}.
	 * @param ctx the parse tree
	 */
	void exitCryptographicCredentialsOptionClause(SQLServerStatementParser.CryptographicCredentialsOptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#revert}.
	 * @param ctx the parse tree
	 */
	void enterRevert(SQLServerStatementParser.RevertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#revert}.
	 * @param ctx the parse tree
	 */
	void exitRevert(SQLServerStatementParser.RevertContext ctx);
}