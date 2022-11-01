package com.project.pictory.users.service;

import com.project.pictory.users.repository.FollowRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class FollowService {
    private FollowRepository repository;
}
