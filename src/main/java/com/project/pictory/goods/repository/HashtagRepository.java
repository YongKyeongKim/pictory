package com.project.pictory.goods.repository;

import com.project.pictory.users.domain.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HashtagRepository extends JpaRepository<Follow, Long> {
}
