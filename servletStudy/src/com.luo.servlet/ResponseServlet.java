package com.luo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.setHeader("mouse","two fly bird");

        resp.setHeader("content-type","text/html;charset=UTF-8");
        Cookie cookie=new Cookie("name","ljx");
        //设置cookie有效期
        cookie.setMaxAge(3*24*3600);
        /**
         * 设置cookie的有效请求路径
         */

//        cookie.setPath("");
        resp.addCookie(cookie);
        resp.getWriter().write("试一试");
    }
}
