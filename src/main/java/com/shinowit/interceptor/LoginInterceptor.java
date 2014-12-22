package com.shinowit.interceptor;

import org.hibernate.Session;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/22.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session=request.getSession();
        if(session!=null||session.getAttribute("current_user")!=null){
            return true;
        }
        
        String uri=request.getRequestURI();
        if(uri.endsWith("/login/login")){
            return true;
        }if(uri.endsWith("/login.jsp")){
            return true;
        }
        response.sendRedirect(request.getContextPath()+"/login.jsp");
        return false;

    }
}
