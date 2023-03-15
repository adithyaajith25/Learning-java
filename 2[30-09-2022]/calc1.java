import java.util.Scanner;
class calc1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers-");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.println("Enter operation symbol-");
		char s=sc.next().charAt(0);
		sc.close();
		System.out.println("\n");
		
		float c;
		switch(s){
			case '+':
				c=a+b;
				System.out.println("Sum is "+c);
				break;
			case '-':
				c=a-b;
				System.out.println("Difference is "+c);
				break;
			case '*':
				c=a*b;
				System.out.println("Product is "+c);
				break;
			case '/':
				c =a/b;
				System.out.println("Quotient is "+c);
				break;
			case '%':
				c=a%b;
				System.out.println("Reminder is "+c);
				break;
			
			default:
				System.out.println("Invalid symbol");
		}System.out.println("\n");
		
		
		
	}
}
		

