package com.subodh.StringHandling;
/*a literal is a constant value that we can type from keyboard
 * 
 * primitive type literal..just values(memory is not allocated)
 * ............................................................
 *  int literal    ->10
 *  long literal   ->10L
 *  Float literal  ->10.5F
 *  Double Literal ->10.5
 *  char Literal   ->'a'
 *  Boolean Literal->true/false
 * 
 * referenced type literal(object memory is allocated)
 * ...................................................
 *  null Literal.   ->null   (just value ,memory is allocated)
 *  String Literal  ->"subodh"(An object,instance of java.lang.string class)
 *  class Literal   ->A.class(An object,instance  of java.lang.Class class)
 *  
 *  1.What is a string?
 *  	-A string is a sequence of characters placed in "" is called string
 *  
 *  2.What is a string literal?
 *  	-A sequence of characters placed in "" is called String literal
 *  	-A string literal is  an object,which is instance of java.lang.String class 
 *  	-That means when we placed '0' to 'n' of characters in "" ,
 *  	 inside JVM one instance is created from java.lang.string class with the given characters
 *  	-in the program For storing String literal we must create String class Type ref Variable 
 *  3.What is printed when we print String class Object?
 *  	-Its data is printed
 *  	-Because in String class toString() method is overridden
 *  	-to return and print string class object
 *       
 *  	 
 *   
 */

public class StringLiteral {

	public static void main(String[] args) {
		System.out.println("subodh");
		String s1="subodh";
		System.out.println(s1);//s1.toString()->overridden in String class
								//object data is printed
		
		Example e=new Example(15);//e.toString ()->not overridden in example class 
		System.out.println(e);		//then executed from object class
									//ClassName@hashcode is printed

		Sample s=new Sample(15);//s.toString()->overridden in sample class 
		System.out.println(s);//object data 15 is printed
	}

}
class Example{
	private int x;
	
	Example(int x){
		this.x=x;
	}
}
class Sample{
	private int x;
	
	Sample(int x){
		this.x=x;
	}

	@Override
	public String toString() {
		return ""+ x;
	}
	
	
}
