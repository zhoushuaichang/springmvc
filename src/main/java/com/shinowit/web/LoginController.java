package com.shinowit.web;

import com.shinowit.entity.UserEntity;
import com.shinowit.framework.dao.BaseDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/22.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Resource
    private BaseDAO<UserEntity> user_dao;

    @RequestMapping(value = "/login")
    public String login(UserEntity user,Model model){
        List<UserEntity> userList=user_dao.findBySql("select * from user where user_name=? and user_pass=? ",user.getUserName(),user.getUserPass());
       if(userList.size()>0){
           model.addAttribute("current_user",userList.get(0));
       }
        return "success";
    }

}
