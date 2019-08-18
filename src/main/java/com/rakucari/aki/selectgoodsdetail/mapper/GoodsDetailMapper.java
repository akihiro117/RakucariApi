package com.rakucari.aki.selectgoodsdetail.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.rakucari.aki.goods.Goods;

/**
 * 商品の詳細情報に関するデータアクセス機能を提供。
 * @author Akihiro Yamada
 *
 */
@Mapper
public interface GoodsDetailMapper {

    /**
     * 引数で指定された商品の情報を取得。
     * @return 引数で指定された商品の情報。
     */
    public Goods findGoodsDetail(Integer id);
}
