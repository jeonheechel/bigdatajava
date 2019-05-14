package java20;

public class SuperMan extends Man {
	String fly;
	String name;
	
	public SuperMan() {
	}
	
	public SuperMan(String fly, String name) {
		//super();
		this.fly = fly;
		this.name = name;
	}

	public SuperMan(int age, int weight, String fly, String name) {
		super(age, weight);
		this.fly = fly;
		this.name = name;
	}

	

	
	
	
	
	

}
