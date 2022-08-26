import java.io.*;
import java.util.Scanner;

public class MultipleFileCreationByUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 MultipleFileCreationByUser run = new  MultipleFileCreationByUser();
//		 run.createFile();
		 run.writeInFile();

	}
	Scanner sc = new Scanner(System.in);
	public void createFile() throws IOException
	{
		int count = 0;
		String sCount;
		String fileName;
		boolean exitcounter= true;
		
		System.out.println("hello");
		do
		{
			System.out.println("if you want to create a file press '1' if not then press '2' ");
			int input= sc.nextInt();
			
			if(input ==1)
			{
				count++;
				sCount = String.valueOf(count);
				fileName ="file"+sCount+".txt";
				File newfile = new File(fileName);
				newfile.createNewFile();
				exitcounter = false;
			}
			else
			{
				break;
			}
		}while(exitcounter= true);
	}
	
	public void writeInFile() throws IOException
	{
		System.out.println("enter the file name you want to write in");
		String filename= sc.nextLine();
		FileWriter writefile = new FileWriter(filename);
		System.out.println("enter information you want to store in the file "+filename);
		String inputinfo=sc.nextLine();
		writefile.append(inputinfo);
		writefile.close();
	}
	
	

}
