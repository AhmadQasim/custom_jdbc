#include "Statement.h"
#include <windows.h>

#include <sqlext.h>
#include <stdio.h>

SQLCHAR stat[500];
SQLRETURN retcode;
SQLHSTMT hstmt;

JNIEXPORT jlong JNICALL Java_MyStatement_exeQuery
  (JNIEnv *env, jobject thisobj, jlong jstmt, jstring jquery){
	SQLWCHAR wstat[500];
	const char* query = (*env)->GetStringUTFChars(env ,jquery, NULL);
	hstmt = (SQLHSTMT)jstmt;
	strcpy_s((char*)stat, _countof(stat), query);
	mbstowcs((wchar_t*)&wstat, (char*)&stat, strlen((char*)stat) * sizeof(SQLCHAR) );
	retcode = SQLExecDirect(hstmt, wstat, SQL_NTS);
	return (long)hstmt;
}
