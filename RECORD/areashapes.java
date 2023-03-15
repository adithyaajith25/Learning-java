import java.util.Scanner;
class Box{
	double vol(double a,double b,double c){			//triangle
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	double vol(double a,double b){			//rectangle
		return a*b;
	}
	
	double vol(double a){				//circle
		return 3.1415*a*a;
	}
}

class volumeshapes{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Box B=new Box();
		System.out.println("Enter\n1 for triangle.\n2 for rectangle.\n3 for circle.");
		int n=sc.nextInt();
		if (n==1){
			System.out.println("Enter 3 sides-");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			System.out.println("Area of triangle is "+B.vol(a,b,c));
		}else if (n==2){
			System.out.println("Enter 2 sides-");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println("Area of rectangle is "+B.vol(a,b));
		}else if (n==3){
			System.out.println("Enter Radius-");
			double a=sc.nextDouble();
			System.out.println("Area of triangle is "+B.vol(a));
		}else
			System.out.println("Entered incorrect option");
		sc.close();
		
	}
}
		
