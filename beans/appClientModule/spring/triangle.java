package spring;


public class triangle {
	
	private String type;
	private int height;
	
	public triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	public triangle(int height) {
		super();
		this.height = height;
	}
	public triangle(String type) {
		super();
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public void inra() {
		System.out.println("triangle [type=" + type + ", height=" + height + "]");
	}
	
	

}
