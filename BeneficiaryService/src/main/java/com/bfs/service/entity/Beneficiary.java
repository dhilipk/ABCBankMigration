package com.bfs.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beneficiary")
public class Beneficiary {
	@Id
    private String beneficiaryid;
    private String accountnumber;
    private String accountHoldername;
    private String accounttype;
	private String ifsc;
	private String bank;
    private String email;
    private String createdby;
    private String updatedate;
    
	public String getBeneficiaryid() {
		return beneficiaryid;
	}
	public void setBeneficiaryid(String beneficiaryid) {
		this.beneficiaryid = beneficiaryid;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
    
    
}
