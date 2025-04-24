package coreJavaConcepts;

public class primDataTypes {

	// change 1
	// change 2
	// really important change here wow
	
	public static void main(String[] args) {
		int x = 5; // prim
		double y = 0.1111; // prim
		boolean isTrue = true; // prim
		char oneLetter = 'a'; // prim
		byte z = 1; // prim
		short a = 1; // prim
		long b = 2; // prim
		float c = 3; // prim
		
		/**
		 * Bytes
		 *
		 * Used to save memory in large arrays
		 * or files (raw binary data)
		 * 
		 * -128 - 127
		 * 
		 * Size = 8 bits (1 byte)
		 */
		
		/**
		 * Short
		 * 
		 * Rarely used, used when memory savings
		 * matter more than range
		 * 
		 * -32,768 - 32,767
		 * 
		 * Size 16 (2 bytes)
		 */
		
		/**
		 * long
		 * 
		 * When int (32-bit) isn't big enough
		 * like very large counters or timestamps
		 * 
		 * ~ -9 quintillion to +9 quintillion
		 * 
		 * 64 bits (8 bytes)
		 */
		
		/**
		 * char
		 * 
		 * Letter attributed to unicode. Like 'A' = 65
		 * You can do math with chars since they're basically nummbers
		 */
		char example = 'A';
		System.out.println(
				"Letter Char: " + example + "\n"
				+ "Number: "+ (int) c);
		
	}

}
