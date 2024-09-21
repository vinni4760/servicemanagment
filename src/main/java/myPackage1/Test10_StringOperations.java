package myPackage1;
public class Test10_StringOperations {
	
		public static void main(String[] args) {
//			public boolean isEmpty(); form java 1.6v
			/*isEmpty():- Returns true if, and only if, length() is 0.*/
		/*	
			String s1 = "abc";
			String s2 = " ";
			String s3 = "";
			String s4 = new String();
			String s5 = new String("def");
			String s6 = new String(" ");
			String s7 = new String("");
			
			System.out.println(s1.isEmpty());
			System.out.println(s2.isEmpty());
			System.out.println(s3.isEmpty());
			System.out.println(s4.isEmpty());
			System.out.println(s5.isEmpty());
			System.out.println(s6.isEmpty());
			System.out.println(s7.isEmpty());
			
			System.out.println(s1.length());
			System.out.println(s2.length());
			System.out.println(s3.length());
			System.out.println(s4.length());
			System.out.println(s5.length());
			System.out.println(s6.length());
			System.out.println(s7.length());
			
			System.out.println(s1.trim().isEmpty());//java 10
			System.out.println(s2.trim().isEmpty());//java 10
			System.out.println(s3.trim().isEmpty());
			 
			String s8 = " a ";
			System.out.println(s1.isBlank());
			System.out.println(s2.isBlank());
			System.out.println(s3.isBlank());
			System.out.println(s8.isBlank());
			
//			public int length()
			
			System.out.println(s1.length());
			System.out.println(s2.length());
			System.out.println(s3.length());
			System.out.println(s1.length()==0);
			System.out.println(s2.length()==0);
			System.out.println(s3.length()==0);
			System.out.println();
			
//			length variable
			String[]  s9 = {"a","b","c","d"};
			System.out.println(s9.length);
			char[] ch = {'a','b','c'};
			System.out.println(ch.length);
			System.out.println();
			
		    String s10 = "hari";
		    Example1 e1 = new Example1(5);
		    System.out.println(s10);
		    System.out.println(e1);
		    System.out.println();
		    
		    String s11;
//		    System.out.println(s11.isEmpty());
//			System.out.println(s11.isBlank());
		    
		    String s12 = null;
//		    System.out.println(s12.isEmpty());
//		    System.out.println(s12.isBlank());
//		    System.out.println(s12.length());
//		    System.out.println(s12.length);
			
		    String s13 = "null";
		    System.out.println(s13.isEmpty());
		    System.out.println(s13.isBlank());
		    System.out.println(s13.length());
		    System.out.println();
		    
//		    Scanner scn = new Scanner(System.in);
//		    System.out.println("Enter some Text");
//		    String s14 = scn.nextLine();
//		    System.out.println(s14.isEmpty());
//		    System.out.println(s14.isBlank());
//		    System.out.println(s14.length());
//		    System.out.println();
		    
		    String s15 = "hari";
		    System.out.println(s15=="hari");
		    System.out.println(s15.equals("hari"));
		    System.out.println();
		    
		    String s16 = new String("hari");
		    System.out.println(s16=="hari");
		    System.out.println(s16.equals("hari"));
		    System.out.println();
		    
		    String s17 = new String("Hari");
		    System.out.println(s17=="hari");
		    System.out.println(s17.equals("hari"));
		    System.out.println(s17.equalsIgnoreCase("hari"));
		    System.out.println();
		    
		    String s18 = "a";
		    String s19 = "a";
		    System.out.println("s18==s19"+s18==s19);
		    System.out.println();
		    
		    String s20 = "hari";
		    StringBuffer sb1 = new StringBuffer("hari");
		    StringBuilder sbb1 = new StringBuilder("hari");
		    System.out.println(s20.equals(sb1));
		    System.out.println(sb1.equals(sbb1));
		    System.out.println(s20.equals(sbb1));
		    System.out.println(s20.contentEquals(sb1));
//		    System.out.println(sb1.contentEquals(sbb1));
		    System.out.println(s20.contentEquals(sbb1));
		    System.out.println();
//		    content equals method used to comper string with stringBuilder and String Buffer
		    
		    StringBuffer sb2 = new StringBuffer("abc");
		    System.out.println(sb1.equals(sbb1));
		    System.out.println(sb1.equals(sbb1));
//		    System.out.println(sb1.contentEquals(sbb1));
//		    System.out.println(sb1.equalsIgnoreCase(sbb1));
		    System.out.println(sb1 == sb2);
		  
			
			String s21 = "abc";
			String s22 = "abc";
			String s23 = "aBc";
			String s24 = "abcdef";
			String s25 = "abCdef";
			System.out.println(s21==s22);
			System.out.println(s21.equals(s22));
			System.out.println(s21.compareTo(s22)); // 0 means true
			System.out.println(s22.compareTo(s23));
			System.out.println(s22.compareTo(s24));
			System.out.println(s22.compareTo(s25));
//			/*background compareTo method Subtracts ascii of s21 string object from s23 string object
			System.out.println(s21.compareToIgnoreCase(s23));
			System.out.println(s21.compareToIgnoreCase(s24));
			System.out.println(s24.compareToIgnoreCase(s21));
			System.out.println(s24.compareTo(s21));
		    System.out.println();
		    		*/
			
			String s26 = "Java is not full Object - Oriented Programming Language";
			System.out.println(s26.equals("full"));
			System.out.println(s26.compareTo("full"));
			System.out.println(s26.contains("full"));
			System.out.println(s26.toUpperCase().contains("Full"));
			System.out.println(s26.toLowerCase().contains("program"));
			System.out.println(s26.contains("j"));
//			check wether the passed substring is present in current String object or not
			
			System.out.println();
			System.out.println(s26.indexOf("J"));
			System.out.println(s26.indexOf("u"));
//			System.out.println(s26.IndexOf('e',5));
			System.out.println(s26.lastIndexOf("e"));
			System.out.println(s26.indexOf("e", 5));
			System.out.println(s26.indexOf('e', 5)); 
			
			System.out.println(s26.indexOf('A'));
			System.out.println(s26.lastIndexOf('A')); 
			System.out.println(s26.indexOf('a',-5));
			System.out.println(s26.lastIndexOf('a',-5));	
			System.out.println(s26.indexOf('a',25));	
			System.out.println(s26.indexOf('e',10));
			System.out.println(s26.indexOf('a', 1));
			
			System.out.println(s26.indexOf("java"));
			System.out.println(s26.indexOf("not"));
			System.out.println(s26.lastIndexOf("not"));
			
			if (s26.indexOf("Programm")!=-1) {
				System.out.println("is available");				
			}
			else {
				System.out.println("not available");
			}
          
			if (s26.toLowerCase().indexOf("programm")!=-1) {
				System.out.println("is available");				
			}
			else {
				System.out.println("not available");
			}
//			from java 1.4 contains() is available
			if (s26.contains("rogramm")) {
				System.out.println("is available");				
			}
			else {
				System.out.println("not available");
			}
		    
		    
		}
}
