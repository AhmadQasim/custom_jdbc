#include "Connection.h"
#include <windows.h>
#include <sqlext.h>
#include <stdio.h>

SQLHDBC hdbc;
SQLRETURN retcode;
SQLHSTMT hstmt = NULL;

JNIEXPORT jlong JNICALL Java_MyConnection_createStat(JNIEnv *env, jobject thisobj, jlong jconn){
	hdbc = (SQLHDBC)jconn;
	retcode = SQLAllocHandle(SQL_HANDLE_STMT, hdbc, &hstmt);
	return (long)hstmt;
}
