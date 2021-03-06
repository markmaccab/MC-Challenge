package com.luv2code.springboot.demo.mycoolapp.rest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PathTest2 {
//	Test assertion that:
//	that if a path is found between city1 and city2 then every segment of the path is 
//	included in the provided set of paths (input) among pair of cities.

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
		
//	In Udemy:		
/*
		Course course4 = new Course(1, "Operating Systems", "CS");
		student.enroll(course4);
		assertTrue("Enrollment limit exceeded. Should never happen. Debug!!",
		student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT);
 */

		//	in https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html
//	static void	assertTrue(boolean condition)
//        Asserts that a condition is true.

//		In PathTest.java:		
		/*
				Course course4 = new Course(1, "Operating Systems", "CS");
				student.enroll(course4);
				assertTrue("Enrollment limit exceeded. Should never happen. Debug!!",
				student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT);
		 */
		

//		fail("Not yet implemented");		
//	For a more realistic example we can have more cities and more pairs of routes
// 	In the requirements: 
//	7 cities are listed
//	4 paths between some of them (file city.txt in C:\Users\Mark Maccabee\Downloads\mycoolapp)
//	for Junit we can have:
//	39 cities		(file UScities.txt in C:\Users\Mark Maccabee\Downloads\mycoolapp)
//	30 paths between some of them generated by using class RandomGenerator1.java		
		String origin, destination;
		List<List<Integer> > adj3 = new ArrayList<List<Integer> >(); 
		ArrayList<String> cities = new ArrayList<String>();
		int source = 0; 
		int target = 0;
		String test;
		String[] values = new String[2];

		FunRestModel model = new FunRestModel();
//	Read city.txt file
		model.inputSegmentsData();
//find path 
		origin="Boston";
		destination="Philadelphia";
		model.lookupPath();

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
		}

		}


