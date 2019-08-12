package com.rakucari.aki.selectcategories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@Scope("prototype")
public class CategoryController {

    @Autowired
    private SelectMajorCategoriesService selectCategoriesService;

    /**
     * カテゴリーのリストを返す。
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public CategoriesResponse getCategories() {
        CategoriesResponse response = new CategoriesResponse();

        response.setMajorCategories(
                selectCategoriesService.selectAllMajorCategories());

        return response;
    }

}
