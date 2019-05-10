package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebVote;
import com.sy.stu.school.pojo.po.WebVoteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebVoteMapper {
    int countByExample(WebVoteExample example);

    int deleteByExample(WebVoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebVote record);

    int insertSelective(WebVote record);

    List<WebVote> selectByExampleWithBLOBs(WebVoteExample example);

    List<WebVote> selectByExample(WebVoteExample example);

    WebVote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebVote record, @Param("example") WebVoteExample example);

    int updateByExampleWithBLOBs(@Param("record") WebVote record, @Param("example") WebVoteExample example);

    int updateByExample(@Param("record") WebVote record, @Param("example") WebVoteExample example);

    int updateByPrimaryKeySelective(WebVote record);

    int updateByPrimaryKeyWithBLOBs(WebVote record);

    int updateByPrimaryKey(WebVote record);
}