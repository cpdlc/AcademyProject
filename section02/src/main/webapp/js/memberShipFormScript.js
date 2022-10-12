/**
 * 
 */
 
 function check_ok(){
	
	if(document.frm.name.value.length == 0){
		alert("이름을 입력해주세요.");
		reg_frm.name.focus();
		return false;
	}
	
	if(document.frm.jumin_1.value.length != 6){
		alert("주민번호 6자리를 입력해주세요.");
		reg_frm.jumin_1.focus();
		return false;
	}
	
	if(document.frm.jumin_2.value.length != 7){
		alert("주민번호 7자리를 입력해주세요.");
		reg_frm.jumin_2.focus();
		return false;
	}
	
	if(document.frm.id.value.length != 0){
		alert("아이디를 입력해주세요.");
		reg_frm.id.focus();
		return false;
	}
	
	if(document.frm.pwd.value.length != 0){
		alert("비밀번호를 입력해주세요.");
		reg_frm.pwd.focus();
		return false;
	}
	//비밀번호 확인결과 같은지 체크하는 구문
	if(document.frm.pwd.value != document.reg_frm.pwd_re.value){
		alert("패스워드가 일치하지 않습니다.");
		reg_frm.pwd_re.focus();
		return false;
	}
	return true;
	
}