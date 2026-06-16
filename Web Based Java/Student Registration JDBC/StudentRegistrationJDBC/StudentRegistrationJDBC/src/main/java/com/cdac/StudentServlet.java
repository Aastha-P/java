package com.cdac;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    String url="jdbc:mysql://localhost:3306/cdac";
    String user="root";
    String password="root";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        int rollno =
            Integer.parseInt(request.getParameter("rollno"));

        String name =
            request.getParameter("name");

        String course =
            request.getParameter("course");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(
                        url,user,password);

            PreparedStatement ps =
                con.prepareStatement(
                "insert into student values(?,?,?)");

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, course);

            ps.executeUpdate();

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        ArrayList<Student> list =
                new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(
                        url,user,password);

            PreparedStatement ps =
                con.prepareStatement(
                        "select * from student");

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Student s = new Student();

                s.setRollno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setCourse(rs.getString("course"));

                list.add(s);
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("students", list);

        RequestDispatcher rd =
            request.getRequestDispatcher("view.jsp");

        rd.forward(request,response);
    }
}
