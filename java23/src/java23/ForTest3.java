package java23;

public class ForTest3 extends Thread {//내가 스레드가 되었다

	@Override
	public void run() {//동시에 처리되도록 하고싶은 내용을 이메소드에 구현한다
		
		for (int i = 0; i < 100; i++) {
			System.out.println("스레드3-------------");
		}
		
	}
	
	
}
