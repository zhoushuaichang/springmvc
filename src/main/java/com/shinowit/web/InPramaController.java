package com.shinowit.web;

import com.shinowit.entity.SexType;
import com.shinowit.entity.StuEntity;
import com.shinowit.framework.dao.BaseDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/19.
 */
@Controller
@RequestMapping(value="/inprama")
public class InPramaController {

    @Resource
    private BaseDAO<SexType> sex_dao;

    @RequestMapping("/test")
    public View test(Model model){
        List<SexType> sexTypeList=sex_dao.listAll(SexType.class);
        model.addAttribute("sex_type_list",sexTypeList);
        SexTypeExcelView result=new SexTypeExcelView();
        return result;
    }

    @RequestMapping(value="/test1")
    public ModelAndView test1(@ModelAttribute StuEntity stu){
        ModelAndView result=new ModelAndView();
        result.setViewName("/test1");
        result.addObject("message","hello word,你好");
        return result;
    }
}
