<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>studentView</title>
</head>
<body>
<h1>
	studentView.jsp 이다.
</h1>

	student name : ${studentInfo.name}<br/>
	student age : ${studentInfo.age}살<br/>
	student gradeNum : ${studentInfo.gradeNum}학년<br/>
	student classNum : ${studentInfo.classNum}반<br/>

</body>
</html>
