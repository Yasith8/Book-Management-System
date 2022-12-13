package commandlineprogramming;
import java.util.Scanner;

public class CLIPrograme {
	
	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		
		//get the First Name
		System.out.println("Enter your First Name : ");
		String firstName = scn.nextLine();
		System.out.println();
		
		//Get the Last Name
                System.out.println("Enter your Last Name : ");
		String lastName = scn.nextLine();
		System.out.println();
		
		//Get the Gender
		System.out.println("Select Your Gender : Male--> Enter M OR Female--> Enter F");
		char gender = scn.next().charAt(0);
		System.out.println();
		
		//Get the Age
		System.out.println("Enter your Age : ");
		int age = scn.nextInt();
		System.out.println();
		
		//Get the Phone Number
		System.out.println("Enter your Mobile Number : ");
		Long mno = scn.nextLong();
		System.out.println();
		
		//Get the Weight
		System.out.println("Enter your Weight : ");
		double weight = scn.nextDouble();
		System.out.println();
		
		//Output All Data
	        System.out.println("Check Your Registration Details");
		System.out.println("Welcome "+firstName+" "+lastName);
		System.out.println("Your Gender is "+gender);
		System.out.println("Your Age is "+age);
		System.out.println("Your Contact Number is "+mno);
		System.out.println("Your Contact Weight is "+weight);
		
	
	}

}
