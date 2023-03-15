import java.io.*;
class Yab{
	
	static void Methcheck(int a)throws IOException{
		if(a==-1){
			System.out.println("file ended successfully.");
		}
		else{
			throw new IOException("failed run");
		}
	}
}
public class Main1{
	public static void main(String[] args)throws IOException{
		try{
			FileReader r= new FileReader("testfile.txt");
			int i,j;
			Yab a=new Yab();
			
			while((i=r.read())!=-1){
				
				System.out.print((char)i);
				
			}
			Yab.Methcheck(i);
			r.close();
			
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally print.");
		}
	}
}
			
