package com.test.beans;

public final class Address {
	
	private String zipCode;
	private String city;
	private String street;
	
	public Address(String zipCode, String city, String street) {
		super();
		this.zipCode = zipCode;
		this.city = city;
		this.street = street;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", city=" + city + ", street="
				+ street + "]";
	}

}
