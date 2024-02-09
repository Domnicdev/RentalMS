package com.rms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_houses")
public class House {

	@Id
	@Column(name = "house_id", nullable = false)
	private long houseId;
	@Column(name = "house_type", nullable = false)
	private String houseType;
	@Column(name = "house_rent", nullable = false)
	private String houseRent;
	@Column(name = "house_address", nullable = false)
	private String houseAddress;
	@Column(name = "user_id", nullable = false)
	private long userId;

	public House() {
		super();
	}

	public House(long houseId, String houseType, String houseRent, String houseAddress, long userId) {
		super();
		this.houseId = houseId;
		this.houseType = houseType;
		this.houseRent = houseRent;
		this.houseAddress = houseAddress;
		this.userId = userId;
	}

	public long getHouseId() {
		return houseId;
	}

	public void setHouseId(long houseId) {
		this.houseId = houseId;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getHouseRent() {
		return houseRent;
	}

	public void setHouseRent(String houseRent) {
		this.houseRent = houseRent;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	

	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", houseType=" + houseType + ", houseRent=" + houseRent + ", houseAddress="
				+ houseAddress + ", userId=" + userId + "]";
	}

}
