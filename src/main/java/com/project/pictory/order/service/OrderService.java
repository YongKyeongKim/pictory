package com.project.pictory.order.service;

import com.project.pictory.order.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class OrderService {
    private OrderRepository repository;
}
