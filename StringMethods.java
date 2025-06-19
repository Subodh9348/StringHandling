package com.subodh.StringHandling;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringMethods {

	public static void main(String[] args) {
		String s1="abc";
		s1.chars();//9v
		//s1.describeConstable();//12v
		s1.formatted("");//15v
		s1.indent(4);//12v
		s1.isBlank();//11v
		s1.lines();//11v
		s1.repeat(3);//11v
		s1.splitWithDelimiters(s1, 0);//21v
		s1.strip();//11v
		s1.stripLeading();//11v
		s1.stripTrailing();//11v
		s1.stripIndent();//15v
		//s1.transform(null);//12v
		s1.translateEscapes();//15v
		
		//.......java 9v ->chars()........
		String s2="abc";
		//java 9v
		IntStream chars=s2.chars();
		//chars.forEach(ch->System.out.println(ch));
		chars.forEach(ch->System.out.print((char)ch));
		System.out.println();
		System.out.println(".............");
		
		//........java 11v->lines()...........
		String s3="abc\nbbc\ncbc";
		Stream<String> lines=s3.lines();
		lines.forEach(line->System.out.println(line));
		System.out.println("........................");
		
		String s4="abcbbccbc";
		Stream<String> lines2=s4.lines();
		lines2.forEach(line->System.out.println(line));
		
		String s5=
				"""
				
					java language
					by 
					narsh i tech..
				""";
		Stream<String> lines3=s5.lines();
		lines3.forEach(line->System.out.println(line));
		
		String s6="abc bbc 1";
		System.out.println(s6.matches("[0-9]"));
		
	}

}
