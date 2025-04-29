package coreJavaConcepts;

import java.util.ArrayList;

public class wrapperClasses {
	
	private static String longString;

	public static void main(String[] args) {
		longString = "asdasdquDIKJBAWBAIJSBijubnijbdAHUBVIFiubnaciiiiiii";
		
		
		/**
		 * Wrapper Classes
		 * 
		 * Used to store prim in collections
		 * like ArrayList<Integer> (can't use int)
		 * 
		 * Or to get utility methods like
		 * Integer.parseInt(), Character.isDigit()
		 */
		
		int x = 5;
		Integer boxed = x; // autoboxing?
		int y = boxed; // unboxing

		/**
		 * Array List
		 * 
		 * nums.remove(Integer.valueOf(1));
		 *
		 */
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(42); // autboxes int to Integer
		nums.add(2);
		nums.remove(Integer.valueOf(2));
		System.out.println(nums.get(0));
		
		
		/**
		 * char shit
		 * 
		 */
		char letter = 'A';
		
		char numChar = 65;
		System.out.println(numChar); // Prints A
		
		// Loop Through Alphabet
		//for (char c = 'A'; c <= 'Z'; c++) {
		//	System.out.println(c + " ");
		//}
		
		System.out.println(fartPoopy(longString, 'i'));
		
		
		
	}
	
	public static int fartPoopy(String longString, char target) {
		int count = 0;
		
		for (int i = 0; i < longString.length(); i++) {
			char c = longString.charAt(i);
			if (c == target) {
				count++;
			}
	}
		return count;

}
	
}
