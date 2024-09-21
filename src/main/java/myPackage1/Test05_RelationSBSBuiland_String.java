package myPackage1;

public class Test05_RelationSBSBuiland_String {
	//static  void m1(String s) {System.out.println(s);// TODO Auto-generated method stub}
	 //static void m1(StringBuffer sb1) {System.out.println(sb);}
	 //static void 1(StringBuilder sbb1) {System.out.println(sbb1);}
	 static void m1(CharSequence cs) {
		 System.out.println("m1 method called");
		 System.out.println(cs);
		// TODO Auto-generated method stub

	}
	 public static void main(String[] args) {
		 String s1 = "hari";
		// StringBuffer sb1 = "nit";
		 //StringBuilder sbb1 = "Corejava";
		 StringBuffer sb1 = new StringBuffer("StringBuffer");
		 StringBuilder sbb1 = new StringBuilder("StringBuilder");
		 System.out.println(s1);
		 System.out.println(sb1);
		 System.out.println(sbb1);
		 
		 /*CharSequence is super class of String,StringBuffer,StringBuilder*/
		 CharSequence cs1 = "Hari";
		 CharSequence cs2 = new StringBuffer("nit");
		 CharSequence cs3 = new StringBuilder("school");
		 
		 System.out.println(cs1);
		 System.out.println(cs2);
		 System.out.println(cs3);
		 
		 m1(s1);
		 m1(sb1);
		 m1(sbb1);
		 
		 
		 
	 }

}
