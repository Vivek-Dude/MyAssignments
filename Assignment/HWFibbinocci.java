package Week1.Day1.Assignment;

public class HWFibbinocci {

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int sum = 0;
				
		System.out.println("Fibbinocci Series");
		System.out.println(first);
		System.out.println(second);
		
		for (int i = 0; i<11; ++i) {
			
			sum = first+second; 
			first = second; 
			second = sum;  
			System.out.println(sum);
		}
		
	}

}
