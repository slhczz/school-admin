package com.sy.stu.school.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sy.stu.school.dao.WebAdminExpandMapper;
import com.sy.stu.school.dao.WebAdminMapper;
import com.sy.stu.school.pojo.dto.BaseResult;
import com.sy.stu.school.pojo.dto.WebAdminDTO;
import com.sy.stu.school.pojo.po.WebAdmin;
import com.sy.stu.school.pojo.po.WebAdminExample;
import com.sy.stu.school.pojo.vo.PageVO;
import com.sy.stu.school.service.AdminService;
import com.sy.stu.school.util.ConstantUitls;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {
    BaseResult baseResult = BaseResult.fail("操作失败");

    @Autowired
    WebAdminExpandMapper expandMapper;
    @Autowired
    WebAdminMapper mapper;

    @Override
    public BaseResult countByExample(WebAdminExample example) {
        return null;
    }

    @Override
    public BaseResult deleteByPrimaryKey(Integer id) {

        if(id!=null){
            int rest = mapper.deleteByPrimaryKey(id);
            if(rest == 1){
                baseResult = BaseResult.success("操作成功");
            }
        }
        return baseResult;
    }

    @Override
    public BaseResult insert(WebAdmin record) {
        return null;
    }

    @Override
    public BaseResult selectByExample(PageVO pageVO) {
        Page<Object> page = PageHelper.startPage(pageVO.getPage(), pageVO.getSize());
        List<WebAdmin> users = mapper.selectByExample(null);
        if (CollUtil.isNotEmpty(users)) {
            Map<String, Object> map = new HashMap<>();
            map.put("count", page.getTotal());
            map.put("list", users);
            baseResult = BaseResult.success(map);
        }
        return baseResult;
    }

    @Override
    public BaseResult selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public BaseResult selectByUserName(WebAdmin webAdmin, HttpServletRequest request) {
        if(webAdmin.getUsername() != null || webAdmin.getPassword() != null){
            WebAdmin selectByUserName = expandMapper.selectByUserName(webAdmin.getUsername());
            String md5Hex = DigestUtils.md5DigestAsHex(webAdmin.getPassword().getBytes());
            if(md5Hex.equals(selectByUserName.getPassword())){
                WebAdminDTO webAdminDTO = new WebAdminDTO();
                request.setAttribute(ConstantUitls.SESSION_USER,selectByUserName.getUsername());
                BeanUtils.copyProperties(selectByUserName,webAdminDTO);
                baseResult = BaseResult.success(200,"登录成功",webAdminDTO);
            }
        }
        return baseResult;
    }

    @Override
    public BaseResult updateByPrimaryKey(WebAdmin record) {
        return null;
    }

    @Override
    public BaseResult saveUser(WebAdmin webAdmin) {
        int key = 0;
        if(webAdmin.getId() != null ){
            key = mapper.updateByPrimaryKey(webAdmin);
        }else{
            key = mapper.insert(webAdmin);
        }
        if(key == 1){
            baseResult = BaseResult.success(200,"保存成功",new Date());
        }
        return baseResult;
    }
}
