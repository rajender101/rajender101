import java.io.*;
import java.util.Scanner;

public class FD_Information {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FD_Information run = new FD_Information();
		run.writeFile();

	}

	
	public void writeFile() throws IOException
	{	File newfile = new File("file2.txt");
		newfile.createNewFile();
		FileWriter filewrite = new FileWriter(newfile);
		
		String name, bankName,typeOfAcc;
		long PhNo, accNo,FDAmt;
		int duration,interest = 6;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		name= sc.nextLine();
		System.out.println("Enter your Bank Name");
		bankName =sc.nextLine();		
		System.out.println("Enter Type of Account");
		typeOfAcc = sc.nextLine();
		System.out.println("Enter your Phone Number");
		PhNo = sc.nextLong();
		System.out.println("Enter your Account Number");
		accNo = sc.nextLong();
		System.out.println("Enter Amount for FD");
		FDAmt= sc.nextLong();
		System.out.println("Enter The duraction for FD");
		duration = sc.nextInt();
		//int to string
		String sduration= String.valueOf(duration);
		String sPhNo= String.valueOf(PhNo);
		String sAccNo = String.valueOf(accNo);
		String sFDAmt= String.valueOf(FDAmt);
		String sInterest = String.valueOf(interest);
		
		int finalAmount =  (int) (FDAmt + ((FDAmt * interest*duration)/(100*12)));
		System.out.println("The Final Amount is "+finalAmount);
		String sfinalAmount = String.valueOf(finalAmount);
		BufferedWriter  obj1 = new BufferedWriter(filewrite);
		obj1.write(" name is = "+name+" Bank name is = "+bankName+" Type of account is = "+typeOfAcc+" Duration is in month = "+sduration+" Phone number is = "+sPhNo+" Account number is = "+sAccNo+" FD Amount is = "+sFDAmt+" interest rate is = "+sInterest);
		obj1.close();
		
	}

}
