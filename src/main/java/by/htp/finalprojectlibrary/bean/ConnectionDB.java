package by.htp.finalprojectlibrary.bean;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.sql.Connection;

public class ConnectionDB {
	
	public static   Connection getConnection() {

		ResourceBundle rb = ResourceBundle.getBundle("db_config");

		String driver = rb.getString("db.driver");
		String url = rb.getString("db.url");
		String login = rb.getString("db.login");
		String pass = rb.getString("db.pass");
		Connection conn = null;

		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, login, pass);

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}

	private void closeConnection(final Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
