package com.dxc;

import java.sql.SQLException;
import java.util.List;
import com.dxc.dao.BookDao;
import com.dxc.model.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        ctx.refresh();

        Book chemistry = new Book("chemistry studies", "George Orwell", "978-0-39");
        Book physics = new Book("physics studies", "Frank Herbert", "978-0-553");
        Book mathematics = new Book("mathematics studies", "J.R.R. Tolkien", "978-0-395");
        Book socialStudies =new Book("socialStudies", "J.R.R. Tolkien", "978-0-395");
        //Book theSilmarillion = new Book("The Silmarillion", "J.R.R. Tolkien", "978-0-395-19395-8");
        //Book theChroniclesOfNarnia =new Book("The Chronicles of Narnia", "C.S. Lewis", "978-0-395-19395-8");

        List<Book> books = List.of(chemistry, physics, mathematics, socialStudies);

        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);

        books.forEach(bk -> {
            try {
                int rows = bookDao.save(bk);
                System.out.println("Rows affected: " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        });

        try {
            bookDao.findAll().forEach(System.out::println);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }

        ctx.registerShutdownHook();
    }
}