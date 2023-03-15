import java.util.Scanner;
public class oddoreven{
	public static void main(String[] args){
		System.out.println("Enter number-");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		if(a==0)
			System.out.println("Neither even nor odd.");
		else if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
