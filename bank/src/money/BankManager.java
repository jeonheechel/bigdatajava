package money;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;



import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class BankManager {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	static BankDAO dao;
	static BankDTO dto;
	
	public static void main(String[] args) throws Exception {
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("은행 관리 프로그램");
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("은행 관리 프로그램");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(93, 10, 293, 36);
		f.getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("삽입");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Id = t1.getText();
				String Name = t2.getText();
				String Age = t3.getText();
				String Tel = t4.getText(); 
				
				 dao = new BankDAO();
				 dto = new BankDTO();
				 
				dto.setId(Id);
				dto.setId(Name);
				dto.setAge(Age);
				dto.setTel(Tel);
				
				try {
					dao.insert(Id, Name, Age, Tel);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
				JOptionPane.showMessageDialog(b1, "가입 되셨습니다 환영합니다 ");
			}
		});
		b1.setBounds(0, 376, 90, 75);
		f.getContentPane().add(b1);
		
		JButton b3 = new JButton("수정");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Id = t1.getText();
				String Tel = t4.getText(); 
				
				 dao = new BankDAO();
				 dto = new BankDTO();
				 dto.setTel(Tel);
				 dto.setId(Id);
				 
				 try {
					dao.update(Id, Tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				JOptionPane.showMessageDialog(b3, "수정 되셨습니다 환영합니다 ");
			}
		});
		b3.setBounds(90, 376, 90, 75);
		f.getContentPane().add(b3);
		
		JButton b2 = new JButton("삭제");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Id = t1.getText();
				
				 dao = new BankDAO();
				 dto = new BankDTO();
				 
				 dto.setId(Id);
				 
				 try {
					dao.delete(Id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				
				JOptionPane.showMessageDialog(b2, "삭제 되셨습니다 환영합니다 ");
			}
		});
		b2.setBounds(179, 376, 90, 75);
		f.getContentPane().add(b2);
		
		JButton b4 = new JButton("검색");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Id = t1.getText();
				
				dao = new BankDAO();
				dto = new BankDTO();
				
				
				try {
					dto = dao.select(Id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				t1.setText(dto.getId());
				t2.setText(dto.getName());
				t3.setText(dto.getAge());
				t4.setText(dto.getTel());
				
					
				
				
				
				
				
				
			}
		});
		b4.setBounds(270, 376, 90, 75);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("전체검색");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dao = new BankDAO();
				dto = new BankDTO();
				
				ArrayList list = null;
				try {
					list = dao.selectAll();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				for (int i = 0; i < list.size(); i++) {
					BankDTO dto = (BankDTO)list.get(i);
					System.out.println("id:"+dto.getId());
					System.out.println("name:"+dto.getName());
					System.out.println("age:"+dto.getAge());
					System.out.println("tel:"+dto.getTel());
					
				}
				
				JOptionPane.showMessageDialog(b5, "전체 검색을 했습니다 ");
			}
		});
		b5.setBounds(361, 376, 111, 75);
		f.getContentPane().add(b5);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(41, 67, 84, 27);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("이름");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(41, 128, 84, 27);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("나이");
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(41, 180, 84, 27);
		f.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("전화번호");
		label_2.setFont(new Font("굴림", Font.PLAIN, 18));
		label_2.setBounds(41, 247, 84, 27);
		f.getContentPane().add(label_2);
		
		t1 = new JTextField();
		t1.setBounds(153, 66, 207, 27);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(153, 133, 207, 27);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(153, 185, 207, 27);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(153, 252, 207, 27);
		f.getContentPane().add(t4);
		
		
		
		f.setVisible(true);
	}
}
