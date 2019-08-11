package com.rakucari.aki.goods;

/**
 * 商品情報を扱うクラス。
 * @author Akihiro Yamada
 *
 */
public class Goods {
    /** 商品名。*/
    private String goodsName;

    /** 商品詳細ページのURL。 */
    private String goodsDetailUrl;

    /** 商品画像のURL。 */
    private String imgUrl;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDetailUrl() {
        return goodsDetailUrl;
    }

    public void setGoodsDetailUrl(String goodsDetailUrl) {
        this.goodsDetailUrl = goodsDetailUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}
