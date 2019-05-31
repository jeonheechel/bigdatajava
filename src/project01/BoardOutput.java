package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import javafx.scene.input.ScrollEvent.HorizontalTextScrollUnits;

public class BoardOutput extends JPanel {

	JButton exitBtn, backwardBtn;
	MainPage m = new MainPage();
	userDAO dao;
	userDTO dto;
	userDAO dao1;
	userDTO dto1;
	
	
	BoardDAO daoB2;
	BoardDTO dtoB2;
	
	ArrayList numList;
	int[] numCount;
	String[] nicNameArr;
	String[] titleArr;
	String[] contentArr;
	String[] todayArr;
	JLabel titleLabel;
	public BoardOutput() {
		
	}
	
	public BoardOutput(String getTitle, String getNicName, String getContent, String today) {
		CollectingImage img = new CollectingImage();
		dao = new userDAO();
		dto = dao.select(m.getId());
		
		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);
		
		
		System.out.println("글작성시간 : " + today);
		
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
		
		titleLabel = new JLabel("자유게시판");
		titleLabel.setBounds(300, 10, 500, 70);
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		p1.add(titleLabel);
		
		Border border = BorderFactory.createLineBorder(Color.WHITE); 
		JLabel title = new JLabel("제목");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		title.setForeground(new Color(255, 250, 205));
		title.setBounds(30, 157, 70, 34);
		p1.add(title);
		
		JTextField titleData = new JTextField();
		titleData.setBorder(border);
		titleData.setBounds(94, 157, 774, 34);
		titleData.setText(getTitle);
		titleData.setEditable(false);
		titleData.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		titleData.setForeground(new Color(255, 255, 255));
		titleData.setBackground(new Color(18, 18, 18));
		p1.add(titleData);
		
		JLabel content = new JLabel("내용");
		content.setForeground(new Color(255, 250, 205));
		content.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		content.setBounds(30, 222, 70, 34);
		p1.add(content);
		
		JTextArea contentData = new JTextArea();
		contentData.setBorder(border);
		contentData.setText(getContent);
		contentData.setBounds(30, 266, 838, 576);
		contentData.setEditable(false);
		contentData.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		contentData.setForeground(new Color(255, 255, 255));
		contentData.setBackground(new Color(18, 18, 18));
		p1.add(contentData);
		
		if(dto.getNicname().equals(getNicName)) {
			JButton completeButton = new JButton("수정하기");
			completeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					WritePage2 next = new WritePage2(getTitle, getContent, today);
					p2.add(next);
					p2.setVisible(true);
					p1.setVisible(false);
					
					
					
				}
			});
			p1.add(completeButton);
			completeButton.setBounds(590, 852, 135, 40);
			completeButton.setBackground(new Color(18,18,18));
			completeButton.setForeground(new Color(255, 250, 205));
			completeButton.setFont(new Font("맑은 고딕", Font.BOLD, 25));
			
			JButton cancelButton = new JButton("삭제하기");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					int result = JOptionPane.showConfirmDialog(null, "해당 글을 삭제하시겠습니까? (포인트 1점 차감)", "취소",
							JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.CLOSED_OPTION) {
						// If you have closed the dialog without selecting.
					} else if (result == JOptionPane.YES_OPTION) {
						// If Yes is selected

						daoB2 = new BoardDAO();
						dtoB2 = new BoardDTO();
						daoB2.delete(today);
						
						dao1 = new userDAO();
						dto1 = new userDTO();
						
						dto1.setId(m.getId());
						dto1.setGrade(dto.getGrade() - 1);
						dao1.gradeUpdate(dto1);

						JOptionPane.showMessageDialog(null, "목록에서 삭제 되었습니다.");
						JOptionPane.showMessageDialog(null, "포인트 1점 차감!");
						
						BoardPage next = new BoardPage();
						p2.add(next);
						p2.setVisible(true);
						p1.setVisible(false);
					} else {
						// If you selected No.
					}
					
					
					
				}
			});
			p1.add(cancelButton);
			cancelButton.setBounds(735, 852, 135, 40);
			cancelButton.setBackground(new Color(18,18,18));
			cancelButton.setForeground(new Color(255, 250, 205));
			cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		backwardBtn = new JButton();
		backwardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "이전 페이지로 돌아가시겠습니까?" + "", "뒤로가기",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					BoardPage back = new BoardPage();
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

		exitBtn = new JButton();
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?", "Exit", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					System.exit(0);

				} else {
					// If you selected No.
				}
			}
		});
		exitBtn.setBounds(690, 10, 200, 45);
		p1.add(exitBtn);
		exitBtn.setIcon(img.exit2Btn);
		exitBtn.setRolloverIcon(img.exit2Btn1);
		exitBtn.setPressedIcon(img.exit2Btn2);
		
	}
	
}
