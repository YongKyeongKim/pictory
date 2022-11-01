package com.project.pictory.goods.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Builder
public class GoodsSearch {

    @NotBlank
    private String name;

}
