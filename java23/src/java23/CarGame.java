package java23;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	
	public class CarThread extends Thread {//내부클래스 를 사용하면 된다
		
		int x,y;
		ImageIcon icon;
		JLabel label;
		
		public CarThread(String fileName, int x, int y) {
			this.x = x;
			this.y = y;
			icon  = new ImageIcon(fileName);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
			
		}
		
		
		@Override
		public void run() {
			//자동차가 달리게 하는 코드......
			
			//랜던발생 + x축 구해줌.=> 200번 반복.
			for (int i = 0; i < 100; i++) {
				x += 10* Math.random();
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		}
	}
		
		
		
		
	
	
	public CarGame() {
		setTitle("나의 스레드 자동차 프로그램");
		setSize(600, 400);
		setLayout(null);
		
		CarThread car1 = new CarThread("[크기변환]1.jpg",100,0);
		CarThread car2 = new CarThread("[크기변환]2.jpg",100,100);
		CarThread car3 = new CarThread("[크기변환]3.jpg",100,200);
		
		
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		CarGame car = new CarGame();
		
		
	}

}
