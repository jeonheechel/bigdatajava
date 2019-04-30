package 일기장;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 로그인 {
	private JTextField t1;
	private JTextField t2;

	public  로그인() {
		JFrame f = new JFrame("나의 일기장 로그인 화면");
		f.setSize(540,700);
		ImageIcon icon = new ImageIcon("diary.jpg");
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JLabel l = new JLabel();
		l.setIcon(icon);
		f.getContentPane().add(l);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(lblId);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(lblPw);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인처리");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String ID = "asdf";
				String PW = "1234";
				if(id.equals(ID) && pw.equals(PW)) {
				다이어리 diary = new 다이어리(); 
				System.out.println("로그인 ok");
				}else if(!id.equals(ID)){
					System.out.println("아이디가 틀렷습니다 ");
				}else if(!pw.equals(PW)) {
					System.out.println("비밀번호가 틀렷습니다");
				}else {
					System.out.println("아이디,비밀번호 모두 틀렷습니다");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setForeground(Color.RED);
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
	}
	//static를 없애기 위하여 객체를 생성해서 호출이 되도록 만들어 봤다
	
	public static void main(String[] args) {
		로그인 log = new 로그인();//객체생성되면 무조건 실행되기 때문에 가져다 쓸수 있다
		
	}

}
