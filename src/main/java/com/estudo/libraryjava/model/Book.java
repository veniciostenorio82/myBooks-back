package com.estudo.libraryjava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String genre;
    private Integer publicationYear;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public Integer getPublicationYear(){
        return publicationYear;
    }

    public void setTitle(String title){
        if (title == null){
            throw new RuntimeException("O lívro precisa ter um título");
        }
        this.title = title;
    }

    public void setGenre(String genre) {
        if (genre == null){
            throw new RuntimeException("O lívro precisa ter um gênero");
        }
        this.genre = genre;
    }

    public void setPublicationYear(Integer publicationYear) {

        if(publicationYear == null || publicationYear <= 0){
            throw new RuntimeException("Por favor, insira um ano válido");
        }
        this.publicationYear = publicationYear;
    }
}
