package 생성자;

public class 통장 {
	String product;
	String name;
	int money;
	
	
	public 통장(String product, String name, int money) {
		this.product = product;
		this.name = name;
		this.money = money;
	}


	@Override
	public String toString() {
		return "" + product + "                     " + name + "               " + money + "";
	}
	
	
	
}
