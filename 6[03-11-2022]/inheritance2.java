class Employee{
	void display(){
		System.out.println("The class is Employee.\n");
	}
	void calcsalary(){
		System.out.println("Salary of Employee is 10,000");
	}
}
class Engineer extends Employee{
	void display(){
		System.out.println("The class is Engineer.\n");
	}
	void calcsalary(){
		System.out.println("Salary of Engineer is 20,000");
	}
}
class inheritance2{
	public static void main(String[] args){
		Employee obj=new Engineer();
		obj.display();
		obj.calcsalary();
	}
}


