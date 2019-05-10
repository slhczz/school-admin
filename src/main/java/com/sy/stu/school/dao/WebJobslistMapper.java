package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebJobslist;
import com.sy.stu.school.pojo.po.WebJobslistExample;
import com.sy.stu.school.pojo.po.WebJobslistWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebJobslistMapper {
    int countByExample(WebJobslistExample example);

    int deleteByExample(WebJobslistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebJobslistWithBLOBs record);

    int insertSelective(WebJobslistWithBLOBs record);

    List<WebJobslistWithBLOBs> selectByExampleWithBLOBs(WebJobslistExample example);

    List<WebJobslist> selectByExample(WebJobslistExample example);

    WebJobslistWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebJobslistWithBLOBs record, @Param("example") WebJobslistExample example);

    int updateByExampleWithBLOBs(@Param("record") WebJobslistWithBLOBs record, @Param("example") WebJobslistExample example);

    int updateByExample(@Param("record") WebJobslist record, @Param("example") WebJobslistExample example);

    int updateByPrimaryKeySelective(WebJobslistWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WebJobslistWithBLOBs record);

    int updateByPrimaryKey(WebJobslist record);
}