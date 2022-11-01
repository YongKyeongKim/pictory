package com.project.pictory.goods.domain;

import com.project.pictory.util.jpa.BaseTimeEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Comment")
@Entity
public class GoodsComment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "goodsNo")
    private Number goodsNo;

    @Column(name = "userNo")
    private Number userNo;

    @Column(name = "comment")
    private String comment;

    @JoinColumn(name = "goodsId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private Goods goods;
}
