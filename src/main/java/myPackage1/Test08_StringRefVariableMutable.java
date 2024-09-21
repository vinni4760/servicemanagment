package myPackage1;

public class Test08_StringRefVariableMutable {
	public static void main(String[] args) {
		String s1 = "a"; //here a is object and s1 is ref variable
		s1 = "b";
		System.out.println(s1);
		final String s2 = "c";
//		s2 = "d";
		System.out.println(s2);
	}

}
