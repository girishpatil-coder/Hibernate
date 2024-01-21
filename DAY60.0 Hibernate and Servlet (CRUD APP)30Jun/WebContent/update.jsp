<%@page import="com.cjc.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<%Employee e  =(Employee) request.getAttribute("emp"); %>

<h1>Update Page</h1>

<form action="updateEmployee" method="post">


<label for="id">ID</label>
<input type="hidden" name="id" value="<%=e.getEmpid()%>"><br>


<label for="firstname">FirstName</label>
<input type="text" name="firstname" value="<%=e.getFirstname()%>"><br>

<label for="lastname">LastName</label>
<input type="text" name="lastname"  value="<%=e.getLastname()%>"><br>

<label for="mail">Mail</label>
<input type="text" name="mail" value="<%=e.getMail()%>"><br>

<label for="salary">Salary</label>
<input type="text" name="salary" value="<%=e.getSalary()%>"><br>


<label for="uname">Username</label>
<input type="text" name="uname" value="<%=e.getUname()%>"><br>


<label for="password">Password</label>
<input type="text" name="password" value><br>


<input type="submit" value="register">


</form>


</center>

</body>
</html>