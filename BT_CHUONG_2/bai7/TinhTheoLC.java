package bai7;

import java.util.Scanner;

public class TinhTheoLC {
	public static void main(String[] args) {
		System.out.println("nhập 2 số nguyên:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Nhap 1 ký tự:");
		char ch = sc.next().charAt(0);
		double result = 0;
		switch (ch) {
		case 'A':
			result = a + b;
			break;
		case 'S':
			result = a - b;
			break;
		case 'M':
			result = a * b;
			break;
		case 'D':
			result = a / b;
			break;
		default:
			System.out.println("ký tự không hợp lệ!");
			break;
		}
		System.out.println(result);
		sc.close();
	}

}
