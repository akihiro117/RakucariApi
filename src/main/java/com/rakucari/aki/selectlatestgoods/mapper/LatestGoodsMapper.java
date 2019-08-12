package com.rakucari.aki.selectlatestgoods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rakucari.aki.selectlatestgoods.GoodsListPerCategory;

/**
 * 最近追加された商品に関するデータアクセス機能を提供。
 * @author Akihiro Yamada
 *
 */
@Mapper
public interface LatestGoodsMapper {
    /**
     * 最近追加された商品をカテゴリー毎に取得。
     * @return カテゴリー毎の最近追加された商品。
     */
    public List<GoodsListPerCategory> findLatestGoods();
}
