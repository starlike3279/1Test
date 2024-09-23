package com.example.test1;

import com.example.test1.article.Article;
import com.example.test1.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Test1ApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void contextLoads() {
		Article article = new Article();
		article.setTitle("제목");
		article.setContent("내용");
		article.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(article);
	}

}
