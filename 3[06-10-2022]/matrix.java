import java.util.Scanner;
public class matrix{
	public static void main(String args[]){
		 Scanner sc= new Scanner(System.in);
		 int [][]A=new int [3][3];
		 for (int i=0;i<3;i++){
		 	for(int j=0;j<3;j++){
		 		System.out.println("Enter element "+i+" "+j+" : ");
		 		A[i][j]=sc.nextInt();
		 	}
		 }
		  for (int i=0;i<3;i++){
		 	for(int j=0;j<3;j++)
		 		System.out.print("\t"+A[i][j]);
		 	System.out.println();
		 }
		 sc.close();
	}
}
