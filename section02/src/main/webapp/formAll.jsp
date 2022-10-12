<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>FORM 관련태그</title>
	<link rel="stylesheet" type="text/css" href="css/formAllStyle.css">
</head>
<body>
	<header>
		<h1>form 관련 태그들</h1>
	</header>

	<section>
		<h2>▶ form 관련 태그들</h2>
		<form method="get" action="formAllServlet">
			<table>
			
				<tr>
					<th><label for="userName">이름</label></th>
					<td><input type="text" name="name" id="userName"></td>
				</tr>
				
				<tr>
					<th><label for="userId">아이디</label></th>
					<td><input type="text" name="id" id="userId"></td>
				</tr>
				
				<tr>
					<th><label for="userPw">비밀번호</label></th>
					<td><input type="password" name="pw" id="userPw"></td>
				</tr>
				
				<tr>
					<th><label for="userAddr">주소</label></th>
					<td><input type="text" name="addr" id="userAddr"></td>
				</tr>
				
				<tr>
					<th><label>성별</label></th>
					<td><input type="radio" name="gender" value="남자"> 남자	<!-- name , value는 서버로 전달되는 값 -->
						<input type="radio" name="gender" value="여자"> 여자
					</td>
				</tr>
				
				<tr>
					<th><label>메일정보수신여부</label></th>
					<td><input type="radio" name="chk_mail" value="yes" checked> 수신	
						<input type="radio" name="chk_mail" value="no"> 거부
					</td>
				</tr>
				
				<tr>
					<th><label>관심분야1</label></th>
					<td><input type="checkbox" name="interest" value="신발"> 신발 &nbsp;
						<input type="checkbox" name="interest" value="가방"> 가방 &nbsp;
						<input type="checkbox" name="interest" value="벨트"> 벨트 &nbsp;
						<input type="checkbox" name="interest" value="모자"> 모자 &nbsp;
						<input type="checkbox" name="interest" value="시계"> 시계 &nbsp;
						<input type="checkbox" name="interest" value="쥬얼"> 쥬얼리
					</td>
				</tr>
				
				<tr>
					<th><label>직업</label></th>
					<td>
						<select name="job" size="1">
							<option value="">선택하세요</option>
							<option value="학생">학생</option>
							<option value="언론인">언론인</option>
							<option value="공무원">공무원</option>
							<option value="군인">군인</option>
							<option value="서비스업">서비스업</option>
							<option value="교육">교육</option>
							<option value="기타">기타</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<th><label>관심분야2</label></th>
					<td>
						<select name="interest2" size="5" multiple="multiple">
							<option value="에스프레소">에스프레소</option>
							<option value="로스팅">로스팅</option>
							<option value="생두">생두</option>
							<option value="원두">원두</option>
							<option value="핸드드립">핸드드립</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<th><label>간단한 가입 인사를 적어주세요.^ㅇ^</label></th>
					<td><textarea name="content" rows="5" cols="35"></textarea></td>
				</tr>
			</table>
			
			<p class="subBtn"><input type="submit" value="전송"></p>
		</form>
	</section>
</body>
</html>