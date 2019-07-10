<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${list}
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${list}" var="l">
			<tr>
				<td>${l.id}</td>
				<td>${l.name}</td>
				<td>${l.sex}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>