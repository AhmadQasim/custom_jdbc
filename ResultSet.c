#include "ResultSet.h"
#include <windows.h>

#include <sqlext.h>
#include <stdio.h>

SQLHSTMT hstmt;

JNIEXPORT jlong JNICALL Java_MyResultSet_nxt
  (JNIEnv *env, jobject thisobj, jlong jrs) {
	  hstmt = (SQLHSTMT)jrs;
	  SQLFetch(hstmt);
	  return (long)hstmt;
}


JNIEXPORT jint JNICALL Java_MyResultSet_getI
  (JNIEnv *env, jobject thisobj, jlong jrs, jint jin) {
	  int target;
	  hstmt = (SQLHSTMT)jrs;
	  SQLGetData(hstmt, (SQLUSMALLINT)jin, SQL_C_USHORT, &target, 0, NULL);
	  return (jint)target;
}

JNIEXPORT jstring JNICALL Java_MyResultSet_getS
  (JNIEnv *env, jobject thisobj, jlong jrs, jint jin) {
}
