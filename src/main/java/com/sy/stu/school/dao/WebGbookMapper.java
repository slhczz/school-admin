package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebGbook;
import com.sy.stu.school.pojo.po.WebGbookExample;
import com.sy.stu.school.pojo.po.WebGbookWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebGbookMapper {
    int countByExample(WebGbookExample example);

    int deleteByExample(WebGbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebGbookWithBLOBs record);

    int insertSelective(WebGbookWithBLOBs record);

    List<WebGbookWithBLOBs> selectByExampleWithBLOBs(WebGbookExample example);

    List<WebGbook> selectByExample(WebGbookExample example);

    WebGbookWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebGbookWithBLOBs record, @Param("example") WebGbookExample example);

    int updateByExampleWithBLOBs(@Param("record") WebGbookWithBLOBs record, @Param("example") WebGbookExample example);

    int updateByExample(@Param("record") WebGbook record, @Param("example") WebGbookExample example);

    int updateByPrimaryKeySelective(WebGbookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WebGbookWithBLOBs record);

    int updateByPrimaryKey(WebGbook record);
}