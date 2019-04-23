package 배열;

public class 배열연습3 {

	public static void main(String[] args) {
						
		int[] num = {444,666,777};//배열을 가르키는 주소이다
		
		//int num[] = new int[4];
		//배열에 첫번째 값에 세번째 값에 넣어보세요
		num[0] = num[2];//복사의 개념이다 2번째인덱스 값을 0번째 인덱스에 덮어쓴다
		
		//제대로 서로 숫자를 교환을 하고싶으면 다른곳으로 옮겨둬라
		
		
				
		//배열 첫번째 값을 확인, 세번째 값을 확인
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		
		
	}

}
