<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
         <meta charset="UTF-8">
         <title>Insert title here</title>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
         <script type="text/javascript">
         $(function(){
            $("#food").change(function() {
               var val = $(this).val();
               console.log(val);
               $("#result").text(val);
            });
         });
         </script>
      
      </head>
   <body>
      <select name="food" id="food">
         <option value="naver" >네이버</option>      
         <option value="daum" selected="selected">다음</option>      
         <option value="google">구글</option>      
         <option value="nate">네이트</option>      
      </select>
      <div id="result"></div>
   </body>
</html>