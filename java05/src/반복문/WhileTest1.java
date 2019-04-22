package 반복문;

public class WhileTest1 {

	public static void main(String[] args) {//혼자실행할때 main을 쓴다

		// 반복할때 사용하는 문법 = while,for문
		//while(true) {//무조건 논리형이다
			//조건에 맞는 동안 중관괄호안에 있는것을 처리할게라는 뜻이다
		
		int x=100;//ram에  생긴 변수다 데이터를 저장할 공간이다 (선언)
		int y=200;//ram에  생긴 변수다 데이터를 저장할 공간이다 (선언)
		//초기값
		
		
		while(x < y) {//조건식
			System.out.println("환영합니다");
			//무한 루프문이다 게임만들때 자주사용한다
			
			//끝날지점에 조건을 만들어야 한다
			x = x + 10;//증감식
		}
		
	}

}
