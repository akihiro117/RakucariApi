package com.rakucari.aki.category;

import java.util.List;

/**
 * 商品のカテゴリー(大項目)を扱うクラス。
 * @author Akihiro Yamada
 *
 */
public class MajorCategory {
    private String id;

    private String name;

    /** カテゴリーから検索するページのURL。*/
    private String url;

    /** このカテゴリーに属するサブカテゴリー。*/
    private List<SubCategory> subCategories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
