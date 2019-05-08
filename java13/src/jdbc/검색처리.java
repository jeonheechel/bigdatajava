package jdbc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 검색처리 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		String id = sc.next();
		
		MemberDAO db = new MemberDAO();
		//String id = JOptionPane.showInputDialog("아이디 입력");
		
			String[] mem = db.select(id);
			for (String s : mem) {
				System.out.println(s);
			
			  }
		//select * from member where id=?
			
	}
}


