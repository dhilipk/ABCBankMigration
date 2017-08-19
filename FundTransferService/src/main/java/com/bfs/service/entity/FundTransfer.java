package com.bfs.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fund")
public class FundTransfer {
	@Id
    private String fundTransferId;
    private String fromAccount;
    private String toAccount;
    private String accountType;
	private String amount;
	private String remarks;
    private String withdraw;
    private String deposit;
    private String balance;
    private String transferType;
    private String transactionId;
    private String transferBy;
    private String transferDate;

	public String getFundTransferId() {
		return fundTransferId;
	}
	public void setFundTransferId(String fundTransferId) {
		this.fundTransferId = fundTransferId;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransferBy() {
		return transferBy;
	}
	public void setTransferBy(String transferBy) {
		this.transferBy = transferBy;
	}
	public String getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}
	public FundTransfer() {

	}

}
