package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebDownload;
import com.sy.stu.school.pojo.po.WebDownloadExample;
import com.sy.stu.school.pojo.po.WebDownloadWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebDownloadMapper {
    int countByExample(WebDownloadExample example);

    int deleteByExample(WebDownloadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebDownloadWithBLOBs record);

    int insertSelective(WebDownloadWithBLOBs record);

    List<WebDownloadWithBLOBs> selectByExampleWithBLOBs(WebDownloadExample example);

    List<WebDownload> selectByExample(WebDownloadExample example);

    WebDownloadWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebDownloadWithBLOBs record, @Param("example") WebDownloadExample example);

    int updateByExampleWithBLOBs(@Param("record") WebDownloadWithBLOBs record, @Param("example") WebDownloadExample example);

    int updateByExample(@Param("record") WebDownload record, @Param("example") WebDownloadExample example);

    int updateByPrimaryKeySelective(WebDownloadWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WebDownloadWithBLOBs record);

    int updateByPrimaryKey(WebDownload record);
}