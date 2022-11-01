package com.project.pictory.goods.service;

import com.project.pictory.goods.repository.GoodsRepository;
import com.project.pictory.goods.repository.LikesRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class LikesService {
    private LikesRepository repository;
}
