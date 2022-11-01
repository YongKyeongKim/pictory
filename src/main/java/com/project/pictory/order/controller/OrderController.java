package com.project.pictory.order.controller;

import com.project.pictory.order.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class OrderController {
    private OrderService orderService;
}
