package Classes;

import java.lang.*;
import interfaces.ITOparetions;

public class ITOparetor {
	private int id;
	private String name;
	private int salary;
	private int exparince;
	void IToparetor() {
		System.out.println("");
	}

	void ITOparetor(int id, String name, int salary, int exparince) {
		System.out.println("");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exparince = exparince;
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

	public void setExpariance(int exparince) {
		this.exparince = exparince;
	}
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}

	public int getExpariance() {
		return this.exparince;
	}
}
