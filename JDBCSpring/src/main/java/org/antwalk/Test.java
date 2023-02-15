package org.antwalk;

import java.util.List;

import org.antwalk.student.Student;
import org.antwalk.student.StudentDao;
//import org.antwalk.dao.BookDaoImpl;
//import org.antwalk.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		EmployeeDao emp = (EmployeeDao) context.getBean("employeeDaoImpl");
//		System.out.println("Adding records");
//		emp.create("Upasana", 32, 5000000L);
//		emp.create("Anwesha", 21, 1000000L);
//		emp.create("Anu", 22, 2000000L);
//		emp.create("Esha", 21, 3000000L);
//
//		System.out.println("\n________Listing the Employee_________\n");
//		
//		List<Employee> employees = emp.listEmployees(); // for(Book book1:books) // { //
//		for (Employee emp1 : employees) {
//			System.out.println("id " + emp1.getEmpid()); //
//			System.out.println("Salary " + emp1.getSalary()); //
//			System.out.println("Name " + emp1.getName()); //
//			System.out.println("age " + emp1.getAge()); // } //
//		}
//		emp.update(4,25);
//		
//		System.out.println("\n________Listing the Employee after update operation_________\n");
//		
//		List<Employee> employees1 = emp.listEmployees(); // for(Book book1:books) // { //
//		for (Employee emp1 : employees1) {
//			System.out.println("id " + emp1.getEmpid()); //
//			System.out.println("Salary " + emp1.getSalary()); //
//			System.out.println("Name " + emp1.getName()); //
//			System.out.println("age " + emp1.getAge()); // } //
//		}
//		
//		emp.delete(4);
//		
//		System.out.println("\n________Listing the Employee after delete operation_________\n");
//		
//		List<Employee> employees2 = emp.listEmployees(); // for(Book book1:books) // { //
//		for (Employee emp1 : employees2) {
//			System.out.println("id " + emp1.getEmpid()); //
//			System.out.println("Salary " + emp1.getSalary()); //
//			System.out.println("Name " + emp1.getName()); //
//			System.out.println("age " + emp1.getAge()); // } //
//		}
		
		
		StudentDao stdentObj = (StudentDao) context.getBean("studentDaoImpl");
		System.out.println("\n______Adding records________\n");
		stdentObj.create("Upasana", 32, "Banglore");
		stdentObj.create("Anwesha", 21, "Kolkata");
		stdentObj.create("Anu", 22, "Mumbai");
		stdentObj.create("Esha", 21, "Banglore");

		System.out.println("\n________Listing the students_________\n");
		
		List<Student> student1 = stdentObj.listStudents(); // for(Book book1:books) // { //
		for (Student student : student1) {
			System.out.print("id " + student.getStudentid()); //
			System.out.print("\tName " + student.getName()); //
			System.out.print("\tage " + student.getAge()); // } //
			System.out.print("\tAddress " + student.getAddress()); //
			System.out.println();
		}
		stdentObj.update(4,25);
		
		System.out.println("\n________Listing the Student after update operation_________\n");
		List<Student> student2 = stdentObj.listStudents(); // for(Book book1:books) // { //
		for (Student student : student2) {
			System.out.print("id " + student.getStudentid()); //
			System.out.print("\tName " + student.getName()); //
			System.out.print("\tage " + student.getAge()); // } //
			System.out.print("\tAddress " + student.getAddress()); //
			System.out.println();
		}
		
		
		stdentObj.delete(4);
		
		System.out.println("\n________Listing the Student after delete operation_________\n");
		List<Student> student3 = stdentObj.listStudents(); // for(Book book1:books) // { //
		for (Student student : student3) {
			System.out.print("id " + student.getStudentid()); //
			System.out.print("\tName " + student.getName()); //
			System.out.print("\tage " + student.getAge()); // } //
			System.out.print("\tAddress " + student.getAddress()); //
			System.out.println();
		}
		
		
	}
}
