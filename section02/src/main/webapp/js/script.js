/**
 * 
 */
 
 function Validation(){
 
 var userName = document.getElementById("userName");

 if(userName.value==''){
	alert("이름을 입력해주세요");
	return false;
}

var userJnum1 = document.getElementById("jnum1");
var userJnum2 = document.getElementById("jnum2");



if(userJnum1.value=='' || userJnum2.value==''){
	alert("주민번호를 입력해주세요")
	return false;
}

var jum1_RegExp = /[0-9]{6,6}/;
if(!jum1_RegExp.test(userJnum1.value)){
	alert("주민번호 앞자리를 6자리 숫자로 입력해주세요");
	return false
}

var jum2_RegExp = /[0-9]{7,7}/;
if(!jum2_RegExp.test(userJnum2.value)){
	alert("주민번호 뒷자리를 7자리 숫자로 입력해주세요");
	return false
}

var userId = document.getElementById("userId");
 
if(userId.value==''){
	alert("아이디를 입력하세요");
	return false;
}

var userPw1 = document.getElementById("userPw1");
if(userPw1.value==''){
	alert("비밀번호를 입력하세요");
	return false;
}

var userPw2 = document.getElementById("userPw2");
if(userPw2.value==''){
	alert("비밀번호 확인을 입력하세요");
	return false;
}

if(userPw1.value!=userPw2.value){
	alert("일치하는 비밀번호를 입력해주세요");
	return false;
}


	
}
