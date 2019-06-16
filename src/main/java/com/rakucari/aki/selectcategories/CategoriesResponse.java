package com.rakucari.aki.selectcategories;

import java.util.List;

import com.rakucari.aki.category.MajorCategory;


/**
 * カテゴリーを取得するAPIのレスポンス。
 * @author Akihiro Yamada
 *
 */
public class CategoriesResponse {
    private List<MajorCategory> categories;

    public CategoriesResponse() {
    }

    public boolean hasMajorCategories() {
        return this.categories.size() != 0;
    }

    public List<MajorCategory> getMajorCategories() {
        return this.categories;
    }

    public void setMajorCategories(List<MajorCategory> categories) {
        this.categories = categories;
    }

}
