import java.util.Scanner;
class pallindrome{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string-");
		String a=sc.nextLine();
		sc.close();
		
		int flag=0;
		for(int i=0;i<(a.length()-1)/2;i++){
			if(a.charAt(i)!=a.charAt(a.length()-i-1)){
				flag=-10;
				break;
			}
		}if(flag!=0){
			System.out.println("String is not a pallindrome.\n");
		}else{
			System.out.println("String is a Pallindrome\n");
		}
	}
} 
