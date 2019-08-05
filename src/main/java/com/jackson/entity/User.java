package com.jackson.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jackson.model.Color;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class User {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Short age;


    //replaced
    @OneToMany( mappedBy = "user",fetch = FetchType.LAZY )
    private Set<Article> article = new HashSet<>();

    public User() {
    }

    public User(String name, Short age, Set<Article> article) {
        this.name = name;
        this.age = age;
        this.article = article;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Set<Article> getArticle() {
        return article;
    }

    public void setArticle(Set<Article> article) {
        this.article = article;
    }
}


