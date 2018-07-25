package by.htp.finalprojectlibrary.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.finalprojectlibrary.bean.ConnectionDB;
import by.htp.finalprojectlibrary.ntety.Book;

public  class BookDAO extends AbstractDAO implements DAO<Book> {



	@Override
	public boolean create(Book book) throws SQLException {
		book.setId(0);
		String sql = String.format(
				"INSERT INTO 'books' (,'Title','id_author','count')"
						+ "VALUES(,'%s','%d','%d',)", book.getTitle(),
				book.getId_author(), book.getCount());
		int id = executeUpdate(sql);
		if (id > 0) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean update(Book book) throws SQLException {
		String sql = String
				.format("UPDATE `books` SET `Title`='%s',`id_author`='%d', `count='%d',WHERE ID=%d ",
						book.getTitle(), book.getId_author(), book.getCount());

		return executeUpdate(sql) > 0;

	}

	@Override
	public boolean delete(Book book) throws SQLException {
		throw new SQLException("Not implements");

	}

	@Override
	public Book read(int id) throws SQLException {
		List<Book> list = getAll("where ID=" + id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<Book> getAll(String where) throws SQLException {
		List<Book> list = new ArrayList<Book>();
		Connection connection = ConnectionDB.getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * from " + where + ";";
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			Book book = new Book(rs.getInt("id_book"), 
					rs.getString("Title"),
					rs.getInt("id_author"),
					rs.getInt("count"));
			list.add(book);

		}
		return list;
	}

}
