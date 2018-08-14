package com.digitalbijapur.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.digitalbijapur.domain.ArticleStatus;
import com.digitalbijapur.exception.ArticleNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.digitalbijapur.domain.Article;
import com.digitalbijapur.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	public static final Logger LOGGER = LoggerFactory.getLogger(ArticleServiceImpl.class);

	@Override
	public List<Article> findAllArticles() {
		return Collections.emptyList();
	}

	@Override
	public Article findArticleById(Long id) throws ArticleNotFoundException {
		return null;
	}

	@Override
	public Article createArticle(Article article) {
		return null;
	}

	@Override
	public Article updateArticle(Article article) throws ArticleNotFoundException {
		throw new ArticleNotFoundException();
		//return null;
	}

	@Override
	public Article deleteArticleById(Long id) throws ArticleNotFoundException {
		return null;
	}


}
