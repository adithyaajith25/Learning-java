import java.util.Scanner;
class StringEntry{
	public void disp(String...A){				//varargs
		for(String i:A){
			System.out.print(i+" ");
		}

	}
}
class Input extends StringEntry{
	public static void main(String[] args){
		StringEntry obj=new StringEntry();
		for(int i=0;i<args.length;i++)
			obj.disp(args[i]);				//cmd line
	}
}
		
