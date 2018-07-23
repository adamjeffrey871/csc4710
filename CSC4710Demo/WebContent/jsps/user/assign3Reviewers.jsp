<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Assign 3 Reviewers</title>
    
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
  <h1>Assign 3 Reviewers</h1>
  


<p style="color: red; font-weight: 900"> ${msg}</p>
<form action="<c:url value='/Assign3ReviewersServlet'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	First Reviewer ID:<input type="text" name="firstReviewer" value="${form.firstReviewer }"/>
	<span style="color: red; font-weight: 900">${errors.firstReviewer }</span>
	<br/>
	Second Reviewer ID：<input type="text" name="secondReviewer" value="${form.secondReviewer }"/>
	<span style="color: red; font-weight: 900">${errors.secondReviewer }</span>
	<br/>
	Third Reviewer ID：<input type="text" name="thirdReviewer" value="${form.thirdReviewer }"/>
	<span style="color: red; font-weight: 900">${errors.memberID }</span>
	<br/>
	Paper ID：<input type="text" name="paperID" value="${form.paperID }"/>
	<span style="color: red; font-weight: 900">${errors.paperID }</span>
	<br/>
	<input type="submit" value="Insert"/>
</form>
  </body>
</html>
