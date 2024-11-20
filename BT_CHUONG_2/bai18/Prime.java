package bai18;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Nhập n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				d++;
		}
		if (d == 0) {
			System.out.println("là số nguyên tố:");
		} else {
			System.out.println("không là số nguyên tố:");
		}
		sc.close();
	}

}
