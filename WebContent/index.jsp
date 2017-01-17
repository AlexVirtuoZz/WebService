<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<c:set var="logPassError" value="${empty logPassError ? false : requestScope.logPassError}" scope="request"/>
<head>
<meta charset="UTF-8">
<title>Registration test task</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id = "loginForm">
		<form action="Controller" method="get">
			<c:if test="${logPassError eq true }">
			<font color="red">Login / password are incorrect</font><br>
			</c:if>
		<input type="hidden" name="command" value="LOGIN" />
        Email: <p><input type="text" name = "login"></p><br>
        Password: <p><input type="password" name = "password"></p><br>
        <button class="but" type="submit">Submit</button>   
        </form>
        <button class="butt" onclick="location.href='registration.jsp'">Register</button>
  
	</div>
</body>
</html>