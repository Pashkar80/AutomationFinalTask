package by.htp.finalproject.controler;

import java.sql.SQLException;

import by.htp.finalprojectlibrary.dao.BookDAO;
import by.htp.finalprojectlibrary.dao.DAO;
import by.htp.finalprojectlibrary.ntety.Book;

public class MainControler {
	public static void main(String[] args) throws SQLException {
		
		DAO dao  = new BookDAO();
		Book book =  dao.getAll("book");

System.out.println(book);
}
}