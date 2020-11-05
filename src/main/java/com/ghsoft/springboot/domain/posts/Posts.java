package com.ghsoft.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//import javax.persistence.Column;
//import javax.persistence.Entity;

/**
 * Class to match with the DB
 */
@Getter
@NoArgsConstructor
@Entity
public class Posts {


    /**
     * Table's primary key @Id
     * GenerationType.IDENTITY is auto increment in db
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable =false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable= false)
    private String content;

    private String author;


    /**
     * Constructor of Posts class
     * @param title
     * @param content
     * @param author
     */
    @Builder
    public Posts(String title, String content, String author){
        this.title =title;
        this.content =content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
