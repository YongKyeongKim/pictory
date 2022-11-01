package com.project.pictory.goods.service;

import com.project.pictory.goods.controller.request.GoodsRequest;
import com.project.pictory.goods.controller.request.GoodsSearch;
import com.project.pictory.goods.domain.Goods;
import com.project.pictory.goods.repository.GoodsRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class GoodsService {
    private GoodsRepository repository;

    public Goods getGoods(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Goods> getGoods(GoodsSearch search, Sort sort){
        return repository.findAll();
    }
    public void createGood(GoodsRequest goodsRequest){
        Goods goods = new Goods();
        goods.post(goodsRequest);
        repository.save(goods);
    }

    public void updateGood(Long goodId, GoodsRequest goodsRequest){
        Goods goods = repository.findById(goodId).orElseThrow();
        goods.update(goodsRequest);
        repository.save(goods);
    }

    public void deleteGood(Long goodId){
        repository.deleteById(goodId);
    }

}
