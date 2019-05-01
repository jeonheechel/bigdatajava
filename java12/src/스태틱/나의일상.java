package 스태틱;

public class 나의일상 {

	public static void main(String[] args) {

		
		Day day1 = new Day("자바공부",10,"강남");
		//System.out.println(Day.count);
		Day day2 = new Day("여행",15,"강원도");
		//System.out.println(Day.count);
		Day day3 = new Day("운동",11,"피트니스");
		//System.out.println(Day.count);
		
		//1번문제
		System.out.println("1번문제");
		System.out.println(Day.total);
		System.out.println(Day.getTotal());
		
		
		//2번문제
		System.out.println("2번문제");
		System.out.println(Day.average);
		
		
		
		
		
		//3번문제
		System.out.println("3번문제");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		//4번문제
		System.out.println("4번문제");
		System.out.println(Day.count);
		
	}

}
