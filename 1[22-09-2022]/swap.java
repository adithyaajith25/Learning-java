import java.util.Scanner;
public class swap{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a-");
		a=sc.nextInt();
		System.out.println("Enter b-");
		b=sc.nextInt();
		System.out.println("The entered numbers are-"+a+"and"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("New swapped numbers are-"+a+"and"+b);	
		sc.close();
	}
}
