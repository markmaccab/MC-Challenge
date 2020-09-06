package com.luv2code.springboot.demo.mycoolapp.rest;

// Java program to demonstrate conversion of 
// Set to array using addAll() method. 
import java.util.*; 

class Test { 
	public static void main(String[] args) 
	{ 

		// Creating a list of strings 
		List<String> aList = Arrays.asList("Geeks", "for", 
					"GeeksQuiz", "GeeksforGeeks", "GFG"); 

		Set<String> hSet = new HashSet<String>(aList); 
//		hSet.addAll(aList); 
		System.out.println("Created HashSet is"); 
		for (String x : hSet) 
			System.out.println(x); 

		Set<String> tSet = new TreeSet<String>(aList); 
		tSet.addAll(aList); 
		System.out.println("Created TreeSet is"); 
		for (String x : tSet) 
			System.out.println(x); 
	} 
}
