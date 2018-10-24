package com.example.codeclan.NewsApplication.controllers;
import com.example.codeclan.NewsApplication.models.Article;
import com.example.codeclan.NewsApplication.repositories.articles.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping(value = "/")
    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }

    @GetMapping(value = "/category/{category}")
    public List<Article> getArticlesByCategory(@PathVariable String category) {
        return articleRepository.getArticlesByCategory(category);
    }

}
