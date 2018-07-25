package by.htp.finalprojectlibrary.dao;

import java.sql.SQLException;
import java.util.List;

import by.htp.finalprojectlibrary.ntety.Biblian;

public class BiblianDAO extends AbstractDAO implements DAO<Biblian> {

	@Override
	public boolean create(Biblian biblian) throws SQLException {
		biblian.setId(0);
		String sql = String.format("INSERT INTO 'biblian' (,'login','password','name','surname')"
						+ "VALUES(,'%s','%s','%s','%s')", 
						biblian.getLogin(),
						biblian.getPassword(),
						biblian.getName(),
						biblian.getSurname()
						);
		int id = executeUpdate(sql);
		if(id>0){
			return true;
		}else
		return false;
	}

	@Override
	public boolean update(Biblian biblian) throws SQLException {
		throw new SQLException("Not implements");
	}

	@Override
	public boolean delete(Biblian biblian) throws SQLException {
		throw new SQLException("Not implements");
	}

	@Override
	public Biblian read(int id) throws SQLException {
		throw new SQLException("Not implements");
	}

	@Override
	public List<Biblian> getAll(String where) throws SQLException {
		throw new SQLException("Not implements");
	}

}
