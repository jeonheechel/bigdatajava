package 이차원배열;

public class 이차원배열 {

	public static void main(String[] args) {
		//초기값을 지정하지 않는경우
		int[][] seat = new int[3][10];
		//30개가 한거번에 만들어진다

		
		//배열을 만들때 
		//초기값을 지정하는경우
		int[][] num = {//시작
							{1,2},//0행
							{4,5,6} //1행
					};//끝
		System.out.println(num[0][1]);//0행1열을 출력해라
		System.out.println(num[1][2]);//1열2행을 출력해라
		
		System.out.println("배열의 개수(행의개수):"+num.length);//행만 들어가게 된다 행의개수
		System.out.println("배열 0행의 열개수: "+num[0].length);
		System.out.println("배열 1행의 열개수: "+num[1].length);
		
		//포문 출력법  2줄 프린트하기
		int abc=0;
		for (int i = 0; i < num.length; i++) {
			
			//1줄 프린트 0줄일때 length만큼  1줄일때 length만큼
			for (int j = 0; j < num[i].length; j++) {
				//행,열 출력
				System.out.print(num[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
