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
		$.ajax({
			url:"https://api.rss2json.com/v1/api.json?rss_url=http://www.chosun.com/site/data/rss/rss.xml&api_key=qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
			datatype:"json",
			data:{
				url : "http://www.chosun.com/site/data/rss/rss.xml",
				api_key : "qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
				count : 20
			},
			success : function(result){
				for (let index = 0; index < 20; index++) {
					
					var title = result.items[index].title;
					var link = result.items[index].link;
					var img = result.items[index].thumbnail;
					$("#result").append("- <a href = "+ link + ">" +title+"<br>");
					$("#result").append("- <img src = "+img+" width=200 height=100 ><br>");
				}
			}
		});
	
	});
	$(function() {
        $("#b2").click(function() { //정치연결
            $("#result").empty();
            $.ajax({
                url:"https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fpolitics.xml&api_key=qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
                dataType: "json",
                data: { //서버로 전송되는 값.
                    url: "http://www.chosun.com/site/data/rss/politics.xml",
                    api_key : "qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
                    count: 20
                },
                success: function(result) {
                    /* alert(‎"조선일보 속보 사이트 연결 성공...!!") */
                    for(i = 0; i<20; i++){
                        var title = result.items[i].title;
                        var link = result.items[i].link;
                        var thumbnail = result.items[i].thumbnail;
                        $("#result").append("<a href=" + link + "><font color=red>" + title + "</font></a><br>")
                        $("#result").append("<img width=100 height=100 src=" + thumbnail + "><br><br>")
                    }
                }
            });
        });
        $("#b3").click(function() { //사회연결
            $("#result").empty();
            $.ajax({
                url:"https://api.rss2json.com/v1/api.json?rss_url=http://www.chosun.com/site/data/rss/rss.xml&api_key=qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
                dataType: "json",
                data: { //서버로 전송되는 값.
                    url: "http://www.chosun.com/site/data/rss/national.xml",
                    api_key : "qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
                    count: 20
                },
                success: function(result) {
                    /* alert(‎"조선일보 속보 사이트 연결 성공...!!") */
                    for(i = 0; i<20; i++){
                        var title = result.items[i].title;
                        var link = result.items[i].link;
                        var thumbnail = result.items[i].thumbnail;
                        $("#result").append("<a href=" + link + "><font color=red>" + title + "</font></a><br>")
                        $("#result").append("<img width=100 height=100 src=" + thumbnail + "><br><br>")
                    }
                }
            });
        });
        
        $("#b1").click(function() { //속보 다시연결
            $("#result").empty();
            $.ajax({
                url:"https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fnational.xml&api_key=qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
                dataType: "json",
                data: { //서버로 전송되는 값.
                    url: "http://www.chosun.com/site/data/rss/rss.xml",
                    api_key : "qnm6zhigpn3qodrqhecbskatrniotnntnhojlhoe",
                    count: 20
                },
                success: function(result) {
                    /* alert(‎"조선일보 속보 사이트 연결 성공...!!") */
                    for(i = 0; i<20; i++){
                        var title = result.items[i].title;
                        var link = result.items[i].link;
                        var thumbnail = result.items[i].thumbnail;
                        $("#result").append("<a href=" + link + "><font color=red>" + title + "</font></a><br>")
                        $("#result").append("<img width=100 height=100 src=" + thumbnail + "><br><br>")
                    }
                }
            });
        });
    });
	
	
	</script>
	</head>
	<body>
		<button type="button" id = "b1">사회</button>
		<button type="button" id = "b2">정치</button>
		<button type="button" id = "b3">속보</button>
			<div id="result"></div>
	</body>
</html>