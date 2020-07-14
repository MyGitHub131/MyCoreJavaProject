package DetailsOfTeacher;

public class TeacherDetails {
	
	String name;
	int age;
	String color;
	String qulification;
	int dob;
	String profile;
	String address;
	
	public TeacherDetails(String name, int age, String color, String qulification, int dob, String profile,
			String address) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.qulification = qulification;
		this.dob = dob;
		this.profile = profile;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	public String getQulification() {
		return qulification;
	}
	public int getDob() {
		return dob;
	}
	public String getprofile() {
		return profile;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "TeacherDetails [name=" + name + ", age=" + age + ", color=" + color + ", qulification=" + qulification
				+ ", dob=" + dob + ", profile=" + profile + ", address=" + address + "]";
	}
}
