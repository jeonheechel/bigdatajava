package 생성자;

public class Admin {
	String id;
	String pw;
	String rank;
	int mile;
	
	
	
	
	public Admin(String id, String pw, String rank, int mile) {
		this.id = id;
		this.pw = pw;
		this.rank = rank;
		this.mile = mile;
	}




	@Override
	public String toString() {
		return "" + id + "     " + pw + "      " + rank + "             " + mile + "";
	}
	
	

}
