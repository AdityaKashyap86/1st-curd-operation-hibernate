package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "books_id")
    private Long id;

    @Column
    private String mathe;

    @Column
    private String English;


    public Books (){}



    public Books(String mathe, String english) {
        this.id= id;
        this.mathe = mathe;
        this.English = english;

    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMathe() {
        return mathe;
    }

    public void setMathe(String mathe) {
        this.mathe = mathe;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Books books = (Books) o;
        return Objects.equals (id, books.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id);
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", mathe='" + mathe + '\'' +
                ", English='" + English + '\'' +
                '}';
    }
}
