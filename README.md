# custom_jdbc
Custom JDBC driver implemented using ODBC implementation in C and bridged to Java using JNI.

This is a type one JDBC driver which uses a layer of ODBC to connect to a database. JNI is used to interface between the JAVA and C code. Due to the limitations of time and resources only few methods are implemented.

## Limitations
<ul>
<li> It can only execute the following functions from the respective interfaces.<\ul>
##Implemented Methods <ul>
<li>Connection-> createStatement.</li>
<li>Statement->executeQuery</li>
<li>ResultSet->next, getInt</li>

The testing app has been provided.

## Procedure
To use the project., the point to point
Create DLLs files of the C files using some toll like VS.
Make a jar file after compiling the JAVA files.
Put the DLLs in the home currentry of the testing app.
