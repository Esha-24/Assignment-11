package org.antwalk.student;

public class Student {
	
	private int studentid;
	 private String name;
	 private int age;
	 private String address;
	 
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	 
	 

}
