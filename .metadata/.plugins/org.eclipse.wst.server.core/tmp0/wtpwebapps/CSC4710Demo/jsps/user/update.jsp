<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Paper Table</title>
    
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
  <h1>Update</h1>
  


<p style="color: red; font-weight: 900"> ${msg}</p>
<form action="<c:url value='/UpdateServlet'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	Author Name:<input type="text" name="authorName" value="${form.authorName }"/>
	<span style="color: red; font-weight: 900">${errors.authorName }</span>
	<br/>
	Author Affiliations：<input type="text" name="authorAffiliations" value="${form.authorAffiliations }"/>
	<span style="color: red; font-weight: 900">${errors.authorAffiliations }</span>
	<br/>
	Author Email：<input type="text" name="authorEmail" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.authorEmail }</span>
	<br/>
	Book Title：<input type="text" name="title" value="${form.title }"/>
	<span style="color: red; font-weight: 900">${errors.title }</span>
	<br/>
	Abstract：<input type="text" name="paperAbstract" value="${form.paperAbstract }"/>
	<span style="color: red; font-weight: 900">${errors.paperAbstract }</span>
	<br/>
	PDF File：<input type="text" name="pdfName" value="${form.pdfName }"/>
	<span style="color: red; font-weight: 900">${errors.pdfName }</span>
	<br/>
	Reviewer Name：<input type="text" name="reviewerName" value="${form.reviewerName }"/>
	<span style="color: red; font-weight: 900">${errors.reviewerName }</span>
	<br/>
	Report ID：<input type="text" name="reportID" value="${form.reportID }"/>
	<span style="color: red; font-weight: 900">${errors.reportID }</span>
	<br/>
	Paper ID:<input type="text" name="paperID" value="${form.paperID }"/>
	<span style="color: red; font-weight: 900">${errors.paperID }</span>
	<br/>
	<input type="submit" value="Update"/>
</form>
  </body>
</html>
