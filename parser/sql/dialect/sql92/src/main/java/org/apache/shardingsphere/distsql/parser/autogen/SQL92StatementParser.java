// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/sql92/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/SQL92Statement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQL92StatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INLINE_COMMENT=1, AND_=2, CONCAT_=3, NOT_=4, TILDE_=5, VERTICAL_BAR_=6, 
		AMPERSAND_=7, SIGNED_LEFT_SHIFT_=8, SIGNED_RIGHT_SHIFT_=9, CARET_=10, 
		MOD_=11, COLON_=12, PLUS_=13, MINUS_=14, ASTERISK_=15, SLASH_=16, BACKSLASH_=17, 
		DOT_=18, DOT_ASTERISK_=19, SAFE_EQ_=20, DEQ_=21, EQ_=22, NEQ_=23, GT_=24, 
		GTE_=25, LT_=26, LTE_=27, POUND_=28, LP_=29, RP_=30, LBE_=31, RBE_=32, 
		LBT_=33, RBT_=34, COMMA_=35, DQ_=36, SQ_=37, QUESTION_=38, AT_=39, SEMI_=40, 
		WS=41, SELECT=42, INSERT=43, UPDATE=44, DELETE=45, CREATE=46, ALTER=47, 
		DROP=48, TRUNCATE=49, SCHEMA=50, GRANT=51, REVOKE=52, ADD=53, SET=54, 
		TABLE=55, COLUMN=56, INDEX=57, CONSTRAINT=58, PRIMARY=59, UNIQUE=60, FOREIGN=61, 
		KEY=62, POSITION=63, PRECISION=64, FUNCTION=65, TRIGGER=66, PROCEDURE=67, 
		VIEW=68, INTO=69, VALUES=70, WITH=71, UNION=72, DISTINCT=73, CASE=74, 
		WHEN=75, CAST=76, TRIM=77, SUBSTRING=78, FROM=79, NATURAL=80, JOIN=81, 
		FULL=82, INNER=83, OUTER=84, LEFT=85, RIGHT=86, CROSS=87, USING=88, WHERE=89, 
		AS=90, ON=91, IF=92, ELSE=93, THEN=94, FOR=95, TO=96, AND=97, OR=98, IS=99, 
		NOT=100, NULL=101, TRUE=102, FALSE=103, EXISTS=104, BETWEEN=105, IN=106, 
		ALL=107, ANY=108, LIKE=109, ORDER=110, GROUP=111, BY=112, ASC=113, DESC=114, 
		HAVING=115, LIMIT=116, OFFSET=117, BEGIN=118, COMMIT=119, ROLLBACK=120, 
		SAVEPOINT=121, BOOLEAN=122, DOUBLE=123, CHAR=124, CHARACTER=125, ARRAY=126, 
		INTERVAL=127, DATE=128, TIME=129, TIMESTAMP=130, LOCALTIME=131, LOCALTIMESTAMP=132, 
		YEAR=133, QUARTER=134, MONTH=135, WEEK=136, DAY=137, HOUR=138, MINUTE=139, 
		SECOND=140, MICROSECOND=141, MAX=142, MIN=143, SUM=144, COUNT=145, AVG=146, 
		DEFAULT=147, CURRENT=148, ENABLE=149, DISABLE=150, CALL=151, INSTANCE=152, 
		PRESERVE=153, DO=154, DEFINER=155, CURRENT_USER=156, SQL=157, CASCADED=158, 
		LOCAL=159, CLOSE=160, OPEN=161, NEXT=162, NAME=163, COLLATION=164, NAMES=165, 
		INTEGER=166, REAL=167, DECIMAL=168, TYPE=169, VARCHAR=170, FLOAT=171, 
		FOR_GENERATOR=172, ADA=173, C92=174, CATALOG_NAME=175, CHARACTER_SET_CATALOG=176, 
		CHARACTER_SET_NAME=177, CHARACTER_SET_SCHEMA=178, CLASS_ORIGIN=179, COBOL=180, 
		COLLATION_CATALOG=181, COLLATION_NAME=182, COLLATION_SCHEMA=183, COLUMN_NAME=184, 
		COMMAND_FUNCTION=185, COMMITTED=186, CONDITION_NUMBER=187, CONNECTION_NAME=188, 
		CONSTRAINT_CATALOG=189, CONSTRAINT_NAME=190, CONSTRAINT_SCHEMA=191, CURSOR_NAME=192, 
		DATA=193, DATETIME_INTERVAL_CODE=194, DATETIME_INTERVAL_PRECISION=195, 
		DYNAMIC_FUNCTION=196, FORTRAN=197, LENGTH=198, MESSAGE_LENGTH=199, MESSAGE_OCTET_LENGTH=200, 
		MESSAGE_TEXT=201, MORE92=202, MUMPS=203, NULLABLE=204, NUMBER=205, PASCAL=206, 
		PLI=207, REPEATABLE=208, RETURNED_LENGTH=209, RETURNED_OCTET_LENGTH=210, 
		RETURNED_SQLSTATE=211, ROW_COUNT=212, SCALE=213, SCHEMA_NAME=214, SERIALIZABLE=215, 
		SERVER_NAME=216, SUBCLASS_ORIGIN=217, TABLE_NAME=218, UNCOMMITTED=219, 
		UNNAMED=220, ABSOLUTE=221, ACTION=222, ALLOCATE=223, ARE=224, ASSERTION=225, 
		AT=226, AUTHORIZATION=227, BIT=228, BIT_LENGTH=229, BOTH=230, CASCADE=231, 
		CATALOG=232, CHAR_LENGTH=233, CHARACTER_LENGTH=234, CHECK=235, COALESCE=236, 
		COLLATE=237, CONNECT=238, CONNECTION=239, CONSTRAINTS=240, CONTINUE=241, 
		CONVERT=242, CORRESPONDING=243, CURRENT_DATE=244, CURRENT_TIME=245, CURRENT_TIMESTAMP=246, 
		CURSOR=247, DEALLOCATE=248, DEC=249, DECLARE=250, DEFERRABLE=251, DEFERRED=252, 
		DESCRIBE=253, DESCRIPTOR=254, DIAGNOSTICS=255, DISCONNECT=256, DOMAIN=257, 
		END=258, END_EXEC=259, ESCAPE=260, EXCEPT=261, EXCEPTION=262, EXEC=263, 
		EXECUTE=264, EXTERNAL=265, EXTRACT=266, FETCH=267, FIRST=268, FOUND=269, 
		GET=270, GLOBAL=271, GO=272, GOTO=273, IDENTITY=274, IMMEDIATE=275, INDICATOR=276, 
		INITIALLY=277, INPUT=278, INSENSITIVE=279, INTERSECT=280, ISOLATION=281, 
		LANGUAGE=282, LAST=283, LEADING=284, LEVEL=285, LOWER=286, MATCH=287, 
		MODULE=288, NATIONAL=289, NCHAR=290, NO=291, NULLIF=292, NUMERIC=293, 
		OCTET_LENGTH=294, OF=295, ONLY=296, OPTION=297, OUTPUT=298, OVERLAPS=299, 
		PAD=300, PARTIAL=301, PREPARE=302, PRIOR=303, PRIVILEGES=304, PUBLIC=305, 
		READ=306, REFERENCES=307, RELATIVE=308, RESTRICT=309, ROWS=310, SCROLL=311, 
		SECTION=312, SESSION=313, SESSION_USER=314, SIZE=315, SMALLINT=316, SOME=317, 
		SPACE=318, SQLCODE=319, SQLERROR=320, SQLSTATE=321, SYSTEM_USER=322, TEMPORARY=323, 
		TIMEZONE_HOUR=324, TIMEZONE_MINUTE=325, TRAILING=326, TRANSACTION=327, 
		TRANSLATE=328, TRANSLATION=329, UNKNOWN=330, UPPER=331, USAGE=332, USER=333, 
		VALUE=334, VARYING=335, WHENEVER=336, WORK=337, WRITE=338, ZONE=339, IDENTIFIER_=340, 
		STRING_=341, NUMBER_=342, HEX_DIGIT_=343, BIT_NUM_=344;
	public static final int
		RULE_execute = 0, RULE_createTable = 1, RULE_alterTable = 2, RULE_dropTable = 3, 
		RULE_createDatabase = 4, RULE_dropDatabase = 5, RULE_createView = 6, RULE_dropView = 7, 
		RULE_createTableSpecification = 8, RULE_createDefinitionClause = 9, RULE_createDatabaseSpecification_ = 10, 
		RULE_createDefinition = 11, RULE_columnDefinition = 12, RULE_dataTypeOption = 13, 
		RULE_checkConstraintDefinition = 14, RULE_referenceDefinition = 15, RULE_referenceOption = 16, 
		RULE_keyParts = 17, RULE_keyPart = 18, RULE_constraintDefinition = 19, 
		RULE_primaryKeyOption = 20, RULE_primaryKey = 21, RULE_uniqueOption = 22, 
		RULE_foreignKeyOption = 23, RULE_createLikeClause = 24, RULE_alterDefinitionClause = 25, 
		RULE_addColumnSpecification = 26, RULE_modifyColumnSpecification = 27, 
		RULE_dropColumnSpecification = 28, RULE_addConstraintSpecification = 29, 
		RULE_dropConstraintSpecification = 30, RULE_insert = 31, RULE_insertValuesClause = 32, 
		RULE_insertSelectClause = 33, RULE_update = 34, RULE_assignment = 35, 
		RULE_setAssignmentsClause = 36, RULE_assignmentValues = 37, RULE_assignmentValue = 38, 
		RULE_blobValue = 39, RULE_delete = 40, RULE_singleTableClause = 41, RULE_select = 42, 
		RULE_combineClause = 43, RULE_selectClause = 44, RULE_selectSpecification = 45, 
		RULE_duplicateSpecification = 46, RULE_projections = 47, RULE_projection = 48, 
		RULE_alias = 49, RULE_unqualifiedShorthand = 50, RULE_qualifiedShorthand = 51, 
		RULE_fromClause = 52, RULE_tableReferences = 53, RULE_escapedTableReference = 54, 
		RULE_tableReference = 55, RULE_tableFactor = 56, RULE_joinedTable = 57, 
		RULE_joinSpecification = 58, RULE_whereClause = 59, RULE_groupByClause = 60, 
		RULE_havingClause = 61, RULE_limitClause = 62, RULE_limitRowCount = 63, 
		RULE_limitOffset = 64, RULE_subquery = 65, RULE_parameterMarker = 66, 
		RULE_literals = 67, RULE_stringLiterals = 68, RULE_numberLiterals = 69, 
		RULE_dateTimeLiterals = 70, RULE_hexadecimalLiterals = 71, RULE_bitValueLiterals = 72, 
		RULE_booleanLiterals = 73, RULE_nullValueLiterals = 74, RULE_identifier = 75, 
		RULE_unreservedWord = 76, RULE_variable = 77, RULE_schemaName = 78, RULE_tableName = 79, 
		RULE_columnName = 80, RULE_viewName = 81, RULE_owner = 82, RULE_name = 83, 
		RULE_constraintName = 84, RULE_columnNames = 85, RULE_tableNames = 86, 
		RULE_characterSetName = 87, RULE_expr = 88, RULE_andOperator = 89, RULE_orOperator = 90, 
		RULE_notOperator = 91, RULE_booleanPrimary = 92, RULE_comparisonOperator = 93, 
		RULE_predicate = 94, RULE_bitExpr = 95, RULE_simpleExpr = 96, RULE_functionCall = 97, 
		RULE_aggregationFunction = 98, RULE_aggregationFunctionName = 99, RULE_distinct = 100, 
		RULE_specialFunction = 101, RULE_castFunction = 102, RULE_convertFunction = 103, 
		RULE_positionFunction = 104, RULE_substringFunction = 105, RULE_extractFunction = 106, 
		RULE_trimFunction = 107, RULE_regularFunction = 108, RULE_regularFunctionName = 109, 
		RULE_matchExpression = 110, RULE_caseExpression = 111, RULE_caseWhen = 112, 
		RULE_caseElse = 113, RULE_intervalExpression = 114, RULE_intervalUnit = 115, 
		RULE_orderByClause = 116, RULE_orderByItem = 117, RULE_dataType = 118, 
		RULE_dataTypeName = 119, RULE_dataTypeLength = 120, RULE_characterSet = 121, 
		RULE_collateClause = 122, RULE_ignoredIdentifier = 123, RULE_dropBehaviour = 124, 
		RULE_setTransaction = 125, RULE_commit = 126, RULE_rollback = 127, RULE_levelOfIsolation = 128, 
		RULE_grant = 129, RULE_revoke = 130, RULE_privilegeClause = 131, RULE_privileges = 132, 
		RULE_privilegeType = 133, RULE_grantee = 134, RULE_onObjectClause = 135, 
		RULE_objectType = 136, RULE_privilegeLevel = 137;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createTable", "alterTable", "dropTable", "createDatabase", 
			"dropDatabase", "createView", "dropView", "createTableSpecification", 
			"createDefinitionClause", "createDatabaseSpecification_", "createDefinition", 
			"columnDefinition", "dataTypeOption", "checkConstraintDefinition", "referenceDefinition", 
			"referenceOption", "keyParts", "keyPart", "constraintDefinition", "primaryKeyOption", 
			"primaryKey", "uniqueOption", "foreignKeyOption", "createLikeClause", 
			"alterDefinitionClause", "addColumnSpecification", "modifyColumnSpecification", 
			"dropColumnSpecification", "addConstraintSpecification", "dropConstraintSpecification", 
			"insert", "insertValuesClause", "insertSelectClause", "update", "assignment", 
			"setAssignmentsClause", "assignmentValues", "assignmentValue", "blobValue", 
			"delete", "singleTableClause", "select", "combineClause", "selectClause", 
			"selectSpecification", "duplicateSpecification", "projections", "projection", 
			"alias", "unqualifiedShorthand", "qualifiedShorthand", "fromClause", 
			"tableReferences", "escapedTableReference", "tableReference", "tableFactor", 
			"joinedTable", "joinSpecification", "whereClause", "groupByClause", "havingClause", 
			"limitClause", "limitRowCount", "limitOffset", "subquery", "parameterMarker", 
			"literals", "stringLiterals", "numberLiterals", "dateTimeLiterals", "hexadecimalLiterals", 
			"bitValueLiterals", "booleanLiterals", "nullValueLiterals", "identifier", 
			"unreservedWord", "variable", "schemaName", "tableName", "columnName", 
			"viewName", "owner", "name", "constraintName", "columnNames", "tableNames", 
			"characterSetName", "expr", "andOperator", "orOperator", "notOperator", 
			"booleanPrimary", "comparisonOperator", "predicate", "bitExpr", "simpleExpr", 
			"functionCall", "aggregationFunction", "aggregationFunctionName", "distinct", 
			"specialFunction", "castFunction", "convertFunction", "positionFunction", 
			"substringFunction", "extractFunction", "trimFunction", "regularFunction", 
			"regularFunctionName", "matchExpression", "caseExpression", "caseWhen", 
			"caseElse", "intervalExpression", "intervalUnit", "orderByClause", "orderByItem", 
			"dataType", "dataTypeName", "dataTypeLength", "characterSet", "collateClause", 
			"ignoredIdentifier", "dropBehaviour", "setTransaction", "commit", "rollback", 
			"levelOfIsolation", "grant", "revoke", "privilegeClause", "privileges", 
			"privilegeType", "grantee", "onObjectClause", "objectType", "privilegeLevel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", 
			"'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", 
			"'<=>'", "'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'?'", "'@'", 
			"';'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INLINE_COMMENT", "AND_", "CONCAT_", "NOT_", "TILDE_", "VERTICAL_BAR_", 
			"AMPERSAND_", "SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", 
			"MOD_", "COLON_", "PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", 
			"DOT_", "DOT_ASTERISK_", "SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", 
			"LT_", "LTE_", "POUND_", "LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", 
			"COMMA_", "DQ_", "SQ_", "QUESTION_", "AT_", "SEMI_", "WS", "SELECT", 
			"INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", "DROP", "TRUNCATE", 
			"SCHEMA", "GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", "INDEX", 
			"CONSTRAINT", "PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", "PRECISION", 
			"FUNCTION", "TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", "WITH", 
			"UNION", "DISTINCT", "CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", "FROM", 
			"NATURAL", "JOIN", "FULL", "INNER", "OUTER", "LEFT", "RIGHT", "CROSS", 
			"USING", "WHERE", "AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", "AND", 
			"OR", "IS", "NOT", "NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", "IN", 
			"ALL", "ANY", "LIKE", "ORDER", "GROUP", "BY", "ASC", "DESC", "HAVING", 
			"LIMIT", "OFFSET", "BEGIN", "COMMIT", "ROLLBACK", "SAVEPOINT", "BOOLEAN", 
			"DOUBLE", "CHAR", "CHARACTER", "ARRAY", "INTERVAL", "DATE", "TIME", "TIMESTAMP", 
			"LOCALTIME", "LOCALTIMESTAMP", "YEAR", "QUARTER", "MONTH", "WEEK", "DAY", 
			"HOUR", "MINUTE", "SECOND", "MICROSECOND", "MAX", "MIN", "SUM", "COUNT", 
			"AVG", "DEFAULT", "CURRENT", "ENABLE", "DISABLE", "CALL", "INSTANCE", 
			"PRESERVE", "DO", "DEFINER", "CURRENT_USER", "SQL", "CASCADED", "LOCAL", 
			"CLOSE", "OPEN", "NEXT", "NAME", "COLLATION", "NAMES", "INTEGER", "REAL", 
			"DECIMAL", "TYPE", "VARCHAR", "FLOAT", "FOR_GENERATOR", "ADA", "C92", 
			"CATALOG_NAME", "CHARACTER_SET_CATALOG", "CHARACTER_SET_NAME", "CHARACTER_SET_SCHEMA", 
			"CLASS_ORIGIN", "COBOL", "COLLATION_CATALOG", "COLLATION_NAME", "COLLATION_SCHEMA", 
			"COLUMN_NAME", "COMMAND_FUNCTION", "COMMITTED", "CONDITION_NUMBER", "CONNECTION_NAME", 
			"CONSTRAINT_CATALOG", "CONSTRAINT_NAME", "CONSTRAINT_SCHEMA", "CURSOR_NAME", 
			"DATA", "DATETIME_INTERVAL_CODE", "DATETIME_INTERVAL_PRECISION", "DYNAMIC_FUNCTION", 
			"FORTRAN", "LENGTH", "MESSAGE_LENGTH", "MESSAGE_OCTET_LENGTH", "MESSAGE_TEXT", 
			"MORE92", "MUMPS", "NULLABLE", "NUMBER", "PASCAL", "PLI", "REPEATABLE", 
			"RETURNED_LENGTH", "RETURNED_OCTET_LENGTH", "RETURNED_SQLSTATE", "ROW_COUNT", 
			"SCALE", "SCHEMA_NAME", "SERIALIZABLE", "SERVER_NAME", "SUBCLASS_ORIGIN", 
			"TABLE_NAME", "UNCOMMITTED", "UNNAMED", "ABSOLUTE", "ACTION", "ALLOCATE", 
			"ARE", "ASSERTION", "AT", "AUTHORIZATION", "BIT", "BIT_LENGTH", "BOTH", 
			"CASCADE", "CATALOG", "CHAR_LENGTH", "CHARACTER_LENGTH", "CHECK", "COALESCE", 
			"COLLATE", "CONNECT", "CONNECTION", "CONSTRAINTS", "CONTINUE", "CONVERT", 
			"CORRESPONDING", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURSOR", "DEALLOCATE", "DEC", "DECLARE", "DEFERRABLE", "DEFERRED", "DESCRIBE", 
			"DESCRIPTOR", "DIAGNOSTICS", "DISCONNECT", "DOMAIN", "END", "END_EXEC", 
			"ESCAPE", "EXCEPT", "EXCEPTION", "EXEC", "EXECUTE", "EXTERNAL", "EXTRACT", 
			"FETCH", "FIRST", "FOUND", "GET", "GLOBAL", "GO", "GOTO", "IDENTITY", 
			"IMMEDIATE", "INDICATOR", "INITIALLY", "INPUT", "INSENSITIVE", "INTERSECT", 
			"ISOLATION", "LANGUAGE", "LAST", "LEADING", "LEVEL", "LOWER", "MATCH", 
			"MODULE", "NATIONAL", "NCHAR", "NO", "NULLIF", "NUMERIC", "OCTET_LENGTH", 
			"OF", "ONLY", "OPTION", "OUTPUT", "OVERLAPS", "PAD", "PARTIAL", "PREPARE", 
			"PRIOR", "PRIVILEGES", "PUBLIC", "READ", "REFERENCES", "RELATIVE", "RESTRICT", 
			"ROWS", "SCROLL", "SECTION", "SESSION", "SESSION_USER", "SIZE", "SMALLINT", 
			"SOME", "SPACE", "SQLCODE", "SQLERROR", "SQLSTATE", "SYSTEM_USER", "TEMPORARY", 
			"TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TRAILING", "TRANSACTION", "TRANSLATE", 
			"TRANSLATION", "UNKNOWN", "UPPER", "USAGE", "USER", "VALUE", "VARYING", 
			"WHENEVER", "WORK", "WRITE", "ZONE", "IDENTIFIER_", "STRING_", "NUMBER_", 
			"HEX_DIGIT_", "BIT_NUM_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL92Statement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQL92StatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQL92StatementParser.EOF, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public DropViewContext dropView() {
			return getRuleContext(DropViewContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQL92StatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(276);
				select();
				}
				break;
			case 2:
				{
				setState(277);
				insert();
				}
				break;
			case 3:
				{
				setState(278);
				update();
				}
				break;
			case 4:
				{
				setState(279);
				delete();
				}
				break;
			case 5:
				{
				setState(280);
				createDatabase();
				}
				break;
			case 6:
				{
				setState(281);
				dropDatabase();
				}
				break;
			case 7:
				{
				setState(282);
				createTable();
				}
				break;
			case 8:
				{
				setState(283);
				alterTable();
				}
				break;
			case 9:
				{
				setState(284);
				dropTable();
				}
				break;
			case 10:
				{
				setState(285);
				createView();
				}
				break;
			case 11:
				{
				setState(286);
				dropView();
				}
				break;
			case 12:
				{
				setState(287);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(288);
				commit();
				}
				break;
			case 14:
				{
				setState(289);
				rollback();
				}
				break;
			case 15:
				{
				setState(290);
				grant();
				}
				break;
			case 16:
				{
				setState(291);
				revoke();
				}
				break;
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(294);
				match(SEMI_);
				}
			}

			setState(297);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQL92StatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClauseContext createDefinitionClause() {
			return getRuleContext(CreateDefinitionClauseContext.class,0);
		}
		public CreateLikeClauseContext createLikeClause() {
			return getRuleContext(CreateLikeClauseContext.class,0);
		}
		public CreateTableSpecificationContext createTableSpecification() {
			return getRuleContext(CreateTableSpecificationContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(CREATE);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(300);
				createTableSpecification();
				}
			}

			setState(303);
			match(TABLE);
			setState(304);
			tableName();
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(305);
				createDefinitionClause();
				}
				break;
			case 2:
				{
				setState(306);
				createLikeClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQL92StatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterDefinitionClauseContext alterDefinitionClause() {
			return getRuleContext(AlterDefinitionClauseContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAlterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(ALTER);
			setState(310);
			match(TABLE);
			setState(311);
			tableName();
			setState(312);
			alterDefinitionClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(DROP);
			setState(315);
			match(TABLE);
			setState(316);
			tableNames();
			setState(317);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQL92StatementParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQL92StatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public List<CreateDatabaseSpecification_Context> createDatabaseSpecification_() {
			return getRuleContexts(CreateDatabaseSpecification_Context.class);
		}
		public CreateDatabaseSpecification_Context createDatabaseSpecification_(int i) {
			return getRuleContext(CreateDatabaseSpecification_Context.class,i);
		}
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(CREATE);
			setState(320);
			match(SCHEMA);
			setState(321);
			schemaName();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT) {
				{
				{
				setState(322);
				createDatabaseSpecification_();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SQL92StatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(DROP);
			setState(329);
			match(SCHEMA);
			setState(330);
			schemaName();
			setState(331);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQL92StatementParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SQL92StatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode WITH() { return getToken(SQL92StatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(SQL92StatementParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(SQL92StatementParser.OPTION, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode CASCADED() { return getToken(SQL92StatementParser.CASCADED, 0); }
		public TerminalNode LOCAL() { return getToken(SQL92StatementParser.LOCAL, 0); }
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(CREATE);
			setState(334);
			match(VIEW);
			setState(335);
			viewName();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(336);
				match(LP_);
				setState(337);
				identifier();
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(338);
					match(COMMA_);
					setState(339);
					identifier();
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				match(RP_);
				}
			}

			setState(349);
			match(AS);
			setState(350);
			select();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(351);
				match(WITH);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADED || _la==LOCAL) {
					{
					setState(352);
					_la = _input.LA(1);
					if ( !(_la==CASCADED || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(355);
				match(CHECK);
				setState(356);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropViewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SQL92StatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public DropViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropViewContext dropView() throws RecognitionException {
		DropViewContext _localctx = new DropViewContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dropView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(DROP);
			setState(360);
			match(VIEW);
			setState(361);
			viewName();
			setState(362);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableSpecificationContext extends ParserRuleContext {
		public TerminalNode TEMPORARY() { return getToken(SQL92StatementParser.TEMPORARY, 0); }
		public TerminalNode GLOBAL() { return getToken(SQL92StatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(SQL92StatementParser.LOCAL, 0); }
		public CreateTableSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateTableSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateTableSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateTableSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpecificationContext createTableSpecification() throws RecognitionException {
		CreateTableSpecificationContext _localctx = new CreateTableSpecificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==GLOBAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(365);
			match(TEMPORARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDefinitionClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateDefinitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateDefinitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createDefinitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(LP_);
			setState(368);
			createDefinition();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(369);
				match(COMMA_);
				setState(370);
				createDefinition();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDatabaseSpecification_Context extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public TerminalNode CHARACTER() { return getToken(SQL92StatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public CreateDatabaseSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseSpecification_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateDatabaseSpecification_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateDatabaseSpecification_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDatabaseSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseSpecification_Context createDatabaseSpecification_() throws RecognitionException {
		CreateDatabaseSpecification_Context _localctx = new CreateDatabaseSpecification_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_createDatabaseSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(DEFAULT);
			setState(379);
			match(CHARACTER);
			setState(380);
			match(SET);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(381);
				match(EQ_);
				}
			}

			setState(384);
			characterSetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public CheckConstraintDefinitionContext checkConstraintDefinition() {
			return getRuleContext(CheckConstraintDefinitionContext.class,0);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createDefinition);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				constraintDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				checkConstraintDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<DataTypeOptionContext> dataTypeOption() {
			return getRuleContexts(DataTypeOptionContext.class);
		}
		public DataTypeOptionContext dataTypeOption(int i) {
			return getRuleContext(DataTypeOptionContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			columnName();
			setState(392);
			dataType();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2017612633061982208L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 140737488355331L) != 0) || _la==CHECK || _la==COLLATE || _la==REFERENCES || _la==STRING_) {
				{
				{
				setState(393);
				dataTypeOption();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeOptionContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(SQL92StatementParser.KEY, 0); }
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public CheckConstraintDefinitionContext checkConstraintDefinition() {
			return getRuleContext(CheckConstraintDefinitionContext.class,0);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public DataTypeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDataTypeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDataTypeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataTypeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeOptionContext dataTypeOption() throws RecognitionException {
		DataTypeOptionContext _localctx = new DataTypeOptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataTypeOption);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(UNIQUE);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(401);
					match(KEY);
					}
				}

				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(404);
					match(NOT);
					}
				}

				setState(407);
				match(NULL);
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				collateClause();
				}
				break;
			case CONSTRAINT:
			case CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				checkConstraintDefinition();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(410);
				referenceDefinition();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				match(DEFAULT);
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(412);
					literals();
					}
					break;
				case 2:
					{
					setState(413);
					expr(0);
					}
					break;
				}
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 8);
				{
				setState(416);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CheckConstraintDefinitionContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SQL92StatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQL92StatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public CheckConstraintDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraintDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCheckConstraintDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCheckConstraintDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCheckConstraintDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConstraintDefinitionContext checkConstraintDefinition() throws RecognitionException {
		CheckConstraintDefinitionContext _localctx = new CheckConstraintDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_checkConstraintDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(419);
				match(CONSTRAINT);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_) {
					{
					setState(420);
					ignoredIdentifier();
					}
				}

				}
			}

			setState(425);
			match(CHECK);
			setState(426);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceDefinitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQL92StatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public KeyPartsContext keyParts() {
			return getRuleContext(KeyPartsContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(SQL92StatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(SQL92StatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(SQL92StatementParser.PARTIAL, 0); }
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public List<TerminalNode> ON() { return getTokens(SQL92StatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQL92StatementParser.ON, i);
		}
		public List<ReferenceOptionContext> referenceOption() {
			return getRuleContexts(ReferenceOptionContext.class);
		}
		public ReferenceOptionContext referenceOption(int i) {
			return getRuleContext(ReferenceOptionContext.class,i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(SQL92StatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(SQL92StatementParser.UPDATE, i);
		}
		public List<TerminalNode> DELETE() { return getTokens(SQL92StatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(SQL92StatementParser.DELETE, i);
		}
		public ReferenceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterReferenceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitReferenceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitReferenceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceDefinitionContext referenceDefinition() throws RecognitionException {
		ReferenceDefinitionContext _localctx = new ReferenceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_referenceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(REFERENCES);
			setState(429);
			tableName();
			setState(430);
			keyParts();
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(431);
				match(MATCH);
				setState(432);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(433);
				match(MATCH);
				setState(434);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(435);
				match(MATCH);
				setState(436);
				match(UNIQUE);
				}
				break;
			}
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(439);
				match(ON);
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				referenceOption();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceOptionContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(SQL92StatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SQL92StatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(SQL92StatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQL92StatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public ReferenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterReferenceOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitReferenceOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitReferenceOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceOptionContext referenceOption() throws RecognitionException {
		ReferenceOptionContext _localctx = new ReferenceOptionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_referenceOption);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(SET);
				setState(450);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(NO);
				setState(452);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				match(SET);
				setState(454);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyPartsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<KeyPartContext> keyPart() {
			return getRuleContexts(KeyPartContext.class);
		}
		public KeyPartContext keyPart(int i) {
			return getRuleContext(KeyPartContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public KeyPartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyParts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterKeyParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitKeyParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitKeyParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyPartsContext keyParts() throws RecognitionException {
		KeyPartsContext _localctx = new KeyPartsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keyParts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(LP_);
			setState(458);
			keyPart();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(459);
				match(COMMA_);
				setState(460);
				keyPart();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyPartContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQL92StatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQL92StatementParser.DESC, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQL92StatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public KeyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterKeyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitKeyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitKeyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyPartContext keyPart() throws RecognitionException {
		KeyPartContext _localctx = new KeyPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_keyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(468);
				columnName();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(469);
					match(LP_);
					setState(470);
					match(NUMBER_);
					setState(471);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				{
				setState(474);
				expr(0);
				}
				break;
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintDefinitionContext extends ParserRuleContext {
		public PrimaryKeyOptionContext primaryKeyOption() {
			return getRuleContext(PrimaryKeyOptionContext.class,0);
		}
		public UniqueOptionContext uniqueOption() {
			return getRuleContext(UniqueOptionContext.class,0);
		}
		public ForeignKeyOptionContext foreignKeyOption() {
			return getRuleContext(ForeignKeyOptionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQL92StatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ConstraintDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterConstraintDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitConstraintDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitConstraintDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintDefinitionContext constraintDefinition() throws RecognitionException {
		ConstraintDefinitionContext _localctx = new ConstraintDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constraintDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(480);
				match(CONSTRAINT);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_) {
					{
					setState(481);
					constraintName();
					}
				}

				}
			}

			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(486);
				primaryKeyOption();
				}
				break;
			case UNIQUE:
				{
				setState(487);
				uniqueOption();
				}
				break;
			case FOREIGN:
				{
				setState(488);
				foreignKeyOption();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyOptionContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPrimaryKeyOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPrimaryKeyOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrimaryKeyOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyOptionContext primaryKeyOption() throws RecognitionException {
		PrimaryKeyOptionContext _localctx = new PrimaryKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primaryKeyOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			primaryKey();
			setState(492);
			columnNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQL92StatementParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQL92StatementParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(PRIMARY);
			setState(495);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueOptionContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public KeyPartsContext keyParts() {
			return getRuleContext(KeyPartsContext.class,0);
		}
		public UniqueOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterUniqueOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitUniqueOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUniqueOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueOptionContext uniqueOption() throws RecognitionException {
		UniqueOptionContext _localctx = new UniqueOptionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uniqueOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(UNIQUE);
			setState(498);
			keyParts();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForeignKeyOptionContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(SQL92StatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQL92StatementParser.KEY, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public ForeignKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterForeignKeyOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitForeignKeyOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitForeignKeyOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyOptionContext foreignKeyOption() throws RecognitionException {
		ForeignKeyOptionContext _localctx = new ForeignKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_foreignKeyOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(FOREIGN);
			setState(501);
			match(KEY);
			setState(502);
			columnNames();
			setState(503);
			referenceDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateLikeClauseContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(SQL92StatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public CreateLikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLikeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCreateLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCreateLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateLikeClauseContext createLikeClause() throws RecognitionException {
		CreateLikeClauseContext _localctx = new CreateLikeClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_createLikeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(505);
				match(LP_);
				}
			}

			setState(508);
			match(LIKE);
			setState(509);
			tableName();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(510);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterDefinitionClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public DropConstraintSpecificationContext dropConstraintSpecification() {
			return getRuleContext(DropConstraintSpecificationContext.class,0);
		}
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAlterDefinitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAlterDefinitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alterDefinitionClause);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				modifyColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				dropColumnSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				dropConstraintSpecification();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQL92StatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQL92StatementParser.COLUMN, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAddColumnSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAddColumnSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(ADD);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(521);
				match(COLUMN);
				}
			}

			setState(524);
			columnDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQL92StatementParser.ALTER, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQL92StatementParser.COLUMN, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterModifyColumnSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitModifyColumnSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ALTER);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(527);
				match(COLUMN);
				}
			}

			setState(530);
			columnDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQL92StatementParser.COLUMN, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDropColumnSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDropColumnSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(DROP);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(533);
				match(COLUMN);
				}
			}

			setState(536);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQL92StatementParser.ADD, 0); }
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAddConstraintSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAddConstraintSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAddConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_addConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(ADD);
			setState(539);
			constraintDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public DropConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDropConstraintSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDropConstraintSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintSpecificationContext dropConstraintSpecification() throws RecognitionException {
		DropConstraintSpecificationContext _localctx = new DropConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dropConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(DROP);
			setState(542);
			constraintDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQL92StatementParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SQL92StatementParser.INTO, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(INSERT);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(545);
				match(INTO);
				}
			}

			setState(548);
			tableName();
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(549);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(550);
				insertSelectClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertValuesClauseContext extends ParserRuleContext {
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(SQL92StatementParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(SQL92StatementParser.VALUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterInsertValuesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitInsertValuesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_) {
				{
				setState(553);
				columnNames();
				}
			}

			setState(556);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(557);
			assignmentValues();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(558);
				match(COMMA_);
				setState(559);
				assignmentValues();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterInsertSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitInsertSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitInsertSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_) {
				{
				setState(565);
				columnNames();
				}
			}

			setState(568);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQL92StatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(UPDATE);
			setState(571);
			tableReferences();
			setState(572);
			setAssignmentsClause();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(573);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SQL92StatementParser.VALUES, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			columnName();
			setState(577);
			match(EQ_);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(578);
				match(VALUES);
				}
			}

			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(581);
				match(LP_);
				}
				break;
			}
			setState(584);
			assignmentValue();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(585);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSetAssignmentsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSetAssignmentsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(SET);
			setState(589);
			assignment();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(590);
				match(COMMA_);
				setState(591);
				assignment();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAssignmentValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAssignmentValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignmentValues);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(LP_);
				setState(598);
				assignmentValue();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(599);
					match(COMMA_);
					setState(600);
					assignmentValue();
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(LP_);
				setState(609);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public BlobValueContext blobValue() {
			return getRuleContext(BlobValueContext.class,0);
		}
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignmentValue);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(DEFAULT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				blobValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlobValueContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public BlobValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blobValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterBlobValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitBlobValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBlobValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlobValueContext blobValue() throws RecognitionException {
		BlobValueContext _localctx = new BlobValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blobValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQL92StatementParser.DELETE, 0); }
		public SingleTableClauseContext singleTableClause() {
			return getRuleContext(SingleTableClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(DELETE);
			setState(620);
			singleTableClause();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(621);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSingleTableClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSingleTableClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(FROM);
			setState(625);
			tableName();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
				{
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(626);
					match(AS);
					}
				}

				setState(629);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public CombineClauseContext combineClause() {
			return getRuleContext(CombineClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			combineClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombineClauseContext extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(SQL92StatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SQL92StatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SQL92StatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SQL92StatementParser.ALL, i);
		}
		public CombineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCombineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCombineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCombineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombineClauseContext combineClause() throws RecognitionException {
		CombineClauseContext _localctx = new CombineClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_combineClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			selectClause();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(635);
				match(UNION);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(636);
					match(ALL);
					}
				}

				setState(639);
				selectClause();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQL92StatementParser.SELECT, 0); }
		public ProjectionsContext projections() {
			return getRuleContext(ProjectionsContext.class,0);
		}
		public List<SelectSpecificationContext> selectSpecification() {
			return getRuleContexts(SelectSpecificationContext.class);
		}
		public SelectSpecificationContext selectSpecification(int i) {
			return getRuleContext(SelectSpecificationContext.class,i);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(SELECT);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISTINCT || _la==ALL) {
				{
				{
				setState(646);
				selectSpecification();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(652);
			projections();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(653);
				fromClause();
				}
			}

			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(656);
				whereClause();
				}
			}

			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(659);
				groupByClause();
				}
			}

			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(662);
				havingClause();
				}
			}

			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(665);
				orderByClause();
				}
			}

			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(668);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectSpecificationContext extends ParserRuleContext {
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
		}
		public SelectSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSelectSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSelectSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSelectSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecificationContext selectSpecification() throws RecognitionException {
		SelectSpecificationContext _localctx = new SelectSpecificationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selectSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			duplicateSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQL92StatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQL92StatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDuplicateSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDuplicateSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<ProjectionContext> projection() {
			return getRuleContexts(ProjectionContext.class);
		}
		public ProjectionContext projection(int i) {
			return getRuleContext(ProjectionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterProjections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitProjections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitProjections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_projections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(675);
				unqualifiedShorthand();
				}
				break;
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case POSITION:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case LOCAL:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case EXTRACT:
			case GLOBAL:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(676);
				projection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(679);
				match(COMMA_);
				setState(680);
				projection();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_projection);
		int _la;
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(686);
					columnName();
					}
					break;
				case 2:
					{
					setState(687);
					expr(0);
					}
					break;
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
					{
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(690);
						match(AS);
						}
					}

					setState(693);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				qualifiedShorthand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alias);
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterUnqualifiedShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitUnqualifiedShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedShorthandContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(SQL92StatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterQualifiedShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitQualifiedShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			identifier();
			setState(706);
			match(DOT_ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(FROM);
			setState(709);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferencesContext extends ParserRuleContext {
		public List<EscapedTableReferenceContext> escapedTableReference() {
			return getRuleContexts(EscapedTableReferenceContext.class);
		}
		public EscapedTableReferenceContext escapedTableReference(int i) {
			return getRuleContext(EscapedTableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterTableReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitTableReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			escapedTableReference();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(712);
				match(COMMA_);
				setState(713);
				escapedTableReference();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscapedTableReferenceContext extends ParserRuleContext {
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode LBE_() { return getToken(SQL92StatementParser.LBE_, 0); }
		public TerminalNode RBE_() { return getToken(SQL92StatementParser.RBE_, 0); }
		public EscapedTableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedTableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterEscapedTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitEscapedTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitEscapedTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapedTableReferenceContext escapedTableReference() throws RecognitionException {
		EscapedTableReferenceContext _localctx = new EscapedTableReferenceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_escapedTableReference);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				tableReference();
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(LBE_);
				setState(721);
				tableReference();
				setState(722);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferenceContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			tableFactor();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 235L) != 0)) {
				{
				{
				setState(727);
				joinedTable();
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterTableFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitTableFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tableFactor);
		int _la;
		try {
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				tableName();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
					{
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(734);
						match(AS);
						}
					}

					setState(737);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				subquery();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(741);
					match(AS);
					}
				}

				setState(744);
				alias();
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_ || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0) || _la==IDENTIFIER_) {
					{
					setState(745);
					columnNames();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				match(LP_);
				setState(749);
				tableReferences();
				setState(750);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinedTableContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SQL92StatementParser.JOIN, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQL92StatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SQL92StatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SQL92StatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQL92StatementParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(SQL92StatementParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(SQL92StatementParser.NATURAL, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterJoinedTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitJoinedTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_joinedTable);
		int _la;
		try {
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(754);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(757);
				match(JOIN);
				}
				setState(759);
				tableFactor();
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(760);
					joinSpecification();
					}
				}

				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(764);
					match(OUTER);
					}
				}

				setState(767);
				match(JOIN);
				setState(768);
				tableFactor();
				setState(769);
				joinSpecification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				match(NATURAL);
				setState(775);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(772);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(773);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(774);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(777);
				match(JOIN);
				setState(778);
				tableFactor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQL92StatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQL92StatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterJoinSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitJoinSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_joinSpecification);
		try {
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(ON);
				setState(782);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(USING);
				setState(784);
				columnNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQL92StatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(WHERE);
			setState(788);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SQL92StatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQL92StatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(GROUP);
			setState(791);
			match(BY);
			setState(792);
			orderByItem();
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(793);
				match(COMMA_);
				setState(794);
				orderByItem();
				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SQL92StatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(HAVING);
			setState(801);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SQL92StatementParser.LIMIT, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(SQL92StatementParser.OFFSET, 0); }
		public LimitOffsetContext limitOffset() {
			return getRuleContext(LimitOffsetContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQL92StatementParser.COMMA_, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(LIMIT);
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(804);
					limitOffset();
					setState(805);
					match(COMMA_);
					}
					break;
				}
				setState(809);
				limitRowCount();
				}
				break;
			case 2:
				{
				setState(810);
				limitRowCount();
				setState(811);
				match(OFFSET);
				setState(812);
				limitOffset();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitRowCountContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterLimitRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitLimitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLimitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_limitRowCount);
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_:
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitOffsetContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterLimitOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitLimitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLimitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitOffsetContext limitOffset() throws RecognitionException {
		LimitOffsetContext _localctx = new LimitOffsetContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_limitOffset);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_:
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public CombineClauseContext combineClause() {
			return getRuleContext(CombineClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(LP_);
			setState(825);
			combineClause();
			setState(826);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(SQL92StatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterParameterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitParameterMarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_literals);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				stringLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				numberLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				dateTimeLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				hexadecimalLiterals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(834);
				bitValueLiterals();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(835);
				booleanLiterals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(836);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterStringLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitStringLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_stringLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(839);
				characterSetName();
				}
			}

			setState(842);
			match(STRING_);
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(843);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(SQL92StatementParser.NUMBER_, 0); }
		public TerminalNode PLUS_() { return getToken(SQL92StatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQL92StatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterNumberLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitNumberLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_ || _la==MINUS_) {
				{
				setState(846);
				_la = _input.LA(1);
				if ( !(_la==PLUS_ || _la==MINUS_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(849);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(SQL92StatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQL92StatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQL92StatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(SQL92StatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQL92StatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDateTimeLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDateTimeLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				_la = _input.LA(1);
				if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(852);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(LBE_);
				setState(854);
				identifier();
				setState(855);
				match(STRING_);
				setState(856);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(SQL92StatementParser.HEX_DIGIT_, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterHexadecimalLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitHexadecimalLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_hexadecimalLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(860);
				characterSetName();
				}
			}

			setState(863);
			match(HEX_DIGIT_);
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(864);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(SQL92StatementParser.BIT_NUM_, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterBitValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitBitValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_bitValueLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(867);
				characterSetName();
				}
			}

			setState(870);
			match(BIT_NUM_);
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(871);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQL92StatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQL92StatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterBooleanLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitBooleanLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterNullValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitNullValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQL92StatementParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifier);
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				match(IDENTIFIER_);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				unreservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnreservedWordContext extends ParserRuleContext {
		public TerminalNode ADA() { return getToken(SQL92StatementParser.ADA, 0); }
		public TerminalNode C92() { return getToken(SQL92StatementParser.C92, 0); }
		public TerminalNode CATALOG_NAME() { return getToken(SQL92StatementParser.CATALOG_NAME, 0); }
		public TerminalNode CHARACTER_SET_CATALOG() { return getToken(SQL92StatementParser.CHARACTER_SET_CATALOG, 0); }
		public TerminalNode CHARACTER_SET_NAME() { return getToken(SQL92StatementParser.CHARACTER_SET_NAME, 0); }
		public TerminalNode CHARACTER_SET_SCHEMA() { return getToken(SQL92StatementParser.CHARACTER_SET_SCHEMA, 0); }
		public TerminalNode CLASS_ORIGIN() { return getToken(SQL92StatementParser.CLASS_ORIGIN, 0); }
		public TerminalNode COBOL() { return getToken(SQL92StatementParser.COBOL, 0); }
		public TerminalNode COLLATION_CATALOG() { return getToken(SQL92StatementParser.COLLATION_CATALOG, 0); }
		public TerminalNode COLLATION_NAME() { return getToken(SQL92StatementParser.COLLATION_NAME, 0); }
		public TerminalNode COLLATION_SCHEMA() { return getToken(SQL92StatementParser.COLLATION_SCHEMA, 0); }
		public TerminalNode COLUMN_NAME() { return getToken(SQL92StatementParser.COLUMN_NAME, 0); }
		public TerminalNode COMMAND_FUNCTION() { return getToken(SQL92StatementParser.COMMAND_FUNCTION, 0); }
		public TerminalNode COMMITTED() { return getToken(SQL92StatementParser.COMMITTED, 0); }
		public TerminalNode CONDITION_NUMBER() { return getToken(SQL92StatementParser.CONDITION_NUMBER, 0); }
		public TerminalNode CONNECTION_NAME() { return getToken(SQL92StatementParser.CONNECTION_NAME, 0); }
		public TerminalNode CONSTRAINT_CATALOG() { return getToken(SQL92StatementParser.CONSTRAINT_CATALOG, 0); }
		public TerminalNode CONSTRAINT_NAME() { return getToken(SQL92StatementParser.CONSTRAINT_NAME, 0); }
		public TerminalNode CONSTRAINT_SCHEMA() { return getToken(SQL92StatementParser.CONSTRAINT_SCHEMA, 0); }
		public TerminalNode CURSOR_NAME() { return getToken(SQL92StatementParser.CURSOR_NAME, 0); }
		public TerminalNode DATA() { return getToken(SQL92StatementParser.DATA, 0); }
		public TerminalNode DATETIME_INTERVAL_CODE() { return getToken(SQL92StatementParser.DATETIME_INTERVAL_CODE, 0); }
		public TerminalNode DATETIME_INTERVAL_PRECISION() { return getToken(SQL92StatementParser.DATETIME_INTERVAL_PRECISION, 0); }
		public TerminalNode DYNAMIC_FUNCTION() { return getToken(SQL92StatementParser.DYNAMIC_FUNCTION, 0); }
		public TerminalNode FORTRAN() { return getToken(SQL92StatementParser.FORTRAN, 0); }
		public TerminalNode LENGTH() { return getToken(SQL92StatementParser.LENGTH, 0); }
		public TerminalNode MESSAGE_LENGTH() { return getToken(SQL92StatementParser.MESSAGE_LENGTH, 0); }
		public TerminalNode MESSAGE_OCTET_LENGTH() { return getToken(SQL92StatementParser.MESSAGE_OCTET_LENGTH, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(SQL92StatementParser.MESSAGE_TEXT, 0); }
		public TerminalNode MORE92() { return getToken(SQL92StatementParser.MORE92, 0); }
		public TerminalNode MUMPS() { return getToken(SQL92StatementParser.MUMPS, 0); }
		public TerminalNode NAME() { return getToken(SQL92StatementParser.NAME, 0); }
		public TerminalNode NULLABLE() { return getToken(SQL92StatementParser.NULLABLE, 0); }
		public TerminalNode NUMBER() { return getToken(SQL92StatementParser.NUMBER, 0); }
		public TerminalNode PASCAL() { return getToken(SQL92StatementParser.PASCAL, 0); }
		public TerminalNode PLI() { return getToken(SQL92StatementParser.PLI, 0); }
		public TerminalNode REPEATABLE() { return getToken(SQL92StatementParser.REPEATABLE, 0); }
		public TerminalNode RETURNED_LENGTH() { return getToken(SQL92StatementParser.RETURNED_LENGTH, 0); }
		public TerminalNode RETURNED_OCTET_LENGTH() { return getToken(SQL92StatementParser.RETURNED_OCTET_LENGTH, 0); }
		public TerminalNode RETURNED_SQLSTATE() { return getToken(SQL92StatementParser.RETURNED_SQLSTATE, 0); }
		public TerminalNode ROW_COUNT() { return getToken(SQL92StatementParser.ROW_COUNT, 0); }
		public TerminalNode SCALE() { return getToken(SQL92StatementParser.SCALE, 0); }
		public TerminalNode SCHEMA_NAME() { return getToken(SQL92StatementParser.SCHEMA_NAME, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SQL92StatementParser.SERIALIZABLE, 0); }
		public TerminalNode SERVER_NAME() { return getToken(SQL92StatementParser.SERVER_NAME, 0); }
		public TerminalNode SUBCLASS_ORIGIN() { return getToken(SQL92StatementParser.SUBCLASS_ORIGIN, 0); }
		public TerminalNode TABLE_NAME() { return getToken(SQL92StatementParser.TABLE_NAME, 0); }
		public TerminalNode TYPE() { return getToken(SQL92StatementParser.TYPE, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SQL92StatementParser.UNCOMMITTED, 0); }
		public TerminalNode UNNAMED() { return getToken(SQL92StatementParser.UNNAMED, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterUnreservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitUnreservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 288230376151710785L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> AT_() { return getTokens(SQL92StatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(SQL92StatementParser.AT_, i);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public TerminalNode GLOBAL() { return getToken(SQL92StatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(SQL92StatementParser.LOCAL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(884);
					match(AT_);
					}
					break;
				}
				setState(887);
				match(AT_);
				}
			}

			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(890);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==GLOBAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(893);
				match(DOT_);
				}
			}

			setState(896);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(900);
				owner();
				setState(901);
				match(DOT_);
				}
				break;
			}
			setState(905);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(907);
				owner();
				setState(908);
				match(DOT_);
				}
				break;
			}
			setState(912);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public ViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterViewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitViewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewNameContext viewName() throws RecognitionException {
		ViewNameContext _localctx = new ViewNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_viewName);
		try {
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(915);
					owner();
					setState(916);
					match(DOT_);
					}
					break;
				}
				setState(920);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OwnerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterOwner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitOwner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterConstraintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitConstraintName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitConstraintName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_columnNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(929);
				match(LP_);
				}
			}

			setState(932);
			columnName();
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(933);
					match(COMMA_);
					setState(934);
					columnName();
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(940);
				match(RP_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterTableNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitTableNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(943);
				match(LP_);
				}
			}

			setState(946);
			tableName();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(947);
				match(COMMA_);
				setState(948);
				tableName();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(954);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterSetNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQL92StatementParser.IDENTIFIER_, 0); }
		public CharacterSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCharacterSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCharacterSetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCharacterSetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetNameContext characterSetName() throws RecognitionException {
		CharacterSetNameContext _localctx = new CharacterSetNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_characterSetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public AndOperatorContext andOperator() {
			return getRuleContext(AndOperatorContext.class,0);
		}
		public OrOperatorContext orOperator() {
			return getRuleContext(OrOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(960);
				notOperator();
				setState(961);
				expr(3);
				}
				break;
			case 2:
				{
				setState(963);
				match(LP_);
				setState(964);
				expr(0);
				setState(965);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(967);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(978);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(970);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(971);
						andOperator();
						setState(972);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(974);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(975);
						orOperator();
						setState(976);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SQL92StatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(SQL92StatementParser.AND_, 0); }
		public AndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAndOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAndOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOperatorContext andOperator() throws RecognitionException {
		AndOperatorContext _localctx = new AndOperatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_andOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SQL92StatementParser.OR, 0); }
		public OrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitOrOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOrOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrOperatorContext orOperator() throws RecognitionException {
		OrOperatorContext _localctx = new OrOperatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_orOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(SQL92StatementParser.NOT_, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterNotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitNotOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_notOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQL92StatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQL92StatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQL92StatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQL92StatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(SQL92StatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQL92StatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQL92StatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterBooleanPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitBooleanPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(990);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(992);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(993);
						match(IS);
						setState(995);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(994);
							match(NOT);
							}
						}

						setState(997);
						_la = _input.LA(1);
						if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 7L) != 0) || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(998);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(999);
						match(SAFE_EQ_);
						setState(1000);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1001);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1002);
						comparisonOperator();
						setState(1003);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1005);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1006);
						comparisonOperator();
						setState(1007);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1008);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(SQL92StatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(SQL92StatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(SQL92StatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(SQL92StatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(SQL92StatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(SQL92StatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(SQL92StatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQL92StatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SQL92StatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SQL92StatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_predicate);
		int _la;
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				bitExpr(0);
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1018);
					match(NOT);
					}
				}

				setState(1021);
				match(IN);
				setState(1022);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				bitExpr(0);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1025);
					match(NOT);
					}
				}

				setState(1028);
				match(IN);
				setState(1029);
				match(LP_);
				setState(1030);
				expr(0);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1031);
					match(COMMA_);
					setState(1032);
					expr(0);
					}
					}
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1038);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				bitExpr(0);
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1041);
					match(NOT);
					}
				}

				setState(1044);
				match(BETWEEN);
				setState(1045);
				bitExpr(0);
				setState(1046);
				match(AND);
				setState(1047);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1049);
				bitExpr(0);
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1050);
					match(NOT);
					}
				}

				setState(1053);
				match(LIKE);
				setState(1054);
				simpleExpr(0);
				setState(1057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1055);
					match(ESCAPE);
					setState(1056);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1059);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(SQL92StatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(SQL92StatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(SQL92StatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(SQL92StatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(SQL92StatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQL92StatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(SQL92StatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(SQL92StatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(SQL92StatementParser.CARET_, 0); }
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitBitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1063);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1065);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1066);
						match(VERTICAL_BAR_);
						setState(1067);
						bitExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1068);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1069);
						match(AMPERSAND_);
						setState(1070);
						bitExpr(13);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1071);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1072);
						match(SIGNED_LEFT_SHIFT_);
						setState(1073);
						bitExpr(12);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1074);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1075);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1076);
						bitExpr(11);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1077);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1078);
						match(PLUS_);
						setState(1079);
						bitExpr(10);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1080);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1081);
						match(MINUS_);
						setState(1082);
						bitExpr(9);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1083);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1084);
						match(ASTERISK_);
						setState(1085);
						bitExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1086);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1087);
						match(SLASH_);
						setState(1088);
						bitExpr(7);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1089);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1090);
						match(MOD_);
						setState(1091);
						bitExpr(6);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1092);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1093);
						match(CARET_);
						setState(1094);
						bitExpr(5);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1095);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1096);
						match(PLUS_);
						setState(1097);
						intervalExpression();
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1098);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1099);
						match(MINUS_);
						setState(1100);
						intervalExpression();
						}
						break;
					}
					} 
				}
				setState(1105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode PLUS_() { return getToken(SQL92StatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQL92StatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(SQL92StatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(SQL92StatementParser.NOT_, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQL92StatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(SQL92StatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQL92StatementParser.RBE_, 0); }
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQL92StatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1107);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1108);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1109);
				literals();
				}
				break;
			case 4:
				{
				setState(1110);
				columnName();
				}
				break;
			case 5:
				{
				setState(1111);
				variable();
				}
				break;
			case 6:
				{
				setState(1112);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 24624L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1113);
				simpleExpr(7);
				}
				break;
			case 7:
				{
				setState(1114);
				match(LP_);
				setState(1115);
				expr(0);
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1116);
					match(COMMA_);
					setState(1117);
					expr(0);
					}
					}
					setState(1122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1123);
				match(RP_);
				}
				break;
			case 8:
				{
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1125);
					match(EXISTS);
					}
				}

				setState(1128);
				subquery();
				}
				break;
			case 9:
				{
				setState(1129);
				match(LBE_);
				setState(1130);
				identifier();
				setState(1131);
				expr(0);
				setState(1132);
				match(RBE_);
				}
				break;
			case 10:
				{
				setState(1134);
				matchExpression();
				}
				break;
			case 11:
				{
				setState(1135);
				caseExpression();
				}
				break;
			case 12:
				{
				setState(1136);
				intervalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(1139);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(1140);
					match(COLLATE);
					setState(1143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING_:
						{
						setState(1141);
						match(STRING_);
						}
						break;
					case NAME:
					case TYPE:
					case ADA:
					case C92:
					case CATALOG_NAME:
					case CHARACTER_SET_CATALOG:
					case CHARACTER_SET_NAME:
					case CHARACTER_SET_SCHEMA:
					case CLASS_ORIGIN:
					case COBOL:
					case COLLATION_CATALOG:
					case COLLATION_NAME:
					case COLLATION_SCHEMA:
					case COLUMN_NAME:
					case COMMAND_FUNCTION:
					case COMMITTED:
					case CONDITION_NUMBER:
					case CONNECTION_NAME:
					case CONSTRAINT_CATALOG:
					case CONSTRAINT_NAME:
					case CONSTRAINT_SCHEMA:
					case CURSOR_NAME:
					case DATA:
					case DATETIME_INTERVAL_CODE:
					case DATETIME_INTERVAL_PRECISION:
					case DYNAMIC_FUNCTION:
					case FORTRAN:
					case LENGTH:
					case MESSAGE_LENGTH:
					case MESSAGE_OCTET_LENGTH:
					case MESSAGE_TEXT:
					case MORE92:
					case MUMPS:
					case NULLABLE:
					case NUMBER:
					case PASCAL:
					case PLI:
					case REPEATABLE:
					case RETURNED_LENGTH:
					case RETURNED_OCTET_LENGTH:
					case RETURNED_SQLSTATE:
					case ROW_COUNT:
					case SCALE:
					case SCHEMA_NAME:
					case SERIALIZABLE:
					case SERVER_NAME:
					case SUBCLASS_ORIGIN:
					case TABLE_NAME:
					case UNCOMMITTED:
					case UNNAMED:
					case IDENTIFIER_:
						{
						setState(1142);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_functionCall);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				aggregationFunction();
				}
				break;
			case POSITION:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case CONVERT:
			case EXTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				specialFunction();
				}
				break;
			case IF:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				regularFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			aggregationFunctionName();
			setState(1156);
			match(LP_);
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1157);
				distinct();
				}
			}

			setState(1169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case POSITION:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case LOCAL:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case EXTRACT:
			case GLOBAL:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1160);
				expr(0);
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1161);
					match(COMMA_);
					setState(1162);
					expr(0);
					}
					}
					setState(1167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1168);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1171);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(SQL92StatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQL92StatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQL92StatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQL92StatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(SQL92StatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterAggregationFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitAggregationFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_la = _input.LA(1);
			if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SQL92StatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialFunctionContext extends ParserRuleContext {
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public ConvertFunctionContext convertFunction() {
			return getRuleContext(ConvertFunctionContext.class,0);
		}
		public PositionFunctionContext positionFunction() {
			return getRuleContext(PositionFunctionContext.class,0);
		}
		public SubstringFunctionContext substringFunction() {
			return getRuleContext(SubstringFunctionContext.class,0);
		}
		public ExtractFunctionContext extractFunction() {
			return getRuleContext(ExtractFunctionContext.class,0);
		}
		public TrimFunctionContext trimFunction() {
			return getRuleContext(TrimFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSpecialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSpecialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_specialFunction);
		try {
			setState(1183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				castFunction();
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				convertFunction();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1179);
				positionFunction();
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1180);
				substringFunction();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1181);
				extractFunction();
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 6);
				{
				setState(1182);
				trimFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SQL92StatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			match(CAST);
			setState(1186);
			match(LP_);
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1187);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1188);
				match(NULL);
				}
				break;
			}
			setState(1191);
			match(AS);
			setState(1192);
			dataType();
			setState(1193);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConvertFunctionContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(SQL92StatementParser.CONVERT, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQL92StatementParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ConvertFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterConvertFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitConvertFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitConvertFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertFunctionContext convertFunction() throws RecognitionException {
		ConvertFunctionContext _localctx = new ConvertFunctionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_convertFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(CONVERT);
			setState(1196);
			match(LP_);
			setState(1197);
			expr(0);
			setState(1198);
			match(USING);
			setState(1199);
			identifier();
			setState(1200);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionFunctionContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(SQL92StatementParser.POSITION, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(SQL92StatementParser.IN, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public PositionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPositionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPositionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPositionFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionFunctionContext positionFunction() throws RecognitionException {
		PositionFunctionContext _localctx = new PositionFunctionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_positionFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(POSITION);
			setState(1203);
			match(LP_);
			setState(1204);
			expr(0);
			setState(1205);
			match(IN);
			setState(1206);
			expr(0);
			setState(1207);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstringFunctionContext extends ParserRuleContext {
		public TerminalNode SUBSTRING() { return getToken(SQL92StatementParser.SUBSTRING, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQL92StatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQL92StatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode FOR() { return getToken(SQL92StatementParser.FOR, 0); }
		public SubstringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSubstringFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSubstringFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSubstringFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringFunctionContext substringFunction() throws RecognitionException {
		SubstringFunctionContext _localctx = new SubstringFunctionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_substringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(SUBSTRING);
			setState(1210);
			match(LP_);
			setState(1211);
			expr(0);
			setState(1212);
			match(FROM);
			setState(1213);
			match(NUMBER_);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1214);
				match(FOR);
				setState(1215);
				match(NUMBER_);
				}
			}

			setState(1218);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtractFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(SQL92StatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ExtractFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterExtractFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitExtractFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitExtractFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractFunctionContext extractFunction() throws RecognitionException {
		ExtractFunctionContext _localctx = new ExtractFunctionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_extractFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(EXTRACT);
			setState(1221);
			match(LP_);
			setState(1222);
			identifier();
			setState(1223);
			match(FROM);
			setState(1224);
			expr(0);
			setState(1225);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrimFunctionContext extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(SQL92StatementParser.TRIM, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(SQL92StatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQL92StatementParser.STRING_, i);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode LEADING() { return getToken(SQL92StatementParser.LEADING, 0); }
		public TerminalNode BOTH() { return getToken(SQL92StatementParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(SQL92StatementParser.TRAILING, 0); }
		public TrimFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterTrimFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitTrimFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTrimFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrimFunctionContext trimFunction() throws RecognitionException {
		TrimFunctionContext _localctx = new TrimFunctionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_trimFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(TRIM);
			setState(1228);
			match(LP_);
			setState(1229);
			_la = _input.LA(1);
			if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1230);
			match(STRING_);
			setState(1231);
			match(FROM);
			setState(1232);
			match(STRING_);
			setState(1233);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionContext extends ParserRuleContext {
		public RegularFunctionNameContext regularFunctionName() {
			return getRuleContext(RegularFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			regularFunctionName();
			setState(1236);
			match(LP_);
			setState(1246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case POSITION:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case LOCAL:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case EXTRACT:
			case GLOBAL:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1237);
				expr(0);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1238);
					match(COMMA_);
					setState(1239);
					expr(0);
					}
					}
					setState(1244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1245);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1248);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQL92StatementParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SQL92StatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQL92StatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQL92StatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SQL92StatementParser.INTERVAL, 0); }
		public RegularFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterRegularFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitRegularFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRegularFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionNameContext regularFunctionName() throws RecognitionException {
		RegularFunctionNameContext _localctx = new RegularFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_regularFunctionName);
		try {
			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				identifier();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				match(IF);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1252);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(1253);
				match(LOCALTIME);
				}
				break;
			case LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1254);
				match(LOCALTIMESTAMP);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1255);
				match(INTERVAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchExpressionContext extends ParserRuleContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(SQL92StatementParser.MATCH, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode PARTIAL() { return getToken(SQL92StatementParser.PARTIAL, 0); }
		public TerminalNode FULL() { return getToken(SQL92StatementParser.FULL, 0); }
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_matchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			literals();
			setState(1259);
			match(MATCH);
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1260);
				match(UNIQUE);
				}
			}

			setState(1263);
			_la = _input.LA(1);
			if ( !(_la==FULL || _la==PARTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1264);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SQL92StatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(SQL92StatementParser.END, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhenContext> caseWhen() {
			return getRuleContexts(CaseWhenContext.class);
		}
		public CaseWhenContext caseWhen(int i) {
			return getRuleContext(CaseWhenContext.class,i);
		}
		public CaseElseContext caseElse() {
			return getRuleContext(CaseElseContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(CASE);
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223371209536413648L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 567453555062210589L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & -2011037665L) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & 1152922672837984255L) != 0) || _la==GLOBAL || ((((_la - 340)) & ~0x3f) == 0 && ((1L << (_la - 340)) & 31L) != 0)) {
				{
				setState(1267);
				simpleExpr(0);
				}
			}

			setState(1271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1270);
				caseWhen();
				}
				}
				setState(1273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1275);
				caseElse();
				}
			}

			setState(1278);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SQL92StatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SQL92StatementParser.THEN, 0); }
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCaseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCaseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_caseWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(WHEN);
			setState(1281);
			expr(0);
			setState(1282);
			match(THEN);
			setState(1283);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SQL92StatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCaseElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCaseElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCaseElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElseContext caseElse() throws RecognitionException {
		CaseElseContext _localctx = new CaseElseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_caseElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(ELSE);
			setState(1286);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalExpressionContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SQL92StatementParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalUnitContext intervalUnit() {
			return getRuleContext(IntervalUnitContext.class,0);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterIntervalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitIntervalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_intervalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(INTERVAL);
			setState(1289);
			expr(0);
			setState(1290);
			intervalUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode MICROSECOND() { return getToken(SQL92StatementParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(SQL92StatementParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SQL92StatementParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(SQL92StatementParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SQL92StatementParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(SQL92StatementParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(SQL92StatementParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(SQL92StatementParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(SQL92StatementParser.YEAR, 0); }
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_intervalUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 511L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQL92StatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQL92StatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(ORDER);
			setState(1295);
			match(BY);
			setState(1296);
			orderByItem();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1297);
				match(COMMA_);
				setState(1298);
				orderByItem();
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQL92StatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQL92StatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				{
				setState(1304);
				columnName();
				}
				break;
			case PLUS_:
			case MINUS_:
			case NUMBER_:
				{
				setState(1305);
				numberLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1308);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSetContext characterSet() {
			return getRuleContext(CharacterSetContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(SQL92StatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQL92StatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_dataType);
		int _la;
		try {
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				dataTypeName();
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1312);
					dataTypeLength();
					}
				}

				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1315);
					characterSet();
					}
				}

				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1318);
					collateClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321);
				dataTypeName();
				setState(1322);
				match(LP_);
				setState(1323);
				match(STRING_);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1324);
					match(COMMA_);
					setState(1325);
					match(STRING_);
					}
					}
					setState(1330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1331);
				match(RP_);
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1332);
					characterSet();
					}
				}

				setState(1336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1335);
					collateClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(SQL92StatementParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(SQL92StatementParser.VARYING, 0); }
		public TerminalNode NATIONAL() { return getToken(SQL92StatementParser.NATIONAL, 0); }
		public TerminalNode CHAR() { return getToken(SQL92StatementParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(SQL92StatementParser.VARCHAR, 0); }
		public TerminalNode NCHAR() { return getToken(SQL92StatementParser.NCHAR, 0); }
		public TerminalNode BIT() { return getToken(SQL92StatementParser.BIT, 0); }
		public TerminalNode NUMERIC() { return getToken(SQL92StatementParser.NUMERIC, 0); }
		public TerminalNode DECIMAL() { return getToken(SQL92StatementParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(SQL92StatementParser.DEC, 0); }
		public TerminalNode INTEGER() { return getToken(SQL92StatementParser.INTEGER, 0); }
		public TerminalNode SMALLINT() { return getToken(SQL92StatementParser.SMALLINT, 0); }
		public TerminalNode FLOAT() { return getToken(SQL92StatementParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SQL92StatementParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(SQL92StatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(SQL92StatementParser.PRECISION, 0); }
		public TerminalNode DATE() { return getToken(SQL92StatementParser.DATE, 0); }
		public List<TerminalNode> TIME() { return getTokens(SQL92StatementParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(SQL92StatementParser.TIME, i);
		}
		public TerminalNode TIMESTAMP() { return getToken(SQL92StatementParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SQL92StatementParser.INTERVAL, 0); }
		public TerminalNode WITH() { return getToken(SQL92StatementParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(SQL92StatementParser.ZONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDataTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDataTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_dataTypeName);
		try {
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				match(CHARACTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				match(CHARACTER);
				setState(1342);
				match(VARYING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				match(NATIONAL);
				setState(1344);
				match(CHARACTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1345);
				match(NATIONAL);
				setState(1346);
				match(CHARACTER);
				setState(1347);
				match(VARYING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1348);
				match(CHAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1349);
				match(VARCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1350);
				match(NCHAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1351);
				match(NATIONAL);
				setState(1352);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1353);
				match(NATIONAL);
				setState(1354);
				match(CHAR);
				setState(1355);
				match(VARYING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1356);
				match(BIT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1357);
				match(BIT);
				setState(1358);
				match(VARYING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1359);
				match(NUMERIC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1360);
				match(DECIMAL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1361);
				match(DEC);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1362);
				match(INTEGER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1363);
				match(SMALLINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1364);
				match(FLOAT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1365);
				match(REAL);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1366);
				match(DOUBLE);
				setState(1367);
				match(PRECISION);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1368);
				match(DATE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1369);
				match(TIME);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1370);
				match(TIMESTAMP);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1371);
				match(INTERVAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1372);
				match(TIME);
				setState(1373);
				match(WITH);
				setState(1374);
				match(TIME);
				setState(1375);
				match(ZONE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1376);
				match(TIMESTAMP);
				setState(1377);
				match(WITH);
				setState(1378);
				match(TIME);
				setState(1379);
				match(ZONE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1380);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQL92StatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQL92StatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(SQL92StatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDataTypeLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDataTypeLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(LP_);
			setState(1384);
			match(NUMBER_);
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1385);
				match(COMMA_);
				setState(1386);
				match(NUMBER_);
				}
			}

			setState(1389);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(SQL92StatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(SQL92StatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public CharacterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCharacterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCharacterSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCharacterSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetContext characterSet() throws RecognitionException {
		CharacterSetContext _localctx = new CharacterSetContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_characterSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1392);
			match(SET);
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1393);
				match(EQ_);
				}
			}

			setState(1396);
			ignoredIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollateClauseContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(SQL92StatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCollateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCollateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCollateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_collateClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			match(COLLATE);
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1399);
				match(EQ_);
				}
			}

			setState(1404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(1402);
				match(STRING_);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				{
				setState(1403);
				ignoredIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IgnoredIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public IgnoredIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterIgnoredIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitIgnoredIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIgnoredIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifierContext ignoredIdentifier() throws RecognitionException {
		IgnoredIdentifierContext _localctx = new IgnoredIdentifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ignoredIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			identifier();
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1407);
				match(DOT_);
				setState(1408);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropBehaviourContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(SQL92StatementParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SQL92StatementParser.RESTRICT, 0); }
		public DropBehaviourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropBehaviour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterDropBehaviour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitDropBehaviour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropBehaviour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropBehaviourContext dropBehaviour() throws RecognitionException {
		DropBehaviourContext _localctx = new DropBehaviourContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_dropBehaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1411);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQL92StatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(SQL92StatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SQL92StatementParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterSetTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitSetTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(SET);
			setState(1415);
			match(TRANSACTION);
			setState(1416);
			match(ISOLATION);
			setState(1417);
			match(LEVEL);
			setState(1418);
			levelOfIsolation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(SQL92StatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(SQL92StatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LevelOfIsolationContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(SQL92StatementParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SQL92StatementParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(SQL92StatementParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(SQL92StatementParser.REPEATABLE, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SQL92StatementParser.SERIALIZABLE, 0); }
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterLevelOfIsolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitLevelOfIsolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLevelOfIsolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_levelOfIsolation);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				match(READ);
				setState(1425);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1426);
				match(READ);
				setState(1427);
				match(COMMITTED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1428);
				match(REPEATABLE);
				setState(1429);
				match(READ);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrantContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(SQL92StatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SQL92StatementParser.GRANT, i);
		}
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(SQL92StatementParser.TO, 0); }
		public List<GranteeContext> grantee() {
			return getRuleContexts(GranteeContext.class);
		}
		public GranteeContext grantee(int i) {
			return getRuleContext(GranteeContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode WITH() { return getToken(SQL92StatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SQL92StatementParser.OPTION, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(GRANT);
			setState(1434);
			privilegeClause();
			setState(1435);
			match(TO);
			setState(1436);
			grantee();
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1437);
				match(COMMA_);
				setState(1438);
				grantee();
				}
				}
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1444);
				match(WITH);
				setState(1445);
				match(GRANT);
				setState(1446);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(SQL92StatementParser.REVOKE, 0); }
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public List<GranteeContext> grantee() {
			return getRuleContexts(GranteeContext.class);
		}
		public GranteeContext grantee(int i) {
			return getRuleContext(GranteeContext.class,i);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(SQL92StatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SQL92StatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SQL92StatementParser.FOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			match(REVOKE);
			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1450);
				match(GRANT);
				setState(1451);
				match(OPTION);
				setState(1452);
				match(FOR);
				}
			}

			setState(1455);
			privilegeClause();
			setState(1456);
			match(FROM);
			setState(1457);
			grantee();
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1458);
				match(COMMA_);
				setState(1459);
				grantee();
				}
				}
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1465);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegeClauseContext extends ParserRuleContext {
		public PrivilegesContext privileges() {
			return getRuleContext(PrivilegesContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQL92StatementParser.ON, 0); }
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public PrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPrivilegeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPrivilegeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivilegeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeClauseContext privilegeClause() throws RecognitionException {
		PrivilegeClauseContext _localctx = new PrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_privilegeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			privileges();
			setState(1468);
			match(ON);
			setState(1469);
			onObjectClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegesContext extends ParserRuleContext {
		public PrivilegeTypeContext privilegeType() {
			return getRuleContext(PrivilegeTypeContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPrivileges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPrivileges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivileges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegesContext privileges() throws RecognitionException {
		PrivilegesContext _localctx = new PrivilegesContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_privileges);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			privilegeType();
			setState(1472);
			columnNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegeTypeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQL92StatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SQL92StatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(SQL92StatementParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SQL92StatementParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SQL92StatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(SQL92StatementParser.UPDATE, 0); }
		public TerminalNode REFERENCES() { return getToken(SQL92StatementParser.REFERENCES, 0); }
		public TerminalNode USAGE() { return getToken(SQL92StatementParser.USAGE, 0); }
		public PrivilegeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPrivilegeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPrivilegeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivilegeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeTypeContext privilegeType() throws RecognitionException {
		PrivilegeTypeContext _localctx = new PrivilegeTypeContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_privilegeType);
		try {
			setState(1482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				match(ALL);
				setState(1475);
				match(PRIVILEGES);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1477);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1478);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1479);
				match(UPDATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(1480);
				match(REFERENCES);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1481);
				match(USAGE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GranteeContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(SQL92StatementParser.PUBLIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GranteeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterGrantee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitGrantee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitGrantee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GranteeContext grantee() throws RecognitionException {
		GranteeContext _localctx = new GranteeContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_grantee);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				match(PUBLIC);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnObjectClauseContext extends ParserRuleContext {
		public PrivilegeLevelContext privilegeLevel() {
			return getRuleContext(PrivilegeLevelContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public OnObjectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterOnObjectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitOnObjectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOnObjectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnObjectClauseContext onObjectClause() throws RecognitionException {
		OnObjectClauseContext _localctx = new OnObjectClauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_onObjectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1488);
				objectType();
				}
			}

			setState(1491);
			privilegeLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_objectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegeLevelContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PrivilegeLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).enterPrivilegeLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQL92StatementListener ) ((SQL92StatementListener)listener).exitPrivilegeLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivilegeLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeLevelContext privilegeLevel() throws RecognitionException {
		PrivilegeLevelContext _localctx = new PrivilegeLevelContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_privilegeLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 88:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 92:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 95:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 96:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0158\u05da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0125"+
		"\b\u0000\u0001\u0000\u0003\u0000\u0128\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u012e\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0134\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0144\b\u0004\n\u0004\f\u0004\u0147\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0155"+
		"\b\u0006\n\u0006\f\u0006\u0158\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u015c\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0162\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0166\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0174\b\t\n\t\f\t\u0177"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u017f\b\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0186"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u018b\b\f\n\f\f\f\u018e\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0193\b\r\u0001\r\u0003\r\u0196\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u019f\b\r\u0001"+
		"\r\u0003\r\u01a2\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u01a6\b\u000e"+
		"\u0003\u000e\u01a8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u01b6\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u01bb\b\u000f\n\u000f\f\u000f\u01be\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u01c8\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u01ce\b\u0011\n\u0011\f\u0011\u01d1\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01d9\b\u0012\u0001\u0012\u0003\u0012\u01dc\b\u0012\u0001"+
		"\u0012\u0003\u0012\u01df\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u01e3"+
		"\b\u0013\u0003\u0013\u01e5\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01ea\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018"+
		"\u01fb\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0200\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0207\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u020b\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0211\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0217\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0223\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0228\b\u001f\u0001 "+
		"\u0003 \u022b\b \u0001 \u0001 \u0001 \u0001 \u0005 \u0231\b \n \f \u0234"+
		"\t \u0001!\u0003!\u0237\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u023f\b\"\u0001#\u0001#\u0001#\u0003#\u0244\b#\u0001#\u0003"+
		"#\u0247\b#\u0001#\u0001#\u0003#\u024b\b#\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u0251\b$\n$\f$\u0254\t$\u0001%\u0001%\u0001%\u0001%\u0005%\u025a\b%"+
		"\n%\f%\u025d\t%\u0001%\u0001%\u0001%\u0001%\u0003%\u0263\b%\u0001&\u0001"+
		"&\u0001&\u0003&\u0268\b&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0003(\u026f"+
		"\b(\u0001)\u0001)\u0001)\u0003)\u0274\b)\u0001)\u0003)\u0277\b)\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0003+\u027e\b+\u0001+\u0005+\u0281\b+\n"+
		"+\f+\u0284\t+\u0001,\u0001,\u0005,\u0288\b,\n,\f,\u028b\t,\u0001,\u0001"+
		",\u0003,\u028f\b,\u0001,\u0003,\u0292\b,\u0001,\u0003,\u0295\b,\u0001"+
		",\u0003,\u0298\b,\u0001,\u0003,\u029b\b,\u0001,\u0003,\u029e\b,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0001/\u0003/\u02a6\b/\u0001/\u0001/\u0005"+
		"/\u02aa\b/\n/\f/\u02ad\t/\u00010\u00010\u00030\u02b1\b0\u00010\u00030"+
		"\u02b4\b0\u00010\u00030\u02b7\b0\u00010\u00030\u02ba\b0\u00011\u00011"+
		"\u00031\u02be\b1\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00015\u00015\u00015\u00055\u02cb\b5\n5\f5\u02ce\t5\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u02d5\b6\u00017\u00017\u00057\u02d9\b7\n7\f7\u02dc"+
		"\t7\u00018\u00018\u00038\u02e0\b8\u00018\u00038\u02e3\b8\u00018\u0001"+
		"8\u00038\u02e7\b8\u00018\u00018\u00038\u02eb\b8\u00018\u00018\u00018\u0001"+
		"8\u00038\u02f1\b8\u00019\u00039\u02f4\b9\u00019\u00019\u00019\u00019\u0003"+
		"9\u02fa\b9\u00019\u00019\u00039\u02fe\b9\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u0308\b9\u00019\u00019\u00039\u030c\b9\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u0312\b:\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0005<\u031c\b<\n<\f<\u031f\t<\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0003>\u0328\b>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u032f\b>\u0001?\u0001?\u0003?\u0333\b?\u0001@\u0001@\u0003"+
		"@\u0337\b@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u0346\bC\u0001D\u0003D\u0349\bD\u0001"+
		"D\u0001D\u0003D\u034d\bD\u0001E\u0003E\u0350\bE\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u035b\bF\u0001G\u0003G\u035e"+
		"\bG\u0001G\u0001G\u0003G\u0362\bG\u0001H\u0003H\u0365\bH\u0001H\u0001"+
		"H\u0003H\u0369\bH\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0003K\u0371"+
		"\bK\u0001L\u0001L\u0001M\u0003M\u0376\bM\u0001M\u0003M\u0379\bM\u0001"+
		"M\u0003M\u037c\bM\u0001M\u0003M\u037f\bM\u0001M\u0001M\u0001N\u0001N\u0001"+
		"O\u0001O\u0001O\u0003O\u0388\bO\u0001O\u0001O\u0001P\u0001P\u0001P\u0003"+
		"P\u038f\bP\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0397\bQ\u0001"+
		"Q\u0003Q\u039a\bQ\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001U\u0003"+
		"U\u03a3\bU\u0001U\u0001U\u0001U\u0005U\u03a8\bU\nU\fU\u03ab\tU\u0001U"+
		"\u0003U\u03ae\bU\u0001V\u0003V\u03b1\bV\u0001V\u0001V\u0001V\u0005V\u03b6"+
		"\bV\nV\fV\u03b9\tV\u0001V\u0003V\u03bc\bV\u0001W\u0001W\u0001X\u0001X"+
		"\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0003X\u03c9\bX\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0005X\u03d3\bX\nX"+
		"\fX\u03d6\tX\u0001Y\u0001Y\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u03e4\b\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0005\\\u03f3\b\\\n\\\f\\\u03f6\t\\\u0001]\u0001]\u0001^\u0001"+
		"^\u0003^\u03fc\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u0403\b^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0005^\u040a\b^\n^\f^\u040d\t^\u0001^\u0001"+
		"^\u0001^\u0001^\u0003^\u0413\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0003^\u041c\b^\u0001^\u0001^\u0001^\u0001^\u0003^\u0422\b^\u0001"+
		"^\u0003^\u0425\b^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0005_\u044e\b_\n_\f_\u0451\t_\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0005`\u045f\b`\n`"+
		"\f`\u0462\t`\u0001`\u0001`\u0001`\u0003`\u0467\b`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u0472\b`\u0001`\u0001"+
		"`\u0001`\u0001`\u0003`\u0478\b`\u0005`\u047a\b`\n`\f`\u047d\t`\u0001a"+
		"\u0001a\u0001a\u0003a\u0482\ba\u0001b\u0001b\u0001b\u0003b\u0487\bb\u0001"+
		"b\u0001b\u0001b\u0005b\u048c\bb\nb\fb\u048f\tb\u0001b\u0003b\u0492\bb"+
		"\u0001b\u0001b\u0001c\u0001c\u0001d\u0001d\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0003e\u04a0\be\u0001f\u0001f\u0001f\u0001f\u0003f\u04a6"+
		"\bf\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"g\u0001g\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u04c1\bi\u0001i\u0001i\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001"+
		"k\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0005"+
		"l\u04d9\bl\nl\fl\u04dc\tl\u0001l\u0003l\u04df\bl\u0001l\u0001l\u0001m"+
		"\u0001m\u0001m\u0001m\u0001m\u0001m\u0003m\u04e9\bm\u0001n\u0001n\u0001"+
		"n\u0003n\u04ee\bn\u0001n\u0001n\u0001n\u0001o\u0001o\u0003o\u04f5\bo\u0001"+
		"o\u0004o\u04f8\bo\u000bo\fo\u04f9\u0001o\u0003o\u04fd\bo\u0001o\u0001"+
		"o\u0001p\u0001p\u0001p\u0001p\u0001p\u0001q\u0001q\u0001q\u0001r\u0001"+
		"r\u0001r\u0001r\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0001t\u0005"+
		"t\u0514\bt\nt\ft\u0517\tt\u0001u\u0001u\u0003u\u051b\bu\u0001u\u0003u"+
		"\u051e\bu\u0001v\u0001v\u0003v\u0522\bv\u0001v\u0003v\u0525\bv\u0001v"+
		"\u0003v\u0528\bv\u0001v\u0001v\u0001v\u0001v\u0001v\u0005v\u052f\bv\n"+
		"v\fv\u0532\tv\u0001v\u0001v\u0003v\u0536\bv\u0001v\u0003v\u0539\bv\u0003"+
		"v\u053b\bv\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0003w\u0566\bw\u0001x\u0001x\u0001x\u0001x\u0003x\u056c"+
		"\bx\u0001x\u0001x\u0001y\u0001y\u0001y\u0003y\u0573\by\u0001y\u0001y\u0001"+
		"z\u0001z\u0003z\u0579\bz\u0001z\u0001z\u0003z\u057d\bz\u0001{\u0001{\u0001"+
		"{\u0003{\u0582\b{\u0001|\u0003|\u0585\b|\u0001}\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0003\u0080"+
		"\u0598\b\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0005\u0081\u05a0\b\u0081\n\u0081\f\u0081\u05a3\t\u0081\u0001"+
		"\u0081\u0001\u0081\u0001\u0081\u0003\u0081\u05a8\b\u0081\u0001\u0082\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u05ae\b\u0082\u0001\u0082\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u05b5\b\u0082\n"+
		"\u0082\f\u0082\u05b8\t\u0082\u0001\u0082\u0001\u0082\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001"+
		"\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001"+
		"\u0085\u0001\u0085\u0003\u0085\u05cb\b\u0085\u0001\u0086\u0001\u0086\u0003"+
		"\u0086\u05cf\b\u0086\u0001\u0087\u0003\u0087\u05d2\b\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u0089"+
		"\u0000\u0004\u00b0\u00b8\u00be\u00c0\u008a\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0000\u0018\u0001\u0000"+
		"\u009e\u009f\u0002\u0000\u009f\u009f\u010f\u010f\u0001\u0000,-\u0001\u0000"+
		"qr\u0002\u0000FF\u014e\u014e\u0002\u0000IIkk\u0002\u0000SSWW\u0001\u0000"+
		"UV\u0001\u0000\r\u000e\u0001\u0000\u0080\u0082\u0001\u0000fg\u0003\u0000"+
		"\u00a3\u00a3\u00a9\u00a9\u00ad\u00dc\u0002\u0000\u0002\u0002aa\u0002\u0000"+
		"\u0004\u0004dd\u0002\u0000eg\u014a\u014a\u0001\u0000kl\u0001\u0000\u0016"+
		"\u001b\u0002\u0000\u0004\u0005\r\u000e\u0001\u0000\u008e\u0092\u0003\u0000"+
		"\u00e6\u00e6\u011c\u011c\u0146\u0146\u0002\u0000RR\u012d\u012d\u0001\u0000"+
		"\u0085\u008d\u0001\u0000|}\u0002\u0000\u00e7\u00e7\u0135\u0135\u0663\u0000"+
		"\u0124\u0001\u0000\u0000\u0000\u0002\u012b\u0001\u0000\u0000\u0000\u0004"+
		"\u0135\u0001\u0000\u0000\u0000\u0006\u013a\u0001\u0000\u0000\u0000\b\u013f"+
		"\u0001\u0000\u0000\u0000\n\u0148\u0001\u0000\u0000\u0000\f\u014d\u0001"+
		"\u0000\u0000\u0000\u000e\u0167\u0001\u0000\u0000\u0000\u0010\u016c\u0001"+
		"\u0000\u0000\u0000\u0012\u016f\u0001\u0000\u0000\u0000\u0014\u017a\u0001"+
		"\u0000\u0000\u0000\u0016\u0185\u0001\u0000\u0000\u0000\u0018\u0187\u0001"+
		"\u0000\u0000\u0000\u001a\u01a1\u0001\u0000\u0000\u0000\u001c\u01a7\u0001"+
		"\u0000\u0000\u0000\u001e\u01ac\u0001\u0000\u0000\u0000 \u01c7\u0001\u0000"+
		"\u0000\u0000\"\u01c9\u0001\u0000\u0000\u0000$\u01db\u0001\u0000\u0000"+
		"\u0000&\u01e4\u0001\u0000\u0000\u0000(\u01eb\u0001\u0000\u0000\u0000*"+
		"\u01ee\u0001\u0000\u0000\u0000,\u01f1\u0001\u0000\u0000\u0000.\u01f4\u0001"+
		"\u0000\u0000\u00000\u01fa\u0001\u0000\u0000\u00002\u0206\u0001\u0000\u0000"+
		"\u00004\u0208\u0001\u0000\u0000\u00006\u020e\u0001\u0000\u0000\u00008"+
		"\u0214\u0001\u0000\u0000\u0000:\u021a\u0001\u0000\u0000\u0000<\u021d\u0001"+
		"\u0000\u0000\u0000>\u0220\u0001\u0000\u0000\u0000@\u022a\u0001\u0000\u0000"+
		"\u0000B\u0236\u0001\u0000\u0000\u0000D\u023a\u0001\u0000\u0000\u0000F"+
		"\u0240\u0001\u0000\u0000\u0000H\u024c\u0001\u0000\u0000\u0000J\u0262\u0001"+
		"\u0000\u0000\u0000L\u0267\u0001\u0000\u0000\u0000N\u0269\u0001\u0000\u0000"+
		"\u0000P\u026b\u0001\u0000\u0000\u0000R\u0270\u0001\u0000\u0000\u0000T"+
		"\u0278\u0001\u0000\u0000\u0000V\u027a\u0001\u0000\u0000\u0000X\u0285\u0001"+
		"\u0000\u0000\u0000Z\u029f\u0001\u0000\u0000\u0000\\\u02a1\u0001\u0000"+
		"\u0000\u0000^\u02a5\u0001\u0000\u0000\u0000`\u02b9\u0001\u0000\u0000\u0000"+
		"b\u02bd\u0001\u0000\u0000\u0000d\u02bf\u0001\u0000\u0000\u0000f\u02c1"+
		"\u0001\u0000\u0000\u0000h\u02c4\u0001\u0000\u0000\u0000j\u02c7\u0001\u0000"+
		"\u0000\u0000l\u02d4\u0001\u0000\u0000\u0000n\u02d6\u0001\u0000\u0000\u0000"+
		"p\u02f0\u0001\u0000\u0000\u0000r\u030b\u0001\u0000\u0000\u0000t\u0311"+
		"\u0001\u0000\u0000\u0000v\u0313\u0001\u0000\u0000\u0000x\u0316\u0001\u0000"+
		"\u0000\u0000z\u0320\u0001\u0000\u0000\u0000|\u0323\u0001\u0000\u0000\u0000"+
		"~\u0332\u0001\u0000\u0000\u0000\u0080\u0336\u0001\u0000\u0000\u0000\u0082"+
		"\u0338\u0001\u0000\u0000\u0000\u0084\u033c\u0001\u0000\u0000\u0000\u0086"+
		"\u0345\u0001\u0000\u0000\u0000\u0088\u0348\u0001\u0000\u0000\u0000\u008a"+
		"\u034f\u0001\u0000\u0000\u0000\u008c\u035a\u0001\u0000\u0000\u0000\u008e"+
		"\u035d\u0001\u0000\u0000\u0000\u0090\u0364\u0001\u0000\u0000\u0000\u0092"+
		"\u036a\u0001\u0000\u0000\u0000\u0094\u036c\u0001\u0000\u0000\u0000\u0096"+
		"\u0370\u0001\u0000\u0000\u0000\u0098\u0372\u0001\u0000\u0000\u0000\u009a"+
		"\u0378\u0001\u0000\u0000\u0000\u009c\u0382\u0001\u0000\u0000\u0000\u009e"+
		"\u0387\u0001\u0000\u0000\u0000\u00a0\u038e\u0001\u0000\u0000\u0000\u00a2"+
		"\u0399\u0001\u0000\u0000\u0000\u00a4\u039b\u0001\u0000\u0000\u0000\u00a6"+
		"\u039d\u0001\u0000\u0000\u0000\u00a8\u039f\u0001\u0000\u0000\u0000\u00aa"+
		"\u03a2\u0001\u0000\u0000\u0000\u00ac\u03b0\u0001\u0000\u0000\u0000\u00ae"+
		"\u03bd\u0001\u0000\u0000\u0000\u00b0\u03c8\u0001\u0000\u0000\u0000\u00b2"+
		"\u03d7\u0001\u0000\u0000\u0000\u00b4\u03d9\u0001\u0000\u0000\u0000\u00b6"+
		"\u03db\u0001\u0000\u0000\u0000\u00b8\u03dd\u0001\u0000\u0000\u0000\u00ba"+
		"\u03f7\u0001\u0000\u0000\u0000\u00bc\u0424\u0001\u0000\u0000\u0000\u00be"+
		"\u0426\u0001\u0000\u0000\u0000\u00c0\u0471\u0001\u0000\u0000\u0000\u00c2"+
		"\u0481\u0001\u0000\u0000\u0000\u00c4\u0483\u0001\u0000\u0000\u0000\u00c6"+
		"\u0495\u0001\u0000\u0000\u0000\u00c8\u0497\u0001\u0000\u0000\u0000\u00ca"+
		"\u049f\u0001\u0000\u0000\u0000\u00cc\u04a1\u0001\u0000\u0000\u0000\u00ce"+
		"\u04ab\u0001\u0000\u0000\u0000\u00d0\u04b2\u0001\u0000\u0000\u0000\u00d2"+
		"\u04b9\u0001\u0000\u0000\u0000\u00d4\u04c4\u0001\u0000\u0000\u0000\u00d6"+
		"\u04cb\u0001\u0000\u0000\u0000\u00d8\u04d3\u0001\u0000\u0000\u0000\u00da"+
		"\u04e8\u0001\u0000\u0000\u0000\u00dc\u04ea\u0001\u0000\u0000\u0000\u00de"+
		"\u04f2\u0001\u0000\u0000\u0000\u00e0\u0500\u0001\u0000\u0000\u0000\u00e2"+
		"\u0505\u0001\u0000\u0000\u0000\u00e4\u0508\u0001\u0000\u0000\u0000\u00e6"+
		"\u050c\u0001\u0000\u0000\u0000\u00e8\u050e\u0001\u0000\u0000\u0000\u00ea"+
		"\u051a\u0001\u0000\u0000\u0000\u00ec\u053a\u0001\u0000\u0000\u0000\u00ee"+
		"\u0565\u0001\u0000\u0000\u0000\u00f0\u0567\u0001\u0000\u0000\u0000\u00f2"+
		"\u056f\u0001\u0000\u0000\u0000\u00f4\u0576\u0001\u0000\u0000\u0000\u00f6"+
		"\u057e\u0001\u0000\u0000\u0000\u00f8\u0584\u0001\u0000\u0000\u0000\u00fa"+
		"\u0586\u0001\u0000\u0000\u0000\u00fc\u058c\u0001\u0000\u0000\u0000\u00fe"+
		"\u058e\u0001\u0000\u0000\u0000\u0100\u0597\u0001\u0000\u0000\u0000\u0102"+
		"\u0599\u0001\u0000\u0000\u0000\u0104\u05a9\u0001\u0000\u0000\u0000\u0106"+
		"\u05bb\u0001\u0000\u0000\u0000\u0108\u05bf\u0001\u0000\u0000\u0000\u010a"+
		"\u05ca\u0001\u0000\u0000\u0000\u010c\u05ce\u0001\u0000\u0000\u0000\u010e"+
		"\u05d1\u0001\u0000\u0000\u0000\u0110\u05d5\u0001\u0000\u0000\u0000\u0112"+
		"\u05d7\u0001\u0000\u0000\u0000\u0114\u0125\u0003T*\u0000\u0115\u0125\u0003"+
		">\u001f\u0000\u0116\u0125\u0003D\"\u0000\u0117\u0125\u0003P(\u0000\u0118"+
		"\u0125\u0003\b\u0004\u0000\u0119\u0125\u0003\n\u0005\u0000\u011a\u0125"+
		"\u0003\u0002\u0001\u0000\u011b\u0125\u0003\u0004\u0002\u0000\u011c\u0125"+
		"\u0003\u0006\u0003\u0000\u011d\u0125\u0003\f\u0006\u0000\u011e\u0125\u0003"+
		"\u000e\u0007\u0000\u011f\u0125\u0003\u00fa}\u0000\u0120\u0125\u0003\u00fc"+
		"~\u0000\u0121\u0125\u0003\u00fe\u007f\u0000\u0122\u0125\u0003\u0102\u0081"+
		"\u0000\u0123\u0125\u0003\u0104\u0082\u0000\u0124\u0114\u0001\u0000\u0000"+
		"\u0000\u0124\u0115\u0001\u0000\u0000\u0000\u0124\u0116\u0001\u0000\u0000"+
		"\u0000\u0124\u0117\u0001\u0000\u0000\u0000\u0124\u0118\u0001\u0000\u0000"+
		"\u0000\u0124\u0119\u0001\u0000\u0000\u0000\u0124\u011a\u0001\u0000\u0000"+
		"\u0000\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000\u0000"+
		"\u0000\u0124\u011d\u0001\u0000\u0000\u0000\u0124\u011e\u0001\u0000\u0000"+
		"\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000"+
		"\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000"+
		"\u0000\u0126\u0128\u0005(\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005\u0000\u0000\u0001\u012a\u0001\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0005.\u0000\u0000\u012c\u012e\u0003\u0010\b\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u00057\u0000\u0000\u0130\u0133"+
		"\u0003\u009eO\u0000\u0131\u0134\u0003\u0012\t\u0000\u0132\u0134\u0003"+
		"0\u0018\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0003\u0001\u0000\u0000\u0000\u0135\u0136\u0005/\u0000"+
		"\u0000\u0136\u0137\u00057\u0000\u0000\u0137\u0138\u0003\u009eO\u0000\u0138"+
		"\u0139\u00032\u0019\u0000\u0139\u0005\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u00050\u0000\u0000\u013b\u013c\u00057\u0000\u0000\u013c\u013d\u0003\u00ac"+
		"V\u0000\u013d\u013e\u0003\u00f8|\u0000\u013e\u0007\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0005.\u0000\u0000\u0140\u0141\u00052\u0000\u0000\u0141\u0145"+
		"\u0003\u009cN\u0000\u0142\u0144\u0003\u0014\n\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\t\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u00050\u0000"+
		"\u0000\u0149\u014a\u00052\u0000\u0000\u014a\u014b\u0003\u009cN\u0000\u014b"+
		"\u014c\u0003\u00f8|\u0000\u014c\u000b\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0005.\u0000\u0000\u014e\u014f\u0005D\u0000\u0000\u014f\u015b\u0003\u00a2"+
		"Q\u0000\u0150\u0151\u0005\u001d\u0000\u0000\u0151\u0156\u0003\u0096K\u0000"+
		"\u0152\u0153\u0005#\u0000\u0000\u0153\u0155\u0003\u0096K\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0005\u001e\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0150"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0005Z\u0000\u0000\u015e\u0165\u0003"+
		"T*\u0000\u015f\u0161\u0005G\u0000\u0000\u0160\u0162\u0007\u0000\u0000"+
		"\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u00eb\u0000"+
		"\u0000\u0164\u0166\u0005\u0129\u0000\u0000\u0165\u015f\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\r\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u00050\u0000\u0000\u0168\u0169\u0005D\u0000\u0000\u0169\u016a"+
		"\u0003\u00a2Q\u0000\u016a\u016b\u0003\u00f8|\u0000\u016b\u000f\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0007\u0001\u0000\u0000\u016d\u016e\u0005\u0143"+
		"\u0000\u0000\u016e\u0011\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u001d"+
		"\u0000\u0000\u0170\u0175\u0003\u0016\u000b\u0000\u0171\u0172\u0005#\u0000"+
		"\u0000\u0172\u0174\u0003\u0016\u000b\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000"+
		"\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u001e\u0000"+
		"\u0000\u0179\u0013\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0093\u0000"+
		"\u0000\u017b\u017c\u0005}\u0000\u0000\u017c\u017e\u00056\u0000\u0000\u017d"+
		"\u017f\u0005\u0016\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0003\u00aeW\u0000\u0181\u0015\u0001\u0000\u0000\u0000\u0182\u0186"+
		"\u0003\u0018\f\u0000\u0183\u0186\u0003&\u0013\u0000\u0184\u0186\u0003"+
		"\u001c\u000e\u0000\u0185\u0182\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0017\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0003\u00a0P\u0000\u0188\u018c\u0003\u00ec"+
		"v\u0000\u0189\u018b\u0003\u001a\r\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0019\u0001\u0000\u0000"+
		"\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u01a2\u0003*\u0015\u0000"+
		"\u0190\u0192\u0005<\u0000\u0000\u0191\u0193\u0005>\u0000\u0000\u0192\u0191"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u01a2"+
		"\u0001\u0000\u0000\u0000\u0194\u0196\u0005d\u0000\u0000\u0195\u0194\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0001"+
		"\u0000\u0000\u0000\u0197\u01a2\u0005e\u0000\u0000\u0198\u01a2\u0003\u00f4"+
		"z\u0000\u0199\u01a2\u0003\u001c\u000e\u0000\u019a\u01a2\u0003\u001e\u000f"+
		"\u0000\u019b\u019e\u0005\u0093\u0000\u0000\u019c\u019f\u0003\u0086C\u0000"+
		"\u019d\u019f\u0003\u00b0X\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a2\u0005\u0155\u0000\u0000\u01a1\u018f\u0001\u0000\u0000\u0000\u01a1"+
		"\u0190\u0001\u0000\u0000\u0000\u01a1\u0195\u0001\u0000\u0000\u0000\u01a1"+
		"\u0198\u0001\u0000\u0000\u0000\u01a1\u0199\u0001\u0000\u0000\u0000\u01a1"+
		"\u019a\u0001\u0000\u0000\u0000\u01a1\u019b\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2\u001b\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a5\u0005:\u0000\u0000\u01a4\u01a6\u0003\u00f6{\u0000\u01a5\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a3\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005"+
		"\u00eb\u0000\u0000\u01aa\u01ab\u0003\u00b0X\u0000\u01ab\u001d\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0005\u0133\u0000\u0000\u01ad\u01ae\u0003\u009e"+
		"O\u0000\u01ae\u01b5\u0003\"\u0011\u0000\u01af\u01b0\u0005\u011f\u0000"+
		"\u0000\u01b0\u01b6\u0005R\u0000\u0000\u01b1\u01b2\u0005\u011f\u0000\u0000"+
		"\u01b2\u01b6\u0005\u012d\u0000\u0000\u01b3\u01b4\u0005\u011f\u0000\u0000"+
		"\u01b4\u01b6\u0005<\u0000\u0000\u01b5\u01af\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01bc\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0005[\u0000\u0000\u01b8\u01b9\u0007\u0002\u0000\u0000\u01b9\u01bb"+
		"\u0003 \u0010\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01bb\u01be\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u001f\u0001\u0000\u0000\u0000\u01be\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c8\u0005\u0135\u0000\u0000\u01c0\u01c8\u0005"+
		"\u00e7\u0000\u0000\u01c1\u01c2\u00056\u0000\u0000\u01c2\u01c8\u0005e\u0000"+
		"\u0000\u01c3\u01c4\u0005\u0123\u0000\u0000\u01c4\u01c8\u0005\u00de\u0000"+
		"\u0000\u01c5\u01c6\u00056\u0000\u0000\u01c6\u01c8\u0005\u0093\u0000\u0000"+
		"\u01c7\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c1\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8!\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0005\u001d\u0000\u0000\u01ca\u01cf\u0003$\u0012\u0000\u01cb\u01cc"+
		"\u0005#\u0000\u0000\u01cc\u01ce\u0003$\u0012\u0000\u01cd\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\u001e"+
		"\u0000\u0000\u01d3#\u0001\u0000\u0000\u0000\u01d4\u01d8\u0003\u00a0P\u0000"+
		"\u01d5\u01d6\u0005\u001d\u0000\u0000\u01d6\u01d7\u0005\u0156\u0000\u0000"+
		"\u01d7\u01d9\u0005\u001e\u0000\u0000\u01d8\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000"+
		"\u01da\u01dc\u0003\u00b0X\u0000\u01db\u01d4\u0001\u0000\u0000\u0000\u01db"+
		"\u01da\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd"+
		"\u01df\u0007\u0003\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0001\u0000\u0000\u0000\u01df%\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u0005:\u0000\u0000\u01e1\u01e3\u0003\u00a8T\u0000\u01e2\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e0\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e9\u0001\u0000\u0000\u0000\u01e6\u01ea\u0003(\u0014"+
		"\u0000\u01e7\u01ea\u0003,\u0016\u0000\u01e8\u01ea\u0003.\u0017\u0000\u01e9"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\'\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0003*\u0015\u0000\u01ec\u01ed\u0003\u00aaU\u0000\u01ed)\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0005;\u0000\u0000\u01ef\u01f0\u0005>\u0000\u0000"+
		"\u01f0+\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005<\u0000\u0000\u01f2\u01f3"+
		"\u0003\"\u0011\u0000\u01f3-\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005"+
		"=\u0000\u0000\u01f5\u01f6\u0005>\u0000\u0000\u01f6\u01f7\u0003\u00aaU"+
		"\u0000\u01f7\u01f8\u0003\u001e\u000f\u0000\u01f8/\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fb\u0005\u001d\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0005m\u0000\u0000\u01fd\u01ff\u0003\u009eO\u0000\u01fe\u0200"+
		"\u0005\u001e\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0001\u0000\u0000\u0000\u02001\u0001\u0000\u0000\u0000\u0201\u0207\u0003"+
		"4\u001a\u0000\u0202\u0207\u00036\u001b\u0000\u0203\u0207\u00038\u001c"+
		"\u0000\u0204\u0207\u0003:\u001d\u0000\u0205\u0207\u0003<\u001e\u0000\u0206"+
		"\u0201\u0001\u0000\u0000\u0000\u0206\u0202\u0001\u0000\u0000\u0000\u0206"+
		"\u0203\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206"+
		"\u0205\u0001\u0000\u0000\u0000\u02073\u0001\u0000\u0000\u0000\u0208\u020a"+
		"\u00055\u0000\u0000\u0209\u020b\u00058\u0000\u0000\u020a\u0209\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0003\u0018\f\u0000\u020d5\u0001\u0000\u0000"+
		"\u0000\u020e\u0210\u0005/\u0000\u0000\u020f\u0211\u00058\u0000\u0000\u0210"+
		"\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0003\u0018\f\u0000\u02137"+
		"\u0001\u0000\u0000\u0000\u0214\u0216\u00050\u0000\u0000\u0215\u0217\u0005"+
		"8\u0000\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0003\u00a0"+
		"P\u0000\u02199\u0001\u0000\u0000\u0000\u021a\u021b\u00055\u0000\u0000"+
		"\u021b\u021c\u0003&\u0013\u0000\u021c;\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u00050\u0000\u0000\u021e\u021f\u0003&\u0013\u0000\u021f=\u0001\u0000"+
		"\u0000\u0000\u0220\u0222\u0005+\u0000\u0000\u0221\u0223\u0005E\u0000\u0000"+
		"\u0222\u0221\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0227\u0003\u009eO\u0000\u0225"+
		"\u0228\u0003@ \u0000\u0226\u0228\u0003B!\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228?\u0001\u0000\u0000"+
		"\u0000\u0229\u022b\u0003\u00aaU\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0007\u0004\u0000\u0000\u022d\u0232\u0003J%\u0000\u022e\u022f"+
		"\u0005#\u0000\u0000\u022f\u0231\u0003J%\u0000\u0230\u022e\u0001\u0000"+
		"\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233A\u0001\u0000\u0000"+
		"\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0237\u0003\u00aaU\u0000"+
		"\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0003T*\u0000\u0239C"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0005,\u0000\u0000\u023b\u023c\u0003"+
		"j5\u0000\u023c\u023e\u0003H$\u0000\u023d\u023f\u0003v;\u0000\u023e\u023d"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023fE\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0003\u00a0P\u0000\u0241\u0243\u0005\u0016"+
		"\u0000\u0000\u0242\u0244\u0005F\u0000\u0000\u0243\u0242\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0246\u0001\u0000\u0000"+
		"\u0000\u0245\u0247\u0005\u001d\u0000\u0000\u0246\u0245\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000"+
		"\u0000\u0248\u024a\u0003L&\u0000\u0249\u024b\u0005\u001e\u0000\u0000\u024a"+
		"\u0249\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b"+
		"G\u0001\u0000\u0000\u0000\u024c\u024d\u00056\u0000\u0000\u024d\u0252\u0003"+
		"F#\u0000\u024e\u024f\u0005#\u0000\u0000\u024f\u0251\u0003F#\u0000\u0250"+
		"\u024e\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252"+
		"\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253"+
		"I\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005\u001d\u0000\u0000\u0256\u025b\u0003L&\u0000\u0257\u0258\u0005#"+
		"\u0000\u0000\u0258\u025a\u0003L&\u0000\u0259\u0257\u0001\u0000\u0000\u0000"+
		"\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000"+
		"\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u001e\u0000\u0000"+
		"\u025f\u0263\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u001d\u0000\u0000"+
		"\u0261\u0263\u0005\u001e\u0000\u0000\u0262\u0255\u0001\u0000\u0000\u0000"+
		"\u0262\u0260\u0001\u0000\u0000\u0000\u0263K\u0001\u0000\u0000\u0000\u0264"+
		"\u0268\u0003\u00b0X\u0000\u0265\u0268\u0005\u0093\u0000\u0000\u0266\u0268"+
		"\u0003N\'\u0000\u0267\u0264\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0268M\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0005\u0155\u0000\u0000\u026aO\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0005-\u0000\u0000\u026c\u026e\u0003R)\u0000\u026d"+
		"\u026f\u0003v;\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026fQ\u0001\u0000\u0000\u0000\u0270\u0271\u0005O\u0000"+
		"\u0000\u0271\u0276\u0003\u009eO\u0000\u0272\u0274\u0005Z\u0000\u0000\u0273"+
		"\u0272\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0001\u0000\u0000\u0000\u0275\u0277\u0003b1\u0000\u0276\u0273\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277S\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0003V+\u0000\u0279U\u0001\u0000\u0000\u0000"+
		"\u027a\u0282\u0003X,\u0000\u027b\u027d\u0005H\u0000\u0000\u027c\u027e"+
		"\u0005k\u0000\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0003"+
		"X,\u0000\u0280\u027b\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000"+
		"\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283W\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000"+
		"\u0285\u0289\u0005*\u0000\u0000\u0286\u0288\u0003Z-\u0000\u0287\u0286"+
		"\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c"+
		"\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u028e"+
		"\u0003^/\u0000\u028d\u028f\u0003h4\u0000\u028e\u028d\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0291\u0001\u0000\u0000"+
		"\u0000\u0290\u0292\u0003v;\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0291"+
		"\u0292\u0001\u0000\u0000\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293"+
		"\u0295\u0003x<\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001"+
		"\u0000\u0000\u0000\u0295\u0297\u0001\u0000\u0000\u0000\u0296\u0298\u0003"+
		"z=\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"+
		"\u0000\u0298\u029a\u0001\u0000\u0000\u0000\u0299\u029b\u0003\u00e8t\u0000"+
		"\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000"+
		"\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u029e\u0003|>\u0000\u029d\u029c"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029eY\u0001"+
		"\u0000\u0000\u0000\u029f\u02a0\u0003\\.\u0000\u02a0[\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0007\u0005\u0000\u0000\u02a2]\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a6\u0003d2\u0000\u02a4\u02a6\u0003`0\u0000\u02a5\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6\u02ab\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0005#\u0000\u0000\u02a8\u02aa\u0003`0"+
		"\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ac_\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ae\u02b1\u0003\u00a0P\u0000\u02af\u02b1\u0003\u00b0X\u0000\u02b0\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b4\u0005Z\u0000\u0000\u02b3\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b7\u0003b1\u0000\u02b6\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000"+
		"\u0000\u02b8\u02ba\u0003f3\u0000\u02b9\u02b0\u0001\u0000\u0000\u0000\u02b9"+
		"\u02b8\u0001\u0000\u0000\u0000\u02baa\u0001\u0000\u0000\u0000\u02bb\u02be"+
		"\u0003\u0096K\u0000\u02bc\u02be\u0005\u0155\u0000\u0000\u02bd\u02bb\u0001"+
		"\u0000\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bec\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c0\u0005\u000f\u0000\u0000\u02c0e\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c2\u0003\u0096K\u0000\u02c2\u02c3\u0005\u0013\u0000\u0000"+
		"\u02c3g\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005O\u0000\u0000\u02c5\u02c6"+
		"\u0003j5\u0000\u02c6i\u0001\u0000\u0000\u0000\u02c7\u02cc\u0003l6\u0000"+
		"\u02c8\u02c9\u0005#\u0000\u0000\u02c9\u02cb\u0003l6\u0000\u02ca\u02c8"+
		"\u0001\u0000\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cdk\u0001"+
		"\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d5\u0003"+
		"n7\u0000\u02d0\u02d1\u0005\u001f\u0000\u0000\u02d1\u02d2\u0003n7\u0000"+
		"\u02d2\u02d3\u0005 \u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d4\u02d0\u0001\u0000\u0000\u0000\u02d5"+
		"m\u0001\u0000\u0000\u0000\u02d6\u02da\u0003p8\u0000\u02d7\u02d9\u0003"+
		"r9\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000"+
		"\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000"+
		"\u0000\u02dbo\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000"+
		"\u02dd\u02e2\u0003\u009eO\u0000\u02de\u02e0\u0005Z\u0000\u0000\u02df\u02de"+
		"\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e1\u02e3\u0003b1\u0000\u02e2\u02df\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02f1\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e6\u0003\u0082A\u0000\u02e5\u02e7\u0005Z\u0000\u0000"+
		"\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02ea\u0003b1\u0000\u02e9\u02eb"+
		"\u0003\u00aaU\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001"+
		"\u0000\u0000\u0000\u02eb\u02f1\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005"+
		"\u001d\u0000\u0000\u02ed\u02ee\u0003j5\u0000\u02ee\u02ef\u0005\u001e\u0000"+
		"\u0000\u02ef\u02f1\u0001\u0000\u0000\u0000\u02f0\u02dd\u0001\u0000\u0000"+
		"\u0000\u02f0\u02e4\u0001\u0000\u0000\u0000\u02f0\u02ec\u0001\u0000\u0000"+
		"\u0000\u02f1q\u0001\u0000\u0000\u0000\u02f2\u02f4\u0007\u0006\u0000\u0000"+
		"\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005Q\u0000\u0000\u02f6"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f9\u0003p8\u0000\u02f8\u02fa\u0003"+
		"t:\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fa\u030c\u0001\u0000\u0000\u0000\u02fb\u02fd\u0007\u0007\u0000"+
		"\u0000\u02fc\u02fe\u0005T\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000"+
		"\u02ff\u0300\u0005Q\u0000\u0000\u0300\u0301\u0003p8\u0000\u0301\u0302"+
		"\u0003t:\u0000\u0302\u030c\u0001\u0000\u0000\u0000\u0303\u0307\u0005P"+
		"\u0000\u0000\u0304\u0308\u0005S\u0000\u0000\u0305\u0306\u0007\u0007\u0000"+
		"\u0000\u0306\u0308\u0005T\u0000\u0000\u0307\u0304\u0001\u0000\u0000\u0000"+
		"\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000"+
		"\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030a\u0005Q\u0000\u0000\u030a"+
		"\u030c\u0003p8\u0000\u030b\u02f3\u0001\u0000\u0000\u0000\u030b\u02fb\u0001"+
		"\u0000\u0000\u0000\u030b\u0303\u0001\u0000\u0000\u0000\u030cs\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0005[\u0000\u0000\u030e\u0312\u0003\u00b0X\u0000"+
		"\u030f\u0310\u0005X\u0000\u0000\u0310\u0312\u0003\u00aaU\u0000\u0311\u030d"+
		"\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312u\u0001"+
		"\u0000\u0000\u0000\u0313\u0314\u0005Y\u0000\u0000\u0314\u0315\u0003\u00b0"+
		"X\u0000\u0315w\u0001\u0000\u0000\u0000\u0316\u0317\u0005o\u0000\u0000"+
		"\u0317\u0318\u0005p\u0000\u0000\u0318\u031d\u0003\u00eau\u0000\u0319\u031a"+
		"\u0005#\u0000\u0000\u031a\u031c\u0003\u00eau\u0000\u031b\u0319\u0001\u0000"+
		"\u0000\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000"+
		"\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031ey\u0001\u0000\u0000"+
		"\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0321\u0005s\u0000\u0000"+
		"\u0321\u0322\u0003\u00b0X\u0000\u0322{\u0001\u0000\u0000\u0000\u0323\u032e"+
		"\u0005t\u0000\u0000\u0324\u0325\u0003\u0080@\u0000\u0325\u0326\u0005#"+
		"\u0000\u0000\u0326\u0328\u0001\u0000\u0000\u0000\u0327\u0324\u0001\u0000"+
		"\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000"+
		"\u0000\u0000\u0329\u032f\u0003~?\u0000\u032a\u032b\u0003~?\u0000\u032b"+
		"\u032c\u0005u\u0000\u0000\u032c\u032d\u0003\u0080@\u0000\u032d\u032f\u0001"+
		"\u0000\u0000\u0000\u032e\u0327\u0001\u0000\u0000\u0000\u032e\u032a\u0001"+
		"\u0000\u0000\u0000\u032f}\u0001\u0000\u0000\u0000\u0330\u0333\u0003\u008a"+
		"E\u0000\u0331\u0333\u0003\u0084B\u0000\u0332\u0330\u0001\u0000\u0000\u0000"+
		"\u0332\u0331\u0001\u0000\u0000\u0000\u0333\u007f\u0001\u0000\u0000\u0000"+
		"\u0334\u0337\u0003\u008aE\u0000\u0335\u0337\u0003\u0084B\u0000\u0336\u0334"+
		"\u0001\u0000\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0337\u0081"+
		"\u0001\u0000\u0000\u0000\u0338\u0339\u0005\u001d\u0000\u0000\u0339\u033a"+
		"\u0003V+\u0000\u033a\u033b\u0005\u001e\u0000\u0000\u033b\u0083\u0001\u0000"+
		"\u0000\u0000\u033c\u033d\u0005&\u0000\u0000\u033d\u0085\u0001\u0000\u0000"+
		"\u0000\u033e\u0346\u0003\u0088D\u0000\u033f\u0346\u0003\u008aE\u0000\u0340"+
		"\u0346\u0003\u008cF\u0000\u0341\u0346\u0003\u008eG\u0000\u0342\u0346\u0003"+
		"\u0090H\u0000\u0343\u0346\u0003\u0092I\u0000\u0344\u0346\u0003\u0094J"+
		"\u0000\u0345\u033e\u0001\u0000\u0000\u0000\u0345\u033f\u0001\u0000\u0000"+
		"\u0000\u0345\u0340\u0001\u0000\u0000\u0000\u0345\u0341\u0001\u0000\u0000"+
		"\u0000\u0345\u0342\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000"+
		"\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0346\u0087\u0001\u0000\u0000"+
		"\u0000\u0347\u0349\u0003\u00aeW\u0000\u0348\u0347\u0001\u0000\u0000\u0000"+
		"\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000"+
		"\u034a\u034c\u0005\u0155\u0000\u0000\u034b\u034d\u0003\u00f4z\u0000\u034c"+
		"\u034b\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d"+
		"\u0089\u0001\u0000\u0000\u0000\u034e\u0350\u0007\b\u0000\u0000\u034f\u034e"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0001\u0000\u0000\u0000\u0351\u0352\u0005\u0156\u0000\u0000\u0352\u008b"+
		"\u0001\u0000\u0000\u0000\u0353\u0354\u0007\t\u0000\u0000\u0354\u035b\u0005"+
		"\u0155\u0000\u0000\u0355\u0356\u0005\u001f\u0000\u0000\u0356\u0357\u0003"+
		"\u0096K\u0000\u0357\u0358\u0005\u0155\u0000\u0000\u0358\u0359\u0005 \u0000"+
		"\u0000\u0359\u035b\u0001\u0000\u0000\u0000\u035a\u0353\u0001\u0000\u0000"+
		"\u0000\u035a\u0355\u0001\u0000\u0000\u0000\u035b\u008d\u0001\u0000\u0000"+
		"\u0000\u035c\u035e\u0003\u00aeW\u0000\u035d\u035c\u0001\u0000\u0000\u0000"+
		"\u035d\u035e\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000"+
		"\u035f\u0361\u0005\u0157\u0000\u0000\u0360\u0362\u0003\u00f4z\u0000\u0361"+
		"\u0360\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362"+
		"\u008f\u0001\u0000\u0000\u0000\u0363\u0365\u0003\u00aeW\u0000\u0364\u0363"+
		"\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0366"+
		"\u0001\u0000\u0000\u0000\u0366\u0368\u0005\u0158\u0000\u0000\u0367\u0369"+
		"\u0003\u00f4z\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001"+
		"\u0000\u0000\u0000\u0369\u0091\u0001\u0000\u0000\u0000\u036a\u036b\u0007"+
		"\n\u0000\u0000\u036b\u0093\u0001\u0000\u0000\u0000\u036c\u036d\u0005e"+
		"\u0000\u0000\u036d\u0095\u0001\u0000\u0000\u0000\u036e\u0371\u0005\u0154"+
		"\u0000\u0000\u036f\u0371\u0003\u0098L\u0000\u0370\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0097\u0001\u0000\u0000"+
		"\u0000\u0372\u0373\u0007\u000b\u0000\u0000\u0373\u0099\u0001\u0000\u0000"+
		"\u0000\u0374\u0376\u0005\'\u0000\u0000\u0375\u0374\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000"+
		"\u0377\u0379\u0005\'\u0000\u0000\u0378\u0375\u0001\u0000\u0000\u0000\u0378"+
		"\u0379\u0001\u0000\u0000\u0000\u0379\u037b\u0001\u0000\u0000\u0000\u037a"+
		"\u037c\u0007\u0001\u0000\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037b"+
		"\u037c\u0001\u0000\u0000\u0000\u037c\u037e\u0001\u0000\u0000\u0000\u037d"+
		"\u037f\u0005\u0012\u0000\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037e"+
		"\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380"+
		"\u0381\u0003\u0096K\u0000\u0381\u009b\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u0003\u0096K\u0000\u0383\u009d\u0001\u0000\u0000\u0000\u0384\u0385\u0003"+
		"\u00a4R\u0000\u0385\u0386\u0005\u0012\u0000\u0000\u0386\u0388\u0001\u0000"+
		"\u0000\u0000\u0387\u0384\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000"+
		"\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038a\u0003\u00a6"+
		"S\u0000\u038a\u009f\u0001\u0000\u0000\u0000\u038b\u038c\u0003\u00a4R\u0000"+
		"\u038c\u038d\u0005\u0012\u0000\u0000\u038d\u038f\u0001\u0000\u0000\u0000"+
		"\u038e\u038b\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000"+
		"\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391\u0003\u00a6S\u0000\u0391"+
		"\u00a1\u0001\u0000\u0000\u0000\u0392\u039a\u0003\u0096K\u0000\u0393\u0394"+
		"\u0003\u00a4R\u0000\u0394\u0395\u0005\u0012\u0000\u0000\u0395\u0397\u0001"+
		"\u0000\u0000\u0000\u0396\u0393\u0001\u0000\u0000\u0000\u0396\u0397\u0001"+
		"\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039a\u0003"+
		"\u0096K\u0000\u0399\u0392\u0001\u0000\u0000\u0000\u0399\u0396\u0001\u0000"+
		"\u0000\u0000\u039a\u00a3\u0001\u0000\u0000\u0000\u039b\u039c\u0003\u0096"+
		"K\u0000\u039c\u00a5\u0001\u0000\u0000\u0000\u039d\u039e\u0003\u0096K\u0000"+
		"\u039e\u00a7\u0001\u0000\u0000\u0000\u039f\u03a0\u0003\u0096K\u0000\u03a0"+
		"\u00a9\u0001\u0000\u0000\u0000\u03a1\u03a3\u0005\u001d\u0000\u0000\u03a2"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a9\u0003\u00a0P\u0000\u03a5\u03a6"+
		"\u0005#\u0000\u0000\u03a6\u03a8\u0003\u00a0P\u0000\u03a7\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a8\u03ab\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000"+
		"\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ad\u0001\u0000"+
		"\u0000\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac\u03ae\u0005\u001e"+
		"\u0000\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000"+
		"\u0000\u0000\u03ae\u00ab\u0001\u0000\u0000\u0000\u03af\u03b1\u0005\u001d"+
		"\u0000\u0000\u03b0\u03af\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b7\u0003\u009e"+
		"O\u0000\u03b3\u03b4\u0005#\u0000\u0000\u03b4\u03b6\u0003\u009eO\u0000"+
		"\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b9\u0001\u0000\u0000\u0000"+
		"\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000"+
		"\u03b8\u03bb\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bc\u0005\u001e\u0000\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u00ad\u0001\u0000\u0000\u0000"+
		"\u03bd\u03be\u0005\u0154\u0000\u0000\u03be\u00af\u0001\u0000\u0000\u0000"+
		"\u03bf\u03c0\u0006X\uffff\uffff\u0000\u03c0\u03c1\u0003\u00b6[\u0000\u03c1"+
		"\u03c2\u0003\u00b0X\u0003\u03c2\u03c9\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0005\u001d\u0000\u0000\u03c4\u03c5\u0003\u00b0X\u0000\u03c5\u03c6\u0005"+
		"\u001e\u0000\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7\u03c9\u0003"+
		"\u00b8\\\u0000\u03c8\u03bf\u0001\u0000\u0000\u0000\u03c8\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9\u03d4\u0001\u0000"+
		"\u0000\u0000\u03ca\u03cb\n\u0005\u0000\u0000\u03cb\u03cc\u0003\u00b2Y"+
		"\u0000\u03cc\u03cd\u0003\u00b0X\u0006\u03cd\u03d3\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cf\n\u0004\u0000\u0000\u03cf\u03d0\u0003\u00b4Z\u0000\u03d0"+
		"\u03d1\u0003\u00b0X\u0005\u03d1\u03d3\u0001\u0000\u0000\u0000\u03d2\u03ca"+
		"\u0001\u0000\u0000\u0000\u03d2\u03ce\u0001\u0000\u0000\u0000\u03d3\u03d6"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5"+
		"\u0001\u0000\u0000\u0000\u03d5\u00b1\u0001\u0000\u0000\u0000\u03d6\u03d4"+
		"\u0001\u0000\u0000\u0000\u03d7\u03d8\u0007\f\u0000\u0000\u03d8\u00b3\u0001"+
		"\u0000\u0000\u0000\u03d9\u03da\u0005b\u0000\u0000\u03da\u00b5\u0001\u0000"+
		"\u0000\u0000\u03db\u03dc\u0007\r\u0000\u0000\u03dc\u00b7\u0001\u0000\u0000"+
		"\u0000\u03dd\u03de\u0006\\\uffff\uffff\u0000\u03de\u03df\u0003\u00bc^"+
		"\u0000\u03df\u03f4\u0001\u0000\u0000\u0000\u03e0\u03e1\n\u0005\u0000\u0000"+
		"\u03e1\u03e3\u0005c\u0000\u0000\u03e2\u03e4\u0005d\u0000\u0000\u03e3\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e5"+
		"\u0001\u0000\u0000\u0000\u03e5\u03f3\u0007\u000e\u0000\u0000\u03e6\u03e7"+
		"\n\u0004\u0000\u0000\u03e7\u03e8\u0005\u0014\u0000\u0000\u03e8\u03f3\u0003"+
		"\u00bc^\u0000\u03e9\u03ea\n\u0003\u0000\u0000\u03ea\u03eb\u0003\u00ba"+
		"]\u0000\u03eb\u03ec\u0003\u00bc^\u0000\u03ec\u03f3\u0001\u0000\u0000\u0000"+
		"\u03ed\u03ee\n\u0002\u0000\u0000\u03ee\u03ef\u0003\u00ba]\u0000\u03ef"+
		"\u03f0\u0007\u000f\u0000\u0000\u03f0\u03f1\u0003\u0082A\u0000\u03f1\u03f3"+
		"\u0001\u0000\u0000\u0000\u03f2\u03e0\u0001\u0000\u0000\u0000\u03f2\u03e6"+
		"\u0001\u0000\u0000\u0000\u03f2\u03e9\u0001\u0000\u0000\u0000\u03f2\u03ed"+
		"\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000\u0000\u03f4\u03f2"+
		"\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u00b9"+
		"\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f8"+
		"\u0007\u0010\u0000\u0000\u03f8\u00bb\u0001\u0000\u0000\u0000\u03f9\u03fb"+
		"\u0003\u00be_\u0000\u03fa\u03fc\u0005d\u0000\u0000\u03fb\u03fa\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000"+
		"\u0000\u0000\u03fd\u03fe\u0005j\u0000\u0000\u03fe\u03ff\u0003\u0082A\u0000"+
		"\u03ff\u0425\u0001\u0000\u0000\u0000\u0400\u0402\u0003\u00be_\u0000\u0401"+
		"\u0403\u0005d\u0000\u0000\u0402\u0401\u0001\u0000\u0000\u0000\u0402\u0403"+
		"\u0001\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0405"+
		"\u0005j\u0000\u0000\u0405\u0406\u0005\u001d\u0000\u0000\u0406\u040b\u0003"+
		"\u00b0X\u0000\u0407\u0408\u0005#\u0000\u0000\u0408\u040a\u0003\u00b0X"+
		"\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u040d\u0001\u0000\u0000"+
		"\u0000\u040b\u0409\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000"+
		"\u0000\u040c\u040e\u0001\u0000\u0000\u0000\u040d\u040b\u0001\u0000\u0000"+
		"\u0000\u040e\u040f\u0005\u001e\u0000\u0000\u040f\u0425\u0001\u0000\u0000"+
		"\u0000\u0410\u0412\u0003\u00be_\u0000\u0411\u0413\u0005d\u0000\u0000\u0412"+
		"\u0411\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000\u0000\u0000\u0413"+
		"\u0414\u0001\u0000\u0000\u0000\u0414\u0415\u0005i\u0000\u0000\u0415\u0416"+
		"\u0003\u00be_\u0000\u0416\u0417\u0005a\u0000\u0000\u0417\u0418\u0003\u00bc"+
		"^\u0000\u0418\u0425\u0001\u0000\u0000\u0000\u0419\u041b\u0003\u00be_\u0000"+
		"\u041a\u041c\u0005d\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041b"+
		"\u041c\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d"+
		"\u041e\u0005m\u0000\u0000\u041e\u0421\u0003\u00c0`\u0000\u041f\u0420\u0005"+
		"\u0104\u0000\u0000\u0420\u0422\u0003\u00c0`\u0000\u0421\u041f\u0001\u0000"+
		"\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u0425\u0001\u0000"+
		"\u0000\u0000\u0423\u0425\u0003\u00be_\u0000\u0424\u03f9\u0001\u0000\u0000"+
		"\u0000\u0424\u0400\u0001\u0000\u0000\u0000\u0424\u0410\u0001\u0000\u0000"+
		"\u0000\u0424\u0419\u0001\u0000\u0000\u0000\u0424\u0423\u0001\u0000\u0000"+
		"\u0000\u0425\u00bd\u0001\u0000\u0000\u0000\u0426\u0427\u0006_\uffff\uffff"+
		"\u0000\u0427\u0428\u0003\u00c0`\u0000\u0428\u044f\u0001\u0000\u0000\u0000"+
		"\u0429\u042a\n\r\u0000\u0000\u042a\u042b\u0005\u0006\u0000\u0000\u042b"+
		"\u044e\u0003\u00be_\u000e\u042c\u042d\n\f\u0000\u0000\u042d\u042e\u0005"+
		"\u0007\u0000\u0000\u042e\u044e\u0003\u00be_\r\u042f\u0430\n\u000b\u0000"+
		"\u0000\u0430\u0431\u0005\b\u0000\u0000\u0431\u044e\u0003\u00be_\f\u0432"+
		"\u0433\n\n\u0000\u0000\u0433\u0434\u0005\t\u0000\u0000\u0434\u044e\u0003"+
		"\u00be_\u000b\u0435\u0436\n\t\u0000\u0000\u0436\u0437\u0005\r\u0000\u0000"+
		"\u0437\u044e\u0003\u00be_\n\u0438\u0439\n\b\u0000\u0000\u0439\u043a\u0005"+
		"\u000e\u0000\u0000\u043a\u044e\u0003\u00be_\t\u043b\u043c\n\u0007\u0000"+
		"\u0000\u043c\u043d\u0005\u000f\u0000\u0000\u043d\u044e\u0003\u00be_\b"+
		"\u043e\u043f\n\u0006\u0000\u0000\u043f\u0440\u0005\u0010\u0000\u0000\u0440"+
		"\u044e\u0003\u00be_\u0007\u0441\u0442\n\u0005\u0000\u0000\u0442\u0443"+
		"\u0005\u000b\u0000\u0000\u0443\u044e\u0003\u00be_\u0006\u0444\u0445\n"+
		"\u0004\u0000\u0000\u0445\u0446\u0005\n\u0000\u0000\u0446\u044e\u0003\u00be"+
		"_\u0005\u0447\u0448\n\u0003\u0000\u0000\u0448\u0449\u0005\r\u0000\u0000"+
		"\u0449\u044e\u0003\u00e4r\u0000\u044a\u044b\n\u0002\u0000\u0000\u044b"+
		"\u044c\u0005\u000e\u0000\u0000\u044c\u044e\u0003\u00e4r\u0000\u044d\u0429"+
		"\u0001\u0000\u0000\u0000\u044d\u042c\u0001\u0000\u0000\u0000\u044d\u042f"+
		"\u0001\u0000\u0000\u0000\u044d\u0432\u0001\u0000\u0000\u0000\u044d\u0435"+
		"\u0001\u0000\u0000\u0000\u044d\u0438\u0001\u0000\u0000\u0000\u044d\u043b"+
		"\u0001\u0000\u0000\u0000\u044d\u043e\u0001\u0000\u0000\u0000\u044d\u0441"+
		"\u0001\u0000\u0000\u0000\u044d\u0444\u0001\u0000\u0000\u0000\u044d\u0447"+
		"\u0001\u0000\u0000\u0000\u044d\u044a\u0001\u0000\u0000\u0000\u044e\u0451"+
		"\u0001\u0000\u0000\u0000\u044f\u044d\u0001\u0000\u0000\u0000\u044f\u0450"+
		"\u0001\u0000\u0000\u0000\u0450\u00bf\u0001\u0000\u0000\u0000\u0451\u044f"+
		"\u0001\u0000\u0000\u0000\u0452\u0453\u0006`\uffff\uffff\u0000\u0453\u0472"+
		"\u0003\u00c2a\u0000\u0454\u0472\u0003\u0084B\u0000\u0455\u0472\u0003\u0086"+
		"C\u0000\u0456\u0472\u0003\u00a0P\u0000\u0457\u0472\u0003\u009aM\u0000"+
		"\u0458\u0459\u0007\u0011\u0000\u0000\u0459\u0472\u0003\u00c0`\u0007\u045a"+
		"\u045b\u0005\u001d\u0000\u0000\u045b\u0460\u0003\u00b0X\u0000\u045c\u045d"+
		"\u0005#\u0000\u0000\u045d\u045f\u0003\u00b0X\u0000\u045e\u045c\u0001\u0000"+
		"\u0000\u0000\u045f\u0462\u0001\u0000\u0000\u0000\u0460\u045e\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0463\u0001\u0000"+
		"\u0000\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0463\u0464\u0005\u001e"+
		"\u0000\u0000\u0464\u0472\u0001\u0000\u0000\u0000\u0465\u0467\u0005h\u0000"+
		"\u0000\u0466\u0465\u0001\u0000\u0000\u0000\u0466\u0467\u0001\u0000\u0000"+
		"\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468\u0472\u0003\u0082A\u0000"+
		"\u0469\u046a\u0005\u001f\u0000\u0000\u046a\u046b\u0003\u0096K\u0000\u046b"+
		"\u046c\u0003\u00b0X\u0000\u046c\u046d\u0005 \u0000\u0000\u046d\u0472\u0001"+
		"\u0000\u0000\u0000\u046e\u0472\u0003\u00dcn\u0000\u046f\u0472\u0003\u00de"+
		"o\u0000\u0470\u0472\u0003\u00e4r\u0000\u0471\u0452\u0001\u0000\u0000\u0000"+
		"\u0471\u0454\u0001\u0000\u0000\u0000\u0471\u0455\u0001\u0000\u0000\u0000"+
		"\u0471\u0456\u0001\u0000\u0000\u0000\u0471\u0457\u0001\u0000\u0000\u0000"+
		"\u0471\u0458\u0001\u0000\u0000\u0000\u0471\u045a\u0001\u0000\u0000\u0000"+
		"\u0471\u0466\u0001\u0000\u0000\u0000\u0471\u0469\u0001\u0000\u0000\u0000"+
		"\u0471\u046e\u0001\u0000\u0000\u0000\u0471\u046f\u0001\u0000\u0000\u0000"+
		"\u0471\u0470\u0001\u0000\u0000\u0000\u0472\u047b\u0001\u0000\u0000\u0000"+
		"\u0473\u0474\n\t\u0000\u0000\u0474\u0477\u0005\u00ed\u0000\u0000\u0475"+
		"\u0478\u0005\u0155\u0000\u0000\u0476\u0478\u0003\u0096K\u0000\u0477\u0475"+
		"\u0001\u0000\u0000\u0000\u0477\u0476\u0001\u0000\u0000\u0000\u0478\u047a"+
		"\u0001\u0000\u0000\u0000\u0479\u0473\u0001\u0000\u0000\u0000\u047a\u047d"+
		"\u0001\u0000\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047b\u047c"+
		"\u0001\u0000\u0000\u0000\u047c\u00c1\u0001\u0000\u0000\u0000\u047d\u047b"+
		"\u0001\u0000\u0000\u0000\u047e\u0482\u0003\u00c4b\u0000\u047f\u0482\u0003"+
		"\u00cae\u0000\u0480\u0482\u0003\u00d8l\u0000\u0481\u047e\u0001\u0000\u0000"+
		"\u0000\u0481\u047f\u0001\u0000\u0000\u0000\u0481\u0480\u0001\u0000\u0000"+
		"\u0000\u0482\u00c3\u0001\u0000\u0000\u0000\u0483\u0484\u0003\u00c6c\u0000"+
		"\u0484\u0486\u0005\u001d\u0000\u0000\u0485\u0487\u0003\u00c8d\u0000\u0486"+
		"\u0485\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487"+
		"\u0491\u0001\u0000\u0000\u0000\u0488\u048d\u0003\u00b0X\u0000\u0489\u048a"+
		"\u0005#\u0000\u0000\u048a\u048c\u0003\u00b0X\u0000\u048b\u0489\u0001\u0000"+
		"\u0000\u0000\u048c\u048f\u0001\u0000\u0000\u0000\u048d\u048b\u0001\u0000"+
		"\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u0492\u0001\u0000"+
		"\u0000\u0000\u048f\u048d\u0001\u0000\u0000\u0000\u0490\u0492\u0005\u000f"+
		"\u0000\u0000\u0491\u0488\u0001\u0000\u0000\u0000\u0491\u0490\u0001\u0000"+
		"\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000"+
		"\u0000\u0000\u0493\u0494\u0005\u001e\u0000\u0000\u0494\u00c5\u0001\u0000"+
		"\u0000\u0000\u0495\u0496\u0007\u0012\u0000\u0000\u0496\u00c7\u0001\u0000"+
		"\u0000\u0000\u0497\u0498\u0005I\u0000\u0000\u0498\u00c9\u0001\u0000\u0000"+
		"\u0000\u0499\u04a0\u0003\u00ccf\u0000\u049a\u04a0\u0003\u00ceg\u0000\u049b"+
		"\u04a0\u0003\u00d0h\u0000\u049c\u04a0\u0003\u00d2i\u0000\u049d\u04a0\u0003"+
		"\u00d4j\u0000\u049e\u04a0\u0003\u00d6k\u0000\u049f\u0499\u0001\u0000\u0000"+
		"\u0000\u049f\u049a\u0001\u0000\u0000\u0000\u049f\u049b\u0001\u0000\u0000"+
		"\u0000\u049f\u049c\u0001\u0000\u0000\u0000\u049f\u049d\u0001\u0000\u0000"+
		"\u0000\u049f\u049e\u0001\u0000\u0000\u0000\u04a0\u00cb\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a2\u0005L\u0000\u0000\u04a2\u04a5\u0005\u001d\u0000\u0000"+
		"\u04a3\u04a6\u0003\u00b0X\u0000\u04a4\u04a6\u0005e\u0000\u0000\u04a5\u04a3"+
		"\u0001\u0000\u0000\u0000\u04a5\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a7"+
		"\u0001\u0000\u0000\u0000\u04a7\u04a8\u0005Z\u0000\u0000\u04a8\u04a9\u0003"+
		"\u00ecv\u0000\u04a9\u04aa\u0005\u001e\u0000\u0000\u04aa\u00cd\u0001\u0000"+
		"\u0000\u0000\u04ab\u04ac\u0005\u00f2\u0000\u0000\u04ac\u04ad\u0005\u001d"+
		"\u0000\u0000\u04ad\u04ae\u0003\u00b0X\u0000\u04ae\u04af\u0005X\u0000\u0000"+
		"\u04af\u04b0\u0003\u0096K\u0000\u04b0\u04b1\u0005\u001e\u0000\u0000\u04b1"+
		"\u00cf\u0001\u0000\u0000\u0000\u04b2\u04b3\u0005?\u0000\u0000\u04b3\u04b4"+
		"\u0005\u001d\u0000\u0000\u04b4\u04b5\u0003\u00b0X\u0000\u04b5\u04b6\u0005"+
		"j\u0000\u0000\u04b6\u04b7\u0003\u00b0X\u0000\u04b7\u04b8\u0005\u001e\u0000"+
		"\u0000\u04b8\u00d1\u0001\u0000\u0000\u0000\u04b9\u04ba\u0005N\u0000\u0000"+
		"\u04ba\u04bb\u0005\u001d\u0000\u0000\u04bb\u04bc\u0003\u00b0X\u0000\u04bc"+
		"\u04bd\u0005O\u0000\u0000\u04bd\u04c0\u0005\u0156\u0000\u0000\u04be\u04bf"+
		"\u0005_\u0000\u0000\u04bf\u04c1\u0005\u0156\u0000\u0000\u04c0\u04be\u0001"+
		"\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001"+
		"\u0000\u0000\u0000\u04c2\u04c3\u0005\u001e\u0000\u0000\u04c3\u00d3\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c5\u0005\u010a\u0000\u0000\u04c5\u04c6\u0005"+
		"\u001d\u0000\u0000\u04c6\u04c7\u0003\u0096K\u0000\u04c7\u04c8\u0005O\u0000"+
		"\u0000\u04c8\u04c9\u0003\u00b0X\u0000\u04c9\u04ca\u0005\u001e\u0000\u0000"+
		"\u04ca\u00d5\u0001\u0000\u0000\u0000\u04cb\u04cc\u0005M\u0000\u0000\u04cc"+
		"\u04cd\u0005\u001d\u0000\u0000\u04cd\u04ce\u0007\u0013\u0000\u0000\u04ce"+
		"\u04cf\u0005\u0155\u0000\u0000\u04cf\u04d0\u0005O\u0000\u0000\u04d0\u04d1"+
		"\u0005\u0155\u0000\u0000\u04d1\u04d2\u0005\u001e\u0000\u0000\u04d2\u00d7"+
		"\u0001\u0000\u0000\u0000\u04d3\u04d4\u0003\u00dam\u0000\u04d4\u04de\u0005"+
		"\u001d\u0000\u0000\u04d5\u04da\u0003\u00b0X\u0000\u04d6\u04d7\u0005#\u0000"+
		"\u0000\u04d7\u04d9\u0003\u00b0X\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d9\u04dc\u0001\u0000\u0000\u0000\u04da\u04d8\u0001\u0000\u0000\u0000"+
		"\u04da\u04db\u0001\u0000\u0000\u0000\u04db\u04df\u0001\u0000\u0000\u0000"+
		"\u04dc\u04da\u0001\u0000\u0000\u0000\u04dd\u04df\u0005\u000f\u0000\u0000"+
		"\u04de\u04d5\u0001\u0000\u0000\u0000\u04de\u04dd\u0001\u0000\u0000\u0000"+
		"\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e0\u04e1\u0005\u001e\u0000\u0000\u04e1\u00d9\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e9\u0003\u0096K\u0000\u04e3\u04e9\u0005\\\u0000\u0000\u04e4"+
		"\u04e9\u0005\u00f6\u0000\u0000\u04e5\u04e9\u0005\u0083\u0000\u0000\u04e6"+
		"\u04e9\u0005\u0084\u0000\u0000\u04e7\u04e9\u0005\u007f\u0000\u0000\u04e8"+
		"\u04e2\u0001\u0000\u0000\u0000\u04e8\u04e3\u0001\u0000\u0000\u0000\u04e8"+
		"\u04e4\u0001\u0000\u0000\u0000\u04e8\u04e5\u0001\u0000\u0000\u0000\u04e8"+
		"\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e7\u0001\u0000\u0000\u0000\u04e9"+
		"\u00db\u0001\u0000\u0000\u0000\u04ea\u04eb\u0003\u0086C\u0000\u04eb\u04ed"+
		"\u0005\u011f\u0000\u0000\u04ec\u04ee\u0005<\u0000\u0000\u04ed\u04ec\u0001"+
		"\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000\u0000\u04ee\u04ef\u0001"+
		"\u0000\u0000\u0000\u04ef\u04f0\u0007\u0014\u0000\u0000\u04f0\u04f1\u0003"+
		"\u0082A\u0000\u04f1\u00dd\u0001\u0000\u0000\u0000\u04f2\u04f4\u0005J\u0000"+
		"\u0000\u04f3\u04f5\u0003\u00c0`\u0000\u04f4\u04f3\u0001\u0000\u0000\u0000"+
		"\u04f4\u04f5\u0001\u0000\u0000\u0000\u04f5\u04f7\u0001\u0000\u0000\u0000"+
		"\u04f6\u04f8\u0003\u00e0p\u0000\u04f7\u04f6\u0001\u0000\u0000\u0000\u04f8"+
		"\u04f9\u0001\u0000\u0000\u0000\u04f9\u04f7\u0001\u0000\u0000\u0000\u04f9"+
		"\u04fa\u0001\u0000\u0000\u0000\u04fa\u04fc\u0001\u0000\u0000\u0000\u04fb"+
		"\u04fd\u0003\u00e2q\u0000\u04fc\u04fb\u0001\u0000\u0000\u0000\u04fc\u04fd"+
		"\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u04ff"+
		"\u0005\u0102\u0000\u0000\u04ff\u00df\u0001\u0000\u0000\u0000\u0500\u0501"+
		"\u0005K\u0000\u0000\u0501\u0502\u0003\u00b0X\u0000\u0502\u0503\u0005^"+
		"\u0000\u0000\u0503\u0504\u0003\u00b0X\u0000\u0504\u00e1\u0001\u0000\u0000"+
		"\u0000\u0505\u0506\u0005]\u0000\u0000\u0506\u0507\u0003\u00b0X\u0000\u0507"+
		"\u00e3\u0001\u0000\u0000\u0000\u0508\u0509\u0005\u007f\u0000\u0000\u0509"+
		"\u050a\u0003\u00b0X\u0000\u050a\u050b\u0003\u00e6s\u0000\u050b\u00e5\u0001"+
		"\u0000\u0000\u0000\u050c\u050d\u0007\u0015\u0000\u0000\u050d\u00e7\u0001"+
		"\u0000\u0000\u0000\u050e\u050f\u0005n\u0000\u0000\u050f\u0510\u0005p\u0000"+
		"\u0000\u0510\u0515\u0003\u00eau\u0000\u0511\u0512\u0005#\u0000\u0000\u0512"+
		"\u0514\u0003\u00eau\u0000\u0513\u0511\u0001\u0000\u0000\u0000\u0514\u0517"+
		"\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000\u0000\u0000\u0515\u0516"+
		"\u0001\u0000\u0000\u0000\u0516\u00e9\u0001\u0000\u0000\u0000\u0517\u0515"+
		"\u0001\u0000\u0000\u0000\u0518\u051b\u0003\u00a0P\u0000\u0519\u051b\u0003"+
		"\u008aE\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051a\u0519\u0001\u0000"+
		"\u0000\u0000\u051b\u051d\u0001\u0000\u0000\u0000\u051c\u051e\u0007\u0003"+
		"\u0000\u0000\u051d\u051c\u0001\u0000\u0000\u0000\u051d\u051e\u0001\u0000"+
		"\u0000\u0000\u051e\u00eb\u0001\u0000\u0000\u0000\u051f\u0521\u0003\u00ee"+
		"w\u0000\u0520\u0522\u0003\u00f0x\u0000\u0521\u0520\u0001\u0000\u0000\u0000"+
		"\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u0524\u0001\u0000\u0000\u0000"+
		"\u0523\u0525\u0003\u00f2y\u0000\u0524\u0523\u0001\u0000\u0000\u0000\u0524"+
		"\u0525\u0001\u0000\u0000\u0000\u0525\u0527\u0001\u0000\u0000\u0000\u0526"+
		"\u0528\u0003\u00f4z\u0000\u0527\u0526\u0001\u0000\u0000\u0000\u0527\u0528"+
		"\u0001\u0000\u0000\u0000\u0528\u053b\u0001\u0000\u0000\u0000\u0529\u052a"+
		"\u0003\u00eew\u0000\u052a\u052b\u0005\u001d\u0000\u0000\u052b\u0530\u0005"+
		"\u0155\u0000\u0000\u052c\u052d\u0005#\u0000\u0000\u052d\u052f\u0005\u0155"+
		"\u0000\u0000\u052e\u052c\u0001\u0000\u0000\u0000\u052f\u0532\u0001\u0000"+
		"\u0000\u0000\u0530\u052e\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000"+
		"\u0000\u0000\u0531\u0533\u0001\u0000\u0000\u0000\u0532\u0530\u0001\u0000"+
		"\u0000\u0000\u0533\u0535\u0005\u001e\u0000\u0000\u0534\u0536\u0003\u00f2"+
		"y\u0000\u0535\u0534\u0001\u0000\u0000\u0000\u0535\u0536\u0001\u0000\u0000"+
		"\u0000\u0536\u0538\u0001\u0000\u0000\u0000\u0537\u0539\u0003\u00f4z\u0000"+
		"\u0538\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000"+
		"\u0539\u053b\u0001\u0000\u0000\u0000\u053a\u051f\u0001\u0000\u0000\u0000"+
		"\u053a\u0529\u0001\u0000\u0000\u0000\u053b\u00ed\u0001\u0000\u0000\u0000"+
		"\u053c\u0566\u0005}\u0000\u0000\u053d\u053e\u0005}\u0000\u0000\u053e\u0566"+
		"\u0005\u014f\u0000\u0000\u053f\u0540\u0005\u0121\u0000\u0000\u0540\u0566"+
		"\u0005}\u0000\u0000\u0541\u0542\u0005\u0121\u0000\u0000\u0542\u0543\u0005"+
		"}\u0000\u0000\u0543\u0566\u0005\u014f\u0000\u0000\u0544\u0566\u0005|\u0000"+
		"\u0000\u0545\u0566\u0005\u00aa\u0000\u0000\u0546\u0566\u0005\u0122\u0000"+
		"\u0000\u0547\u0548\u0005\u0121\u0000\u0000\u0548\u0566\u0005|\u0000\u0000"+
		"\u0549\u054a\u0005\u0121\u0000\u0000\u054a\u054b\u0005|\u0000\u0000\u054b"+
		"\u0566\u0005\u014f\u0000\u0000\u054c\u0566\u0005\u00e4\u0000\u0000\u054d"+
		"\u054e\u0005\u00e4\u0000\u0000\u054e\u0566\u0005\u014f\u0000\u0000\u054f"+
		"\u0566\u0005\u0125\u0000\u0000\u0550\u0566\u0005\u00a8\u0000\u0000\u0551"+
		"\u0566\u0005\u00f9\u0000\u0000\u0552\u0566\u0005\u00a6\u0000\u0000\u0553"+
		"\u0566\u0005\u013c\u0000\u0000\u0554\u0566\u0005\u00ab\u0000\u0000\u0555"+
		"\u0566\u0005\u00a7\u0000\u0000\u0556\u0557\u0005{\u0000\u0000\u0557\u0566"+
		"\u0005@\u0000\u0000\u0558\u0566\u0005\u0080\u0000\u0000\u0559\u0566\u0005"+
		"\u0081\u0000\u0000\u055a\u0566\u0005\u0082\u0000\u0000\u055b\u0566\u0005"+
		"\u007f\u0000\u0000\u055c\u055d\u0005\u0081\u0000\u0000\u055d\u055e\u0005"+
		"G\u0000\u0000\u055e\u055f\u0005\u0081\u0000\u0000\u055f\u0566\u0005\u0153"+
		"\u0000\u0000\u0560\u0561\u0005\u0082\u0000\u0000\u0561\u0562\u0005G\u0000"+
		"\u0000\u0562\u0563\u0005\u0081\u0000\u0000\u0563\u0566\u0005\u0153\u0000"+
		"\u0000\u0564\u0566\u0003\u0096K\u0000\u0565\u053c\u0001\u0000\u0000\u0000"+
		"\u0565\u053d\u0001\u0000\u0000\u0000\u0565\u053f\u0001\u0000\u0000\u0000"+
		"\u0565\u0541\u0001\u0000\u0000\u0000\u0565\u0544\u0001\u0000\u0000\u0000"+
		"\u0565\u0545\u0001\u0000\u0000\u0000\u0565\u0546\u0001\u0000\u0000\u0000"+
		"\u0565\u0547\u0001\u0000\u0000\u0000\u0565\u0549\u0001\u0000\u0000\u0000"+
		"\u0565\u054c\u0001\u0000\u0000\u0000\u0565\u054d\u0001\u0000\u0000\u0000"+
		"\u0565\u054f\u0001\u0000\u0000\u0000\u0565\u0550\u0001\u0000\u0000\u0000"+
		"\u0565\u0551\u0001\u0000\u0000\u0000\u0565\u0552\u0001\u0000\u0000\u0000"+
		"\u0565\u0553\u0001\u0000\u0000\u0000\u0565\u0554\u0001\u0000\u0000\u0000"+
		"\u0565\u0555\u0001\u0000\u0000\u0000\u0565\u0556\u0001\u0000\u0000\u0000"+
		"\u0565\u0558\u0001\u0000\u0000\u0000\u0565\u0559\u0001\u0000\u0000\u0000"+
		"\u0565\u055a\u0001\u0000\u0000\u0000\u0565\u055b\u0001\u0000\u0000\u0000"+
		"\u0565\u055c\u0001\u0000\u0000\u0000\u0565\u0560\u0001\u0000\u0000\u0000"+
		"\u0565\u0564\u0001\u0000\u0000\u0000\u0566\u00ef\u0001\u0000\u0000\u0000"+
		"\u0567\u0568\u0005\u001d\u0000\u0000\u0568\u056b\u0005\u0156\u0000\u0000"+
		"\u0569\u056a\u0005#\u0000\u0000\u056a\u056c\u0005\u0156\u0000\u0000\u056b"+
		"\u0569\u0001\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c"+
		"\u056d\u0001\u0000\u0000\u0000\u056d\u056e\u0005\u001e\u0000\u0000\u056e"+
		"\u00f1\u0001\u0000\u0000\u0000\u056f\u0570\u0007\u0016\u0000\u0000\u0570"+
		"\u0572\u00056\u0000\u0000\u0571\u0573\u0005\u0016\u0000\u0000\u0572\u0571"+
		"\u0001\u0000\u0000\u0000\u0572\u0573\u0001\u0000\u0000\u0000\u0573\u0574"+
		"\u0001\u0000\u0000\u0000\u0574\u0575\u0003\u00f6{\u0000\u0575\u00f3\u0001"+
		"\u0000\u0000\u0000\u0576\u0578\u0005\u00ed\u0000\u0000\u0577\u0579\u0005"+
		"\u0016\u0000\u0000\u0578\u0577\u0001\u0000\u0000\u0000\u0578\u0579\u0001"+
		"\u0000\u0000\u0000\u0579\u057c\u0001\u0000\u0000\u0000\u057a\u057d\u0005"+
		"\u0155\u0000\u0000\u057b\u057d\u0003\u00f6{\u0000\u057c\u057a\u0001\u0000"+
		"\u0000\u0000\u057c\u057b\u0001\u0000\u0000\u0000\u057d\u00f5\u0001\u0000"+
		"\u0000\u0000\u057e\u0581\u0003\u0096K\u0000\u057f\u0580\u0005\u0012\u0000"+
		"\u0000\u0580\u0582\u0003\u0096K\u0000\u0581\u057f\u0001\u0000\u0000\u0000"+
		"\u0581\u0582\u0001\u0000\u0000\u0000\u0582\u00f7\u0001\u0000\u0000\u0000"+
		"\u0583\u0585\u0007\u0017\u0000\u0000\u0584\u0583\u0001\u0000\u0000\u0000"+
		"\u0584\u0585\u0001\u0000\u0000\u0000\u0585\u00f9\u0001\u0000\u0000\u0000"+
		"\u0586\u0587\u00056\u0000\u0000\u0587\u0588\u0005\u0147\u0000\u0000\u0588"+
		"\u0589\u0005\u0119\u0000\u0000\u0589\u058a\u0005\u011d\u0000\u0000\u058a"+
		"\u058b\u0003\u0100\u0080\u0000\u058b\u00fb\u0001\u0000\u0000\u0000\u058c"+
		"\u058d\u0005w\u0000\u0000\u058d\u00fd\u0001\u0000\u0000\u0000\u058e\u058f"+
		"\u0005x\u0000\u0000\u058f\u00ff\u0001\u0000\u0000\u0000\u0590\u0591\u0005"+
		"\u0132\u0000\u0000\u0591\u0598\u0005\u00db\u0000\u0000\u0592\u0593\u0005"+
		"\u0132\u0000\u0000\u0593\u0598\u0005\u00ba\u0000\u0000\u0594\u0595\u0005"+
		"\u00d0\u0000\u0000\u0595\u0598\u0005\u0132\u0000\u0000\u0596\u0598\u0005"+
		"\u00d7\u0000\u0000\u0597\u0590\u0001\u0000\u0000\u0000\u0597\u0592\u0001"+
		"\u0000\u0000\u0000\u0597\u0594\u0001\u0000\u0000\u0000\u0597\u0596\u0001"+
		"\u0000\u0000\u0000\u0598\u0101\u0001\u0000\u0000\u0000\u0599\u059a\u0005"+
		"3\u0000\u0000\u059a\u059b\u0003\u0106\u0083\u0000\u059b\u059c\u0005`\u0000"+
		"\u0000\u059c\u05a1\u0003\u010c\u0086\u0000\u059d\u059e\u0005#\u0000\u0000"+
		"\u059e\u05a0\u0003\u010c\u0086\u0000\u059f\u059d\u0001\u0000\u0000\u0000"+
		"\u05a0\u05a3\u0001\u0000\u0000\u0000\u05a1\u059f\u0001\u0000\u0000\u0000"+
		"\u05a1\u05a2\u0001\u0000\u0000\u0000\u05a2\u05a7\u0001\u0000\u0000\u0000"+
		"\u05a3\u05a1\u0001\u0000\u0000\u0000\u05a4\u05a5\u0005G\u0000\u0000\u05a5"+
		"\u05a6\u00053\u0000\u0000\u05a6\u05a8\u0005\u0129\u0000\u0000\u05a7\u05a4"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u0103"+
		"\u0001\u0000\u0000\u0000\u05a9\u05ad\u00054\u0000\u0000\u05aa\u05ab\u0005"+
		"3\u0000\u0000\u05ab\u05ac\u0005\u0129\u0000\u0000\u05ac\u05ae\u0005_\u0000"+
		"\u0000\u05ad\u05aa\u0001\u0000\u0000\u0000\u05ad\u05ae\u0001\u0000\u0000"+
		"\u0000\u05ae\u05af\u0001\u0000\u0000\u0000\u05af\u05b0\u0003\u0106\u0083"+
		"\u0000\u05b0\u05b1\u0005O\u0000\u0000\u05b1\u05b6\u0003\u010c\u0086\u0000"+
		"\u05b2\u05b3\u0005#\u0000\u0000\u05b3\u05b5\u0003\u010c\u0086\u0000\u05b4"+
		"\u05b2\u0001\u0000\u0000\u0000\u05b5\u05b8\u0001\u0000\u0000\u0000\u05b6"+
		"\u05b4\u0001\u0000\u0000\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7"+
		"\u05b9\u0001\u0000\u0000\u0000\u05b8\u05b6\u0001\u0000\u0000\u0000\u05b9"+
		"\u05ba\u0003\u00f8|\u0000\u05ba\u0105\u0001\u0000\u0000\u0000\u05bb\u05bc"+
		"\u0003\u0108\u0084\u0000\u05bc\u05bd\u0005[\u0000\u0000\u05bd\u05be\u0003"+
		"\u010e\u0087\u0000\u05be\u0107\u0001\u0000\u0000\u0000\u05bf\u05c0\u0003"+
		"\u010a\u0085\u0000\u05c0\u05c1\u0003\u00aaU\u0000\u05c1\u0109\u0001\u0000"+
		"\u0000\u0000\u05c2\u05c3\u0005k\u0000\u0000\u05c3\u05cb\u0005\u0130\u0000"+
		"\u0000\u05c4\u05cb\u0005*\u0000\u0000\u05c5\u05cb\u0005-\u0000\u0000\u05c6"+
		"\u05cb\u0005+\u0000\u0000\u05c7\u05cb\u0005,\u0000\u0000\u05c8\u05cb\u0005"+
		"\u0133\u0000\u0000\u05c9\u05cb\u0005\u014c\u0000\u0000\u05ca\u05c2\u0001"+
		"\u0000\u0000\u0000\u05ca\u05c4\u0001\u0000\u0000\u0000\u05ca\u05c5\u0001"+
		"\u0000\u0000\u0000\u05ca\u05c6\u0001\u0000\u0000\u0000\u05ca\u05c7\u0001"+
		"\u0000\u0000\u0000\u05ca\u05c8\u0001\u0000\u0000\u0000\u05ca\u05c9\u0001"+
		"\u0000\u0000\u0000\u05cb\u010b\u0001\u0000\u0000\u0000\u05cc\u05cf\u0005"+
		"\u0131\u0000\u0000\u05cd\u05cf\u0003\u0096K\u0000\u05ce\u05cc\u0001\u0000"+
		"\u0000\u0000\u05ce\u05cd\u0001\u0000\u0000\u0000\u05cf\u010d\u0001\u0000"+
		"\u0000\u0000\u05d0\u05d2\u0003\u0110\u0088\u0000\u05d1\u05d0\u0001\u0000"+
		"\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d3\u05d4\u0003\u0112\u0089\u0000\u05d4\u010f\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d6\u00057\u0000\u0000\u05d6\u0111\u0001\u0000\u0000"+
		"\u0000\u05d7\u05d8\u0003\u009eO\u0000\u05d8\u0113\u0001\u0000\u0000\u0000"+
		"\u00a9\u0124\u0127\u012d\u0133\u0145\u0156\u015b\u0161\u0165\u0175\u017e"+
		"\u0185\u018c\u0192\u0195\u019e\u01a1\u01a5\u01a7\u01b5\u01bc\u01c7\u01cf"+
		"\u01d8\u01db\u01de\u01e2\u01e4\u01e9\u01fa\u01ff\u0206\u020a\u0210\u0216"+
		"\u0222\u0227\u022a\u0232\u0236\u023e\u0243\u0246\u024a\u0252\u025b\u0262"+
		"\u0267\u026e\u0273\u0276\u027d\u0282\u0289\u028e\u0291\u0294\u0297\u029a"+
		"\u029d\u02a5\u02ab\u02b0\u02b3\u02b6\u02b9\u02bd\u02cc\u02d4\u02da\u02df"+
		"\u02e2\u02e6\u02ea\u02f0\u02f3\u02f9\u02fd\u0307\u030b\u0311\u031d\u0327"+
		"\u032e\u0332\u0336\u0345\u0348\u034c\u034f\u035a\u035d\u0361\u0364\u0368"+
		"\u0370\u0375\u0378\u037b\u037e\u0387\u038e\u0396\u0399\u03a2\u03a9\u03ad"+
		"\u03b0\u03b7\u03bb\u03c8\u03d2\u03d4\u03e3\u03f2\u03f4\u03fb\u0402\u040b"+
		"\u0412\u041b\u0421\u0424\u044d\u044f\u0460\u0466\u0471\u0477\u047b\u0481"+
		"\u0486\u048d\u0491\u049f\u04a5\u04c0\u04da\u04de\u04e8\u04ed\u04f4\u04f9"+
		"\u04fc\u0515\u051a\u051d\u0521\u0524\u0527\u0530\u0535\u0538\u053a\u0565"+
		"\u056b\u0572\u0578\u057c\u0581\u0584\u0597\u05a1\u05a7\u05ad\u05b6\u05ca"+
		"\u05ce\u05d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}