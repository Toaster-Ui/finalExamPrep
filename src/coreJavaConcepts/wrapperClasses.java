package coreJavaConcepts;

import java.util.ArrayList;

public class wrapperClasses {

	public static void main(String[] args) {
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
	}

}
