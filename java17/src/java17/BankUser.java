package java17;

public class BankUser {

	public static void main(String[] args) {
		GoodBank good = new GoodBank();
		BadBank bad = new BadBank();
		NormalBank normal = new NormalBank();
		
		
		
		
		
		System.out.println(good.bankname+"의 이자율:"+good.Interest);
		System.out.println(bad.bankname+"의 이자율:"+bad.Interest);
		System.out.println(normal.bankname+"의 이자율:"+normal.Interest);
		
		
		
		
		
	}

}
