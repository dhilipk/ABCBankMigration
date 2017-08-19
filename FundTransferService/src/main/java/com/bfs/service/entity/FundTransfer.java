package com.bfs.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fund")
public class FundTransfer {
	@Id
    private String fundtransferid;
    private String fromaccount;
    private String toaccount;
    private String accounttype;
	private String amount;
	private String remarks;
    private String withdrow;
    private String deposit;
    private String balance;
    private String tranfertype;
    private String transactionid;
    private String transfsby;
    private String transfsdate;
        
	public String getFundtransferid() {
		return fundtransferid;
	}
	public void setFundtransferid(String fundtransferid) {
		this.fundtransferid = fundtransferid;
	}
	public String getFromaccount() {
		return fromaccount;
	}
	public void setFromaccount(String fromaccount) {
		this.fromaccount = fromaccount;
	}
	public String getToaccount() {
		return toaccount;
	}
	public void setToaccount(String toaccount) {
		this.toaccount = toaccount;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
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
	public String getWithdrow() {
		return withdrow;
	}
	public void setWithdrow(String withdrow) {
		this.withdrow = withdrow;
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
	public String getTranfertype() {
		return tranfertype;
	}
	public void setTranfertype(String tranfertype) {
		this.tranfertype = tranfertype;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getTransfsby() {
		return transfsby;
	}
	public void setTransfsby(String transfsby) {
		this.transfsby = transfsby;
	}
	public String getTransfsdate() {
		return transfsdate;
	}
	public void setTransfsdate(String transfsdate) {
		this.transfsdate = transfsdate;
	}
	
}
