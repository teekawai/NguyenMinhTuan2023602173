package bai6;

import java.util.Scanner;

public class TongHieu_Tich_Thuong {
	public static void main(String[] args) {
		System.out.println("nhập 2 số nguyên:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Tổng=" + (a + b) + "\nHiệuu=" + (a - b) + "\nTích=" + (a * b) + "\nThương=" + (a / b));
		sc.close();
	}

}
