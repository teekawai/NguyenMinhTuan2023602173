package shape_extends;

import java.util.Scanner;

public class Rectangle extends Shape {
	protected int length;
	protected int width;

	public Rectangle() {
		super();
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.printf("nhập chiều dài: ");
		length = sc.nextInt();
		System.out.printf("nhập chiều rộng: ");
		width = sc.nextInt();
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return super.toString() + ", chiều dài:" + length + ", chiều rộng:" + width + " ,diện tích:" + getArea();
	}

}
