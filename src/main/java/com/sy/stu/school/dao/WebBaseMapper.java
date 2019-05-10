package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebBase;
import com.sy.stu.school.pojo.po.WebBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebBaseMapper {
    int countByExample(WebBaseExample example);

    int deleteByExample(WebBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebBase record);

    int insertSelective(WebBase record);

    List<WebBase> selectByExampleWithBLOBs(WebBaseExample example);

    List<WebBase> selectByExample(WebBaseExample example);

    WebBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebBase record, @Param("example") WebBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") WebBase record, @Param("example") WebBaseExample example);

    int updateByExample(@Param("record") WebBase record, @Param("example") WebBaseExample example);

    int updateByPrimaryKeySelective(WebBase record);

    int updateByPrimaryKeyWithBLOBs(WebBase record);

    int updateByPrimaryKey(WebBase record);
}