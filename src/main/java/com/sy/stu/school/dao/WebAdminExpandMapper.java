package com.sy.stu.school.dao;

import com.sy.stu.school.pojo.po.WebAdmin;

public interface WebAdminExpandMapper{

    WebAdmin selectByUserName(String name);
}