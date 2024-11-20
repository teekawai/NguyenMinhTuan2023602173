package bai13;

import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		System.out.println("Nhap giá bán, % giảm giá:");
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double d = sc.nextDouble();
		System.out.println("Giá=" + (p - p * d * 0.01));
		sc.close();
	}

}
