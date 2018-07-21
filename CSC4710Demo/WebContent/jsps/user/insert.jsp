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
<form action="<c:url value='/InsertServlet'/>" method="post">
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
	Author ID：<input type="text" name="authorID" value="${form.authorID }"/>
	<span style="color: red; font-weight: 900">${errors.authorID }</span>
	<br/>
	<input type="submit" value="Insert"/>
</form>
  </body>
</html>
