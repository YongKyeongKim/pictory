package com.project.pictory.goods.controller;

import com.project.pictory.goods.controller.request.GoodsRequest;
import com.project.pictory.goods.controller.request.GoodsSearch;
import com.project.pictory.goods.controller.response.GoodsResponse;
import com.project.pictory.goods.domain.Goods;
import com.project.pictory.goods.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/api/goods")
@RestController
public class GoodsController {

    private final GoodsService goodsService;

    //상품 등록
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createGood(@RequestBody @Validated GoodsRequest request){
        goodsService.createGood(request);
    }

    //상품 조회
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<GoodsResponse> getGoods(GoodsSearch search, Sort sort){
        return goodsService.getGoods(search, sort).stream().map(x -> GoodsResponse.builder().id(x.getId())
                .name(x.getName()).url(x.getUrl()).price(x.getPrice())
                .status(x.getStatus()).introduce(x.getIntroduce()).build()).collect(Collectors.toList());
    }

    //상품 상세
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public GoodsResponse getGood(@PathVariable Long id) {
        Goods goods = goodsService.getGoods(id);
        GoodsResponse response = GoodsResponse.builder().id(goods.getId())
                .name(goods.getName()).url(goods.getUrl()).price(goods.getPrice())
                .status(goods.getStatus()).introduce(goods.getIntroduce()).build();
        return response;
    }

    //상품 수정
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void updateGood(@PathVariable Long id, @RequestBody @Validated GoodsRequest goodsRequest){
        goodsService.updateGood(id, goodsRequest);
    }

    //상품 삭제
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteGood(@PathVariable Long id) {
        goodsService.deleteGood(id);
    }

}
