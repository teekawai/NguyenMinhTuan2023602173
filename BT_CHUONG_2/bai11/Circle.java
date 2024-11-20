package bai11;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		System.out.println("Nhập bán kính r:");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.println("Diện tích=" + Math.PI * r * r + ",  Chu vi=" + 2 * r * Math.PI);
		sc.close();
	}

}
