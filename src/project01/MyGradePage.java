package project01;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyGradePage extends JPanel{
	MainPage m = new MainPage(); 
	userDAO dao;
	userDTO dto;
	
	public MyGradePage() {
		CollectingImage img = new CollectingImage();
		dao = new userDAO();
		dto = dao.select(m.getId());
	
		
		
		
		
		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18, 18, 18));
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);
		JPanel p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		p2.setBackground(new Color(18, 18, 18));
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		JLabel titleLabel = new JLabel("나의 현재 등급");
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		titleLabel.setBounds(240, 10, 410, 150);
		p1.add(titleLabel);
		
		
		JLabel lblNewLabel = new JLabel("아이디 : ");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setBounds(240, 206, 98, 29);
		p1.add(lblNewLabel);
		
		
		JLabel idLabel = new JLabel(m.getId());
		idLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		idLabel.setForeground(new Color(255, 250, 205));
		idLabel.setBounds(343, 200, 317, 42);
		p1.add(idLabel);
		
		JLabel lblNicName = new JLabel("닉네임 : ");
		lblNicName.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblNicName.setForeground(new Color(255, 250, 205));
		lblNicName.setBounds(240, 260, 98, 29);
		p1.add(lblNicName);
		
		JLabel nicNameLabel = new JLabel(dto.getNicname());
		nicNameLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		nicNameLabel.setForeground(new Color(255, 250, 205));
		nicNameLabel.setBounds(343, 253, 307, 42);
		p1.add(nicNameLabel);
		
		JLabel lblGrade = new JLabel("현재등급");
		lblGrade.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblGrade.setForeground(new Color(255, 250, 205));
		lblGrade.setBounds(386, 381, 100, 29);
		p1.add(lblGrade);
		JLabel gradeImage = new JLabel();
		gradeImage.setBounds(366, 441, 155, 155);
		p1.add(gradeImage);
		if(dto.getGrade() >= 0 && dto.getGrade() <= 3) {
			gradeImage.setIcon(img.star1);
		}else if(dto.getGrade() >= 4 && dto.getGrade() <= 6) {
			gradeImage.setIcon(img.star2);
		}else if(dto.getGrade() > 6) {
			gradeImage.setIcon(img.star3);
		}
		gradeImage.setForeground(new Color(255, 250, 205));
		
		
		JButton backwardBtn = new JButton();
		backwardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "이전 페이지로 돌아가시겠습니까?", "뒤로가기",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MyPage back = new MyPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);

				} else {
					// If you selected No.
				}

			}
		});
		backwardBtn.setBounds(10, 10, 200, 45);
		p1.add(backwardBtn);
		backwardBtn.setIcon(img.backwardBtn);
		backwardBtn.setRolloverIcon(img.backwardBtn1);
		backwardBtn.setPressedIcon(img.backwardBtn2);
		
		
		
		
		
		JLabel gradeLabel = new JLabel(String.valueOf(dto.getGrade()), SwingConstants.RIGHT);
		gradeLabel.setBounds(386, 654, 83, 44);
		gradeLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		gradeLabel.setForeground(new Color(255, 250, 205));
		p1.add(gradeLabel);
		
		JLabel lblNewLabel_1 = new JLabel("현재          포인트");
		lblNewLabel_1.setBounds(333, 668, 224, 29);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(new Color(255, 250, 205));
		p1.add(lblNewLabel_1);
		
		
		
		
		
		
		
		
		
		
	}
}
