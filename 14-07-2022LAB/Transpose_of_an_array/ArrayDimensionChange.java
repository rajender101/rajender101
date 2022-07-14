import java.util.*;
public class ArrayDimensionChange {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDimensionChange obj = new ArrayDimensionChange();
		obj.Myarray();
	}
	int num_col, num_row;
	Scanner sc = new Scanner(System.in);
	
	
	
	public void Myarray() {
		System.out.println("enter the size of colum");
		num_col = sc.nextInt();
		System.out.println("enter the size of row");
		num_row = sc.nextInt();
		int myarray[][]= new int[num_row][num_col];
		int transpose[][] = new int[num_row][num_col];
		System.out.println("enter"+num_col*num_row+" numbers");
		for(int i =0;i<num_row;i++) 
		{
				for(int j =0;j<num_col;j++)
				{
					myarray[i][j]= sc.nextInt();
				}
		}
		System.out.println("the value you have entered are");
		for(int i = 0;i<num_row;i++) 
		{
			for(int j =0;j<num_col;j++)
			{
				System.out.print(myarray[i][j]+" ");
			}
			System.out.println();
		}
		//transposing matrix
		for(int i=0;i<num_row;i++)
		{
			for(int j=0;j<num_col;j++)
			{
				transpose[i][j]=myarray[j][i];
			}
		}
		//printing new matrix
		System.out.println("the row and column has been exchanged");
		for(int i=0;i<num_row;i++)
		{
		for(int j=0;j<num_col;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
		System.out.println();
		}
	}
	

}
