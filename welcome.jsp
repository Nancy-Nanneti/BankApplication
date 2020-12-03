<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
header{
  display: block;
  padding: 60px;
  text-align: center;
  background: #1abc9c;
  color: white;
  font-size: 30px;

}
.button {
  padding: 10px 20px;
  font-size: 20px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

</style>
<body>
<header><h1>Welcome To HCL Banking</h1></header><br><br>
<a href="login"><button class="button">Login</button></a>
</body>
</html>


