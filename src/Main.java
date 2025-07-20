/*
 Author :Maria
 Date   : July 19 2025
 Description : Create a Student class with name, rollNumber, and grade. Add a displayDetails() method to print the details.
 In Main.java, create a Student object, assign sample data, and call displayDetails().
 */
    // TODO: Create a class called Student with name, rollNumber, and grade
    // TODO: Create a method to display student details
class Student {
	String name;
	int rollNumber;
	char grade;
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Grade: "+grade);		
	}
}
public class Main {
      public static void main(String[] args) {
        // TODO: Create a Student object and call the method to display details
           Student student=new Student();
	         student.name="Maria";
		 student.rollNumber=53;
		 student.grade='A';
		 student.displayDetails();	
    }
}
