package com.example.demo;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String contents;

    public Comment(String contents) {
        this.contents = contents;
    }

    public Comment() {
    }

    public String getContents() {
        return contents;
    }
}
