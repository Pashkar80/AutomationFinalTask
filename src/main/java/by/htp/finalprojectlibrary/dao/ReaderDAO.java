package by.htp.finalprojectlibrary.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.finalprojectlibrary.bean.ConnectionDB;
import by.htp.finalprojectlibrary.ntety.Reader;

public class ReaderDAO extends AbstractDAO implements DAO<Reader> {
	
	
	

	@Override
	public boolean create(Reader reader) throws SQLException {
		reader.setId(0);
		String sql = String.format(
				"INSERT INTO 'readers' (,'password','name','surname','countbooks')"
						+ "VALUES(,'%s','%s','%s','%d')", 
						reader.getPassword(),reader.getName(),reader.getSurname(),reader.getCountbooks()
				);
		int id = executeUpdate(sql);
		if (id > 0) {
			return true;
		} else
			return false;
	}
	

	@Override
	public boolean update(Reader reader) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Reader reader) throws SQLException {
		throw new SQLException("Not implements");
	}

	@Override
	public Reader read(int id) throws SQLException {
		List<Reader> list = getAll("where ID=" + id);
		return list.size() > 0 ? list.get(0) : null;
		
	}

	@Override
	public List<Reader> getAll(String where) throws SQLException {
		List <Reader> list = new ArrayList<Reader>();
		Connection connection= ConnectionDB.getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * from readers" + where + ";";
		ResultSet rs= statement.executeQuery(sql);
		while(rs.next()){
			Reader reader = new Reader (
					rs.getInt("id"),
					rs.getString("password"),
					rs.getString("name"),
					rs.getString("surname"),
					rs.getInt("countbooks"));
				list.add(reader);	
		}
		return list;
	}


	

}
