package com.project.pictory.order.service;

import com.project.pictory.order.repository.OrderGoodsRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class OrderGoodsService {
    private OrderGoodsRepository repository;
}
