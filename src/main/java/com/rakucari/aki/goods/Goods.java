package com.rakucari.aki.goods;

/**
 * 商品情報を扱うクラス。
 * @author Akihiro Yamada
 *
 */
public class Goods {
    /** 商品ID。 */
    private String id;

    /** 商品名。*/
    private String goodsName;

    /** 商品画像のURL。 */
    private String imgUrl;

    /** カテゴリー(大項目)。 */
    private String majorCategory;

    /** 商品の状態。 */
    private String useStatus;

    /** 配送料負担。 */
    private String feeResponsibility;

    /** 配送元地域。 */
    private String srcRegion;

    /** 発送日の目安。 */
    private String shippingDate;

    /** 価格。 */
    private int price;

    /** 商品説明。 */
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMajorCategory() {
        return majorCategory;
    }

    public void setMajorCategory(String majorCategory) {
        this.majorCategory = majorCategory;
    }

    public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public String getFeeResponsibility() {
        return feeResponsibility;
    }

    public void setFeeResponsibility(String feeResponsibility) {
        this.feeResponsibility = feeResponsibility;
    }

    public String getSrcRegion() {
        return srcRegion;
    }

    public void setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
