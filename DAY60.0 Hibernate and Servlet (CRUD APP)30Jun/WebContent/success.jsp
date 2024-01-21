<%@page import="com.cjc.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">



table, td, th{
   border: 2px solid black;
   border-collapse: collapse;

}


</style>


</head>
<body>
<h1>Success page</h1>

<table>
   <thead>
   <tr>
      <th>EmployeeID </th>   
      <th>Employee FirstName </th> 
      <th>Employee Lastname </th>    
      <th>Employee Mail</th> 
      <th>Employee Username </th>
      <th>Employee Password </th>
      <th>Employee salary </th>   
      <th>Delete </th> 
      <th>Edit</th>    
     </tr>
   </thead>
    <tbody>
      
      <%  List<Employee> emplist=(List<Employee>) request.getAttribute("list"); %>
      
        <% for(Employee e:emplist) {%>
    
       <tr>
          <td> <%=e.getEmpid() %> </td>
       		<td> <%=e.getFirstname() %> </td>
       		<td> <%=e.getLastname() %> </td>
       		<td> <%=e.getMail() %> </td>
       		<td> <%=e.getUname()%> </td>
       		<td> <%=e.getPassword() %> </td>
       		<td> <%=e.getSalary() %> </td>
       		<td><a href="delete?id=<%=e.getEmpid() %>">empdelete</a> </td>
       		<td><a href="edit?id=<%=e.getEmpid() %>">empEdit</a> </td>
       </tr>
    
    <%} %>
    <a href="index.jsp">login</a>
    </tbody>



</table>

</body>
</html>