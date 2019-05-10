package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebContent;
import com.sy.stu.school.pojo.po.WebContentExample;
import com.sy.stu.school.pojo.po.WebContentWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebContentMapper {
    int countByExample(WebContentExample example);

    int deleteByExample(WebContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebContentWithBLOBs record);

    int insertSelective(WebContentWithBLOBs record);

    List<WebContentWithBLOBs> selectByExampleWithBLOBs(WebContentExample example);

    List<WebContent> selectByExample(WebContentExample example);

    WebContentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebContentWithBLOBs record, @Param("example") WebContentExample example);

    int updateByExampleWithBLOBs(@Param("record") WebContentWithBLOBs record, @Param("example") WebContentExample example);

    int updateByExample(@Param("record") WebContent record, @Param("example") WebContentExample example);

    int updateByPrimaryKeySelective(WebContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WebContentWithBLOBs record);

    int updateByPrimaryKey(WebContent record);
}