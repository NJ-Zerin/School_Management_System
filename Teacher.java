package Classes;

import java.lang.*;
import interfaces.TeacherOparetions ;

public class Teacher{
	private int id;
	private String name;
	private int salary;

	public Teacher() {
		System.out.println("");
	}

	public Teacher(String name, int id, int salary) {
		System.out.println("");
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

}