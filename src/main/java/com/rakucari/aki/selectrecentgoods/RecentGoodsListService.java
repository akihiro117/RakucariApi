package com.rakucari.aki.selectrecentgoods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakucari.aki.selectrecentgoods.mapper.RecentGoodsMapper;

/**
 * 最近追加された商品を取得するサービスクラス。
 * @author Akihiro Yamada
 *
 */
@Service
@Transactional
public class RecentGoodsListService {

    /** 最近追加された商品を取得するmapper。 */
    @Autowired
    RecentGoodsMapper recentGoodsMapper;

    public List<GoodsListPerCategory> fetchRecentGoodsList() {

        List<GoodsListPerCategory> recentGoodsList = new ArrayList<GoodsListPerCategory>();
        recentGoodsList = recentGoodsMapper.findRecentGoods();

        return recentGoodsList;
    }
}
