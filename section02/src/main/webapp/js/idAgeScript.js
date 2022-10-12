/**
 * 아이디와 나이 입력 제어
 */
 
function check(){
	
	if(document.frm.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;	//여기까지하고 멈춤
	}else if(document.frm.age.value == ""){
		alert("나이를 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if(isNaN(document.frm.age.value)){
		//isNaN(is Not a Number의 약자로 숫자인지 검사하는 함수)
		//숫자가 아니면 true, 숫자이면 false
		alert("숫자를 입력해주세요");
		document.frm.age.focus();
		return false;
	}else{
		return true;
	}
	
}