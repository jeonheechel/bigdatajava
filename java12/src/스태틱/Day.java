package 스태틱;

public class Day {

	String doing;
	int time;
	String location;
	static int count;//하나만 있고 계속 누적이 되라라는뜻
	static int total;//총시간
	static int average;
	
	public Day() {// 기본 생성자
		
	}

	public Day(String doing, int time, String location) {//파라미터 있는 생성자
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		total += time;
		average = total/3;
	}
	
	public static int getTotal() {
//		return time;//static메서드내에 사용되는 멤버변수는 반드시 static변수만 가능하다
//		//객체생성과 상관없이 클래스이름으로 접근가능한 변수
		return total;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	

	
	
	
	
}
