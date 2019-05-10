package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebVideo;
import com.sy.stu.school.pojo.po.WebVideoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebVideoMapper {
    int countByExample(WebVideoExample example);

    int deleteByExample(WebVideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebVideo record);

    int insertSelective(WebVideo record);

    List<WebVideo> selectByExampleWithBLOBs(WebVideoExample example);

    List<WebVideo> selectByExample(WebVideoExample example);

    WebVideo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebVideo record, @Param("example") WebVideoExample example);

    int updateByExampleWithBLOBs(@Param("record") WebVideo record, @Param("example") WebVideoExample example);

    int updateByExample(@Param("record") WebVideo record, @Param("example") WebVideoExample example);

    int updateByPrimaryKeySelective(WebVideo record);

    int updateByPrimaryKeyWithBLOBs(WebVideo record);

    int updateByPrimaryKey(WebVideo record);
}