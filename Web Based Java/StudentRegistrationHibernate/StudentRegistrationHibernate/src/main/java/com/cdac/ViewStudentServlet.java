package com.cdac;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewStudentServlet")
public class ViewStudentServlet
extends HttpServlet
{
    protected void doGet(
    HttpServletRequest request,
    HttpServletResponse response)
    throws IOException,ServletException
    {
        try
        {
            Configuration cfg=
            new Configuration();

            cfg.configure();

            SessionFactory factory=
            cfg.buildSessionFactory();

            Session session=
            factory.openSession();

            List<Student> list=
            session.createQuery(
            "from Student",
            Student.class).list();

            request.setAttribute(
            "slist",list);
            
            session.close();

            factory.close();

            RequestDispatcher rd=
            request.getRequestDispatcher(
            "view.jsp");

            rd.forward(
            request,response);


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
