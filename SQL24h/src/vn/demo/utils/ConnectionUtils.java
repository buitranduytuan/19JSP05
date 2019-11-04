package vn.demo.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

public class ConnectionUtils {
	private static String hostName = "localhost";
	private static String dbName = "24h";
	private static String UserName = "root";
	private static String password = "530127QNA@ABCD";
	private static String connectionULR = "jdbc:mysql://"+hostName+":3306/"+dbName;

	public static Connection getMyConnection() throws ClassNotFoundException, SQLException{
		Connection conn = DriverManager.getConnection(connectionULR, UserName, password);
		return conn;
	}
}
