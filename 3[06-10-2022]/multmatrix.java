import java.util.Scanner;
public class multmatrix{
	public static void main(String args[]){
		int m,n,o,p;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the no of rows and columns of matrix 1:");
		 m=sc.nextInt();
		 n=sc.nextInt();
		 
		  System.out.println("Enter the no of rows and columns of matrix 2:");
		 o=sc.nextInt();
		 p=sc.nextInt();
		 
		 if(n==o){											//Checking if no of rows of B = no of columns of A
		 	int [][]A=new int [m][n];
			int [][]B=new int [o][p];
			int [][]C=new int [m][p];
			
			System.out.println();							//READING MATRICES
			System.out.println("Matrix A-: ");
			for (int i=0;i<m;i++){
				for(int j=0;j<n;j++){
			 		System.out.println("Enter element "+i+" "+j+" : ");
			 		A[i][j]=sc.nextInt();
			 	}
			 }
			
			System.out.println();
			System.out.println("Matrix B-: ");
			for (int i=0;i<o;i++){
				for(int j=0;j<p;j++){
					System.out.println("Enter element "+i+" "+j+" : ");
					B[i][j]=sc.nextInt();
				}
			}
			
			for (int i=0;i<m;i++){							//Multiplication
				for(int j=0;j<p;j++){
					C[i][j]=0;
					for(int k=0;k<n;k++)
						C[i][j]+=A[i][k]*B[k][j];
				}
			}
			System.out.println();
		     System.out.println("product : ");
		     System.out.println();
			for (int i=0;i<m;i++){  							//display
				for(int j=0;j<p;j++)
					System.out.print("\t"+C[i][j]);
				System.out.println();
			}
			}
		else
			System.out.print("No of rows and column incompatible.");
		 
		 
		 sc.close();
	}
}
