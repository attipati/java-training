package com.dxc.libraryrestapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="authors")

public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String name;
    private String email;
    private String password;
    private LocalDate creationDate;
    
}
