package com.luv2code.springboot.demo.mycoolapp.rest;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files
//	import java.util.Scanner; // Import the Scanner class to read text files

public class FunRestModel1 {
	
	String origin, destination;
	List<List<Integer> > adj3 = new ArrayList<List<Integer> >(); 
	ArrayList<String> cities = new ArrayList<String>();
	int source = 0; 
	int target = 0;
	String test;
	String[] values = new String[2];
	
	public String testFunRestModel(String origin,String destination)	{
		this.origin=origin;
		this.destination=destination;

		try {
	    	File myObj = new File("city.txt"); //C:\Users\Mark Maccabee\Downloads\mycoolapp
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);

		        values = data.split("\\s*,\\s*");
		        System.out.println(Arrays.toString(values));
		        
		        if (!cities.contains(values[0]))
	        		{
//	If city1 is not in cities list, add it there
//	cities[] is a list of cities. We add city "values[0]" to cities[]		        	
		        	cities.add(values[0]);
	        		adj3.add(new ArrayList<Integer>());
	        		}
		       int i = cities.indexOf(values[0]);
		       
		        if (!cities.contains(values[1]))
	    		{
//		        	If city2 is not in cities list, add it there
//	        	cities[] is a list of cities. We add city "values[1]" to cities[]		        	
	        	cities.add(values[1]);
        		adj3.add(new ArrayList<Integer>());
	    		}
		        int j = cities.indexOf(values[1]);
		        
//				Add city1,city2 pair numbers in adj list
		        if (!adj3.get(i).contains(j))
		        {
		        	adj3.get(i).add(j);
		        	adj3.get(j).add(i);    	
		        }
		      }
		      myReader.close();
		      
				source = cities.indexOf(origin); 
				target = cities.indexOf(destination);
		      
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

		if ((source==-1)||(target==-1))
		{
		System.out.println("No path from " + origin + "  to  " + destination);
		test="NO";
		return test;		
		}
		else
		{
		Path path = new Path(cities); 
		 test=path.findPath(adj3, source, target); 
		 return test;
		}
		
	}
	
	public void inputSegmentsData()
	{

		try {
	    	File myObj = new File("city.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);

		        values = data.split("\\s*,\\s*");
		        System.out.println(Arrays.toString(values));
		        
		        if (!cities.contains(values[0]))
	        		{
//	If city1 is not in cities list, add it there
//	cities[] is a list of cities. We add city "values[0]" to cities[]		        	
		        	cities.add(values[0]);
	        		adj3.add(new ArrayList<Integer>());
	        		}
		       int i = cities.indexOf(values[0]);
		       
		        if (!cities.contains(values[1]))
	    		{
//		        	If city2 is not in cities list, add it there
//	        	cities[] is a list of cities. We add city "values[1]" to cities[]		        	
	        	cities.add(values[1]);
        		adj3.add(new ArrayList<Integer>());
	    		}
		        int j = cities.indexOf(values[1]);
		        
//				Add city1,city2 pair numbers in adj list
		        if (!adj3.get(i).contains(j))
		        {
		        	adj3.get(i).add(j);
		        	adj3.get(j).add(i);    	
		        }
		      }
		      myReader.close();
		      
				source = cities.indexOf(origin); 
				target = cities.indexOf(destination);
		      
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}
	}

	
	

