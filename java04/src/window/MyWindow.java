package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyWindow {

	public static void main(String[] args) {
		/*그래픽 프로그램 1단계
		 * 별로 좋지않은 코드다
		 * 부품 가져올것
		 * 프레임,
		 * 버튼,
		 * 글자들,
		 * 입력받는 화면
		 */
		
		//프레임,
		JFrame f = new JFrame("입력값 받는 프로그램");
		JButton button = new JButton("나를 눌러요");
		button.setBackground(Color.BLUE);
		button.setForeground(Color.GREEN);
		button.setFont(new Font("굴림", Font.PLAIN, 20));
		button.setBackground(Color.BLUE);
		button.setForeground(Color.GREEN);
		button.setFont(new Font("굴림", Font.PLAIN, 16));
		FlowLayout flow = new  FlowLayout();
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		label.setFont(new Font("굴림체", Font.PLAIN, 14));
		label.setForeground(Color.BLUE);
		JTextField text = new JTextField(20);
		text.setFont(new Font("굴림체", Font.PLAIN, 18));
		f.setSize(300,300);
		text.setFont(new Font("굴림체", Font.PLAIN, 16));
		f.setSize(300,300);
		
		//물흐르듯이배치
		f.getContentPane().setLayout(flow);
		
		//위에로 올려야 텍스트.을 인식이 된다
		//버튼,
		
		//인터페이스다
		//자동 호출된다
		//버튼을 누르면 내가친값이 콘솔창에 출력되야 한다
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 System.out.println("버튼이 눌러졌군요..!!");
			String data	 =  text.getText();
			System.out.println("당신의 주요과목은 : "+data);
			}
		});
		
		//글자들,
		
		f.getContentPane().add(label);
		//입력받는화면(한줄짜리)
		f.getContentPane().add(text);
		f.getContentPane().add(button);
		JLabel label2 = new JLabel("당신이 사용하는 개발툴을 입력하세요.");
		label2.setFont(new Font("굴림체", Font.PLAIN, 14));
		label2.setForeground(Color.BLUE);
		f.getContentPane().add(label2);
		JTextField text2 = new JTextField(20);
		f.getContentPane().add(text2);
		JButton button2 = new JButton("나를 눌러요");
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.GREEN);
		button2.setFont(new Font("굴림", Font.PLAIN, 18));
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 System.out.println("버튼이 눌러졌군요..!!");
			String data2	 =  text2.getText();
			System.out.println("당신의 주요과목은 : "+data2);
			}
		});
		f.getContentPane().add(button2);
		
		
		f.setVisible(true);
	}

}
