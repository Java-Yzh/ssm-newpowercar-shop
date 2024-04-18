package com.entity;

import com.util.VeDate;

public class Details {
	private String detailsid = "D" + VeDate.getStringId();
	private String ordercode;
	private String newcarid;
	private String num;
	private String price;
	private String cityid;
	private String peihuoid;
	private String viewdate;
	private String newcarname;
	private String cityname;
	private String peihuoname;

	public String getDetailsid() {
		return detailsid;
	}

	public void setDetailsid(String detailsid) {
		this.detailsid = detailsid;
	}

	public String getOrdercode() {
		return this.ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}

	public String getNewcarid() {
		return this.newcarid;
	}

	public void setNewcarid(String newcarid) {
		this.newcarid = newcarid;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCityid() {
		return this.cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getPeihuoid() {
		return this.peihuoid;
	}

	public void setPeihuoid(String peihuoid) {
		this.peihuoid = peihuoid;
	}

	public String getViewdate() {
		return this.viewdate;
	}

	public void setViewdate(String viewdate) {
		this.viewdate = viewdate;
	}

	public String getNewcarname() {
		return this.newcarname;
	}

	public void setNewcarname(String newcarname) {
		this.newcarname = newcarname;
	}

	public String getCityname() {
		return this.cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getPeihuoname() {
		return this.peihuoname;
	}

	public void setPeihuoname(String peihuoname) {
		this.peihuoname = peihuoname;
	}
}
