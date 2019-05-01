package 스태틱;

public class Daddy {
	
	public static void main(String[] args) {
		DDal ddal1 = new DDal("김말자",15);
		DDal ddal2 = new DDal("이말자",15);
		
		System.out.println(ddal1.name +"  "+ddal2.name);
		ddal1.Play1(); ddal1.Play2();
		System.out.println(DDal.money);
		
		
		
		
	}
	
	
	

}
