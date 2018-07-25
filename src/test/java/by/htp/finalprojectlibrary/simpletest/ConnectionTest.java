package by.htp.finalprojectlibrary.simpletest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.junit.Assert;
import org.junit.Test;

public class ConnectionTest {
	@Test
	public void testConnection (){
		try {
			ResourceBundle rb = ResourceBundle.getBundle("db_config");
			
			String driver = rb.getString("db.driver");
			String url = rb.getString("db.url");
			String login = rb.getString("db.login");
			String pass = rb.getString("db.pass");
			
			Class.forName(driver);
			
			Connection conn=	DriverManager.getConnection(url,login, pass);
			Assert.assertNotNull(conn);
				
			} catch ( ClassNotFoundException |SQLException e) {
				
				e.printStackTrace();
			}
			
		
	}
}
