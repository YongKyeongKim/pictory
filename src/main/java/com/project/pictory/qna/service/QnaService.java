package com.project.pictory.qna.service;

import com.project.pictory.qna.repository.QnaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class QnaService {
    private QnaRepository repository;
}
