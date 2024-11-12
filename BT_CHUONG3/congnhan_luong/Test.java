package congnhan_luong;

public class Test {
	public static void main(String[] args) {
		CNKSP cnksp = new CNKSP();
		System.out.println("nhập thông tin của CNKSP:");
		cnksp.nhapThongTin();
		System.out.println("nhập thông tin của CNTCN:");
		CNTCN cntcn = new CNTCN();
		cntcn.nhapThongTin();
		System.out.println("thông tin của CNKSP là: " + cnksp.toString());
		System.out.println("thông tin của CNTCN là: " + cntcn.toString());
	}

}
