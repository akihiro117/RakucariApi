package com.rakucari.aki.selectlatestgoods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakucari.aki.selectlatestgoods.mapper.LatestGoodsMapper;

/**
 * 最近追加された商品を取得するサービスクラス。
 * @author Akihiro Yamada
 *
 */
@Service
@Transactional
public class LatestGoodsListService {

    @Autowired
    LatestGoodsMapper latestGoodsMapper;

    public List<GoodsListPerCategory> fetchLatestGoodsList() {

        List<GoodsListPerCategory> latestGoodsList = new ArrayList<GoodsListPerCategory>();

        latestGoodsList = latestGoodsMapper.findLatestGoods();

        return latestGoodsList;
    }
}
