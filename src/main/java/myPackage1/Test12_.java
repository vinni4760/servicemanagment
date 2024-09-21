package myPackage1;
import java.util.Scanner;
public class Test12_ {
   public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter mobile number");
	long l = scn.nextLong();
//	int i = scn.nextInt();
	String s = String.valueOf(l);
	if (s.length()!=10) {		
		System.out.println("please enter a valid mobile number");
	}
	else
		System.out.println("mobile number       :"+s);
	
}
}
