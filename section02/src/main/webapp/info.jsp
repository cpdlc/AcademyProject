<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>get/post방식의 차이점</title>
	<link rel="stylesheet" type="text/css" href="css/infoStyle.css">
</head>
<body>
	<div id="wrapper">
		<header>
			<h1>Get/Post방식의 차이점</h1>
		</header>
		
		<section>
			<h2>▶Get 방식으로 구현</h2>
			<form method="get" action="infoServlet" name="frm1">
				<p>
					<label for="userName">이 름 :</label>
					<input type="text" name="name" id="userName">
				</p>
				
				<p>
					<label for="userAddr">주 소 :</label>
					<input type="text" name="addr" id="userAddr">
				</p>
				
				<p>
					<input type="submit" value="전송">
				</p>
				
				
			</form>
		</section>
		
		<section>
			<h2>▶Post 방식으로 구현</h2>
			<form method="post" action="infoServlet" name="frm2">
				<p>
					<label for="userName1">이 름 :</label>
					<input type="text" name="name" id="userName1">
				</p>
				
				<p>
					<label for="userAddr1">주 소 :</label>
					<input type="text" name="addr" id="userAddr1">
				</p>
				
				<p>
					<input type="submit" value="전송">
				</p>
				
				
			</form>
		</section>
	</div>
</body>
</html>