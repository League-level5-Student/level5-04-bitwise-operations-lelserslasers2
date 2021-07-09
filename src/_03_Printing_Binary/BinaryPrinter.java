package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
//		// We first want to print the bit in the one's place
//		System.out.println(b&1);
//		// Shift b seven bits to the right
//		byte c = (byte) (b>>7);
//		// Use the & operator to "mask" the bit in the one's place
//		// This can be done by "anding" (&) it with the value of 1
//		byte e = (byte) (b&1);
//		// Print the result using System.out.print (NOT System.out.println)
//		System.out.println(e);
		
		//Use this method to print the remaining 7 bits of b
		// 01010101
		System.out.println("");
		for (int i = 7; i >=0; i = i - 1) {
			byte d = (byte) (b>>i);
			System.out.print(d&1);
		}
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte a;
		byte b;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		for (int i = 15; i >=8; i = i - 1) {
			byte d = (byte) (s>>i);
			System.out.print(d&1);
		}
		for (int i = 7; i >=0; i = i - 1) {
			byte d = (byte) (s>>i);
			System.out.print(d&1);
		}
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
	}
	
	public static void main(String[] args) {
		// Test your methods here
		byte joe = (byte) 0b01010101;
		printByteBinary(joe);
	}
}
