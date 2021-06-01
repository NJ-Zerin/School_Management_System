import java.lang.*;
import java.util.Formatter;
import java.util.Scanner;
import Classes.*;

public class Start {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t ===###===   Login Your Account   ===###===\n");
		System.out.println("\t ---------------------------------------");
		System.out.print  ("\t  Enter Your ID     : ");
		int id = sc.nextInt();
		System.out.println("\t ---------------------------------------");
		System.out.print  ("\t  Enter Your Password: ");
		int pass = sc.nextInt();
		System.out.println("\t ---------------------------------------\n");
		if (pass >= 123) {
			System.out.print("\t ===###===   Login Successfully   ===###=== \n\n\n");

	
			System.out.println("\t\t\t\t\t  ...>>>>>>>>     Welcome    <<<<<<<<...\n\n");
			System.out.println("\t\t ======================================================================================\n");
			System.out.println("\t\t DD   D          "+"\t      GG  GG       "+"\t HH            HH  "+"\t        SS  ");
			System.out.println("\t\t D       DD      "+"\t   GG        GG    "+"\t HH            HH  "+"\t    SS      SS");
			System.out.println("\t\t D         DD    "+"\t  GG               "+"\t HH            HH  "+"\t   SS");
			System.out.println("\t\t D          DD   "+"\t GG                "+"\t HH============HH  "+"\t     SS");
			System.out.println("\t\t D          DD   "+"\t GG                "+"\t HHHHHHHHHHHHHHHH  "+"\t        SS");
			System.out.println("\t\t D          DD   "+"\t GG                "+"\t HH============HH  "+"\t           SS");
			System.out.println("\t\t D         DD    "+"\t  GG   G GG  GG    "+"\t HH            HH  "+"\t            SS");
			System.out.println("\t\t D       DD      "+"\t    GG      GG     "+"\t HH            HH  "+"\t    SS     SS");
			System.out.println("\t\t DD   D          "+"\t         GG        "+"\t HH            HH  "+"\t       SS\n");
			System.out.println("\t\t ======================================================================================\n");
			
			School sh = new School();

			int BDT = 100000;
			double A = 0;
			double B = 0;
			try {
				boolean repeat = true;
				while (repeat) {
					System.out.println("\t What do you want to do?\n");
					System.out.println("\t********************************");
					System.out.println("\t* 1.Student Management         *");
					System.out.println("\t* 2.Teacher Management         *");
					System.out.println("\t* 3.Gurdian Management         *");
					System.out.println("\t* 4.IT_Oparetor Management     *");
					System.out.println("\t* 5.Account Transactions       *");
					System.out.println("\t* 6.All Records                *");
					System.out.println("\t* 7.Exit                       *");
					System.out.println("\t********************************");

					System.out.print("\t Enter Your Choice: ");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						boolean repeater = true;

						while (repeater) {
							System.out.println("\t You Choose Student Management.\n");
							System.out.println("\t You have following options:");
							System.out.println("\t**********************************");
							System.out.println("\t*1. Insert New Students          *");
							System.out.println("\t*2. Remove Existing Student      *");
							System.out.println("\t*3. Search A Student             *");
							System.out.println("\t*4. Show All Students            *");
							System.out.println("\t*5. Deposit School Fees          *");
							System.out.println("\t*6. Show Tarnsaction History     *");
							System.out.println("\t*7. Go Back                      *");
							System.out.println("\t**********************************");

							System.out.print("\t Enter You Option:");
							int option1 = sc.nextInt();

							switch (option1) {
							case 1:

								System.out.println("\t You Choose to Insert Student's Records\n");
								System.out.print  ("\t Insert Number Of Students:");
								int a=sc.nextInt();
								for(int i=0; i<a; i++){
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Student ID: ");
								int id1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Student Name: ");
								String name1 = sc.next();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Student CGPA: ");
								double cgpa1 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");

								Student s1 = new Student();
								s1.setId(id1);
								s1.setName(name1);
								s1.setCgpa(cgpa1);

								if (sh.insertStudent(s1)) {
									System.out.println("\t ---------------------------------------");
									System.out.println("\t Student Inserted with ID: " + s1.getId());
									System.out.println("\t ---------------------------------------");
								} else {
									System.out.println("\t ...>>> Student Can Not be Insertd <<<...");
								}
							}
								break;

							case 2:
								System.out.println("\t You Choose to Remove A Student");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter a Student ID to Remove: ");
								int Id2 = sc.nextInt();
								System.out.println("\t ---------------------------------------");

								Student s2 = sh.searchStudent(Id2);

								if (s2 != null){
									if (sh.removeStudent(s2)) {
										System.out.println("\t ---------------------------------------");
										System.out.println("\t Student Removed with ID: " + s2.getId());
										System.out.println("\t ---------------------------------------");
									} else {
										System.out.println("\t ...>>> Student Can Not be Remove <<<...\n");
									}
								} 
								else {
									System.out.println("\t ...>>> Student Does Not Exist <<<...");
								}
								break;

							case 3:
								System.out.println("\t You Choose to Search A Student");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter a Student ID to Search: ");
								int Id3 = sc.nextInt();
								System.out.println("\t ---------------------------------------");

								Student s3 = sh.searchStudent(Id3);

								if (s3 != null) {
									System.out.println("\t Student Found:");
									System.out.println("\t ------------------------------------------");
									System.out.println("\t Student ID  : " +  s3.getId());
									System.out.println("\t Student Name: " + s3.getName());
									System.out.println("\t Student Cgpa: " + s3.getCgpa());
									System.out.println("\t ------------------------------------------");
								} else {
									System.out.println("\t ...>>> Student Does Not Found <<<...");
								}

								break;
							case 4:

								System.out.println("\t You Choose to See All Students\n");
								sh.showStudentInfo();
								sh.myshow();
			                    sh.showAllStudents();

								break;
							case 5:
								System.out.println("\t You Choose to Deposit School Fees");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter The School Fees to Deposit: ");
								double BDT1 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");
								BDT += BDT1;
								A += BDT1;
								System.out.println("\t ---------------------------------------");
								System.out.println("\t Deposit The School Fees:"+BDT1+"TK");
								System.out.println("\t ---------------------------------------");
								
								break;

							case 6:
								System.out.println("\t You Choose See Transaction History");
								System.out.println("\t ------------------------------------------");
								System.out.println("\t Deposit The School Fees           :"+A+"TK");
								System.out.println("\t The Total Amount of School Fees is:"+BDT+"TK");
								System.out.println("\t ------------------------------------------");
								
					

							case 7:

								System.out.println("\t ....>>> You Choose to Go Back <<<<...");
								repeater = false;
								break;

							default:

								System.out.println("\t ...>>> Invalid Choice <<<...\n");
								break;

							}

						}
						break;

					case 2:
						boolean repeater1 = true;

						while (repeater1) {

							System.out.println("\t You Choose Teacher  Management\n");
							System.out.println("\t You have following options:\n");
							System.out.println("\t**********************************");
							System.out.println("\t*1. Insert New Teachers          *");
							System.out.println("\t*2. Remove Existing Teacher      *");
							System.out.println("\t*3. Search A Teacher             *");
							System.out.println("\t*4. Show All Teachers            *");
							System.out.println("\t*5. Deposit The Salary           *");
							System.out.println("\t*6. Withdraw The Salary          *");
							System.out.println("\t*7. Show Tarnsaction History     *");
							System.out.println("\t*8. Go Back                      *");
							System.out.println("\t**********************************");

							System.out.print("\t Enter You Option:");
							int option2 = sc.nextInt();

							switch (option2) {
							case 1:
								System.out.println("\t You Choose to Insert Teacher's Records\n");
								System.out.print("\t Insert Number Of Teachers:");
								int a=sc.nextInt();
								for(int i=0; i<a; i++){
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter Teacher ID: ");
								int id1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter Teacher Name: ");
								String name1 = sc.next();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter Teacher Salary: ");
								int salary1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");

								Student t1 = new Student();
								t1.setId(id1);
								t1.setName(name1);
								t1.setSalary(salary1);

								if (sh.insertTeacher(t1)) {
									System.out.println("\t ---------------------------------------");
									System.out.println("\t Teacher Inserted with ID: " + t1.getId());
									System.out.println("\t ---------------------------------------");
									
								} else {
									System.out.println("\t ...>>> Teacher can not be inserted <<<... \n\n");
								}
							}
								break;

							case 2:
								System.out.println("\t You Choose to Remove Existing Teacher");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Teacher ID to Remove: ");
								int id2 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								Teacher t2 = sh.searchTeacher(id2);

								if (t2 != null) {
									if (sh.removeTeacher(t2)) {
										System.out.println("\t ---------------------------------------");
										System.out.println("\t Teacher Removed with ID: " + t2.getId());
										System.out.println("\t ---------------------------------------");
										
									} else {
										System.out.println("\t ...>>> Teacher Can Not be Removed <<<...");
									}
								} else {
									System.out.println("\t ...>>> Teacher Does Not Exist <<<... ");
								}

								break;

							case 3:
								System.out.println("\t You Choose to Search a Teacher");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Teacher ID to search: ");
								int id3 = sc.nextInt();
								System.out.println("\t ---------------------------------------");

								Teacher t3 = sh.searchTeacher(id3);

								if (t3 != null) {
									System.out.println("\t Teacher Found:");
									System.out.println("\t ------------------------------------------");
									System.out.println("\t Teacher's ID    : " + t3.getId());
									System.out.println("\t Teacher's Name  : " + t3.getName());
									System.out.println("\t Teacher's Salary: " + t3.getSalary());
									System.out.println("\t ------------------------------------------");
									
								} else {
									System.out.println("\t ...>>> Teacher Does Not Found <<<...\n");
								}

								break;
							case 4:

								System.out.println("\t You choose to see All Teachers");

								sh.showTeacherInfo();
								sh.show();
			                    sh.showAllTeachers();
								break;
							case 5:
								System.out.println("\t You Choose to Deposit Salary");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter The Teacher's Salary to Deposit: ");
								double BDT1 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");
								BDT += BDT1;
								A += BDT1;
								System.out.println("\t ---------------------------------------");
								System.out.println("\t Teacher's Deposit Salary is:"+BDT1+"TK");
								System.out.println("\t ---------------------------------------");	
								break;
							case 6:
								System.out.println("\t You Choose to Withdraw Salary");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Teacher's Salary to Withdraw:");
								double BDT2 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");
								if (BDT < BDT2) {
									System.out.println("\t Not enough Salary.\n");
								} else {
									BDT -= BDT2;
									B += BDT2;
									System.out.println("\t ---------------------------------------");
									System.out.println("\t Teacher's Withdrowal Salary is:"+BDT2+"TK");
									System.out.println("\t ---------------------------------------");
								}
								break;

							case 7:
								System.out.println("\t You Choose See Transaction History");
								System.out.println("\t ------------------------------------------");
								System.out.println("\t Deposit Salary is    : " +A+"TK");
								System.out.println("\t Withdrawal Salary is : " +B+"TK");
								System.out.println("\t Current Salary is    : " +BDT+"Tk");
								System.out.println("\t ------------------------------------------");
							break;

							case 8:

								System.out.println("\t ...>>> You choice to Go back <<<...\n ");
								repeater1 = false;
								break;

							default:
								System.out.println("\t ...>>> Invalid Option <<<...");
								break;
							}
						}
						break;

					case 3:
						boolean repeater2 = true;

						while (repeater2) {

							System.out.println("\t You Choose Guardian  Management\n");
							System.out.println("\t You have following options:");
							System.out.println("\t**********************************");
							System.out.println("\t*1. Insert New Guardians         *");
							System.out.println("\t*2. Remove Existing Guardian     *");
							System.out.println("\t*3. Search A Guardian            *");
							System.out.println("\t*4. Show All Guardians           *");
							System.out.println("\t*5. Go Back                      *");
							System.out.println("\t**********************************");

							System.out.print("\t Enter You Option:");
							int option3 = sc.nextInt();

							switch (option3) {
							case 1:

								System.out.println("\t You Choose to Insert Guardian's Records\n");
								System.out.print("\t Insert Number Of Guardians:");
								int a=sc.nextInt();
								for(int i=0; i<a; i++){
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Guardian's NID: ");
								int nid1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Guardian's Name: ");
								String name1 = sc.next();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Guardian's Phone_Number:");
								int phone_number1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								
								

								Guardian g1 = new Guardian();
								g1.setNid(nid1);
								g1.setName(name1);
								g1.setPhone_number(phone_number1);

								if (sh.insertGuardian(g1)) {
									System.out.println("\t ---------------------------------------");
									System.out.println("\t Guardian Inserted with NID:" + g1.getNid());
									System.out.println("\t ---------------------------------------");
									
								} else {
									System.out.println("\t ...>>> Guardian can not be inserted <<<... \n");
								}
							}
								break;

							case 2:
								System.out.println("\t You Choose to Remove Existing Guardian");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the NID to Guardian Remove: ");
								int nid2 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								

								Guardian g2 = sh.searchGuardian(nid2);

								if (g2 != null) {
									if (sh.removeGuardian(g2)) {
										System.out.println("\t ---------------------------------------");
										System.out.println("\t Guardian Removed with NID:"+g2.getNid());
										System.out.println("\t ---------------------------------------");
										
									} else {
										System.out.println("\t ...>>> Guardian Can Not be Removed <<<...");
									}
								} else {
									System.out.println("\t ...>>> Guardian Does Not Exist <<<... ");
								}

								break;

							case 3:
								System.out.println("\t You Choose to Search a Guardian");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Guardian's NID: ");
								int nid3 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								
								
								Guardian g3 = sh.searchGuardian(nid3);

								if (g3 != null) {
									
									System.out.println("\t Guardian Found:");
									System.out.println("\t ------------------------------------------");
									System.out.println("\t Guardian's NID         :" +g3.getNid());
									System.out.println("\t Guardian's Name        :" +g3.getName());
									System.out.println("\t Guardian's Phone_Number:"+g3.getPhone_number());
									System.out.println("\t ------------------------------------------");
									
								} else {
									System.out.println("\t ...>>> Guardian Does Not Found <<<...\n");
								}

								break;

							case 4:

								System.out.print("\t You choose to see All Guardians\n");

								sh.showGuardianInfo();
								sh.showDetails();
								sh.showAllGuardians();

								break;

							case 5:

								System.out.println("\t ...>>> You Choice to Go back <<<...\n ");
								repeater2 = false;
								break;

							default:
								System.out.println("\t ...>>> Invalid Option <<<...");
								break;
							}
						}
						break;

					case 4:
						boolean repeater3 = true;

						while (repeater3) {

							System.out.println("\t You Choose IT_Oparetor Management\n");
							System.out.println("\t You have following options:");
							System.out.println("\t**********************************");
							System.out.println("\t*1. Insert New IT_Oparetors      *");
							System.out.println("\t*2. Remove Existing IT_Oparetor  *");
							System.out.println("\t*3. Search IT_Oparetor           *");
							System.out.println("\t*4. Show All IT_Oparetors        *");
							System.out.println("\t*5. Deposit Salary               *");
							System.out.println("\t*6. Withdraw Salary              *");
							System.out.println("\t*7. Show Tarnsaction History     *");
							System.out.println("\t*8. Go Back                      *");
							System.out.println("\t**********************************");

							System.out.print("\t Enter You Option:");
							int option4 = sc.nextInt();

							switch (option4) {
							case 1:

								System.out.println("\t You Choose to Insert  IT_Oparetor's Records\n");
								System.out.print  ("\t Insert Number Of ITOparetors:");
								int a=sc.nextInt();
								for(int i=0; i<a; i++){
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter IT_Oparetor's NID: ");
								int id1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter IT_Oparetor's Name: ");
								String name1 = sc.next();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter IT_Oparetor's Salary:");
								int salary1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter IT_Oparetor's Expariance:");
								int expariance1 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								

								ITOparetor io1 = new ITOparetor();
								io1.setId(id1);
								io1.setName(name1);
								io1.setSalary(salary1);
								io1.setExpariance(expariance1);

								if (sh.insertITOparetor(io1)) {
									System.out.println("\t ---------------------------------------");
									System.out.println("\t IT_Oparetor's Inserted with NID:"+ io1.getId());
									System.out.println("\t ---------------------------------------");
									
								} else {
									System.out.println("\t ...>>> IT_Oparetor can not be inserted <<<...\n");
								}
							}
								break;

							case 2:
								System.out.println("\t You Choose to Remove Existing IT_Oparetor");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter The ID of IT_Oparetor Remove:");
								int id2 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								

								ITOparetor io2 = sh.searchITOparetor(id2);

								if (io2 != null) {
									if (sh.removeITOparetor(io2)) {
										System.out.println("\t ---------------------------------------");
										System.out.println("\t IT_Oparetor Removed with ID:"+ io2.getId());
										System.out.println("\t ---------------------------------------");
										
									} else {
										System.out.println("\t ...>>> IT_Oparetor Can Not be Removed <<<...");
									}
								} else {
									System.out.println("\t ...>>> IT_Oparetor Does Not Exist <<<... ");
								}
							
								break;

							case 3:
								System.out.println("\t You Choose to Search an IT_Oparetor");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the IT_Oparetor's ID: ");
								int id3 = sc.nextInt();
								System.out.println("\t ---------------------------------------");
								
								

								ITOparetor io3 = sh.searchITOparetor(id3);

								if (io3 != null){
									System.out.println("\t IT_Oparetor Found:");
									System.out.println("\t ------------------------------------------");
									System.out.println("\t IT_Oparetor's ID        :"+ io3.getId());
									System.out.println("\t IT_Oparetor's Name      :"+ io3.getName());
									System.out.println("\t IT_Oparetor's Salary    :"+ io3.getSalary());
									System.out.println("\t IT_Oparetor's Expariance:"+ io3.getExpariance());
									System.out.println("\t ------------------------------------------");
									
								} else {
									System.out.println("\t ...>>> IT_Oparetor  Does Not Found <<<...\n");
								}

								break;
							case 4:

								System.out.println("\t You choose to see All IT_Oparetors\n");

								sh.showITOparetorInfo();

								break;

							case 5:
								System.out.println("\t You Choose to Deposit Salary");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Salary to Deposit: ");
								double BDT1 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");
								
								BDT += BDT1;
								A += BDT1;
								System.out.println("\t ---------------------------------------");
								System.out.println("\t ITOparetor's Deposit Salary is:"+BDT1+"TK");
								System.out.println("\t ---------------------------------------");
									
							
								break;
							case 6:
								System.out.println("\t You Choose to Withdraw  The Salary");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Salary to Withdraw:");
								double BDT2 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");
								

								if (BDT < BDT2) {
									System.out.println("\t Not enough Salary.\n");
								} else {
									BDT -= BDT2;
									B += BDT2;
									System.out.println("\t ---------------------------------------");
									System.out.println("\t ITOparetor's Withdrowal Salary is:"+BDT2+"TK");
									System.out.println("\t ---------------------------------------");
									
								}
								break;
							case 7:
								System.out.println("\t You Choose See Transaction History");
								System.out.println("\t ------------------------------------------");
								System.out.println("\t Deposit Salary is     : " + A +"TK");
								System.out.println("\t Withdrawal Salary is  : " + B +"TK");
								System.out.println("\t Current Salary is     : " + BDT+"TK");
								System.out.println("\t ------------------------------------------");
								

								break;
							case 8:

								System.out.println("\t ...>> You choice to Go back <<<...\n ");
								repeater3 = false;
								break;

							default:
								System.out.println("\t ...>>> Invalid Option <<<...");
								break;
							}
						}
						break;
					case 5:

						System.out.println("\t You Choose Account-Transactions\n");
						boolean repeater4 = true;
						while (repeater4) {

							System.out.println("\tYou have following options:");
							System.out.println("\t***********************************");
							System.out.println("\t*1. Deposit Annual Fund           *");
							System.out.println("\t*2. Withdraw Fund for Some Reasons*");
							System.out.println("\t*3. Show Tarnsaction History      *");
							System.out.println("\t*4. Go Back                       *");
							System.out.println("\t***********************************");

							System.out.print("\t Enter You Option:");
							int option5 = sc.nextInt();

							switch (option5) {
							case 1:
								System.out.println("\t You Choose to Deposit Annual Fund");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Annul Fund to Deposit: ");
								double BDT1 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");
								BDT += BDT1;
								A += BDT1;
								System.out.println("\t ---------------------------------------");
								System.out.println("\t Deposit The Annul Fund :"+BDT1+"TK");
								System.out.println("\t ---------------------------------------");
								break;

							case 2:
								System.out.println("\t You Choose to Withdrawal Fund");
								System.out.println("\t ---------------------------------------");
								System.out.print  ("\t Enter the Fund to Withdraw: ");
								double BDT2 = sc.nextDouble();
								System.out.println("\t ---------------------------------------");
								

								if (BDT < BDT2) {
									System.out.print("\t Not enough Fund.\n");
								} else {
									BDT -= BDT2;
									B += BDT2;
									System.out.println("\t ---------------------------------------");
									System.out.println("\t Withdrawal Fund :" +BDT2+"TK");
									System.out.println("\t ---------------------------------------");
								}
								break;

							case 3:
								System.out.println("\t You Choose See Transaction History");
								System.out.println("\t ------------------------------------------");
								System.out.println("\t Deposit Annul Fund   : " + A + "TK");
								System.out.println("\t Withdrawal Fund      : " + B + "TK");
								System.out.println("\t Remaining Fund       : " + BDT+"TK");
								System.out.println("\t ------------------------------------------");
								

								break;

							case 4:

								System.out.println("\t ...>>> You Choose to Go Back <<<...");
								repeater4 = false;
								break;

							default:

								System.out.println("\t ...>>> Invalid Option <<<...");

								break;
							}

						}

						break;
					case 6:
						boolean repeater5 = true;

						while (repeater5) {
							System.out.println("\t Your Choose See All Records \n");
							System.out.println("\t********************************");
							System.out.println("\t* 1.Students All Details       *");
							System.out.println("\t* 2.Teacher  All Details       *");
							System.out.println("\t* 3.Gurdian All Details        *");
							System.out.println("\t* 4.IT_Oparetor All Details    *");
							System.out.println("\t* 5.Exit                       *");
							System.out.println("\t********************************");
							System.out.print("\t Enter You Option:");
							int option5 = sc.nextInt();
							switch (option5) {
							case 1:
								sh.showStudentInfo();
								
								break;
							case 2:
								
								sh.showTeacherInfo();
								
								break;
							case 3:
								
								sh.showGuardianInfo();
								
								break;
							case 4:
								sh.showITOparetorInfo();
								break;
							case 5:

								System.out.println("\t ...>>> You choice to Go back <<<...\n ");
								repeater5 = false;
								break;
							default:

								System.out.println("\t ...>>> Invalid Choice <<<...\n");
								break;
							}
							
						}
						break;
					case 7:

						System.out.println("\t\t\t\t\t  ...>>>>>>   THANK YOU   <<<<<<...\n\n");

						repeat = false;
						break;

					default:

						System.out.println("\t ...>>> Invalid Choice <<<...\n");
						break;
					}
				}
			} catch (Exception a) {
				System.out.println(a);
			}
		} else {
			System.out.println("\t ....>>> Your Password is Incorrect <<<....\n");
		}
	}
}