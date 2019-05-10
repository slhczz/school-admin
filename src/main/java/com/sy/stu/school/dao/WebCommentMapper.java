package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebComment;
import com.sy.stu.school.pojo.po.WebCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebCommentMapper {
    int countByExample(WebCommentExample example);

    int deleteByExample(WebCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebComment record);

    int insertSelective(WebComment record);

    List<WebComment> selectByExampleWithBLOBs(WebCommentExample example);

    List<WebComment> selectByExample(WebCommentExample example);

    WebComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebComment record, @Param("example") WebCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") WebComment record, @Param("example") WebCommentExample example);

    int updateByExample(@Param("record") WebComment record, @Param("example") WebCommentExample example);

    int updateByPrimaryKeySelective(WebComment record);

    int updateByPrimaryKeyWithBLOBs(WebComment record);

    int updateByPrimaryKey(WebComment record);
}