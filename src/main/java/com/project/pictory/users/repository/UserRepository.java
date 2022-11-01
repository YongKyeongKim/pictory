package com.project.pictory.users.repository;

import com.project.pictory.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
