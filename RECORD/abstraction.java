abstract class shape{
	abstract void  numberofsides();
}
class Rectangle extends shape{
	void numberofsides(){
		System.out.println("No of sides of a rectange is 4.");
	}
} 
class Triangle extends shape{
	void numberofsides(){
		System.out.println("No of sides of a triangle is 3.");
	}
}
class Hexagon extends shape{
	void numberofsides(){
		System.out.println("No of sides of a hexagon is 6.");
	}
}

class abstraction{
	public static void main(String[] args){
		Rectangle obj1=new Rectangle();
		Triangle obj2=new Triangle();
		Hexagon obj3=new Hexagon();
		obj1.numberofsides();
		obj2.numberofsides();
		obj3.numberofsides();
	}
}
