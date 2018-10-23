package com.example.codeclan.NewsApplication.projections;

import com.example.codeclan.NewsApplication.models.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "embedItems", types = Article.class)
public interface EmbedItems {
    long getId();
    String getTitle();
    String getText();
    Date getDate();
    Region getRegion();
    List<Category> getCategories();
    Journalist getJournalist();
    String getImage();
    String getSummary();
}
