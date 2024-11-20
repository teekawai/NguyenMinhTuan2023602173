package bai19;

import java.util.Scanner;

public class TinhGIay {
	public static void main(String[] args) {
		System.out.println("nhập số giờ, phút, giây:");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		System.out.println("Số giây=" + (h * 3600 + m * 60 + s));
		sc.close();
	}

}
