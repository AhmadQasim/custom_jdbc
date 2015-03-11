#include "DriverManager.h"
#include <windows.h>

#include <sqlext.h>
#include <stdio.h>

SQLHENV henv = NULL;
SQLHDBC hdbc = NULL;
SQLCHAR connstr[100];
SQLRETURN retcode;

JNIEXPORT jlong JNICALL Java_MyDriver_getConn
  (JNIEnv *env, jobject thisobj, jstring juser, jstring jserver, jstring jpwd) {
	SQLWCHAR swTemp[100];
	const char* server = (*env)->GetStringUTFChars(env ,jserver, NULL);
	const char* user = (*env)->GetStringUTFChars(env ,juser, NULL);
	const char* pwd= (*env)->GetStringUTFChars(env, jpwd, NULL);
	strcpy_s((char*)connstr, _countof(connstr), "DSN=mysqlds;SERVER=");
	strcat_s((char*)connstr, _countof(connstr), server);
	strcat_s((char*)connstr, _countof(connstr), ";UID=");
	strcat_s((char*)connstr, _countof(connstr), user);
	strcat_s((char*)connstr, _countof(connstr), "PWD=;DRIVER={MySQL ODBC 5.3 Unicode Driver};");
	mbstowcs((wchar_t*)&swTemp, (char*)&connstr, strlen((char*)connstr) * sizeof(SQLCHAR) );
	retcode = SQLAllocHandle(SQL_HANDLE_ENV, SQL_NULL_HANDLE, &henv);
	retcode = SQLSetEnvAttr(henv, SQL_ATTR_ODBC_VERSION, (SQLPOINTER*)SQL_OV_ODBC3, 0); 
	retcode = SQLAllocHandle(SQL_HANDLE_DBC, henv, &hdbc);
	retcode = SQLSetConnectAttr(hdbc, SQL_LOGIN_TIMEOUT, (SQLPOINTER)5, 0);
	//retcode = SQLSetConnectAttr(hdbc, SQL_ATTR_CONNECTION_TIMEOUT, (SQLPOINTER)0, 0);
	retcode = SQLDriverConnect(hdbc, 0,swTemp, _countof(swTemp),NULL, 255, NULL,SQL_DRIVER_COMPLETE );
	return (long)hdbc;
}
