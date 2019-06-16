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

    public void addMajorCategory(MajorCategory majorCategory) {
        categories.add(majorCategory);
    }

    public boolean hasMajorCategories() {
        return categories.size() != 0;
    }

    public List<MajorCategory> getMajorCategories() {
        return categories;
    }

    public void setMajorCategories(List<MajorCategory> categories) {
        this.categories = categories;
    }

}
