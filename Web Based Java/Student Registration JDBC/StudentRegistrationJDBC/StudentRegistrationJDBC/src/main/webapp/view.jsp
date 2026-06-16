<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>\
    
<%@ page import="java.util.*" %>
<%@ page import="com.cdac.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Student Details</h2>

<%
ArrayList<Student> list =
    (ArrayList<Student>)request.getAttribute("students");

for(Student s : list)
{
%>

Roll No :
<%= s.getRollno() %>
<br>

Name :
<%= s.getName() %>
<br>

Course :
<%= s.getCourse() %>
<br>

<hr>

<%
}
%>

<a href="register.html">
Add New Student
</a>

</body>
</html>