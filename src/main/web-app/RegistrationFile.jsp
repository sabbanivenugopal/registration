<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="userDetails" method= "post">
UserName: <input type ="text" name="userName"></br></br>
Mobile No:<input type="text" name="mobile"></br></br>
Email : <input type ="text" name="eMail"></br></br>

Student<input type="radio" name="category"  value="student"></br>
Teacher<input type="radio" name="category" value="employee"></br>
Principal<input type="radio" name="category" value="employee"></br>


<input type ="submit" value="Register"></br></br>
</form>
</body>
</html>