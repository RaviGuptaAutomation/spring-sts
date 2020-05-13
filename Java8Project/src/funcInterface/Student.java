package funcInterface;

import java.util.Comparator;

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private String rollNo;
	
	public Student(String firstName, String lastName, int age, String rollNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", rollNo=" + rollNo
				+ "]";
	}
	
	
	
	

}
