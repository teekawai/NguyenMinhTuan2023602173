package sinhvien_diem;

import java.util.Scanner;

public abstract class Nguoi {
	protected String hoTen;
	protected String diaChi;
	protected String loaiSV;

	public Nguoi() {
	}

	public Nguoi(String hoTen, String diaChi, String loaiSV) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiSV = loaiSV;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.printf("nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.printf("nhập loại sinh viên: ");
		loaiSV = sc.nextLine();
	}

	public abstract float tinhDiem();

	public String inThongTin() {
		return "họ tên:" + hoTen + " ,địa chỉ:" + diaChi + " ,loại SV:" + loaiSV + " ,điểm tổng kết:" + tinhDiem();
	}

}
