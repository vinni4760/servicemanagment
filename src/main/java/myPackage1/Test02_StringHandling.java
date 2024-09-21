package myPackage1;

import java.util.Scanner;

public class Test02_StringHandling {
	/*performing different operation on string is String Handling*/
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a string");
	String s1 = scn.nextLine();
	if(s1.equals("hari")) {
		System.out.println("hii:"+s1.toUpperCase());
	}
	else {
		System.out.println(s1.concat("nit"));
	}
	}
}
