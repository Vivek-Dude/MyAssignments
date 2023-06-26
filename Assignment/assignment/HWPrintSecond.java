package Week1.Day2.assignment;

import java.util.Arrays;

public class HWPrintSecond {

	public static void main(String[] args) {
		// Print Second Largest in an array
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) int[] data = {3,2,11,4,6,7};
		 3) Pick the 2nd element from the last and print it
		 */
		 int[] data = {3,2,11,4,6,7};
		 Arrays.sort(data);
		 System.out.println("The 2nd lagest number is "+data[(data.length)-2]);		 
		
	}
	

}
