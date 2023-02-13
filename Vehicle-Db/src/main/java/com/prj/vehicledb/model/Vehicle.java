package com.prj.vehicledb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vId;
	private String vname;
	private long vprice;
	private String vmodel;
	private String vcolor;
	
	

	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public long getVprice() {
		return vprice;
	}
	public void setVprice(long vprice) {
		this.vprice = vprice;
	}
	public String getVmodel() {
		return vmodel;
	}
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vname=" + vname + ", vprice=" + vprice + ", vmodel=" + vmodel + ", vcolor="
				+ vcolor + "]";
	}
	
	
	

}
