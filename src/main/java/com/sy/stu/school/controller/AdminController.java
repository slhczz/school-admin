package com.sy.stu.school.controller;

import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.po.WebAdmin;
import com.sy.stu.school.pojo.vo.PageVO;
import com.sy.stu.school.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1/admin/user")
public class AdminController {
    @Autowired
    private AdminService service;
    @PostMapping("user")
    public BaseResult queryUser(WebAdmin webAdmin, HttpServletRequest request){
        return service.selectByUserName(webAdmin,request);
    }
    @GetMapping("users")
    public BaseResult users(PageVO pageVO, HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        return service.selectByExample(pageVO);
    }

    @PostMapping("save")
    public BaseResult saveUser(WebAdmin webAdmin){
        return service.saveUser(webAdmin);
    }
    @PostMapping("delete")
    public BaseResult deleteUser(Integer id){
        return service.deleteByPrimaryKey(id);
    }

}
