package project01;

public class userDTO {
	private String id;
	private String pw;
	private String name;
	private String nicname;
	private String email;
	private int hint;
	private String pwhint;
	private int grade;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNicname() {
		return nicname;
	}
	public void setNicname(String nicname) {
		this.nicname = nicname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHint() {
		return hint;
	}
	public void setHint(int hint) {
		this.hint = hint;
	}
	public String getPwhint() {
		return pwhint;
	}
	public void setPwhint(String pwhint) {
		this.pwhint = pwhint;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
