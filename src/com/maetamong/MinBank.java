package com.maetamong;

import java.util.Scanner;

public class MinBank {
	
	private final int deposit = 1;
	private final int withdraw = 2;
	private final int exit = 3;
	private Customer customer;

	public MinBank() {
		
		customer = new Customer();
	}

	public void bank() {

		Scanner scan = new Scanner(System.in);

		System.out.println("안녕하세요 Min은행입니다");
		System.out.println("예금주 명을 입력하세요.");
		String name = scan.nextLine();
		customer.setName(name);

		System.out.println("계좌 번호를 입력하세요.");
		String accountNumber = scan.nextLine();
		customer.setAccountNumber(accountNumber);

		System.out.println("개설일자를 입력하세요.");
		String date = scan.nextLine();
		customer.setDate(date);

		System.out.println("입금 금액을 입력하세요.");
		int money = scan.nextInt();
		customer.setMoney(money);

		System.out.println("계좌가 생성 되었습니다.");
		customer.newAccount();

		int choice = 0;
		int deposiMoney = 0;
		int withdrawMoney = 0;

		while (true) {

			System.out.println("업무를 선택 하세요.");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("입금하실 금액을 적어주세요.");
				deposiMoney = scan.nextInt();
				customer.depositMoney(deposiMoney);
				System.out.printf("%d 만큼 입금 되셨습니다.\n", deposiMoney);
				customer.newAccount();
				continue;
			} 
			else if (choice == 2) {
				while (true) {
					System.out.println("출금하실 금액을 적어주세요.");
					withdrawMoney = scan.nextInt();
					if ( customer.getMoney() >= withdrawMoney ) {
						customer.withdrawMoney(withdrawMoney);
						System.out.printf("%d 만큼 출금 하셨습니다.\n", withdrawMoney);
						customer.newAccount();
						break;
					} 
					else if ( customer.getMoney() < withdrawMoney ) {
						System.out.println("잔액이 모자랍니다. 출금 할 수 없습니다.");
					}
				}
			} 
			else if (choice == 3) {
				System.out.println("감사합니다. 또 오세요~");
				break;
			}
			else {
				System.out.println("잘못 입력 하셨습니다.");
			}
			// while (true) {
			// if (!(choice == 1 || choice == 2 || choice == 3)) {
			// System.out.println("잘못 입력 하셨습니다.");
			// break;
			// }
			// }
		}
	}

	public static void main(String[] args) {
		new MinBank().bank();
	}

}
