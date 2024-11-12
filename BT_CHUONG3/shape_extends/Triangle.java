package shape_extends;

import java.util.Scanner;

public class Triangle extends Shape {
	protected int base;
	protected int height;

	public Triangle() {
		super();
	}

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public Triangle(int base, int height, String color) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.printf("nhập cạnh đáy: ");
		base = sc.nextInt();
		System.out.printf("nhập chiều cao: ");
		height = sc.nextInt();
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}

	@Override
	public String toString() {
		return super.toString() + ", cạnh đáy:" + base + ", chiều cao:" + height + " ,diện tích:" + getArea();
	}

}
