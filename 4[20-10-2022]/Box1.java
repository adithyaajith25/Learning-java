import java.util.Scanner;
class Box{
	double length,breadth,height;
	double vol(){
		return length*breadth*height;
	}
}
class Box1{
	public static void main(String args[]){
		Box b=new Box();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length,breadth and height-");
		b.length=sc.nextDouble();
		b.breadth=sc.nextDouble();
		b.height=sc.nextDouble();
		System.out.println("Volume of box is "+b.vol());
		sc.close();
	}
}
		
