package laodong_luong;

import java.util.Scanner;

public abstract class NguoiLaoDong {
	protected String hoTen;
	protected String diaChi;
	protected String loaiLD;

	public NguoiLaoDong() {
	}

	public NguoiLaoDong(String hoTen, String diaChi, String loaiLD) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLD = loaiLD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiLD() {
		return loaiLD;
	}

	public void setLoaiLD(String loaiLD) {
		this.loaiLD = loaiLD;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.printf("nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("nhập loại lao động: ");
		loaiLD = sc.nextLine();
	}

	public abstract double tinhLuong();

	public String inThongTin() {
		return "họ tên:" + hoTen + " ,địa chỉ:" + diaChi + " ,loại lao động:" + loaiLD + " ,lương:" + tinhLuong();
	}

}
