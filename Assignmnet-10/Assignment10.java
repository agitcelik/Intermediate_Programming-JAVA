import java.util.ArrayList;//importing arrayList to use them

public class Assignment10 implements IntStudents {//Beginning of the class

	public void allStudents(ArrayList<Student> studentList) {//Implementing searchStudent method.
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));//printing all of the students
		}
	}//End of the allStudents method.

	public void deleteStudent(ArrayList<Student> studentList, int studentId) {//Implementing searchStudent method.
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getStudentID() == studentId) {//Checking whether student ýd in the arraylist is equals to inputted array or not.
				studentList.remove(i);//If it they are equals to each other deleting out that student.

			}
			System.out.println(studentList.get(i));//printing out others student.

		}

	}//End of the deleteStudent method.

	public Student searchStudent(ArrayList<Student> studentList, int studentId) {//Implementing searchStudent method.
		for (int j = 0; j < studentList.size(); j++) {
			if (studentList.get(j).getStudentID() == (studentId)) {//Checking whether student ýd in the arraylist is equals to inputted array or not. 
				System.out.println(studentList.get(j));//If it they are equals to each other printing out that student.
			} else
				System.out.println("The Id number for this student is not found...");//Otherwise, printing that messagge.

			continue;//And continue to check over and over.

		}
		return null;//To return null.
	}//End of the searchStudent

	public void addStudent(ArrayList<Student> studentList, Student student) {//Implementing addStudent method.
		studentList.add(student);//Adding the new Student into the array
	}//End of the addStudent method.
}