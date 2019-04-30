package 생성자;

public class Member {
	String name;
	int age;
	String tel;
	String addr;
	public Member(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "" + name + "    " + age + "    " + tel + "    " + addr + "";
	}
	
	
	
	
	

}
