package myPackage1;

public class Test03_diffwaysto_Store_String {
	public static void main(String[] args) {
		char[] ch = {'a','b','c','d'};
		//ch[4] = 'e';
		System.out.println(ch);
		String s1 = "Hari";
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer("nit");
		StringBuilder s3 = new StringBuilder("Ammerpet");
		System.out.println(s2);
		System.out.println(s3);
	}

}
