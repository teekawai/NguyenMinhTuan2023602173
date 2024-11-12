package laodong_luong;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
	protected double luongCoBan;
	protected double heSoLuong;
	protected int soNgayCong;

	public KiSu() {
		super();
	}

	public KiSu(double luongCoBan, double heSoLuong, int soNgayCong) {
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}

	public KiSu(double luongCoBan, double heSoLuong, int soNgayCong, String hoTen, String diaChi, String loaiLD) {
		super(hoTen, diaChi, loaiLD);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.printf("nhập lương cơ bản: ");
		luongCoBan = sc.nextDouble();
		System.out.printf("nhập hệ số lương: ");
		heSoLuong = sc.nextDouble();
		System.out.printf("nhap số ngày công: ");
		soNgayCong = sc.nextInt();
	}

	@Override
	public double tinhLuong() {
		double thuong;
		if (soNgayCong <= 15)
			thuong = 500000;
		else if (soNgayCong > 15 && soNgayCong < 25)
			thuong = 1000000;
		else
			thuong = 2000000;
		return luongCoBan * heSoLuong + thuong;
	}

	public String inThongTin() {
		return super.inThongTin() + " ,số ngày công:" + soNgayCong + " ,lương cơ bản:" + luongCoBan + " ,hệ số lương:"
				+ heSoLuong;
	}

}
