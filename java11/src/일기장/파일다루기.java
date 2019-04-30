package 일기장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일다루기 {
												//예외처리이다 이것만 안돌아가고 다른것들은 돌아간다
	public static void main(String[] args) throws Exception {
		//파일에 저장하는 기능
		//객체생성
		FileWriter w = new FileWriter("start.txt");
		//메소드 사용(호출)
		w.write("안녕하세요.\n");
		w.write("반갑습니다.\n");
		
		//종료하겟다 저장해라 문을 닫는 뜻이다
		w.close();
	}

}
