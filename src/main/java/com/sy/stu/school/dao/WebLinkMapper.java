package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebLink;
import com.sy.stu.school.pojo.po.WebLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebLinkMapper {
    int countByExample(WebLinkExample example);

    int deleteByExample(WebLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebLink record);

    int insertSelective(WebLink record);

    List<WebLink> selectByExampleWithBLOBs(WebLinkExample example);

    List<WebLink> selectByExample(WebLinkExample example);

    WebLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebLink record, @Param("example") WebLinkExample example);

    int updateByExampleWithBLOBs(@Param("record") WebLink record, @Param("example") WebLinkExample example);

    int updateByExample(@Param("record") WebLink record, @Param("example") WebLinkExample example);

    int updateByPrimaryKeySelective(WebLink record);

    int updateByPrimaryKeyWithBLOBs(WebLink record);

    int updateByPrimaryKey(WebLink record);
}