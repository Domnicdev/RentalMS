package com.rms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_address")
public class Address {

	@Id
	@Column(name="address_id")
	private long addressId;
	@Column(name = "door_no", nullable = false)
	private String doorNo;
	@Column(name = "street_name", nullable = false)
    private String streetName;
	@Column(name = "city_name", nullable = false)
    private String cityName;
	@Column(name = "district_name", nullable = false)
    private String districtName;
	@Column(name = "user_id", nullable = false)
    private long userId;

	public Address() {
		super();
	}

	public Address(String doorNo, String streetName, String cityName, String districtName, long userId) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.districtName = districtName;
		this.userId = userId;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", cityName=" + cityName + ", districtName="
				+ districtName + ", userId=" + userId + "]";
	}

}
