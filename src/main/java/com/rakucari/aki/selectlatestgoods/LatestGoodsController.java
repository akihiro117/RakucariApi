package com.rakucari.aki.selectlatestgoods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakucari.aki.goods.Goods;

/**
 * 最近追加された商品の一覧を扱うコントローラークラス。
 * @author Akihiro Yamada
 *
 */

@RequestMapping("latest-goods")
@RestController
@CrossOrigin
@Scope("prototype")
public class LatestGoodsController {

    /**
     * 最近追加された商品のリストを返す。
     * @return 最近追加された商品のリスト。
     */
    @RequestMapping(method = RequestMethod.GET)
    public LatestGoodsResponse fetchLatestGoods() {
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

        LatestGoodsResponse res = new LatestGoodsResponse();
        res.setLatestGoodsList(dummy);

        return res;
    }
}
