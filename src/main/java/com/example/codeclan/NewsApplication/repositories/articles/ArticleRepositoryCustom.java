package com.example.codeclan.NewsApplication.repositories.articles;

import com.example.codeclan.NewsApplication.models.Article;
import java.util.List;

public interface ArticleRepositoryCustom {

    List<Article> getArticlesByCategory(String category);

}
