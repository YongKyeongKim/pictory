package com.project.pictory.goods.controller;

import com.project.pictory.goods.service.LikesService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class LikesController {
    private LikesService likesService;

    //좋아요 조회
}
