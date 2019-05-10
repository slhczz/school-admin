package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebSuper;
import com.sy.stu.school.pojo.po.WebSuperExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebSuperMapper {
    int countByExample(WebSuperExample example);

    int deleteByExample(WebSuperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebSuper record);

    int insertSelective(WebSuper record);

    List<WebSuper> selectByExampleWithBLOBs(WebSuperExample example);

    List<WebSuper> selectByExample(WebSuperExample example);

    WebSuper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebSuper record, @Param("example") WebSuperExample example);

    int updateByExampleWithBLOBs(@Param("record") WebSuper record, @Param("example") WebSuperExample example);

    int updateByExample(@Param("record") WebSuper record, @Param("example") WebSuperExample example);

    int updateByPrimaryKeySelective(WebSuper record);

    int updateByPrimaryKeyWithBLOBs(WebSuper record);

    int updateByPrimaryKey(WebSuper record);
}