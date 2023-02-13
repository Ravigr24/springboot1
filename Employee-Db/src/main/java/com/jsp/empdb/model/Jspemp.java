package com.jsp.empdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Jspemp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empid;
	private String ename;
	private String esubject;
	private String email;
	private long ephno;
	

}
