package java17;

public class Elementary extends Student{
	//정적
	int age;
	
	
	@Override//재정의
	public void 공부하다() {
		System.out.println("줄넘기 공부!!");
		
	}
	
	
	
	
	//동적
	public void play() {
		System.out.println("운동장에서 축구파이야!");
	}


	
	

}
