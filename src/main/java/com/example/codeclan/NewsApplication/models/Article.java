package com.example.codeclan.NewsApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.jfr.Category;
import org.hibernate.annotations.Cascade;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "articles")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "date")
    private Date date;

    @JsonIgnoreProperties("articles")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "articles_categories",
            joinColumns = {@JoinColumn(name = "article_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="category_id", nullable = false, updatable = false)}
    )
    private List<Category> categories;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "text")
    private String text;

    @JsonIgnoreProperties("articles")
    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;

    public Article(Date date, String title, Journalist journalist) {
        this.date = date;
        this.categories = new ArrayList<>();
        this.title = title;
        this.image = "";
        this.text = "";
        this.journalist = journalist;
    }

    public Article() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

}
