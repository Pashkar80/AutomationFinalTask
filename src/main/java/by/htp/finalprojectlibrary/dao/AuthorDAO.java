package by.htp.finalprojectlibrary.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.finalprojectlibrary.bean.ConnectionDB;
import by.htp.finalprojectlibrary.ntety.Author;

public class AuthorDAO extends AbstractDAO implements DAO<Author> {

	@Override
	public boolean create(Author author) throws SQLException {
		author.setId(0);
		String sql = String.format(
				"INSERT INTO 'authors' (,'name','surname',)"
						+ "VALUES(,'%s','%s')",
				author.getName(),author.getSurname());
		int id = executeUpdate(sql);
		if (id > 0) {
			return true;
		} else
			return false;
		
		
	}

	@Override
	public boolean update(Author BEAN) throws SQLException {
		throw new SQLException("Not implements");
	}

	@Override
	public boolean delete(Author BEAN) throws SQLException {
		throw new SQLException("Not implements");
	}

	@Override
	public Author read(int id) throws SQLException {
		List<Author> list = getAll("where ID=" + id);
		return list.size() > 0 ? list.get(0) : null;
		
	}

	@Override
	public List<Author> getAll(String where) throws SQLException {
		List <Author> list = new ArrayList<Author>();
		Connection connection= ConnectionDB.getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * from books" + where + ";";
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()){
			Author author = new Author(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("surname"));
			list.add(author);
		}
		
		
		
		return list;
	}
	
	

}
