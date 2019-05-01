package 스태틱;

public class 직원체크 {

	public static void main(String[] args) {
		
		 Staff staff1 = new Staff("루피", "남" , 15 );
		 Staff staff2 = new Staff("조로", "남" , 16 );
		 Staff staff3 = new Staff("쵸파", "남" , 12 );
//		 System.out.println(staff1);
//		 System.out.println(staff2);
//		 System.out.println(staff3);
		 
			//1번문제
			System.out.println("1번문제 직원수");
			System.out.println(Staff.num);
			
			//1번문제
			System.out.println("2번문제 평균나이");
			System.out.println(Staff.average);
			
			
			//3번문제
			System.out.println("3번문제 전체 리스트");
			System.out.println(staff1);
			System.out.println(staff2);
			System.out.println(staff3);
	}

}
