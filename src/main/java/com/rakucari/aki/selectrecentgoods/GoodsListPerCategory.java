package com.rakucari.aki.selectrecentgoods;

import java.util.List;

import com.rakucari.aki.goods.Goods;

/**
 * 最近追加された商品のリストとカテゴリーを持つクラス。
 * @author Akihiro Yamada
 *
 */
public class GoodsListPerCategory {
    /** カテゴリー名 */
    private String categoryName;

    /** 最近追加された商品のリスト。 */
    private List<Goods> recentGoodsList;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Goods> getRecentGoodsList() {
        return recentGoodsList;
    }

    public void setRecentGoodsList(List<Goods> recentGoodsList) {
        this.recentGoodsList = recentGoodsList;
    }
}
