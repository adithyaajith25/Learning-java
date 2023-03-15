import java.util.Scanner;
class rev1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String n=sc.nextLine();
		sc.close();
		System.out.println();
		
		for(int i=n.length()-1;i>=0;i--)
			System.out.print(n.charAt(i));
		
	System.out.println();
	}
}
	
