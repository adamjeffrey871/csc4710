<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>List Papers by Two Authors</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>List Papers by Two Authors</h1>
  


<p style="color: red; font-weight: 900"> ${msg}</p>
<form action="<c:url value='/ListTwoAuthorsServlet'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	First Author Name:<input type="text" name="firstAuthorName" value="${form.firstAuthorName }"/>
	<span style="color: red; font-weight: 900">${errors.firstAuthorName }</span>
	<br/>
	Second Author Name:<input type="text" name="secondAuthorName" value="${form.secondAuthorName }"/>
	<span style="color: red; font-weight: 900">${errors.secondAuthorName }</span>
	<br/>
	<input type="submit" value="Submit"/>
</form>
  </body>
</html>
