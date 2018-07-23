<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Insert into Paper Table</title>
    
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
  <h1>Insert</h1>
  


<p style="color: red; font-weight: 900"> ${msg}</p>
<form action="<c:url value='/InsertReviewServlet'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	Description:<input type="text" name="description" value="${form.description }"/>
	<span style="color: red; font-weight: 900">${errors.description }</span>
	<br/>
	Final Recommendation：<input type="text" name="finalRecommendation" value="${form.finalRecommendation }"/>
	<span style="color: red; font-weight: 900">${errors.finalRecommendation }</span>
	<br/>
	Submission Date (YYYY-MM-DD)：<input type="text" name="submissionDate" value="${form.submissionDate }"/>
	<span style="color: red; font-weight: 900">${errors.submissionDate }</span>
	<br/>
	Member ID：<input type="text" name="memberID" value="${form.memberID }"/>
	<span style="color: red; font-weight: 900">${errors.memberID }</span>
	<br/>
	Paper ID：<input type="text" name="paperID" value="${form.paperID }"/>
	<span style="color: red; font-weight: 900">${errors.paperID }</span>
	<br/>
	<input type="submit" value="Insert"/>
</form>
  </body>
</html>
