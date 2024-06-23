package com.devHub;

public class Account {
	private String customerName;
	private String accountNumber;
	private double balance;
	private String email;
	private String phoneNumber;
	
	public Account(String customerName,String accountNumber,double balance,String email,String phoneNumber) {
		this.customerName=customerName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	
	public void depositMoney(double depositAmount) {
		this.balance+=depositAmount;
		System.out.println("Amount Deposited successfully..The new balance is "+this.balance);
	}
	
	public void withdrawMoney(double withdrawAmount) {
		if(withdrawAmount>this.balance) {
			System.out.println("Withdraw unsuccessful..Balance left is only "+this.balance);
		}
		else {
			this.balance-=withdrawAmount;
			System.out.println("Withdraw successful.. New balance is "+this.balance);
		}
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
