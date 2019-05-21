package 인터페이스2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow3 extends JFrame implements ActionListener{
	JButton b,b2,b3;//전역변수 선언
	
	public Mywindow3() {
		setSize(300,300);
		b = new JButton("나는 루피"); 
	    b2 = new JButton("나는 쵸파"); 
	    b3 = new JButton("나는 조로"); 
		add(b);
		add(b2);
		add(b3);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		//ActionProcess action = new ActionProcess();
		b.addActionListener(this);//나자신을 this라고 한다
		b2.addActionListener(this);
		b3.addActionListener(this);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		Mywindow3 name = new Mywindow3();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("나는 선장!!!");
		}else if(e.getSource() == b2){
			System.out.println("나는 선의!!!");
		}else if(e.getSource() == b3) {
			System.out.println("나는 전투원!!!");
		}
	}

}
