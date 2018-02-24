import java.util.ArrayList;//importing arrayList to use them

public interface IntStudents {//Beggining of the Student class
	public Student searchStudent(ArrayList<Student> studentList, int studentId);//This method will be impelemented into Assignment10 class.

	public void addStudent(ArrayList<Student> studentList, Student student);//This method will be impelemented into Assignment10 class.

	public void deleteStudent(ArrayList<Student> studentList, int studentId);//This method will be impelemented into Assignment10 class.

	public void allStudents(ArrayList<Student> studentList);//This method will be impelemented into Assignment10 class.

}//End of the IntStudent class.
