package bai15;

import java.util.Scanner;

public class RoomBill {
	public static void main(String[] args) {
		System.out.println("nhập số ngày, giá phòng:");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int p = sc.nextInt();
		int total = 0;
		if (d == 1)
			total += p;
		else if (d > 1 && d < 5)
			total += d * p - 0.2 * d * p;
		else if (d > 4 && d < 11)
			total += d * p - 0.4 * d * p;
		else
			total += d * p - 0.6 * d * p;
		System.out.println("Giá=" + total);
		sc.close();
	}

}
