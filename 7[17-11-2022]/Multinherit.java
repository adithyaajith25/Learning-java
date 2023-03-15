interface First{
	void method1();
}

interface Second{
	void method2();
}

class Third implements First,Second{
	public void method1(){
		System.out.println("Method 1");
	}
	public void method2(){
		System.out.println("Method 2");
	}
}

public class Multinherit{
	public static void main(String[] args){
		Third obj=new Third();
		obj.method1();
		obj.method2();
	}
}
