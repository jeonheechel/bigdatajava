package data;

public class DataTest {

	public static void main(String[] args) {
		// comment, 주석,(설명)
		//  컨트롤 +/(한줄주석)
		//주석은 무조건 달아야 한다 적극 권장 ☆
		//sysout,syso +(ctrl+ space bar):자동완성 매우중요 잊어버리지 말것
		System.out.println("나의 데이터 프린트..");
		//저장은 ctrl+s(저장)
		//실행 ctrl+f11(실행)
		
		
		
		//정수(integer, int)
		int spaceY = 300;//언어에서의 등호를 기준으로 계산한뒤 뒤에서 앞으로 간다 
		// 앞에는 이변수의 들어갈 데이터의 종류와크기를 써줘야한다
		//300+200=c;이런식의 표현은 안된다
		//c=200+300;이렇게 해야한다
		//-21억~21억
		//더큰데이터를  할때는 long 짧아지면 byte,short가있다
		//byte(1byte,1비트:-128~127) 
		//short(2byte) 
		//int(4byte)  
		//long(8byte)
		
		
		int startX = 0;//대입연산자, 할당 연산자
		int startY = 0;
		
		//꼭 타입을 지정해줘야 한다
		int result=startX+startY;
		//		   +는 연결 연산자라고 한다
		String result2="그래픽의 시작점 Y축은"+startY;
		
		
		System.out.println("그래픽의 시작점은 x축은"+startX);
		System.out.println(result2);
		
		System.out.println();
		
		//float 작은실수
		//double 큰 실수
		float x = 5.5f;//4(byte)이렇게써야 플롯형 데이터 인줄 안다 디폴트는 더블을 인식한다
		double y = 5.5;//8(byte)
		
		char gender= '남';//2(byte)
		boolean breakTime = true;//true(참),false(거짓)1(byte)
	}

}
