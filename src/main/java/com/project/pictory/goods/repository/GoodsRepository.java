package com.project.pictory.goods.repository;

import com.project.pictory.goods.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;

public interface GoodsRepository extends JpaRepository<Goods,Long>{

}
