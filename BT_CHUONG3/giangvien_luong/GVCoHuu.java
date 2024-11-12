package giangvien_luong;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	protected double LCB;
	protected float heSoLuong;
	protected int thamNienCongTac;

	public GVCoHuu() {
		super();
	}

	public GVCoHuu(double LCB, float heSoLuong) {
		this.LCB = LCB;
		this.heSoLuong = heSoLuong;
	}

	public GVCoHuu(double LCB, float heSoLuong, String hoTen, String diaChi, String loaiGV, int thamNienCongTac) {
		super(hoTen, diaChi, loaiGV);
		this.LCB = LCB;
		this.heSoLuong = heSoLuong;
		this.thamNienCongTac = thamNienCongTac;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.printf("lương cơ bản: ");
		LCB = sc.nextDouble();
		System.out.printf("hệ số lương: ");
		heSoLuong = sc.nextFloat();
		System.out.printf("thâm niên công tác: ");
		thamNienCongTac = sc.nextInt();
	}

	@Override
	public double tinhLuong() {
		double phucap = 0;
		if (thamNienCongTac < 5)
			phucap = 0;
		else if (thamNienCongTac == 5)
			phucap = LCB * 0.05;
		else
			phucap = (phucap - 5) / 100 * LCB;
		return LCB * heSoLuong + phucap;
	}

}
