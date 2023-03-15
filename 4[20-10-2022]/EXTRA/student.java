
class class1{
	int rollno;
	String name;
	class1(int rollno, String name){
		this.rollno=rollno;	this.name=name;
	}
	void display(){
		System.out.println(rollno+" "+name);
	}
}
class student{
	public static void main(String args[]){
		class1 s1=new class1(123,"Abc");
		class1 s2=new class1(124,"Xyz");
		s1.display();
		s2.display();
	}
}
		
