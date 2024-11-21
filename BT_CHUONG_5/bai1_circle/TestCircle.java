package bai1_circle;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		circle.nhap();
		System.out.println("diện tích là: " + circle.getArea());
		System.out.println("thông tin hình tròn: " + circle.toString());

		System.out.println("nhập số lượng phần tử:");
		CircleCollection al = new CircleCollection();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Circle c = new Circle(Math.random());
			al.addCircle(c);
		}

		System.out.println("thông tin danh sách:\n" + al.toString());
		System.out.println("diện tích lớn nhất: " + al.findMaxArea());
		System.out.println("thông tin hình tròn có diện tích nhỏ nhất:");
		double min = al.findMinArea();

		for (int i = 0; i < n; i++) {
			if (al.getCircle(i).getArea() == min)
				System.out.println(al.getCircle(i).toString());
		}
	}

}
