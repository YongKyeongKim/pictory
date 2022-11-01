package com.project.pictory.goods.service;

import com.project.pictory.goods.repository.CommentRepository;
import com.project.pictory.goods.repository.GoodsRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class CommentService {
    private CommentRepository repository;
}
