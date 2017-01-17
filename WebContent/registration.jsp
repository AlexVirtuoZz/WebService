<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<c:set var="logPassError" value="${empty logPassError ? false : requestScope.logPassError}" scope="request"/>
<c:set var="loginTaken" value="${empty loginTaken ? false : requestScope.loginTaken}" scope="request"/>
<c:set var="regSucceed" value="${empty regSucceed ? false : requestScope.regSucceed}" scope="request"/>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div id = "regForm">
        <form action="Controller" method="get">
            <c:if test="${loginTaken eq true }">
            <font color="red">Login is already taken</font><br>
            </c:if>
            <c:if test="${logPassError eq true }">
            <font color="red">Login / password are incorrect</font><br>
            </c:if>
            <c:if test="${regSucceed eq true }">
            <font color="green">Registration succeed!</font><br>
            </c:if>
            <input type="hidden" name="command" value="REGISTER" />
            Enter your email: <p><input type="text" name = "login"></p>
            Enter your password: <p><input type="password" name = "password"></p>
          <br/>
   <button class="but" type="submit">Submit</button>    
   </form>          
   <button class="butto" onclick="location.href='index.jsp'">Back</button>
      
    </div>
</body>
</html>