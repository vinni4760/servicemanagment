package myPackage1;

public class Test13 {
 public static void main(String[] args) {
	 String s1 = "abc";
	 String s2 = "efg";
//	 String s3 = "a".concat("b");
	 System.out.println("a".concat("b").concat("c"));
	 System.out.println(s1.concat(s2));
	String s = "hari krishna";
	System.out.println(s.indexOf('h'));
	System.out.println(s.indexOf('a'));
	System.out.println(s.indexOf('r'));
	System.out.println(s.indexOf('i'));
	System.out.println(s.indexOf('k'));
	System.out.println(s.indexOf('r'));
	System.out.println(s.indexOf('i'));
	System.out.println(s.indexOf('s'));
	System.out.println(s.indexOf('h'));
	System.out.println(s.indexOf('n'));
	System.out.println(s.lastIndexOf('a'));
	
	System.out.println(s.indexOf('k', 6));
	System.out.println(s.indexOf("krishna", 6));
}
 }
