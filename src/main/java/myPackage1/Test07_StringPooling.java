package myPackage1;

public class Test07_StringPooling {
    public static void main(String[] args) {
		String s1 = "hari";
		String s2 = "hari";
		System.out.println("s1\s"+s1);
		System.out.println("S2\s"+s2);
		System.out.println(s1==s2);// compares add
		System.out.println(s1.equals(s2));// compares data
		
		String s3 = new String("nit");
		String s4 = new String("nit");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
//		String s5 = new String();
		
	}
}
