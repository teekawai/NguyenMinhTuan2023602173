package ql_sinh_vien;

import java.util.Scanner;

public class Truong {
	private String ten;
	private String diaChi;
	private String hieuTruong;

	public Truong() {
	}

	public Truong(String ten, String diaChi, String hieuTruong) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHieuTruong() {
		return hieuTruong;
	}

	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập tên trường: ");
		ten = sc.nextLine();
		System.out.printf("nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.printf("nhập tên hiệu trưởng: ");
		hieuTruong = sc.nextLine();
	}

	@Override
	public String toString() {
		return "học tại trường:" + ten + "\n địa chỉ:" + diaChi + "\nhiệu trưởng:" + hieuTruong;
	}

}
