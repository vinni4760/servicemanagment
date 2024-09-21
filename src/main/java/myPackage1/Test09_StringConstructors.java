package myPackage1;

public class Test09_StringConstructors {
  public static void main(String[] args) {
	System.out.println("String class constructors :");
	
	String s1 = new String();
	System.out.println("s1 chars\s"+s1);
	System.out.println("s1 length\s:"+s1.length());
	System.out.println();
	
	String s2 = new String("abc");
	System.out.println(s2);
	System.out.println(s2.length());
	System.out.println();
	
	StringBuffer sb1 = new StringBuffer("def");
	System.out.println(sb1);
	System.out.println(sb1.length());
	System.out.println();
	
	StringBuilder sbb1 = new StringBuilder("ghi");
	System.out.println(sbb1);
	System.out.println(sbb1.length());
	System.out.println();
	
	char[] ch = {'a','b','c','d','e','f'};
	String s3 = new String(ch);
	System.out.println(s3);
	System.out.println(s3.length());
	System.out.println();
	
	String s4 = new String(ch,2,3 );
    System.out.println(s4);
	System.out.println(s4.length());
	System.out.println();
	
	byte[] b = {97,98,99,100,101};
	String s5 = new String(b,2,3);
	System.out.println(s5);
	System.out.println(s5.length());
			
	
}
}
