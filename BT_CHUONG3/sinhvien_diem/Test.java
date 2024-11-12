package sinhvien_diem;

public class Test {
	public static void main(String[] args) {
		SVCDN svcdn = new SVCDN();
		System.out.println("nhap SVCDN");
		svcdn.nhapThongTin();
		System.out.println("nhap SVCDCQ");
		SVCDCQ svcdcq = new SVCDCQ();
		svcdcq.nhapThongTin();
		Nguoi sv1 = svcdn;
		Nguoi sv2 = svcdcq;
		System.out.println("thông tin của SVCDN là: " + sv1.inThongTin());
		System.out.println("thông tin của SVCDCQ là: " + sv2.inThongTin());
	}

}
