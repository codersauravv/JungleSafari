package com.junglesafari.JungleSafari.entities;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int pkg_id; 
	
	@Column
	private String cname;
	@Column
	private String caddress;
	@Column
	private String cemail;
	@Column
	private String cmobile;
	@Column
	private Date placedOrderdate;
	@Column
	private String pkg_name;
	
	@Column
	private String tPeople;
	
	@Column
	private String pkg_price;


	public Orders(int pkg_id, String cname, String caddress, String cemail, String cmobile, Date placedOrderdate,
			String pkg_name, String tPeople, String pkg_price) {
		super();
		this.pkg_id = pkg_id;
		this.cname = cname;
		this.caddress = caddress;
		this.cemail = cemail;
		this.cmobile = cmobile;
		this.placedOrderdate = placedOrderdate;
		this.pkg_name = pkg_name;
		this.tPeople = tPeople;
		this.pkg_price = pkg_price;
	}

	public Orders() {
		super();
	}

	public int getPkg_id() {
		return pkg_id;
	}

	public void setPkg_id(int pkg_id) {
		this.pkg_id = pkg_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCmobile() {
		return cmobile;
	}

	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}

	public Date getPlacedOrderdate() {
		return placedOrderdate;
	}

	public void setPlacedOrderdate(Date placedOrderdate) {
		this.placedOrderdate = placedOrderdate;
	}

	public String getPkg_name() {
		return pkg_name;
	}

	public void setPkg_name(String pkg_name) {
		this.pkg_name = pkg_name;
	}

	public String gettPeople() {
		return tPeople;
	}

	public void settPeople(String tPeople) {
		this.tPeople = tPeople;
	}

	public String getPkg_price() {
		return pkg_price;
	}

	public void setPkg_price(String pkg_price) {
		this.pkg_price = pkg_price;
	}

	@Override
	public String toString() {
		return "Orders [pkg_id=" + pkg_id + ", cname=" + cname + ", caddress=" + caddress + ", cemail=" + cemail
				+ ", cmobile=" + cmobile + ", placedOrderdate=" + placedOrderdate + ", pkg_name=" + pkg_name
				+ ", tPeople=" + tPeople + ", pkg_price=" + pkg_price + "]";
	}

	
	


	
	
}
