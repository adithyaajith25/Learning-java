import java.util.Scanner;
class charremove{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string-");
		String n=sc.nextLine();
		System.out.println("Enter char to be removed-");
		char d=sc.next().charAt(0);
		sc.close();
		System.out.println();
		
		String new1 = "";
		for(int i=0;i<n.length();i++){
			if(n.charAt(i)!=d){
				new1+=n.charAt(i);
			}
		}
		System.out.println(new1);
		System.out.println();
	}
}
	
