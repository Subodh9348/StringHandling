package com.subodh.StringHandling;
public class StringOperation {

	public static void main(String[] args) {
		String s1="";
		String s2=" ";
		String s3="Subodh";
		
		System.out.println(s1.isEmpty()+""+s1.isBlank());
		System.out.println(s2.isEmpty()+""+s2.isBlank());
		System.out.println(s3.isEmpty()+""+s3.isBlank());
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		//Upto Java 5v... to string is empty
		System.out.println(s1.length()==0);
		System.out.println(s1.length()!=0);
		System.out.println("............................");
		
		//upto java10v to find String is blank or not 
		System.out.println(s1.trim().length()==0);
		System.out.println(s1.trim().isEmpty());
		
		String s4="subodh";				//String class object=>collection of characters
		String[] s5= {"sn","hn","pn"};	//String array object=>collection of String objects
		
		//System.out.println(s5.isEmpty());
		//System.out.println(s5.isBlank());
		//System.out.println(s5.length());
		System.out.println(s5.length);
		/*
		 * length vs length()
		 * 1.length is a property in array object
		 * 		length() is a method in string class
		 * 2.we can call length property  only by using array object
		 * 	 for finding the length of the array (number of elements available)
		 * 
		 * 		we can call 'length() method' only by using String class object for finding the string length
		 */
		
		
		s1="subodh";
		s2="subodh";
		s3="Subodh";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		System.out.println(s1.equalsIgnoreCase(s3));
		//.................................................................
		/*
		 * ==vs equals() Method
		 * 1.
		 * 	== operator compares String objects by using reference
		 * equals() method compare String objects by using those objects state
		 */
		s1="subodh";
		s2="subodh";
		System.out.println(s1==s2);			//true(String pooling->same object ->same reference)
		System.out.println(s1.equals(s2));	//true(String pooling->same object ->same data)
		
		s3=new String("hyd");
		s4=new String("hyd");
		System.out.println(s3==s4);			//false(ISP)->diff objects->diff reference
		System.out.println(s3.equals(s4));	//true(ISP)->diff. objects->same state
		
		String s6="subodh";
		String s7="subodh";
		System.out.println(s6==s7);						//false
		System.out.println(s6.equals(s7));				//false
		System.out.println(s6.equalsIgnoreCase(s7));	//true
		
		StringBuffer sb1=new StringBuffer("hyd");
		System.out.println(s6.equals(sb1));
		System.out.println(s6.equals(sb1.toString()));
		
		StringBuilder sb2=new StringBuilder("hyd");
		System.out.println(s6.contentEquals(sb2));
		
		String s8="hyd";
		System.out.println(s6.contentEquals(s8));
		
		
		//To Upper and lower case...............
		s1="Abc Bbc Cbc";
		s1.toLowerCase();
		System.out.println(s1);
		System.out.println("....................");
		
		s2=s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("......................");
		
		s3=s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2==s3);
		System.out.println(".......................");
		
		System.out.println(s1.toLowerCase());
		
		s1="abc";
		s2=s1.toLowerCase();
		System.out.println(s1==s2);
		//.....................................
		s1="Abc";
		s2=s1.toLowerCase();
		s3=s2.toLowerCase();
		System.out.println(s2==s3);
		System.out.println(".............................");
		//..................To Upper case..............................
		s1="abc";
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println("......................");
		
		s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("......................");
		
		s3=s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2==s3);
		System.out.println("......................");
		//............................................
		
		s1="1@3";
		s2=s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println("..........................");
		
		s1=null;
		//s2=s1.toUpperCase();
		//System.out.println(s2);
		//.....................................
		s1="abc bbc cbc";
		s1.replace('b', 'x');
		System.out.println(s1);
		System.out.println("....................");
		
		s1="abc bbc cbc";
		s2=s1.replace('b', 'x');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("....................");
		
		s3=s1.replace("bc", "y");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("....................");
		
		s4=s3.replace("bc", "z");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		System.out.println("....................");
		
		s1="abc 123 bbc";
		s2=s1.replaceAll("bc","z");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("....................");
		
		s3=s1.replaceAll("[bc]", "z");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("......................");
		
		s4=s1.replaceAll("[a-z]", "@");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("........................");
		
		s4=s1.replaceAll("1", "%");
		System.out.println(s4);
		
		s4=s1.replaceAll("12", "%");
		System.out.println(s4);
		
		s4=s1.replaceAll("[12]", "%");
		System.out.println(s4);
		
		s4=s1.replaceAll("[0-9]", "%");
		System.out.println(s4);
		
		s4=s1.replaceAll(".", "*");
		System.out.println(s4);
		System.out.println(".....................");
		
		s1="abc bbc cbc";
		s1.trim();
		System.out.println(s1);
		System.out.println("..............");
		
		s1="abc bbc cbc";
		s2=s1.trim();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("...........");
		
		s3=s2.trim();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2==s3);
		System.out.println(".................");
		
		s1="  abc bbc cbc   ";
		s2=s1.trim();
		s3=s1.replace(" ", "");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		//.................Strip Leading....................................
		
		s1=" abc bbc cbc  ";
		s2=s1.strip();
		s3=s1.stripLeading();
		s4=s4.stripTrailing();
		System.out.println(s1+"hi.."+s1.length());
		System.out.println(s2+"hi.."+s2.length());
		System.out.println(s3+"Hi-"+s3.length());
		System.out.println(s4+" "+s4.length());
		
		
	
		
		
	}

}
