package soft.eng.stepsbackend.dto;

import java.sql.Date;

public class cart {
	

	private int id;
	private int userID;
	private double grandTotal;
	private Date cartDate;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserId() {
		return userID;
	}
	public void setUserId(int userID) {
		this.userID = userID;
	}
	
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	public Date getCartDate() {
		return cartDate;
	}
	public void setCartDate(Date cartDate) {
		this.cartDate = cartDate;
	}
}
