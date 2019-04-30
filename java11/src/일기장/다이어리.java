package 일기장;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 다이어리 {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	//이렇게 되면 다른곳에서 이클래스를 new헤서 불러오면 무조건 호출이다
	public 다이어리 () {
		JFrame f = new JFrame("나의 일기장 작성 화면");
		f.setSize(600,700);
		JLabel l = new JLabel("<<<<일기작성날짜>>>>");
		l.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(l);
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label = new JLabel("<<<<일기작성제목>>>>");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		f.getContentPane().add(t2);
		
		JLabel label_1 = new JLabel("<<<<일기작성내용>>>>");
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(label_1);
		

        JTextArea t3 = new JTextArea();
        t3.setForeground(Color.BLUE);
        t3.setBackground(Color.YELLOW);
        t3.setFont(new Font("Monospaced", Font.BOLD, 18));
        t3.setColumns(50);
        t3.setRows(10);
        f.getContentPane().add(t3);
        
        JButton b1 = new JButton("파일에 저장하기!");
        b1.setFont(new Font("굴림", Font.PLAIN, 35));
        b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String date = t1.getText();
                String title = t2.getText();
                String content = t3.getText();
                System.out.println(date);
                System.out.println(title);
                System.out.println(content);
                
                FileWriter file;
                try {
                    file = new FileWriter(date+".txt");
                    file.write(date+"\n");
                    file.write(title+"\n");
                    file.write(content+"\n");
                    file.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

                

       
        f.getContentPane().add(b1);
        
        JButton b2 = new JButton("파일에서 읽어오기!");
        b2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        b2.setFont(new Font("굴림", Font.PLAIN, 40));
        f.getContentPane().add(b2);

		
		
		
		
		f.setVisible(true);
	}

}
