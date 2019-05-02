package jdbc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DB입력3입력창 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID입력");
		
		
		
		DB처리3딜리트 db = new DB처리3딜리트();
		try {//에러처리;
			db.delete(id);
		} catch (Exception e) {//잡는부분
			System.out.println("에러발생!! 에러발생!!");
			e.printStackTrace();
		}
	}

}
