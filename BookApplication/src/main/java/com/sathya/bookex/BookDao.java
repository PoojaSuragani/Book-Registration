package com.sathya.bookex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BookDao {
	
		public int saveUser(String bookisbn, String bookname, String bookauthor, String bookprice)
			
		{
			int result=0;
			Connection connection= DatabaseUtilsBook.createConnection();
			try {
				//store the data into database
				PreparedStatement preparedStatement= connection.prepareStatement("insert into book_info values(?,?,?,?)");
				
				preparedStatement.setString(1, bookisbn);
				preparedStatement.setString(2, bookname);
				preparedStatement.setString(3, bookauthor);
				preparedStatement.setString(4, bookprice);
				result = preparedStatement.executeUpdate();
				}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
	}
		
		
		public Bookinfo searchbybookname(String bookname) {
			Bookinfo bookinfo =null;
			Connection connection= DatabaseUtilsBook.createConnection();
			
			
			try {
				PreparedStatement preparedStatement=  connection.prepareStatement("select * from book_info where bookname =?");
				preparedStatement.setString(1, bookname);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next())
				
				bookinfo = new Bookinfo();
				bookinfo.setBookisbn(resultSet.getString(1));
				bookinfo.setBookname(resultSet.getString(2));
				bookinfo.setBookauthor(resultSet.getString(3));
				bookinfo.setBookprice(resultSet.getString(4));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return bookinfo;	
		
		}
		
		

		public int deleteBybookprice(String bookprice)
		{
			
			Connection connection= DatabaseUtilsBook.createConnection();
			int result=0;
			try {
				//store the data into database
				PreparedStatement preparedStatement= connection.prepareStatement("delete  from user_info where  bookprice=? ");
				preparedStatement.setString(1, bookprice);
				result = preparedStatement.executeUpdate();
				}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
		
		
}
