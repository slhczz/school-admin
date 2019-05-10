package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebNews;
import com.sy.stu.school.pojo.po.WebNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebNewsMapper {
    int countByExample(WebNewsExample example);

    int deleteByExample(WebNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebNews record);

    int insertSelective(WebNews record);

    List<WebNews> selectByExampleWithBLOBs(WebNewsExample example);

    List<WebNews> selectByExample(WebNewsExample example);

    WebNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebNews record, @Param("example") WebNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") WebNews record, @Param("example") WebNewsExample example);

    int updateByExample(@Param("record") WebNews record, @Param("example") WebNewsExample example);

    int updateByPrimaryKeySelective(WebNews record);

    int updateByPrimaryKeyWithBLOBs(WebNews record);

    int updateByPrimaryKey(WebNews record);
}