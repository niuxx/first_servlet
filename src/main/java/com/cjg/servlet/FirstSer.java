package com.cjg.servlet;
//包的引入

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet程序类
public class FirstSer extends HttpServlet {
    private static final long serialVesionUID = 1L;//为该servlet设置一个UID号

    //doGet()方法实现
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8"); //设置输出流的类型和编码类型
        PrintWriter out = response.getWriter();//得到输出流
        out.println("<html>");
        out.println("<head><title>第一个Servlet程序</title></head>");
        out.println("<body>");
        out.println("第一个Servlet程序！");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}
