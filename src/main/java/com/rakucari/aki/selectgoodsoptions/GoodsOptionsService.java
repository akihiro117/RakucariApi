package com.rakucari.aki.selectgoodsoptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakucari.aki.selectgoodsoptions.mapper.GoodsOptionsMapper;

/**
 * 商品出品ページに表示するセレクトボックスのデータを取得するサービスクラス。
 * @author Akihiro Yamada
 *
 */
@Service
@Transactional
public class GoodsOptionsService {

    @Autowired
    GoodsOptionsMapper goodsOptionsMapper;

    public GoodsOptions fetchGoodsOptions() {
        GoodsOptions goodsOptions = new GoodsOptions();

        goodsOptions.setCategory(goodsOptionsMapper.findAllCategory());
        goodsOptions.setUseStatus(goodsOptionsMapper.findAllUseStatus());
        goodsOptions.setFeeResponsibility(
                goodsOptionsMapper.findAllFeeResponsibility());
        goodsOptions.setSrcRegion(goodsOptionsMapper.findAllSrcRegion());
        goodsOptions.setShippingDate(goodsOptionsMapper.findAllShippingDate());

        return goodsOptions;
    }
}
