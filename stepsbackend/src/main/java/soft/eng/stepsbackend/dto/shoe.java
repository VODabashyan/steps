package soft.eng.stepsbackend.dto;

import java.sql.Blob;

public class shoe {
	
	private int id;
	private String shoeName;
	private String brand;
	private String shoeType;
	private String sex;
	private String color;
	private String size;
	private Blob image;
	private String material;
	private String outsole;
	private String insole;
	private String shoeDescription;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getShoeName() {
		return shoeName;
	}
	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getShoeType() {
		return shoeType;
	}
	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getOutsole() {
		return outsole;
	}
	public void setOutsole(String outsole) {
		this.outsole = outsole;
	}
	
	public String getInsole() {
		return insole;
	}
	public void setInsole(String insole) {
		this.insole = insole;
	}
	
	public String getShoeDescription() {
		return shoeDescription;
	}
	public void setShoeDescription(String shoeDescription) {
		this.shoeDescription = shoeDescription;
	}
	
}
