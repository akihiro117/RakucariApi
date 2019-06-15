package com.rakucari.aki.selectcategories;

import java.util.List;
import java.util.Locale.Category;

/**
 * カテゴリーを取得するAPIのレスポンス。
 * @author Akihiro Yamada
 *
 */
public class CategoriesResponse {
    private List<Category> categories;

    public boolean hasCategories() {
        return categories.size() != 0;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
