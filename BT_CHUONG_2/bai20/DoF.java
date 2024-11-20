package bai20;

import java.util.Scanner;

public class DoF {
	public static void main(String[] args) {
		System.out.println("nhập độ C:");
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		System.out.println("Độ F=" + c * 1.8 + 32);
		sc.close();
	}

}
