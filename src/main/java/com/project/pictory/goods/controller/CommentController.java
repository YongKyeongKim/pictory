package com.project.pictory.goods.controller;

import com.project.pictory.goods.service.CommentService;
import com.project.pictory.goods.service.HashtagService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class CommentController {

    private CommentService commentService;

    //해당 상품에 대한 코멘트 리스트 조회
    //코멘트 수정
    //코멘트 삭제
    //코멘트 답글?
}
