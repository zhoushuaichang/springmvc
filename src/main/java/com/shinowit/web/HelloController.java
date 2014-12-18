package com.shinowit.web;

import com.shinowit.entity.StuEntity;
import com.shinowit.entity.TeaEntity;
import com.shinowit.framework.dao.BaseDAO;
import com.sun.org.apache.xpath.internal.operations.Mod;
import net.sf.ehcache.transaction.xa.EhcacheXAException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2014/12/16.
 */
@Controller
@RequestMapping(value = "/test")
public class HelloController {

    @Resource
    private BaseDAO<StuEntity> stu_dao;

    @RequestMapping(value = "/test")
    public String test(Model model) {
        model.addAttribute("title", "小熊 is a pig ！");
        return "success";
    }

    @RequestMapping(value = "test1")
    public String test1(HttpServletRequest request, StuEntity stu, TeaEntity tea, Model model) {
        model.addAttribute("uri", request.getRequestURI());
        model.addAttribute("url", request.getRequestURL());
        model.addAttribute("stuId", stu.getStuId());
        model.addAttribute("stuName", stu.getStuName());
        model.addAttribute("teaId", tea.getTeaId());
        model.addAttribute("teaName", tea.getTeaName());
        return "success";
    }

    @RequestMapping(value = "test2")
    public String test2(Model model) {
        List<StuEntity> stuList = stu_dao.listAll(StuEntity.class);
        model.addAttribute("stuList", stuList);
        model.addAttribute("stu", new StuEntity());
        return "disp";
    }

    @RequestMapping(value = "test3")
    public String test3(StuEntity stu, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "你错了！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        return "redirect:/test/test2";
    }

    @RequestMapping(value = "/test4/{stuId}")
    public String test4(@PathVariable int stuId, Model model, HttpServletResponse response) {
        response.setCharacterEncoding("utf-8");
        StuEntity stu = stu_dao.findById(StuEntity.class, stuId);
        stu_dao.delete(stu);
        model.addAttribute("message", "删除成功！");
        return "test4";
    }

    
    @RequestMapping(value = "/test5")
    @ResponseBody
    public String test5(StuEntity stu,Model model) {
        Object obj;
        String msg="插入失败！";
        try{
            obj = stu_dao.insert(stu);
            if(obj!=null){
                msg="添加成功！";
                model.addAttribute("msg",msg);
                return "input";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("msg",msg);
        return "input";
    }


}
