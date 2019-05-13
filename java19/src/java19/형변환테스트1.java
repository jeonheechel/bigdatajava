package java19;

public class 형변환테스트1 {

	public static void main(String[] args) {
		//기초형 형변환(type change : 타입변환,casting,캐스팅)
		// 작 =>큰  : 자동 형변환 (업캐스팅이다)
		byte a = 127;//1칸쓰는 127에서
		int b = a;//4칸쓰는 127로 바뀐거다
		System.out.println(a);
		System.out.println(b);
		
		//큰 => 작  : 강제형 변환 (다운캐스팅이다)
		int c = 127;
		byte d = (byte)c;
		System.out.println(c);
		System.out.println(d);
		
		
		
		//참조형 형변환(클래스의 형변환)
		//상속 관계에 있는 클래스들만 형변환 가능
		
		
		// 작(자식) => 큰(부모)  :자동형변환 (업캐스팅이다)
		//Car car = new Car();//부모(크다)
		//Truck truck = new Truck();//자식(작다)
		//car = truck; //(큰 Car = 작은 Truck)
		
		
		// 큰(부모) => 작(자식)  :강제형변환 (다운캐스팅이다)
		//truck = (Truck)car; //( 작은 Truck = 큰 Car )
		
		
		
		
		
	}

}
