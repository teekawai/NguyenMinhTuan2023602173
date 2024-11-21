package b3_nl_StringTooLong;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập chuỗi ký tự nhỏ hơn 30  ký tự: ");
		String nhap = sc.next();
		try {
			Nhap N1 = new Nhap(nhap);
		} catch (Exception e) {
			System.out.println("loi " + e.getMessage());
		}
		System.out.println("nhập từ 'DONE' để thoát chương trình : ");
		String done = sc.next();
		do {
			System.out.println("hãy nhập lại : ");
			done = sc.next();
			if (done.equals("DONE")) {
				System.out.println("thoát chương trình !!");
			}

			break;
		} while (!done.equals("DONE"));
	}

}
