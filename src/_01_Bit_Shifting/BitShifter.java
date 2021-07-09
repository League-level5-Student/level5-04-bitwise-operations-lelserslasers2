package _01_Bit_Shifting;

import javax.swing.JOptionPane;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 7;
		System.out.println(convertDecimalToBinary(num));
		int numShifted = num << 3;
		System.out.println(convertDecimalToBinary(numShifted));
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
	
	int binary(String bin) {
		int total = 0;
		int binLen = bin.length();
		char binArr[] = bin.toCharArray();
		int weigth = 1;
		for (int i = binLen - 1; i >= 0; i = i - 1) {
			String let = Character.toString(binArr[i]); 
			int currentNum = Integer.parseInt(let);
			total = total + currentNum * weigth;
					
			weigth = weigth * 2;
		}
		return total;
	}
	public static String convertDecimalToBinary(int decimalNum) {
        String binaryStr = "";
        do {
            int quotient = decimalNum >>> 1;
            if( decimalNum % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            decimalNum = quotient;
        } while( decimalNum != 0 );
        return binaryStr;
    }
}
