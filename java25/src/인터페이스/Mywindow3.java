package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow3 extends JFrame implements ActionListener{
	JButton b,b2;//전역변수 선언
	
	public Mywindow3() {
		setSize(300,300);
		b = new JButton("나를 눌러요"); 
	    b2 = new JButton("나를 눌러요2"); 
		add(b);
		add(b2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		//ActionProcess action = new ActionProcess();
		b.addActionListener(this);//나자신을 this라고 한다
		b2.addActionListener(this);
		
		setVisible(true);
		
		System.out.println(b);
		System.out.println(b2);
	}
	public static void main(String[] args) {
		Mywindow3 name = new Mywindow3();
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {//두개의 주소값이 같았을때 조건식
			System.out.println("나를 눌러요!!!");
		}else if(e.getSource() == b2){//두개의 주소값이 같았을때 조건식
			System.out.println("나를 눌러요2!!!");
		}
	}

}
