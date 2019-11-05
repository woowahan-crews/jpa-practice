package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CommentRepository commentRepository;

    public Comment service2() {
        return commentRepository.save(new Comment("aaaa"));
    }

    @Transactional
    public void service() {
        Article article = articleRepository.findById(1L).orElseThrow(IllegalArgumentException::new);
        Comment comment = new Comment();
//        comment = commentRepository.save(comment);

        System.out.println("===============");

        article.getComments();
    }
}
