package com.rakucari.aki.selectgoodsdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品の詳細情報を扱うコントローラークラス。
 * @author Akihiro Yamada
 *
 */

@RequestMapping("goods-detail")
@RestController
@CrossOrigin
@Scope("prototype")
public class GoodsDetailController {

    /** 商品情報を取得するservice。 */
    @Autowired
    GoodsDetailService goodsDetailService;

    @RequestMapping(method = RequestMethod.GET)
    public GoodsDetailResponse fetchGoodsDetail() {
        GoodsDetailResponse res = new GoodsDetailResponse();

        res.setGoodsDetail(goodsDetailService.fetchGoodsDetail(1));

        return res;
    }
}
