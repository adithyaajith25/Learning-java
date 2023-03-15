import java.util.Scanner;
public class rev1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to be reversed-");
		int a=sc.nextInt();
		sc.close();
		int b=0;
		while(a>0){
			b+=a-((a/10)*10);
			a=a/10;
			b*=10;
		}b/=10;
		System.out.println("Reversed number="+b);
	}
}
		
		
