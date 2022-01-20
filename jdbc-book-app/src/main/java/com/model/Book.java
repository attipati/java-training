package com.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String isbn13;
    public Book(){}
    /*public Book(int id,String title,String author,String isbn)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.isbn=isbn;


    }*/
    public Book(String title,String author,String isbn13)
    {
      
        this.title=title;
        this.author=author;
        this.isbn13=isbn13;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn13() {
        return isbn13;
    }
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }
    @Override
    public String toString(){
        return title+" "+author+" "+isbn13;
    }
}
