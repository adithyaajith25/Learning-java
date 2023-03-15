import java.util.Scanner;
public class sumd{
	public static void main(String[] args){
		System.out.println("Enter number-");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		int b=0;
		while(a>0){
			b+=a%10;
			a=a/10;
		}
		System.out.println("Sum of digits="+b);
	}
}
