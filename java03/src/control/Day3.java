package control;

public class Day3 {
/*오늘 아침에 대한 정보출력(변수에 저장해서 출력)
 * -----------------------
 * 오늘 아침을 먹고왔나요? : true
 * 오늘 타고온 버스의 번호나 지하철 노선은? : 2호선
 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는:9 
 * 오늘부터  프로젝트 함께할 우리 조원의 이름은 : 홍길동
 */
	public static void main(String[] args) {
		
		boolean rice =true;
		int train=7;
		double today=5.0;//둘다 실수로 잡아야한다
		double yesterday=10.5;//둘다 실수로 잡아야한다
		String name="홍길동";
		
		System.out.println("오늘아침은 먹고왔나요?  :"+rice);
		System.out.println("오늘 타고온 버스의 번호나 지하철 노선은?  :"+train+"호선");
		System.out.println("오늘은 어제("+yesterday+")보다 5.5도 낮아요   :"+today+"도입니다!");
		System.out.println("오늘부터  프로젝트 함께할 우리 조원의 이름은    :"+name+" 입니다!");
		
	}

}
