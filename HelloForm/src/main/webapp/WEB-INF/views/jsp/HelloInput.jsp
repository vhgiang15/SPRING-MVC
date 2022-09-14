<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello form</h2>
<form:form action="hello.html" method="post" modelAttribute="user">
<div>ID:</div>
<form:input path="id"/>
<div>Name: </div>
<form:input path="name"/>
<hr>
<input type=submit value=" Say Hello">


</form:form>

</body>
</html>