package cal;

public class Test2 {

	public static void main(String[] args) {
		int abc=400;
	
	//문제2
int result = abc%2;
if(result == 0) {
	System.out.println("abc는 :"+abc+"짝수입니다");
}else {
	System.out.println("abc는 :"+abc+"홀수입니다");
}

System.out.println("-------삼항연산자료출력---------");

System.out.println(result ==0 ?"짝수":"홀수");
}

	
	
}
