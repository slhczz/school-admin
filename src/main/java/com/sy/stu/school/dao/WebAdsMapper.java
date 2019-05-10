package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebAds;
import com.sy.stu.school.pojo.po.WebAdsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebAdsMapper {
    int countByExample(WebAdsExample example);

    int deleteByExample(WebAdsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebAds record);

    int insertSelective(WebAds record);

    List<WebAds> selectByExampleWithBLOBs(WebAdsExample example);

    List<WebAds> selectByExample(WebAdsExample example);

    WebAds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebAds record, @Param("example") WebAdsExample example);

    int updateByExampleWithBLOBs(@Param("record") WebAds record, @Param("example") WebAdsExample example);

    int updateByExample(@Param("record") WebAds record, @Param("example") WebAdsExample example);

    int updateByPrimaryKeySelective(WebAds record);

    int updateByPrimaryKeyWithBLOBs(WebAds record);

    int updateByPrimaryKey(WebAds record);
}