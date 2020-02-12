<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>index</title>
</head>
<body>
	
	<h1> circle index.jsp 이다.</h1>
	
	<form action="${pageContext.request.contextPath }/area/circleArea" method="post">
		radius : <input type="text" name="radius"><br/>
		<input type="submit" value="전송">
	</form>

</body>
</html>
