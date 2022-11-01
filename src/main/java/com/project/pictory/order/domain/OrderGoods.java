package com.project.pictory.order.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "OrderGoods")
@Entity
public class OrderGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "goodsId")
    private Long goodsId;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
