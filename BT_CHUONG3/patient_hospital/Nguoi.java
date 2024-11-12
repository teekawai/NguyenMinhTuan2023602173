package patient_hospital;

public class Nguoi {
	public String ten;
	public int tuoi;
	public char gioiTinh;

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getTen() {
		return ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public char getGioiTinh() {
		return gioiTinh;
	}

	public String toString() {
		return "tên:" + ten + ", tuổi:" + tuoi + ", giới tính: " + gioiTinh + ".";
	}

}
