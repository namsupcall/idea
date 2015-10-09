<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
<form action="/member/login/login2.do" method="post">
	<span class="">아이디</span>
	<input type="text" class="" id="memberId" name="memberId">
	<span class="">비밀번호</span>
	<input type="password" class="" id="memberPw" name="memberPw">
	<input type="submit" class="" id="lgoin" name="login" value="로그인">
</form>
</body>
</html>