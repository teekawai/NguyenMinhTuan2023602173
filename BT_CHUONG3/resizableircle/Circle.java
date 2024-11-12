package resizableircle;

import java.util.Scanner;

public class Circle implements GeometricObject {
	protected double radius = 1.0;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập bán kính hình tròn: ");
		radius = sc.nextDouble();
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
