package test_nhanvien;

public class Test {
	public static void main(String[] args) {
		DiaChi address = new DiaChi("Nội", "Thanh Liệt", "Thanh Trì", "Hà Nội");
		NhanVien nv = new NhanVien("Hồ Như Duy Khánh", address, "19/07/2019", 'M');
		System.out.println("Thông tin về nhân viên là:\n" + nv.toString());
	}

}
