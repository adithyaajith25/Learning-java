class Display{
	public synchronized void print(int n){
		System.out.print(" "+n);
	}
	public synchronized void print(String n){
		System.out.print("\n"+n);
	}
}


class Even extends Thread{
	Display d;
	public Even(Display d){
		this.d=d;
	}
	public void run(){
		d.print("Even- ");
		for(int i=0;i<101;i+=2){
			d.print(i);
		}
	}
}

class Odd extends Thread{
	Display d;
	public Odd(Display d){
		this.d=d;
	}
	public void run(){
		d.print("Odd- ");
		for(int i=1;i<101;i+=2){
			d.print(i);
		}
	}
}

class Thread3{
	public static void main(String[] args){
		Display d=new Display();
		Even e=new Even(d);
		Odd o=new Odd(d);
		e.start();
		
		o.start();
	}
}
			
