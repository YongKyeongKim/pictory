package com.project.pictory.qna.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Qna")
@Entity
public class Qna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loginId")
    private Long loginId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
