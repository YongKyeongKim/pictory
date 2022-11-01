package com.project.pictory.users.domain;

import com.project.pictory.util.jpa.BaseTimeEntity;

import javax.persistence.*;

@Table(name = "Follow")
@Entity
public class Follow extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "followingId")
    private String followingId;

}
