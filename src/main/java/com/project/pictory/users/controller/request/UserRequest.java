package com.project.pictory.users.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Builder
public class UserRequest {

    @NotBlank
    private String email;
    @NotBlank
    private String name;
    @NotBlank
    private String nickName;
    @NotBlank
    private String profileImg;
    @NotBlank
    private String introduce;

    public UserRequest() {

    }
}
