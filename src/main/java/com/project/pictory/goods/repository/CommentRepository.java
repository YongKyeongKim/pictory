package com.project.pictory.goods.repository;

import com.project.pictory.goods.domain.GoodsComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<GoodsComment,Long> {

}
