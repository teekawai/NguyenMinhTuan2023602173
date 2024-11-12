package test_person;

public class Person {
	// các thuộc tính
	String name;
	String dob;
	String pob;
	char gender;
	String email;
	String phone;

	// các hàm tạo
	Person() {
		this("noName", "noDate", "noPlace", 'N', "noEmail", "noPhone");
	}

	Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public String getDOB() {
		return this.dob;
	}

	public String getpob() {
		return this.pob;
	}

	public char getGender() {
		return this.gender;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}

	public void setPOB(String pob) {
		this.pob = pob;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return name + ", " + dob + ", " + pob + ", " + gender + ", " + email + ", " + phone;
	}

}
