package bigdata;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Study {
	public static JTextField t1;
	public static JTextField t2;
	public static JTextField t3;
	public static JTextField t4;
	public static JTextField t5;
	static ArrayList list = new ArrayList();
	
	

	
		public static void main(String[] args) {
		 JFrame f = new JFrame();
		 f.setSize(500,500);
		 f.getContentPane().setLayout(null);
		 
		 JTextArea ja1 = new JTextArea();
		 
		 JLabel lblNewLabel = new JLabel("          수강신청 입력된창");
		 lblNewLabel.setBounds(161, 10, 173, 46);
		 f.getContentPane().add(lblNewLabel);
		 
		 JLabel lblNewLabel_1 = new JLabel("    수강아이디");
		 lblNewLabel_1.setBounds(12, 74, 94, 27);
		 f.getContentPane().add(lblNewLabel_1);
		 
		 JLabel label = new JLabel("    수강과목");
		 label.setBounds(12, 122, 94, 27);
		 f.getContentPane().add(label);
		 
		 JLabel label_1 = new JLabel("    수강내용");
		 label_1.setBounds(12, 162, 94, 27);
		 f.getContentPane().add(label_1);
		 
		 JLabel label_2 = new JLabel("    수강비용");
		 label_2.setBounds(12, 207, 94, 27);
		 f.getContentPane().add(label_2);
		 
		 JLabel label_3 = new JLabel("    수강 가능인원");
		 label_3.setBounds(0, 253, 94, 27);
		 f.getContentPane().add(label_3);
		 
		 t1 = new JTextField();
		 t1.setBounds(135, 77, 199, 21);
		 f.getContentPane().add(t1);
		 t1.setColumns(10);
		 
		 t2 = new JTextField();
		 t2.setColumns(10);
		 t2.setBounds(135, 125, 199, 21);
		 f.getContentPane().add(t2);
		 
		 t3 = new JTextField();
		 t3.setColumns(10);
		 t3.setBounds(135, 165, 199, 21);
		 f.getContentPane().add(t3);
		 
		 t4 = new JTextField();
		 t4.setColumns(10);
		 t4.setBounds(135, 210, 199, 21);
		 f.getContentPane().add(t4);
		 
		 t5 = new JTextField();
		 t5.setColumns(10);
		 t5.setBounds(135, 253, 199, 21);
		 f.getContentPane().add(t5);
		 
		 JButton b1 = new JButton("입력");
		 b1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	 String id = t1.getText();
		 	 String sub = t2.getText();
		 	 String content = t3.getText();
		 	 String price = t4.getText();
		 	 String num = t5.getText();
		 	StudyManager dto = new StudyManager();
		 	dto.setId(id);
		 	dto.setSub(sub);
		 	 dto.setContent(content);
		 	 dto.setPrice(price);
		 	 dto.setNum(num);
		 	 list.add(dto);
		 	 
		 	}
		 });
		 b1.setBounds(346, 76, 97, 23);
		 f.getContentPane().add(b1);
		 
		 JButton b2 = new JButton("출력");
		 b2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		StudyManager dto = new StudyManager();
		 		String aa = "";
		 		for (int i = 0; i < list.size(); i++) {
					dto = (StudyManager) list.get(i);
					
		 			
			 	 
			 	 
			 		 aa  =	aa +dto.getId()+" "+dto.getSub()+" "+dto.getContent()+" "+dto.getPrice()+" "+dto.getNum()+"\n";
		 		}
		 		ja1.setText(aa);
		 		
		 	}
		 });
		 b2.setBounds(346, 124, 97, 23);
		 f.getContentPane().add(b2);
		 
		 JButton b3 = new JButton("수정");
		 b3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String id1 = t1.getText();
		 		String price1 = "";
		 		
		 		StudyManager dto = new StudyManager();
		 		for (int i = 0; i < list.size(); i++) {
					dto = (StudyManager) list.get(i);
					
		 			
			 		if(dto.getId().equals(id1) ) {
			 			
			 			
			 			price1 = "30";
			 			dto.setPrice(price1);
			 			
			 			
			 		}
		 		
		 		String aa = "";
		 			aa  =	aa +dto.getId()+" "+dto.getSub()+" "+dto.getContent()+" "+dto.getPrice()+" "+dto.getNum()+"\n";
			 	ja1.setText(aa);
		 		}
			 	
		 	}
		 });
		 b3.setBounds(346, 164, 97, 23);
		 f.getContentPane().add(b3);
		 
		 JButton b4 = new JButton("정리");
		 b4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		int total= 0;
		 		String aa = "";
			 	for (int i = 0; i < list.size(); i++) {
			 		StudyManager dto= (StudyManager) list.get(i);
					total = total+ Integer.valueOf(dto.getPrice());
					
					System.out.println("I : "+i);
					System.out.println("토탈 "+total);
			 	
			 	}
			 	 aa = String.valueOf(total);
			 	ja1.setText(aa);
		 		
		 	}
		 });
		 b4.setBounds(346, 209, 97, 23);
		 f.getContentPane().add(b4);
		 
		 JButton b5 = new JButton("종료");
		 b5.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		System.exit(0);
		 		
		 	}
		 });
		 b5.setBounds(346, 255, 97, 23);
		 f.getContentPane().add(b5);
		 
		/* JTextArea ja1 = new JTextArea(); */
		 ja1.setBounds(37, 301, 372, 130);
		 f.getContentPane().add(ja1);
		 f.setBounds(0, 0, 500,500);
		 
		 
		 
		 
		 
		 f.setVisible(true);
		 
		 
		 
	
}
}


