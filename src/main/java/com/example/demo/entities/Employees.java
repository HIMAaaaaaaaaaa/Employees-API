package com.example.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.*;
//import javax.persistence.Table;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

//@jakarta.persistence.Entity
//@EntityScan
//@Entity
//@Table(name = "EMPLOYEES")
//@Document(collection = "EMPLOYEES")
@EntityScan(basePackages = "com.example.demo.entities")
@Entity
@Table(name = "EMPLOYEES")
public class Employees implements Serializable {
	private static final long serialVersionUID = -2435172566430050531L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private String EMPLOYEE_ID;

	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	// private long Id;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String EMAIL;
	private String PHONE_NUMBER;
	private String JOB_ID;
	private BigDecimal SALARY;
	private java.sql.Date HIRE_DATE;
	private String COMMISSION_PCT;
	private String MANAGER_ID;
	private String DEPARTMENT_ID;

	public Employees() {
	}

	public String getCOMMISSION_PCT() {
		return COMMISSION_PCT;
	}

	public void setCOMMISSION_PCT(String cOMMISSION_PCT) {
		COMMISSION_PCT = cOMMISSION_PCT;
	}

	public String getMANAGER_ID() {
		return MANAGER_ID;
	}

	public void setMANAGER_ID(String mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}

	public String getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(String dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}

	public String getJOB_ID() {
		return JOB_ID;
	}

	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}

	public BigDecimal getSALARY() {
		return SALARY;
	}

	public void setSALARY(BigDecimal sALARY) {
		SALARY = sALARY;
	}

	public java.sql.Date getHIRE_DATE() {
		return HIRE_DATE;
	}

	public void setHIRE_DATE(java.sql.Date hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}

}