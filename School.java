package Classes;
import java.util.Formatter;
import java.io.*;
import java.util.Scanner;
import interfaces.*;
public  class School extends Abstract{
	
	public boolean insertStudent(Student s) {
    boolean flag = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeStudent(Student s) {
		boolean flag = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == s) {
				students[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public Student searchStudent(int Id) {
		Student s = null;

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == Id) {
					s = students[i];
					break;
				}
			}
		}
		return s;
	}

	public void showStudentInfo() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("\t\t ...>>> Student information <<<...\n");
				System.out.println("\t ---------------------------------------------------");
				System.out.println("\t ID of Student      :" + students[i].getId());
				System.out.println("\t Name of Student    :" + students[i].getName());
				System.out.println("\t GPA of Student     :" + students[i].getCgpa());
				System.out.println("\t ---------------------------------------------------");
			}
		}
	}

	

	public boolean insertTeacher(Teacher t) {
		boolean flag = false;
		for (int i = 0; i < teachers.length; i++) {
			if (teachers[i] == null) {
				teachers[i] = t;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeTeacher(Teacher t) {
		boolean flag = false;
		for (int i = 0; i < teachers.length; i++) {
			if (teachers[i] == t) {
				teachers[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void showTeacherInfo() {
		for (int i = 0; i < teachers.length; i++) {
			if (teachers[i] != null) {

				System.out.println("\t\t ...>>> Teacher information <<<...\n");
				System.out.println("\t ---------------------------------------------------");
				System.out.println("\t ID of Teacher      :" + teachers[i].getId());
				System.out.println("\t Name of Teacher    :" + teachers[i].getName());
				System.out.println("\t Salary of Teacher  :" + teachers[i].getSalary());
				System.out.println("\t ---------------------------------------------------");
				
				
			}
		}
	}

	public Teacher searchTeacher(int Id2) {
		Teacher t = null;

		for (int i = 0; i < teachers.length; i++) {
			if (teachers[i] != null) {
				if (teachers[i].getId() == Id2) {
					t = teachers[i];
					break;
				}
			}
		}
		return t;
	}

	public boolean insertGuardian(Guardian g) {
		boolean flag = false;
		for (int i = 0; i < guardians.length; i++) {
			if (guardians[i] == null) {
				guardians[i] = g;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeGuardian(Guardian g) {
		boolean flag = false;
		for (int i = 0; i < guardians.length; i++) {
			if (guardians[i] == g) {
				guardians[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void showGuardianInfo() {
		for (int i = 0; i < guardians.length; i++) {
			if (guardians[i] != null) {
				System.out.println("\t\t ...>>> Guardian information <<<...\n");
				System.out.println("\t ---------------------------------------------------");
				System.out.println("\t NID of guardian         : " + guardians[i].getNid());
				System.out.println("\t Name of guardian        : " + guardians[i].getName());
				System.out.println("\t phone_number of guardian: " + guardians[i].getPhone_number());
				System.out.println("\t ---------------------------------------------------");

			}
		}
	}

	public Guardian searchGuardian(int Nid) {
		Guardian g = null;

		for (int i = 0; i < guardians.length; i++) {
			if (guardians[i] != null) {
				if (guardians[i].getNid() == Nid) {
					g = guardians[i];
					break;
				}
			}
		}
		return g;
	}

	public boolean insertITOparetor(ITOparetor io) {
		boolean flag = false;
		for (int i = 0; i < itOparetors.length; i++) {
			if (itOparetors[i] == null) {
				itOparetors[i] = io;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeITOparetor(ITOparetor io) {
		boolean flag = false;
		for (int i = 0; i < itOparetors.length; i++) {
			if (itOparetors[i] == io) {
				itOparetors[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void showITOparetorInfo() {
		for (int i = 0; i < itOparetors.length; i++) {
			if (itOparetors[i] != null) {
				System.out.println("\t\t ...>>> ITOparetor information <<<...\n");
				System.out.println("\t ---------------------------------------------------");
				System.out.println("\t ID of  ITOparetors       : " + itOparetors[i].getId());
				System.out.println("\t Name of ITOparetors      : " + itOparetors[i].getName());
				System.out.println("\t Salary of ITOparetors    : " + itOparetors[i].getSalary());
				System.out.println("\t Expariance of ITOparetors: " + itOparetors[i].getExpariance());
				System.out.println("\t ---------------------------------------------------");

				
			}
		}
	}

	public ITOparetor searchITOparetor(int id) {
		ITOparetor io = null;

		for (int i = 0; i < itOparetors.length; i++) {
			if (itOparetors[i] != null) {
				if (itOparetors[i].getId() == id) {
					io = itOparetors[i];
					break;
				}
			}
		}
		return io;
	}
    public String ID,name1;
	public void myshow() {          

	try{
		Formatter formatter = new Formatter("E:\\School Managment System (4) (1)\\School Managment System (4)\\School Managment System\\Fileio\\Student.txt");
		Scanner input = new Scanner(System.in);
		System.out.print("\t How Many Student's Records Want to Show:");
	    int a=input.nextInt();
		for(int i=0; i<a; i++){
		System.out.print("\t -----------------------------\n");
		System.out.print("\t Enter the Student's ID  : ");
		ID = input.next();
		System.out.print("\t -----------------------------\n");
		System.out.print("\t Enter the Student's name: ");
		name1 = input.next();
		System.out.print("\t -----------------------------\n");

		formatter.format("%s %s\r\n",ID,name1);
	}
		formatter.close();
	
	}
	    catch(Exception e){
		System.out.println(e);
		}
	}
		public void showAllStudents() {        
			try {
			  File file = new File("E:\\School Managment System (4) (1)\\School Managment System (4)\\School Managment System\\Fileio\\Student.txt");
			  Scanner scanner = new Scanner(file);
	  
			  while(scanner.hasNext()){
				String IDRec = scanner.next();
				String nameRec = scanner.next();
				System.out.println("\t ..........................................................");
				System.out.println("\t      Student  ID  : "+IDRec+"                             ");
				System.out.println("\t      Student  Name: "+nameRec+"                           ");
				System.out.println("\t ..........................................................");
			  }
			  scanner.close();
			} catch (Exception e) {
			  System.out.println(e);
			}
		}
			public String ID1,name2;
	        public void show() {          

			try{
			Formatter formatter = new Formatter("E:\\School Managment System (4) (1)\\School Managment System (4)\\School Managment System\\Fileio\\Teacher.txt");
	
			Scanner input = new Scanner(System.in);
			System.out.print("\t How Many Teacher's Records Want to Show:");
	        int a=input.nextInt();
		    for(int i=0; i<a; i++){
			System.out.print("\t -----------------------------\n");
			System.out.print("\t Enter the Teacher's ID  : ");
			ID1 = input.next();
			System.out.print("\t -----------------------------\n");
			System.out.print("\t Enter the Teacher's Name: ");
			name2 = input.next();
			System.out.print("\t -----------------------------\n");
			formatter.format("%s %s\r\n",ID1,name2);
		   }
			formatter.close();
	
		  }
	
			catch(Exception e){
		  System.out.println(e);
		}
	  }
			public void showAllTeachers() {        
			try {
			  File file = new File("E:\\School Managment System (4) (1)\\School Managment System (4)\\School Managment System\\Fileio\\Teacher.txt");
			  Scanner scanner = new Scanner(file);
	  
			  while(scanner.hasNext()){
				String IDRec1 = scanner.next();
				String nameRec1 = scanner.next();
				System.out.println("\t ..........................................................");
				System.out.println("\t      Teacher  ID  : "+IDRec1+"                            ");
				System.out.println("\t      Teacher  Name: "+nameRec1+"                          ");
				System.out.println("\t ..........................................................");
			  }
			  scanner.close();
			} catch (Exception e) {
			  System.out.println(e);
			}
			}
			public String nid2,name3;
	        public void showDetails() {       

			try{
			Formatter formatter = new Formatter("E:\\School Managment System (4) (1)\\School Managment System (4)\\School Managment System\\Fileio\\Guardian.txt");
	
			Scanner input = new Scanner(System.in);
			System.out.print("\t How Many Guardian's Records Want to Show:");
	        int a=input.nextInt();
		    for(int i=0; i<a; i++){
			System.out.print("\t -----------------------------\n");
			System.out.print("\t Enter the Guardian's  NID: ");
			nid2 = input.next();
			System.out.print("\t -----------------------------\n");
			System.out.print("\t Enter the Guardian's Name: ");
			name3 = input.next();
			System.out.print("\t -----------------------------\n");
			formatter.format("%s %s\r\n",nid2,name3);
			}
			formatter.close();
	
		  }
	
			catch(Exception e){
		  System.out.println(e);
		}
	  }
			public void showAllGuardians() {       
			try {
			  File file = new File("E:\\School Managment System (4) (1)\\School Managment System (4)\\School Managment System\\Fileio\\Guardian.txt");
			  Scanner scanner = new Scanner(file);
	  
			  while(scanner.hasNext()){
				String nidRec1 = scanner.next();
				String nameRec1 = scanner.next();
				System.out.println("\t ..........................................................");
				System.out.println("\t      Guardian  NID : "+nidRec1+"                          ");
				System.out.println("\t      Guardian  Name: "+nameRec1+"                         ");
				System.out.println("\t ..........................................................");
			  }
			  scanner.close();
			} catch (Exception e) {
			  System.out.println(e);
			}
			}
}

	