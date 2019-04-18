package control;

public class Quiz4 {
	public static void main(String[] args) {
	/*pi=3.14 r=12
	 * 원의면적= pi*r*r
	 * width=11 height=22
	 *  사각형의 면적= width*height
	 * 반지름이 12인 원의 면적은
	 * 가로가11 세로가 22인 사각형의 면적은
	 * 가로 세로가 같은가요? false
	 * 반지름이 10보다 큰가요? true
	 */
		double pi = 3.14;
		int r = 12;
		int	width = 11;
		int height =22;
		System.out.println(" 반지름이"+r+"인 원의 면적은.."+(pi*r*r));
		System.out.println("가로가"+width+"세로가"+height+"인 사각형의 면적은"+(width*height));
		if(width != height){
			System.out.println("가로세로가 같은가요?  : "+false);
		}else{
			System.out.println("가로세로가 같은가요?  : "+true);
		}
		
		if(r>10){
			System.out.println("반지름이 10보다 큰가요? :"+true);
		}else{
			System.out.println("반지름이 10보다 큰가요? :"+false);
		}
		
		
	}
}
