package myPackage1;

public class Test11_ComparingStringswithout_predifinedMethods {
	private static int compareStrings() {
		
		String s1 = "abcdef";
		String s2 = "abc";
		int minlength = Math.min(s1.length(), s2.length());
		
		for (int i = 0; i < minlength; i++) {
			if (s1.charAt(i)!=s2.charAt(i)) {
			return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();          
//		 TODO Auto-generated method stub

	}
       public static void main(String[] args) {
		int a = compareStrings();
		System.out.println(a);
	}
}
