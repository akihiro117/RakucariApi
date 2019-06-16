package com.rakucari.aki.selectcategories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * カテゴリーの操作を行うコントローラークラス。
 * @author Akihiro Yamada
 *
 */

@RequestMapping("category")
@RestController
public class CategoryController {

    @Autowired
    private SelectCategoriesService selectCategoriesService;

    /**
     * カテゴリーのリストを返す。
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public CategoriesResponse getCategories() {
        CategoriesResponse response = new CategoriesResponse();

        response.setMajorCategories(
                selectCategoriesService.findAllCategories());

        return response;
    }

}
