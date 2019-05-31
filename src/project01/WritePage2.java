package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JTextArea;

public class WritePage2 extends JPanel{
	
	MainPage m = new MainPage(); 
	userDAO dao;
	userDTO dto;
	
	BoardDTO dtoB1;
	BoardDAO daoB1;
	BoardDTO dtoB2;
	BoardDAO daoB2;
	
	JLabel titleLabel;
	JButton exitBtn, backwardBtn, Alignment1Btn, Alignment2Btn, Alignment3Btn;
	JTextField inputTitleField;
	JTextArea inputContentFiled;
	int[] numCount;
	
	ArrayList numList = new ArrayList();
	public WritePage2() {
		
	}

	public WritePage2(String getTitle, String getContent, String todayTime) {
		
		CollectingImage img = new CollectingImage();
		dao = new userDAO();
		dto = dao.select(m.getId());
		
		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);
		
		daoB1 = new BoardDAO();
		dtoB1 = new BoardDTO();
		System.out.println("현재시각!! " + todayTime);
		
		numList = daoB1.selectAll();
		numCount = new int[numList.size()];
		
		for (int i = 0; i < numList.size(); i++) {
			
			dtoB1 = (BoardDTO) numList.get(i);
			numCount[i] = dtoB1.getNumber();
		}
		
		for (int i = 0; i < numCount.length; i++) {
			System.out.println("번호 : " + numCount[i]);
		}
		
		
		
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
		
		
		titleLabel = new JLabel("글 수정하기");
		titleLabel.setBounds(280, 10, 500, 70);
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		p1.add(titleLabel);
		
		Border border = BorderFactory.createLineBorder(Color.WHITE); 
		
		JLabel title = new JLabel("제목");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		title.setForeground(new Color(255, 250, 205));
		title.setBounds(30, 157, 70, 34);
		p1.add(title);
		
		inputTitleField = new JTextField();
		inputTitleField.setBorder(border);
		inputTitleField.setText(getTitle);
		inputTitleField.setBounds(94, 157, 774, 34);
		inputTitleField.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		inputTitleField.setBackground(new Color(18,18,18));
		inputTitleField.setForeground(new Color(255,255,255));
		p1.add(inputTitleField);
		inputTitleField.setColumns(10);
		
		
		JLabel label = new JLabel("내용");
		label.setForeground(new Color(255, 250, 205));
		label.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label.setBounds(30, 222, 70, 34);
		p1.add(label);
		
		inputContentFiled = new JTextArea();
		inputContentFiled.setBorder(border);
		inputContentFiled.setText(getContent);
		inputContentFiled.setBounds(30, 266, 838, 576);
		inputContentFiled.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		inputContentFiled.setBackground(new Color(18, 18, 18));
		inputContentFiled.setForeground(new Color(255, 255, 255));
		p1.add(inputContentFiled);
		
		
		JButton completeButton = new JButton("수정하기");
		completeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				daoB2 = new BoardDAO();
				dtoB2 = new BoardDTO();
				Calendar cal = Calendar.getInstance();
				String today = Integer.toString(cal.get(Calendar.YEAR)) + "." + Integer.toString(cal.get(Calendar.MONTH)+1) + "."
				+ Integer.toString(cal.get(Calendar.DAY_OF_MONTH)) + "." + Integer.toString(cal.get(Calendar.HOUR_OF_DAY)) + "."
				+ Integer.toString(cal.get(Calendar.MINUTE)) + "." + Integer.toString(cal.get(Calendar.SECOND));
				
				daoB2.update(inputTitleField.getText(), inputContentFiled.getText(), today, m.getId(), todayTime);
				
				int result = JOptionPane.showConfirmDialog(null, "게시글 수정을 완료 하시겠습니까?", "완료",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					BoardPage next = new BoardPage();
					p2.add(next);
					p2.setVisible(true);
					p1.setVisible(false);

				} else {
					// If you selected No.
				}
				
			}
		});
		p1.add(completeButton);
		completeButton.setBounds(590, 852, 135, 40);
		completeButton.setBackground(new Color(18,18,18));
		completeButton.setForeground(new Color(255, 250, 205));
		completeButton.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		JButton cancelButton = new JButton("취소");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "글 수정을 취소하시겠습니까?", "취소",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
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
		
		
		
		
		
		backwardBtn = new JButton();
		backwardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "수정 중이던 글은 저장 되지 않습니다. 이전 페이지로 돌아가시겠습니까?" + 
						"", "뒤로가기", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					BoardPage back = new BoardPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);
				}
				else {
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
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					System.exit(0);
					
				}
				else {
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
