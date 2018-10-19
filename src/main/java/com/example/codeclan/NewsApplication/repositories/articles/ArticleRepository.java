package com.example.codeclan.NewsApplication.repositories.articles;

import com.example.codeclan.NewsApplication.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
