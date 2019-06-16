package com.rakucari.aki.selectcategories;

import java.util.ArrayList;
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
        this.categories = new ArrayList<MajorCategory>();
    }

    public void addMajorCategory(MajorCategory majorCategory) {
        this.categories.add(majorCategory);
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
