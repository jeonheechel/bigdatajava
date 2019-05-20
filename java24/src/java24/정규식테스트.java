package java24;

public class 정규식테스트 {

	public static void main(String[] args) {

		String[] data= {"bat","baby","bonus","cA","ca","co","c","c0","car","combat","count","date","disc"};
		System.out.println(data.length);
		
		String s2 = "Hi, Hello!! call";
		String s3 = "Hi7, Hello!! call";
		
		String[] s4 = s3.split("H[a-z][0-9]");//패턴설정햇음 H대문자로 시작하고 2번째 글자는 a~z사이의  문자가 오면되
		for (String s : s4) {
			System.out.println(s);
			
		}
		System.out.println();
		
		
		
		
	}

}
