<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>직업</td>
			<td>입사날짜</td>
			<td>월급</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.empNo}</td>
			<td>${dto.eName}</td>
			<td>
				<a href="content_view?empNo=${dto.empNo}">${dto.job}</a></td>
			<td>${dto.hireDate}</td>
			<td>${dto.sal}</td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>