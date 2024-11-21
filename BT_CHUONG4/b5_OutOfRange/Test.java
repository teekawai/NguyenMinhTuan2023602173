package b5_OutOfRange;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số trong phạm vi từ 5 triệu đến 20 triệu: ");
		int so = sc.nextInt();
		try {
			Nhap N1 = new Nhap(so);
		} catch (Exception e) {
			System.out.println("lỗi " + e.getMessage());
		}
		do {
			System.out.println("hãy nhập lại số trong phạm vi: ");
			so = sc.nextInt();
		} while (so < 5000000 || so > 20000000);
		System.out.println("bạn nhập đúng số trong phạm vi");
	}

}
