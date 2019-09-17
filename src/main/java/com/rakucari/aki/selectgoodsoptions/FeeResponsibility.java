package com.rakucari.aki.selectgoodsoptions;

/**
 * 配送料負担を扱うデータクラス。
 * @author Akihiro Yamada
 *
 */
public class FeeResponsibility {
    private String id;

    private String feeResponsibility;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeeResponsibility() {
        return feeResponsibility;
    }

    public void setFeeResponsibility(String feeResponsibility) {
        this.feeResponsibility = feeResponsibility;
    }

}
