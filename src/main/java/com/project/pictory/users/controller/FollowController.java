package com.project.pictory.users.controller;

import com.project.pictory.users.service.FollowService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class FollowController {
    private FollowService followService;
}
