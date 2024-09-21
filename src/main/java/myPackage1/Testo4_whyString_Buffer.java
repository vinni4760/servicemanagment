package myPackage1;

public class Testo4_whyString_Buffer {
	
	public static void main(String[] args) {
		
		String s1 = "Hari";//S1 variable pointting to Hari
		System.out.println("Before concate:\s"+s1);
		 s1.concat("Nit");
		System.out.println("After concate:\s"+s1);
		
		String s2 = s1.concat("Nit");
         System.out.println(s2);
         
         s1 = s1.concat("nit");
         System.out.println(s1); //now s1 variable is pointing to harinit
         /*problem - if we modify string object multiple times then we have to 
          * create new String s2 object */
		StringBuffer sb1 = new StringBuffer("Hari");
		System.out.println(sb1);
		sb1.append("Ammerpet");
		System.out.println(sb1);
		
	}

}
