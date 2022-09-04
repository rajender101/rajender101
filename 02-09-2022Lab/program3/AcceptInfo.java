import java.io.*;
import java.util.Scanner;

public class AcceptInfo {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AcceptInfo obj2 = new AcceptInfo();
		obj2.create_file();

	}

	public void create_file() throws IOException
	{
		int count=1;
		String fileName="C:\\Users\\rajen\\eclipse-workspace\\02-09-2022\\src"+"file1"+count+".txt";
		File obj1 = new File(fileName);
		FileWriter write = new FileWriter(obj1);
		BufferedWriter buffWrite = new BufferedWriter(write);
		String myName;
		
		System.out.println("if you want to create a file press 1");
		int createFileConfirmation=sc.nextInt();
		if(createFileConfirmation==1)
		{
			obj1.createNewFile();
			System.out.println("Enter your name");
			myName = sc.nextLine();
			System.out.println(myName);
			buffWrite.write(myName);
			buffWrite.close();
		}
		else {
			System.out.println("incorrect answer try again");
		}
				
		
	}

}
