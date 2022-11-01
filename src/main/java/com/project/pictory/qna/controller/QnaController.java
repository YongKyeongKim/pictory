package com.project.pictory.qna.controller;

import com.project.pictory.qna.service.QnaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class QnaController {
    private QnaService qnaService;
}
