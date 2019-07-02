package com.rakucari.aki.category;


/**
 * 商品のサブカテゴリー(中項目)を扱うクラス。
 * @author Akihiro Yamada
 *
 */
public class SubCategory {
    private String name;

    /** サブカテゴリーから検索するページのURL。 */
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
