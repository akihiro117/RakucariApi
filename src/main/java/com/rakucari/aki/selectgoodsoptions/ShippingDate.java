package com.rakucari.aki.selectgoodsoptions;

/**
 * 配送予定日を扱うデータクラス。
 * @author Akihiro Yamada
 *
 */
public class ShippingDate {
    private String id;

    private String shippingDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

}
