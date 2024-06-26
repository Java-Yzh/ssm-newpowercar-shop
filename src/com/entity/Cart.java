package com.entity;

import com.util.VeDate;

public class Cart {
	private String cartid = "C" + VeDate.getStringId();
	private String usersid;
	private String newcarid;
	private String num;
	private String price;
	private String username;
	private String newcarname;
	private String image;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCartid() {
		return cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
	}

	public String getUsersid() {
		return this.usersid;
	}

	public void setUsersid(String usersid) {
		this.usersid = usersid;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNewcarname() {
		return this.newcarname;
	}

	public void setNewcarname(String newcarname) {
		this.newcarname = newcarname;
	}
}
