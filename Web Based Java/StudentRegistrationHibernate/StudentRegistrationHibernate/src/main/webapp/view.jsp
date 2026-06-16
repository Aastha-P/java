<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>
<%@ page import="com.cdac.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>Student List</h2>

<table border="1">

<tr>
<th>SID</th>
<th>NAME</th>
<th>COURSE</th>
</tr>

<%
List<Student> list = (List<Student>) request.getAttribute("slist");

if(list != null)
{
    for(Student s : list)
    {
%>

<tr>
    <td><%=s.getSid()%></td>
    <td><%=s.getSname()%></td>
    <td><%=s.getCourse()%></td>
</tr>

<%
    }
}
else
{
%>
<tr>
    <td colspan="4">No Data Found</td>
</tr>
<%
}
%>
</table>



</body>
</html>