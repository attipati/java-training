package com.dxc;

import java.sql.SQLException;
import java.util.List;
import javax.swing.text.html.ListView;

import com.dao.BookDao;
import com.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Book rsAgarval=new Book("cat farm","george orwell","1353");
        Book dune=new Book("dune","vemana","978");
        Book theHobbit=new Book("henformm","george orwell","24946");
    
        
        BookDao bookDao=new BookDao();
        List<Book> books=List.of(rsAgarval,dune,theHobbit);
        
        books.forEach(bk ->{
            try{
                bookDao.save(bk);
            }catch(SQLException e){
                e.printStackTrace();
                System.err.println(e.getMessage());
            }

            
        });

    }
}
