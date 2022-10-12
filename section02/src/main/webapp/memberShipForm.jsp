<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <title> 회원 가입 </title>
   <link rel="stylesheet" type="text/css" href="css/formAllStyle.css">
   <script src="js/memberShipFormScript.js"></script>

</head>
<body>
   <header>
       <h1>회원가입페이지 만들기</h1>
   </header>
   
   <section>
      <h2>정보를 입력하세요</h2>
      <form name="frm" id="reg_frm" method="post" action="memberShipFormServlet">
         <table>
            <tr>
               <th><label for="name"> 이름 </label><span style="color:red;"> * </span></th> 
               <td><input type="text" id="name" name="name" value="" placeholder="이름을 입력해 주세요"> </td>
            </tr>
           
               <tr>
               <th><label>주민등록번호  </label><span style="color:red;"> * </span></th>
               <td><input type="text" name="jumin_1" value=""> - 
                   <input type="text" name="jumin_2" value=""> 
               </td>
             </tr>
             
             <tr>
                <th><label for="id"> 아이디  </label><span style="color:red;"> * </span></th>
                  <td><input type="text" id="id" name="id" value=""></td>
             </tr>
            
             <tr>
                <th><label for="pwd"> 비밀번호 </label><span style="color:red;"> * </span></th> 
                <td><input type="password" id="pwd" name="pwd" value=""></td>
             </tr>
             
             <tr>
                <th><label for="pwd_re"> 비밀번호 확인  </label><span style="color:red;"> * </span></th>
                <td><input type="password" id="pwd_re" name="pwd_re" value=""></td>
             </tr>
             
             <tr>
                <th><label for="email">이메일 </label> &nbsp;</th>
                <td><input type="text" name="email" value=""> @ 
                
                   <input type="text" name="email_dns" value="">
                   
                   <select name="emailaddr" class="selectBox">
                       <option value="" selected="selected">직접입력</option>
                       <option value="daum.net">daum.net</option>
                       <option value="empal.com">empal.com</option>
                       <option value="gmail.com">gmail.com</option>
                       <option value="hanmail.net">hanmail.net</option>
                       <option value="msn.com">msn.com</option>
                       <option value="naver.com">naver.com</option>
                       <option value="nate.com" >nate.com</option>                
                   </select>
                   
               </td>    
             </tr>
             
             <tr>
                <th><label for="zip">우편번호</label> &nbsp;</th>
                <td><input type="text" id="zip" name="zip" value=""><br></td>
            </tr>
            
            <tr>                    
                <th><label for="addr1">주소</label> &nbsp;</th>
                <td><input type="text" id="addr1" name="addr1"  value="">
                    <input type="text" name="addr2" value=""></td>
            </tr>
            
            <tr>
                <th><label for="phone">핸드폰번호</label>  &nbsp;</th>
                <td><input type="tel" id="phone" name="phone" value=""></td>
             </tr>
             
             <tr>
                <th><label for="job">직업</label>  &nbsp;</th>
                <td><select id="job" name="job" size="1" class="selectBox">  
                      <option value="학생">학생</option> 
                      <option value="컴퓨터/인터넷">컴퓨터/인터넷</option> 
                      <option value="언론">언론</option> 
                      <option value="공무원">공무원</option> 
                      <option value="군인">군인</option> 
                      <option value="서비스업">서비스업</option> 
                      <option value="교육">교육</option> 
                   </select></td>
             </tr>
              
              <tr>
                 <th><label for="chk_mail">메일/SMS 정보 수신</label>  &nbsp;</th>
                 <td><input type="radio" id="chk_mail" name="chk_mail" checked> 수신 
                    <input type="radio" id="chk_mail" name="chk_mail"> 수신거부</td>
             </tr>
         
             <tr>
                <th><label for="interest">관심분야</label>  &nbsp;</th>
                <td>
                    <input type="checkbox" id="interest" name="interest" value="생두"> 생두         
                    <input type="checkbox" id="interest" name="interest" value="원두"> 원두         
                    <input type="checkbox" id="interest" name="interest" value="로스팅"> 로스팅         
                    <input type="checkbox" id="interest" name="interest" value="핸드드립"> 핸드드립         
                    <input type="checkbox" id="interest" name="interest" value="에스프레소"> 에스프레소         
                    <input type="checkbox" id="interest" name="interest" value="창업"> 창업
                </td>
             </tr>
             
              
          </table>
          
         	 <p class="subBtn">
         	 <input type="submit" value="회원가입" onclick="return check_ok()">
             <input type="reset" value="취소">
             </p>
          
       </form>
   </section>


</body>
</html>