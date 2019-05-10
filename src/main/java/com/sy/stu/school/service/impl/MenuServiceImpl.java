package com.sy.stu.school.service.impl;

import com.sy.stu.school.dao.WebMenuExpandMapper;
import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.dto.WebMenuDTO;
import com.sy.stu.school.pojo.po.WebMenu;
import com.sy.stu.school.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    BaseResult baseResult = BaseResult.fail("查询失败");

    @Autowired
    WebMenuExpandMapper expandMapper;


    @Override
    public BaseResult selectAll() {
        List<WebMenu> webMenus = expandMapper.selectAll();
        List<WebMenuDTO> webMenuDTOS = new ArrayList<>();
        for (WebMenu webMenu:webMenus) {
            WebMenuDTO webMenuDTO = new WebMenuDTO();
            BeanUtils.copyProperties(webMenu,webMenuDTO);
            webMenuDTOS.add(webMenuDTO);
        }
        baseResult = BaseResult.success(200,"查询成功",webMenuDTOS);
        return baseResult;
    }
}
