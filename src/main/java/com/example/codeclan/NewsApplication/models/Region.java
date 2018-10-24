package com.example.codeclan.NewsApplication.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "regions")
public class Region {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "region", fetch = FetchType.LAZY)
    private List<Article> articles;

    public Region(String name) {
        this.name = name;
        this.articles = new ArrayList<>();
    }

    public Region(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
