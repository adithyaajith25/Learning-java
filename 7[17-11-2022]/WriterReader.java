import java.util.Scanner;
import java.io.*;
class WriterReader{
	public static void main(String[] args)throws IOException{
		
		Scanner sc=new Scanner(System.in);
		FileWriter w=new FileWriter("testfile.txt");
		System.out.println("Enter string => ");
		String s=sc.nextLine();
		w.write(s);
		w.close();
		sc.close();
		
		FileReader r=new FileReader("testfile.txt");
		int i;
		while((i=r.read())!=-1){
			System.out.print((char)i);
		}
		System.out.println();
		r.close();
	}
}
