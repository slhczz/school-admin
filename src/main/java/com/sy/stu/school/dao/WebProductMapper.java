package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebProduct;
import com.sy.stu.school.pojo.po.WebProductExample;
import com.sy.stu.school.pojo.po.WebProductWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebProductMapper {
    int countByExample(WebProductExample example);

    int deleteByExample(WebProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebProductWithBLOBs record);

    int insertSelective(WebProductWithBLOBs record);

    List<WebProductWithBLOBs> selectByExampleWithBLOBs(WebProductExample example);

    List<WebProduct> selectByExample(WebProductExample example);

    WebProductWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebProductWithBLOBs record, @Param("example") WebProductExample example);

    int updateByExampleWithBLOBs(@Param("record") WebProductWithBLOBs record, @Param("example") WebProductExample example);

    int updateByExample(@Param("record") WebProduct record, @Param("example") WebProductExample example);

    int updateByPrimaryKeySelective(WebProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WebProductWithBLOBs record);

    int updateByPrimaryKey(WebProduct record);
}