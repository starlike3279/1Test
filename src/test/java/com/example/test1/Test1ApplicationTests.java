package com.example.test1;

import com.example.test1.article.Article;
import com.example.test1.article.ArticleRepository;
import com.example.test1.article.ArticleService;
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

	@Autowired
	private ArticleService articleService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.articleService.create(subject, content, null);
		}
	}
}
