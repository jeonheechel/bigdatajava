package 스태틱;

public class DDal {
	static int money=10000;
	String name;
	static int minus = 1000;
	int age;
	
	
	public DDal( String name, int age) {
		this.name = name;
		this.age = age;
		
		money -= minus; 
	}


	@Override
	public String toString() {
		return "두딸 [money=" + money + ", name=" + name + ", pocket=" + minus + "]";
	}
	
	public void Play1() {
		System.out.println("1째딸은 맨날 쳐놀아요");
	}
	public void Play2() {
		System.out.println("2째딸 맨날 티비봐요");
	}
	
	
	
	
	
	
}
