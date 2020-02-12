<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
			<input type="hidden" name="empNo" value="${content_view.empNo}">
			<tr>
				<td> 번호 </td>
				<td> ${content_view.empNo} </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="eName" value="${content_view.eName}"></td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="job" value="${content_view.job}"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea rows="10" name="bContent" >${content_view.bContent}</textarea></td>
			</tr>
			<tr >
				<td> <a href="list">목록보기</a> </td>
			</tr>
	</table>
	
</body>
</html>