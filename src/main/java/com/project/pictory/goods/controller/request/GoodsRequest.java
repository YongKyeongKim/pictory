package com.project.pictory.goods.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Builder
public class GoodsRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String url;
    @NotBlank
    private Integer price;
    @NotBlank
    private String status;
    @NotBlank
    private String introduce;

    public GoodsRequest() {

    }
}
