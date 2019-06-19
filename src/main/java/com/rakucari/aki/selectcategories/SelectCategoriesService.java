package com.rakucari.aki.selectcategories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakucari.aki.category.MajorCategory;
import com.rakucari.aki.selectcategories.mapper.CategoryMapper;

/**
 * カテゴリーを取得するサービスクラス。
 * @author Akihiro Yamada
 *
 */
@Service
public class SelectCategoriesService {

    @Autowired
    CategoryMapper categoryMapper;

    /**
     * 全カテゴリー(大項目)を取得する。
     * @return 全カテゴリー(大項目)のリスト。
     */
    public List<MajorCategory> findAllCategories() {
        List<MajorCategory> majorCategories = new ArrayList<MajorCategory>();

        majorCategories = categoryMapper.findAllMajorCategories();

        //        // TODO: mapperを使って全カテゴリーを取得する。
        //        // 今はまだダミー。
        //        MajorCategory dummy = new MajorCategory();
        //        dummy.setName("dummy2");
        //        List<SubCategory> subCategories = new ArrayList<SubCategory>();
        //        SubCategory subCategory = new SubCategory();
        //        subCategory.setName("dummySub");
        //        subCategory.setUrl("suburl");
        //        subCategories.add(subCategory);
        //        dummy.setSubCategories(subCategories);
        //        dummy.setUrl("http://localhost:8080/rakucari/catetory");
        //
        //        majorCategories.add(dummy);

        return majorCategories;
    }
}
