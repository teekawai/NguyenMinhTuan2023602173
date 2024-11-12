package sinhvien_diem;

import java.util.Scanner;

public class SVCDCQ extends Nguoi {
	protected float TDKT;
	protected int SMKT;
	protected float DTKTHP;

	public SVCDCQ() {
		super();
	}

	public SVCDCQ(float TDKT, int SMKT, float DTKTHP) {
		this.TDKT = TDKT;
		this.SMKT = SMKT;
		this.DTKTHP = DTKTHP;
	}

	public SVCDCQ(float TDKT, int SMKT, float DTKTHP, String hoTen, String diaChi, String loaiSV) {
		super(hoTen, diaChi, loaiSV);
		this.TDKT = TDKT;
		this.SMKT = SMKT;
		this.DTKTHP = DTKTHP;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.printf("nhập TDKT: ");
		TDKT = sc.nextFloat();
		System.out.printf("nhập SMKT: ");
		SMKT = sc.nextInt();
		System.out.printf("nhập DTKTHP: ");
		DTKTHP = sc.nextFloat();
	}

	@Override
	public float tinhDiem() {
		return (TDKT / SMKT + DTKTHP) / 3;
	}

}
