package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebMenu;
import com.sy.stu.school.pojo.po.WebMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebMenuMapper {
    int countByExample(WebMenuExample example);

    int deleteByExample(WebMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebMenu record);

    int insertSelective(WebMenu record);

    List<WebMenu> selectByExample(WebMenu example);

    WebMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebMenu record, @Param("example") WebMenuExample example);

    int updateByExample(@Param("record") WebMenu record, @Param("example") WebMenuExample example);

    int updateByPrimaryKeySelective(WebMenu record);

    int updateByPrimaryKey(WebMenu record);
}