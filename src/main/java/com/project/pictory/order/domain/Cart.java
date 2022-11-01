package com.project.pictory.order.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Cart")
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "goodsId")
    private Long goodsId;

}
