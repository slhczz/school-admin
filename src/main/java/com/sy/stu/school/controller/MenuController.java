package com.sy.stu.school.controller;

import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/admin/menu")
public class MenuController {

    @Autowired
    MenuService service;
    @GetMapping(value = "menus")
    public BaseResult menus() {
        return service.selectAll();
    }
}
