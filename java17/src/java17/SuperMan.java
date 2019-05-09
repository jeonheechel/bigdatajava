package java17;

public class SuperMan extends Man {
	
	//정적
	boolean fly;
	
	
	
	
	//동적
	public void flySpeed() {
		sleep();//내꺼니까 마음대로 가져다 써도 된다
		System.out.println("500으로 날아요!");
	}




	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
