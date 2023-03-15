import java.io.*;
class Except{
	public static void main(String[] args){
		try{
			FileReader r=new FileReader("testfile.txt");
			FileWriter w=new FileWriter("copytestfile.txt");
			
			int i;
			while((i=r.read())!=-1){
				w.write(i);
			}
			r.close();
			w.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
}
