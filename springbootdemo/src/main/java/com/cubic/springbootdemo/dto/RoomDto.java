package com.cubic.springbootdemo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RoomDto {

	@NotNull
	private Integer number;

	@NotNull
	private String type;

	private String Description;
	@NotNull
	@Min(0)
	private Double price;

	private Boolean isSmoking;
	private Boolean wifi;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getIsSmoking() {
		return isSmoking;
	}

	public void setIsSmoking(Boolean isSmoking) {
		this.isSmoking = isSmoking;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	

}
