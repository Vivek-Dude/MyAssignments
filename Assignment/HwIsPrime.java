package Week1.Day1.Assignment;

public class HwIsPrime {

	public static void main(String[] args) {
		int n=18;
		int res=0;
		int counter = 1;
		for (int i = 2; i < n-1; i++) {
			
			res = n%i; // to store the remainder value
			if (res==0) {// to come out of the loop once non - prime no. is found
				break;
			}			
			counter++;
		}
		if (res!=0) {// to print the Prime number
			System.out.println(n+" is a prime number "+counter);
		}
		else {// to print the non-prime number
			System.out.println(n+" is not a prime number "+counter);
		}	
		
	}

}
