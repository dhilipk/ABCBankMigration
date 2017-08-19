package com.bfs.service.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beneficiary")
public class Beneficiary {
	@Id
    private String beneficiaryId;
    private String accountnumber;
    private String accountHoldername;
    private String accountType;
	private String ifsc;
	private String bank;
    private String email;
    private String createdBy;
    private Date updatedDate;
	public String getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
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
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Beneficiary(String beneficiaryId, String accountnumber, String accountHoldername, String accountType,
			String ifsc, String bank, String email, String createdBy, Date updatedDate) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.accountnumber = accountnumber;
		this.accountHoldername = accountHoldername;
		this.accountType = accountType;
		this.ifsc = ifsc;
		this.bank = bank;
		this.email = email;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Beneficiary [beneficiaryId=" + beneficiaryId + ", accountnumber=" + accountnumber
				+ ", accountHoldername=" + accountHoldername + ", accountType=" + accountType + ", ifsc=" + ifsc
				+ ", bank=" + bank + ", email=" + email + ", createdBy=" + createdBy + ", updatedDate=" + updatedDate
				+ "]";
	}
	
}
