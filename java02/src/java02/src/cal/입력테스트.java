package cal;

import java.util.Scanner;//패키지안에 패키지가 있고 스캐너란 클래스가 있다  그것을 복사해온것이다
//콘솔에서 키보드로 입력받을수 있게하고 그것을 코드안으로 가지고 온다
public class 입력테스트 {
	//콘솔에서 입력하기!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요");
		String name = sc.next();
		System.out.println("당신이 입력한 데이터는 "+name);
	}
	
}
