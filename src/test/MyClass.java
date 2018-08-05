package test;

import java.io.*;

public class MyClass {
	public static void main(String args[])throws IOException{
		System.out.println("enter namess");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("your name is " +name);
		
	}
}
