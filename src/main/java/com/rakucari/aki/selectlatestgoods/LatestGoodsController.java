package com.rakucari.aki.selectlatestgoods;

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
    public void fetchLatestGoods() {
        Goods dummy1 = new Goods();
        dummy1.setGoodsName("ダミーの商品1");
        dummy1.setImgUrl("/assets/images/dummy-goods1/dummy1.png");

        GoodsListPerCategory dummyList1 = new GoodsListPerCategory();

        Goods dummy2 = new Goods();
        dummy2.setGoodsName("ダミーの商品2");
        dummy2.setImgUrl("/assets/images/dummy-goods2/dummy2.png");


        LatestGoodsResponse res = new LatestGoodsResponse();
    }
}
