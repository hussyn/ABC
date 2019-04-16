package com.TestNGTest;

public class aP5PostPre {
	
	//https://www.neimanmarcus.com/en-in/account/login.jsp?_requestid=134247
	//https://www.zara.com/
public static void main(String[] args) {
		
		int i=1;
		int j=i++;//post increment i is initialized after it is assigned to j
	 System.out.println("i="+i);//post increment 1+1=2 after it is assigned to j
	 System.out.println("j="+j);//1
	 
	 int k=1;
		int l=--k;//pre decrement k decremented before assign to l
	 System.out.println(k);
	 System.out.println(l);
	 
		int a=1;
		
		int b=++a;//pre increment a=1+1=2 and it is assigned to j
	 System.out.println("a="+a);//
	 System.out.println("b="+b);
	    int x=1;
	   int y=++x+x++;	
	   System.out.println("x="+x);
	   System.out.println("y="+y);
	}
}
