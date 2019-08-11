package com.rakucari.aki.selectlatestgoods;

import java.util.List;

import com.rakucari.aki.goods.Goods;

/**
 * 最近追加された商品を取得するAPIのレスポンス。
 * @author Akihiro Yamada
 *
 */
public class LatestGoodsResponse {
    /** 最近追加された商品のリスト。 */
    private List<Goods> latestGoodsList;

    public List<Goods> getLatestGoodsList() {
        return latestGoodsList;
    }

    public void setLatestGoodsList(List<Goods> latestGoodsList) {
        this.latestGoodsList = latestGoodsList;
    }
}
