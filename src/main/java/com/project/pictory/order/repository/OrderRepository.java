package com.project.pictory.order.repository;

import com.project.pictory.goods.domain.Goods;
import com.project.pictory.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
