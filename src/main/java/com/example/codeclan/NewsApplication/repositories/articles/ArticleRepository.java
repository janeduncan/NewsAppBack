package com.example.codeclan.NewsApplication.repositories.articles;

import com.example.codeclan.NewsApplication.models.Article;
import com.example.codeclan.NewsApplication.projections.EmbedItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(excerptProjection = EmbedItems.class)
public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositoryCustom {


}
