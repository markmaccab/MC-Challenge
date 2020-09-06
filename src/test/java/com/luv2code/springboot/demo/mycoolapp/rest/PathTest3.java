package com.luv2code.springboot.demo.mycoolapp.rest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;


class PathTest3 {
//	Test assertion that:
//	that if a path is found between city1 and city2 then every segment of the path is 
//	included in the provided set of paths (input) among pair of cities.
	Path pathObj = new Path();
	String origin, destination;
	List<List<Integer> > adj3 = new ArrayList<List<Integer> >(); 
	ArrayList<String> cities = new ArrayList<String>();
	int source = 0; 
	int target = 0;
	ArrayList <Integer> test;
	String[] values = new String[2];
	FunRestModel funRestModel = new FunRestModel();
	boolean junit=true;
	ArrayList<Integer> setOfCities = new ArrayList<Integer>(); 
	ArrayList<Integer> reverseSetOfCities = new ArrayList<Integer>(); 
	ArrayList<Integer> CitiesOfSegments = new ArrayList<Integer>(); 

	@Test
	void testFindPath() {
//	CASE 1:
//	if a path is found by findPath() method from city1 and city2 (int src, int target) THEN		
//	every segment of the path is included in the provided set of paths (input) among pairs of cities
//	(cities: List<List<Integer> > adj)

//	CASE 2:		
//	if a path is NOT found by findPath() method from city1 and city2 (int src, int target) THEN		
//	the set of cities reachable from src and the set of cities reachable from target IS DISJOINT
//	(cities: List<List<Integer> > adj)
		
//	IMPLEMENTATION:
//	CASE 1: findPath() produces every segment of the path
//	CASE 2: findPath() produces 2 sets of cities:
//	the set of cities reachable from src and the set of cities reachable from target

//	in https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html
//	static void	assertTrue(boolean condition)
//        Asserts that a condition is true.

//		In PathTest.java:		
		/*
		 */
		
//		fail("Not yet implemented");		

		
		
//	For a more realistic example we can have more cities and more pairs of routes
// 	In the requirements: 
//	7 cities are listed
//	4 paths between some of them (file city.txt in C:\Users\Mark Maccabee\Downloads\mycoolapp)
//	for Junit we can have:
//	39 cities		(file UScities.txt in C:\Users\Mark Maccabee\Downloads\mycoolapp)
//	30 paths between some of them generated by using class RandomGenerator1.java		
		

//	testFindPath
 
		//find path 
//		origin="Chicago";
//		destination="Chicago";
//		destination="Boston";
		origin="Boston";
//		destination="Philadelphia";
		destination="Trenton";
//		destination="Chicago";
		

//		when junit==true data is collected in Junit designated data structures
//		This data is then printed by Path class method testFindPath()
		test=funRestModel.testFunRestModel(origin, destination, junit);
		int k=0;
		k=collectTestData();	
		if (k==0)
		{
			System.out.println("origin:  " + origin + "   destination:  " + destination);
			test=funRestModel.testFunRestModel(destination, origin, junit);
			collectTestData();		
		}

	}
		public int collectTestData()
		{
			int rCode=0;
//			System.out.println("test.size():  " + test.size()); 
			if (test.get(test.size()-1)==1)
			{
				CitiesOfSegments=test;
					int j=CitiesOfSegments.size()-1;
					System.out.println("Segments:  "); 
					for (int i=0; i<j-1; i++)		{	
						System.out.print(funRestModel.cities.get(CitiesOfSegments.get(i)) + "   " ); 
						System.out.println(funRestModel.cities.get(CitiesOfSegments.get(i+1)));
					}
				rCode=1;	
		     	}
	 else
			{
			if (test.get(test.size()-1)==0)
				{
				if (test.size()>2)
				{
				setOfCities=test;
				int j=setOfCities.size()-1;
				System.out.print("Starting from: " + funRestModel.cities.get(setOfCities.get(0)));
				System.out.println(" there is a path to those cities: ");
				for (int i=1; i<j; i++)	
				{
						System.out.print(funRestModel.cities.get(setOfCities.get(i)) + ",   "); 
/*						Set<Integer> hSet = new HashSet<Integer>(setOfCities); 
						hSet.addAll(setOfCities); 
						System.out.println("Created HashSet is"); 
						for (Integer x : hSet) 
*/							System.out.println(x); 

				}		
				}
				else
				{
					System.out.println("a city does not appear in any segment");	
				}
				}
				rCode=0;	
				}
			
			return rCode;
			
		}
		
		}
		


//	Read city.txt file
//		model.inputSegmentsData();
//		model.lookupPath();

/*		
		int source = model.adj3.get(1).get(1); // error: Index 1, Size 0. need to debug
//		in the beginning of testFindPath() method:
//		Need to provide arbitrary input of segments (setSetOfSegments() method)
// 		Need to execute testFunRestModel method (take out 73-84) 		
		int target = model.adj3.get(3).get(2);
		
		Path path = new Path(model.cities); 
		
//		Here determine arbitrary pair of {source,target}
//		Use testFunRestModel method (lines 73-84)
		String test=path.findPath(model.adj3, source, target); 
		if (test=="YES")
		{
//	CASE 1: code and use a new PATH method segmentsOfPath() to path segments and prove assertion
		}
		if (test=="NO")
		{
//	CASE 2: code and use a new PATH method setsOfCities() and prove assertion
//	Both those new methods will require data to be collected
//	by findPath when "assert" is ON.
			}
*/
		
/*
C:\Users\Mark Maccabee\eclipse-workspace\junit-assertthat-example
 
https://docs.oracle.com/javase/7/docs/api/java/util/Set.html

http://www.java2s.com/example/java-book/set-union-intersection-difference-and-subset.html: 

// Union of s1 and s2 will be stored in s1
s1.add(s2);

// Intersection of s1 and s2 will be stored in s1
s1.retainAll(s2);

// Difference of s1 and s2 will be stored in s1
s1.removeAll(s2);
 */

		

