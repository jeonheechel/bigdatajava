package 이차원배열;

public class 이차원배열Quiz1 {
	
	public static void main(String[] args) {
		int[][] numclass = {{44,55,66},{77,88,99,100}};
		
	
		//각반의 평균 구하기
		int sum = 0;
		for (int i = 0; i < numclass.length; i++) {
			//1줄 프린트 0줄일때 length만큼  1줄일때 length만큼
			for (int j = 0; j < numclass[i].length; j++) {
				//행,열 출력
				sum = sum+numclass[i][j];			
			}
			System.out.println(i+1+"반의평균은:"+ sum/numclass[i].length);
			sum = 0;
		}
		
		
		
		//전체출력
		for (int i = 0; i < numclass.length; i++) {
			
			//1줄 프린트 0줄일때 length만큼  1줄일때 length만큼
			for (int j = 0; j < numclass[i].length; j++) {
				//행,열 출력
				System.out.print(numclass[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
