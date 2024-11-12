package laodong_luong;

public class Test {
	public static void main(String[] args) {
		System.out.println("nhập thông tin của LDPT:");
		LaoDongPhoThong ldpt = new LaoDongPhoThong();
		ldpt.nhapThongTin();
		System.out.println("\nthông tin của LDPT là: " + ldpt.inThongTin());
		System.out.println("\nnhập thông tin của kĩ sư:");
		KiSu kisu = new KiSu();
		kisu.nhapThongTin();
		System.out.println("\nthông tin của kĩ sư là: " + kisu.inThongTin());
	}

}
