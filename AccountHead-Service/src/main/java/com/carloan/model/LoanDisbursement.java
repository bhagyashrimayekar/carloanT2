package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDisbursement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int agreementId;
	private int loanNo;
	private String agreementDate;
	private String amountPayType;
	private double totalAmount;
	private String bankName;
	private double accountNumber;
	private String IFSCCode;
	private String accountType;
	private double transferAmount;
    private String paymentStatus;
    private String amountPaidDate;
	public int getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(int agreementId) {
		this.agreementId = agreementId;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public String getAgreementDate() {
		return agreementDate;
	}
	public void setAgreementDate(String agreementDate) {
		this.agreementDate = agreementDate;
	}
	public String getAmountPayType() {
		return amountPayType;
	}
	public void setAmountPayType(String amountPayType) {
		this.amountPayType = amountPayType;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getAmountPaidDate() {
		return amountPaidDate;
	}
	public void setAmountPaidDate(String amountPaidDate) {
		this.amountPaidDate = amountPaidDate;
	}
    
	


}
