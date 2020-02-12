<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script>
		$(function(){
			
			$.ajax({
				url:"http://localhost:8282/emp/rest/list", 
				type:"post", 
				cache:false, 
				dataType:"json",
			
				success: function(data){
					console.log(data)
						
					$.each(data, function(key, value){						
						var tag = "";
						
						tag = tag +'<tr>';
						tag = tag +'<td>'+ value.empNo +'</td>';
						tag = tag +'<td>'+ value.eName +'</td>';
						tag = tag +'<td><a href="content_view?empNo=' + value.empNo + '">' + value.job + '</a></td>';
						tag = tag +'<td>' + value.hireDate + '</td>';
						tag = tag +'<td>' + value.sal + '</td>';
						tag = tag +'</tr>';
						
						$("#emp_list").append(tag);
					});					
				},
				
				error: function(request, status, error){
					console.log(request.responseText);
					console.log(error);
				}
			});
			
			
		})
		
	</script>


</head>
<body>
	
	<table  width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>직업</td>
			<td>입사날짜</td>
			<td>월급</td>
		</tr>		
		<tr>
			<tbody id="emp_list">
		</tr>
		
	<%-- 
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.empNo}</td>
			<td>${dto.eName}</td>
			<td><a href="content_view?empNo=${dto.empNo}">${dto.job}</a></td>
			<td>${dto.hireDate}</td>
			<td>${dto.sal}</td>
		</tr>
		</c:forEach> --%>
		
	</table>
</body>
</html>