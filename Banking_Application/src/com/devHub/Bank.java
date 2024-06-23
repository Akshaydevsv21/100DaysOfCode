package com.devHub;

public class Bank {

	public static void main(String[] args) {
		
		Account account=new Account("Anjitha", "1234", 0, "aksh@xyz.com", "234567");
		
		account.depositMoney(1000000);
		account.withdrawMoney(5000);
		account.depositMoney(200000);

	}

}
