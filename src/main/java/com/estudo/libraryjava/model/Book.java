package com.estudo.libraryjava.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {

    @Id
    private String id;

    private String title;
    private String genre;
    private Integer publicationYear;

    public String getId() {
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
