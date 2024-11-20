package bai10;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("nhập chiều dài, rộng:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Diện tích=" + (a * b) + ",    Chu vi=" + (2 * a + b));
		sc.close();
	}

}
