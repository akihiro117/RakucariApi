package com.rakucari.aki.selectcategories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakucari.aki.category.MajorCategory;
import com.rakucari.aki.selectcategories.mapper.CategoryMapper;

/**
 * カテゴリー(大項目)を取得するサービスクラス。
 * @author Akihiro Yamada
 *
 */
@Service
public class SelectMajorCategoriesService {

    @Autowired
    CategoryMapper categoryMapper;

    /**
     * 全カテゴリー(大項目)を取得する。
     * @return 全カテゴリー(大項目)のリスト。
     */
    public List<MajorCategory> selectAllMajorCategories() {
        List<MajorCategory> majorCategories = new ArrayList<MajorCategory>();

        // 全カテゴリー(大項目)を取得。
        majorCategories = categoryMapper.findAllMajorCategories();

        return majorCategories;
    }
}
