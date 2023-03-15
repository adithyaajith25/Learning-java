import java.util.Scanner;
public class fact1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number-");
		int n=sc.nextInt();
		int F=1;
		for(int i=1;i<=n;i++){
			F*=i;
		}
		System.out.println("Factorial is-"+F);
		sc.close();
	}
}
