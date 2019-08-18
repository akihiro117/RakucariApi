package com.rakucari.aki.selectgoodsdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * 引数で指定されたIDの商品情報を取得。
     * @param goodsId 情報を取得する商品のID。
     * @return 引数で指定されたIDの商品情報を含むレスポンス用クラス。
     */
    @RequestMapping(path = "{goodsId}", method = RequestMethod.GET)
    public GoodsDetailResponse fetchGoodsDetail(@PathVariable String goodsId) {
        GoodsDetailResponse res = new GoodsDetailResponse();

        // TODO: goodsIdの数値チェックを行う。

        // goodsIdに該当する商品の情報を取得してレスポンスに設定。
        res.setGoodsDetail(
                goodsDetailService.fetchGoodsDetail(Integer.parseInt(goodsId)));

        return res;
    }
}
