package interfaces;

import Classes.Teacher;

public interface TeacherOparetions 
{
	boolean insertTeacher(Teacher t);
    boolean removeTeacher(Teacher t);
	Teacher searchTeacher(int Id);
	public void showTeacherInfo();
}