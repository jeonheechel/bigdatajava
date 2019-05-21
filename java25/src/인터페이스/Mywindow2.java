package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow2 extends JFrame implements ActionListener{

	public Mywindow2() {
		setSize(300,300);
		JButton  b = new JButton("나는나는나는나는"); 
		add(b);
		//ActionProcess action = new ActionProcess();
		b.addActionListener(this);//나자신을 라고 한다
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		Mywindow2 name = new Mywindow2();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());//버튼에 있는 텍스트를 가져오는거다
	}

}
