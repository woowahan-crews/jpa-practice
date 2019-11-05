package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
//    @Column(nullable = false)
    @JoinColumn(name = "article_id", nullable = false)
    private List<Comment> comments = new ArrayList<>();

    public Article() {
    }

    public List<Comment> getComments() {
        return comments;
    }
}
