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
        	$("#b1").click(function() {
        		$("h1").slideUp();
        	});
        	
        	$("#b2").click(function() {
        		$("h1").slideDown();
        	});
        	
        	$("#b3").click(function() {
        		$("h1").slideToggle();
        	});
        	$("#b4").click(function() {
        		$("h1").toggle();
        	});
        	
         });
         </script>
      
      </head>
   <body>
   <button id="b1">나는 위로</button>
   <button id="b2">나는 아래로</button>
   <button id="b3">나는 토글</button>
   <button id="b4">나는 보이고 안보이고 토글</button>
   		<h1>나는 움직일 내용이야..</h1>
   		
   </body>
</html>