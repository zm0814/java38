import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.byzx.java.jdbc1.DBinfo;

public class DBlink {
	
//	获取数据库链接
	public static Connection getConn(){
		try {
			Class.forName(DBinfo.JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DBinfo.JDBC_URL,DBinfo.JDBC_USERNAME, DBinfo.JDBC_PASSWORD);
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	关流
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		try {
			if(null !=rs) {
				rs.close();
			}
			if(null !=ps) {
				ps.close();
			}
			if(null != conn && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
