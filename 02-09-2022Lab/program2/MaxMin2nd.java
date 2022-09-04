import java.util.Scanner;

public class MaxMin2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMin2nd obj1 = new MaxMin2nd();
		obj1.secMin();
	}
	Scanner sc= new Scanner(System.in);
	int i,min=0,max,smallest=0,secondmin=0,compare=0,secMax=0,k,temp=0;
	//function for 2nd minimum value
	public void secMin() 
	{
		System.out.println("enter 5 numbers");
		int[] arr_min= new int[5];
		for(i=0;i<arr_min.length;i++)
		{
			arr_min[i]=sc.nextInt();
		}
		
		
		//shorting the array
		for(i=0;i<arr_min.length;i++)
		{
			for(k=i+1;k<arr_min.length;k++)
			{
				if(arr_min[i]>arr_min[k])
				{
					temp=arr_min[i];
					arr_min[i]=arr_min[k];
					arr_min[k]=temp;
				}
			}
			
		}
		//2nd minimum value
		System.out.println(arr_min[1]);
		
	}
	//function for 2maximum value
	public void secMax()
	{	//taking numbers from user
		System.out.println("enter 5 numbers");
		int[] arr_max= new int[5];
		for(i=0;i<arr_max.length;i++)
		{
			arr_max[i]=sc.nextInt();
		}
		//getting the max value
		int max2=0;
		for(i=0;i<arr_max.length-1;i++)
		{	
			
			if((arr_max[i]>arr_max[i+1]) && (arr_max[i]>max))
			{
				max=arr_max[i];
				
			}
			else if((arr_max[i]<arr_max[i+1]) && (arr_max[i]>max))
			{
				max=arr_max[i+1];
				
			}
			
		}
		System.out.println("the max value is "+max);
		
		//getting the 2nd max value
		
		for(i=0;i<arr_max.length-1;i++)
		{
			if((arr_max[i]>arr_max[i+1]) && (arr_max[i]<max) &&(arr_max[i]>compare))
			{
				max2=arr_max[i];
				
			}
			else if((arr_max[i]<arr_max[i+1]) && (arr_max[i+1]>max)&&(arr_max[i+1]>compare))
			{
				max2=arr_max[i+1];
				
			}
		}
		System.out.println("the 2nd maximum value is "+max2);
		
	}
	
	

}
