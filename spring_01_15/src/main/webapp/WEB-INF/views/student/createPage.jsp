<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>createPage</title>
</head>
<body>
	<h1>createPage.jsp</h1>
	
	<form action="${pageContext.request.contextPath}/student/create">
		name : <input type="text" name="name" value="${student.name }"><br/>
		id : <input type="text" name="id" value="${student.id }"><br/>
		<input type="submit" value="submit"><br/>
	</form>
</body>
</html>
