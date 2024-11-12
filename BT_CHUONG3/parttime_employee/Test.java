package parttime_employee;

public class Test {
	public static void main(String[] args) {
		PartTimeEmployee pte = new PartTimeEmployee();
		System.out.println("nhập thông tin:\n");
		pte.nhap();
		pte.setName("Tuấn");
		System.out.println("tên: " + pte.getName());
		pte.setAge(19);
		System.out.println("tuổi: " + pte.getAge());

		System.out.println("thông tin nhân viên: " + pte.toString());
	}

}
