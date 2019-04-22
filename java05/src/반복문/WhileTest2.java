package 반복문;

public class WhileTest2 {

	public static void main(String[] args) {//혼자실행할때 main을 쓴다

		int sum=0;//초기값
		int start=1;
		
		while(start<=10) {//조건식
			//1부터 10까지 더해줌
			System.out.println(start+"번 실행");
			//sum=sum+start;
			sum += start;
			System.out.println("sum :"+sum+"총합");
			//num = num+1;
			start++;//증감식
		}
		System.out.println(sum);
				
	}

}
