package com.example.codeclan.NewsApplication;

import com.example.codeclan.NewsApplication.repositories.articles.ArticleRepository;
import com.example.codeclan.NewsApplication.repositories.categories.CategoryRepository;
import com.example.codeclan.NewsApplication.repositories.journalists.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsApplicationTests {

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	JournalistRepository journalistRepository;

	@Test
	public void contextLoads() {
	}
}
