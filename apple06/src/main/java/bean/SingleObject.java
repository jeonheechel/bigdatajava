package bean;

public class SingleObject {
	public static SingleObject object;
	public static int count;
	
	
	public  SingleObject() {//생성자는 한번만 호출한다!
		System.out.println("SingObject 객체 생성됨.");
		count++;
	}
	public static SingleObject getInstance() {
		if(object == null) {
			object = new SingleObject();
		}
		
		return object;
		
	}
	
	public String getString() {
		return "Single OK";
	}
		
	

}
