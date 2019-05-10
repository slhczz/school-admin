package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebOrder;
import com.sy.stu.school.pojo.po.WebOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebOrderMapper {
    int countByExample(WebOrderExample example);

    int deleteByExample(WebOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebOrder record);

    int insertSelective(WebOrder record);

    List<WebOrder> selectByExampleWithBLOBs(WebOrderExample example);

    List<WebOrder> selectByExample(WebOrderExample example);

    WebOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebOrder record, @Param("example") WebOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") WebOrder record, @Param("example") WebOrderExample example);

    int updateByExample(@Param("record") WebOrder record, @Param("example") WebOrderExample example);

    int updateByPrimaryKeySelective(WebOrder record);

    int updateByPrimaryKeyWithBLOBs(WebOrder record);

    int updateByPrimaryKey(WebOrder record);
}