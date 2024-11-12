package resizableircle;

public class Test {
	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle();
		System.out.println("nhập thông tin hình tròn: ");
		rc.nhap();
		System.out.println("nhập thông tin hình tròn: " + rc.inThongTin());
		rc.resize(50);
		System.out.println("thông tin hình tròn sau khi thay đổi bán kính là: " + rc.inThongTin());
	}

}
