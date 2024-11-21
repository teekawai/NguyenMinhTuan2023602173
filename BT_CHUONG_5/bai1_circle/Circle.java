package bai1_circle;

import java.util.Scanner;

public class Circle {
	protected double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public void nhap() {
		System.out.println("nhập thông tin hình tròn:");
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập bán kính: ");
		radius = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Circle{" + "radius=" + radius + ", Area=" + getArea() + '}';
	}

}
