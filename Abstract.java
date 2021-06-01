package Classes;
import java.util.Formatter;
import java.io.*;
import java.util.Scanner;
import interfaces.GuardianOperations;
import interfaces.ITOparetions;
import interfaces.StudentOparetions;
import interfaces.TeacherOparetions;

public abstract class Abstract implements StudentOparetions, TeacherOparetions, GuardianOperations, ITOparetions {
	public Student students[] = new Student[500];
	public Teacher teachers[] = new Teacher[100];
	public Guardian guardians[] = new Guardian[500];
	public ITOparetor itOparetors[] = new ITOparetor[40];
	
    public boolean flag = false;
	public boolean insertStudent(Student s) {
		return false;
	}

	public boolean removeStudent(Student s) {
		return false;
	}

	public abstract void showStudentInfo(); 

	public Student searchStudent(int Id) {
		Student s = null;

		return s;
	}

	public boolean insertTeacher(Teacher t) {
		return false;
	}

	public boolean removeTeacher(Teacher t) {
		return false;
	}

	public abstract void showTeacherInfo(); 

	public Teacher searchTeacher(int Id2) {
		Teacher t = null;
		return t;
	}

	public boolean insertGuardian(Guardian g) {
		return false;
	}

	public boolean removeGuardian(Guardian g) {
		return false;
	}

	public abstract void showGuardianInfo(); 

	public Guardian searchGuardian(int Nid) {
		Guardian g = null;
		return g;
	}

	public boolean insertITOparetor(ITOparetor io) {
		return false;
	}

	public boolean removeITOparetor(ITOparetor io) {
		return false;
	}

	public abstract void showITOparetorInfo(); 

	public ITOparetor searchITOparetor(int id) {
		ITOparetor io = null;
		return io;
	}
}