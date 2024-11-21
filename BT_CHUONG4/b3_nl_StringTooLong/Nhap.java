package b3_nl_StringTooLong;

public class Nhap {
	String nhap;

	public Nhap(String nhap) throws Exception {
		if (nhap.length() > 30) {
			throw new Exception("chuỗi không được vượt quá 30 ký tự");
		}
		this.nhap = nhap;
	}

	public String getNhap() {
		return nhap;
	}

	public void setNhap(String nhap) {
		this.nhap = nhap;
	}

	@Override
	public String toString() {
		return "Nhap{" + "nhap='" + nhap + '\'' + '}';
	}

}
