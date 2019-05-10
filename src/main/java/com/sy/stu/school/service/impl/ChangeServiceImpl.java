package com.sy.stu.school.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sy.stu.school.dao.WebChangeMapper;
import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.po.WebChange;
import com.sy.stu.school.pojo.vo.PageVO;
import com.sy.stu.school.service.ChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChangeServiceImpl implements ChangeService {

    BaseResult baseResult = BaseResult.fail("查询失败");

    @Autowired
    WebChangeMapper mapper;

    @Override
    public BaseResult deleteByPrimaryKey(Integer id) {
        if(id != null){
           if(mapper.deleteByPrimaryKey(id) == 1){
               baseResult = BaseResult.success(200,"操作成功",new Date());
           }
        }
        return baseResult;
    }

    @Override
    public BaseResult selectByExample(PageVO pageVO) {
        Page<Object> page = PageHelper.startPage(pageVO.getPage(), pageVO.getSize());
        List<WebChange> res = mapper.selectByExample(null);
        if (CollUtil.isNotEmpty(res)) {
            Map<String, Object> map = new HashMap<>();
            map.put("count", page.getTotal());
            map.put("list", res);
            baseResult = BaseResult.success(map);
        }
        return baseResult;
    }

    @Override
    public BaseResult selectByPrimaryKey(Integer id) {
        if(id != null){
            WebChange webChange = mapper.selectByPrimaryKey(id);
            baseResult = BaseResult.success(200,"操作成功",webChange);
        }
        return baseResult;
    }

    @Override
    public BaseResult saveUser(WebChange webChange) {
        int key = 0;
        if(webChange.getId() != null){
             key = mapper.updateByPrimaryKey(webChange);
        }else{
             key = mapper.insert(webChange);
        }
        if(key == 1){
            baseResult = BaseResult.success(200,"操作成功",new Date());
        }
        return baseResult;
    }
}
