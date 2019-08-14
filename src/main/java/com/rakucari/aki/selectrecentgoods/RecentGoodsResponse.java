package com.rakucari.aki.selectrecentgoods;

import java.util.List;

/**
 * 最近追加された商品を取得するAPIのレスポンス用クラス。
 * @author Akihiro Yamada
 *
 */
public class RecentGoodsResponse {
    /** 最近追加された商品のリスト。 */
    private List<GoodsListPerCategory> recentGoodsList;

    public List<GoodsListPerCategory> getRecentGoodsList() {
        return recentGoodsList;
    }

    public void setRecentGoodsList(List<GoodsListPerCategory> recentGoodsList) {
        this.recentGoodsList = recentGoodsList;
    }

}
