package com.rakucari.aki.selectgoodsdetail;

import com.rakucari.aki.goods.Goods;

/**
 * 商品の詳細情報を取得するAPIのレスポンス用のクラス。
 * @author Akihiro
 *
 */
public class GoodsDetailResponse {
    /** 商品の詳細情報。 */
    private Goods goodsDetail;

    public Goods getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(Goods goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

}
