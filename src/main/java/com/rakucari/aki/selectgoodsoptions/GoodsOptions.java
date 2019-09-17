package com.rakucari.aki.selectgoodsoptions;

import java.util.List;

import com.rakucari.aki.category.MajorCategory;

/**
 * 商品出品ページに表示するセレクトボックスのデータ。
 * @author Akihiro Yamada
 *
 */
public class GoodsOptions {

    private List<MajorCategory> category;

    /** 商品の状態。 */
    private List<UseStatus> useStatus;

    /** 配送料負担。 */
    private List<FeeResponsibility> feeResponsibility;

    private List<SrcRegion> srcRegion;

    private List<ShippingDate> shippingDate;

    public List<MajorCategory> getCategory() {
        return category;
    }

    public void setCategory(List<MajorCategory> category) {
        this.category = category;
    }

    public List<UseStatus> getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(List<UseStatus> useStatus) {
        this.useStatus = useStatus;
    }

    public List<FeeResponsibility> getFeeResponsibility() {
        return feeResponsibility;
    }

    public void setFeeResponsibility(
            List<FeeResponsibility> feeResponsibility) {
        this.feeResponsibility = feeResponsibility;
    }

    public List<SrcRegion> getSrcRegion() {
        return srcRegion;
    }

    public void setSrcRegion(List<SrcRegion> srcRegion) {
        this.srcRegion = srcRegion;
    }

    public List<ShippingDate> getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(List<ShippingDate> shippingDate) {
        this.shippingDate = shippingDate;
    }


}
