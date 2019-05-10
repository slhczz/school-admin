package com.sy.stu.school.controller;

import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.vo.PageVO;
import com.sy.stu.school.service.GBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1/admin/gbook")
public class GBookController {

    @Autowired
    GBookService service;

    @GetMapping("gbooks")
    public BaseResult gbooks(PageVO pageVO, HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        return service.selectByExample(pageVO);
    }
    @GetMapping("gbook")
    public BaseResult gbook(Integer id){
        return service.selectByPrimaryKey(id);
    }

}
