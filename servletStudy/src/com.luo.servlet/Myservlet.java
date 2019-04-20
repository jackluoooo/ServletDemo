package com.luo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Myservlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("servlet init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("service");
        Object name = req.getSession().getAttribute("name");
        Object password = req.getSession().getAttribute("password");
        System.out.println("name:"+name+"password:"+password);
//        super.service(req,resp);
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       String username= req.getParameter("uname");
//       String password = req.getParameter("password");
//        String authType = req.getAuthType();
//        System.out.println(username+"->"+password);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req,resp);
//    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
