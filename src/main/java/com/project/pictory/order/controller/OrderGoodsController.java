package com.project.pictory.order.controller;

import com.project.pictory.order.service.OrderGoodsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class OrderGoodsController {
    private OrderGoodsService orderGoodsService;
}
