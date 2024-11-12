package ql_hocvien;

public class Test {
	public static void main(String[] args) {
		System.out.println("nhập học viên DH");
		HocVienDH hvdh = new HocVienDH();
		hvdh.nhapThongTin();
		System.out.println("nhập học viên LT");
		HocVienLT hvlt = new HocVienLT();
		hvlt.nhapThongTin();
		HocVien hv1 = hvdh;
		HocVien hv2 = hvlt;
		System.out.println("thông tin học viên DH: " + hv1.inThongTin());
		System.out.println("thông tin học viên LT: " + hv2.inThongTin());
	}

}
