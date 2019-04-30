package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기2 {
												//예외처리이다 이것만 안돌아가고 다른것들은 돌아간다
	public static void main(String[] args) throws Exception {
		//파일에 저장하는 기능
		//객체생성
		String name = JOptionPane.showInputDialog("이름을 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		String addr = JOptionPane.showInputDialog("주소를 입력");
		
		FileWriter w = new FileWriter(name+".txt");
		//메소드 사용(호출)
		w.write(name+"\n");
		w.write(tel+"\n");
		w.write(addr+"\n");
		
		//종료하겟다 저장해라 문을 닫는 뜻이다
		w.close();
	}

}
