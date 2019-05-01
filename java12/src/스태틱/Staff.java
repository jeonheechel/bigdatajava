package 스태틱;

public class Staff {

	 String name;
	 String gender;
	 int age;
	 static int num;
	 static int agetotal;
	 static int average;
	 
	 public Staff() {

	}
	 
	 public Staff(String name , String gender , int age) {
		 this.name = name;
		 this.gender = gender;
		 this.age = age;
		  num++;
		  agetotal += age;
		  average = agetotal/3;
	}
	 
	 

		@Override
	public String toString() {
		return "staff [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

		public void staffweek() {
			System.out.println("일을 잘한다");
		}					   
		public void staffaffinity() {
			System.out.println("친화력이 있다");
		}
	 
	 
	 
	 
	 
	
}
