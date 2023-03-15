import java.util.Scanner;
class Box{
	double length,breadth,height;
	Box(double length,double breadth,double height){
		this.length=length; this.breadth=breadth; this.height=height;
	}
	double vol(){
		return length*breadth*height;
	}
}
class Box4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length,breadth and height-");
		double a=sc.nextDouble();
		double d=sc.nextDouble();
		double c=sc.nextDouble();
		Box b=new Box(a,d,c);
		sc.close();
		System.out.println("Volume of box is "+b.vol());
	}
}
		
