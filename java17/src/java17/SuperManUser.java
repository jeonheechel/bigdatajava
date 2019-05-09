package java17;

public class SuperManUser {
	
	
	public static void main(String[] args) {
		//상속은 새로운 클래스를 만들때 기존 클래스의 기능을 재사용하는거다!
		
		SuperMan sMan = new SuperMan();
		
		sMan.height=200; //Person
		sMan.weight=100; //Person
		sMan.eye=3; //Man
		sMan.fly=true; //SuperMan
		
		System.out.println(sMan);
		
		sMan.eat();
		sMan.sleep();
		sMan.army();
		sMan.flySpeed();
		
	}

}
