package com.sy.stu.school.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sy.stu.school.dao.WebGbookMapper;
import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.po.WebGbook;
import com.sy.stu.school.pojo.vo.PageVO;
import com.sy.stu.school.service.GBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GBookServiceImpl implements GBookService {
    BaseResult baseResult = BaseResult.fail("查询失败");

    @Autowired
    WebGbookMapper mapper;

    @Override
    public BaseResult selectByExample(PageVO pageVO) {
        Page<Object> page = PageHelper.startPage(pageVO.getPage(), pageVO.getSize());
        List<WebGbook> res = mapper.selectByExample(null);
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
            WebGbook webGbook = mapper.selectByPrimaryKey(id);
            baseResult = BaseResult.success(200,"查询成功",webGbook);
        }
        return baseResult;
    }
}
