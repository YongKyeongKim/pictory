package com.project.pictory.goods.service;

import com.project.pictory.goods.repository.HashtagRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class HashtagService {
    private HashtagRepository repository;
}
