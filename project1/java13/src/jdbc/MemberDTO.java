package jdbc;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	
	public MemberDTO(String id, String pw, String name, String tel) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	//단축키 알트+쉬프트+s+r
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//단축키 알트+쉬프트+s+r

	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	

}
