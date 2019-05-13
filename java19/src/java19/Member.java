package java19;

public class Member {
	
	String name;
	int age;
	char gender;
	String addr;
	String tel;
	
	
	public Member(String name, int age, char gender, String addr, String tel) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
		this.tel = tel;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", addr=" + addr + ", tel=" + tel + "]";
	}
	
	
	
	

}
