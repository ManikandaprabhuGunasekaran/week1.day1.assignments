package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */
	
	/*
	 * Learnings use of assignment operator for loop fibonacci formula - fn = fn-1 +
	 * fn-2
	 */
	
	public static void main(String[] args) {

		/*
		 * initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum
		 * in the series) 
		 * Print first number 
		 * Iterate from 1 to the range 
		 * add first and second number assign to sum 
		 * Assign second number to the first number
		 * Assign sum to the second number // print sum
		 */
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum=0;
		System.out.println(firstNum);
		
		for (int i=1;i<range;i++) 
		{		
		//logic - f0 - 0 , f1 - 1 (next number would be sum of previous 2 numbers f0 + f1 = f2 like wise f5=f4+f3 (5=3+2))
			
	
		firstNum=secNum;
		secNum=sum;
		sum = firstNum+secNum;
		System.out.println(sum);
		
		}
	}

}