package com.subodh.StringHandling;

public class StringImmutable {

	public static void main(String[] args) {
		String s1="subodh";
		s1.concat(s1);
		System.out.println(s1);//subodh
		
		String s2=s1.concat(",,hyd");
		System.out.println(s1);//1.subodh
		System.out.println(s2);//2.subodh,hyd
		
		String s3="hyd";
		s3="sec";
		System.out.println(s3);//sec
		
		final String s4="hyd";
		//s4="hyd"; //CE

	}

}
