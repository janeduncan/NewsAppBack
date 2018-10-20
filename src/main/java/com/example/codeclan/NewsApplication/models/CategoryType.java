package com.example.codeclan.NewsApplication.models;

public enum CategoryType {

    POLITICS("Politics"),
    SPORTS("Sports"),
    TECHNOLOGY("Technology"),
    BUSINESS("Business"),
    WORLD("World"),
    UK("UK"),
    ENVIRONMENT("Environment"),
    CELEBRITY("Celebrity"),
    EDUCATION("Education");

    private String category;

    CategoryType(String category) {
        this.category = category;
    }

    public String getCategoryValue() {
        return category;
    }

}
