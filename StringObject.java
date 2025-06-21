package com.subodh.StringHandling;
/*
 * 4.How many ways we create String Object?
 * 	two Ways..
 * 
 * 	1.by using String Literal					->"subodh"
 * 	2.by using new keyword and constructor call ->new String("subodh")
 * 
 * 5.what are the difference between in above two programs?
 * 		Two differences
 * 			1.Number of object creation
 * 			2.String pooling
 * 		-in literal approach only one String object is created(0 or 1 object)
 * 		 in new keyword approach two objects are created(1 or 2 objects)
 * 
 * 		-The literal object comes under pooling, means new object is not create if the same literal
 * 		 is repeated with same case. Here literal objects are being reused
 * 
 *  	-The new keyword object does not come under pooling ,
 *  	 always new object is created even through the data is same.
 */
public class StringObject {
	public static void main(String[] args) {
		String s1="subodh";             //1
		String s2="subodh";				//0
		System.out.println(s1==s2);		//true
		
		
		String s3=new String("subodh");//2
		String s4=new String("subodh");	//1  
		System.out.println(s3==s4);		//false 
	}
}
