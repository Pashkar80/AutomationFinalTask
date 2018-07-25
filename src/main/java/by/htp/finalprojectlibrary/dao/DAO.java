package by.htp.finalprojectlibrary.dao;

import java.sql.SQLException;
import java.util.List;

import by.htp.finalprojectlibrary.ntety.Book;

public interface DAO <T> {
	
	 boolean create (T BEAN) throws SQLException;
	    boolean update (T BEAN) throws SQLException;
	    boolean delete (T BEAN) throws SQLException;
	    T read (int id) throws SQLException;
	    List<T> getAll(String where) throws SQLException;
}
