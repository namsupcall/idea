<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="normalList" value="${model.normalList}" />
<c:set var="normalInfo" value="${model.normalList[0]}" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글몰록</title>
</head>
<body>
<!-- 상세내역 -->
<div class="">

<table class="">
	<tr>
		<td class="">${normalInfo.title}</td>
	</tr>
	<tr>
		<td class="">${normalInfo.content}</td>
	</tr>
</table>
</div>
<!-- 글목록 -->
<div class="">
<table class="">
<c:forEach var="row" items="${normalList}">
	<tr>
		<td class="">${row.title}</td>
		<td class="">${row.regDate}</td>
	</tr>
</c:forEach>
</table>
</div>

</body>
</html>