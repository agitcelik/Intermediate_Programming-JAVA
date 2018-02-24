import java.util.ArrayList;//importing arrayList to use them

public class Test {//Beggining of the class
	public static void main(String[] args) {//Beggining of the main method.

		Assignment10 test = new Assignment10();//Creating the object to test methods inside of the classes.

		Address a = new Address("Ankara", 06454);//Creating an Address Object with variables with respect to behind of the classes
		Address a1 = new Address("Istanbul", 34545);//Creating an Address Object with variables with respect to behind of the classes
		Student s2 = new Student("ALÝ", "Çelik", "Mechanical Engineering", 4845, a);//Creating an new Student Object with variables with respect to behind of the classes
		Student s3 = new Student("Ahmet", "Can", "Civil Enginnering", 4832325, a1);//Creating an new Student Object with variables with respect to behind of the classes
		Student s4 = new Student("Ferdi", "Kurt", "Sound Engineering", 9454, a);//Creating an new Student Object with variables with respect to behind of the classes
		

		ArrayList<Student> list = new ArrayList<Student>();//Creating an array list
		list.add(s2);//Add student to the array.
		list.add(s3);//Add student to the array.
		list.add(s4);//Add student to the array.

		Student s5 = new Student("Selim", "Çelik", "AAA", 4884, new Address("Ankara", 778787));//In order to add students create an new student to use for adding method.
		System.out.println("Printing out all of the students");
		test.allStudents(list);//Printing all of the students.
		System.out.println("\n Searching a student with respect to Id number");
		test.searchStudent(list, 4845);//Search the student with same Id nubers.
		System.out.println("\n Removing a student with respect to Id number");
		test.deleteStudent(list, 4845);//Deleting the student with same Id numbers.
		System.out.println("\n Adding a student to the list");
		test.addStudent(list, s5);//Adding an new student to the array list.

		test.allStudents(list);//After adding to student to the list, printing again to show them.

	}//End of the main method.
}//End of the class method.