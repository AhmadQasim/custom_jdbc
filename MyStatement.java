import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;



public class MyStatement implements Statement{
	public MyStatement () throws SQLException{
		System.loadLibrary("Statement");
	}
	public long stmt_ptr;
	private native long exeQuery(long stmt, String query);
	
	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addBatch(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cancel() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clearBatch() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeOnCompletion() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean execute(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean execute(String arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean execute(String arg0, int[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean execute(String arg0, String[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int[] executeBatch() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResultSet executeQuery(String arg0) throws SQLException {
		MyResultSet rs = new MyResultSet();
		rs.rs_ptr = exeQuery(stmt_ptr, arg0);
		return rs;
	}
	@Override
	public int executeUpdate(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int executeUpdate(String arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int executeUpdate(String arg0, int[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int executeUpdate(String arg0, String[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getFetchDirection() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getFetchSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getMaxFieldSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMaxRows() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean getMoreResults() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean getMoreResults(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getQueryTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ResultSet getResultSet() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getResultSetConcurrency() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getResultSetHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getResultSetType() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getUpdateCount() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isPoolable() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setCursorName(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setEscapeProcessing(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFetchDirection(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFetchSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setMaxFieldSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setMaxRows(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPoolable(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setQueryTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
