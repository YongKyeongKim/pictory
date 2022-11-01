package com.project.pictory.order.repository;

import com.project.pictory.order.domain.OrderGoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderGoodsRepository extends JpaRepository<OrderGoods,Long> {

}
