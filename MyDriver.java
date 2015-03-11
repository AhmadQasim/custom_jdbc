import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;



public class MyDriver implements Driver{
	static
	{
		System.loadLibrary("DriverManager");
	    try {
			DriverManager.registerDriver(new MyDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private native long getConn(String server, String props, String pwd);
	@Override
	public boolean acceptsURL(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	public Connection connect(String arg0, Properties arg1) throws SQLException {
		MyConnection conn = new MyConnection();
		conn.conn_ptr = getConn(arg1.getProperty("user"),arg0, arg1.getProperty("password"));
		return conn;
	}
	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DriverPropertyInfo[] getPropertyInfo(String arg0, Properties arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}
}
