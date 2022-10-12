<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>서블릿 통합 환경</title>
	<link rel="stylesheet" type="text/css" href="css/idAgeStyle.css">
	<script src="js/idAgeScript.js"></script>
</head>
<body>
	
	<form method="get" action="idAgeServlet" name="frm">
		<p>
			<label for="userId">아이디</label>
			<input type="text" name="id" id="userId">
		</p>
		
		<p>
			<label for="userAge">나 &nbsp; 이</label>
			<input type="text" name="age" id="userAge">
		</p>
		
		<!-- onclick 했을때 자바스크립트 check 함수를 가져옴 -->
		<input type="submit" value="전송" onclick="return check()">
		
	</form>

</body>
</html>