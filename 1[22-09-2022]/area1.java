import java.util.Scanner;
public class area1{
	public static void main(String[] args){
		float a,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius-");
		r=sc.nextInt();
		a=(float)3.14*r*r;
		System.out.println("Area-"+a);
		sc.close();
	}

}
		
