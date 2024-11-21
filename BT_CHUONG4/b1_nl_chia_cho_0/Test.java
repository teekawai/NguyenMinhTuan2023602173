package b1_nl_chia_cho_0;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số a : ");
		int a = sc.nextInt();
		System.out.println("nhập vào số b : ");
		int b = sc.nextInt();

		try {
			if (b == 0)
				throw new Exception("Không thể chia cho 0");
			float c = (float) a / b;
			System.out.println("kq= " + c);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
