package soft.eng.stepsbackend.dto;

import java.sql.Date;

public class orders {
	

	private int orderNumber;
	private Date orderDate;
	private String orderStatus;
	private String comments;
	private int userID;
	private int productID;
	

	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public int getUserId() {
		return userID;
	}
	public void setUserId(int userID) {
		this.userID = userID;
	}
	
	public int getProductId() {
		return productID;
	}
	public void setProductId(int productID) {
		this.productID = productID;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
