package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebChange;
import com.sy.stu.school.pojo.po.WebChangeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebChangeMapper {
    int countByExample(WebChangeExample example);

    int deleteByExample(WebChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebChange record);

    int insertSelective(WebChange record);

    List<WebChange> selectByExample(WebChangeExample example);

    WebChange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebChange record, @Param("example") WebChangeExample example);

    int updateByExample(@Param("record") WebChange record, @Param("example") WebChangeExample example);

    int updateByPrimaryKeySelective(WebChange record);

    int updateByPrimaryKey(WebChange record);
}