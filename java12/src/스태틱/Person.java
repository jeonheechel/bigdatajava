package 스태틱;

public class Person {
	int height;
	int weight;
	String secret;
	String address;
	
	public Person(int height, int weight, String secret, String address) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
	}

	public Person(int height, int weight, String secret) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
	}
	public int getWeight() {
		return weight;
	}
	public String getSecret() {
		return secret;
	}
	 

	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", secret=" + secret + ", address=" + address + "]";
	}

	
	
	
	
	
}
