import java.util.*;
class Matrixfunc{
	Scanner sc=new Scanner(System.in);
	int A[][]=new int[10][10];
	int n,m;
	void readm(int n,int m){
		this.n=n; this.m=m;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.println("Enter element "+(i+1)+" "+(j+1)+" => ");
				int a=sc.nextInt();
				A[i][j]=a;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(A[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
	void rowsum(){
		for(int i=0;i<n;i++){
			int sum=0;
			 for(int j=0;j<m;j++){
			 	sum+=A[i][j];
			 }
			 System.out.println("Sum of row "+(i+1)+" is "+ sum);
		}
	}
	void columnsum(){
		for(int i=0;i<m;i++){
			int sum=0;
			 for(int j=0;j<n;j++){
			 	sum+=A[j][i];
			 }
			 System.out.println("Sum of column "+(i+1)+" is "+ sum);
		}
	}
	

}				 	
			
			
public class Matrix{
	public static void main(String args[]){
		
		int n,m;
		System.out.println("Enter no of rows and columns=>");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		Matrixfunc obj=new Matrixfunc();
		obj.readm(x,y);
		obj.rowsum();
		obj.columnsum();
		sc.close();
	}
}
		
		
