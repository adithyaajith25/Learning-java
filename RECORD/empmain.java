import java.util.Scanner;
class Employee{
	String name;
	int age;
	String phone;
	String address;
	String salary;
	void printsalary(){
		System.out.println("Salary is "+salary);
	}
	Employee(String name,int age,String phone,String address,String salary){
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
	}
	void dispemployee(){
		System.out.println("Name is "+name+"\nAge is "+age+"\nPhone number is "+phone+"\nAddress is "+address+"\nSalary is "+salary);
	}
}
class manager extends Employee{
	String specialization,department;
	manager(String name,int age,String phone,String address,String salary,String specialization,String department){
		super(name,age,phone,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	void dispmanager(){
		dispemployee();
		System.out.println("specialization - "+specialization+"\nDepartment - "+department);
	}
}

class officer extends Employee{
	String specialization,department;
	officer(String name,int age,String phone,String address,String salary,String specialization,String department){
		super(name,age,phone,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	void dispofficer(){
		dispemployee();
		System.out.println("specialization - "+specialization+"\nDepartment - "+department);
	}
}

class empmain{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter manager details");
													//MANAGER
		System.out.println("Enter Name-");
		String name=sc.nextLine();
		System.out.println("Enter Age-");
		int age=sc.nextInt(); sc.nextLine();
		System.out.println("Enter Phone number-");
		String phone=sc.nextLine();
		System.out.println("Enter Address-");
		String address=sc.nextLine();
		System.out.println("Enter Salary-");
		String salary=sc.nextLine();
		System.out.println("Enter specialization-");
		String specialization=sc.nextLine();
		System.out.println("Enter Department-");
		String department=sc.nextLine();
		manager obj=new manager(name,age,phone,address,salary,specialization,department);
		
		
		
		System.out.println("\n\nEnter officer details");
													//officer
		System.out.println("Enter Name-");
		name=sc.nextLine();
		System.out.println("Enter Age-");
		age=sc.nextInt(); sc.nextLine();
		System.out.println("Enter Phone number-");
		phone=sc.nextLine();
		System.out.println("Enter Address-");
		address=sc.nextLine();
		System.out.println("Enter Salary-");
		salary=sc.nextLine();
		System.out.println("Enter specialization-");
		specialization=sc.nextLine();
		System.out.println("Enter Department-");
		department=sc.nextLine();
		officer obj2=new officer(name,age,phone,address,salary,specialization,department);
												//METHOD CALL
		System.out.println("\nManager details-");
		obj.dispmanager();
		System.out.println("\nOfficer details-");
		obj2.dispofficer();
		
		sc.close();
	}
}
		
