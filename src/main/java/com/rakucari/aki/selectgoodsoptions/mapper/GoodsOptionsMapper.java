package com.rakucari.aki.selectgoodsoptions.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rakucari.aki.category.MajorCategory;
import com.rakucari.aki.selectgoodsoptions.FeeResponsibility;
import com.rakucari.aki.selectgoodsoptions.ShippingDate;
import com.rakucari.aki.selectgoodsoptions.SrcRegion;
import com.rakucari.aki.selectgoodsoptions.UseStatus;

/**
 * 商品出品ページに表示するセレクトボックスのデータに関するデータアクセス機能を提供。
 * @author Akihiro Yamada
 *
 */
@Mapper
public interface GoodsOptionsMapper {

    /**
     * 全カテゴリーデータを取得。
     * @return 全カテゴリーデータ。
     */
    public List<MajorCategory> findAllCategory();

    /**
     * 全商品状態を取得。
     * @return 全商品状態。
     */
    public List<UseStatus> findAllUseStatus();

    /**
     * 全配送料負担を取得。
     * @return 全配送料負担。
     */
    public List<FeeResponsibility> findAllFeeResponsibility();

    /**
     * 全発送元地域を取得。
     * @return
     */
    public List<SrcRegion> findAllSrcRegion();

    /**
     * 全出荷予定日を取得。
     * @return 全出荷予定日。
     */
    public List<ShippingDate> findAllShippingDate();
}
