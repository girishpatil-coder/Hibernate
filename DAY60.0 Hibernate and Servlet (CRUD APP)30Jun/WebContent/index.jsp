<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<!-- <script>


function formavlidate(){
	
var uname=document.form.loginform.uname.value;
var password=document.form.loginform.uname.value;

if(uname==""){
	document.getElementById("un1").innerHTML="UserName Cannot be null";
	return false;
}
if(password.lenght<4){
	document.getElementById("ps1").innerHTML="password less than 4 character";
	return false;
}
return true;

}


</script>

<style>

span{

color:red;

}

</style>
 -->
</head>
<body>
<center>
<h1>Login Employee</h1>

<form action="login"> <!-- method="post" name="loginform" onsubmit="return formavlidate" -->

<label for="uname">Username</label>
    <input type="text" name="uname"> <!-- <span id="un1"></span> --> <br>

<label for="password">Password</label>
    <input type="password" name="password"> <!-- <span id="ps1"></span> --> <br>

<input type="submit" value="Login">
</form>
<a href="register.jsp">SIGN UP</a>
</center>

</body>
</html>