package com.rms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_payrent")
public class PayRent {

	@Id
	@Column(name="rent_amount")
    private long rentAmount;
	@Column(name="house_id")
	private long houseId;
	@Column(name="paid_amount")
    private long paidAmount;

	public PayRent() {
		super();
	}

	public PayRent(long houseId, long rentAmount, long paidAmount) {
		super();
		this.houseId = houseId;
		this.rentAmount = rentAmount;
		this.paidAmount = paidAmount;
	}

	public long getHouseId() {
		return houseId;
	}

	public void setHouseId(long houseId) {
		this.houseId = houseId;
	}

	public long getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(long rentAmount) {
		this.rentAmount = rentAmount;
	}

	public long getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(long paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Override
	public String toString() {
		return "PayRent [houseId=" + houseId + ", rentAmount=" + rentAmount + ", paidAmount=" + paidAmount + "]";
	}

}
