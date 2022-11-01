package com.project.pictory.goods.repository;

import com.project.pictory.goods.domain.GoodsLikes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<GoodsLikes, Long> {
}
