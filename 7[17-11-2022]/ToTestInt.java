import java.util.Scanner;
interface Test{
	public void square();
}

class Arithmetic implements Test{
	int a;
	Arithmetic(int a){
		this.a=a;
	}
	public void square(){
		System.out.println("Square is : "+(a*a));
		
	}
}
class ToTestInt{
	public static void main(String[] args){
		System.out.println("Enter number - ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Arithmetic obj=new Arithmetic(a);
		obj.square();
		sc.close();	
	}	
} 
