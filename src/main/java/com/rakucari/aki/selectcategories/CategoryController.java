package com.rakucari.aki.selectcategories;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakucari.aki.category.MajorCategory;

/**
 * カテゴリーの操作を行うコントローラークラス。
 * @author Akihiro Yamada
 *
 */

@RequestMapping("category")
@RestController
public class CategoryController {

    /**
     * カテゴリーのリストを返す。
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public CategoriesResponse getCategories() {
        CategoriesResponse response = null;

        MajorCategory dummyCategory = new MajorCategory();
        dummyCategory.setName("ダミー1");

        response.addMajorCategory(dummyCategory);

        return response;
    }

}
