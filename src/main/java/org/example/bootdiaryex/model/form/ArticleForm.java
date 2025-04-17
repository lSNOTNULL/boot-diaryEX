package org.example.bootdiaryex.model.form;

import org.example.bootdiaryex.model.entity.Article;
import org.springframework.web.multipart.MultipartFile;

public record ArticleForm(String title, String content, MultipartFile file) {
    public static ArticleForm empty(){
        return new ArticleForm(null,null,null);
        // null 을 반환하는 empty를 먼저 구현
    }
}
