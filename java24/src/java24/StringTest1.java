package java24;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		String s1 = "winner";
		String s2 = "success";
		String s3 = "winner";
		String s4 = new String(); 
		//s4="winner";
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s3);
		
		System.out.println(s1.hashCode());//주소값이다
		
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());//
		
		System.out.println(s4.hashCode());//
		
		
		
	}

}
