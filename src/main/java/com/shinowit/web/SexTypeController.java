package com.shinowit.web;

import com.shinowit.dao.mapper.SexTypeMapper;
import com.shinowit.entity.SexType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2014/12/23.
 */
@Controller
@RequestMapping(value = "/sex")
public class SexTypeController {

    @Resource
    SexTypeMapper sexType_dao;

    @RequestMapping(value = "/sex")
    public String insert(SexType sexType){
        sexType_dao.insert(sexType);
        return "success";
    }
}
