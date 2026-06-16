package com.cdac;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet
{
	
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            int sid =
            Integer.parseInt(
            request.getParameter("sid"));

            String sname =
            request.getParameter("sname");

            String course =
            request.getParameter("course");

            Student s =
                    new Student();

            s.setSid(sid);
            s.setSname(sname);
            s.setCourse(course);

            Configuration cfg =
                    new Configuration();

            cfg.configure();

            SessionFactory factory =
                    cfg.buildSessionFactory();

            Session session =
                    factory.openSession();

            Transaction tx =
                    session.beginTransaction();

            session.persist(s);

            tx.commit();

            session.close();

            factory.close();

//            response.getWriter().println(
//                    "Student Inserted Successfully");
	                  
            response.sendRedirect("ViewStudentServlet");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
