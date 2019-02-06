package logics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Duplicate {

	public static void main(String[] args) {
		String output = "";
		int count=0;
		 String input = "life is hell life is really hell you are hell";
	        List<String> l=Arrays.asList(input.split(" "));

	       
	            
	       LinkedHashSet<String> hs=new LinkedHashSet<>(l);
	       
	        System.out.println(hs.contains("a"));
	        	for (String s: hs) {
	        		for(String s1: l) {
	        			if(s.equals(s1)) {
	        				count++;
	        			}
	        		}
	        		System.out.println("the alphabet "+ s + " contains in the string "+ count +" times.");
	        		count=0;
	        	}

	      

}

}
