package com;

public class Member {
 String s = "Mangamma";
 private static Member m;
 
 private Member() {
	 System.out.println("Member got elected ");
 }
 
 public static Member createObject() {
	 if(m==null)
	 m = new Member();
	 else
		 System.out.println("Member already elected");
 
	 return m;
 }
}
