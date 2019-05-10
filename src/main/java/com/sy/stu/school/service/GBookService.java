package com.sy.stu.school.service;

import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.vo.PageVO;

public interface GBookService {

    BaseResult selectByExample(PageVO pageVO);
    BaseResult selectByPrimaryKey(Integer id);

}
