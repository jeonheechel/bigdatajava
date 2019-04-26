package 이차원배열;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		
		//정렬
		int[] num = {33,66,44,22,11,77,99}; 
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}

}
