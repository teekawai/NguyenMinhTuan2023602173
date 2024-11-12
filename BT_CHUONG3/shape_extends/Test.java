package shape_extends;

public class Test {
	public static void main(String[] args) {
		System.out.println("nhập thông tin hình chữ nhật:");
		Rectangle rectangle = new Rectangle();
		rectangle.nhap();

		System.out.println("nhập thông tin hình tam giác:");
		Triangle triangle = new Triangle();
		triangle.nhap();

		System.out.printf("\ndiện tích hình chữ nhật là: " + rectangle.getArea());
		System.out.printf("\nVậy thông tin hình chữ nhật là: " + rectangle.toString());
		System.out.printf("\ndiện tích hình tam giác là: " + triangle.getArea());
		System.out.printf("\nVậy thông tin hình tam giác là: " + triangle.toString());

	}

}
