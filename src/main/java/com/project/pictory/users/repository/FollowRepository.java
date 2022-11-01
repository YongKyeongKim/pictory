package com.project.pictory.users.repository;

import com.project.pictory.users.domain.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {
}
