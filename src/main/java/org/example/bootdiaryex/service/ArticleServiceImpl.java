package org.example.bootdiaryex.service;


import org.example.bootdiaryex.model.entity.Article;
import org.example.bootdiaryex.model.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
        //Jpa 를 이용해 Article Entity의 모든 내용을 찾는 메서드 구현
    }

    @Override
    public void save(Article article) {
        articleRepository.save(article);
    }
}
