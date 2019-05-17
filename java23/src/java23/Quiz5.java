package java23;

public class Quiz5 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("☏");
			System.out.print("♧");
		}
		
	}

}
