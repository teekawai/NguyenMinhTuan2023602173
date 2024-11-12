package patient_hospital;

public class Test {

	public static void main(String[] args) {
		// tạo đối tượng bệnh viện
		BenhVien bv = new BenhVien("K Tân Triều", "Xa La", "Nguyễn Minh Tuấn");

		// tạo đối tượng bệnh nhân
		BenhNhan bn = new BenhNhan("Đinh Đức Thái", 19, 'M', "ngáo cần", "Bị điên", bv);

		System.out.print(bn.toString());
	}

}
