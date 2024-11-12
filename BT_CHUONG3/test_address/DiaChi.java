package test_address;

public class DiaChi {
	String thon;
	String xa;
	String huyen;
	String tinh;

	// tạo constructor

	DiaChi() {
		this("kThon", "kXa", "kHuyen", "kTinh");
	}

	DiaChi(String thon, String xa, String huyen, String tinh) {
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	// Setter method

	public void setThon(String thon) {
		this.thon = thon;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	// getter method

	public String getThon() {
		return this.thon;
	}

	public String getXa() {
		return this.xa;
	}

	public String getHuyen() {
		return this.huyen;
	}

	public String getTinh() {
		return this.tinh;
	}

	// hàm để trả lại kết quả là địa chỉ

	public String toString() {
		return "thôn " + thon + ", xã " + xa + ", huyện " + huyen + ", thành phố " + tinh + ".";
	}

}
