package com.project.pictory.order.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Orders")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "paymentId")
    private Long paymentId;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
