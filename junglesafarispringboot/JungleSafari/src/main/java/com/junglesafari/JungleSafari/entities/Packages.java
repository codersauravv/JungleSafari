package com.junglesafari.JungleSafari.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="packages")
public class Packages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int pkg_id;
	
	@Column
    String pkg_name;
	
	@Column
    String validity_date;
	
	@Column
    String pkg_price_frgn;
	
	@Column
    String pkg_price_ind;
	
	@Column
    String max_people;
	
	@Column
    String description;
    
    
    
	public Packages() {
		super();
	}
	public Packages(int pkg_id, String pkg_name, String validity_date, String pkg_price_frgn, String pkg_price_ind,
			String max_people, String description) {
		super();
		this.pkg_id = pkg_id;
		this.pkg_name = pkg_name;
		this.validity_date = validity_date;
		this.pkg_price_frgn = pkg_price_frgn;
		this.pkg_price_ind = pkg_price_ind;
		this.max_people = max_people;
		this.description = description;
	}
	public int getPkg_id() {
		return pkg_id;
	}
	public void setPkg_id(int pkg_id) {
		this.pkg_id = pkg_id;
	}
	public String getPkg_name() {
		return pkg_name;
	}
	public void setPkg_name(String pkg_name) {
		this.pkg_name = pkg_name;
	}
	public String getValidity_date() {
		return validity_date;
	}
	public void setValidity_date(String validity_date) {
		this.validity_date = validity_date;
	}
	public String getPkg_price_frgn() {
		return pkg_price_frgn;
	}
	public void setPkg_price_frgn(String pkg_price_frgn) {
		this.pkg_price_frgn = pkg_price_frgn;
	}
	public String getPkg_price_ind() {
		return pkg_price_ind;
	}
	public void setPkg_price_ind(String pkg_price_ind) {
		this.pkg_price_ind = pkg_price_ind;
	}
	public String getMax_people() {
		return max_people;
	}
	public void setMax_people(String max_people) {
		this.max_people = max_people;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Packages [pkg_id=" + pkg_id + ", pkg_name=" + pkg_name + ", validity_date=" + validity_date
				+ ", pkg_price_frgn=" + pkg_price_frgn + ", pkg_price_ind=" + pkg_price_ind + ", max_people="
				+ max_people + ", description=" + description + "]";
	}
	
	
	
    
    
}
