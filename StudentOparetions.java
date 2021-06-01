package interfaces;

import Classes.Student;

public interface StudentOparetions 
{
	boolean insertStudent(Student s);
    boolean removeStudent(Student s);
	Student searchStudent(int id);
	public void showStudentInfo();
}