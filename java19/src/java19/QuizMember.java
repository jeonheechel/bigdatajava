package java19;

public class QuizMember {
	String title;
	String content;
	String name;
	String password;
	
	
	public QuizMember(String title, String content, String name, String password) {
		this.title = title;
		this.content = content;
		this.name = name;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "QuizMember [title=" + title + ", content=" + content + ", name=" + name + ", password=" + password
				+ "]";
	}
	
	
	
	

}
