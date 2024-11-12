package test_person;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("Nguyễn Văn A", "22", "HN", 'M', "qwert", "12345");
		System.out.println(p.toString());
		p.setDOB("31");
		p.setEmail("m@gmail.com");
		p.setGender('F');
		p.setName("Nguyen Minh Tuan");
		p.setPhone("0123456789");
		p.setPOB("ha noi");
		System.out.println(p.toString());
	}

}
