package com.dxc.libraryrestapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.dxc.libraryrestapp.model.Author;
public interface AuthorRepository  extends JpaRepository <Author,Integer> {
    
}
