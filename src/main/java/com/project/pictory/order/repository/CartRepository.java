package com.project.pictory.order.repository;

import com.project.pictory.order.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

}
