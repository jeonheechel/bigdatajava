package crud;

public class CarDTO {
	
	String id;
	String name;
	String content;
	String price;
	
	
	public CarDTO() {
	}
	
	public CarDTO(String id, String name, String content, String price) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.price = price;
	}
	
	
	


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	



	
	
	
	
	

}
