package com.sy.stu.school.controller;

import com.sy.stu.school.service.ChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/admin/change")
public class ChangeController {

    @Autowired
    ChangeService service;

}
