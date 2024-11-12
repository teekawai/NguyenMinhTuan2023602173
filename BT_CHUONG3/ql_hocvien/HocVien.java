package ql_hocvien;

import java.util.Scanner;

public abstract class HocVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiCT;

	public HocVien() {
	}

	public HocVien(String hoTen, String diaChi, String loaiCT) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCT = loaiCT;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.printf("nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.printf("nhập loại CT: ");
		loaiCT = sc.nextLine();
	}

	public abstract double hocPhi();

	public String inThongTin() {
		return "họ tên:" + hoTen + " ,địa chỉ:" + diaChi + " ,loại chương trình:" + loaiCT + " ,học phí:" + hocPhi();
	}

}
