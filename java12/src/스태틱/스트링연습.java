package 스태틱;

public class 스트링연습 {
	public static void main(String[] args) {
		 String s1=" ";
		 String s2="A";
		 //s1의 0번째 인덱스를 가져오는것
		 System.out.println(s1.charAt(0));
		 //s1에 인덱스 끝에 s2를 붙여주는 메서드 
		 System.out.println(s1.concat(s2));
		 //사전적 순서로 문열비교후 앞에있으면 -1같으면 0 1이 반환
		 System.out.println(s1.compareTo(s2));
		 //대소문자 비교
		 System.out.println(s1.equalsIgnoreCase(s2));
		 //length 가 비어있으면 false를 반환
		 System.out.println(s1.isEmpty());
		 //몇개의 문자열이 들어가 있는지
		 System.out.println(s2.length());
	}

}
