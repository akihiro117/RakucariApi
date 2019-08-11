package com.rakucari.aki.selectlatestgoods;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    }
}
