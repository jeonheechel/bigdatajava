package 생성자;

public class Admin2 {

	public static void main(String[] args) {
		
		System.out.println("아이디            비밀번호           등급            마일리지");
		Admin member1 = new Admin("admin","1234","관리자",1000);
		Admin member2 = new Admin("manager","pass","준관리자",1500);
		Admin member3 = new Admin("sitemanager","sitepass","준관리자",1800);
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(member1.id+"의 비밀번호는"+member1.pw+"입니다");
		System.out.println(member2.id+"는 준관리자 이고 마일리지는 "+member2.mile);
		System.out.println("총마일리지는"+(member1.mile+member2.mile+member3.mile)+"입니다");
		System.out.println("평균 마일리지는"+((member1.mile+member2.mile+member3.mile)/3)+"입니다");
	}
}
