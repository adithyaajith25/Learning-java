import java.util.Scanner;
class fibo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms-");
		int n=sc.nextInt();
		sc.close();
		System.out.println("\n");
		
		int a=0,b=1,c;
		if(n==1)
			System.out.println("0\n");
		else if(n==2)
			System.out.println("0 1\n");
		else if(n>2){
			System.out.print(a);
			for(int i=0;i<n-1;i++){
				System.out.print(" "+b);
				c=a;
				a=b;
				b=c+b;
			}
			System.out.println("\n");
		}
		else 
			System.out.println("Entered value invalid.\n");
		
	}
}
		
































































































































































































































