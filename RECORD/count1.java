import java.util.Scanner;
class count1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string-");
		String a=sc.nextLine();
		System.out.println("Enter char to check for-");
		char b=sc.next().charAt(0);
		sc.close();
		
		int count=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==b){
				count++;
			}
		}
		
		System.out.println("Frequency of occurence of char "+b+" is "+count+".\n");
	}
} 
