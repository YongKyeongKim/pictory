package com.project.pictory.users.controller;

import com.project.pictory.users.controller.request.UserRequest;
import com.project.pictory.users.controller.response.UserResponse;
import com.project.pictory.users.domain.User;
import com.project.pictory.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RequestMapping("/api/users")
@RestController
public class UserController {
    private final UserService userService;

    //회원정보조회
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        UserResponse response = UserResponse.builder().id(user.getId())
                .email(user.getEmail()).self(user.getIntroduce()).profileImg(user.getProfileImg())
                .nickName(user.getNickName()).name(user.getName()).build();
        return response;
    }

    //회원정보수정
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody @Validated UserRequest userRequest){
        userService.updateUser(id, userRequest);
    }

    //회원정보삭제
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    //회원정보등록
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createUser(@RequestBody @Validated UserRequest request) {
        userService.createUser(request);
    }

}
