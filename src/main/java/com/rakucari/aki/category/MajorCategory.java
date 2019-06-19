package com.rakucari.aki.category;

import java.util.List;

import com.rakucari.aki.common.Url;

/**
 * 商品のカテゴリー(大項目)を扱うクラス。
 * @author Akihiro Yamada
 *
 */
public class MajorCategory {
    private String name;

    /** カテゴリーから検索するページのURL。*/
    private Url url;

    /** このカテゴリーに属するサブカテゴリー。*/
    private List<SubCategory> subCategories;

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
     * @param url カテゴリー(大項目)のURL。
     */
    public void setUrl(Url url) {
        this.url = url;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public boolean hasSubCategory() {
        return subCategories.size() != 0;
    }

}
