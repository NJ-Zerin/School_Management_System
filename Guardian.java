package Classes;

import java.lang.*;

import interfaces.GuardianOperations;

public final class Guardian{
	private int nid;
	private String name;
	private int phone_number;

	public void Gurdian() {
		System.out.println("");
	}

	public void Gurdian(int nid, String name, int phone_number) {
		System.out.println("");
		this.nid = nid;
		this.name = name;
		this.phone_number = phone_number;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public int getNid() {
		return this.nid;
	}

	public String getName() {
		return this.name;
	}

	public int getPhone_number() {
		return this.phone_number;
	}
}