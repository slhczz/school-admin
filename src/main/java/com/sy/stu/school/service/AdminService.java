package com.sy.stu.school.service;

import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.po.WebAdmin;
import com.sy.stu.school.pojo.po.WebAdminExample;
import com.sy.stu.school.pojo.vo.PageVO;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {
    BaseResult countByExample(WebAdminExample example);

    BaseResult deleteByPrimaryKey(Integer id);

    BaseResult insert(WebAdmin record);

    BaseResult selectByExample(PageVO pageVO);

    BaseResult selectByPrimaryKey(Integer id);
    BaseResult selectByUserName(WebAdmin webAdmin, HttpServletRequest request);

    BaseResult updateByPrimaryKey(WebAdmin record);

    BaseResult saveUser(WebAdmin webAdmin);
}
