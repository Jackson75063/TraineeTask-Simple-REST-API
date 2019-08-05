package com.jackson.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jackson.model.Color;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "article")
public class Article{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private Color color;


    //replaced
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Article() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



    public Article(String text, Color color) {
        this.text = text;
        this.color = color;
    }


    public void setUser(User user) {
        this.user = user;
    }
}
