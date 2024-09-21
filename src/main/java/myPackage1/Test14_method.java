package myPackage1;

public class Test14_method {
      public static void main(String[] args) {
		String s1 = "abcdef";
		System.out.println(s1.charAt(0));//returns the character on specified index
		System.out.println(s1.codePointAt(0));//returns the unicode of character on specified index
//		System.out.println(s1.codePointAt(-1));
		System.out.println(s1.codePointCount(0, 4));
		System.out.println(s1.startsWith("a",2));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.startsWith("A"));
//		System.out.println(s1.startsWithIgnoreCase("A"));
		
		System.out.println();
		
		String s2 = "vinay tanwar";
		System.out.println(s2.substring(0));
		System.out.println(s2.substring(5)); 
		System.out.println(s2.substring(0, 8));
		System.out.println(s2.subSequence(0, 4));
		System.out.println();
		
		
		String s3 = "vinay,rajaram,tanwar";
        String[] s4 = s3.split(",");
        System.out.println(s4.length);
        System.out.println(java.util.Arrays.toString(s4));
        
        String s5 = "ShyamSanuSatyamShakti";
        String[] s6 = s5.split("a");
        System.out.println(s6.length);
        System.out.println(java.util.Arrays.toString(s6));
        System.out.println();
        
        
        String[] s7= s5.split("a", 10);//String regax and int limit
        System.out.println(s7.length);
        System.out.println(java.util.Arrays.toString(s7));
        System.out.println();
        
        String s8 ="abcdefghijklmnopqrstuvwxyz";
        char[] ch = s8.toCharArray();
        System.out.println(ch.length);
        System.out.println(java.util.Arrays.toString(ch));
        System.out.println();
        
        String s9 = null;
        Long l = 45457874548l;
        double d = 10.0;
        System.out.println(String.valueOf(97));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(d));
        System.out.println();
        
        String s10 = "abcd";
        System.out.println(s10.intern());

/*When the intern method is invoked, if the pool already contains astring equal to this String object as 
 * determined bythe equals(Object) method, then the string from the pool isreturned. Otherwise, this String object 
 *  is added to thepool and a reference to this String object is returned. 

It follows that for any two strings s and t, s.intern() == t.intern() is trueif and only if s.equals(t) is true. 

All literal strings and string-valued constant expressions areinterned. String literals are defined in section {@jls 3.10.5} of the The Java Language Specification.
Returns:a string that has the same contents as this string, but isguaranteed to be from a pool of unique strings.*/
        
        
//         String s11 = null.concate("a");
//         String s12 = "a".concat(null);//java.lang.NullPointerException
          
           String s11 = null+"a";
           System.out.println(s11);
           
            String s13 = null;
            String s14 = null;
          String s15 = s13+s14;
          System.out.println(s15);
//        	String s15 = s13.concat(s14); //java.lang.NullPointerException
            
            String s16 = "abcdef";
            String s17 = "ghijklm";
            System.out.println(s16.repeat(5)); 
            System.out.println(s16.replace('a', 'f'));
            System.out.println(s16.replace(s16, s17));
            System.out.println(s17.replace(s17, s16));
            
            String s18 = "hari krishna";
            String s19 = "naresh it";
//            System.out.println(s18.replace(s18, s19));
            System.out.println(s19.replace(s19, s18));
            System.out.println(s18.replaceAll(s18, s19));            
            System.out.println(s18.replaceFirst(s18, s19));   
	
            System.out.println();
            
            String s20 = 7+8+"a"+9+10+null;
            System.out.println(s20);
            String s21 = "a"+9+7;
            System.out.println(s21);
            String s22 = 1+2+"b"+3+4+"c";
            System.out.println(s22);
//            String s23 = 4+5+null;
//            System.out.println(s25);
      }
      
}
