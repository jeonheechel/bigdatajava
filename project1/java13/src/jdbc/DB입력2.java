package jdbc;

import java.util.Scanner;

import javax.swing.JOptionPane;

import jdbc.MemberDAO;

public class DB입력2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("PW입력");
		String name = JOptionPane.showInputDialog("NAME입력");
		String tel = JOptionPane.showInputDialog("TEL입력");
		
		
		MemberDAO db = new MemberDAO();
		MemberDTO dto = new MemberDTO(id, pw, name, tel);
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		try {//에러처리;
			db.insert(dto);
		} catch (Exception e) {//잡는부분
			System.out.println("에러발생!! 에러발생!!");
			e.printStackTrace();
		}
	}

}
