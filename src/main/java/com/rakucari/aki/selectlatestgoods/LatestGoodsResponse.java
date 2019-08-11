package com.rakucari.aki.selectlatestgoods;

import java.util.List;

/**
 * 最近追加された商品を取得するAPIのレスポンス。
 * @author Akihiro Yamada
 *
 */
public class LatestGoodsResponse {
    /** 最近追加された商品のリスト。 */
    private List<GoodsListPerCategory> latestGoodsList;

    public List<GoodsListPerCategory> getLatestGoodsList() {
        return latestGoodsList;
    }

    public void setLatestGoodsList(List<GoodsListPerCategory> latestGoodsList) {
        this.latestGoodsList = latestGoodsList;
    }

}
