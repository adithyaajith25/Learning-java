import java.io.*;
class Gg{
	void method1(int a) throws ArithmeticException{
		if(a<19){
			throw new ArithmeticException("\n <19\n");
		}
		else{
			System.out.println("success");
		}
	}
}

class Main1{
	public static void main(String[] args){
		int a=17;
		try{
			Gg obj=new Gg();
			obj.method1(a);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}
		
		
	 
