package 인터페이스2;

public class BbsDTO {
	private String id;
	private String title;
	private String content;
	private String etc;
	
	public BbsDTO() {
	}
	
	
	public BbsDTO(String id, String title, String content, String etc) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.etc = etc;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	

}
