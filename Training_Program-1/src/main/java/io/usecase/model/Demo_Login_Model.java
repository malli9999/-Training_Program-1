package io.usecase.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo_Login_Model {

	@Id 
	private String USER_ID;
	private String PASSWORD;
	
	private String CUTOMER_NAME;
	private String LAST_LOGIN_DATE;
	private String CUSTOMER_TYPR;
	private String CUSTOMER_SESSION_ID;
	private String SESSION_STATUS;
	
	
	
	public Demo_Login_Model(String uSER_ID, String pASSWORD, String cUTOMER_NAME, String lAST_LOGIN_DATE,
			String cUSTOMER_TYPR, String cUSTOMER_SESSION_ID, String sESSION_STATUS) {
		super();
		USER_ID = uSER_ID;
		PASSWORD = pASSWORD;
		CUTOMER_NAME = cUTOMER_NAME;
		LAST_LOGIN_DATE = lAST_LOGIN_DATE;
		CUSTOMER_TYPR = cUSTOMER_TYPR;
		CUSTOMER_SESSION_ID = cUSTOMER_SESSION_ID;
		SESSION_STATUS = sESSION_STATUS;
	}
	
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getCUTOMER_NAME() {
		return CUTOMER_NAME;
	}
	public void setCUTOMER_NAME(String cUTOMER_NAME) {
		CUTOMER_NAME = cUTOMER_NAME;
	}
	public String getLAST_LOGIN_DATE() {
		return LAST_LOGIN_DATE;
	}
	public void setLAST_LOGIN_DATE(String lAST_LOGIN_DATE) {
		LAST_LOGIN_DATE = lAST_LOGIN_DATE;
	}
	public String getCUSTOMER_TYPR() {
		return CUSTOMER_TYPR;
	}
	public void setCUSTOMER_TYPR(String cUSTOMER_TYPR) {
		CUSTOMER_TYPR = cUSTOMER_TYPR;
	}
	public String getCUSTOMER_SESSION_ID() {
		return CUSTOMER_SESSION_ID;
	}
	public void setCUSTOMER_SESSION_ID(String cUSTOMER_SESSION_ID) {
		CUSTOMER_SESSION_ID = cUSTOMER_SESSION_ID;
	}
	public String getSESSION_STATUS() {
		return SESSION_STATUS;
	}
	public void setSESSION_STATUS(String sESSION_STATUS) {
		SESSION_STATUS = sESSION_STATUS;
	}
	
	
	
	

}
