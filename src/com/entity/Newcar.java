package com.entity;

import com.util.VeDate;

public class Newcar {
	private String newcarid = "F" + VeDate.getStringId();
	private String newcarname;
	private String image;
	private String cateid;
	private String price;
	private String recommend;
	private String thestart;
	private String theend;
	private String hits;
	private String sellnum;
	private String contents;
	private String catename;

	public String getNewcarid() {
		return newcarid;
	}

	public void setNewcarid(String newcarid) {
		this.newcarid = newcarid;
	}

	public String getNewcarname() {
		return this.newcarname;
	}

	public void setNewcarname(String newcarname) {
		this.newcarname = newcarname;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCateid() {
		return this.cateid;
	}

	public void setCateid(String cateid) {
		this.cateid = cateid;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRecommend() {
		return this.recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getThestart() {
		return this.thestart;
	}

	public void setThestart(String thestart) {
		this.thestart = thestart;
	}

	public String getTheend() {
		return this.theend;
	}

	public void setTheend(String theend) {
		this.theend = theend;
	}

	public String getHits() {
		return this.hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public String getSellnum() {
		return this.sellnum;
	}

	public void setSellnum(String sellnum) {
		this.sellnum = sellnum;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getCatename() {
		return this.catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}
}
