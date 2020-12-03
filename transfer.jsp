<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html>
<html>
<head>
<style>
* {
  box-sizing: border-box;
}
.error{
color: #EF1313;
font-style:italic;
}
header{
  display: block;
  padding: 60px;
  text-align: center;
  background: #1abc9c;
  color: white;
  font-size: 30px;

}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 2px solid red;  
  border-radius: 4px;
  text-align: center;
  background: pink;
  box-sizing: border-box;
    transition: width 0.4s ease-in-out;
  
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  text-align: center;
  background: #1abc9c;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style><meta charset="ISO-8859-1">
<title>HCL BANKING APPLICATION</title>
</head>
<body>
<header><h1>HCL BANKING APPLICATION</h1></header>
	<form:form action="transfer" method="post"
		modelAttribute="transferBean">
		<table>
			<tr>
				<td>Enter From Account:</td>
				<td><form:input path="fromAccountId"/>
				<form:errors path="fromAccountId" class="error" /></td>
				</tr>
				
				<tr>
				<td>Enter To Account:</td>
				<td><form:input path="toAccountId"/>
				<form:errors path="toAccountId" class="error" /></td>
				</tr>
				
				<tr>
				<td>Enter Amount:</td>
				<td><form:input path="amount"/>
				<form:errors path="amount"  class="error"/></td>
				</tr>
				<tr>
				<td><input type="submit"></td>
				</tr>
		</table>


	</form:form>

</body>
</html>