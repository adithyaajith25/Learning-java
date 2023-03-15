import java.util.Scanner;
class Box{
	double length,breadth,height;
	double vol(double length,double breadth,double height){
		return length*breadth*height;
	}
}
class Box2{
	public static void main(String args[]){
		Box b=new Box();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length,breadth and height-");
		double a=sc.nextDouble();
		double d=sc.nextDouble();
		double c=sc.nextDouble();
		System.out.println("Volume of box is "+b.vol(a,d,c));
		sc.close();
	}
}
		
