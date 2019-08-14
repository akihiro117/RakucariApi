package com.rakucari.aki.selectrecentgoods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rakucari.aki.selectrecentgoods.GoodsListPerCategory;

/**
 * 最近追加された商品に関するデータアクセス機能を提供。
 * @author Akihiro Yamada
 *
 */
@Mapper
public interface RecentGoodsMapper {
    /**
     * 最近追加された商品をカテゴリー毎に取得。
     * @return カテゴリー毎の最近追加された商品。
     */
    public List<GoodsListPerCategory> findRecentGoods();
}
