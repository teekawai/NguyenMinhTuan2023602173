package bai16;

import java.util.Scanner;

public class GiaiThua {
	public static int GiaiThua(int n) {
		if (n == 1)
			return 1;
		else
			return GiaiThua(n - 1) * n;
	}

	public static void main(String[] args) {
		System.out.println("Nhập n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("n!=" + GiaiThua(n));
		sc.close();
	}

}
