package com.sy.stu.school.service;

import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.po.WebChange;
import com.sy.stu.school.pojo.vo.PageVO;

public interface ChangeService {

    BaseResult deleteByPrimaryKey(Integer id);

    BaseResult selectByExample(PageVO pageVO);

    BaseResult selectByPrimaryKey(Integer id);

    BaseResult saveUser(WebChange webChange);
}
