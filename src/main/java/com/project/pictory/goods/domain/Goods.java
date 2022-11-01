package com.project.pictory.goods.domain;

import com.project.pictory.goods.controller.request.GoodsRequest;
import com.project.pictory.util.jpa.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Table(name = "Goods")
@Entity
public class Goods extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "price")
    private Integer price;

    @Column(name = "status")
    private String status;

    @Column(name = "introduce")
    private String introduce;

    @OneToMany(mappedBy = "goods")
    private List<Hashtag> hashtags = new ArrayList<>();

    @OneToMany(mappedBy = "goods")
    private List<GoodsLikes> goodsLikes = new ArrayList<>();

    @OneToMany(mappedBy = "goods")
    private List<GoodsComment> goodsComments = new ArrayList<>();

    public void update(GoodsRequest request) {
        this.name = request.getName();
        this.url = request.getUrl();
        this.price = request.getPrice();
        this.status = request.getStatus();
        this.introduce = request.getIntroduce();
    }
    public void post(GoodsRequest request){
        this.name = request.getName();
        this.url = request.getUrl();
        this.price = request.getPrice();
        this.status = request.getStatus();
        this.introduce = request.getIntroduce();
    }
}
