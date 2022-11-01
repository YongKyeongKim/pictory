package com.project.pictory.users.domain;

import com.project.pictory.users.controller.request.UserRequest;
import com.project.pictory.util.jpa.BaseTimeEntity;
import lombok.Getter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Table(name = "Users")
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loginId")
    private String loginId;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "profileImg")
    private String profileImg;

    @Column(name = "introduce")
    private String introduce;

    @Column(name = "deletedAt")
    private LocalDateTime deletedAt;

    public void update(UserRequest request) {
        this.email = request.getEmail();
        this.name = request.getName();
        this.nickName = request.getNickName();
        this.introduce = request.getIntroduce();
        this.profileImg = request.getProfileImg();
    }

    public void post(UserRequest request){
        this.email = request.getEmail();
        this.name = request.getName();
        this.nickName = request.getNickName();
        this.introduce = request.getIntroduce();
        this.profileImg = request.getProfileImg();
    }

}
