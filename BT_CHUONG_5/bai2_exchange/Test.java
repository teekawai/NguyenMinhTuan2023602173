package bai2_exchange;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập vào mã tiền tệ thứ nhất: ");
		String code1 = sc.next();
		System.out.print("nhập vào mã tiền tệ thứ hai: ");
		String code2 = sc.next();
		System.out.print("nhập lượng tiền cần chuyển đổi: ");
		double amount = sc.nextDouble();

		Exchange ex = new Exchange();
		double money = ex.convert(code1, code2, amount);
		System.out.println("lượng tiền sau khi chuyển đổi là: " + Math.round(money));
	}

}
