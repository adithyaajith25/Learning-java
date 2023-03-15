import java.util.*;
class StringTokenizerDemo{
	public static void main(String[] args){
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integers with one space gap : ");
		String s=sc.nextLine();
		sc.close();
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()){
			String temp=st.nextToken();
			n=Integer.parseInt(temp);
			System.out.println(n);
			sum+=n;
		}
		System.out.println("Sum of integers is : "+sum);
	}
} 
