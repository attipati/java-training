package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Book;

public class BookDao {
    private static final String INSERT_ONE_BOOK;
    private static final String SELECT_ALL_BOOK;
    private static final String USER_NAME;
    private static final String PASSWORD;
    private static final String URL;
    static{
        INSERT_ONE_BOOK="INSERT INTO books(title,author, isbn13)VALUES (?,?,?)";
        SELECT_ALL_BOOK="SELECT * FROM books";
        USER_NAME="root";
        PASSWORD="Password";
        URL="jdbc:mysql://localhost:3306/dxc";
    }
    //public BookDao(){

    
    public int  save(Book books) throws SQLException{
        System.out.println("saving book: "+ books);
        Connection connection=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        PreparedStatement ps=connection.prepareStatement(INSERT_ONE_BOOK);
        ps.setString(1,books.getTitle());
        ps.setString(2,books.getAuthor());
        ps.setString(3,books.getIsbn13());
        int rows=0;
         rows =ps.executeUpdate();
         System.out.println("Rows affected:"+rows);
         ps.close();
         connection.close();
         return rows;
    }
    
}
