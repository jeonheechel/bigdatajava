package java24;

public class StringTest2 {

	public static void main(String[] args) {
		String s1="I am a java programmer";
		String s2="I am a python programmer";
		System.out.println(s1.equals(s2));//참조하고 있는 값을 비교한다
		System.out.println(s1 == s2);//객체의 들어있는 주소값
		
		
		String s3="2011511";
		
		System.out.println(s1.toString());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(7));
		System.out.println(s3.charAt(0));
		
		System.out.println();
		
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println(buffer.charAt(0));//꼭 기억해두자
		System.out.println();
		
		StringBuffer 주민번호 = new StringBuffer("920814-1234567");
		System.out.println(주민번호.charAt(7));
		
		System.out.println();
		System.out.println(s1.substring(1));//입력인덱스부터 다가져 온다
		System.out.println(s1.substring(1,5));//1<이사이에의인덱스를 출력>5
		
		System.out.println(s1.substring(7,11));//7~11사이의 인덱스 출력
		
		
		
		String[] result = s1.split(" ");
		System.out.println(result.toString());
		for (String s : result) {
			System.out.println(s);
			
		}
		System.out.println("--------------------------------");
		String s5 = "Hi, Good monning";
		String[] result2 = s5.split(" ");
		System.out.println(result2.length);
		for (String s : result2) {
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		
		String[] result3 = s5.split(",");
		System.out.println(result3.length);
		for (String s : result3) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------------");
		String s6 = "Hi. Good monning";
		String[] result4 = s6.split("[.]");
		System.out.println(result4.length);
		for (String s : result4) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println(s6.indexOf("G"));
		
		System.out.println();
		
		String s7 = "http://www.naver.com/member/index.jsp";
		System.out.println(s7.lastIndexOf("/"));//마지막 슬러쉬 가져온거다
		System.out.println(s7.substring(s7.lastIndexOf("/")));//여기 이후에 있는 것 가지고 와라
		
	
		System.out.println(s6.toUpperCase());//다 대문자로 바꾸는것
		System.out.println(s6.toLowerCase());//다 소문자로 바꾸는것
		
		
	
		String ss6 = s6.replaceAll(" Good", "best");//문자전체를 바꿀때
		System.out.println(ss6);
		
		char[] result6 = s6.toCharArray();
		for (char c : result6) {
			System.out.println(c);
		}
		
		
		String s8 = "  hello!! win !!   ";
		System.out.println(s8.trim());//공백삭제시킬때
		
		
		System.out.println(s8.concat("final"));//스트링을 붙일때
		
		System.out.println(s8.contains("hello"));
		
		String s9 = "winner class";
		System.out.println(s9.concat("class"));
		System.out.println(s9.startsWith("Winner"));
		System.out.println(s9.endsWith("class"));
		String s10="hera@naver.com";
		System.out.println(s10.endsWith("com"));
		if(s10.endsWith("com")) {
			System.out.println("닷컴회사 시군요");
		}else {
			System.out.println("닷컴회사가 아니시군요");
		}
		
		
		
		
	}

}
