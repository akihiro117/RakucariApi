package com.rakucari.aki.category;

import com.rakucari.aki.common.Url;

/**
 * 商品のサブカテゴリー(中項目)を扱うクラス。
 * @author Akihiro Yamada
 *
 */
public class SubCategory {
    private String name;

    /** サブカテゴリーから検索するページのURL。 */
    private Url url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Url getUrl() {
        return url;
    }

    /**
     * mapperを使用してDBから取得した値を設定するために、
     * String型を引数にとる。
     * @param url サブカテゴリー(中項目)のURL。
     */
    public void setUrl(Url url) {
        this.url = url;
    }

}
