package soft.eng.stepsbackend.dto;

import java.sql.Date;

public class payment {
	

	private int userID;
	private double amount;
	private Date paymentDate;
	private String checkNumber;

	public int getUserId() {
		return userID;
	}
	public void setUserId(int userID) {
		this.userID = userID;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
}
