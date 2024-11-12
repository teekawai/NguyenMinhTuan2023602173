package ql_sinh_vien;

public class Test {
	public static void main(String[] args) {
		SinhVien sinhvien = new SinhVien();
		System.out.println("nhập thông tin sinh viên:");
		sinhvien.nhap();
		System.out.println("thông tin sinh viên là:" + sinhvien.toString());
	}

}
