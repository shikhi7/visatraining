<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator here</title>
</head>
<body>
<form action="calculator">
Number1 <input name=n1> <br>
Number2 <input name=n2> <br>

<input name=op value="+" type=submit>
<input name=op value="-" type=submit>
<input name=op value="*" type=submit>
<input name=op value="/" type=submit>
</form>

<c:if test="${not(empty(result))}">
Result : ${param.n1} ${param.op} ${param.n2} =  ${result}
</c:if>

</body>
</html>