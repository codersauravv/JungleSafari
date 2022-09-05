package com.junglesafari.JungleSafari.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column	
	private int aid;
	@Column(unique=true)
	private String aemail;
	@Column
	private String aname;
	@Column
	private String secretcode;
	@Column
	private String password;
	
	
	
	public Admin() {
		super();
	}
	public Admin(int aid, String aemail, String aname, String secretcode, String password) {
		super();
		this.aid = aid;
		this.aemail = aemail;
		this.aname = aname;
		this.secretcode = secretcode;
		this.password = password;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getSecretcode() {
		return secretcode;
	}
	public void setSecretcode(String secretcode) {
		this.secretcode = secretcode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aemail=" + aemail + ", aname=" + aname + ", secretcode=" + secretcode
				+ ", password=" + password + "]";
	}
	
	
	
	
	
}
