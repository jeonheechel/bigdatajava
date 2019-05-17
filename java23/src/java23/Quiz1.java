package java23;

public class Quiz1 extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("증가:"+i);
		}
	}

}
