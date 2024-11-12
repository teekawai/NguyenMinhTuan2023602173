package test_nhanvien;

public class NhanVien {
	private String name;
	private DiaChi address;
	private String dob;
	private char gender;

	// hàm tạo

	public NhanVien() {
		this.name = "noName";
		this.address = new DiaChi();
		this.dob = "noDOB";
		this.gender = 'N';
	}

	public NhanVien(String name, DiaChi address, String dob, char gender) {
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}

	// phương thức setter

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(DiaChi address) {
		this.address = address;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// phương thức getter

	public String getName() {
		return name;
	}

	public DiaChi address() {
		return address;
	}

	public String dob() {
		return dob;
	}

	public char gender() {
		return gender;
	}

	public String toString() {
		return "Tên: " + name + "\nĐịa chỉ: " + address + "\nNgày sinh: " + dob + "\nGiới tính: " + gender;
	}

}
