package com.project.pictory.goods.domain;

import com.project.pictory.util.jpa.BaseTimeEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Hashtag")
@Entity
public class Hashtag extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @JoinColumn(name = "goodsId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private Goods goods;
}
