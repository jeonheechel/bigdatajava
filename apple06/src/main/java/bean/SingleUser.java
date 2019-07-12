package bean;

public class SingleUser {

	public static void main(String[] args) {
		SingleObject single1 = SingleObject.getInstance();
		System.out.println(single1.getString());
		System.out.println("생성된 객체수 : " +SingleObject.count);
		
		
		SingleObject single2 = SingleObject.getInstance();
		System.out.println(single2.getString());
		System.out.println("생성된 객체수 : " +SingleObject.count);
		
	}

}
