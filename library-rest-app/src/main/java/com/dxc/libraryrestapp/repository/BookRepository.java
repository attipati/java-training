package com.dxc.libraryrestapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.dxc.libraryrestapp.model.Book;
public interface BookRepository extends JpaRepository <Book,Integer>{
    
}
