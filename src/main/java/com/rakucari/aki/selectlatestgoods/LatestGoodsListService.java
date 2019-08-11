package com.rakucari.aki.selectlatestgoods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakucari.aki.goods.Goods;

/**
 * 最近追加された商品を取得するサービスクラス。
 * @author Akihiro Yamada
 *
 */
@Service
@Transactional
public class LatestGoodsListService {

    public List<GoodsListPerCategory> fetchLatestGoodsList() {
        Goods dummy1 = new Goods();
        dummy1.setGoodsName("ダミーの商品1");
        dummy1.setImgUrl("/assets/images/dummy-goods1/dummy1.png");

        List<Goods> dummyGoods1 = new ArrayList<Goods>();
        dummyGoods1.add(dummy1);

        GoodsListPerCategory dummyList1 = new GoodsListPerCategory();
        dummyList1.setCategoryName("カテゴリー1");
        dummyList1.setRecentlyGoodsList(dummyGoods1);

        Goods dummy2 = new Goods();
        dummy2.setGoodsName("ダミーの商品2");
        dummy2.setImgUrl("/assets/images/dummy-goods2/dummy2.png");

        List<Goods> dummyGoods2 = new ArrayList<Goods>();
        dummyGoods2.add(dummy2);

        GoodsListPerCategory dummyList2 = new GoodsListPerCategory();
        dummyList2.setCategoryName("カテゴリー2");
        dummyList2.setRecentlyGoodsList(dummyGoods2);

        List<GoodsListPerCategory> dummy = new ArrayList<GoodsListPerCategory>();
        dummy.add(dummyList1);
        dummy.add(dummyList2);

        return dummy;
    }
}
