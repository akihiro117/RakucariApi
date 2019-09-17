package com.rakucari.aki.selectgoodsoptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品出品ページに表示するセレクトボックスのデータを取得するコントローラークラス。
 * @author Akihiro Yamada
 *
 */

@RequestMapping("goods-options")
@RestController
@CrossOrigin
@Scope("prototype")
public class GoodsOptionsController {

    @Autowired
    GoodsOptionsService goodsOptionsService;

    @RequestMapping(method = RequestMethod.GET)
    public GoodsOptions fetchGoodsOptions() {

        return goodsOptionsService.fetchGoodsOptions();
    }

}
