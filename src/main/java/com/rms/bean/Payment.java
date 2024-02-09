package com.rms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_payment")
public class Payment {

	@Id
	@Column(name="payment_id")
	private long paymentId;
	@Column(name = "amount", nullable = false)
	private long rentAmount;
	@Column(name = "status", nullable = false)
	private String rentStatus;
	@Column(name = "due_amount", nullable = false)
	private String dueAmount;
	@Column(name = "paid_amount", nullable = false)
    private String paidAmount;
	@Column(name="user_id",nullable =false)
	private long userId;
	@Column(name="house_id",nullable =false)
	private long houseId;
	public Payment() {
		super();
	}
	public Payment(long paymentId, long rentAmount, String rentStatus, String dueAmount, String paidAmount, long userId,
			long houseId) {
		super();
		this.paymentId = paymentId;
		this.rentAmount = rentAmount;
		this.rentStatus = rentStatus;
		this.dueAmount = dueAmount;
		this.paidAmount = paidAmount;
		this.userId = userId;
		this.houseId = houseId;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public long getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(long rentAmount) {
		this.rentAmount = rentAmount;
	}
	public String getRentStatus() {
		return rentStatus;
	}
	public void setRentStatus(String rentStatus) {
		this.rentStatus = rentStatus;
	}
	public String getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(String dueAmount) {
		this.dueAmount = dueAmount;
	}
	public String getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getHouseId() {
		return houseId;
	}
	public void setHouseId(long houseId) {
		this.houseId = houseId;
	}

	

}
