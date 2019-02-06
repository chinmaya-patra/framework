package logics;

import java.util.Scanner;

public class OcuuranceOfChae {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the string for find the occurance of character");
		String input=sc.nextLine();
		sc.close();
		occuranceOfChar( input);
	}

	private static void occuranceOfChar(String input) {
		input=input.toUpperCase();
		
		while(input.length()>1) {
			int counter=0;
			char c=input.charAt(0);
			for(int i=0;i<input.length();i++) {
				if(c==input.charAt(i)) {
					counter++;
					input.replace(Character.toString(input.charAt(0)),"");
				}
				
			}
			System.out.println(c +" occures "+ counter+ "times in the given string.");
		}
		
	}

}
