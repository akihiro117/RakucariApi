package com.rakucari.aki.selectgoodsdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakucari.aki.goods.Goods;
import com.rakucari.aki.selectgoodsdetail.mapper.GoodsDetailMapper;

/**
 * 商品の詳細情報を取得するサービスクラス。
 * @author Akihiro Yamada
 *
 */
@Service
@Transactional
public class GoodsDetailService {
    /** 商品の詳細情報を取得するmapper。 */
    @Autowired
    GoodsDetailMapper goodsDetailMapper;

    /**
     * 引数で指定された商品の詳細情報を取得。
     * @param id 詳細情報を取得したい商品のID。
     * @return 商品の詳細情報。
     */
    public Goods fetchGoodsDetail(Integer id) {
        Goods goodsDetail = new Goods();
        goodsDetail = goodsDetailMapper.findGoodsDetail(id);

        return goodsDetail;
    }

}
