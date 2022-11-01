package com.project.pictory.order.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Payment")
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "paymentDateTime")
    private LocalDateTime paymentDateTime;

    @Column(name = "totalPrice")
    private Number totalPrice;

    @Column(name = "createdat")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
