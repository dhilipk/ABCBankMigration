package com.bfs.service.entity;

public class Accounts {
	private String accountHolderName;
	private String accountNo;
	private String branch;
	private String balance;
	private String accountType;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Accounts(String accountHolderName, String accountNo, String branch, String balance, String accountType) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNo = accountNo;
		this.branch = branch;
		this.balance = balance;
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Acccounts [accountHolderName=" + accountHolderName + ", accountNo=" + accountNo + ", branch=" + branch
				+ ", balance=" + balance + ", accountType=" + accountType + "]";
	}
	
	
}
