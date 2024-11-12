package giangvien_luong;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGV;

	public GiangVien() {
	}

	public GiangVien(String hoTen, String diaChi, String loaiGV) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.printf("nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.printf("nhập loại gv: ");
		loaiGV = sc.nextLine();
	}

	public abstract double tinhLuong();

	public String inThongTin() {
		return "họ tên:" + hoTen + " ,địa chỉ:" + diaChi + " ,loại giảng viên:" + loaiGV + " ,lương:" + tinhLuong();
	}

}
