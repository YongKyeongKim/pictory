package com.project.pictory.users.service;

import com.project.pictory.users.controller.request.UserRequest;
import com.project.pictory.users.domain.User;
import com.project.pictory.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository repository;

    public User getUser(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void updateUser(Long userId, UserRequest userRequest){
        User user = repository.findById(userId).orElseThrow();
        user.update(userRequest);
        repository.save(user);
    }

    public void deleteUser(Long userId){
        repository.deleteById(userId);
    }

    public void createUser(UserRequest userRequest){
        User user = new User();
        user.post(userRequest);
        repository.save(user);
    }

}
