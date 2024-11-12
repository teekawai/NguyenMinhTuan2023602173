package instanceof_practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số phần tử của mảng hình chữ nhật:");
		int n = sc.nextInt();
		Rectangle[] rectangle = new Rectangle[n];
		System.out.println("nhập các hình chữ nhật:\n");
		for (int i = 0; i < n; i++) {
			System.out.println("nhập thông tin hình thứ " + (i + 1) + ":");
			rectangle[i] = new Rectangle();
			rectangle[i].nhap();
		}
		System.out.println("nhập số phần tử mảng hình tam giác:");
		int m = sc.nextInt();
		Triangle[] triangle = new Triangle[m];
		System.out.println("nhập các hình tam giác:\n");
		for (int i = 0; i < m; i++) {
			System.out.println("nhập thông tin của hình thứ " + (i + 1) + ":");
			triangle[i] = new Triangle();
			triangle[i].nhap();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(rectangle[i].toString());
		}
		System.out.println("kiểm tra đối tượng có thuộc lớp không:");
		System.out.println(rectangle[0] instanceof Shape);
	}

}
