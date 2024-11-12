package giangvien_luong;

public class Test {
	public static void main(String[] args) {
		GVCoHuu gvch = new GVCoHuu();
		System.out.println("nhập thông tin giảng viên cố hữu:");
		gvch.nhapThongTin();
		GVThinhGiang gvtg = new GVThinhGiang();
		System.out.println("nhập thông tin giảng viên thỉnh giảng:");
		gvtg.nhapThongTin();
		GiangVien gv1 = gvch;
		GiangVien gv2 = gvtg;
		System.out.println("thông tin của giảng viên cố hữu: " + gv1.inThongTin());
		System.out.println("thông tin của giảng viên thỉnh giảng: " + gv2.inThongTin());
	}

}
