package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
						
		int[] num = new int[4];
		num[0] =44;
		num[1] =66;
		num[2] =22;
		num[3] =88;
		//int[] abc= {44,66,22,88};이렇게 써도 된다
		int count=0;
		
		
		//System.out.println(num.length);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			count++;
		}
		System.out.println("-----------------");
		System.out.println("전체갯수는 :"+count);
		System.out.println("-----------------");
		num[0] =55;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		
		}
		
		
		
	}

}
