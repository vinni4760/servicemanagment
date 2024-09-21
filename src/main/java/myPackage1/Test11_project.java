package myPackage1;
import java.util.Scanner;

public class Test11_project {
 public static void main(String[] args) {
	 
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter user name");
	String s1 = scn.nextLine();
	if (s1.isBlank()==true) {
		System.out.println("Enter user name");
	}
	else {
		System.out.println("welcome to nareshIt");
	}
   
    System.out.println("`No of characters :"+s1.length());
    
    System.out.println("enter password");
    
    String password = scn.nextLine();
    if (password.length()>7 && password.length()<=16) {
    	System.out.println("password is :/s"+password);
	}
    else 
    	System.out.println("password must be in between 8 to 16");
 
     System.out.println("Enter mobile Number:");
     String Mno = scn.nextLine();
     if (Mno.length()<10) {
    	 System.out.println("Mobile number must have ten digits");
		
	}
     else 
    	 System.out.println("mobile number is :"+Mno);
  }
}
