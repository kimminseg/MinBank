package com.maetamong;

public class Customer {

	private String accountNumber;
	private String name;
	private String date;
	private int money;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void depositMoney(int money) {		
		this.money += money;		
	}
	
	public void withdrawMoney(int money) {		
		this.money -= money;		
	}

	public void newAccount() {
		System.out.printf("[계좌번호 : %s, 예금주 : %s] 잔액 : %d\n", accountNumber, name, money);
	}
}

