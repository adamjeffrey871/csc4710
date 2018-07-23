<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Most Reviews Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>Member ID</th>
		<th>Member Name</th>
		<th>Number of Reviews</th>
		
	</tr>
<c:forEach items="${ReviewerList}" var="user">
	<tr>
		<td>${user.memberID }</td>
		<td>${user.memberName }</td>
		<td>${user.numReviews }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>