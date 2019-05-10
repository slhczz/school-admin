package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebPicture;
import com.sy.stu.school.pojo.po.WebPictureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebPictureMapper {
    int countByExample(WebPictureExample example);

    int deleteByExample(WebPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebPicture record);

    int insertSelective(WebPicture record);

    List<WebPicture> selectByExampleWithBLOBs(WebPictureExample example);

    List<WebPicture> selectByExample(WebPictureExample example);

    WebPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebPicture record, @Param("example") WebPictureExample example);

    int updateByExampleWithBLOBs(@Param("record") WebPicture record, @Param("example") WebPictureExample example);

    int updateByExample(@Param("record") WebPicture record, @Param("example") WebPictureExample example);

    int updateByPrimaryKeySelective(WebPicture record);

    int updateByPrimaryKeyWithBLOBs(WebPicture record);

    int updateByPrimaryKey(WebPicture record);
}