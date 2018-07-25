package by.htp.finalprojectlibrary.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.htp.finalprojectlibrary.bean.ConnectionDB;

public class AbstractDAO {
	
 private int create(String sql) throws SQLException {
		 
        try (Connection cnc = ConnectionDB.getConnection();
	             Statement statement = cnc.createStatement()) {
	            int recCount = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
	            if (recCount == 1) {
	                ResultSet keys = statement.getGeneratedKeys();
	                if (keys.next()) {
	                    return keys.getInt(1);
	                }
	            }
	            return -1;
	        }

	    }

	    public int executeUpdate(String sql) throws SQLException {
        if (sql.toUpperCase().startsWith("INSERT"))
	            return create(sql);
        try (Connection cnc = ConnectionDB.getConnection();
	             Statement statement = cnc.createStatement()) {
            return statement.executeUpdate(sql);
	        }
	    }

}
