package com.project.pictory.goods.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Builder
public class GoodsResponse {

    private Long id;

    private String name;

    private String url;

    private Integer price;

    private String status;

    private String introduce;

    public GoodsResponse() {

    }
}
