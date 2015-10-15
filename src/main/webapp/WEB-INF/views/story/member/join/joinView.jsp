<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
<form action="/member/join/joinView.do" method="post">
	<table>
		<tr>
			<td>성명</td>
			<td><input type="text" class="" id="memberNm" name="memberNm"></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><input type="text" class="" id="memberId" name="memberId"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" class="" id="memberPw" name="memberPw"></td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td><input type="password" class="" id="memberPw2" name="memberPw2"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" class="" id="email" name="email"></td>
		</tr>
	</table>
	<input type="submit" class="" id="joinSave" name="joinSave" value="회원가입">
	<a href="/index.do">취소</a>
</form>
</body>
</html>