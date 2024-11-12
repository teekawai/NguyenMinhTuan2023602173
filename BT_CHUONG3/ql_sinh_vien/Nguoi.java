package ql_sinh_vien;

import java.util.Scanner;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioiTinh;

	public Nguoi() {
	}

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập tên: ");
		ten = sc.nextLine();
		System.out.printf("nhập tuổi: ");
		tuoi = sc.nextInt();
		System.out.printf("nhap giới tính: ");
		sc.nextLine();
		gioiTinh = sc.next().charAt(0);
	}

	@Override
	public String toString() {
		return "tên:" + ten + "\ntuổi:" + tuoi + "\ngiớiTính=" + gioiTinh;
	}

}
