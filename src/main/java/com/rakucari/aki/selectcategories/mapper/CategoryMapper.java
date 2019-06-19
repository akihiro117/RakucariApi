package com.rakucari.aki.selectcategories.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rakucari.aki.category.MajorCategory;

/**
 * カテゴリーに関するデータアクセス機能を提供。
 * @author Akihiro Yamada
 *
 */
@Mapper
public interface CategoryMapper {

    /**
     * 全カテゴリー(大項目)をcategoryテーブルから取得。
     * @return 全カテゴリー(大項目)。
     */
    public List<MajorCategory> findAllMajorCategories();

}
