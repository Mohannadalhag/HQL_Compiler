// Generated from C:/Users/alhag/IdeaProjects/compiler\compiler.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T_ACTION=3, T_ADD2=4, T_ALL=5, T_ALLOCATE=6, T_ALTER=7, 
		T_AND=8, T_ANSI_NULLS=9, T_ANSI_PADDING=10, T_AS=11, T_ASC=12, T_ASSOCIATE=13, 
		T_AT=14, T_AUTO_INCREMENT=15, T_AVG=16, T_BATCHSIZE=17, T_BEGIN=18, T_BETWEEN=19, 
		T_BIGINT=20, T_BINARY_DOUBLE=21, T_BINARY_FLOAT=22, T_BINARY_INTEGER=23, 
		T_BIT=24, T_BODY=25, T_BREAK=26, T_BY=27, T_BYTE=28, T_CALL=29, T_CALLER=30, 
		T_CASCADE=31, T_CASE=32, T_CASESPECIFIC=33, T_CAST=34, T_CHAR=35, T_CHARACTER=36, 
		T_CHARSET=37, T_CLIENT=38, T_CLOSE=39, T_CLUSTERED=40, T_CMP=41, T_COLLECT=42, 
		T_COLLECTION=43, T_COLUMN=44, T_COMMENT=45, T_CONSTANT=46, T_COMMIT=47, 
		T_COMPRESS=48, T_CONCAT=49, T_CONDITION=50, T_CONSTRAINT=51, T_CONTINUE=52, 
		T_COPY=53, T_COUNT=54, T_COUNT_BIG=55, T_CREATE=56, T_CREATION=57, T_CREATOR=58, 
		T_CS=59, T_CURRENT=60, T_CURRENT_SCHEMA=61, T_CURSOR=62, T_DATABASE=63, 
		T_DATA=64, T_DATE=65, T_DATETIME=66, T_DAY=67, T_DAYS=68, T_DEC=69, T_DECIMAL=70, 
		T_DECLARE=71, T_DEFAULT=72, T_DEFERRED=73, T_DEFINED=74, T_DEFINER=75, 
		T_DEFINITION=76, T_DELETE=77, T_DELIMITED=78, T_DELIMITER=79, T_DESC=80, 
		T_DESCRIBE=81, T_DIAGNOSTICS=82, T_DIR=83, T_DIRECTORY=84, T_DISTINCT=85, 
		T_DISTRIBUTE=86, T_DO=87, T_DOUBLE=88, T_DROP=89, T_DYNAMIC=90, T_ELSE=91, 
		T_ELSEIF=92, T_ELSIF=93, T_ENABLE=94, T_END=95, T_ENGINE=96, T_ESCAPED=97, 
		T_EXCEPT=98, T_EXEC=99, T_EXECUTE=100, T_EXCEPTION=101, T_EXCLUSIVE=102, 
		T_EXISTS=103, T_EXISTS_ERROR=104, T_EXIT=105, T_FALLBACK=106, T_FALSE=107, 
		T_FETCH=108, T_FIELDS=109, T_FILE=110, T_FILES=111, T_FLOAT=112, T_FOR=113, 
		T_FOREIGN=114, T_FORMAT=115, T_FOUND=116, T_FROM=117, T_FULL=118, T_FUNCTION=119, 
		T_GET=120, T_GLOBAL=121, T_GO=122, T_GRANT=123, T_GROUP=124, T_HANDLER=125, 
		T_HASH=126, T_HAVING=127, T_HDFS=128, T_HIVE=129, T_HOST=130, T_IDENTITY=131, 
		T_IF=132, T_IGNORE=133, T_IMMEDIATE=134, T_IN=135, T_INCLUDE=136, T_INDEX=137, 
		T_INITRANS=138, T_INNER=139, T_INOUT=140, T_INSERT=141, T_INT=142, T_INT2=143, 
		T_INT4=144, T_INT8=145, T_INTEGER=146, T_INTERSECT=147, T_INTERVAL=148, 
		T_INTO=149, T_INVOKER=150, T_IS=151, T_ISOPEN=152, T_ITEMS=153, T_JOIN=154, 
		T_KEEP=155, T_KEY=156, T_KEYS=157, T_LANGUAGE=158, T_LEAVE=159, T_LEFT=160, 
		T_LIKE=161, T_LIMIT=162, T_LINES=163, T_LOCAL=164, T_LOCATION=165, T_LOCATOR=166, 
		T_LOCATORS=167, T_LOCKS=168, T_LOG=169, T_LOGGED=170, T_LOGGING=171, T_LOOP=172, 
		T_MAP=173, T_MATCHED=174, T_MAX=175, T_MAXTRANS=176, T_MERGE=177, T_MESSAGE_TEXT=178, 
		T_MICROSECOND=179, T_MICROSECONDS=180, T_MIN=181, T_MULTISET=182, T_NCHAR=183, 
		T_NEW=184, T_NVARCHAR=185, T_NO=186, T_NOCOUNT=187, T_NOCOMPRESS=188, 
		T_NOLOGGING=189, T_NONE=190, T_NOT=191, T_NOTFOUND=192, T_NULL=193, T_NUMERIC=194, 
		T_NUMBER=195, T_OBJECT=196, T_OFF=197, T_ON=198, T_ONLY=199, T_OPEN=200, 
		T_OR=201, T_ORDER=202, T_OUT=203, T_OUTER=204, T_OVER=205, T_OVERWRITE=206, 
		T_OWNER=207, T_PACKAGE=208, T_PARTITION=209, T_PCTFREE=210, T_PCTUSED=211, 
		T_PLS_INTEGER=212, T_PRECISION=213, T_PRESERVE=214, T_PRIMARY=215, T_PRINT=216, 
		T_PROC=217, T_PROCEDURE=218, T_QUALIFY=219, T_QUERY_BAND=220, T_QUIT=221, 
		T_QUOTED_IDENTIFIER=222, T_RAISE=223, T_REAL=224, T_REFERENCES=225, T_REGEXP=226, 
		T_REPLACE=227, T_RESIGNAL=228, T_RESTRICT=229, T_RESULT=230, T_RESULT_SET_LOCATOR=231, 
		T_RETURN=232, T_RETURNS=233, T_REVERSE=234, T_RIGHT=235, T_RLIKE=236, 
		T_ROLE=237, T_ROLLBACK=238, T_ROW=239, T_ROWS=240, T_ROWTYPE=241, T_ROW_COUNT=242, 
		T_RR=243, T_RS=244, T_PWD=245, T_TRIM=246, T_SCHEMA=247, T_SECOND=248, 
		T_SECONDS=249, T_SECURITY=250, T_SEGMENT=251, T_SEL=252, T_SELECT=253, 
		T_SET=254, T_SESSION=255, T_SESSIONS=256, T_SETS=257, T_SHARE=258, T_SIGNAL=259, 
		T_SIMPLE_DOUBLE=260, T_SIMPLE_FLOAT=261, T_SIMPLE_INTEGER=262, T_SMALLDATETIME=263, 
		T_SMALLINT=264, T_SQL=265, T_SQLEXCEPTION=266, T_SQLINSERT=267, T_SQLSTATE=268, 
		T_SQLWARNING=269, T_STATS=270, T_STATISTICS=271, T_STEP=272, T_STORAGE=273, 
		T_STORED=274, T_STRING=275, T_SUBDIR=276, T_SUBSTRING=277, T_SUM=278, 
		T_SUMMARY=279, T_SYS_REFCURSOR=280, T_TABLE=281, T_TABLESPACE=282, T_TEMPORARY=283, 
		T_TERMINATED=284, T_TEXTIMAGE_ON=285, T_THEN=286, T_TIMESTAMP=287, T_TINYINT=288, 
		T_TITLE=289, T_TO=290, T_TOP=291, T_TRANSACTION=292, T_TRUE=293, T_TRUNCATE=294, 
		T_TYPE=295, T_UNION=296, T_UNIQUE=297, T_UPDATE=298, T_UR=299, T_USE=300, 
		T_USING=301, T_VALUE=302, T_VALUES=303, T_VAR=304, T_VARCHAR=305, T_VARCHAR2=306, 
		T_VARYING=307, T_VOLATILE=308, T_WHEN=309, T_WHERE=310, T_WHILE=311, T_WITH=312, 
		T_WITHOUT=313, T_WORK=314, T_XACT_ABORT=315, T_XML=316, T_YES=317, T_ACTIVITY_COUNT=318, 
		T_CUME_DIST=319, T_CURRENT_DATE=320, T_CURRENT_TIMESTAMP=321, T_CURRENT_USER=322, 
		T_DENSE_RANK=323, T_FIRST_VALUE=324, T_LAG=325, T_LAST_VALUE=326, T_LEAD=327, 
		T_MAX_PART_STRING=328, T_MIN_PART_STRING=329, T_MAX_PART_INT=330, T_MIN_PART_INT=331, 
		T_MAX_PART_DATE=332, T_MIN_PART_DATE=333, T_PART_COUNT=334, T_PART_LOC=335, 
		T_RANK=336, T_ROW_NUMBER=337, T_STDEV=338, T_SYSDATE=339, T_VARIANCE=340, 
		T_USER=341, T_VOID=342, T_BOOLEAN=343, T_QUERY=344, T_ADD=345, T_COLON=346, 
		T_COMMA=347, T_PIPE=348, T_AND2=349, T_DIV=350, T_DOT2=351, T_EQUAL=352, 
		T_EQUAL2=353, T_NOTEQUAL=354, T_NOTEQUAL2=355, T_GREATER=356, T_GREATEREQUAL=357, 
		T_LESS=358, T_LESSEQUAL=359, T_MUL=360, T_OPEN_B=361, T_OPEN_P=362, T_OPEN_SB=363, 
		T_CLOSE_B=364, T_CLOSE_P=365, T_CLOSE_SB=366, T_SEMICOLON=367, T_SUB=368, 
		L_IDENTCPP=369, L_ID=370, L_S_STRING=371, L_D_STRING=372, L_INT=373, L_DEC=374, 
		L_WS=375, L_M_COMMENT=376, L_S_COMMENT=377, L_FILE=378, L_LABEL=379;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_funcpp = 7, 
		RULE_bodycpp = 8, RULE_end_funcpp = 9, RULE_returncpp = 10, RULE_type = 11, 
		RULE_paramcpp = 12, RULE_numbercpp = 13, RULE_stmtcpp = 14, RULE_assign = 15, 
		RULE_end_assign = 16, RULE_assign_select = 17, RULE_assign_query_select = 18, 
		RULE_assign_with_type = 19, RULE_eqexprcpp = 20, RULE_assign_without_type = 21, 
		RULE_assign_without_type2 = 22, RULE_stmt_if_cpp = 23, RULE_stmt_for_cpp = 24, 
		RULE_stmt_for_body_cpp = 25, RULE_bool_expr_cpp = 26, RULE_bool_expr_cpp2 = 27, 
		RULE_comparecpp = 28, RULE_exprcpp = 29, RULE_exprcppt = 30, RULE_identexprcpp = 31, 
		RULE_plusormenus2 = 32, RULE_plusormenus = 33, RULE_exception_block = 34, 
		RULE_exception_block_item = 35, RULE_declare_stmt = 36, RULE_declare_block = 37, 
		RULE_declare_block_inplace = 38, RULE_declare_stmt_item = 39, RULE_declare_var_item = 40, 
		RULE_declare_condition_item = 41, RULE_declare_cursor_item = 42, RULE_cursor_with_return = 43, 
		RULE_cursor_without_return = 44, RULE_declare_handler_item = 45, RULE_declare_temporary_table_item = 46, 
		RULE_create_table_stmt = 47, RULE_create_local_temp_table_stmt = 48, RULE_create_table_definition = 49, 
		RULE_create_table_columns_error = 50, RULE_create_table_columns = 51, 
		RULE_create_table_columns_item = 52, RULE_column_name = 53, RULE_create_table_column_inline_cons = 54, 
		RULE_create_table_column_cons = 55, RULE_create_table_fk_action = 56, 
		RULE_create_table_preoptions = 57, RULE_create_table_preoptions_item = 58, 
		RULE_create_table_preoptions_td_item = 59, RULE_create_table_options = 60, 
		RULE_create_table_options_item = 61, RULE_create_table_options_ora_item = 62, 
		RULE_create_table_options_db2_item = 63, RULE_create_table_options_td_item = 64, 
		RULE_create_table_options_hive_item = 65, RULE_create_table_hive_row_format = 66, 
		RULE_create_table_hive_row_format_fields = 67, RULE_create_table_options_mssql_item = 68, 
		RULE_create_table_options_mysql_item = 69, RULE_dtype = 70, RULE_dtype_len_error = 71, 
		RULE_dtype_len = 72, RULE_dtype_attr = 73, RULE_dtype_default = 74, RULE_create_database_stmt_error = 75, 
		RULE_create_database_stmt = 76, RULE_create_database_option = 77, RULE_create_function_stmt = 78, 
		RULE_create_function_return = 79, RULE_create_package_stmt = 80, RULE_package_spec = 81, 
		RULE_package_spec_item = 82, RULE_create_package_body_stmt = 83, RULE_package_body = 84, 
		RULE_package_body_item = 85, RULE_create_procedure_stmt = 86, RULE_create_routine_params = 87, 
		RULE_create_routine_param_item = 88, RULE_create_routine_options = 89, 
		RULE_create_routine_option = 90, RULE_if_stmt = 91, RULE_if_plsql_stmt = 92, 
		RULE_if_tsql_stmt = 93, RULE_if_bteq_stmt = 94, RULE_elseif_block = 95, 
		RULE_else_block = 96, RULE_create_index_stmt = 97, RULE_create_index_col = 98, 
		RULE_index_storage_clause = 99, RULE_index_mssql_storage_clause = 100, 
		RULE_for_cursor_stmt = 101, RULE_for_range_stmt_error = 102, RULE_for_range_stmt = 103, 
		RULE_label = 104, RULE_select_stmt = 105, RULE_cte_select_stmt = 106, 
		RULE_cte_select_stmt_item = 107, RULE_cte_select_cols = 108, RULE_fullselect_stmt = 109, 
		RULE_fullselect_stmt_item_error = 110, RULE_fullselect_stmt_item = 111, 
		RULE_fullselect_set_clause = 112, RULE_subselect_stmt = 113, RULE_select_list = 114, 
		RULE_select_list_set = 115, RULE_select_list_limit = 116, RULE_select_list_item = 117, 
		RULE_select_list_alias = 118, RULE_select_list_asterisk_error = 119, RULE_select_list_asterisk = 120, 
		RULE_into_clause = 121, RULE_from_clause = 122, RULE_from_table_clause = 123, 
		RULE_from_table_name_clause = 124, RULE_from_subselect_clause = 125, RULE_from_join_clause = 126, 
		RULE_from_join_type_clause = 127, RULE_from_table_values_clause = 128, 
		RULE_from_table_values_row = 129, RULE_from_alias_clause = 130, RULE_table_name = 131, 
		RULE_where_clause = 132, RULE_group_by_clause = 133, RULE_having_clause = 134, 
		RULE_qualify_clause = 135, RULE_order_by_clause = 136, RULE_select_options = 137, 
		RULE_select_options_item = 138, RULE_bool_expr = 139, RULE_bool_expr_atom = 140, 
		RULE_bool_expr_unary = 141, RULE_bool_expr_single_in = 142, RULE_bool_expr_multi_in = 143, 
		RULE_bool_expr_binary = 144, RULE_bool_expr_logical_operator = 145, RULE_bool_expr_binary_operator = 146, 
		RULE_expr_error = 147, RULE_expr = 148, RULE_expr_atom_error = 149, RULE_expr_atom = 150, 
		RULE_expr_interval = 151, RULE_interval_item = 152, RULE_expr_concat = 153, 
		RULE_expr_concat_item = 154, RULE_expr_case = 155, RULE_expr_case_simple = 156, 
		RULE_expr_case_searched = 157, RULE_expr_cursor_attribute = 158, RULE_expr_agg_window_func = 159, 
		RULE_expr_func_all_distinct = 160, RULE_expr_func_over_clause = 161, RULE_expr_func_partition_by_clause = 162, 
		RULE_expr_spec_func = 163, RULE_expr_func = 164, RULE_expr_func_params = 165, 
		RULE_func_param = 166, RULE_date_literal = 167, RULE_timestamp_literal = 168, 
		RULE_ident = 169, RULE_string = 170, RULE_int_number = 171, RULE_dec_number = 172, 
		RULE_bool_literal = 173, RULE_null_const = 174, RULE_non_reserved_words = 175;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "funcpp", "bodycpp", "end_funcpp", "returncpp", 
		"type", "paramcpp", "numbercpp", "stmtcpp", "assign", "end_assign", "assign_select", 
		"assign_query_select", "assign_with_type", "eqexprcpp", "assign_without_type", 
		"assign_without_type2", "stmt_if_cpp", "stmt_for_cpp", "stmt_for_body_cpp", 
		"bool_expr_cpp", "bool_expr_cpp2", "comparecpp", "exprcpp", "exprcppt", 
		"identexprcpp", "plusormenus2", "plusormenus", "exception_block", "exception_block_item", 
		"declare_stmt", "declare_block", "declare_block_inplace", "declare_stmt_item", 
		"declare_var_item", "declare_condition_item", "declare_cursor_item", "cursor_with_return", 
		"cursor_without_return", "declare_handler_item", "declare_temporary_table_item", 
		"create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
		"create_table_columns_error", "create_table_columns", "create_table_columns_item", 
		"column_name", "create_table_column_inline_cons", "create_table_column_cons", 
		"create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item", 
		"create_table_preoptions_td_item", "create_table_options", "create_table_options_item", 
		"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
		"create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields", 
		"create_table_options_mssql_item", "create_table_options_mysql_item", 
		"dtype", "dtype_len_error", "dtype_len", "dtype_attr", "dtype_default", 
		"create_database_stmt_error", "create_database_stmt", "create_database_option", 
		"create_function_stmt", "create_function_return", "create_package_stmt", 
		"package_spec", "package_spec_item", "create_package_body_stmt", "package_body", 
		"package_body_item", "create_procedure_stmt", "create_routine_params", 
		"create_routine_param_item", "create_routine_options", "create_routine_option", 
		"if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt", "elseif_block", 
		"else_block", "create_index_stmt", "create_index_col", "index_storage_clause", 
		"index_mssql_storage_clause", "for_cursor_stmt", "for_range_stmt_error", 
		"for_range_stmt", "label", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", 
		"cte_select_cols", "fullselect_stmt", "fullselect_stmt_item_error", "fullselect_stmt_item", 
		"fullselect_set_clause", "subselect_stmt", "select_list", "select_list_set", 
		"select_list_limit", "select_list_item", "select_list_alias", "select_list_asterisk_error", 
		"select_list_asterisk", "into_clause", "from_clause", "from_table_clause", 
		"from_table_name_clause", "from_subselect_clause", "from_join_clause", 
		"from_join_type_clause", "from_table_values_clause", "from_table_values_row", 
		"from_alias_clause", "table_name", "where_clause", "group_by_clause", 
		"having_clause", "qualify_clause", "order_by_clause", "select_options", 
		"select_options_item", "bool_expr", "bool_expr_atom", "bool_expr_unary", 
		"bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator", 
		"bool_expr_binary_operator", "expr_error", "expr", "expr_atom_error", 
		"expr_atom", "expr_interval", "interval_item", "expr_concat", "expr_concat_item", 
		"expr_case", "expr_case_simple", "expr_case_searched", "expr_cursor_attribute", 
		"expr_agg_window_func", "expr_func_all_distinct", "expr_func_over_clause", 
		"expr_func_partition_by_clause", "expr_spec_func", "expr_func", "expr_func_params", 
		"func_param", "date_literal", "timestamp_literal", "ident", "string", 
		"int_number", "dec_number", "bool_literal", "null_const", "non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'.'", null, null, null, null, null, null, null, null, null, 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'+'", "':'", "','", 
		"'||'", "'&&'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", "T_ALTER", 
		"T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", "T_ASSOCIATE", 
		"T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", "T_BETWEEN", 
		"T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", 
		"T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", 
		"T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", 
		"T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", 
		"T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", 
		"T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", "T_COUNT_BIG", 
		"T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", 
		"T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", 
		"T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", "T_DEFINED", 
		"T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DELIMITER", 
		"T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", "T_DISTINCT", 
		"T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", 
		"T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", 
		"T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXISTS_ERROR", 
		"T_EXIT", "T_FALLBACK", "T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", 
		"T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", 
		"T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", 
		"T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", 
		"T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", 
		"T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", 
		"T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", 
		"T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", 
		"T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", 
		"T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", 
		"T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", 
		"T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", "T_NEW", 
		"T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", 
		"T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", 
		"T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", 
		"T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", 
		"T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", 
		"T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", 
		"T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", 
		"T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", 
		"T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
		"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", 
		"T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
		"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
		"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
		"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
		"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
		"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
		"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
		"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", "T_TYPE", 
		"T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", 
		"T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", 
		"T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
		"T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", 
		"T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", 
		"T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", 
		"T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", 
		"T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", 
		"T_VARIANCE", "T_USER", "T_VOID", "T_BOOLEAN", "T_QUERY", "T_ADD", "T_COLON", 
		"T_COMMA", "T_PIPE", "T_AND2", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", 
		"T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", "T_GREATEREQUAL", "T_LESS", 
		"T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", 
		"T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", "L_IDENTCPP", "L_ID", 
		"L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", "L_S_COMMENT", 
		"L_FILE", "L_LABEL"
	};
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
	public String getGrammarFileName() { return "compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compilerParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			block();
			setState(353);
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

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(compilerParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(compilerParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(355);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(356);
						stmt();
						}
						break;
					}
					setState(360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(359);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(364); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(compilerParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(366);
				declare_block();
				}
			}

			setState(369);
			match(T_BEGIN);
			setState(370);
			block();
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(371);
				exception_block();
				}
				break;
			}
			setState(374);
			block_end();
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

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(compilerParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(compilerParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(T_BEGIN);
				setState(377);
				block();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(378);
					exception_block();
					}
					break;
				}
				setState(381);
				block_end();
				}
				break;
			case T__1:
			case T_ALTER:
			case T_CHAR:
			case T_CREATE:
			case T_DECLARE:
			case T_DOUBLE:
			case T_FLOAT:
			case T_FOR:
			case T_FUNCTION:
			case T_IF:
			case T_INT:
			case T_PACKAGE:
			case T_PROC:
			case T_PROCEDURE:
			case T_REPLACE:
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_VOID:
			case T_BOOLEAN:
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				stmt();
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(384);
					match(T_SEMICOLON);
					}
					break;
				}
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

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(390);
			match(T_END);
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

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(compilerParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(393);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(396); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(398);
					match(T_GO);
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

	public static class StmtContext extends ParserRuleContext {
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public FuncppContext funcpp() {
			return getRuleContext(FuncppContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				create_database_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				create_index_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				create_local_temp_table_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				create_package_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(408);
				create_package_body_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(409);
				create_procedure_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				create_table_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(411);
				declare_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(412);
				for_cursor_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(413);
				for_range_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(414);
				if_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(415);
				select_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(416);
				funcpp();
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

	public static class FuncppContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public BodycppContext bodycpp() {
			return getRuleContext(BodycppContext.class,0);
		}
		public List<ParamcppContext> paramcpp() {
			return getRuleContexts(ParamcppContext.class);
		}
		public ParamcppContext paramcpp(int i) {
			return getRuleContext(ParamcppContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public FuncppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFuncpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFuncpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFuncpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncppContext funcpp() throws RecognitionException {
		FuncppContext _localctx = new FuncppContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcpp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			type();
			setState(420);
			match(L_IDENTCPP);
			setState(421);
			match(T_OPEN_P);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CHAR || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T_DOUBLE - 88)) | (1L << (T_FLOAT - 88)) | (1L << (T_INT - 88)))) != 0) || _la==T_VOID || _la==T_BOOLEAN) {
				{
				setState(422);
				paramcpp();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(423);
					match(T_COMMA);
					setState(424);
					paramcpp();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(432);
			match(T_CLOSE_P);
			setState(433);
			bodycpp();
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

	public static class BodycppContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(compilerParser.T_OPEN_B, 0); }
		public End_funcppContext end_funcpp() {
			return getRuleContext(End_funcppContext.class,0);
		}
		public List<StmtcppContext> stmtcpp() {
			return getRuleContexts(StmtcppContext.class);
		}
		public StmtcppContext stmtcpp(int i) {
			return getRuleContext(StmtcppContext.class,i);
		}
		public List<BodycppContext> bodycpp() {
			return getRuleContexts(BodycppContext.class);
		}
		public BodycppContext bodycpp(int i) {
			return getRuleContext(BodycppContext.class,i);
		}
		public BodycppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodycpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBodycpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBodycpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBodycpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodycppContext bodycpp() throws RecognitionException {
		BodycppContext _localctx = new BodycppContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bodycpp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T_OPEN_B);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_CHAR || _la==T_CREATE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T_DOUBLE - 88)) | (1L << (T_FLOAT - 88)) | (1L << (T_FOR - 88)) | (1L << (T_IF - 88)) | (1L << (T_INT - 88)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (T_RETURN - 232)) | (1L << (T_SEL - 232)) | (1L << (T_SELECT - 232)))) != 0) || ((((_la - 312)) & ~0x3f) == 0 && ((1L << (_la - 312)) & ((1L << (T_WITH - 312)) | (1L << (T_VOID - 312)) | (1L << (T_BOOLEAN - 312)) | (1L << (T_OPEN_B - 312)) | (1L << (T_OPEN_P - 312)) | (1L << (L_IDENTCPP - 312)))) != 0)) {
				{
				setState(438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHAR:
				case T_CREATE:
				case T_DOUBLE:
				case T_FLOAT:
				case T_FOR:
				case T_IF:
				case T_INT:
				case T_RETURN:
				case T_SEL:
				case T_SELECT:
				case T_WITH:
				case T_VOID:
				case T_BOOLEAN:
				case T_OPEN_P:
				case L_IDENTCPP:
					{
					setState(436);
					stmtcpp();
					}
					break;
				case T_OPEN_B:
					{
					setState(437);
					bodycpp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			end_funcpp();
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

	public static class End_funcppContext extends ParserRuleContext {
		public TerminalNode T_CLOSE_B() { return getToken(compilerParser.T_CLOSE_B, 0); }
		public End_funcppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_funcpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterEnd_funcpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitEnd_funcpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitEnd_funcpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_funcppContext end_funcpp() throws RecognitionException {
		End_funcppContext _localctx = new End_funcppContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_end_funcpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T_CLOSE_B);
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

	public static class ReturncppContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(compilerParser.T_RETURN, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(compilerParser.T_SEMICOLON, 0); }
		public ExprcppContext exprcpp() {
			return getRuleContext(ExprcppContext.class,0);
		}
		public ReturncppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returncpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterReturncpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitReturncpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitReturncpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturncppContext returncpp() throws RecognitionException {
		ReturncppContext _localctx = new ReturncppContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returncpp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T_RETURN);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & ((1L << (T_ADD - 345)) | (1L << (T_OPEN_P - 345)) | (1L << (T_SUB - 345)) | (1L << (L_IDENTCPP - 345)) | (1L << (L_INT - 345)) | (1L << (L_DEC - 345)))) != 0)) {
				{
				setState(448);
				exprcpp();
				}
			}

			setState(451);
			match(T_SEMICOLON);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(compilerParser.T_CHAR, 0); }
		public TerminalNode T_DOUBLE() { return getToken(compilerParser.T_DOUBLE, 0); }
		public TerminalNode T_INT() { return getToken(compilerParser.T_INT, 0); }
		public TerminalNode T_FLOAT() { return getToken(compilerParser.T_FLOAT, 0); }
		public TerminalNode T_BOOLEAN() { return getToken(compilerParser.T_BOOLEAN, 0); }
		public TerminalNode T_VOID() { return getToken(compilerParser.T_VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(_la==T_CHAR || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T_DOUBLE - 88)) | (1L << (T_FLOAT - 88)) | (1L << (T_INT - 88)))) != 0) || _la==T_VOID || _la==T_BOOLEAN) ) {
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

	public static class ParamcppContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public NumbercppContext numbercpp() {
			return getRuleContext(NumbercppContext.class,0);
		}
		public ParamcppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramcpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterParamcpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitParamcpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitParamcpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamcppContext paramcpp() throws RecognitionException {
		ParamcppContext _localctx = new ParamcppContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paramcpp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			type();
			setState(456);
			match(L_IDENTCPP);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(457);
				match(T_EQUAL);
				setState(458);
				numbercpp();
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

	public static class NumbercppContext extends ParserRuleContext {
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public NumbercppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbercpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterNumbercpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitNumbercpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitNumbercpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbercppContext numbercpp() throws RecognitionException {
		NumbercppContext _localctx = new NumbercppContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numbercpp);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				int_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				dec_number();
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

	public static class StmtcppContext extends ParserRuleContext {
		public ReturncppContext returncpp() {
			return getRuleContext(ReturncppContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Stmt_if_cppContext stmt_if_cpp() {
			return getRuleContext(Stmt_if_cppContext.class,0);
		}
		public Stmt_for_cppContext stmt_for_cpp() {
			return getRuleContext(Stmt_for_cppContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public StmtcppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtcpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterStmtcpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitStmtcpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitStmtcpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtcppContext stmtcpp() throws RecognitionException {
		StmtcppContext _localctx = new StmtcppContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmtcpp);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				returncpp();
				}
				break;
			case T_CHAR:
			case T_DOUBLE:
			case T_FLOAT:
			case T_INT:
			case T_VOID:
			case T_BOOLEAN:
			case L_IDENTCPP:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				assign();
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				stmt_if_cpp();
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				stmt_for_cpp();
				}
				break;
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				select_stmt();
				}
				break;
			case T_CREATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				create_table_stmt();
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

	public static class AssignContext extends ParserRuleContext {
		public End_assignContext end_assign() {
			return getRuleContext(End_assignContext.class,0);
		}
		public Assign_selectContext assign_select() {
			return getRuleContext(Assign_selectContext.class,0);
		}
		public Assign_query_selectContext assign_query_select() {
			return getRuleContext(Assign_query_selectContext.class,0);
		}
		public Assign_with_typeContext assign_with_type() {
			return getRuleContext(Assign_with_typeContext.class,0);
		}
		public Assign_without_typeContext assign_without_type() {
			return getRuleContext(Assign_without_typeContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(473);
				assign_select();
				}
				break;
			case 2:
				{
				setState(474);
				assign_query_select();
				}
				break;
			case 3:
				{
				setState(475);
				assign_with_type();
				}
				break;
			case 4:
				{
				setState(476);
				assign_without_type();
				}
				break;
			}
			setState(479);
			end_assign();
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

	public static class End_assignContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(compilerParser.T_SEMICOLON, 0); }
		public End_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterEnd_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitEnd_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitEnd_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_assignContext end_assign() throws RecognitionException {
		End_assignContext _localctx = new End_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_end_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T_SEMICOLON);
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

	public static class Assign_selectContext extends ParserRuleContext {
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Assign_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterAssign_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitAssign_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitAssign_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_selectContext assign_select() throws RecognitionException {
		Assign_selectContext _localctx = new Assign_selectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(L_IDENTCPP);
			setState(484);
			match(T_EQUAL);
			setState(485);
			select_stmt();
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

	public static class Assign_query_selectContext extends ParserRuleContext {
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public TerminalNode T_QUERY() { return getToken(compilerParser.T_QUERY, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Assign_query_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_query_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterAssign_query_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitAssign_query_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitAssign_query_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_query_selectContext assign_query_select() throws RecognitionException {
		Assign_query_selectContext _localctx = new Assign_query_selectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_query_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(L_IDENTCPP);
			setState(488);
			match(T_EQUAL);
			setState(489);
			match(T_QUERY);
			setState(490);
			select_stmt();
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

	public static class Assign_with_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public EqexprcppContext eqexprcpp() {
			return getRuleContext(EqexprcppContext.class,0);
		}
		public Assign_with_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_with_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterAssign_with_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitAssign_with_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitAssign_with_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_with_typeContext assign_with_type() throws RecognitionException {
		Assign_with_typeContext _localctx = new Assign_with_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign_with_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			type();
			setState(493);
			match(L_IDENTCPP);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(494);
				eqexprcpp();
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

	public static class EqexprcppContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public ExprcppContext exprcpp() {
			return getRuleContext(ExprcppContext.class,0);
		}
		public EqexprcppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqexprcpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterEqexprcpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitEqexprcpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitEqexprcpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqexprcppContext eqexprcpp() throws RecognitionException {
		EqexprcppContext _localctx = new EqexprcppContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_eqexprcpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T_EQUAL);
			setState(498);
			exprcpp();
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

	public static class Assign_without_typeContext extends ParserRuleContext {
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public Assign_without_type2Context assign_without_type2() {
			return getRuleContext(Assign_without_type2Context.class,0);
		}
		public Assign_without_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_without_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterAssign_without_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitAssign_without_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitAssign_without_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_without_typeContext assign_without_type() throws RecognitionException {
		Assign_without_typeContext _localctx = new Assign_without_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_without_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(L_IDENTCPP);
			setState(501);
			assign_without_type2();
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

	public static class Assign_without_type2Context extends ParserRuleContext {
		public List<TerminalNode> T_ADD() { return getTokens(compilerParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(compilerParser.T_ADD, i);
		}
		public EqexprcppContext eqexprcpp() {
			return getRuleContext(EqexprcppContext.class,0);
		}
		public List<TerminalNode> T_SUB() { return getTokens(compilerParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(compilerParser.T_SUB, i);
		}
		public Assign_without_type2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_without_type2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterAssign_without_type2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitAssign_without_type2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitAssign_without_type2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_without_type2Context assign_without_type2() throws RecognitionException {
		Assign_without_type2Context _localctx = new Assign_without_type2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_without_type2);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ADD:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(503);
				match(T_ADD);
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ADD:
					{
					setState(504);
					match(T_ADD);
					}
					break;
				case T_EQUAL:
					{
					setState(505);
					eqexprcpp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T_SUB:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(508);
				match(T_SUB);
				setState(511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_SUB:
					{
					setState(509);
					match(T_SUB);
					}
					break;
				case T_EQUAL:
					{
					setState(510);
					eqexprcpp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				eqexprcpp();
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

	public static class Stmt_if_cppContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(compilerParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(compilerParser.T_IF, i);
		}
		public List<TerminalNode> T_OPEN_P() { return getTokens(compilerParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(compilerParser.T_OPEN_P, i);
		}
		public List<Bool_expr_cppContext> bool_expr_cpp() {
			return getRuleContexts(Bool_expr_cppContext.class);
		}
		public Bool_expr_cppContext bool_expr_cpp(int i) {
			return getRuleContext(Bool_expr_cppContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(compilerParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(compilerParser.T_CLOSE_P, i);
		}
		public List<BodycppContext> bodycpp() {
			return getRuleContexts(BodycppContext.class);
		}
		public BodycppContext bodycpp(int i) {
			return getRuleContext(BodycppContext.class,i);
		}
		public List<TerminalNode> T_ELSE() { return getTokens(compilerParser.T_ELSE); }
		public TerminalNode T_ELSE(int i) {
			return getToken(compilerParser.T_ELSE, i);
		}
		public Stmt_if_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_if_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterStmt_if_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitStmt_if_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitStmt_if_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_if_cppContext stmt_if_cpp() throws RecognitionException {
		Stmt_if_cppContext _localctx = new Stmt_if_cppContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stmt_if_cpp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T_IF);
			setState(517);
			match(T_OPEN_P);
			setState(518);
			bool_expr_cpp();
			setState(519);
			match(T_CLOSE_P);
			setState(520);
			bodycpp();
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					match(T_ELSE);
					setState(522);
					match(T_IF);
					setState(523);
					match(T_OPEN_P);
					setState(524);
					bool_expr_cpp();
					setState(525);
					match(T_CLOSE_P);
					setState(526);
					bodycpp();
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(533);
				match(T_ELSE);
				setState(534);
				bodycpp();
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

	public static class Stmt_for_cppContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(compilerParser.T_FOR, 0); }
		public Stmt_for_body_cppContext stmt_for_body_cpp() {
			return getRuleContext(Stmt_for_body_cppContext.class,0);
		}
		public BodycppContext bodycpp() {
			return getRuleContext(BodycppContext.class,0);
		}
		public Stmt_for_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_for_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterStmt_for_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitStmt_for_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitStmt_for_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_for_cppContext stmt_for_cpp() throws RecognitionException {
		Stmt_for_cppContext _localctx = new Stmt_for_cppContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stmt_for_cpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T_FOR);
			setState(538);
			stmt_for_body_cpp();
			setState(539);
			bodycpp();
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

	public static class Stmt_for_body_cppContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<TerminalNode> T_SEMICOLON() { return getTokens(compilerParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(compilerParser.T_SEMICOLON, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<Assign_with_typeContext> assign_with_type() {
			return getRuleContexts(Assign_with_typeContext.class);
		}
		public Assign_with_typeContext assign_with_type(int i) {
			return getRuleContext(Assign_with_typeContext.class,i);
		}
		public List<Assign_without_typeContext> assign_without_type() {
			return getRuleContexts(Assign_without_typeContext.class);
		}
		public Assign_without_typeContext assign_without_type(int i) {
			return getRuleContext(Assign_without_typeContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Bool_expr_cppContext bool_expr_cpp() {
			return getRuleContext(Bool_expr_cppContext.class,0);
		}
		public Stmt_for_body_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_for_body_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterStmt_for_body_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitStmt_for_body_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitStmt_for_body_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_for_body_cppContext stmt_for_body_cpp() throws RecognitionException {
		Stmt_for_body_cppContext _localctx = new Stmt_for_body_cppContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stmt_for_body_cpp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(T_OPEN_P);
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
			case T_DOUBLE:
			case T_FLOAT:
			case T_INT:
			case T_VOID:
			case T_BOOLEAN:
				{
				setState(542);
				assign_with_type();
				}
				break;
			case L_IDENTCPP:
				{
				setState(543);
				assign_without_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(546);
				match(T_COMMA);
				setState(549);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHAR:
				case T_DOUBLE:
				case T_FLOAT:
				case T_INT:
				case T_VOID:
				case T_BOOLEAN:
					{
					setState(547);
					assign_with_type();
					}
					break;
				case L_IDENTCPP:
					{
					setState(548);
					assign_without_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			match(T_SEMICOLON);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT || ((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & ((1L << (T_ADD - 345)) | (1L << (T_OPEN_P - 345)) | (1L << (T_SUB - 345)) | (1L << (L_IDENTCPP - 345)) | (1L << (L_INT - 345)) | (1L << (L_DEC - 345)))) != 0)) {
				{
				setState(557);
				bool_expr_cpp();
				}
			}

			setState(560);
			match(T_SEMICOLON);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_IDENTCPP) {
				{
				setState(561);
				assign_without_type();
				}
			}

			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(564);
				match(T_COMMA);
				setState(565);
				assign_without_type();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(T_CLOSE_P);
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

	public static class Bool_expr_cppContext extends ParserRuleContext {
		public List<ExprcppContext> exprcpp() {
			return getRuleContexts(ExprcppContext.class);
		}
		public ExprcppContext exprcpp(int i) {
			return getRuleContext(ExprcppContext.class,i);
		}
		public List<TerminalNode> T_NOT() { return getTokens(compilerParser.T_NOT); }
		public TerminalNode T_NOT(int i) {
			return getToken(compilerParser.T_NOT, i);
		}
		public ComparecppContext comparecpp() {
			return getRuleContext(ComparecppContext.class,0);
		}
		public Bool_expr_cpp2Context bool_expr_cpp2() {
			return getRuleContext(Bool_expr_cpp2Context.class,0);
		}
		public Bool_expr_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_cppContext bool_expr_cpp() throws RecognitionException {
		Bool_expr_cppContext _localctx = new Bool_expr_cppContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool_expr_cpp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(573);
				match(T_NOT);
				}
			}

			setState(576);
			exprcpp();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & ((1L << (T_EQUAL2 - 353)) | (1L << (T_NOTEQUAL2 - 353)) | (1L << (T_GREATER - 353)) | (1L << (T_GREATEREQUAL - 353)) | (1L << (T_LESS - 353)) | (1L << (T_LESSEQUAL - 353)))) != 0)) {
				{
				setState(577);
				comparecpp();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(578);
					match(T_NOT);
					}
				}

				setState(581);
				exprcpp();
				}
			}

			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PIPE || _la==T_AND2) {
				{
				setState(585);
				bool_expr_cpp2();
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

	public static class Bool_expr_cpp2Context extends ParserRuleContext {
		public Bool_expr_cppContext bool_expr_cpp() {
			return getRuleContext(Bool_expr_cppContext.class,0);
		}
		public TerminalNode T_AND2() { return getToken(compilerParser.T_AND2, 0); }
		public TerminalNode T_PIPE() { return getToken(compilerParser.T_PIPE, 0); }
		public Bool_expr_cpp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_cpp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_cpp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_cpp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_cpp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_cpp2Context bool_expr_cpp2() throws RecognitionException {
		Bool_expr_cpp2Context _localctx = new Bool_expr_cpp2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool_expr_cpp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if ( !(_la==T_PIPE || _la==T_AND2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(589);
			bool_expr_cpp();
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

	public static class ComparecppContext extends ParserRuleContext {
		public TerminalNode T_EQUAL2() { return getToken(compilerParser.T_EQUAL2, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(compilerParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(compilerParser.T_GREATER, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(compilerParser.T_LESSEQUAL, 0); }
		public TerminalNode T_LESS() { return getToken(compilerParser.T_LESS, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(compilerParser.T_NOTEQUAL2, 0); }
		public ComparecppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparecpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterComparecpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitComparecpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitComparecpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparecppContext comparecpp() throws RecognitionException {
		ComparecppContext _localctx = new ComparecppContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparecpp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_la = _input.LA(1);
			if ( !(((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & ((1L << (T_EQUAL2 - 353)) | (1L << (T_NOTEQUAL2 - 353)) | (1L << (T_GREATER - 353)) | (1L << (T_GREATEREQUAL - 353)) | (1L << (T_LESS - 353)) | (1L << (T_LESSEQUAL - 353)))) != 0)) ) {
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

	public static class ExprcppContext extends ParserRuleContext {
		public ExprcpptContext exprcppt() {
			return getRuleContext(ExprcpptContext.class,0);
		}
		public PlusormenusContext plusormenus() {
			return getRuleContext(PlusormenusContext.class,0);
		}
		public ExprcppContext exprcpp() {
			return getRuleContext(ExprcppContext.class,0);
		}
		public ExprcppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExprcpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExprcpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExprcpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprcppContext exprcpp() throws RecognitionException {
		ExprcppContext _localctx = new ExprcppContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprcpp);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(593);
				exprcppt();
				setState(594);
				plusormenus();
				setState(595);
				exprcpp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				exprcppt();
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

	public static class ExprcpptContext extends ParserRuleContext {
		public IdentexprcppContext identexprcpp() {
			return getRuleContext(IdentexprcppContext.class,0);
		}
		public ExprcpptContext exprcppt() {
			return getRuleContext(ExprcpptContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(compilerParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(compilerParser.T_DIV, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public ExprcppContext exprcpp() {
			return getRuleContext(ExprcppContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public ExprcpptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcppt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExprcppt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExprcppt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExprcppt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprcpptContext exprcppt() throws RecognitionException {
		ExprcpptContext _localctx = new ExprcpptContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exprcppt);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				identexprcpp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(601);
				identexprcpp();
				setState(602);
				_la = _input.LA(1);
				if ( !(_la==T_DIV || _la==T_MUL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(603);
				exprcppt();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(605);
				match(T_OPEN_P);
				setState(606);
				exprcpp();
				setState(607);
				match(T_CLOSE_P);
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

	public static class IdentexprcppContext extends ParserRuleContext {
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public NumbercppContext numbercpp() {
			return getRuleContext(NumbercppContext.class,0);
		}
		public List<Plusormenus2Context> plusormenus2() {
			return getRuleContexts(Plusormenus2Context.class);
		}
		public Plusormenus2Context plusormenus2(int i) {
			return getRuleContext(Plusormenus2Context.class,i);
		}
		public IdentexprcppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identexprcpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIdentexprcpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIdentexprcpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIdentexprcpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentexprcppContext identexprcpp() throws RecognitionException {
		IdentexprcppContext _localctx = new IdentexprcppContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_identexprcpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(611);
				plusormenus2();
				}
				break;
			}
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_IDENTCPP:
				{
				setState(614);
				match(L_IDENTCPP);
				}
				break;
			case T_ADD:
			case T_SUB:
			case L_INT:
			case L_DEC:
				{
				setState(615);
				numbercpp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(618);
				plusormenus2();
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

	public static class Plusormenus2Context extends ParserRuleContext {
		public List<TerminalNode> T_ADD() { return getTokens(compilerParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(compilerParser.T_ADD, i);
		}
		public List<TerminalNode> T_SUB() { return getTokens(compilerParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(compilerParser.T_SUB, i);
		}
		public Plusormenus2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusormenus2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterPlusormenus2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitPlusormenus2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitPlusormenus2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plusormenus2Context plusormenus2() throws RecognitionException {
		Plusormenus2Context _localctx = new Plusormenus2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_plusormenus2);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ADD:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(621);
				match(T_ADD);
				setState(622);
				match(T_ADD);
				}
				}
				break;
			case T_SUB:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(623);
				match(T_SUB);
				setState(624);
				match(T_SUB);
				}
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

	public static class PlusormenusContext extends ParserRuleContext {
		public TerminalNode T_ADD() { return getToken(compilerParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(compilerParser.T_SUB, 0); }
		public PlusormenusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusormenus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterPlusormenus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitPlusormenus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitPlusormenus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusormenusContext plusormenus() throws RecognitionException {
		PlusormenusContext _localctx = new PlusormenusContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_plusormenus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_la = _input.LA(1);
			if ( !(_la==T_ADD || _la==T_SUB) ) {
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

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(compilerParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitException_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(T_EXCEPTION);
			setState(631); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(630);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(633); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(compilerParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(compilerParser.T_WHEN, i);
		}
		public TerminalNode T_THEN() { return getToken(compilerParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode L_ID() { return getToken(compilerParser.L_ID, 0); }
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitException_block_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(T_WHEN);
			setState(636);
			_la = _input.LA(1);
			if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(637);
			match(T_THEN);
			setState(638);
			block();
			setState(639);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
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

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(compilerParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T_DECLARE);
			setState(642);
			declare_stmt_item();
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(643);
					match(T_COMMA);
					setState(644);
					declare_stmt_item();
					}
					} 
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(compilerParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(compilerParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(compilerParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T_DECLARE);
			setState(651);
			declare_stmt_item();
			setState(652);
			match(T_SEMICOLON);
			setState(658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(653);
					declare_stmt_item();
					setState(654);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(compilerParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(compilerParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			declare_stmt_item();
			setState(662);
			match(T_SEMICOLON);
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(663);
					declare_stmt_item();
					setState(664);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declare_stmt_item);
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(674);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(675);
				declare_temporary_table_item();
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

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(compilerParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				ident();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(679);
					match(T_COMMA);
					setState(680);
					ident();
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(686);
					match(T_AS);
					}
					break;
				}
				setState(689);
				dtype();
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(690);
					dtype_len();
					}
					break;
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(693);
						dtype_attr();
						}
						} 
					}
					setState(698);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(699);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				ident();
				setState(703);
				match(T_CONSTANT);
				setState(705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(704);
					match(T_AS);
					}
					break;
				}
				setState(707);
				dtype();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(708);
					dtype_len();
					}
				}

				setState(711);
				dtype_default();
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

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(compilerParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			ident();
			setState(716);
			match(T_CONDITION);
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

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(compilerParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(compilerParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(compilerParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(718);
				match(T_CURSOR);
				setState(719);
				ident();
				}
				break;
			case 2:
				{
				setState(720);
				ident();
				setState(721);
				match(T_CURSOR);
				}
				break;
			}
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(725);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(726);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(729);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(730);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(731);
				expr(0);
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

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(compilerParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(compilerParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(compilerParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(compilerParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(compilerParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T_WITH);
			setState(735);
			match(T_RETURN);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(736);
				match(T_ONLY);
				}
			}

			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(739);
				match(T_TO);
				setState(740);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
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

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(compilerParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(compilerParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(T_WITHOUT);
			setState(744);
			match(T_RETURN);
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

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(compilerParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(compilerParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(compilerParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(compilerParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(compilerParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(compilerParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(compilerParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(747);
			match(T_HANDLER);
			setState(748);
			match(T_FOR);
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(749);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(750);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(751);
				match(T_NOT);
				setState(752);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(753);
				ident();
				}
				break;
			}
			setState(756);
			single_block_stmt();
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

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(compilerParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(compilerParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(compilerParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(758);
				match(T_GLOBAL);
				}
			}

			setState(761);
			match(T_TEMPORARY);
			setState(762);
			match(T_TABLE);
			setState(763);
			ident();
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(764);
				create_table_preoptions();
				}
			}

			setState(767);
			create_table_definition();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(compilerParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(compilerParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(compilerParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(T_CREATE);
			setState(770);
			match(T_TABLE);
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(771);
				match(T_IF);
				setState(772);
				match(T_NOT);
				setState(773);
				match(T_EXISTS);
				}
				break;
			}
			setState(776);
			table_name();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(777);
				create_table_preoptions();
				}
			}

			setState(780);
			create_table_definition();
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

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(compilerParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(compilerParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(compilerParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(compilerParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(compilerParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(compilerParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(T_CREATE);
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(783);
				match(T_LOCAL);
				setState(784);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(785);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(788);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(791);
			match(T_TABLE);
			setState(792);
			ident();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(793);
				create_table_preoptions();
				}
			}

			setState(796);
			create_table_definition();
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

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(798);
					match(T_AS);
					}
				}

				setState(801);
				match(T_OPEN_P);
				setState(802);
				select_stmt();
				setState(803);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(805);
					match(T_AS);
					}
				}

				setState(808);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(809);
				match(T_OPEN_P);
				setState(810);
				create_table_columns();
				setState(811);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(815);
				create_table_options();
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

	public static class Create_table_columns_errorContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(compilerParser.T_SEMICOLON, 0); }
		public Create_table_columns_itemContext create_table_columns_item() {
			return getRuleContext(Create_table_columns_itemContext.class,0);
		}
		public Create_table_columns_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_columns_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_columns_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_columns_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_errorContext create_table_columns_error() throws RecognitionException {
		Create_table_columns_errorContext _localctx = new Create_table_columns_errorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_columns_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(818);
			match(T_SEMICOLON);
			setState(819);
			create_table_columns_item();
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

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<Create_table_columns_errorContext> create_table_columns_error() {
			return getRuleContexts(Create_table_columns_errorContext.class);
		}
		public Create_table_columns_errorContext create_table_columns_error(int i) {
			return getRuleContext(Create_table_columns_errorContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			create_table_columns_item();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA || _la==T_SEMICOLON) {
				{
				setState(825);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_COMMA:
					{
					{
					setState(822);
					match(T_COMMA);
					setState(823);
					create_table_columns_item();
					}
					}
					break;
				case T_SEMICOLON:
					{
					setState(824);
					create_table_columns_error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(829);
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

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(compilerParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				column_name();
				setState(831);
				dtype();
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(832);
					dtype_len();
					}
				}

				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(835);
						dtype_attr();
						}
						} 
					}
					setState(840);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T_DEFAULT - 72)) | (1L << (T_ENABLE - 72)) | (1L << (T_IDENTITY - 72)))) != 0) || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (T_NOT - 191)) | (1L << (T_NULL - 191)) | (1L << (T_PRIMARY - 191)) | (1L << (T_REFERENCES - 191)))) != 0) || ((((_la - 297)) & ~0x3f) == 0 && ((1L << (_la - 297)) & ((1L << (T_UNIQUE - 297)) | (1L << (T_WITH - 297)) | (1L << (T_COLON - 297)) | (1L << (T_EQUAL - 297)))) != 0)) {
					{
					{
					setState(841);
					create_table_column_inline_cons();
					}
					}
					setState(846);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(847);
					match(T_CONSTRAINT);
					setState(848);
					ident();
					}
				}

				setState(851);
				create_table_column_cons();
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

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			ident();
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

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(compilerParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(compilerParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(compilerParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(compilerParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(compilerParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(compilerParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(compilerParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(compilerParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(compilerParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(compilerParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(857);
					match(T_NOT);
					}
				}

				setState(860);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				match(T_PRIMARY);
				setState(862);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				match(T_REFERENCES);
				setState(865);
				table_name();
				setState(866);
				match(T_OPEN_P);
				setState(867);
				ident();
				setState(868);
				match(T_CLOSE_P);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(869);
					create_table_fk_action();
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(875);
				match(T_IDENTITY);
				setState(876);
				match(T_OPEN_P);
				setState(877);
				match(L_INT);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(878);
					match(T_COMMA);
					setState(879);
					match(L_INT);
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(886);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(887);
				match(T_ENABLE);
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

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(compilerParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(compilerParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(compilerParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(compilerParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(compilerParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(compilerParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(compilerParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(compilerParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(compilerParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(compilerParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(compilerParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(compilerParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(compilerParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(compilerParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_table_column_cons);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(T_PRIMARY);
				setState(891);
				match(T_KEY);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(892);
					match(T_CLUSTERED);
					}
				}

				setState(895);
				match(T_OPEN_P);
				setState(896);
				ident();
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(897);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(900);
					match(T_COMMA);
					setState(901);
					ident();
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(902);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
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
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(910);
				match(T_CLOSE_P);
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(911);
					match(T_ENABLE);
					}
				}

				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(914);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(T_FOREIGN);
				setState(918);
				match(T_KEY);
				setState(919);
				match(T_OPEN_P);
				setState(920);
				ident();
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(921);
					match(T_COMMA);
					setState(922);
					ident();
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(928);
				match(T_CLOSE_P);
				setState(929);
				match(T_REFERENCES);
				setState(930);
				table_name();
				setState(931);
				match(T_OPEN_P);
				setState(932);
				ident();
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(933);
					match(T_COMMA);
					setState(934);
					ident();
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(940);
				match(T_CLOSE_P);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(941);
					create_table_fk_action();
					}
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(compilerParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(compilerParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(compilerParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(compilerParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(compilerParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(compilerParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(compilerParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(compilerParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(compilerParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(compilerParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(T_ON);
			setState(950);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(951);
				match(T_NO);
				setState(952);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(953);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(954);
				match(T_SET);
				setState(955);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(956);
				match(T_SET);
				setState(957);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(958);
				match(T_CASCADE);
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

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(961);
				create_table_preoptions_item();
				}
				}
				setState(964); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
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

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(compilerParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_table_preoptions_item);
		try {
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				match(T_COMMA);
				setState(967);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				create_table_options_hive_item();
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

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(compilerParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(compilerParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(compilerParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(971);
				match(T_NO);
				}
			}

			setState(974);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
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

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(977); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(976);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(979); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(compilerParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(compilerParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(compilerParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(compilerParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(compilerParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_table_options_item);
		int _la;
		try {
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				match(T_ON);
				setState(982);
				match(T_COMMIT);
				setState(983);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(984);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(987);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(988);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(989);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(990);
				create_table_options_mysql_item();
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

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(compilerParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(compilerParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(compilerParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(compilerParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(compilerParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(compilerParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(compilerParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(compilerParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(compilerParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(compilerParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(compilerParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(compilerParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(compilerParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(compilerParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(compilerParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(T_SEGMENT);
				setState(994);
				match(T_CREATION);
				setState(995);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(997);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(999);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1000);
				match(T_STORAGE);
				setState(1001);
				match(T_OPEN_P);
				setState(1004); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1004);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXISTS_ERROR:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_IDENTCPP:
					case L_ID:
						{
						setState(1002);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1003);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1006); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXISTS_ERROR - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_IDENTCPP - 320)) | (1L << (L_ID - 320)) | (1L << (L_INT - 320)))) != 0) );
				setState(1008);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1009);
				match(T_TABLESPACE);
				setState(1010);
				ident();
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

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(compilerParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(compilerParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(compilerParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(compilerParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(compilerParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(compilerParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(compilerParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(compilerParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(compilerParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(compilerParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(compilerParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(compilerParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(compilerParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(compilerParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(compilerParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1013);
					match(T_INDEX);
					}
				}

				setState(1016);
				match(T_IN);
				setState(1017);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				match(T_WITH);
				setState(1019);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				match(T_DISTRIBUTE);
				setState(1021);
				match(T_BY);
				setState(1022);
				match(T_HASH);
				setState(1023);
				match(T_OPEN_P);
				setState(1024);
				ident();
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1025);
					match(T_COMMA);
					setState(1026);
					ident();
					}
					}
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1032);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1034);
					match(T_NOT);
					}
				}

				setState(1037);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1038);
				match(T_COMPRESS);
				setState(1039);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				match(T_DEFINITION);
				setState(1041);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1042);
				match(T_WITH);
				setState(1043);
				match(T_RESTRICT);
				setState(1044);
				match(T_ON);
				setState(1045);
				match(T_DROP);
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

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(compilerParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(compilerParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(compilerParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(compilerParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1048);
					match(T_UNIQUE);
					}
				}

				setState(1051);
				match(T_PRIMARY);
				setState(1052);
				match(T_INDEX);
				setState(1053);
				match(T_OPEN_P);
				setState(1054);
				ident();
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1055);
					match(T_COMMA);
					setState(1056);
					ident();
					}
					}
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1062);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				match(T_WITH);
				setState(1065);
				match(T_DATA);
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

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(compilerParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_table_options_hive_item);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				match(T_STORED);
				setState(1070);
				match(T_AS);
				setState(1071);
				ident();
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

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(compilerParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(compilerParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(compilerParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(T_ROW);
			setState(1075);
			match(T_FORMAT);
			setState(1076);
			match(T_DELIMITED);
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1077);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(compilerParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(compilerParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(compilerParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(compilerParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(compilerParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(compilerParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(compilerParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(compilerParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(compilerParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(compilerParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(compilerParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(compilerParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_table_hive_row_format_fields);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				match(T_FIELDS);
				setState(1084);
				match(T_TERMINATED);
				setState(1085);
				match(T_BY);
				setState(1086);
				expr(0);
				setState(1090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1087);
					match(T_ESCAPED);
					setState(1088);
					match(T_BY);
					setState(1089);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(T_COLLECTION);
				setState(1093);
				match(T_ITEMS);
				setState(1094);
				match(T_TERMINATED);
				setState(1095);
				match(T_BY);
				setState(1096);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				match(T_MAP);
				setState(1098);
				match(T_KEYS);
				setState(1099);
				match(T_TERMINATED);
				setState(1100);
				match(T_BY);
				setState(1101);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1102);
				match(T_LINES);
				setState(1103);
				match(T_TERMINATED);
				setState(1104);
				match(T_BY);
				setState(1105);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1106);
				match(T_NULL);
				setState(1107);
				match(T_DEFINED);
				setState(1108);
				match(T_AS);
				setState(1109);
				expr(0);
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

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(compilerParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(compilerParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_table_options_mssql_item);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				match(T_ON);
				setState(1113);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(T_TEXTIMAGE_ON);
				setState(1115);
				ident();
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

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(compilerParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(compilerParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(compilerParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(compilerParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(compilerParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(compilerParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(compilerParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				match(T_AUTO_INCREMENT);
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1119);
					match(T_EQUAL);
					}
				}

				setState(1122);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(T_COMMENT);
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1124);
					match(T_EQUAL);
					}
				}

				setState(1127);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1128);
					match(T_DEFAULT);
					}
				}

				setState(1134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1131);
					match(T_CHARACTER);
					setState(1132);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1133);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1136);
					match(T_EQUAL);
					}
				}

				setState(1139);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1140);
				match(T_ENGINE);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1141);
					match(T_EQUAL);
					}
				}

				setState(1144);
				expr(0);
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

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(compilerParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(compilerParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(compilerParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(compilerParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(compilerParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(compilerParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(compilerParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(compilerParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(compilerParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(compilerParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(compilerParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(compilerParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(compilerParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(compilerParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(compilerParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(compilerParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(compilerParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(compilerParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(compilerParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(compilerParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(compilerParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(compilerParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(compilerParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(compilerParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(compilerParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(compilerParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(compilerParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(compilerParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(compilerParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(compilerParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(compilerParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(compilerParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(compilerParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(compilerParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(compilerParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(compilerParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(compilerParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(compilerParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(compilerParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(compilerParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dtype);
		int _la;
		try {
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1149);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1150);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1151);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1152);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1153);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1154);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1155);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1156);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1157);
				match(T_DOUBLE);
				setState(1159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1158);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1161);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1162);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1163);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1164);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1165);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1166);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1167);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1168);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1169);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1170);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1171);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1172);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1173);
				match(T_RESULT_SET_LOCATOR);
				setState(1174);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1175);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1176);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1177);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1178);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1179);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1180);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1181);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1182);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1183);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1184);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1185);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1186);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1187);
				ident();
				setState(1190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1188);
					match(T__0);
					setState(1189);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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

	public static class Dtype_len_errorContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(compilerParser.L_DEC, 0); }
		public Dtype_len_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDtype_len_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDtype_len_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDtype_len_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_len_errorContext dtype_len_error() throws RecognitionException {
		Dtype_len_errorContext _localctx = new Dtype_len_errorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_dtype_len_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(L_DEC);
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

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(compilerParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(compilerParser.L_INT, i);
		}
		public List<Dtype_len_errorContext> dtype_len_error() {
			return getRuleContexts(Dtype_len_errorContext.class);
		}
		public Dtype_len_errorContext dtype_len_error(int i) {
			return getRuleContext(Dtype_len_errorContext.class,i);
		}
		public TerminalNode T_MAX() { return getToken(compilerParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(compilerParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(compilerParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(compilerParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(T_OPEN_P);
			{
			setState(1200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_INT:
				{
				setState(1197);
				match(L_INT);
				}
				break;
			case L_DEC:
				{
				setState(1198);
				dtype_len_error();
				}
				break;
			case T_MAX:
				{
				setState(1199);
				match(T_MAX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1202);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1205);
				match(T_COMMA);
				setState(1208);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_INT:
					{
					setState(1206);
					match(L_INT);
					}
					break;
				case L_DEC:
					{
					setState(1207);
					dtype_len_error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
			setState(1212);
			match(T_CLOSE_P);
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

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(compilerParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(compilerParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(compilerParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(compilerParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(compilerParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dtype_attr);
		int _la;
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1214);
					match(T_NOT);
					}
				}

				setState(1217);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				match(T_CHARACTER);
				setState(1219);
				match(T_SET);
				setState(1220);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1221);
					match(T_NOT);
					}
				}

				setState(1224);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(compilerParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(compilerParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dtype_default);
		int _la;
		try {
			setState(1239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1227);
					match(T_COLON);
					}
				}

				setState(1230);
				match(T_EQUAL);
				setState(1231);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1232);
					match(T_WITH);
					}
				}

				setState(1235);
				match(T_DEFAULT);
				setState(1237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1236);
					expr(0);
					}
					break;
				}
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

	public static class Create_database_stmt_errorContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(compilerParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_EXISTS_ERROR() { return getToken(compilerParser.T_EXISTS_ERROR, 0); }
		public Create_database_stmt_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_database_stmt_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_database_stmt_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_database_stmt_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmt_errorContext create_database_stmt_error() throws RecognitionException {
		Create_database_stmt_errorContext _localctx = new Create_database_stmt_errorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_create_database_stmt_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1241);
			match(T_IF);
			setState(1242);
			match(T_NOT);
			setState(1243);
			match(T_EXISTS_ERROR);
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

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(compilerParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(compilerParser.T_SCHEMA, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public TerminalNode T_IF() { return getToken(compilerParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(compilerParser.T_EXISTS, 0); }
		public TerminalNode T_EXISTS_ERROR() { return getToken(compilerParser.T_EXISTS_ERROR, 0); }
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(T_CREATE);
			setState(1246);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1247);
					match(T_IF);
					setState(1248);
					match(T_NOT);
					setState(1249);
					match(T_EXISTS);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1252);
					match(T_IF);
					setState(1253);
					match(T_NOT);
					setState(1254);
					match(T_EXISTS_ERROR);
					}
					break;
				}
				}
				break;
			}
			setState(1259);
			expr(0);
			setState(1263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1260);
					create_database_option();
					}
					} 
				}
				setState(1265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(compilerParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(compilerParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_database_option);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				match(T_COMMENT);
				setState(1267);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				match(T_LOCATION);
				setState(1269);
				expr(0);
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

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(compilerParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(compilerParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(compilerParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(compilerParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(compilerParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1272);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1273);
				match(T_CREATE);
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1274);
					match(T_OR);
					setState(1275);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1278);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1281);
			match(T_FUNCTION);
			setState(1282);
			ident();
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1283);
				create_routine_params();
				}
				break;
			}
			setState(1286);
			create_function_return();
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1287);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1290);
				declare_block_inplace();
				}
				break;
			}
			setState(1293);
			single_block_stmt();
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

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(compilerParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(compilerParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1296);
			dtype();
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1297);
				dtype_len();
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

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(compilerParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(compilerParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(compilerParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(compilerParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(compilerParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(compilerParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1300);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1301);
				match(T_CREATE);
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1302);
					match(T_OR);
					setState(1303);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1306);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1309);
			match(T_PACKAGE);
			setState(1310);
			ident();
			setState(1311);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1312);
			package_spec();
			setState(1313);
			match(T_END);
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1314);
				ident();
				setState(1315);
				match(T_SEMICOLON);
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

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(compilerParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(compilerParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			package_spec_item();
			setState(1320);
			match(T_SEMICOLON);
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXISTS_ERROR - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_IDENTCPP - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1321);
				package_spec_item();
				setState(1322);
				match(T_SEMICOLON);
				}
				}
				setState(1328);
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

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(compilerParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(compilerParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(compilerParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_package_spec_item);
		int _la;
		try {
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				match(T_FUNCTION);
				setState(1331);
				ident();
				setState(1333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1332);
					create_routine_params();
					}
					break;
				}
				setState(1335);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1337);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1338);
				ident();
				setState(1340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1339);
					create_routine_params();
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

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(compilerParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(compilerParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(compilerParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(compilerParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(compilerParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(compilerParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(compilerParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1344);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1345);
				match(T_CREATE);
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1346);
					match(T_OR);
					setState(1347);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1350);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1353);
			match(T_PACKAGE);
			setState(1354);
			match(T_BODY);
			setState(1355);
			ident();
			setState(1356);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1357);
			package_body();
			setState(1358);
			match(T_END);
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1359);
				ident();
				setState(1360);
				match(T_SEMICOLON);
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

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(compilerParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(compilerParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			package_body_item();
			setState(1365);
			match(T_SEMICOLON);
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXISTS_ERROR - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_IDENTCPP - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1366);
				package_body_item();
				setState(1367);
				match(T_SEMICOLON);
				}
				}
				setState(1373);
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

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_package_body_item);
		try {
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1376);
				create_procedure_stmt();
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

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(compilerParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(compilerParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(compilerParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(compilerParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(compilerParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(compilerParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(compilerParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1379);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1380);
				match(T_CREATE);
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1381);
					match(T_OR);
					setState(1382);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1385);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1388);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1389);
			ident();
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1390);
				create_routine_params();
				}
				break;
			}
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1393);
				create_routine_options();
				}
				break;
			}
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1396);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1399);
				declare_block_inplace();
				}
				break;
			}
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LESS || _la==L_LABEL) {
				{
				setState(1402);
				label();
				}
			}

			setState(1405);
			proc_block();
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1406);
				ident();
				setState(1407);
				match(T_SEMICOLON);
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

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_create_routine_params);
		int _la;
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				match(T_OPEN_P);
				setState(1412);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				match(T_OPEN_P);
				setState(1414);
				create_routine_param_item();
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1415);
					match(T_COMMA);
					setState(1416);
					create_routine_param_item();
					}
					}
					setState(1421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1422);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1424);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1425);
				create_routine_param_item();
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1426);
					match(T_COMMA);
					setState(1427);
					create_routine_param_item();
					}
					}
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(compilerParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(compilerParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(compilerParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1435);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1436);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1437);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1438);
					match(T_IN);
					setState(1439);
					match(T_OUT);
					}
					break;
				}
				setState(1442);
				ident();
				setState(1443);
				dtype();
				setState(1445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1444);
					dtype_len();
					}
					break;
				}
				setState(1450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1447);
						dtype_attr();
						}
						} 
					}
					setState(1452);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				}
				setState(1454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1453);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				ident();
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1457);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1458);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1459);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1460);
					match(T_IN);
					setState(1461);
					match(T_OUT);
					}
					break;
				}
				setState(1464);
				dtype();
				setState(1466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1465);
					dtype_len();
					}
					break;
				}
				setState(1471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1468);
						dtype_attr();
						}
						} 
					}
					setState(1473);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1474);
					dtype_default();
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

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1480); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1479);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1482); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(compilerParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(compilerParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(compilerParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(compilerParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(compilerParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(compilerParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(compilerParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(compilerParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(compilerParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(compilerParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(compilerParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_routine_option);
		int _la;
		try {
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				match(T_LANGUAGE);
				setState(1485);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				match(T_SQL);
				setState(1487);
				match(T_SECURITY);
				setState(1488);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1489);
					match(T_DYNAMIC);
					}
				}

				setState(1492);
				match(T_RESULT);
				setState(1493);
				match(T_SETS);
				setState(1494);
				match(L_INT);
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

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_if_stmt);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1499);
				if_bteq_stmt();
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

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(compilerParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(compilerParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(compilerParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIf_plsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(T_IF);
			setState(1503);
			bool_expr(0);
			setState(1504);
			match(T_THEN);
			setState(1505);
			block();
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1506);
				elseif_block();
				}
				}
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1512);
				else_block();
				}
			}

			setState(1515);
			match(T_END);
			setState(1516);
			match(T_IF);
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

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(compilerParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(compilerParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIf_tsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			match(T_IF);
			setState(1519);
			bool_expr(0);
			setState(1520);
			single_block_stmt();
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1521);
				match(T_ELSE);
				setState(1522);
				single_block_stmt();
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

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(compilerParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(compilerParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIf_bteq_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(T__1);
			setState(1526);
			match(T_IF);
			setState(1527);
			bool_expr(0);
			setState(1528);
			match(T_THEN);
			setState(1529);
			single_block_stmt();
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

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(compilerParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(compilerParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(compilerParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitElseif_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1532);
			bool_expr(0);
			setState(1533);
			match(T_THEN);
			setState(1534);
			block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(compilerParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(T_ELSE);
			setState(1537);
			block();
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(compilerParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(compilerParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(compilerParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(T_CREATE);
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1540);
				match(T_UNIQUE);
				}
			}

			setState(1543);
			match(T_INDEX);
			setState(1544);
			ident();
			setState(1545);
			match(T_ON);
			setState(1546);
			table_name();
			setState(1547);
			match(T_OPEN_P);
			setState(1548);
			create_index_col();
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1549);
				match(T_COMMA);
				setState(1550);
				create_index_col();
				}
				}
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1556);
			match(T_CLOSE_P);
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

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(compilerParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(compilerParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			ident();
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1559);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
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

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			index_mssql_storage_clause();
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

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(compilerParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(compilerParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(T_WITH);
			setState(1565);
			match(T_OPEN_P);
			setState(1566);
			ident();
			setState(1567);
			match(T_EQUAL);
			setState(1568);
			ident();
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1569);
				match(T_COMMA);
				setState(1570);
				ident();
				setState(1571);
				match(T_EQUAL);
				setState(1572);
				ident();
				}
				}
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1579);
			match(T_CLOSE_P);
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1580);
				create_table_options_mssql_item();
				}
				}
				setState(1585);
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

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(compilerParser.T_FOR, 0); }
		public TerminalNode T_IN() { return getToken(compilerParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(compilerParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(compilerParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public TerminalNode L_ID() { return getToken(compilerParser.L_ID, 0); }
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFor_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(T_FOR);
			setState(1587);
			_la = _input.LA(1);
			if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1588);
			match(T_IN);
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1589);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1592);
			select_stmt();
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(1593);
				match(T_CLOSE_P);
				}
			}

			setState(1596);
			match(T_LOOP);
			setState(1597);
			block();
			setState(1598);
			match(T_END);
			setState(1599);
			match(T_LOOP);
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

	public static class For_range_stmt_errorContext extends ParserRuleContext {
		public For_range_stmt_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFor_range_stmt_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFor_range_stmt_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFor_range_stmt_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmt_errorContext for_range_stmt_error() throws RecognitionException {
		For_range_stmt_errorContext _localctx = new For_range_stmt_errorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_for_range_stmt_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(compilerParser.T_FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(compilerParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(compilerParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(compilerParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public TerminalNode L_ID() { return getToken(compilerParser.L_ID, 0); }
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public TerminalNode T_IN() { return getToken(compilerParser.T_IN, 0); }
		public For_range_stmt_errorContext for_range_stmt_error() {
			return getRuleContext(For_range_stmt_errorContext.class,0);
		}
		public TerminalNode T_REVERSE() { return getToken(compilerParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(compilerParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(compilerParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFor_range_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(T_FOR);
			setState(1604);
			_la = _input.LA(1);
			if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1605);
				match(T_IN);
				}
				break;
			case 2:
				{
				setState(1606);
				for_range_stmt_error();
				}
				break;
			}
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1609);
				match(T_REVERSE);
				}
				break;
			}
			setState(1612);
			expr(0);
			setState(1613);
			match(T_DOT2);
			setState(1614);
			expr(0);
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1615);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1616);
				expr(0);
				}
			}

			setState(1619);
			match(T_LOOP);
			setState(1620);
			block();
			setState(1621);
			match(T_END);
			setState(1622);
			match(T_LOOP);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(compilerParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(compilerParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(compilerParser.T_LESS, i);
		}
		public List<TerminalNode> T_GREATER() { return getTokens(compilerParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(compilerParser.T_GREATER, i);
		}
		public TerminalNode L_ID() { return getToken(compilerParser.L_ID, 0); }
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_label);
		int _la;
		try {
			setState(1630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1625);
				match(T_LESS);
				setState(1626);
				match(T_LESS);
				setState(1627);
				_la = _input.LA(1);
				if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1628);
				match(T_GREATER);
				setState(1629);
				match(T_GREATER);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1632);
				cte_select_stmt();
				}
			}

			setState(1635);
			fullselect_stmt();
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

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(T_WITH);
			setState(1638);
			cte_select_stmt_item();
			setState(1643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1639);
				match(T_COMMA);
				setState(1640);
				cte_select_stmt_item();
				}
				}
				setState(1645);
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

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			ident();
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1647);
				cte_select_cols();
				}
			}

			setState(1650);
			match(T_AS);
			setState(1651);
			match(T_OPEN_P);
			setState(1652);
			fullselect_stmt();
			setState(1653);
			match(T_CLOSE_P);
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

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(T_OPEN_P);
			setState(1656);
			ident();
			setState(1661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1657);
				match(T_COMMA);
				setState(1658);
				ident();
				}
				}
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1664);
			match(T_CLOSE_P);
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

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			fullselect_stmt_item();
			setState(1672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1667);
					fullselect_set_clause();
					setState(1668);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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

	public static class Fullselect_stmt_item_errorContext extends ParserRuleContext {
		public List<TerminalNode> T_SEMICOLON() { return getTokens(compilerParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(compilerParser.T_SEMICOLON, i);
		}
		public Fullselect_stmt_item_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFullselect_stmt_item_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFullselect_stmt_item_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFullselect_stmt_item_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_item_errorContext fullselect_stmt_item_error() throws RecognitionException {
		Fullselect_stmt_item_errorContext _localctx = new Fullselect_stmt_item_errorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_fullselect_stmt_item_error);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1676); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1675);
					match(T_SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1678); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_item_errorContext fullselect_stmt_item_error() {
			return getRuleContext(Fullselect_stmt_item_errorContext.class,0);
		}
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_fullselect_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				{
				setState(1680);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				{
				setState(1681);
				match(T_OPEN_P);
				setState(1682);
				fullselect_stmt();
				setState(1683);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1687);
				fullselect_stmt_item_error();
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

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(compilerParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(compilerParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(compilerParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(compilerParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				match(T_UNION);
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1691);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				match(T_EXCEPT);
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1695);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1698);
				match(T_INTERSECT);
				setState(1700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1699);
					match(T_ALL);
					}
				}

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

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(compilerParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(compilerParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1705);
			select_list();
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_INTO) {
				{
				setState(1706);
				into_clause();
				}
			}

			setState(1709);
			from_clause();
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1710);
				where_clause();
				}
				break;
			}
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1713);
				group_by_clause();
				}
				break;
			}
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1716);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1717);
				qualify_clause();
				}
				break;
			}
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1720);
				order_by_clause();
				}
				break;
			}
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1723);
				select_options();
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

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1726);
				select_list_set();
				}
				break;
			}
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1729);
				select_list_limit();
				}
				break;
			}
			setState(1732);
			select_list_item();
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1733);
				match(T_COMMA);
				setState(1734);
				select_list_item();
				}
				}
				setState(1739);
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

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(compilerParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(compilerParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
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

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(compilerParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(T_TOP);
			setState(1743);
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

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1745);
					ident();
					setState(1746);
					match(T_EQUAL);
					}
					break;
				}
				setState(1750);
				expr(0);
				setState(1752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1751);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1754);
				select_list_asterisk();
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

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(compilerParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(compilerParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_select_list_alias);
		try {
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1757);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1758);
					match(T_AS);
					}
					break;
				}
				setState(1761);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				match(T_OPEN_P);
				setState(1763);
				match(T_TITLE);
				setState(1764);
				match(L_S_STRING);
				setState(1765);
				match(T_CLOSE_P);
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

	public static class Select_list_asterisk_errorContext extends ParserRuleContext {
		public Select_list_asterisk_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_list_asterisk_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_list_asterisk_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_list_asterisk_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asterisk_errorContext select_list_asterisk_error() throws RecognitionException {
		Select_list_asterisk_errorContext _localctx = new Select_list_asterisk_errorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_select_list_asterisk_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			_la = _input.LA(1);
			if ( !(_la==T__0 || ((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & ((1L << (T_ADD - 345)) | (1L << (T_DIV - 345)) | (1L << (T_SUB - 345)))) != 0)) ) {
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

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(compilerParser.L_ID, 0); }
		public TerminalNode L_IDENTCPP() { return getToken(compilerParser.L_IDENTCPP, 0); }
		public Select_list_asterisk_errorContext select_list_asterisk_error() {
			return getRuleContext(Select_list_asterisk_errorContext.class,0);
		}
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_select_list_asterisk);
		int _la;
		try {
			setState(1776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_MUL:
			case L_IDENTCPP:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_IDENTCPP || _la==L_ID) {
					{
					setState(1770);
					_la = _input.LA(1);
					if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1771);
					match(T__1);
					}
				}

				setState(1774);
				match(T_MUL);
				}
				break;
			case T__0:
			case T_ADD:
			case T_DIV:
			case T_SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				select_list_asterisk_error();
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

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(compilerParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_into_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(T_INTO);
			setState(1779);
			ident();
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1780);
				match(T_COMMA);
				setState(1781);
				ident();
				}
				}
				setState(1786);
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(compilerParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(T_FROM);
			setState(1788);
			from_table_clause();
			setState(1792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1789);
					from_join_clause();
					}
					} 
				}
				setState(1794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
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

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_from_table_clause);
		try {
			setState(1798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1796);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				from_table_values_clause();
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

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			table_name();
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1801);
				from_alias_clause();
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

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(T_OPEN_P);
			setState(1805);
			select_stmt();
			setState(1806);
			match(T_CLOSE_P);
			setState(1808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1807);
				from_alias_clause();
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

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(compilerParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(compilerParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_from_join_clause);
		try {
			setState(1817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1810);
				match(T_COMMA);
				setState(1811);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				from_join_type_clause();
				setState(1813);
				from_table_clause();
				setState(1814);
				match(T_ON);
				setState(1815);
				bool_expr(0);
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

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(compilerParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(compilerParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(compilerParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(compilerParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(compilerParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(compilerParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1819);
					match(T_INNER);
					}
				}

				setState(1822);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1823);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1824);
					match(T_OUTER);
					}
				}

				setState(1827);
				match(T_JOIN);
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

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(compilerParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(compilerParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(T_TABLE);
			setState(1831);
			match(T_OPEN_P);
			setState(1832);
			match(T_VALUES);
			setState(1833);
			from_table_values_row();
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1834);
				match(T_COMMA);
				setState(1835);
				from_table_values_row();
				}
				}
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1841);
			match(T_CLOSE_P);
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1842);
				from_alias_clause();
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

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_from_table_values_row);
		int _la;
		try {
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				match(T_OPEN_P);
				setState(1847);
				expr(0);
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1848);
					match(T_COMMA);
					setState(1849);
					expr(0);
					}
					}
					setState(1854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1855);
				match(T_CLOSE_P);
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

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(compilerParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(compilerParser.L_ID, i);
		}
		public List<TerminalNode> L_IDENTCPP() { return getTokens(compilerParser.L_IDENTCPP); }
		public TerminalNode L_IDENTCPP(int i) {
			return getToken(compilerParser.L_IDENTCPP, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1860);
				match(T_AS);
				}
				break;
			}
			setState(1863);
			ident();
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1864);
				match(T_OPEN_P);
				setState(1865);
				_la = _input.LA(1);
				if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1866);
					match(T_COMMA);
					setState(1867);
					_la = _input.LA(1);
					if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1873);
				match(T_CLOSE_P);
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

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			ident();
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(compilerParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(T_WHERE);
			setState(1879);
			bool_expr(0);
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

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(compilerParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(compilerParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			match(T_GROUP);
			setState(1882);
			match(T_BY);
			setState(1883);
			expr(0);
			setState(1888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1884);
					match(T_COMMA);
					setState(1885);
					expr(0);
					}
					} 
				}
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(compilerParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(T_HAVING);
			setState(1892);
			bool_expr(0);
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

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(compilerParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			match(T_QUALIFY);
			setState(1895);
			bool_expr(0);
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

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(compilerParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(compilerParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(compilerParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(compilerParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(compilerParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(compilerParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			match(T_ORDER);
			setState(1898);
			match(T_BY);
			setState(1899);
			expr(0);
			setState(1901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1900);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1903);
					match(T_COMMA);
					setState(1904);
					expr(0);
					setState(1906);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						setState(1905);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(1912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1914); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1913);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1916); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(compilerParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(compilerParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(compilerParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(compilerParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(compilerParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(compilerParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(compilerParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(compilerParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(compilerParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(compilerParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(compilerParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(compilerParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_select_options_item);
		int _la;
		try {
			setState(1929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				match(T_LIMIT);
				setState(1919);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				match(T_WITH);
				setState(1921);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (T_RR - 243)) | (1L << (T_RS - 243)) | (1L << (T_UR - 243)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1922);
					match(T_USE);
					setState(1923);
					match(T_AND);
					setState(1924);
					match(T_KEEP);
					setState(1925);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1926);
					match(T_LOCKS);
					}
					break;
				}
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

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1932);
					match(T_NOT);
					}
				}

				setState(1935);
				match(T_OPEN_P);
				setState(1936);
				bool_expr(0);
				setState(1937);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1939);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1942);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1943);
					bool_expr_logical_operator();
					setState(1944);
					bool_expr(3);
					}
					} 
				}
				setState(1950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_bool_expr_atom);
		try {
			setState(1954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1953);
				expr(0);
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

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(compilerParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(compilerParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(compilerParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(compilerParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(compilerParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1956);
				expr(0);
				setState(1957);
				match(T_IS);
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1958);
					match(T_NOT);
					}
				}

				setState(1961);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1963);
				expr(0);
				setState(1964);
				match(T_BETWEEN);
				setState(1965);
				expr(0);
				setState(1966);
				match(T_AND);
				setState(1967);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1969);
					match(T_NOT);
					}
				}

				setState(1972);
				match(T_EXISTS);
				setState(1973);
				match(T_OPEN_P);
				setState(1974);
				select_stmt();
				setState(1975);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1977);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1978);
				bool_expr_multi_in();
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

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(compilerParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			expr(0);
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1982);
				match(T_NOT);
				}
			}

			setState(1985);
			match(T_IN);
			setState(1986);
			match(T_OPEN_P);
			setState(1996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				{
				setState(1987);
				expr(0);
				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1988);
					match(T_COMMA);
					setState(1989);
					expr(0);
					}
					}
					setState(1994);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1995);
				select_stmt();
				}
				break;
			}
			setState(1998);
			match(T_CLOSE_P);
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

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(compilerParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(compilerParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(compilerParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(compilerParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(compilerParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(T_OPEN_P);
			setState(2001);
			expr(0);
			setState(2006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2002);
				match(T_COMMA);
				setState(2003);
				expr(0);
				}
				}
				setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2009);
			match(T_CLOSE_P);
			setState(2011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2010);
				match(T_NOT);
				}
			}

			setState(2013);
			match(T_IN);
			setState(2014);
			match(T_OPEN_P);
			setState(2015);
			select_stmt();
			setState(2016);
			match(T_CLOSE_P);
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

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			expr(0);
			setState(2019);
			bool_expr_binary_operator();
			setState(2020);
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

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(compilerParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(compilerParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
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

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(compilerParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(compilerParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(compilerParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(compilerParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(compilerParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(compilerParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(compilerParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(compilerParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(compilerParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(compilerParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2026);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2027);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2028);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2029);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2030);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2031);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2032);
					match(T_NOT);
					}
				}

				setState(2035);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Expr_errorContext extends ParserRuleContext {
		public TerminalNode T_SUB() { return getToken(compilerParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(compilerParser.T_ADD, 0); }
		public TerminalNode T_MUL() { return getToken(compilerParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(compilerParser.T_DIV, 0); }
		public Expr_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_errorContext expr_error() throws RecognitionException {
		Expr_errorContext _localctx = new Expr_errorContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_expr_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			_la = _input.LA(1);
			if ( !(_la==T__0 || ((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & ((1L << (T_ADD - 345)) | (1L << (T_DIV - 345)) | (1L << (T_MUL - 345)) | (1L << (T_SUB - 345)))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(compilerParser.T_MUL, 0); }
		public List<Expr_errorContext> expr_error() {
			return getRuleContexts(Expr_errorContext.class);
		}
		public Expr_errorContext expr_error(int i) {
			return getRuleContext(Expr_errorContext.class,i);
		}
		public TerminalNode T_DIV() { return getToken(compilerParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(compilerParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(compilerParser.T_SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2041);
				match(T_OPEN_P);
				setState(2042);
				select_stmt();
				setState(2043);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2045);
				match(T_OPEN_P);
				setState(2046);
				expr(0);
				setState(2047);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2049);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2050);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2051);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2052);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2053);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2054);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2055);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2056);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2097);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2059);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2060);
						interval_item();
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2061);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2062);
						match(T_MUL);
						setState(2067);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(2065);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
								case 1:
									{
									setState(2063);
									expr(0);
									}
									break;
								case 2:
									{
									setState(2064);
									expr_error();
									}
									break;
								}
								} 
							}
							setState(2069);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2070);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2071);
						match(T_DIV);
						setState(2076);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(2074);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
								case 1:
									{
									setState(2072);
									expr(0);
									}
									break;
								case 2:
									{
									setState(2073);
									expr_error();
									}
									break;
								}
								} 
							}
							setState(2078);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
						}
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2079);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2080);
						match(T_ADD);
						setState(2085);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(2083);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
								case 1:
									{
									setState(2081);
									expr(0);
									}
									break;
								case 2:
									{
									setState(2082);
									expr_error();
									}
									break;
								}
								} 
							}
							setState(2087);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
						}
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2088);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2089);
						match(T_SUB);
						setState(2094);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(2092);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
								case 1:
									{
									setState(2090);
									expr(0);
									}
									break;
								case 2:
									{
									setState(2091);
									expr_error();
									}
									break;
								}
								} 
							}
							setState(2096);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(2101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
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

	public static class Expr_atom_errorContext extends ParserRuleContext {
		public List<Int_numberContext> int_number() {
			return getRuleContexts(Int_numberContext.class);
		}
		public Int_numberContext int_number(int i) {
			return getRuleContext(Int_numberContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(compilerParser.T_COMMA, 0); }
		public Expr_atom_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_atom_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_atom_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_atom_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atom_errorContext expr_atom_error() throws RecognitionException {
		Expr_atom_errorContext _localctx = new Expr_atom_errorContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_expr_atom_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			int_number();
			{
			setState(2103);
			match(T_COMMA);
			setState(2104);
			int_number();
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

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_expr_atom);
		try {
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2107);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2108);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2109);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2110);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2111);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2112);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2113);
				null_const();
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

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(compilerParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			match(T_INTERVAL);
			setState(2117);
			expr(0);
			setState(2118);
			interval_item();
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

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(compilerParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(compilerParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(compilerParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(compilerParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(compilerParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(compilerParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
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

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(compilerParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(compilerParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(compilerParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(compilerParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			expr_concat_item();
			setState(2123);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2124);
			expr_concat_item();
			setState(2129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2125);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2126);
					expr_concat_item();
					}
					} 
				}
				setState(2131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
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

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_expr_concat_item);
		try {
			setState(2141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2132);
				match(T_OPEN_P);
				setState(2133);
				expr(0);
				setState(2134);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2136);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2137);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2138);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2139);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2140);
				expr_atom();
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

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_expr_case);
		try {
			setState(2145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2143);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2144);
				expr_case_searched();
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

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(compilerParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(compilerParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(compilerParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(compilerParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(compilerParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(compilerParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			match(T_CASE);
			setState(2148);
			expr(0);
			setState(2154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2149);
				match(T_WHEN);
				setState(2150);
				expr(0);
				setState(2151);
				match(T_THEN);
				setState(2152);
				expr(0);
				}
				}
				setState(2156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2158);
				match(T_ELSE);
				setState(2159);
				expr(0);
				}
			}

			setState(2162);
			match(T_END);
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

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(compilerParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(compilerParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(compilerParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(compilerParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(compilerParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(compilerParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(compilerParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			match(T_CASE);
			setState(2170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2165);
				match(T_WHEN);
				setState(2166);
				bool_expr(0);
				setState(2167);
				match(T_THEN);
				setState(2168);
				expr(0);
				}
				}
				setState(2172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2174);
				match(T_ELSE);
				setState(2175);
				expr(0);
				}
			}

			setState(2178);
			match(T_END);
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

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(compilerParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(compilerParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(compilerParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			ident();
			setState(2181);
			match(T__0);
			setState(2182);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
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

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(compilerParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(compilerParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(compilerParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(compilerParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(compilerParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(compilerParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(compilerParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(compilerParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(compilerParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(compilerParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(compilerParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(compilerParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(compilerParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(compilerParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(compilerParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(compilerParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(compilerParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2184);
				match(T_AVG);
				setState(2185);
				match(T_OPEN_P);
				setState(2187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2186);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2189);
				expr(0);
				setState(2190);
				match(T_CLOSE_P);
				setState(2192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2191);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2194);
				match(T_COUNT);
				setState(2195);
				match(T_OPEN_P);
				setState(2201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXISTS_ERROR:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_IDENTCPP:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
					case 1:
						{
						setState(2196);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2199);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2200);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2203);
				match(T_CLOSE_P);
				setState(2205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2204);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2207);
				match(T_COUNT_BIG);
				setState(2208);
				match(T_OPEN_P);
				setState(2214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXISTS_ERROR:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_IDENTCPP:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
					case 1:
						{
						setState(2209);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2212);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2213);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2216);
				match(T_CLOSE_P);
				setState(2218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2217);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2220);
				match(T_CUME_DIST);
				setState(2221);
				match(T_OPEN_P);
				setState(2222);
				match(T_CLOSE_P);
				setState(2223);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2224);
				match(T_DENSE_RANK);
				setState(2225);
				match(T_OPEN_P);
				setState(2226);
				match(T_CLOSE_P);
				setState(2227);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2228);
				match(T_FIRST_VALUE);
				setState(2229);
				match(T_OPEN_P);
				setState(2230);
				expr(0);
				setState(2231);
				match(T_CLOSE_P);
				setState(2232);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2234);
				match(T_LAG);
				setState(2235);
				match(T_OPEN_P);
				setState(2236);
				expr(0);
				setState(2243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2237);
					match(T_COMMA);
					setState(2238);
					expr(0);
					setState(2241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2239);
						match(T_COMMA);
						setState(2240);
						expr(0);
						}
					}

					}
				}

				setState(2245);
				match(T_CLOSE_P);
				setState(2246);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2248);
				match(T_LAST_VALUE);
				setState(2249);
				match(T_OPEN_P);
				setState(2250);
				expr(0);
				setState(2251);
				match(T_CLOSE_P);
				setState(2252);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2254);
				match(T_LEAD);
				setState(2255);
				match(T_OPEN_P);
				setState(2256);
				expr(0);
				setState(2263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2257);
					match(T_COMMA);
					setState(2258);
					expr(0);
					setState(2261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2259);
						match(T_COMMA);
						setState(2260);
						expr(0);
						}
					}

					}
				}

				setState(2265);
				match(T_CLOSE_P);
				setState(2266);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2268);
				match(T_MAX);
				setState(2269);
				match(T_OPEN_P);
				setState(2271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2270);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2273);
				expr(0);
				setState(2274);
				match(T_CLOSE_P);
				setState(2276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2275);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2278);
				match(T_MIN);
				setState(2279);
				match(T_OPEN_P);
				setState(2281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2280);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2283);
				expr(0);
				setState(2284);
				match(T_CLOSE_P);
				setState(2286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2285);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2288);
				match(T_RANK);
				setState(2289);
				match(T_OPEN_P);
				setState(2290);
				match(T_CLOSE_P);
				setState(2291);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2292);
				match(T_ROW_NUMBER);
				setState(2293);
				match(T_OPEN_P);
				setState(2294);
				match(T_CLOSE_P);
				setState(2295);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2296);
				match(T_STDEV);
				setState(2297);
				match(T_OPEN_P);
				setState(2299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2298);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2301);
				expr(0);
				setState(2302);
				match(T_CLOSE_P);
				setState(2304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2303);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2306);
				match(T_SUM);
				setState(2307);
				match(T_OPEN_P);
				setState(2309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2308);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2311);
				expr(0);
				setState(2312);
				match(T_CLOSE_P);
				setState(2314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2313);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2316);
				match(T_VAR);
				setState(2317);
				match(T_OPEN_P);
				setState(2319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2318);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2321);
				expr(0);
				setState(2322);
				match(T_CLOSE_P);
				setState(2324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2323);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2326);
				match(T_VARIANCE);
				setState(2327);
				match(T_OPEN_P);
				setState(2329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2328);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2331);
				expr(0);
				setState(2332);
				match(T_CLOSE_P);
				setState(2334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2333);
					expr_func_over_clause();
					}
					break;
				}
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

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(compilerParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(compilerParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
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

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(compilerParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(T_OVER);
			setState(2341);
			match(T_OPEN_P);
			setState(2343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2342);
				expr_func_partition_by_clause();
				}
			}

			setState(2346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2345);
				order_by_clause();
				}
			}

			setState(2348);
			match(T_CLOSE_P);
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

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(compilerParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(compilerParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			match(T_PARTITION);
			setState(2351);
			match(T_BY);
			setState(2352);
			expr(0);
			setState(2357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2353);
				match(T_COMMA);
				setState(2354);
				expr(0);
				}
				}
				setState(2359);
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

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(compilerParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(compilerParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(compilerParser.T_COUNT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(compilerParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(compilerParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(compilerParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(compilerParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(compilerParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(compilerParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(compilerParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(compilerParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(compilerParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(compilerParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(compilerParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(compilerParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(compilerParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(compilerParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(compilerParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(compilerParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(compilerParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(compilerParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(compilerParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(compilerParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(compilerParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(compilerParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2361);
				match(T_CAST);
				setState(2362);
				match(T_OPEN_P);
				setState(2363);
				expr(0);
				setState(2364);
				match(T_AS);
				setState(2365);
				dtype();
				setState(2367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2366);
					dtype_len();
					}
				}

				setState(2369);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2371);
				match(T_COUNT);
				setState(2372);
				match(T_OPEN_P);
				setState(2375);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXISTS_ERROR:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_IDENTCPP:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(2373);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2374);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2377);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2378);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2379);
				match(T_CURRENT);
				setState(2380);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2384);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2381);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2382);
					match(T_CURRENT);
					setState(2383);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2386);
					match(T_OPEN_P);
					setState(2387);
					expr(0);
					setState(2388);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2392);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2393);
				match(T_CURRENT);
				setState(2394);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2395);
				match(T_MAX_PART_STRING);
				setState(2396);
				match(T_OPEN_P);
				setState(2397);
				expr(0);
				setState(2410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2398);
					match(T_COMMA);
					setState(2399);
					expr(0);
					setState(2407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2400);
						match(T_COMMA);
						setState(2401);
						expr(0);
						setState(2402);
						match(T_EQUAL);
						setState(2403);
						expr(0);
						}
						}
						setState(2409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2412);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2414);
				match(T_MIN_PART_STRING);
				setState(2415);
				match(T_OPEN_P);
				setState(2416);
				expr(0);
				setState(2429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2417);
					match(T_COMMA);
					setState(2418);
					expr(0);
					setState(2426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2419);
						match(T_COMMA);
						setState(2420);
						expr(0);
						setState(2421);
						match(T_EQUAL);
						setState(2422);
						expr(0);
						}
						}
						setState(2428);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2431);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2433);
				match(T_MAX_PART_INT);
				setState(2434);
				match(T_OPEN_P);
				setState(2435);
				expr(0);
				setState(2448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2436);
					match(T_COMMA);
					setState(2437);
					expr(0);
					setState(2445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2438);
						match(T_COMMA);
						setState(2439);
						expr(0);
						setState(2440);
						match(T_EQUAL);
						setState(2441);
						expr(0);
						}
						}
						setState(2447);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2450);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2452);
				match(T_MIN_PART_INT);
				setState(2453);
				match(T_OPEN_P);
				setState(2454);
				expr(0);
				setState(2467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2455);
					match(T_COMMA);
					setState(2456);
					expr(0);
					setState(2464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2457);
						match(T_COMMA);
						setState(2458);
						expr(0);
						setState(2459);
						match(T_EQUAL);
						setState(2460);
						expr(0);
						}
						}
						setState(2466);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2469);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2471);
				match(T_MAX_PART_DATE);
				setState(2472);
				match(T_OPEN_P);
				setState(2473);
				expr(0);
				setState(2486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2474);
					match(T_COMMA);
					setState(2475);
					expr(0);
					setState(2483);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2476);
						match(T_COMMA);
						setState(2477);
						expr(0);
						setState(2478);
						match(T_EQUAL);
						setState(2479);
						expr(0);
						}
						}
						setState(2485);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2488);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2490);
				match(T_MIN_PART_DATE);
				setState(2491);
				match(T_OPEN_P);
				setState(2492);
				expr(0);
				setState(2505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2493);
					match(T_COMMA);
					setState(2494);
					expr(0);
					setState(2502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2495);
						match(T_COMMA);
						setState(2496);
						expr(0);
						setState(2497);
						match(T_EQUAL);
						setState(2498);
						expr(0);
						}
						}
						setState(2504);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2507);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2509);
				match(T_PART_COUNT);
				setState(2510);
				match(T_OPEN_P);
				setState(2511);
				expr(0);
				setState(2519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2512);
					match(T_COMMA);
					setState(2513);
					expr(0);
					setState(2514);
					match(T_EQUAL);
					setState(2515);
					expr(0);
					}
					}
					setState(2521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2522);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2524);
				match(T_PART_LOC);
				setState(2525);
				match(T_OPEN_P);
				setState(2526);
				expr(0);
				setState(2532); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2527);
						match(T_COMMA);
						setState(2528);
						expr(0);
						setState(2529);
						match(T_EQUAL);
						setState(2530);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2534); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2536);
					match(T_COMMA);
					setState(2537);
					expr(0);
					}
				}

				setState(2540);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2542);
				match(T_TRIM);
				setState(2543);
				match(T_OPEN_P);
				setState(2544);
				expr(0);
				setState(2545);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2547);
				match(T_SUBSTRING);
				setState(2548);
				match(T_OPEN_P);
				setState(2549);
				expr(0);
				setState(2550);
				match(T_FROM);
				setState(2551);
				expr(0);
				setState(2554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2552);
					match(T_FOR);
					setState(2553);
					expr(0);
					}
				}

				setState(2556);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2558);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2559);
				match(T_USER);
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

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(compilerParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(compilerParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			ident();
			setState(2563);
			match(T_OPEN_P);
			setState(2565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2564);
				expr_func_params();
				}
				break;
			}
			setState(2567);
			match(T_CLOSE_P);
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

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(compilerParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(compilerParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_expr_func_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2569);
			func_param();
			setState(2574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2570);
				match(T_COMMA);
				setState(2571);
				func_param();
				}
				}
				setState(2576);
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

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(compilerParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(compilerParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2578);
				ident();
				setState(2579);
				match(T_EQUAL);
				setState(2581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2580);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2585);
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

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(compilerParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2587);
			match(T_DATE);
			setState(2588);
			string();
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

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(compilerParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(T_TIMESTAMP);
			setState(2591);
			string();
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

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_IDENTCPP() { return getTokens(compilerParser.L_IDENTCPP); }
		public TerminalNode L_IDENTCPP(int i) {
			return getToken(compilerParser.L_IDENTCPP, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public List<TerminalNode> L_ID() { return getTokens(compilerParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(compilerParser.L_ID, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				{
				setState(2593);
				match(L_IDENTCPP);
				}
				break;
			case 2:
				{
				setState(2594);
				_la = _input.LA(1);
				if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(2595);
				non_reserved_words();
				}
				break;
			}
			setState(2606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2598);
					match(T__1);
					setState(2602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
					case 1:
						{
						setState(2599);
						match(L_IDENTCPP);
						}
						break;
					case 2:
						{
						setState(2600);
						_la = _input.LA(1);
						if ( !(_la==L_IDENTCPP || _la==L_ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 3:
						{
						setState(2601);
						non_reserved_words();
						}
						break;
					}
					}
					} 
				}
				setState(2608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(compilerParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(compilerParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_string);
		try {
			setState(2611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2609);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2610);
				match(L_D_STRING);
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

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(compilerParser.L_INT, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2613);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2616);
			match(L_INT);
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

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(compilerParser.L_DEC, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2618);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2621);
			match(L_DEC);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(compilerParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(compilerParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
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

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(compilerParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			match(T_NULL);
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

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(compilerParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(compilerParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(compilerParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(compilerParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(compilerParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(compilerParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(compilerParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(compilerParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(compilerParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(compilerParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(compilerParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(compilerParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(compilerParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(compilerParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(compilerParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(compilerParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(compilerParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(compilerParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(compilerParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(compilerParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(compilerParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(compilerParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(compilerParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(compilerParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(compilerParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(compilerParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(compilerParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(compilerParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(compilerParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(compilerParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(compilerParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(compilerParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(compilerParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(compilerParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(compilerParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(compilerParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(compilerParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(compilerParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(compilerParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(compilerParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(compilerParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(compilerParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(compilerParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(compilerParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(compilerParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(compilerParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(compilerParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(compilerParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(compilerParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(compilerParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(compilerParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(compilerParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(compilerParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(compilerParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(compilerParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(compilerParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(compilerParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(compilerParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(compilerParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(compilerParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(compilerParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(compilerParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(compilerParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(compilerParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(compilerParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(compilerParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(compilerParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(compilerParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(compilerParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(compilerParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(compilerParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(compilerParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(compilerParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(compilerParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(compilerParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(compilerParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(compilerParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(compilerParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(compilerParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(compilerParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(compilerParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(compilerParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(compilerParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(compilerParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(compilerParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(compilerParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(compilerParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(compilerParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(compilerParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(compilerParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(compilerParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(compilerParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(compilerParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(compilerParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(compilerParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(compilerParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(compilerParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(compilerParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(compilerParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(compilerParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(compilerParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(compilerParser.T_EXISTS, 0); }
		public TerminalNode T_EXISTS_ERROR() { return getToken(compilerParser.T_EXISTS_ERROR, 0); }
		public TerminalNode T_EXIT() { return getToken(compilerParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(compilerParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(compilerParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(compilerParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(compilerParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(compilerParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(compilerParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(compilerParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(compilerParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(compilerParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(compilerParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(compilerParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(compilerParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(compilerParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(compilerParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(compilerParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(compilerParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(compilerParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(compilerParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(compilerParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(compilerParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(compilerParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(compilerParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(compilerParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(compilerParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(compilerParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(compilerParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(compilerParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(compilerParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(compilerParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(compilerParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(compilerParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(compilerParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(compilerParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(compilerParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(compilerParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(compilerParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(compilerParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(compilerParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(compilerParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(compilerParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(compilerParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(compilerParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(compilerParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(compilerParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(compilerParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(compilerParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(compilerParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(compilerParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(compilerParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(compilerParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(compilerParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(compilerParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(compilerParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(compilerParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(compilerParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(compilerParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(compilerParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(compilerParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(compilerParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(compilerParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(compilerParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(compilerParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(compilerParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(compilerParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(compilerParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(compilerParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(compilerParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(compilerParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(compilerParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(compilerParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(compilerParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(compilerParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(compilerParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(compilerParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(compilerParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(compilerParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(compilerParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(compilerParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(compilerParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(compilerParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(compilerParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(compilerParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(compilerParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(compilerParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(compilerParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(compilerParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(compilerParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(compilerParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(compilerParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(compilerParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(compilerParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(compilerParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(compilerParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(compilerParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(compilerParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(compilerParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(compilerParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(compilerParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(compilerParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(compilerParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(compilerParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(compilerParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(compilerParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(compilerParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(compilerParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(compilerParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(compilerParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(compilerParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(compilerParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(compilerParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(compilerParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(compilerParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(compilerParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(compilerParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(compilerParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(compilerParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(compilerParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(compilerParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(compilerParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(compilerParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(compilerParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(compilerParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(compilerParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(compilerParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(compilerParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(compilerParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(compilerParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(compilerParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(compilerParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(compilerParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(compilerParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(compilerParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(compilerParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(compilerParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(compilerParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(compilerParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(compilerParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(compilerParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(compilerParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(compilerParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(compilerParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(compilerParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(compilerParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(compilerParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(compilerParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(compilerParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(compilerParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(compilerParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(compilerParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(compilerParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(compilerParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(compilerParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(compilerParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(compilerParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(compilerParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(compilerParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(compilerParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(compilerParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(compilerParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(compilerParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(compilerParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(compilerParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(compilerParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(compilerParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(compilerParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(compilerParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(compilerParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(compilerParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(compilerParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(compilerParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(compilerParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(compilerParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(compilerParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(compilerParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(compilerParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(compilerParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(compilerParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(compilerParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(compilerParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(compilerParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(compilerParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(compilerParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(compilerParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(compilerParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(compilerParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(compilerParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(compilerParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(compilerParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(compilerParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(compilerParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(compilerParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(compilerParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(compilerParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(compilerParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(compilerParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(compilerParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(compilerParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(compilerParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(compilerParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(compilerParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(compilerParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(compilerParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(compilerParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(compilerParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(compilerParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(compilerParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(compilerParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(compilerParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(compilerParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(compilerParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(compilerParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(compilerParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(compilerParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(compilerParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(compilerParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXISTS_ERROR - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 87:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 118:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 130:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 139:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 148:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 166:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017d\u0a48\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\3\2\3"+
		"\2\3\2\3\3\3\3\5\3\u0168\n\3\3\3\5\3\u016b\n\3\6\3\u016d\n\3\r\3\16\3"+
		"\u016e\3\4\5\4\u0172\n\4\3\4\3\4\3\4\5\4\u0177\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\5\5\u017e\n\5\3\5\3\5\3\5\3\5\5\5\u0184\n\5\5\5\u0186\n\5\3\6\3\6\3\6"+
		"\3\7\3\7\6\7\u018d\n\7\r\7\16\7\u018e\3\7\5\7\u0192\n\7\5\7\u0194\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01a4\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01ac\n\t\f\t\16\t\u01af\13\t\5\t\u01b1\n"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u01b9\n\n\f\n\16\n\u01bc\13\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\5\f\u01c4\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16"+
		"\u01ce\n\16\3\17\3\17\5\17\u01d2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u01da\n\20\3\21\3\21\3\21\3\21\5\21\u01e0\n\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u01f2"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u01fd\n\30\3\30"+
		"\3\30\3\30\5\30\u0202\n\30\3\30\5\30\u0205\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0213\n\31\f\31\16\31\u0216"+
		"\13\31\3\31\3\31\5\31\u021a\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5"+
		"\33\u0223\n\33\3\33\3\33\3\33\5\33\u0228\n\33\7\33\u022a\n\33\f\33\16"+
		"\33\u022d\13\33\3\33\3\33\5\33\u0231\n\33\3\33\3\33\5\33\u0235\n\33\3"+
		"\33\3\33\7\33\u0239\n\33\f\33\16\33\u023c\13\33\3\33\3\33\3\34\5\34\u0241"+
		"\n\34\3\34\3\34\3\34\5\34\u0246\n\34\3\34\3\34\5\34\u024a\n\34\3\34\5"+
		"\34\u024d\n\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0259\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0264\n \3!\5!\u0267\n!\3!\3"+
		"!\5!\u026b\n!\3!\5!\u026e\n!\3\"\3\"\3\"\3\"\5\"\u0274\n\"\3#\3#\3$\3"+
		"$\6$\u027a\n$\r$\16$\u027b\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u0288\n&\f"+
		"&\16&\u028b\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0293\n\'\f\'\16\'\u0296\13"+
		"\'\3(\3(\3(\3(\3(\7(\u029d\n(\f(\16(\u02a0\13(\3)\3)\3)\3)\3)\5)\u02a7"+
		"\n)\3*\3*\3*\7*\u02ac\n*\f*\16*\u02af\13*\3*\5*\u02b2\n*\3*\3*\5*\u02b6"+
		"\n*\3*\7*\u02b9\n*\f*\16*\u02bc\13*\3*\5*\u02bf\n*\3*\3*\3*\5*\u02c4\n"+
		"*\3*\3*\5*\u02c8\n*\3*\3*\5*\u02cc\n*\3+\3+\3+\3,\3,\3,\3,\3,\5,\u02d6"+
		"\n,\3,\3,\5,\u02da\n,\3,\3,\3,\5,\u02df\n,\3-\3-\3-\5-\u02e4\n-\3-\3-"+
		"\5-\u02e8\n-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02f5\n/\3/\3/\3\60\5"+
		"\60\u02fa\n\60\3\60\3\60\3\60\3\60\5\60\u0300\n\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u0309\n\61\3\61\3\61\5\61\u030d\n\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\5\62\u0315\n\62\3\62\5\62\u0318\n\62\3\62\3\62\3\62"+
		"\5\62\u031d\n\62\3\62\3\62\3\63\5\63\u0322\n\63\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u0329\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u0330\n\63\3\63\5\63"+
		"\u0333\n\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u033c\n\65\f\65\16"+
		"\65\u033f\13\65\3\66\3\66\3\66\5\66\u0344\n\66\3\66\7\66\u0347\n\66\f"+
		"\66\16\66\u034a\13\66\3\66\7\66\u034d\n\66\f\66\16\66\u0350\13\66\3\66"+
		"\3\66\5\66\u0354\n\66\3\66\5\66\u0357\n\66\3\67\3\67\38\38\58\u035d\n"+
		"8\38\38\38\38\38\38\38\38\38\38\78\u0369\n8\f8\168\u036c\138\38\38\38"+
		"\38\38\78\u0373\n8\f8\168\u0376\138\38\38\38\58\u037b\n8\39\39\39\59\u0380"+
		"\n9\39\39\39\59\u0385\n9\39\39\39\59\u038a\n9\79\u038c\n9\f9\169\u038f"+
		"\139\39\39\59\u0393\n9\39\59\u0396\n9\39\39\39\39\39\39\79\u039e\n9\f"+
		"9\169\u03a1\139\39\39\39\39\39\39\39\79\u03aa\n9\f9\169\u03ad\139\39\3"+
		"9\79\u03b1\n9\f9\169\u03b4\139\59\u03b6\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\5:\u03c2\n:\3;\6;\u03c5\n;\r;\16;\u03c6\3<\3<\3<\5<\u03cc\n<\3=\5"+
		"=\u03cf\n=\3=\3=\3>\6>\u03d4\n>\r>\16>\u03d5\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\5?\u03e2\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\6@\u03ef\n@\r@\16@\u03f0"+
		"\3@\3@\3@\5@\u03f6\n@\3A\5A\u03f9\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\7A\u0406\nA\fA\16A\u0409\13A\3A\3A\3A\5A\u040e\nA\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\5A\u0419\nA\3B\5B\u041c\nB\3B\3B\3B\3B\3B\3B\7B\u0424\nB\fB\16"+
		"B\u0427\13B\3B\3B\3B\3B\5B\u042d\nB\3C\3C\3C\3C\5C\u0433\nC\3D\3D\3D\3"+
		"D\7D\u0439\nD\fD\16D\u043c\13D\3E\3E\3E\3E\3E\3E\3E\5E\u0445\nE\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0459\nE\3F\3F\3F"+
		"\3F\5F\u045f\nF\3G\3G\5G\u0463\nG\3G\3G\3G\5G\u0468\nG\3G\3G\5G\u046c"+
		"\nG\3G\3G\3G\5G\u0471\nG\3G\5G\u0474\nG\3G\3G\3G\5G\u0479\nG\3G\5G\u047c"+
		"\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u048a\nH\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\5H\u04a9\nH\5H\u04ab\nH\3I\3I\3J\3J\3J\3J\5J\u04b3\nJ\3J\5J\u04b6\nJ"+
		"\3J\3J\3J\5J\u04bb\nJ\5J\u04bd\nJ\3J\3J\3K\5K\u04c2\nK\3K\3K\3K\3K\3K"+
		"\5K\u04c9\nK\3K\5K\u04cc\nK\3L\5L\u04cf\nL\3L\3L\3L\5L\u04d4\nL\3L\3L"+
		"\5L\u04d8\nL\5L\u04da\nL\3M\3M\3M\3M\3N\3N\3N\3N\3N\5N\u04e5\nN\3N\3N"+
		"\3N\5N\u04ea\nN\5N\u04ec\nN\3N\3N\7N\u04f0\nN\fN\16N\u04f3\13N\3O\3O\3"+
		"O\3O\5O\u04f9\nO\3P\3P\3P\3P\5P\u04ff\nP\3P\5P\u0502\nP\3P\3P\3P\5P\u0507"+
		"\nP\3P\3P\5P\u050b\nP\3P\5P\u050e\nP\3P\3P\3Q\3Q\3Q\5Q\u0515\nQ\3R\3R"+
		"\3R\3R\5R\u051b\nR\3R\5R\u051e\nR\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0528\nR"+
		"\3S\3S\3S\3S\3S\7S\u052f\nS\fS\16S\u0532\13S\3T\3T\3T\3T\5T\u0538\nT\3"+
		"T\3T\3T\3T\3T\5T\u053f\nT\5T\u0541\nT\3U\3U\3U\3U\5U\u0547\nU\3U\5U\u054a"+
		"\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0555\nU\3V\3V\3V\3V\3V\7V\u055c\nV"+
		"\fV\16V\u055f\13V\3W\3W\3W\5W\u0564\nW\3X\3X\3X\3X\5X\u056a\nX\3X\5X\u056d"+
		"\nX\3X\3X\3X\5X\u0572\nX\3X\5X\u0575\nX\3X\5X\u0578\nX\3X\5X\u057b\nX"+
		"\3X\5X\u057e\nX\3X\3X\3X\3X\5X\u0584\nX\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u058c\nY"+
		"\fY\16Y\u058f\13Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0597\nY\fY\16Y\u059a\13Y\5Y\u059c"+
		"\nY\3Z\3Z\3Z\3Z\3Z\5Z\u05a3\nZ\3Z\3Z\3Z\5Z\u05a8\nZ\3Z\7Z\u05ab\nZ\fZ"+
		"\16Z\u05ae\13Z\3Z\5Z\u05b1\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u05b9\nZ\3Z\3Z\5Z\u05bd"+
		"\nZ\3Z\7Z\u05c0\nZ\fZ\16Z\u05c3\13Z\3Z\5Z\u05c6\nZ\5Z\u05c8\nZ\3[\6[\u05cb"+
		"\n[\r[\16[\u05cc\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u05d5\n\\\3\\\3\\\3\\\5\\"+
		"\u05da\n\\\3]\3]\3]\5]\u05df\n]\3^\3^\3^\3^\3^\7^\u05e6\n^\f^\16^\u05e9"+
		"\13^\3^\5^\u05ec\n^\3^\3^\3^\3_\3_\3_\3_\3_\5_\u05f6\n_\3`\3`\3`\3`\3"+
		"`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3c\3c\5c\u0608\nc\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\7c\u0612\nc\fc\16c\u0615\13c\3c\3c\3d\3d\5d\u061b\nd\3e\3e\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\7f\u0629\nf\ff\16f\u062c\13f\3f\3f\7f\u0630\nf\f"+
		"f\16f\u0633\13f\3g\3g\3g\3g\5g\u0639\ng\3g\3g\5g\u063d\ng\3g\3g\3g\3g"+
		"\3g\3h\3h\3i\3i\3i\3i\5i\u064a\ni\3i\5i\u064d\ni\3i\3i\3i\3i\3i\5i\u0654"+
		"\ni\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\5j\u0661\nj\3k\5k\u0664\nk\3k\3k"+
		"\3l\3l\3l\3l\7l\u066c\nl\fl\16l\u066f\13l\3m\3m\5m\u0673\nm\3m\3m\3m\3"+
		"m\3m\3n\3n\3n\3n\7n\u067e\nn\fn\16n\u0681\13n\3n\3n\3o\3o\3o\3o\7o\u0689"+
		"\no\fo\16o\u068c\13o\3p\6p\u068f\np\rp\16p\u0690\3q\3q\3q\3q\3q\5q\u0698"+
		"\nq\3q\5q\u069b\nq\3r\3r\5r\u069f\nr\3r\3r\5r\u06a3\nr\3r\3r\5r\u06a7"+
		"\nr\5r\u06a9\nr\3s\3s\3s\5s\u06ae\ns\3s\3s\5s\u06b2\ns\3s\5s\u06b5\ns"+
		"\3s\3s\5s\u06b9\ns\3s\5s\u06bc\ns\3s\5s\u06bf\ns\3t\5t\u06c2\nt\3t\5t"+
		"\u06c5\nt\3t\3t\3t\7t\u06ca\nt\ft\16t\u06cd\13t\3u\3u\3v\3v\3v\3w\3w\3"+
		"w\5w\u06d7\nw\3w\3w\5w\u06db\nw\3w\5w\u06de\nw\3x\3x\5x\u06e2\nx\3x\3"+
		"x\3x\3x\3x\5x\u06e9\nx\3y\3y\3z\3z\5z\u06ef\nz\3z\3z\5z\u06f3\nz\3{\3"+
		"{\3{\3{\7{\u06f9\n{\f{\16{\u06fc\13{\3|\3|\3|\7|\u0701\n|\f|\16|\u0704"+
		"\13|\3}\3}\3}\5}\u0709\n}\3~\3~\5~\u070d\n~\3\177\3\177\3\177\3\177\5"+
		"\177\u0713\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u071c\n\u0080\3\u0081\5\u0081\u071f\n\u0081\3\u0081\3\u0081\3"+
		"\u0081\5\u0081\u0724\n\u0081\3\u0081\5\u0081\u0727\n\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u072f\n\u0082\f\u0082\16\u0082"+
		"\u0732\13\u0082\3\u0082\3\u0082\5\u0082\u0736\n\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\7\u0083\u073d\n\u0083\f\u0083\16\u0083\u0740"+
		"\13\u0083\3\u0083\3\u0083\5\u0083\u0744\n\u0083\3\u0084\3\u0084\5\u0084"+
		"\u0748\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u074f\n"+
		"\u0084\f\u0084\16\u0084\u0752\13\u0084\3\u0084\5\u0084\u0755\n\u0084\3"+
		"\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\7\u0087\u0761\n\u0087\f\u0087\16\u0087\u0764\13\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u0770\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0775\n\u008a\7"+
		"\u008a\u0777\n\u008a\f\u008a\16\u008a\u077a\13\u008a\3\u008b\6\u008b\u077d"+
		"\n\u008b\r\u008b\16\u008b\u077e\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u078a\n\u008c\5\u008c\u078c\n"+
		"\u008c\3\u008d\3\u008d\5\u008d\u0790\n\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\5\u008d\u0797\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7"+
		"\u008d\u079d\n\u008d\f\u008d\16\u008d\u07a0\13\u008d\3\u008e\3\u008e\3"+
		"\u008e\5\u008e\u07a5\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u07aa\n\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u07b5\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u07be\n\u008f\3\u0090\3\u0090\5\u0090\u07c2\n\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u07c9\n\u0090\f\u0090\16"+
		"\u0090\u07cc\13\u0090\3\u0090\5\u0090\u07cf\n\u0090\3\u0090\3\u0090\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u07d7\n\u0091\f\u0091\16\u0091"+
		"\u07da\13\u0091\3\u0091\3\u0091\5\u0091\u07de\n\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u07f4\n\u0094\3\u0094\5\u0094\u07f7\n\u0094\3\u0095\3\u0095\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u080c\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096"+
		"\u0814\n\u0096\f\u0096\16\u0096\u0817\13\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\7\u0096\u081d\n\u0096\f\u0096\16\u0096\u0820\13\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\7\u0096\u0826\n\u0096\f\u0096\16\u0096\u0829"+
		"\13\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u082f\n\u0096\f\u0096"+
		"\16\u0096\u0832\13\u0096\7\u0096\u0834\n\u0096\f\u0096\16\u0096\u0837"+
		"\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0845\n\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\7\u009b\u0852\n\u009b\f\u009b\16\u009b\u0855\13\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0860"+
		"\n\u009c\3\u009d\3\u009d\5\u009d\u0864\n\u009d\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\6\u009e\u086d\n\u009e\r\u009e\16\u009e"+
		"\u086e\3\u009e\3\u009e\5\u009e\u0873\n\u009e\3\u009e\3\u009e\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\3\u009f\6\u009f\u087d\n\u009f\r\u009f\16"+
		"\u009f\u087e\3\u009f\3\u009f\5\u009f\u0883\n\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u088e\n\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0893\n\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u0898\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u089c\n\u00a1\3\u00a1\3"+
		"\u00a1\5\u00a1\u08a0\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08a5\n\u00a1"+
		"\3\u00a1\3\u00a1\5\u00a1\u08a9\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u08ad\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08c4\n\u00a1\5\u00a1\u08c6\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1"+
		"\u08d8\n\u00a1\5\u00a1\u08da\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3"+
		"\u00a1\3\u00a1\5\u00a1\u08e2\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08e7"+
		"\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08ec\n\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u08f1\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08fe\n\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0903\n\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u0908\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u090d\n\u00a1\3"+
		"\u00a1\3\u00a1\3\u00a1\5\u00a1\u0912\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5"+
		"\u00a1\u0917\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u091c\n\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\5\u00a1\u0921\n\u00a1\5\u00a1\u0923\n\u00a1\3\u00a2\3"+
		"\u00a2\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u092a\n\u00a3\3\u00a3\5\u00a3\u092d"+
		"\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4"+
		"\u0936\n\u00a4\f\u00a4\16\u00a4\u0939\13\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0942\n\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u094a\n\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0953\n\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0959\n\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\7\u00a5\u0968\n\u00a5\f\u00a5\16\u00a5\u096b\13\u00a5\5\u00a5"+
		"\u096d\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u097b\n\u00a5\f\u00a5"+
		"\16\u00a5\u097e\13\u00a5\5\u00a5\u0980\n\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\7\u00a5\u098e\n\u00a5\f\u00a5\16\u00a5\u0991\13\u00a5\5\u00a5\u0993\n"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u09a1\n\u00a5\f\u00a5\16\u00a5"+
		"\u09a4\13\u00a5\5\u00a5\u09a6\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5"+
		"\u09b4\n\u00a5\f\u00a5\16\u00a5\u09b7\13\u00a5\5\u00a5\u09b9\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u09c7\n\u00a5\f\u00a5\16\u00a5\u09ca"+
		"\13\u00a5\5\u00a5\u09cc\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u09d8\n\u00a5\f\u00a5"+
		"\16\u00a5\u09db\13\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\6\u00a5\u09e7\n\u00a5\r\u00a5\16\u00a5"+
		"\u09e8\3\u00a5\3\u00a5\5\u00a5\u09ed\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u09fd\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u0a03\n\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0a08\n\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0a0f\n\u00a7\f\u00a7\16"+
		"\u00a7\u0a12\13\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0a18\n"+
		"\u00a8\5\u00a8\u0a1a\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a27\n\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a2d\n\u00ab\7\u00ab\u0a2f\n\u00ab"+
		"\f\u00ab\16\u00ab\u0a32\13\u00ab\3\u00ac\3\u00ac\5\u00ac\u0a36\n\u00ac"+
		"\3\u00ad\5\u00ad\u0a39\n\u00ad\3\u00ad\3\u00ad\3\u00ae\5\u00ae\u0a3e\n"+
		"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\2\4\u0118\u012a\u00b2\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\2-\7\2%%ZZrr\u0090\u0090\u0158\u0159\3\2\u015e\u015f"+
		"\4\2\u0163\u0163\u0165\u0169\4\2\u0160\u0160\u016a\u016a\4\2\u015b\u015b"+
		"\u0172\u0172\3\2\u0173\u0174\4\2aa\u0137\u0137\5\2\r\rss\u0099\u0099\4"+
		"\2  ((\4\2\66\66kk\4\2\u00b8\u00b8\u0100\u0100\4\2\16\16RR\4\2OO\u012c"+
		"\u012c\4\2ll\u00ab\u00ab\4\2OO\u00d8\u00d8\4\2KK\u0088\u0088\5\2\u008c"+
		"\u008c\u00b2\u00b2\u00d4\u00d5\4\2\u00ad\u00ad\u00bf\u00bf\4\2\u00bc\u00bc"+
		"\u013f\u013f\4\2\u00f3\u00f3\u0129\u0129\4\2\36\36%%\4\2##==\4\2AA\u00f9"+
		"\u00f9\4\2\r\r\u0099\u0099\3\2\u00ea\u00eb\3\2\u00db\u00dc\6\2<<MM\u0098"+
		"\u0098\u00d1\u00d1\3\2^_\4\2\35\35\u0112\u0112\3\2\u00fe\u00ff\4\2\7\7"+
		"WW\6\2\3\3\u015b\u015b\u0160\u0160\u0172\u0172\5\2xx\u00a2\u00a2\u00ed"+
		"\u00ed\5\2==\u00f5\u00f6\u012d\u012d\5\2hh\u0104\u0104\u012c\u012c\4\2"+
		"\n\n\u00cb\u00cb\5\2\u00a3\u00a3\u00e4\u00e4\u00ee\u00ee\7\2\3\3\u015b"+
		"\u015b\u0160\u0160\u016a\u016a\u0172\u0172\5\2EF\u00b5\u00b6\u00fa\u00fb"+
		"\4\2\63\63\u015e\u015e\5\2vv\u009a\u009a\u00c2\u00c2\4\2mm\u0127\u0127"+
		"\16\2\5\30\32\\``b\u00c2\u00c4\u00d5\u00d7\u00f2\u00f4\u0107\u0109\u0121"+
		"\u0123\u0128\u012b\u0136\u0139\u0149\u0150\u0157\2\u0ba0\2\u0162\3\2\2"+
		"\2\4\u016c\3\2\2\2\6\u0171\3\2\2\2\b\u0185\3\2\2\2\n\u0187\3\2\2\2\f\u0193"+
		"\3\2\2\2\16\u01a3\3\2\2\2\20\u01a5\3\2\2\2\22\u01b5\3\2\2\2\24\u01bf\3"+
		"\2\2\2\26\u01c1\3\2\2\2\30\u01c7\3\2\2\2\32\u01c9\3\2\2\2\34\u01d1\3\2"+
		"\2\2\36\u01d9\3\2\2\2 \u01df\3\2\2\2\"\u01e3\3\2\2\2$\u01e5\3\2\2\2&\u01e9"+
		"\3\2\2\2(\u01ee\3\2\2\2*\u01f3\3\2\2\2,\u01f6\3\2\2\2.\u0204\3\2\2\2\60"+
		"\u0206\3\2\2\2\62\u021b\3\2\2\2\64\u021f\3\2\2\2\66\u0240\3\2\2\28\u024e"+
		"\3\2\2\2:\u0251\3\2\2\2<\u0258\3\2\2\2>\u0263\3\2\2\2@\u0266\3\2\2\2B"+
		"\u0273\3\2\2\2D\u0275\3\2\2\2F\u0277\3\2\2\2H\u027d\3\2\2\2J\u0283\3\2"+
		"\2\2L\u028c\3\2\2\2N\u0297\3\2\2\2P\u02a6\3\2\2\2R\u02cb\3\2\2\2T\u02cd"+
		"\3\2\2\2V\u02d5\3\2\2\2X\u02e0\3\2\2\2Z\u02e9\3\2\2\2\\\u02ec\3\2\2\2"+
		"^\u02f9\3\2\2\2`\u0303\3\2\2\2b\u0310\3\2\2\2d\u032f\3\2\2\2f\u0334\3"+
		"\2\2\2h\u0337\3\2\2\2j\u0356\3\2\2\2l\u0358\3\2\2\2n\u037a\3\2\2\2p\u03b5"+
		"\3\2\2\2r\u03b7\3\2\2\2t\u03c4\3\2\2\2v\u03cb\3\2\2\2x\u03ce\3\2\2\2z"+
		"\u03d3\3\2\2\2|\u03e1\3\2\2\2~\u03f5\3\2\2\2\u0080\u0418\3\2\2\2\u0082"+
		"\u042c\3\2\2\2\u0084\u0432\3\2\2\2\u0086\u0434\3\2\2\2\u0088\u0458\3\2"+
		"\2\2\u008a\u045e\3\2\2\2\u008c\u047b\3\2\2\2\u008e\u04aa\3\2\2\2\u0090"+
		"\u04ac\3\2\2\2\u0092\u04ae\3\2\2\2\u0094\u04cb\3\2\2\2\u0096\u04d9\3\2"+
		"\2\2\u0098\u04db\3\2\2\2\u009a\u04df\3\2\2\2\u009c\u04f8\3\2\2\2\u009e"+
		"\u0501\3\2\2\2\u00a0\u0511\3\2\2\2\u00a2\u051d\3\2\2\2\u00a4\u0529\3\2"+
		"\2\2\u00a6\u0540\3\2\2\2\u00a8\u0549\3\2\2\2\u00aa\u0556\3\2\2\2\u00ac"+
		"\u0563\3\2\2\2\u00ae\u056c\3\2\2\2\u00b0\u059b\3\2\2\2\u00b2\u05c7\3\2"+
		"\2\2\u00b4\u05ca\3\2\2\2\u00b6\u05d9\3\2\2\2\u00b8\u05de\3\2\2\2\u00ba"+
		"\u05e0\3\2\2\2\u00bc\u05f0\3\2\2\2\u00be\u05f7\3\2\2\2\u00c0\u05fd\3\2"+
		"\2\2\u00c2\u0602\3\2\2\2\u00c4\u0605\3\2\2\2\u00c6\u0618\3\2\2\2\u00c8"+
		"\u061c\3\2\2\2\u00ca\u061e\3\2\2\2\u00cc\u0634\3\2\2\2\u00ce\u0643\3\2"+
		"\2\2\u00d0\u0645\3\2\2\2\u00d2\u0660\3\2\2\2\u00d4\u0663\3\2\2\2\u00d6"+
		"\u0667\3\2\2\2\u00d8\u0670\3\2\2\2\u00da\u0679\3\2\2\2\u00dc\u0684\3\2"+
		"\2\2\u00de\u068e\3\2\2\2\u00e0\u0697\3\2\2\2\u00e2\u06a8\3\2\2\2\u00e4"+
		"\u06aa\3\2\2\2\u00e6\u06c1\3\2\2\2\u00e8\u06ce\3\2\2\2\u00ea\u06d0\3\2"+
		"\2\2\u00ec\u06dd\3\2\2\2\u00ee\u06e8\3\2\2\2\u00f0\u06ea\3\2\2\2\u00f2"+
		"\u06f2\3\2\2\2\u00f4\u06f4\3\2\2\2\u00f6\u06fd\3\2\2\2\u00f8\u0708\3\2"+
		"\2\2\u00fa\u070a\3\2\2\2\u00fc\u070e\3\2\2\2\u00fe\u071b\3\2\2\2\u0100"+
		"\u0726\3\2\2\2\u0102\u0728\3\2\2\2\u0104\u0743\3\2\2\2\u0106\u0745\3\2"+
		"\2\2\u0108\u0756\3\2\2\2\u010a\u0758\3\2\2\2\u010c\u075b\3\2\2\2\u010e"+
		"\u0765\3\2\2\2\u0110\u0768\3\2\2\2\u0112\u076b\3\2\2\2\u0114\u077c\3\2"+
		"\2\2\u0116\u078b\3\2\2\2\u0118\u0796\3\2\2\2\u011a\u07a4\3\2\2\2\u011c"+
		"\u07bd\3\2\2\2\u011e\u07bf\3\2\2\2\u0120\u07d2\3\2\2\2\u0122\u07e4\3\2"+
		"\2\2\u0124\u07e8\3\2\2\2\u0126\u07f6\3\2\2\2\u0128\u07f8\3\2\2\2\u012a"+
		"\u080b\3\2\2\2\u012c\u0838\3\2\2\2\u012e\u0844\3\2\2\2\u0130\u0846\3\2"+
		"\2\2\u0132\u084a\3\2\2\2\u0134\u084c\3\2\2\2\u0136\u085f\3\2\2\2\u0138"+
		"\u0863\3\2\2\2\u013a\u0865\3\2\2\2\u013c\u0876\3\2\2\2\u013e\u0886\3\2"+
		"\2\2\u0140\u0922\3\2\2\2\u0142\u0924\3\2\2\2\u0144\u0926\3\2\2\2\u0146"+
		"\u0930\3\2\2\2\u0148\u0a02\3\2\2\2\u014a\u0a04\3\2\2\2\u014c\u0a0b\3\2"+
		"\2\2\u014e\u0a13\3\2\2\2\u0150\u0a1d\3\2\2\2\u0152\u0a20\3\2\2\2\u0154"+
		"\u0a26\3\2\2\2\u0156\u0a35\3\2\2\2\u0158\u0a38\3\2\2\2\u015a\u0a3d\3\2"+
		"\2\2\u015c\u0a41\3\2\2\2\u015e\u0a43\3\2\2\2\u0160\u0a45\3\2\2\2\u0162"+
		"\u0163\5\4\3\2\u0163\u0164\7\2\2\3\u0164\3\3\2\2\2\u0165\u0168\5\6\4\2"+
		"\u0166\u0168\5\16\b\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u016b\7|\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u0167\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\5\3\2\2\2\u0170\u0172\5L\'\2\u0171\u0170"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7\24\2\2"+
		"\u0174\u0176\5\4\3\2\u0175\u0177\5F$\2\u0176\u0175\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5\n\6\2\u0179\7\3\2\2\2\u017a"+
		"\u017b\7\24\2\2\u017b\u017d\5\4\3\2\u017c\u017e\5F$\2\u017d\u017c\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5\n\6\2\u0180"+
		"\u0186\3\2\2\2\u0181\u0183\5\16\b\2\u0182\u0184\7\u0171\2\2\u0183\u0182"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u017a\3\2\2\2\u0185"+
		"\u0181\3\2\2\2\u0186\t\3\2\2\2\u0187\u0188\6\6\2\2\u0188\u0189\7a\2\2"+
		"\u0189\13\3\2\2\2\u018a\u0194\5\6\4\2\u018b\u018d\5\16\b\2\u018c\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0191\3\2\2\2\u0190\u0192\7|\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u018a\3\2\2\2\u0193\u018c\3\2\2\2\u0194"+
		"\r\3\2\2\2\u0195\u01a4\5\u009aN\2\u0196\u01a4\5\u009eP\2\u0197\u01a4\5"+
		"\u00c4c\2\u0198\u01a4\5b\62\2\u0199\u01a4\5\u00a2R\2\u019a\u01a4\5\u00a8"+
		"U\2\u019b\u01a4\5\u00aeX\2\u019c\u01a4\5`\61\2\u019d\u01a4\5J&\2\u019e"+
		"\u01a4\5\u00ccg\2\u019f\u01a4\5\u00d0i\2\u01a0\u01a4\5\u00b8]\2\u01a1"+
		"\u01a4\5\u00d4k\2\u01a2\u01a4\5\20\t\2\u01a3\u0195\3\2\2\2\u01a3\u0196"+
		"\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3"+
		"\u019a\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019d\3\2"+
		"\2\2\u01a3\u019e\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\17\3\2\2\2\u01a5\u01a6\5\30\r"+
		"\2\u01a6\u01a7\7\u0173\2\2\u01a7\u01b0\7\u016c\2\2\u01a8\u01ad\5\32\16"+
		"\2\u01a9\u01aa\7\u015d\2\2\u01aa\u01ac\5\32\16\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\7\u016f\2\2\u01b3\u01b4\5\22\n\2\u01b4\21\3"+
		"\2\2\2\u01b5\u01ba\7\u016b\2\2\u01b6\u01b9\5\36\20\2\u01b7\u01b9\5\22"+
		"\n\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01be\5\24\13\2\u01be\23\3\2\2\2\u01bf\u01c0\7\u016e\2\2\u01c0"+
		"\25\3\2\2\2\u01c1\u01c3\7\u00ea\2\2\u01c2\u01c4\5<\37\2\u01c3\u01c2\3"+
		"\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7\u0171\2\2"+
		"\u01c6\27\3\2\2\2\u01c7\u01c8\t\2\2\2\u01c8\31\3\2\2\2\u01c9\u01ca\5\30"+
		"\r\2\u01ca\u01cd\7\u0173\2\2\u01cb\u01cc\7\u0162\2\2\u01cc\u01ce\5\34"+
		"\17\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\33\3\2\2\2\u01cf\u01d2"+
		"\5\u0158\u00ad\2\u01d0\u01d2\5\u015a\u00ae\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\35\3\2\2\2\u01d3\u01da\5\26\f\2\u01d4\u01da\5 \21"+
		"\2\u01d5\u01da\5\60\31\2\u01d6\u01da\5\62\32\2\u01d7\u01da\5\u00d4k\2"+
		"\u01d8\u01da\5`\61\2\u01d9\u01d3\3\2\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5"+
		"\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da"+
		"\37\3\2\2\2\u01db\u01e0\5$\23\2\u01dc\u01e0\5&\24\2\u01dd\u01e0\5(\25"+
		"\2\u01de\u01e0\5,\27\2\u01df\u01db\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5\"\22\2"+
		"\u01e2!\3\2\2\2\u01e3\u01e4\7\u0171\2\2\u01e4#\3\2\2\2\u01e5\u01e6\7\u0173"+
		"\2\2\u01e6\u01e7\7\u0162\2\2\u01e7\u01e8\5\u00d4k\2\u01e8%\3\2\2\2\u01e9"+
		"\u01ea\7\u0173\2\2\u01ea\u01eb\7\u0162\2\2\u01eb\u01ec\7\u015a\2\2\u01ec"+
		"\u01ed\5\u00d4k\2\u01ed\'\3\2\2\2\u01ee\u01ef\5\30\r\2\u01ef\u01f1\7\u0173"+
		"\2\2\u01f0\u01f2\5*\26\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		")\3\2\2\2\u01f3\u01f4\7\u0162\2\2\u01f4\u01f5\5<\37\2\u01f5+\3\2\2\2\u01f6"+
		"\u01f7\7\u0173\2\2\u01f7\u01f8\5.\30\2\u01f8-\3\2\2\2\u01f9\u01fc\7\u015b"+
		"\2\2\u01fa\u01fd\7\u015b\2\2\u01fb\u01fd\5*\26\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fd\u0205\3\2\2\2\u01fe\u0201\7\u0172\2\2\u01ff\u0202"+
		"\7\u0172\2\2\u0200\u0202\5*\26\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2"+
		"\2\u0202\u0205\3\2\2\2\u0203\u0205\5*\26\2\u0204\u01f9\3\2\2\2\u0204\u01fe"+
		"\3\2\2\2\u0204\u0203\3\2\2\2\u0205/\3\2\2\2\u0206\u0207\7\u0086\2\2\u0207"+
		"\u0208\7\u016c\2\2\u0208\u0209\5\66\34\2\u0209\u020a\7\u016f\2\2\u020a"+
		"\u0214\5\22\n\2\u020b\u020c\7]\2\2\u020c\u020d\7\u0086\2\2\u020d\u020e"+
		"\7\u016c\2\2\u020e\u020f\5\66\34\2\u020f\u0210\7\u016f\2\2\u0210\u0211"+
		"\5\22\n\2\u0211\u0213\3\2\2\2\u0212\u020b\3\2\2\2\u0213\u0216\3\2\2\2"+
		"\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0219\3\2\2\2\u0216\u0214"+
		"\3\2\2\2\u0217\u0218\7]\2\2\u0218\u021a\5\22\n\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\61\3\2\2\2\u021b\u021c\7s\2\2\u021c\u021d\5\64\33"+
		"\2\u021d\u021e\5\22\n\2\u021e\63\3\2\2\2\u021f\u0222\7\u016c\2\2\u0220"+
		"\u0223\5(\25\2\u0221\u0223\5,\27\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2"+
		"\2\2\u0223\u022b\3\2\2\2\u0224\u0227\7\u015d\2\2\u0225\u0228\5(\25\2\u0226"+
		"\u0228\5,\27\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u022a\3\2"+
		"\2\2\u0229\u0224\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\7\u0171"+
		"\2\2\u022f\u0231\5\66\34\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0234\7\u0171\2\2\u0233\u0235\5,\27\2\u0234\u0233"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u023a\3\2\2\2\u0236\u0237\7\u015d\2"+
		"\2\u0237\u0239\5,\27\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u023e\7\u016f\2\2\u023e\65\3\2\2\2\u023f\u0241\7\u00c1\2\2\u0240\u023f"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0249\5<\37\2\u0243"+
		"\u0245\5:\36\2\u0244\u0246\7\u00c1\2\2\u0245\u0244\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\5<\37\2\u0248\u024a\3\2\2\2\u0249"+
		"\u0243\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u024d\58"+
		"\35\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\67\3\2\2\2\u024e\u024f"+
		"\t\3\2\2\u024f\u0250\5\66\34\2\u02509\3\2\2\2\u0251\u0252\t\4\2\2\u0252"+
		";\3\2\2\2\u0253\u0254\5> \2\u0254\u0255\5D#\2\u0255\u0256\5<\37\2\u0256"+
		"\u0259\3\2\2\2\u0257\u0259\5> \2\u0258\u0253\3\2\2\2\u0258\u0257\3\2\2"+
		"\2\u0259=\3\2\2\2\u025a\u0264\5@!\2\u025b\u025c\5@!\2\u025c\u025d\t\5"+
		"\2\2\u025d\u025e\5> \2\u025e\u0264\3\2\2\2\u025f\u0260\7\u016c\2\2\u0260"+
		"\u0261\5<\37\2\u0261\u0262\7\u016f\2\2\u0262\u0264\3\2\2\2\u0263\u025a"+
		"\3\2\2\2\u0263\u025b\3\2\2\2\u0263\u025f\3\2\2\2\u0264?\3\2\2\2\u0265"+
		"\u0267\5B\"\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026a\3\2"+
		"\2\2\u0268\u026b\7\u0173\2\2\u0269\u026b\5\34\17\2\u026a\u0268\3\2\2\2"+
		"\u026a\u0269\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026e\5B\"\2\u026d\u026c"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026eA\3\2\2\2\u026f\u0270\7\u015b\2\2\u0270"+
		"\u0274\7\u015b\2\2\u0271\u0272\7\u0172\2\2\u0272\u0274\7\u0172\2\2\u0273"+
		"\u026f\3\2\2\2\u0273\u0271\3\2\2\2\u0274C\3\2\2\2\u0275\u0276\t\6\2\2"+
		"\u0276E\3\2\2\2\u0277\u0279\7g\2\2\u0278\u027a\5H%\2\u0279\u0278\3\2\2"+
		"\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027cG"+
		"\3\2\2\2\u027d\u027e\7\u0137\2\2\u027e\u027f\t\7\2\2\u027f\u0280\7\u0120"+
		"\2\2\u0280\u0281\5\4\3\2\u0281\u0282\n\b\2\2\u0282I\3\2\2\2\u0283\u0284"+
		"\7I\2\2\u0284\u0289\5P)\2\u0285\u0286\7\u015d\2\2\u0286\u0288\5P)\2\u0287"+
		"\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028aK\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\7I\2\2\u028d\u028e"+
		"\5P)\2\u028e\u0294\7\u0171\2\2\u028f\u0290\5P)\2\u0290\u0291\7\u0171\2"+
		"\2\u0291\u0293\3\2\2\2\u0292\u028f\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295M\3\2\2\2\u0296\u0294\3\2\2\2\u0297"+
		"\u0298\5P)\2\u0298\u029e\7\u0171\2\2\u0299\u029a\5P)\2\u029a\u029b\7\u0171"+
		"\2\2\u029b\u029d\3\2\2\2\u029c\u0299\3\2\2\2\u029d\u02a0\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029fO\3\2\2\2\u02a0\u029e\3\2\2\2"+
		"\u02a1\u02a7\5V,\2\u02a2\u02a7\5T+\2\u02a3\u02a7\5\\/\2\u02a4\u02a7\5"+
		"R*\2\u02a5\u02a7\5^\60\2\u02a6\u02a1\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a6"+
		"\u02a3\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5\3\2\2\2\u02a7Q\3\2\2\2"+
		"\u02a8\u02ad\5\u0154\u00ab\2\u02a9\u02aa\7\u015d\2\2\u02aa\u02ac\5\u0154"+
		"\u00ab\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b2\7\r"+
		"\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b5\5\u008eH\2\u02b4\u02b6\5\u0092J\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02ba\3\2\2\2\u02b7\u02b9\5\u0094K\2\u02b8\u02b7\3\2\2"+
		"\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02be"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02bf\5\u0096L\2\u02be\u02bd\3\2\2"+
		"\2\u02be\u02bf\3\2\2\2\u02bf\u02cc\3\2\2\2\u02c0\u02c1\5\u0154\u00ab\2"+
		"\u02c1\u02c3\7\60\2\2\u02c2\u02c4\7\r\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4"+
		"\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\5\u008eH\2\u02c6\u02c8\5\u0092"+
		"J\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\5\u0096L\2\u02ca\u02cc\3\2\2\2\u02cb\u02a8\3\2\2\2\u02cb\u02c0"+
		"\3\2\2\2\u02ccS\3\2\2\2\u02cd\u02ce\5\u0154\u00ab\2\u02ce\u02cf\7\64\2"+
		"\2\u02cfU\3\2\2\2\u02d0\u02d1\7@\2\2\u02d1\u02d6\5\u0154\u00ab\2\u02d2"+
		"\u02d3\5\u0154\u00ab\2\u02d3\u02d4\7@\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d0"+
		"\3\2\2\2\u02d5\u02d2\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02da\5X-\2\u02d8"+
		"\u02da\5Z.\2\u02d9\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2"+
		"\2\u02da\u02db\3\2\2\2\u02db\u02de\t\t\2\2\u02dc\u02df\5\u00d4k\2\u02dd"+
		"\u02df\5\u012a\u0096\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02dfW"+
		"\3\2\2\2\u02e0\u02e1\7\u013a\2\2\u02e1\u02e3\7\u00ea\2\2\u02e2\u02e4\7"+
		"\u00c9\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\3\2\2\2"+
		"\u02e5\u02e6\7\u0124\2\2\u02e6\u02e8\t\n\2\2\u02e7\u02e5\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8Y\3\2\2\2\u02e9\u02ea\7\u013b\2\2\u02ea\u02eb\7\u00ea"+
		"\2\2\u02eb[\3\2\2\2\u02ec\u02ed\t\13\2\2\u02ed\u02ee\7\177\2\2\u02ee\u02f4"+
		"\7s\2\2\u02ef\u02f5\7\u010c\2\2\u02f0\u02f5\7\u010f\2\2\u02f1\u02f2\7"+
		"\u00c1\2\2\u02f2\u02f5\7v\2\2\u02f3\u02f5\5\u0154\u00ab\2\u02f4\u02ef"+
		"\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f4\u02f1\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f7\5\b\5\2\u02f7]\3\2\2\2\u02f8\u02fa\7{\2\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7\u011d"+
		"\2\2\u02fc\u02fd\7\u011b\2\2\u02fd\u02ff\5\u0154\u00ab\2\u02fe\u0300\5"+
		"t;\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0302\5d\63\2\u0302_\3\2\2\2\u0303\u0304\7:\2\2\u0304\u0308\7\u011b\2"+
		"\2\u0305\u0306\7\u0086\2\2\u0306\u0307\7\u00c1\2\2\u0307\u0309\7i\2\2"+
		"\u0308\u0305\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c"+
		"\5\u0108\u0085\2\u030b\u030d\5t;\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030e\3\2\2\2\u030e\u030f\5d\63\2\u030fa\3\2\2\2\u0310\u0317"+
		"\7:\2\2\u0311\u0312\7\u00a6\2\2\u0312\u0318\7\u011d\2\2\u0313\u0315\t"+
		"\f\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0318\7\u0136\2\2\u0317\u0311\3\2\2\2\u0317\u0314\3\2\2\2\u0318\u0319"+
		"\3\2\2\2\u0319\u031a\7\u011b\2\2\u031a\u031c\5\u0154\u00ab\2\u031b\u031d"+
		"\5t;\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\5d\63\2\u031fc\3\2\2\2\u0320\u0322\7\r\2\2\u0321\u0320\3\2\2\2"+
		"\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7\u016c\2\2\u0324"+
		"\u0325\5\u00d4k\2\u0325\u0326\7\u016f\2\2\u0326\u0330\3\2\2\2\u0327\u0329"+
		"\7\r\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a"+
		"\u0330\5\u00d4k\2\u032b\u032c\7\u016c\2\2\u032c\u032d\5h\65\2\u032d\u032e"+
		"\7\u016f\2\2\u032e\u0330\3\2\2\2\u032f\u0321\3\2\2\2\u032f\u0328\3\2\2"+
		"\2\u032f\u032b\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u0333\5z>\2\u0332\u0331"+
		"\3\2\2\2\u0332\u0333\3\2\2\2\u0333e\3\2\2\2\u0334\u0335\7\u0171\2\2\u0335"+
		"\u0336\5j\66\2\u0336g\3\2\2\2\u0337\u033d\5j\66\2\u0338\u0339\7\u015d"+
		"\2\2\u0339\u033c\5j\66\2\u033a\u033c\5f\64\2\u033b\u0338\3\2\2\2\u033b"+
		"\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033ei\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0341\5l\67\2\u0341\u0343"+
		"\5\u008eH\2\u0342\u0344\5\u0092J\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0348\3\2\2\2\u0345\u0347\5\u0094K\2\u0346\u0345\3\2\2\2\u0347"+
		"\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034e\3\2"+
		"\2\2\u034a\u0348\3\2\2\2\u034b\u034d\5n8\2\u034c\u034b\3\2\2\2\u034d\u0350"+
		"\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0357\3\2\2\2\u0350"+
		"\u034e\3\2\2\2\u0351\u0352\7\65\2\2\u0352\u0354\5\u0154\u00ab\2\u0353"+
		"\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\5p"+
		"9\2\u0356\u0340\3\2\2\2\u0356\u0353\3\2\2\2\u0357k\3\2\2\2\u0358\u0359"+
		"\5\u0154\u00ab\2\u0359m\3\2\2\2\u035a\u037b\5\u0096L\2\u035b\u035d\7\u00c1"+
		"\2\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e"+
		"\u037b\7\u00c3\2\2\u035f\u0360\7\u00d9\2\2\u0360\u037b\7\u009e\2\2\u0361"+
		"\u037b\7\u012b\2\2\u0362\u0363\7\u00e3\2\2\u0363\u0364\5\u0108\u0085\2"+
		"\u0364\u0365\7\u016c\2\2\u0365\u0366\5\u0154\u00ab\2\u0366\u036a\7\u016f"+
		"\2\2\u0367\u0369\5r:\2\u0368\u0367\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368"+
		"\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u037b\3\2\2\2\u036c\u036a\3\2\2\2\u036d"+
		"\u036e\7\u0085\2\2\u036e\u036f\7\u016c\2\2\u036f\u0374\7\u0177\2\2\u0370"+
		"\u0371\7\u015d\2\2\u0371\u0373\7\u0177\2\2\u0372\u0370\3\2\2\2\u0373\u0376"+
		"\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0377\u037b\7\u016f\2\2\u0378\u037b\7\21\2\2\u0379\u037b"+
		"\7`\2\2\u037a\u035a\3\2\2\2\u037a\u035c\3\2\2\2\u037a\u035f\3\2\2\2\u037a"+
		"\u0361\3\2\2\2\u037a\u0362\3\2\2\2\u037a\u036d\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037a\u0379\3\2\2\2\u037bo\3\2\2\2\u037c\u037d\7\u00d9\2\2\u037d"+
		"\u037f\7\u009e\2\2\u037e\u0380\7*\2\2\u037f\u037e\3\2\2\2\u037f\u0380"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\7\u016c\2\2\u0382\u0384\5\u0154"+
		"\u00ab\2\u0383\u0385\t\r\2\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u038d\3\2\2\2\u0386\u0387\7\u015d\2\2\u0387\u0389\5\u0154\u00ab\2\u0388"+
		"\u038a\t\r\2\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2"+
		"\2\2\u038b\u0386\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0392\7\u016f"+
		"\2\2\u0391\u0393\7`\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u0395\3\2\2\2\u0394\u0396\5\u00c8e\2\u0395\u0394\3\2\2\2\u0395\u0396"+
		"\3\2\2\2\u0396\u03b6\3\2\2\2\u0397\u0398\7t\2\2\u0398\u0399\7\u009e\2"+
		"\2\u0399\u039a\7\u016c\2\2\u039a\u039f\5\u0154\u00ab\2\u039b\u039c\7\u015d"+
		"\2\2\u039c\u039e\5\u0154\u00ab\2\u039d\u039b\3\2\2\2\u039e\u03a1\3\2\2"+
		"\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039f"+
		"\3\2\2\2\u03a2\u03a3\7\u016f\2\2\u03a3\u03a4\7\u00e3\2\2\u03a4\u03a5\5"+
		"\u0108\u0085\2\u03a5\u03a6\7\u016c\2\2\u03a6\u03ab\5\u0154\u00ab\2\u03a7"+
		"\u03a8\7\u015d\2\2\u03a8\u03aa\5\u0154\u00ab\2\u03a9\u03a7\3\2\2\2\u03aa"+
		"\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2"+
		"\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03b2\7\u016f\2\2\u03af\u03b1\5r:\2\u03b0"+
		"\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u037c\3\2\2\2\u03b5"+
		"\u0397\3\2\2\2\u03b6q\3\2\2\2\u03b7\u03b8\7\u00c8\2\2\u03b8\u03c1\t\16"+
		"\2\2\u03b9\u03ba\7\u00bc\2\2\u03ba\u03c2\7\5\2\2\u03bb\u03c2\7\u00e7\2"+
		"\2\u03bc\u03bd\7\u0100\2\2\u03bd\u03c2\7\u00c3\2\2\u03be\u03bf\7\u0100"+
		"\2\2\u03bf\u03c2\7J\2\2\u03c0\u03c2\7!\2\2\u03c1\u03b9\3\2\2\2\u03c1\u03bb"+
		"\3\2\2\2\u03c1\u03bc\3\2\2\2\u03c1\u03be\3\2\2\2\u03c1\u03c0\3\2\2\2\u03c2"+
		"s\3\2\2\2\u03c3\u03c5\5v<\2\u03c4\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7u\3\2\2\2\u03c8\u03c9\7\u015d"+
		"\2\2\u03c9\u03cc\5x=\2\u03ca\u03cc\5\u0084C\2\u03cb\u03c8\3\2\2\2\u03cb"+
		"\u03ca\3\2\2\2\u03ccw\3\2\2\2\u03cd\u03cf\7\u00bc\2\2\u03ce\u03cd\3\2"+
		"\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\t\17\2\2\u03d1"+
		"y\3\2\2\2\u03d2\u03d4\5|?\2\u03d3\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6{\3\2\2\2\u03d7\u03d8\7\u00c8"+
		"\2\2\u03d8\u03d9\7\61\2\2\u03d9\u03da\t\20\2\2\u03da\u03e2\7\u00f2\2\2"+
		"\u03db\u03e2\5~@\2\u03dc\u03e2\5\u0080A\2\u03dd\u03e2\5\u0082B\2\u03de"+
		"\u03e2\5\u0084C\2\u03df\u03e2\5\u008aF\2\u03e0\u03e2\5\u008cG\2\u03e1"+
		"\u03d7\3\2\2\2\u03e1\u03db\3\2\2\2\u03e1\u03dc\3\2\2\2\u03e1\u03dd\3\2"+
		"\2\2\u03e1\u03de\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2"+
		"}\3\2\2\2\u03e3\u03e4\7\u00fd\2\2\u03e4\u03e5\7;\2\2\u03e5\u03f6\t\21"+
		"\2\2\u03e6\u03e7\t\22\2\2\u03e7\u03f6\7\u0177\2\2\u03e8\u03f6\7\u00be"+
		"\2\2\u03e9\u03f6\t\23\2\2\u03ea\u03eb\7\u0113\2\2\u03eb\u03ee\7\u016c"+
		"\2\2\u03ec\u03ef\5\u0154\u00ab\2\u03ed\u03ef\7\u0177\2\2\u03ee\u03ec\3"+
		"\2\2\2\u03ee\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f6\7\u016f\2\2\u03f3\u03f4"+
		"\7\u011c\2\2\u03f4\u03f6\5\u0154\u00ab\2\u03f5\u03e3\3\2\2\2\u03f5\u03e6"+
		"\3\2\2\2\u03f5\u03e8\3\2\2\2\u03f5\u03e9\3\2\2\2\u03f5\u03ea\3\2\2\2\u03f5"+
		"\u03f3\3\2\2\2\u03f6\177\3\2\2\2\u03f7\u03f9\7\u008b\2\2\u03f8\u03f7\3"+
		"\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\7\u0089\2\2"+
		"\u03fb\u0419\5\u0154\u00ab\2\u03fc\u03fd\7\u013a\2\2\u03fd\u0419\7\u00e5"+
		"\2\2\u03fe\u03ff\7X\2\2\u03ff\u0400\7\35\2\2\u0400\u0401\7\u0080\2\2\u0401"+
		"\u0402\7\u016c\2\2\u0402\u0407\5\u0154\u00ab\2\u0403\u0404\7\u015d\2\2"+
		"\u0404\u0406\5\u0154\u00ab\2\u0405\u0403\3\2\2\2\u0406\u0409\3\2\2\2\u0407"+
		"\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\3\2\2\2\u0409\u0407\3\2"+
		"\2\2\u040a\u040b\7\u016f\2\2\u040b\u0419\3\2\2\2\u040c\u040e\7\u00c1\2"+
		"\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0419"+
		"\7\u00ac\2\2\u0410\u0411\7\62\2\2\u0411\u0419\t\24\2\2\u0412\u0413\7N"+
		"\2\2\u0413\u0419\7\u00c9\2\2\u0414\u0415\7\u013a\2\2\u0415\u0416\7\u00e7"+
		"\2\2\u0416\u0417\7\u00c8\2\2\u0417\u0419\7[\2\2\u0418\u03f8\3\2\2\2\u0418"+
		"\u03fc\3\2\2\2\u0418\u03fe\3\2\2\2\u0418\u040d\3\2\2\2\u0418\u0410\3\2"+
		"\2\2\u0418\u0412\3\2\2\2\u0418\u0414\3\2\2\2\u0419\u0081\3\2\2\2\u041a"+
		"\u041c\7\u012b\2\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d"+
		"\3\2\2\2\u041d\u041e\7\u00d9\2\2\u041e\u041f\7\u008b\2\2\u041f\u0420\7"+
		"\u016c\2\2\u0420\u0425\5\u0154\u00ab\2\u0421\u0422\7\u015d\2\2\u0422\u0424"+
		"\5\u0154\u00ab\2\u0423\u0421\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3"+
		"\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0425\3\2\2\2\u0428"+
		"\u0429\7\u016f\2\2\u0429\u042d\3\2\2\2\u042a\u042b\7\u013a\2\2\u042b\u042d"+
		"\7B\2\2\u042c\u041b\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u0083\3\2\2\2\u042e"+
		"\u0433\5\u0086D\2\u042f\u0430\7\u0114\2\2\u0430\u0431\7\r\2\2\u0431\u0433"+
		"\5\u0154\u00ab\2\u0432\u042e\3\2\2\2\u0432\u042f\3\2\2\2\u0433\u0085\3"+
		"\2\2\2\u0434\u0435\7\u00f1\2\2\u0435\u0436\7u\2\2\u0436\u043a\7P\2\2\u0437"+
		"\u0439\5\u0088E\2\u0438\u0437\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438"+
		"\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0087\3\2\2\2\u043c\u043a\3\2\2\2\u043d"+
		"\u043e\7o\2\2\u043e\u043f\7\u011e\2\2\u043f\u0440\7\35\2\2\u0440\u0444"+
		"\5\u012a\u0096\2\u0441\u0442\7c\2\2\u0442\u0443\7\35\2\2\u0443\u0445\5"+
		"\u012a\u0096\2\u0444\u0441\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0459\3\2"+
		"\2\2\u0446\u0447\7-\2\2\u0447\u0448\7\u009b\2\2\u0448\u0449\7\u011e\2"+
		"\2\u0449\u044a\7\35\2\2\u044a\u0459\5\u012a\u0096\2\u044b\u044c\7\u00af"+
		"\2\2\u044c\u044d\7\u009f\2\2\u044d\u044e\7\u011e\2\2\u044e\u044f\7\35"+
		"\2\2\u044f\u0459\5\u012a\u0096\2\u0450\u0451\7\u00a5\2\2\u0451\u0452\7"+
		"\u011e\2\2\u0452\u0453\7\35\2\2\u0453\u0459\5\u012a\u0096\2\u0454\u0455"+
		"\7\u00c3\2\2\u0455\u0456\7L\2\2\u0456\u0457\7\r\2\2\u0457\u0459\5\u012a"+
		"\u0096\2\u0458\u043d\3\2\2\2\u0458\u0446\3\2\2\2\u0458\u044b\3\2\2\2\u0458"+
		"\u0450\3\2\2\2\u0458\u0454\3\2\2\2\u0459\u0089\3\2\2\2\u045a\u045b\7\u00c8"+
		"\2\2\u045b\u045f\5\u0154\u00ab\2\u045c\u045d\7\u011f\2\2\u045d\u045f\5"+
		"\u0154\u00ab\2\u045e\u045a\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u008b\3\2"+
		"\2\2\u0460\u0462\7\21\2\2\u0461\u0463\7\u0162\2\2\u0462\u0461\3\2\2\2"+
		"\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u047c\5\u012a\u0096\2\u0465"+
		"\u0467\7/\2\2\u0466\u0468\7\u0162\2\2\u0467\u0466\3\2\2\2\u0467\u0468"+
		"\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u047c\5\u012a\u0096\2\u046a\u046c\7"+
		"J\2\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u0470\3\2\2\2\u046d"+
		"\u046e\7&\2\2\u046e\u0471\7\u0100\2\2\u046f\u0471\7\'\2\2\u0470\u046d"+
		"\3\2\2\2\u0470\u046f\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0474\7\u0162\2"+
		"\2\u0473\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u047c"+
		"\5\u012a\u0096\2\u0476\u0478\7b\2\2\u0477\u0479\7\u0162\2\2\u0478\u0477"+
		"\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\5\u012a\u0096"+
		"\2\u047b\u0460\3\2\2\2\u047b\u0465\3\2\2\2\u047b\u046b\3\2\2\2\u047b\u0476"+
		"\3\2\2\2\u047c\u008d\3\2\2\2\u047d\u04ab\7%\2\2\u047e\u04ab\7\26\2\2\u047f"+
		"\u04ab\7\27\2\2\u0480\u04ab\7\30\2\2\u0481\u04ab\7\31\2\2\u0482\u04ab"+
		"\7\32\2\2\u0483\u04ab\7C\2\2\u0484\u04ab\7D\2\2\u0485\u04ab\7G\2\2\u0486"+
		"\u04ab\7H\2\2\u0487\u0489\7Z\2\2\u0488\u048a\7\u00d7\2\2\u0489\u0488\3"+
		"\2\2\2\u0489\u048a\3\2\2\2\u048a\u04ab\3\2\2\2\u048b\u04ab\7r\2\2\u048c"+
		"\u04ab\7\u0090\2\2\u048d\u04ab\7\u0091\2\2\u048e\u04ab\7\u0092\2\2\u048f"+
		"\u04ab\7\u0093\2\2\u0490\u04ab\7\u0094\2\2\u0491\u04ab\7\u00b9\2\2\u0492"+
		"\u04ab\7\u00bb\2\2\u0493\u04ab\7\u00c5\2\2\u0494\u04ab\7\u00c4\2\2\u0495"+
		"\u04ab\7\u00d6\2\2\u0496\u04ab\7\u00e2\2\2\u0497\u0498\7\u00e9\2\2\u0498"+
		"\u04ab\7\u0135\2\2\u0499\u04ab\7\u0107\2\2\u049a\u04ab\7\u0106\2\2\u049b"+
		"\u04ab\7\u0108\2\2\u049c\u04ab\7\u010a\2\2\u049d\u04ab\7\u0109\2\2\u049e"+
		"\u04ab\7\u0115\2\2\u049f\u04ab\7\u011a\2\2\u04a0\u04ab\7\u0121\2\2\u04a1"+
		"\u04ab\7\u0122\2\2\u04a2\u04ab\7\u0133\2\2\u04a3\u04ab\7\u0134\2\2\u04a4"+
		"\u04ab\7\u013e\2\2\u04a5\u04a8\5\u0154\u00ab\2\u04a6\u04a7\7\3\2\2\u04a7"+
		"\u04a9\t\25\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\3"+
		"\2\2\2\u04aa\u047d\3\2\2\2\u04aa\u047e\3\2\2\2\u04aa\u047f\3\2\2\2\u04aa"+
		"\u0480\3\2\2\2\u04aa\u0481\3\2\2\2\u04aa\u0482\3\2\2\2\u04aa\u0483\3\2"+
		"\2\2\u04aa\u0484\3\2\2\2\u04aa\u0485\3\2\2\2\u04aa\u0486\3\2\2\2\u04aa"+
		"\u0487\3\2\2\2\u04aa\u048b\3\2\2\2\u04aa\u048c\3\2\2\2\u04aa\u048d\3\2"+
		"\2\2\u04aa\u048e\3\2\2\2\u04aa\u048f\3\2\2\2\u04aa\u0490\3\2\2\2\u04aa"+
		"\u0491\3\2\2\2\u04aa\u0492\3\2\2\2\u04aa\u0493\3\2\2\2\u04aa\u0494\3\2"+
		"\2\2\u04aa\u0495\3\2\2\2\u04aa\u0496\3\2\2\2\u04aa\u0497\3\2\2\2\u04aa"+
		"\u0499\3\2\2\2\u04aa\u049a\3\2\2\2\u04aa\u049b\3\2\2\2\u04aa\u049c\3\2"+
		"\2\2\u04aa\u049d\3\2\2\2\u04aa\u049e\3\2\2\2\u04aa\u049f\3\2\2\2\u04aa"+
		"\u04a0\3\2\2\2\u04aa\u04a1\3\2\2\2\u04aa\u04a2\3\2\2\2\u04aa\u04a3\3\2"+
		"\2\2\u04aa\u04a4\3\2\2\2\u04aa\u04a5\3\2\2\2\u04ab\u008f\3\2\2\2\u04ac"+
		"\u04ad\7\u0178\2\2\u04ad\u0091\3\2\2\2\u04ae\u04b2\7\u016c\2\2\u04af\u04b3"+
		"\7\u0177\2\2\u04b0\u04b3\5\u0090I\2\u04b1\u04b3\7\u00b1\2\2\u04b2\u04af"+
		"\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4"+
		"\u04b6\t\26\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04bc\3"+
		"\2\2\2\u04b7\u04ba\7\u015d\2\2\u04b8\u04bb\7\u0177\2\2\u04b9\u04bb\5\u0090"+
		"I\2\u04ba\u04b8\3\2\2\2\u04ba\u04b9\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc"+
		"\u04b7\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\7\u016f"+
		"\2\2\u04bf\u0093\3\2\2\2\u04c0\u04c2\7\u00c1\2\2\u04c1\u04c0\3\2\2\2\u04c1"+
		"\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04cc\7\u00c3\2\2\u04c4\u04c5"+
		"\7&\2\2\u04c5\u04c6\7\u0100\2\2\u04c6\u04cc\5\u0154\u00ab\2\u04c7\u04c9"+
		"\7\u00c1\2\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2"+
		"\2\u04ca\u04cc\t\27\2\2\u04cb\u04c1\3\2\2\2\u04cb\u04c4\3\2\2\2\u04cb"+
		"\u04c8\3\2\2\2\u04cc\u0095\3\2\2\2\u04cd\u04cf\7\u015c\2\2\u04ce\u04cd"+
		"\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\7\u0162\2"+
		"\2\u04d1\u04da\5\u012a\u0096\2\u04d2\u04d4\7\u013a\2\2\u04d3\u04d2\3\2"+
		"\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\7J\2\2\u04d6"+
		"\u04d8\5\u012a\u0096\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04da"+
		"\3\2\2\2\u04d9\u04ce\3\2\2\2\u04d9\u04d3\3\2\2\2\u04da\u0097\3\2\2\2\u04db"+
		"\u04dc\7\u0086\2\2\u04dc\u04dd\7\u00c1\2\2\u04dd\u04de\7j\2\2\u04de\u0099"+
		"\3\2\2\2\u04df\u04e0\7:\2\2\u04e0\u04eb\t\30\2\2\u04e1\u04e2\7\u0086\2"+
		"\2\u04e2\u04e3\7\u00c1\2\2\u04e3\u04e5\7i\2\2\u04e4\u04e1\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04ec\3\2\2\2\u04e6\u04e7\7\u0086\2\2\u04e7\u04e8"+
		"\7\u00c1\2\2\u04e8\u04ea\7j\2\2\u04e9\u04e6\3\2\2\2\u04e9\u04ea\3\2\2"+
		"\2\u04ea\u04ec\3\2\2\2\u04eb\u04e4\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ed"+
		"\3\2\2\2\u04ed\u04f1\5\u012a\u0096\2\u04ee\u04f0\5\u009cO\2\u04ef\u04ee"+
		"\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2"+
		"\u009b\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f5\7/\2\2\u04f5\u04f9\5\u012a"+
		"\u0096\2\u04f6\u04f7\7\u00a7\2\2\u04f7\u04f9\5\u012a\u0096\2\u04f8\u04f4"+
		"\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u009d\3\2\2\2\u04fa\u0502\7\t\2\2\u04fb"+
		"\u04fe\7:\2\2\u04fc\u04fd\7\u00cb\2\2\u04fd\u04ff\7\u00e5\2\2\u04fe\u04fc"+
		"\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u0502\7\u00e5\2"+
		"\2\u0501\u04fa\3\2\2\2\u0501\u04fb\3\2\2\2\u0501\u0500\3\2\2\2\u0501\u0502"+
		"\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\7y\2\2\u0504\u0506\5\u0154\u00ab"+
		"\2\u0505\u0507\5\u00b0Y\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u050a\5\u00a0Q\2\u0509\u050b\t\31\2\2\u050a\u0509"+
		"\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u050e\5N(\2\u050d"+
		"\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\5\b"+
		"\5\2\u0510\u009f\3\2\2\2\u0511\u0512\t\32\2\2\u0512\u0514\5\u008eH\2\u0513"+
		"\u0515\5\u0092J\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u00a1"+
		"\3\2\2\2\u0516\u051e\7\t\2\2\u0517\u051a\7:\2\2\u0518\u0519\7\u00cb\2"+
		"\2\u0519\u051b\7\u00e5\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b"+
		"\u051e\3\2\2\2\u051c\u051e\7\u00e5\2\2\u051d\u0516\3\2\2\2\u051d\u0517"+
		"\3\2\2\2\u051d\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f"+
		"\u0520\7\u00d2\2\2\u0520\u0521\5\u0154\u00ab\2\u0521\u0522\t\31\2\2\u0522"+
		"\u0523\5\u00a4S\2\u0523\u0527\7a\2\2\u0524\u0525\5\u0154\u00ab\2\u0525"+
		"\u0526\7\u0171\2\2\u0526\u0528\3\2\2\2\u0527\u0524\3\2\2\2\u0527\u0528"+
		"\3\2\2\2\u0528\u00a3\3\2\2\2\u0529\u052a\5\u00a6T\2\u052a\u0530\7\u0171"+
		"\2\2\u052b\u052c\5\u00a6T\2\u052c\u052d\7\u0171\2\2\u052d\u052f\3\2\2"+
		"\2\u052e\u052b\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531"+
		"\3\2\2\2\u0531\u00a5\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0541\5P)\2\u0534"+
		"\u0535\7y\2\2\u0535\u0537\5\u0154\u00ab\2\u0536\u0538\5\u00b0Y\2\u0537"+
		"\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\5\u00a0"+
		"Q\2\u053a\u0541\3\2\2\2\u053b\u053c\t\33\2\2\u053c\u053e\5\u0154\u00ab"+
		"\2\u053d\u053f\5\u00b0Y\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f"+
		"\u0541\3\2\2\2\u0540\u0533\3\2\2\2\u0540\u0534\3\2\2\2\u0540\u053b\3\2"+
		"\2\2\u0541\u00a7\3\2\2\2\u0542\u054a\7\t\2\2\u0543\u0546\7:\2\2\u0544"+
		"\u0545\7\u00cb\2\2\u0545\u0547\7\u00e5\2\2\u0546\u0544\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u054a\7\u00e5\2\2\u0549\u0542\3\2\2"+
		"\2\u0549\u0543\3\2\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b"+
		"\3\2\2\2\u054b\u054c\7\u00d2\2\2\u054c\u054d\7\33\2\2\u054d\u054e\5\u0154"+
		"\u00ab\2\u054e\u054f\t\31\2\2\u054f\u0550\5\u00aaV\2\u0550\u0554\7a\2"+
		"\2\u0551\u0552\5\u0154\u00ab\2\u0552\u0553\7\u0171\2\2\u0553\u0555\3\2"+
		"\2\2\u0554\u0551\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u00a9\3\2\2\2\u0556"+
		"\u0557\5\u00acW\2\u0557\u055d\7\u0171\2\2\u0558\u0559\5\u00acW\2\u0559"+
		"\u055a\7\u0171\2\2\u055a\u055c\3\2\2\2\u055b\u0558\3\2\2\2\u055c\u055f"+
		"\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u00ab\3\2\2\2\u055f"+
		"\u055d\3\2\2\2\u0560\u0564\5P)\2\u0561\u0564\5\u009eP\2\u0562\u0564\5"+
		"\u00aeX\2\u0563\u0560\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0562\3\2\2\2"+
		"\u0564\u00ad\3\2\2\2\u0565\u056d\7\t\2\2\u0566\u0569\7:\2\2\u0567\u0568"+
		"\7\u00cb\2\2\u0568\u056a\7\u00e5\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3"+
		"\2\2\2\u056a\u056d\3\2\2\2\u056b\u056d\7\u00e5\2\2\u056c\u0565\3\2\2\2"+
		"\u056c\u0566\3\2\2\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e"+
		"\3\2\2\2\u056e\u056f\t\33\2\2\u056f\u0571\5\u0154\u00ab\2\u0570\u0572"+
		"\5\u00b0Y\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2"+
		"\2\u0573\u0575\5\u00b4[\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0577\3\2\2\2\u0576\u0578\t\31\2\2\u0577\u0576\3\2\2\2\u0577\u0578\3"+
		"\2\2\2\u0578\u057a\3\2\2\2\u0579\u057b\5N(\2\u057a\u0579\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u057d\3\2\2\2\u057c\u057e\5\u00d2j\2\u057d\u057c"+
		"\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0583\5\f\7\2\u0580"+
		"\u0581\5\u0154\u00ab\2\u0581\u0582\7\u0171\2\2\u0582\u0584\3\2\2\2\u0583"+
		"\u0580\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u00af\3\2\2\2\u0585\u0586\7\u016c"+
		"\2\2\u0586\u059c\7\u016f\2\2\u0587\u0588\7\u016c\2\2\u0588\u058d\5\u00b2"+
		"Z\2\u0589\u058a\7\u015d\2\2\u058a\u058c\5\u00b2Z\2\u058b\u0589\3\2\2\2"+
		"\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0590"+
		"\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0591\7\u016f\2\2\u0591\u059c\3\2\2"+
		"\2\u0592\u0593\6Y\3\2\u0593\u0598\5\u00b2Z\2\u0594\u0595\7\u015d\2\2\u0595"+
		"\u0597\5\u00b2Z\2\u0596\u0594\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0596"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059b"+
		"\u0585\3\2\2\2\u059b\u0587\3\2\2\2\u059b\u0592\3\2\2\2\u059c\u00b1\3\2"+
		"\2\2\u059d\u05a3\7\u0089\2\2\u059e\u05a3\7\u00cd\2\2\u059f\u05a3\7\u008e"+
		"\2\2\u05a0\u05a1\7\u0089\2\2\u05a1\u05a3\7\u00cd\2\2\u05a2\u059d\3\2\2"+
		"\2\u05a2\u059e\3\2\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\5\u0154\u00ab\2\u05a5\u05a7\5"+
		"\u008eH\2\u05a6\u05a8\5\u0092J\2\u05a7\u05a6\3\2\2\2\u05a7\u05a8\3\2\2"+
		"\2\u05a8\u05ac\3\2\2\2\u05a9\u05ab\5\u0094K\2\u05aa\u05a9\3\2\2\2\u05ab"+
		"\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05b0\3\2"+
		"\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b1\5\u0096L\2\u05b0\u05af\3\2\2\2\u05b0"+
		"\u05b1\3\2\2\2\u05b1\u05c8\3\2\2\2\u05b2\u05b8\5\u0154\u00ab\2\u05b3\u05b9"+
		"\7\u0089\2\2\u05b4\u05b9\7\u00cd\2\2\u05b5\u05b9\7\u008e\2\2\u05b6\u05b7"+
		"\7\u0089\2\2\u05b7\u05b9\7\u00cd\2\2\u05b8\u05b3\3\2\2\2\u05b8\u05b4\3"+
		"\2\2\2\u05b8\u05b5\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u05bc\5\u008eH\2\u05bb\u05bd\5\u0092J\2\u05bc\u05bb"+
		"\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05c1\3\2\2\2\u05be\u05c0\5\u0094K"+
		"\2\u05bf\u05be\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2"+
		"\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c6\5\u0096L"+
		"\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05a2"+
		"\3\2\2\2\u05c7\u05b2\3\2\2\2\u05c8\u00b3\3\2\2\2\u05c9\u05cb\5\u00b6\\"+
		"\2\u05ca\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd"+
		"\3\2\2\2\u05cd\u00b5\3\2\2\2\u05ce\u05cf\7\u00a0\2\2\u05cf\u05da\7\u010b"+
		"\2\2\u05d0\u05d1\7\u010b\2\2\u05d1\u05d2\7\u00fc\2\2\u05d2\u05da\t\34"+
		"\2\2\u05d3\u05d5\7\\\2\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5"+
		"\u05d6\3\2\2\2\u05d6\u05d7\7\u00e8\2\2\u05d7\u05d8\7\u0103\2\2\u05d8\u05da"+
		"\7\u0177\2\2\u05d9\u05ce\3\2\2\2\u05d9\u05d0\3\2\2\2\u05d9\u05d4\3\2\2"+
		"\2\u05da\u00b7\3\2\2\2\u05db\u05df\5\u00ba^\2\u05dc\u05df\5\u00bc_\2\u05dd"+
		"\u05df\5\u00be`\2\u05de\u05db\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05dd"+
		"\3\2\2\2\u05df\u00b9\3\2\2\2\u05e0\u05e1\7\u0086\2\2\u05e1\u05e2\5\u0118"+
		"\u008d\2\u05e2\u05e3\7\u0120\2\2\u05e3\u05e7\5\4\3\2\u05e4\u05e6\5\u00c0"+
		"a\2\u05e5\u05e4\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05ec\5\u00c2"+
		"b\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u05ee\7a\2\2\u05ee\u05ef\7\u0086\2\2\u05ef\u00bb\3\2\2\2\u05f0\u05f1"+
		"\7\u0086\2\2\u05f1\u05f2\5\u0118\u008d\2\u05f2\u05f5\5\b\5\2\u05f3\u05f4"+
		"\7]\2\2\u05f4\u05f6\5\b\5\2\u05f5\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6"+
		"\u00bd\3\2\2\2\u05f7\u05f8\7\4\2\2\u05f8\u05f9\7\u0086\2\2\u05f9\u05fa"+
		"\5\u0118\u008d\2\u05fa\u05fb\7\u0120\2\2\u05fb\u05fc\5\b\5\2\u05fc\u00bf"+
		"\3\2\2\2\u05fd\u05fe\t\35\2\2\u05fe\u05ff\5\u0118\u008d\2\u05ff\u0600"+
		"\7\u0120\2\2\u0600\u0601\5\4\3\2\u0601\u00c1\3\2\2\2\u0602\u0603\7]\2"+
		"\2\u0603\u0604\5\4\3\2\u0604\u00c3\3\2\2\2\u0605\u0607\7:\2\2\u0606\u0608"+
		"\7\u012b\2\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\3\2\2"+
		"\2\u0609\u060a\7\u008b\2\2\u060a\u060b\5\u0154\u00ab\2\u060b\u060c\7\u00c8"+
		"\2\2\u060c\u060d\5\u0108\u0085\2\u060d\u060e\7\u016c\2\2\u060e\u0613\5"+
		"\u00c6d\2\u060f\u0610\7\u015d\2\2\u0610\u0612\5\u00c6d\2\u0611\u060f\3"+
		"\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u0616\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u0617\7\u016f\2\2\u0617\u00c5"+
		"\3\2\2\2\u0618\u061a\5\u0154\u00ab\2\u0619\u061b\t\r\2\2\u061a\u0619\3"+
		"\2\2\2\u061a\u061b\3\2\2\2\u061b\u00c7\3\2\2\2\u061c\u061d\5\u00caf\2"+
		"\u061d\u00c9\3\2\2\2\u061e\u061f\7\u013a\2\2\u061f\u0620\7\u016c\2\2\u0620"+
		"\u0621\5\u0154\u00ab\2\u0621\u0622\7\u0162\2\2\u0622\u062a\5\u0154\u00ab"+
		"\2\u0623\u0624\7\u015d\2\2\u0624\u0625\5\u0154\u00ab\2\u0625\u0626\7\u0162"+
		"\2\2\u0626\u0627\5\u0154\u00ab\2\u0627\u0629\3\2\2\2\u0628\u0623\3\2\2"+
		"\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062d"+
		"\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u0631\7\u016f\2\2\u062e\u0630\5\u008a"+
		"F\2\u062f\u062e\3\2\2\2\u0630\u0633\3\2\2\2\u0631\u062f\3\2\2\2\u0631"+
		"\u0632\3\2\2\2\u0632\u00cb\3\2\2\2\u0633\u0631\3\2\2\2\u0634\u0635\7s"+
		"\2\2\u0635\u0636\t\7\2\2\u0636\u0638\7\u0089\2\2\u0637\u0639\7\u016c\2"+
		"\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c"+
		"\5\u00d4k\2\u063b\u063d\7\u016f\2\2\u063c\u063b\3\2\2\2\u063c\u063d\3"+
		"\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\7\u00ae\2\2\u063f\u0640\5\4\3\2"+
		"\u0640\u0641\7a\2\2\u0641\u0642\7\u00ae\2\2\u0642\u00cd\3\2\2\2\u0643"+
		"\u0644\3\2\2\2\u0644\u00cf\3\2\2\2\u0645\u0646\7s\2\2\u0646\u0649\t\7"+
		"\2\2\u0647\u064a\7\u0089\2\2\u0648\u064a\5\u00ceh\2\u0649\u0647\3\2\2"+
		"\2\u0649\u0648\3\2\2\2\u064a\u064c\3\2\2\2\u064b\u064d\7\u00ec\2\2\u064c"+
		"\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\5\u012a"+
		"\u0096\2\u064f\u0650\7\u0161\2\2\u0650\u0653\5\u012a\u0096\2\u0651\u0652"+
		"\t\36\2\2\u0652\u0654\5\u012a\u0096\2\u0653\u0651\3\2\2\2\u0653\u0654"+
		"\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\7\u00ae\2\2\u0656\u0657\5\4\3"+
		"\2\u0657\u0658\7a\2\2\u0658\u0659\7\u00ae\2\2\u0659\u00d1\3\2\2\2\u065a"+
		"\u0661\7\u017d\2\2\u065b\u065c\7\u0168\2\2\u065c\u065d\7\u0168\2\2\u065d"+
		"\u065e\t\7\2\2\u065e\u065f\7\u0166\2\2\u065f\u0661\7\u0166\2\2\u0660\u065a"+
		"\3\2\2\2\u0660\u065b\3\2\2\2\u0661\u00d3\3\2\2\2\u0662\u0664\5\u00d6l"+
		"\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666"+
		"\5\u00dco\2\u0666\u00d5\3\2\2\2\u0667\u0668\7\u013a\2\2\u0668\u066d\5"+
		"\u00d8m\2\u0669\u066a\7\u015d\2\2\u066a\u066c\5\u00d8m\2\u066b\u0669\3"+
		"\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e"+
		"\u00d7\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0672\5\u0154\u00ab\2\u0671\u0673"+
		"\5\u00dan\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2\2"+
		"\2\u0674\u0675\7\r\2\2\u0675\u0676\7\u016c\2\2\u0676\u0677\5\u00dco\2"+
		"\u0677\u0678\7\u016f\2\2\u0678\u00d9\3\2\2\2\u0679\u067a\7\u016c\2\2\u067a"+
		"\u067f\5\u0154\u00ab\2\u067b\u067c\7\u015d\2\2\u067c\u067e\5\u0154\u00ab"+
		"\2\u067d\u067b\3\2\2\2\u067e\u0681\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u0680"+
		"\3\2\2\2\u0680\u0682\3\2\2\2\u0681\u067f\3\2\2\2\u0682\u0683\7\u016f\2"+
		"\2\u0683\u00db\3\2\2\2\u0684\u068a\5\u00e0q\2\u0685\u0686\5\u00e2r\2\u0686"+
		"\u0687\5\u00e0q\2\u0687\u0689\3\2\2\2\u0688\u0685\3\2\2\2\u0689\u068c"+
		"\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u00dd\3\2\2\2\u068c"+
		"\u068a\3\2\2\2\u068d\u068f\7\u0171\2\2\u068e\u068d\3\2\2\2\u068f\u0690"+
		"\3\2\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u00df\3\2\2\2\u0692"+
		"\u0698\5\u00e4s\2\u0693\u0694\7\u016c\2\2\u0694\u0695\5\u00dco\2\u0695"+
		"\u0696\7\u016f\2\2\u0696\u0698\3\2\2\2\u0697\u0692\3\2\2\2\u0697\u0693"+
		"\3\2\2\2\u0698\u069a\3\2\2\2\u0699\u069b\5\u00dep\2\u069a\u0699\3\2\2"+
		"\2\u069a\u069b\3\2\2\2\u069b\u00e1\3\2\2\2\u069c\u069e\7\u012a\2\2\u069d"+
		"\u069f\7\7\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a9\3\2"+
		"\2\2\u06a0\u06a2\7d\2\2\u06a1\u06a3\7\7\2\2\u06a2\u06a1\3\2\2\2\u06a2"+
		"\u06a3\3\2\2\2\u06a3\u06a9\3\2\2\2\u06a4\u06a6\7\u0095\2\2\u06a5\u06a7"+
		"\7\7\2\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a9\3\2\2\2\u06a8"+
		"\u069c\3\2\2\2\u06a8\u06a0\3\2\2\2\u06a8\u06a4\3\2\2\2\u06a9\u00e3\3\2"+
		"\2\2\u06aa\u06ab\t\37\2\2\u06ab\u06ad\5\u00e6t\2\u06ac\u06ae\5\u00f4{"+
		"\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1"+
		"\5\u00f6|\2\u06b0\u06b2\5\u010a\u0086\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2"+
		"\3\2\2\2\u06b2\u06b4\3\2\2\2\u06b3\u06b5\5\u010c\u0087\2\u06b4\u06b3\3"+
		"\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6\u06b9\5\u010e\u0088"+
		"\2\u06b7\u06b9\5\u0110\u0089\2\u06b8\u06b6\3\2\2\2\u06b8\u06b7\3\2\2\2"+
		"\u06b8\u06b9\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06bc\5\u0112\u008a\2\u06bb"+
		"\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bf\5\u0114"+
		"\u008b\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u00e5\3\2\2\2\u06c0"+
		"\u06c2\5\u00e8u\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c4"+
		"\3\2\2\2\u06c3\u06c5\5\u00eav\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2"+
		"\2\u06c5\u06c6\3\2\2\2\u06c6\u06cb\5\u00ecw\2\u06c7\u06c8\7\u015d\2\2"+
		"\u06c8\u06ca\5\u00ecw\2\u06c9\u06c7\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb"+
		"\u06c9\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u00e7\3\2\2\2\u06cd\u06cb\3\2"+
		"\2\2\u06ce\u06cf\t \2\2\u06cf\u00e9\3\2\2\2\u06d0\u06d1\7\u0125\2\2\u06d1"+
		"\u06d2\5\u012a\u0096\2\u06d2\u00eb\3\2\2\2\u06d3\u06d4\5\u0154\u00ab\2"+
		"\u06d4\u06d5\7\u0162\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06d3\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06da\5\u012a\u0096\2\u06d9\u06db"+
		"\5\u00eex\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06de\3\2\2"+
		"\2\u06dc\u06de\5\u00f2z\2\u06dd\u06d6\3\2\2\2\u06dd\u06dc\3\2\2\2\u06de"+
		"\u00ed\3\2\2\2\u06df\u06e1\6x\4\2\u06e0\u06e2\7\r\2\2\u06e1\u06e0\3\2"+
		"\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e9\5\u0154\u00ab"+
		"\2\u06e4\u06e5\7\u016c\2\2\u06e5\u06e6\7\u0123\2\2\u06e6\u06e7\7\u0175"+
		"\2\2\u06e7\u06e9\7\u016f\2\2\u06e8\u06df\3\2\2\2\u06e8\u06e4\3\2\2\2\u06e9"+
		"\u00ef\3\2\2\2\u06ea\u06eb\t!\2\2\u06eb\u00f1\3\2\2\2\u06ec\u06ed\t\7"+
		"\2\2\u06ed\u06ef\7\4\2\2\u06ee\u06ec\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef"+
		"\u06f0\3\2\2\2\u06f0\u06f3\7\u016a\2\2\u06f1\u06f3\5\u00f0y\2\u06f2\u06ee"+
		"\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u00f3\3\2\2\2\u06f4\u06f5\7\u0097\2"+
		"\2\u06f5\u06fa\5\u0154\u00ab\2\u06f6\u06f7\7\u015d\2\2\u06f7\u06f9\5\u0154"+
		"\u00ab\2\u06f8\u06f6\3\2\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa"+
		"\u06fb\3\2\2\2\u06fb\u00f5\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd\u06fe\7w"+
		"\2\2\u06fe\u0702\5\u00f8}\2\u06ff\u0701\5\u00fe\u0080\2\u0700\u06ff\3"+
		"\2\2\2\u0701\u0704\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703"+
		"\u00f7\3\2\2\2\u0704\u0702\3\2\2\2\u0705\u0709\5\u00fa~\2\u0706\u0709"+
		"\5\u00fc\177\2\u0707\u0709\5\u0102\u0082\2\u0708\u0705\3\2\2\2\u0708\u0706"+
		"\3\2\2\2\u0708\u0707\3\2\2\2\u0709\u00f9\3\2\2\2\u070a\u070c\5\u0108\u0085"+
		"\2\u070b\u070d\5\u0106\u0084\2\u070c\u070b\3\2\2\2\u070c\u070d\3\2\2\2"+
		"\u070d\u00fb\3\2\2\2\u070e\u070f\7\u016c\2\2\u070f\u0710\5\u00d4k\2\u0710"+
		"\u0712\7\u016f\2\2\u0711\u0713\5\u0106\u0084\2\u0712\u0711\3\2\2\2\u0712"+
		"\u0713\3\2\2\2\u0713\u00fd\3\2\2\2\u0714\u0715\7\u015d\2\2\u0715\u071c"+
		"\5\u00f8}\2\u0716\u0717\5\u0100\u0081\2\u0717\u0718\5\u00f8}\2\u0718\u0719"+
		"\7\u00c8\2\2\u0719\u071a\5\u0118\u008d\2\u071a\u071c\3\2\2\2\u071b\u0714"+
		"\3\2\2\2\u071b\u0716\3\2\2\2\u071c\u00ff\3\2\2\2\u071d\u071f\7\u008d\2"+
		"\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0727"+
		"\7\u009c\2\2\u0721\u0723\t\"\2\2\u0722\u0724\7\u00ce\2\2\u0723\u0722\3"+
		"\2\2\2\u0723\u0724\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0727\7\u009c\2\2"+
		"\u0726\u071e\3\2\2\2\u0726\u0721\3\2\2\2\u0727\u0101\3\2\2\2\u0728\u0729"+
		"\7\u011b\2\2\u0729\u072a\7\u016c\2\2\u072a\u072b\7\u0131\2\2\u072b\u0730"+
		"\5\u0104\u0083\2\u072c\u072d\7\u015d\2\2\u072d\u072f\5\u0104\u0083\2\u072e"+
		"\u072c\3\2\2\2\u072f\u0732\3\2\2\2\u0730\u072e\3\2\2\2\u0730\u0731\3\2"+
		"\2\2\u0731\u0733\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u0735\7\u016f\2\2\u0734"+
		"\u0736\5\u0106\u0084\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0103"+
		"\3\2\2\2\u0737\u0744\5\u012a\u0096\2\u0738\u0739\7\u016c\2\2\u0739\u073e"+
		"\5\u012a\u0096\2\u073a\u073b\7\u015d\2\2\u073b\u073d\5\u012a\u0096\2\u073c"+
		"\u073a\3\2\2\2\u073d\u0740\3\2\2\2\u073e\u073c\3\2\2\2\u073e\u073f\3\2"+
		"\2\2\u073f\u0741\3\2\2\2\u0740\u073e\3\2\2\2\u0741\u0742\7\u016f\2\2\u0742"+
		"\u0744\3\2\2\2\u0743\u0737\3\2\2\2\u0743\u0738\3\2\2\2\u0744\u0105\3\2"+
		"\2\2\u0745\u0747\6\u0084\5\2\u0746\u0748\7\r\2\2\u0747\u0746\3\2\2\2\u0747"+
		"\u0748\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u0754\5\u0154\u00ab\2\u074a\u074b"+
		"\7\u016c\2\2\u074b\u0750\t\7\2\2\u074c\u074d\7\u015d\2\2\u074d\u074f\t"+
		"\7\2\2\u074e\u074c\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u0753\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0755\7\u016f"+
		"\2\2\u0754\u074a\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0107\3\2\2\2\u0756"+
		"\u0757\5\u0154\u00ab\2\u0757\u0109\3\2\2\2\u0758\u0759\7\u0138\2\2\u0759"+
		"\u075a\5\u0118\u008d\2\u075a\u010b\3\2\2\2\u075b\u075c\7~\2\2\u075c\u075d"+
		"\7\35\2\2\u075d\u0762\5\u012a\u0096\2\u075e\u075f\7\u015d\2\2\u075f\u0761"+
		"\5\u012a\u0096\2\u0760\u075e\3\2\2\2\u0761\u0764\3\2\2\2\u0762\u0760\3"+
		"\2\2\2\u0762\u0763\3\2\2\2\u0763\u010d\3\2\2\2\u0764\u0762\3\2\2\2\u0765"+
		"\u0766\7\u0081\2\2\u0766\u0767\5\u0118\u008d\2\u0767\u010f\3\2\2\2\u0768"+
		"\u0769\7\u00dd\2\2\u0769\u076a\5\u0118\u008d\2\u076a\u0111\3\2\2\2\u076b"+
		"\u076c\7\u00cc\2\2\u076c\u076d\7\35\2\2\u076d\u076f\5\u012a\u0096\2\u076e"+
		"\u0770\t\r\2\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0778\3\2"+
		"\2\2\u0771\u0772\7\u015d\2\2\u0772\u0774\5\u012a\u0096\2\u0773\u0775\t"+
		"\r\2\2\u0774\u0773\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0777\3\2\2\2\u0776"+
		"\u0771\3\2\2\2\u0777\u077a\3\2\2\2\u0778\u0776\3\2\2\2\u0778\u0779\3\2"+
		"\2\2\u0779\u0113\3\2\2\2\u077a\u0778\3\2\2\2\u077b\u077d\5\u0116\u008c"+
		"\2\u077c\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f"+
		"\3\2\2\2\u077f\u0115\3\2\2\2\u0780\u0781\7\u00a4\2\2\u0781\u078c\5\u012a"+
		"\u0096\2\u0782\u0783\7\u013a\2\2\u0783\u0789\t#\2\2\u0784\u0785\7\u012e"+
		"\2\2\u0785\u0786\7\n\2\2\u0786\u0787\7\u009d\2\2\u0787\u0788\t$\2\2\u0788"+
		"\u078a\7\u00aa\2\2\u0789\u0784\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078c"+
		"\3\2\2\2\u078b\u0780\3\2\2\2\u078b\u0782\3\2\2\2\u078c\u0117\3\2\2\2\u078d"+
		"\u078f\b\u008d\1\2\u078e\u0790\7\u00c1\2\2\u078f\u078e\3\2\2\2\u078f\u0790"+
		"\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0792\7\u016c\2\2\u0792\u0793\5\u0118"+
		"\u008d\2\u0793\u0794\7\u016f\2\2\u0794\u0797\3\2\2\2\u0795\u0797\5\u011a"+
		"\u008e\2\u0796\u078d\3\2\2\2\u0796\u0795\3\2\2\2\u0797\u079e\3\2\2\2\u0798"+
		"\u0799\f\4\2\2\u0799\u079a\5\u0124\u0093\2\u079a\u079b\5\u0118\u008d\5"+
		"\u079b\u079d\3\2\2\2\u079c\u0798\3\2\2\2\u079d\u07a0\3\2\2\2\u079e\u079c"+
		"\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u0119\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1"+
		"\u07a5\5\u011c\u008f\2\u07a2\u07a5\5\u0122\u0092\2\u07a3\u07a5\5\u012a"+
		"\u0096\2\u07a4\u07a1\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a4\u07a3\3\2\2\2\u07a5"+
		"\u011b\3\2\2\2\u07a6\u07a7\5\u012a\u0096\2\u07a7\u07a9\7\u0099\2\2\u07a8"+
		"\u07aa\7\u00c1\2\2\u07a9\u07a8\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab"+
		"\3\2\2\2\u07ab\u07ac\7\u00c3\2\2\u07ac\u07be\3\2\2\2\u07ad\u07ae\5\u012a"+
		"\u0096\2\u07ae\u07af\7\25\2\2\u07af\u07b0\5\u012a\u0096\2\u07b0\u07b1"+
		"\7\n\2\2\u07b1\u07b2\5\u012a\u0096\2\u07b2\u07be\3\2\2\2\u07b3\u07b5\7"+
		"\u00c1\2\2\u07b4\u07b3\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\3\2\2\2"+
		"\u07b6\u07b7\7i\2\2\u07b7\u07b8\7\u016c\2\2\u07b8\u07b9\5\u00d4k\2\u07b9"+
		"\u07ba\7\u016f\2\2\u07ba\u07be\3\2\2\2\u07bb\u07be\5\u011e\u0090\2\u07bc"+
		"\u07be\5\u0120\u0091\2\u07bd\u07a6\3\2\2\2\u07bd\u07ad\3\2\2\2\u07bd\u07b4"+
		"\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07bc\3\2\2\2\u07be\u011d\3\2\2\2\u07bf"+
		"\u07c1\5\u012a\u0096\2\u07c0\u07c2\7\u00c1\2\2\u07c1\u07c0\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\7\u0089\2\2\u07c4\u07ce"+
		"\7\u016c\2\2\u07c5\u07ca\5\u012a\u0096\2\u07c6\u07c7\7\u015d\2\2\u07c7"+
		"\u07c9\5\u012a\u0096\2\u07c8\u07c6\3\2\2\2\u07c9\u07cc\3\2\2\2\u07ca\u07c8"+
		"\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cf\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cd"+
		"\u07cf\5\u00d4k\2\u07ce\u07c5\3\2\2\2\u07ce\u07cd\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u07d1\7\u016f\2\2\u07d1\u011f\3\2\2\2\u07d2\u07d3\7\u016c"+
		"\2\2\u07d3\u07d8\5\u012a\u0096\2\u07d4\u07d5\7\u015d\2\2\u07d5\u07d7\5"+
		"\u012a\u0096\2\u07d6\u07d4\3\2\2\2\u07d7\u07da\3\2\2\2\u07d8\u07d6\3\2"+
		"\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07db\3\2\2\2\u07da\u07d8\3\2\2\2\u07db"+
		"\u07dd\7\u016f\2\2\u07dc\u07de\7\u00c1\2\2\u07dd\u07dc\3\2\2\2\u07dd\u07de"+
		"\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\7\u0089\2\2\u07e0\u07e1\7\u016c"+
		"\2\2\u07e1\u07e2\5\u00d4k\2\u07e2\u07e3\7\u016f\2\2\u07e3\u0121\3\2\2"+
		"\2\u07e4\u07e5\5\u012a\u0096\2\u07e5\u07e6\5\u0126\u0094\2\u07e6\u07e7"+
		"\5\u012a\u0096\2\u07e7\u0123\3\2\2\2\u07e8\u07e9\t%\2\2\u07e9\u0125\3"+
		"\2\2\2\u07ea\u07f7\7\u0162\2\2\u07eb\u07f7\7\u0163\2\2\u07ec\u07f7\7\u0164"+
		"\2\2\u07ed\u07f7\7\u0165\2\2\u07ee\u07f7\7\u0168\2\2\u07ef\u07f7\7\u0169"+
		"\2\2\u07f0\u07f7\7\u0166\2\2\u07f1\u07f7\7\u0167\2\2\u07f2\u07f4\7\u00c1"+
		"\2\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u07f7\t&\2\2\u07f6\u07ea\3\2\2\2\u07f6\u07eb\3\2\2\2\u07f6\u07ec\3\2"+
		"\2\2\u07f6\u07ed\3\2\2\2\u07f6\u07ee\3\2\2\2\u07f6\u07ef\3\2\2\2\u07f6"+
		"\u07f0\3\2\2\2\u07f6\u07f1\3\2\2\2\u07f6\u07f3\3\2\2\2\u07f7\u0127\3\2"+
		"\2\2\u07f8\u07f9\t\'\2\2\u07f9\u0129\3\2\2\2\u07fa\u07fb\b\u0096\1\2\u07fb"+
		"\u07fc\7\u016c\2\2\u07fc\u07fd\5\u00d4k\2\u07fd\u07fe\7\u016f\2\2\u07fe"+
		"\u080c\3\2\2\2\u07ff\u0800\7\u016c\2\2\u0800\u0801\5\u012a\u0096\2\u0801"+
		"\u0802\7\u016f\2\2\u0802\u080c\3\2\2\2\u0803\u080c\5\u0130\u0099\2\u0804"+
		"\u080c\5\u0134\u009b\2\u0805\u080c\5\u0138\u009d\2\u0806\u080c\5\u013e"+
		"\u00a0\2\u0807\u080c\5\u0140\u00a1\2\u0808\u080c\5\u0148\u00a5\2\u0809"+
		"\u080c\5\u014a\u00a6\2\u080a\u080c\5\u012e\u0098\2\u080b\u07fa\3\2\2\2"+
		"\u080b\u07ff\3\2\2\2\u080b\u0803\3\2\2\2\u080b\u0804\3\2\2\2\u080b\u0805"+
		"\3\2\2\2\u080b\u0806\3\2\2\2\u080b\u0807\3\2\2\2\u080b\u0808\3\2\2\2\u080b"+
		"\u0809\3\2\2\2\u080b\u080a\3\2\2\2\u080c\u0835\3\2\2\2\u080d\u080e\f\21"+
		"\2\2\u080e\u0834\5\u0132\u009a\2\u080f\u0810\f\20\2\2\u0810\u0815\7\u016a"+
		"\2\2\u0811\u0814\5\u012a\u0096\2\u0812\u0814\5\u0128\u0095\2\u0813\u0811"+
		"\3\2\2\2\u0813\u0812\3\2\2\2\u0814\u0817\3\2\2\2\u0815\u0813\3\2\2\2\u0815"+
		"\u0816\3\2\2\2\u0816\u0834\3\2\2\2\u0817\u0815\3\2\2\2\u0818\u0819\f\17"+
		"\2\2\u0819\u081e\7\u0160\2\2\u081a\u081d\5\u012a\u0096\2\u081b\u081d\5"+
		"\u0128\u0095\2\u081c\u081a\3\2\2\2\u081c\u081b\3\2\2\2\u081d\u0820\3\2"+
		"\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0834\3\2\2\2\u0820"+
		"\u081e\3\2\2\2\u0821\u0822\f\16\2\2\u0822\u0827\7\u015b\2\2\u0823\u0826"+
		"\5\u012a\u0096\2\u0824\u0826\5\u0128\u0095\2\u0825\u0823\3\2\2\2\u0825"+
		"\u0824\3\2\2\2\u0826\u0829\3\2\2\2\u0827\u0825\3\2\2\2\u0827\u0828\3\2"+
		"\2\2\u0828\u0834\3\2\2\2\u0829\u0827\3\2\2\2\u082a\u082b\f\r\2\2\u082b"+
		"\u0830\7\u0172\2\2\u082c\u082f\5\u012a\u0096\2\u082d\u082f\5\u0128\u0095"+
		"\2\u082e\u082c\3\2\2\2\u082e\u082d\3\2\2\2\u082f\u0832\3\2\2\2\u0830\u082e"+
		"\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0834\3\2\2\2\u0832\u0830\3\2\2\2\u0833"+
		"\u080d\3\2\2\2\u0833\u080f\3\2\2\2\u0833\u0818\3\2\2\2\u0833\u0821\3\2"+
		"\2\2\u0833\u082a\3\2\2\2\u0834\u0837\3\2\2\2\u0835\u0833\3\2\2\2\u0835"+
		"\u0836\3\2\2\2\u0836\u012b\3\2\2\2\u0837\u0835\3\2\2\2\u0838\u0839\5\u0158"+
		"\u00ad\2\u0839\u083a\7\u015d\2\2\u083a\u083b\5\u0158\u00ad\2\u083b\u012d"+
		"\3\2\2\2\u083c\u0845\5\u0150\u00a9\2\u083d\u0845\5\u0152\u00aa\2\u083e"+
		"\u0845\5\u015c\u00af\2\u083f\u0845\5\u0154\u00ab\2\u0840\u0845\5\u0156"+
		"\u00ac\2\u0841\u0845\5\u015a\u00ae\2\u0842\u0845\5\u0158\u00ad\2\u0843"+
		"\u0845\5\u015e\u00b0\2\u0844\u083c\3\2\2\2\u0844\u083d\3\2\2\2\u0844\u083e"+
		"\3\2\2\2\u0844\u083f\3\2\2\2\u0844\u0840\3\2\2\2\u0844\u0841\3\2\2\2\u0844"+
		"\u0842\3\2\2\2\u0844\u0843\3\2\2\2\u0845\u012f\3\2\2\2\u0846\u0847\7\u0096"+
		"\2\2\u0847\u0848\5\u012a\u0096\2\u0848\u0849\5\u0132\u009a\2\u0849\u0131"+
		"\3\2\2\2\u084a\u084b\t(\2\2\u084b\u0133\3\2\2\2\u084c\u084d\5\u0136\u009c"+
		"\2\u084d\u084e\t)\2\2\u084e\u0853\5\u0136\u009c\2\u084f\u0850\t)\2\2\u0850"+
		"\u0852\5\u0136\u009c\2\u0851\u084f\3\2\2\2\u0852\u0855\3\2\2\2\u0853\u0851"+
		"\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0135\3\2\2\2\u0855\u0853\3\2\2\2\u0856"+
		"\u0857\7\u016c\2\2\u0857\u0858\5\u012a\u0096\2\u0858\u0859\7\u016f\2\2"+
		"\u0859\u0860\3\2\2\2\u085a\u0860\5\u0138\u009d\2\u085b\u0860\5\u0140\u00a1"+
		"\2\u085c\u0860\5\u0148\u00a5\2\u085d\u0860\5\u014a\u00a6\2\u085e\u0860"+
		"\5\u012e\u0098\2\u085f\u0856\3\2\2\2\u085f\u085a\3\2\2\2\u085f\u085b\3"+
		"\2\2\2\u085f\u085c\3\2\2\2\u085f\u085d\3\2\2\2\u085f\u085e\3\2\2\2\u0860"+
		"\u0137\3\2\2\2\u0861\u0864\5\u013a\u009e\2\u0862\u0864\5\u013c\u009f\2"+
		"\u0863\u0861\3\2\2\2\u0863\u0862\3\2\2\2\u0864\u0139\3\2\2\2\u0865\u0866"+
		"\7\"\2\2\u0866\u086c\5\u012a\u0096\2\u0867\u0868\7\u0137\2\2\u0868\u0869"+
		"\5\u012a\u0096\2\u0869\u086a\7\u0120\2\2\u086a\u086b\5\u012a\u0096\2\u086b"+
		"\u086d\3\2\2\2\u086c\u0867\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u086c\3\2"+
		"\2\2\u086e\u086f\3\2\2\2\u086f\u0872\3\2\2\2\u0870\u0871\7]\2\2\u0871"+
		"\u0873\5\u012a\u0096\2\u0872\u0870\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874"+
		"\3\2\2\2\u0874\u0875\7a\2\2\u0875\u013b\3\2\2\2\u0876\u087c\7\"\2\2\u0877"+
		"\u0878\7\u0137\2\2\u0878\u0879\5\u0118\u008d\2\u0879\u087a\7\u0120\2\2"+
		"\u087a\u087b\5\u012a\u0096\2\u087b\u087d\3\2\2\2\u087c\u0877\3\2\2\2\u087d"+
		"\u087e\3\2\2\2\u087e\u087c\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0882\3\2"+
		"\2\2\u0880\u0881\7]\2\2\u0881\u0883\5\u012a\u0096\2\u0882\u0880\3\2\2"+
		"\2\u0882\u0883\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\7a\2\2\u0885\u013d"+
		"\3\2\2\2\u0886\u0887\5\u0154\u00ab\2\u0887\u0888\7\3\2\2\u0888\u0889\t"+
		"*\2\2\u0889\u013f\3\2\2\2\u088a\u088b\7\22\2\2\u088b\u088d\7\u016c\2\2"+
		"\u088c\u088e\5\u0142\u00a2\2\u088d\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e"+
		"\u088f\3\2\2\2\u088f\u0890\5\u012a\u0096\2\u0890\u0892\7\u016f\2\2\u0891"+
		"\u0893\5\u0144\u00a3\2\u0892\u0891\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0923"+
		"\3\2\2\2\u0894\u0895\78\2\2\u0895\u089b\7\u016c\2\2\u0896\u0898\5\u0142"+
		"\u00a2\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u0899\3\2\2\2\u0899"+
		"\u089c\5\u012a\u0096\2\u089a\u089c\7\u016a\2\2\u089b\u0897\3\2\2\2\u089b"+
		"\u089a\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089f\7\u016f\2\2\u089e\u08a0"+
		"\5\u0144\u00a3\2\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u0923\3"+
		"\2\2\2\u08a1\u08a2\79\2\2\u08a2\u08a8\7\u016c\2\2\u08a3\u08a5\5\u0142"+
		"\u00a2\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6"+
		"\u08a9\5\u012a\u0096\2\u08a7\u08a9\7\u016a\2\2\u08a8\u08a4\3\2\2\2\u08a8"+
		"\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ac\7\u016f\2\2\u08ab\u08ad"+
		"\5\u0144\u00a3\2\u08ac\u08ab\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u0923\3"+
		"\2\2\2\u08ae\u08af\7\u0141\2\2\u08af\u08b0\7\u016c\2\2\u08b0\u08b1\7\u016f"+
		"\2\2\u08b1\u0923\5\u0144\u00a3\2\u08b2\u08b3\7\u0145\2\2\u08b3\u08b4\7"+
		"\u016c\2\2\u08b4\u08b5\7\u016f\2\2\u08b5\u0923\5\u0144\u00a3\2\u08b6\u08b7"+
		"\7\u0146\2\2\u08b7\u08b8\7\u016c\2\2\u08b8\u08b9\5\u012a\u0096\2\u08b9"+
		"\u08ba\7\u016f\2\2\u08ba\u08bb\5\u0144\u00a3\2\u08bb\u0923\3\2\2\2\u08bc"+
		"\u08bd\7\u0147\2\2\u08bd\u08be\7\u016c\2\2\u08be\u08c5\5\u012a\u0096\2"+
		"\u08bf\u08c0\7\u015d\2\2\u08c0\u08c3\5\u012a\u0096\2\u08c1\u08c2\7\u015d"+
		"\2\2\u08c2\u08c4\5\u012a\u0096\2\u08c3\u08c1\3\2\2\2\u08c3\u08c4\3\2\2"+
		"\2\u08c4\u08c6\3\2\2\2\u08c5\u08bf\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7"+
		"\3\2\2\2\u08c7\u08c8\7\u016f\2\2\u08c8\u08c9\5\u0144\u00a3\2\u08c9\u0923"+
		"\3\2\2\2\u08ca\u08cb\7\u0148\2\2\u08cb\u08cc\7\u016c\2\2\u08cc\u08cd\5"+
		"\u012a\u0096\2\u08cd\u08ce\7\u016f\2\2\u08ce\u08cf\5\u0144\u00a3\2\u08cf"+
		"\u0923\3\2\2\2\u08d0\u08d1\7\u0149\2\2\u08d1\u08d2\7\u016c\2\2\u08d2\u08d9"+
		"\5\u012a\u0096\2\u08d3\u08d4\7\u015d\2\2\u08d4\u08d7\5\u012a\u0096\2\u08d5"+
		"\u08d6\7\u015d\2\2\u08d6\u08d8\5\u012a\u0096\2\u08d7\u08d5\3\2\2\2\u08d7"+
		"\u08d8\3\2\2\2\u08d8\u08da\3\2\2\2\u08d9\u08d3\3\2\2\2\u08d9\u08da\3\2"+
		"\2\2\u08da\u08db\3\2\2\2\u08db\u08dc\7\u016f\2\2\u08dc\u08dd\5\u0144\u00a3"+
		"\2\u08dd\u0923\3\2\2\2\u08de\u08df\7\u00b1\2\2\u08df\u08e1\7\u016c\2\2"+
		"\u08e0\u08e2\5\u0142\u00a2\2\u08e1\u08e0\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2"+
		"\u08e3\3\2\2\2\u08e3\u08e4\5\u012a\u0096\2\u08e4\u08e6\7\u016f\2\2\u08e5"+
		"\u08e7\5\u0144\u00a3\2\u08e6\u08e5\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u0923"+
		"\3\2\2\2\u08e8\u08e9\7\u00b7\2\2\u08e9\u08eb\7\u016c\2\2\u08ea\u08ec\5"+
		"\u0142\u00a2\2\u08eb\u08ea\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed\3\2"+
		"\2\2\u08ed\u08ee\5\u012a\u0096\2\u08ee\u08f0\7\u016f\2\2\u08ef\u08f1\5"+
		"\u0144\u00a3\2\u08f0\u08ef\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u0923\3\2"+
		"\2\2\u08f2\u08f3\7\u0152\2\2\u08f3\u08f4\7\u016c\2\2\u08f4\u08f5\7\u016f"+
		"\2\2\u08f5\u0923\5\u0144\u00a3\2\u08f6\u08f7\7\u0153\2\2\u08f7\u08f8\7"+
		"\u016c\2\2\u08f8\u08f9\7\u016f\2\2\u08f9\u0923\5\u0144\u00a3\2\u08fa\u08fb"+
		"\7\u0154\2\2\u08fb\u08fd\7\u016c\2\2\u08fc\u08fe\5\u0142\u00a2\2\u08fd"+
		"\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0900\5\u012a"+
		"\u0096\2\u0900\u0902\7\u016f\2\2\u0901\u0903\5\u0144\u00a3\2\u0902\u0901"+
		"\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0923\3\2\2\2\u0904\u0905\7\u0118\2"+
		"\2\u0905\u0907\7\u016c\2\2\u0906\u0908\5\u0142\u00a2\2\u0907\u0906\3\2"+
		"\2\2\u0907\u0908\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\5\u012a\u0096"+
		"\2\u090a\u090c\7\u016f\2\2\u090b\u090d\5\u0144\u00a3\2\u090c\u090b\3\2"+
		"\2\2\u090c\u090d\3\2\2\2\u090d\u0923\3\2\2\2\u090e\u090f\7\u0132\2\2\u090f"+
		"\u0911\7\u016c\2\2\u0910\u0912\5\u0142\u00a2\2\u0911\u0910\3\2\2\2\u0911"+
		"\u0912\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\5\u012a\u0096\2\u0914\u0916"+
		"\7\u016f\2\2\u0915\u0917\5\u0144\u00a3\2\u0916\u0915\3\2\2\2\u0916\u0917"+
		"\3\2\2\2\u0917\u0923\3\2\2\2\u0918\u0919\7\u0156\2\2\u0919\u091b\7\u016c"+
		"\2\2\u091a\u091c\5\u0142\u00a2\2\u091b\u091a\3\2\2\2\u091b\u091c\3\2\2"+
		"\2\u091c\u091d\3\2\2\2\u091d\u091e\5\u012a\u0096\2\u091e\u0920\7\u016f"+
		"\2\2\u091f\u0921\5\u0144\u00a3\2\u0920\u091f\3\2\2\2\u0920\u0921\3\2\2"+
		"\2\u0921\u0923\3\2\2\2\u0922\u088a\3\2\2\2\u0922\u0894\3\2\2\2\u0922";
	private static final String _serializedATNSegment1 =
		"\u08a1\3\2\2\2\u0922\u08ae\3\2\2\2\u0922\u08b2\3\2\2\2\u0922\u08b6\3\2"+
		"\2\2\u0922\u08bc\3\2\2\2\u0922\u08ca\3\2\2\2\u0922\u08d0\3\2\2\2\u0922"+
		"\u08de\3\2\2\2\u0922\u08e8\3\2\2\2\u0922\u08f2\3\2\2\2\u0922\u08f6\3\2"+
		"\2\2\u0922\u08fa\3\2\2\2\u0922\u0904\3\2\2\2\u0922\u090e\3\2\2\2\u0922"+
		"\u0918\3\2\2\2\u0923\u0141\3\2\2\2\u0924\u0925\t \2\2\u0925\u0143\3\2"+
		"\2\2\u0926\u0927\7\u00cf\2\2\u0927\u0929\7\u016c\2\2\u0928\u092a\5\u0146"+
		"\u00a4\2\u0929\u0928\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092c\3\2\2\2\u092b"+
		"\u092d\5\u0112\u008a\2\u092c\u092b\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e"+
		"\3\2\2\2\u092e\u092f\7\u016f\2\2\u092f\u0145\3\2\2\2\u0930\u0931\7\u00d3"+
		"\2\2\u0931\u0932\7\35\2\2\u0932\u0937\5\u012a\u0096\2\u0933\u0934\7\u015d"+
		"\2\2\u0934\u0936\5\u012a\u0096\2\u0935\u0933\3\2\2\2\u0936\u0939\3\2\2"+
		"\2\u0937\u0935\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0147\3\2\2\2\u0939\u0937"+
		"\3\2\2\2\u093a\u0a03\7\u0140\2\2\u093b\u093c\7$\2\2\u093c\u093d\7\u016c"+
		"\2\2\u093d\u093e\5\u012a\u0096\2\u093e\u093f\7\r\2\2\u093f\u0941\5\u008e"+
		"H\2\u0940\u0942\5\u0092J\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942"+
		"\u0943\3\2\2\2\u0943\u0944\7\u016f\2\2\u0944\u0a03\3\2\2\2\u0945\u0946"+
		"\78\2\2\u0946\u0949\7\u016c\2\2\u0947\u094a\5\u012a\u0096\2\u0948\u094a"+
		"\7\u016a\2\2\u0949\u0947\3\2\2\2\u0949\u0948\3\2\2\2\u094a\u094b\3\2\2"+
		"\2\u094b\u0a03\7\u016f\2\2\u094c\u0a03\7\u0142\2\2\u094d\u094e\7>\2\2"+
		"\u094e\u0a03\7C\2\2\u094f\u0953\7\u0143\2\2\u0950\u0951\7>\2\2\u0951\u0953"+
		"\7\u0121\2\2\u0952\u094f\3\2\2\2\u0952\u0950\3\2\2\2\u0953\u0958\3\2\2"+
		"\2\u0954\u0955\7\u016c\2\2\u0955\u0956\5\u012a\u0096\2\u0956\u0957\7\u016f"+
		"\2\2\u0957\u0959\3\2\2\2\u0958\u0954\3\2\2\2\u0958\u0959\3\2\2\2\u0959"+
		"\u0a03\3\2\2\2\u095a\u0a03\7\u0144\2\2\u095b\u095c\7>\2\2\u095c\u0a03"+
		"\7\u0157\2\2\u095d\u095e\7\u014a\2\2\u095e\u095f\7\u016c\2\2\u095f\u096c"+
		"\5\u012a\u0096\2\u0960\u0961\7\u015d\2\2\u0961\u0969\5\u012a\u0096\2\u0962"+
		"\u0963\7\u015d\2\2\u0963\u0964\5\u012a\u0096\2\u0964\u0965\7\u0162\2\2"+
		"\u0965\u0966\5\u012a\u0096\2\u0966\u0968\3\2\2\2\u0967\u0962\3\2\2\2\u0968"+
		"\u096b\3\2\2\2\u0969\u0967\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096d\3\2"+
		"\2\2\u096b\u0969\3\2\2\2\u096c\u0960\3\2\2\2\u096c\u096d\3\2\2\2\u096d"+
		"\u096e\3\2\2\2\u096e\u096f\7\u016f\2\2\u096f\u0a03\3\2\2\2\u0970\u0971"+
		"\7\u014b\2\2\u0971\u0972\7\u016c\2\2\u0972\u097f\5\u012a\u0096\2\u0973"+
		"\u0974\7\u015d\2\2\u0974\u097c\5\u012a\u0096\2\u0975\u0976\7\u015d\2\2"+
		"\u0976\u0977\5\u012a\u0096\2\u0977\u0978\7\u0162\2\2\u0978\u0979\5\u012a"+
		"\u0096\2\u0979\u097b\3\2\2\2\u097a\u0975\3\2\2\2\u097b\u097e\3\2\2\2\u097c"+
		"\u097a\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u0980\3\2\2\2\u097e\u097c\3\2"+
		"\2\2\u097f\u0973\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0981\3\2\2\2\u0981"+
		"\u0982\7\u016f\2\2\u0982\u0a03\3\2\2\2\u0983\u0984\7\u014c\2\2\u0984\u0985"+
		"\7\u016c\2\2\u0985\u0992\5\u012a\u0096\2\u0986\u0987\7\u015d\2\2\u0987"+
		"\u098f\5\u012a\u0096\2\u0988\u0989\7\u015d\2\2\u0989\u098a\5\u012a\u0096"+
		"\2\u098a\u098b\7\u0162\2\2\u098b\u098c\5\u012a\u0096\2\u098c\u098e\3\2"+
		"\2\2\u098d\u0988\3\2\2\2\u098e\u0991\3\2\2\2\u098f\u098d\3\2\2\2\u098f"+
		"\u0990\3\2\2\2\u0990\u0993\3\2\2\2\u0991\u098f\3\2\2\2\u0992\u0986\3\2"+
		"\2\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\7\u016f\2\2\u0995"+
		"\u0a03\3\2\2\2\u0996\u0997\7\u014d\2\2\u0997\u0998\7\u016c\2\2\u0998\u09a5"+
		"\5\u012a\u0096\2\u0999\u099a\7\u015d\2\2\u099a\u09a2\5\u012a\u0096\2\u099b"+
		"\u099c\7\u015d\2\2\u099c\u099d\5\u012a\u0096\2\u099d\u099e\7\u0162\2\2"+
		"\u099e\u099f\5\u012a\u0096\2\u099f\u09a1\3\2\2\2\u09a0\u099b\3\2\2\2\u09a1"+
		"\u09a4\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a6\3\2"+
		"\2\2\u09a4\u09a2\3\2\2\2\u09a5\u0999\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6"+
		"\u09a7\3\2\2\2\u09a7\u09a8\7\u016f\2\2\u09a8\u0a03\3\2\2\2\u09a9\u09aa"+
		"\7\u014e\2\2\u09aa\u09ab\7\u016c\2\2\u09ab\u09b8\5\u012a\u0096\2\u09ac"+
		"\u09ad\7\u015d\2\2\u09ad\u09b5\5\u012a\u0096\2\u09ae\u09af\7\u015d\2\2"+
		"\u09af\u09b0\5\u012a\u0096\2\u09b0\u09b1\7\u0162\2\2\u09b1\u09b2\5\u012a"+
		"\u0096\2\u09b2\u09b4\3\2\2\2\u09b3\u09ae\3\2\2\2\u09b4\u09b7\3\2\2\2\u09b5"+
		"\u09b3\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b9\3\2\2\2\u09b7\u09b5\3\2"+
		"\2\2\u09b8\u09ac\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba"+
		"\u09bb\7\u016f\2\2\u09bb\u0a03\3\2\2\2\u09bc\u09bd\7\u014f\2\2\u09bd\u09be"+
		"\7\u016c\2\2\u09be\u09cb\5\u012a\u0096\2\u09bf\u09c0\7\u015d\2\2\u09c0"+
		"\u09c8\5\u012a\u0096\2\u09c1\u09c2\7\u015d\2\2\u09c2\u09c3\5\u012a\u0096"+
		"\2\u09c3\u09c4\7\u0162\2\2\u09c4\u09c5\5\u012a\u0096\2\u09c5\u09c7\3\2"+
		"\2\2\u09c6\u09c1\3\2\2\2\u09c7\u09ca\3\2\2\2\u09c8\u09c6\3\2\2\2\u09c8"+
		"\u09c9\3\2\2\2\u09c9\u09cc\3\2\2\2\u09ca\u09c8\3\2\2\2\u09cb\u09bf\3\2"+
		"\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09ce\7\u016f\2\2\u09ce"+
		"\u0a03\3\2\2\2\u09cf\u09d0\7\u0150\2\2\u09d0\u09d1\7\u016c\2\2\u09d1\u09d9"+
		"\5\u012a\u0096\2\u09d2\u09d3\7\u015d\2\2\u09d3\u09d4\5\u012a\u0096\2\u09d4"+
		"\u09d5\7\u0162\2\2\u09d5\u09d6\5\u012a\u0096\2\u09d6\u09d8\3\2\2\2\u09d7"+
		"\u09d2\3\2\2\2\u09d8\u09db\3\2\2\2\u09d9\u09d7\3\2\2\2\u09d9\u09da\3\2"+
		"\2\2\u09da\u09dc\3\2\2\2\u09db\u09d9\3\2\2\2\u09dc\u09dd\7\u016f\2\2\u09dd"+
		"\u0a03\3\2\2\2\u09de\u09df\7\u0151\2\2\u09df\u09e0\7\u016c\2\2\u09e0\u09e6"+
		"\5\u012a\u0096\2\u09e1\u09e2\7\u015d\2\2\u09e2\u09e3\5\u012a\u0096\2\u09e3"+
		"\u09e4\7\u0162\2\2\u09e4\u09e5\5\u012a\u0096\2\u09e5\u09e7\3\2\2\2\u09e6"+
		"\u09e1\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e6\3\2\2\2\u09e8\u09e9\3\2"+
		"\2\2\u09e9\u09ec\3\2\2\2\u09ea\u09eb\7\u015d\2\2\u09eb\u09ed\5\u012a\u0096"+
		"\2\u09ec\u09ea\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef"+
		"\7\u016f\2\2\u09ef\u0a03\3\2\2\2\u09f0\u09f1\7\u00f8\2\2\u09f1\u09f2\7"+
		"\u016c\2\2\u09f2\u09f3\5\u012a\u0096\2\u09f3\u09f4\7\u016f\2\2\u09f4\u0a03"+
		"\3\2\2\2\u09f5\u09f6\7\u0117\2\2\u09f6\u09f7\7\u016c\2\2\u09f7\u09f8\5"+
		"\u012a\u0096\2\u09f8\u09f9\7w\2\2\u09f9\u09fc\5\u012a\u0096\2\u09fa\u09fb"+
		"\7s\2\2\u09fb\u09fd\5\u012a\u0096\2\u09fc\u09fa\3\2\2\2\u09fc\u09fd\3"+
		"\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u09ff\7\u016f\2\2\u09ff\u0a03\3\2\2\2"+
		"\u0a00\u0a03\7\u0155\2\2\u0a01\u0a03\7\u0157\2\2\u0a02\u093a\3\2\2\2\u0a02"+
		"\u093b\3\2\2\2\u0a02\u0945\3\2\2\2\u0a02\u094c\3\2\2\2\u0a02\u094d\3\2"+
		"\2\2\u0a02\u0952\3\2\2\2\u0a02\u095a\3\2\2\2\u0a02\u095b\3\2\2\2\u0a02"+
		"\u095d\3\2\2\2\u0a02\u0970\3\2\2\2\u0a02\u0983\3\2\2\2\u0a02\u0996\3\2"+
		"\2\2\u0a02\u09a9\3\2\2\2\u0a02\u09bc\3\2\2\2\u0a02\u09cf\3\2\2\2\u0a02"+
		"\u09de\3\2\2\2\u0a02\u09f0\3\2\2\2\u0a02\u09f5\3\2\2\2\u0a02\u0a00\3\2"+
		"\2\2\u0a02\u0a01\3\2\2\2\u0a03\u0149\3\2\2\2\u0a04\u0a05\5\u0154\u00ab"+
		"\2\u0a05\u0a07\7\u016c\2\2\u0a06\u0a08\5\u014c\u00a7\2\u0a07\u0a06\3\2"+
		"\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u0a0a\7\u016f\2\2\u0a0a"+
		"\u014b\3\2\2\2\u0a0b\u0a10\5\u014e\u00a8\2\u0a0c\u0a0d\7\u015d\2\2\u0a0d"+
		"\u0a0f\5\u014e\u00a8\2\u0a0e\u0a0c\3\2\2\2\u0a0f\u0a12\3\2\2\2\u0a10\u0a0e"+
		"\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u014d\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a13"+
		"\u0a19\6\u00a8\f\2\u0a14\u0a15\5\u0154\u00ab\2\u0a15\u0a17\7\u0162\2\2"+
		"\u0a16\u0a18\7\u0166\2\2\u0a17\u0a16\3\2\2\2\u0a17\u0a18\3\2\2\2\u0a18"+
		"\u0a1a\3\2\2\2\u0a19\u0a14\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1b\3\2"+
		"\2\2\u0a1b\u0a1c\5\u012a\u0096\2\u0a1c\u014f\3\2\2\2\u0a1d\u0a1e\7C\2"+
		"\2\u0a1e\u0a1f\5\u0156\u00ac\2\u0a1f\u0151\3\2\2\2\u0a20\u0a21\7\u0121"+
		"\2\2\u0a21\u0a22\5\u0156\u00ac\2\u0a22\u0153\3\2\2\2\u0a23\u0a27\7\u0173"+
		"\2\2\u0a24\u0a27\t\7\2\2\u0a25\u0a27\5\u0160\u00b1\2\u0a26\u0a23\3\2\2"+
		"\2\u0a26\u0a24\3\2\2\2\u0a26\u0a25\3\2\2\2\u0a27\u0a30\3\2\2\2\u0a28\u0a2c"+
		"\7\4\2\2\u0a29\u0a2d\7\u0173\2\2\u0a2a\u0a2d\t\7\2\2\u0a2b\u0a2d\5\u0160"+
		"\u00b1\2\u0a2c\u0a29\3\2\2\2\u0a2c\u0a2a\3\2\2\2\u0a2c\u0a2b\3\2\2\2\u0a2d"+
		"\u0a2f\3\2\2\2\u0a2e\u0a28\3\2\2\2\u0a2f\u0a32\3\2\2\2\u0a30\u0a2e\3\2"+
		"\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0155\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a33"+
		"\u0a36\7\u0175\2\2\u0a34\u0a36\7\u0176\2\2\u0a35\u0a33\3\2\2\2\u0a35\u0a34"+
		"\3\2\2\2\u0a36\u0157\3\2\2\2\u0a37\u0a39\t\6\2\2\u0a38\u0a37\3\2\2\2\u0a38"+
		"\u0a39\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3b\7\u0177\2\2\u0a3b\u0159"+
		"\3\2\2\2\u0a3c\u0a3e\t\6\2\2\u0a3d\u0a3c\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e"+
		"\u0a3f\3\2\2\2\u0a3f\u0a40\7\u0178\2\2\u0a40\u015b\3\2\2\2\u0a41\u0a42"+
		"\t+\2\2\u0a42\u015d\3\2\2\2\u0a43\u0a44\7\u00c3\2\2\u0a44\u015f\3\2\2"+
		"\2\u0a45\u0a46\t,\2\2\u0a46\u0161\3\2\2\2\u0156\u0167\u016a\u016e\u0171"+
		"\u0176\u017d\u0183\u0185\u018e\u0191\u0193\u01a3\u01ad\u01b0\u01b8\u01ba"+
		"\u01c3\u01cd\u01d1\u01d9\u01df\u01f1\u01fc\u0201\u0204\u0214\u0219\u0222"+
		"\u0227\u022b\u0230\u0234\u023a\u0240\u0245\u0249\u024c\u0258\u0263\u0266"+
		"\u026a\u026d\u0273\u027b\u0289\u0294\u029e\u02a6\u02ad\u02b1\u02b5\u02ba"+
		"\u02be\u02c3\u02c7\u02cb\u02d5\u02d9\u02de\u02e3\u02e7\u02f4\u02f9\u02ff"+
		"\u0308\u030c\u0314\u0317\u031c\u0321\u0328\u032f\u0332\u033b\u033d\u0343"+
		"\u0348\u034e\u0353\u0356\u035c\u036a\u0374\u037a\u037f\u0384\u0389\u038d"+
		"\u0392\u0395\u039f\u03ab\u03b2\u03b5\u03c1\u03c6\u03cb\u03ce\u03d5\u03e1"+
		"\u03ee\u03f0\u03f5\u03f8\u0407\u040d\u0418\u041b\u0425\u042c\u0432\u043a"+
		"\u0444\u0458\u045e\u0462\u0467\u046b\u0470\u0473\u0478\u047b\u0489\u04a8"+
		"\u04aa\u04b2\u04b5\u04ba\u04bc\u04c1\u04c8\u04cb\u04ce\u04d3\u04d7\u04d9"+
		"\u04e4\u04e9\u04eb\u04f1\u04f8\u04fe\u0501\u0506\u050a\u050d\u0514\u051a"+
		"\u051d\u0527\u0530\u0537\u053e\u0540\u0546\u0549\u0554\u055d\u0563\u0569"+
		"\u056c\u0571\u0574\u0577\u057a\u057d\u0583\u058d\u0598\u059b\u05a2\u05a7"+
		"\u05ac\u05b0\u05b8\u05bc\u05c1\u05c5\u05c7\u05cc\u05d4\u05d9\u05de\u05e7"+
		"\u05eb\u05f5\u0607\u0613\u061a\u062a\u0631\u0638\u063c\u0649\u064c\u0653"+
		"\u0660\u0663\u066d\u0672\u067f\u068a\u0690\u0697\u069a\u069e\u06a2\u06a6"+
		"\u06a8\u06ad\u06b1\u06b4\u06b8\u06bb\u06be\u06c1\u06c4\u06cb\u06d6\u06da"+
		"\u06dd\u06e1\u06e8\u06ee\u06f2\u06fa\u0702\u0708\u070c\u0712\u071b\u071e"+
		"\u0723\u0726\u0730\u0735\u073e\u0743\u0747\u0750\u0754\u0762\u076f\u0774"+
		"\u0778\u077e\u0789\u078b\u078f\u0796\u079e\u07a4\u07a9\u07b4\u07bd\u07c1"+
		"\u07ca\u07ce\u07d8\u07dd\u07f3\u07f6\u080b\u0813\u0815\u081c\u081e\u0825"+
		"\u0827\u082e\u0830\u0833\u0835\u0844\u0853\u085f\u0863\u086e\u0872\u087e"+
		"\u0882\u088d\u0892\u0897\u089b\u089f\u08a4\u08a8\u08ac\u08c3\u08c5\u08d7"+
		"\u08d9\u08e1\u08e6\u08eb\u08f0\u08fd\u0902\u0907\u090c\u0911\u0916\u091b"+
		"\u0920\u0922\u0929\u092c\u0937\u0941\u0949\u0952\u0958\u0969\u096c\u097c"+
		"\u097f\u098f\u0992\u09a2\u09a5\u09b5\u09b8\u09c8\u09cb\u09d9\u09e8\u09ec"+
		"\u09fc\u0a02\u0a07\u0a10\u0a17\u0a19\u0a26\u0a2c\u0a30\u0a35\u0a38\u0a3d";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}