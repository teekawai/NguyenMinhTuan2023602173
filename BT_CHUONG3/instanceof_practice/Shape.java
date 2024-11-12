package instanceof_practice;

import java.util.Scanner;

public abstract class Shape {
	protected String color;

	public Shape() {
	}

	public Shape(String color) {
		this.color = color;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập màu sắc: ");
		color = sc.nextLine();
	}

	public abstract double getArea();

	@Override
	public String toString() {
		return "màu:" + color;
	}

}
