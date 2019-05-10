package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebJobs;
import com.sy.stu.school.pojo.po.WebJobsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebJobsMapper {
    int countByExample(WebJobsExample example);

    int deleteByExample(WebJobsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebJobs record);

    int insertSelective(WebJobs record);

    List<WebJobs> selectByExampleWithBLOBs(WebJobsExample example);

    List<WebJobs> selectByExample(WebJobsExample example);

    WebJobs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebJobs record, @Param("example") WebJobsExample example);

    int updateByExampleWithBLOBs(@Param("record") WebJobs record, @Param("example") WebJobsExample example);

    int updateByExample(@Param("record") WebJobs record, @Param("example") WebJobsExample example);

    int updateByPrimaryKeySelective(WebJobs record);

    int updateByPrimaryKeyWithBLOBs(WebJobs record);

    int updateByPrimaryKey(WebJobs record);
}