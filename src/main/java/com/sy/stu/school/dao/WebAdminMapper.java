package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebAdmin;
import com.sy.stu.school.pojo.po.WebAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebAdminMapper {
    int countByExample(WebAdminExample example);

    int deleteByExample(WebAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebAdmin record);

    int insertSelective(WebAdmin record);

    List<WebAdmin> selectByExampleWithBLOBs(WebAdminExample example);

    List<WebAdmin> selectByExample(WebAdminExample example);

    WebAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    int updateByExampleWithBLOBs(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    int updateByExample(@Param("record") WebAdmin record, @Param("example") WebAdminExample example);

    int updateByPrimaryKeySelective(WebAdmin record);

    int updateByPrimaryKeyWithBLOBs(WebAdmin record);

    int updateByPrimaryKey(WebAdmin record);
}