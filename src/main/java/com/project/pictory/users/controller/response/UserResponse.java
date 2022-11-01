package com.project.pictory.users.controller.response;

import lombok.*;

@AllArgsConstructor
@Getter
@Builder
public class UserResponse {

    private Long id;

    private String email;

    private String name;

    private String nickName;

    private String profileImg;

    private String self;

    public UserResponse() {

    }
}
