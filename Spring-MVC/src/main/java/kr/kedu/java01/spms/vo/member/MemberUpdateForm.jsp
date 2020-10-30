<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
<jsp:include page="/Header.jsp"></jsp:include>

	<h1>회원정보</h1>
	<form action='update.do' method='post'>
		번호 : <input type='text' name='no'
			value='${param.no}' readonly><br>
		이름: <input type='text' name='name'
				value='${requestScope.member.name}'><br> 
		이메일: <input type='text' name='email' value='${requestScope.member.email}'><br>
		가입일 : ${requestScope.member.createDate}<br> 
		<input type='submit' value='저장'> <input type='button' value='삭제'
			onclick='location.href="delete.do?no=${param.no}"'>
			
		<input type='button' value='취소' onclick='location.href="list.do"'>
	</form>

<jsp:include page="/Tail.jsp"></jsp:include>
</body>
</html>