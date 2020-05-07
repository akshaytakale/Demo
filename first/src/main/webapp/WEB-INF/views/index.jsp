<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="register">  
  <div class="container">  
  <center>  <h1> Student Registeration Form</h1> </center>  
  <hr>  
  <label> Firstname </label>   
<input type="text" name="firstName" placeholder= "Firstname" size="15" required />   
<label> Firstname </label>   
<input type="text" name="lastName" placeholder="Lastname" size="15"required />   
<label> Age</label>  
<input type="text" name="age" placeholder="age"   size="2"/>   
 <label for="email"><b>Email</b></label>  
 <input type="text" placeholder="Enter Email" name="userName" required>  
  
    <label for="psw"><b>Password</b></label>  
    <input type="password" placeholder="Enter Password" name="password" required>   
    <button type="submit" class="registerbtn">Register</button>    
</form>  
</body>
</html>