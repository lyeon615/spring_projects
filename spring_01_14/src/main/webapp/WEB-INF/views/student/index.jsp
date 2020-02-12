<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>index</title>
</head>
<body>
	<h1>index.jsp 이다.</h1>
	
	<!-- method get으로 할 경우 : url 정보 확인 / post : url 정보 확인 x -->
	<form action="student" method="get">
		student id : <input type="text" name="id"><br/>
		<input type="submit" value="전송">
	</form>

</body>
</html>
