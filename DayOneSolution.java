package day1;

public class DayOneSolution {

	
	/* 
	 * Method that takes in a string and parses the string
	 * looking for the first number that occurs in string 
	 * and then parses again backwards searching for the 
	 * second number. The method then concatenates the two
	 * substrings of the number, converts that concatenation
	 * into an integer and then returns that integer
	 */
	public static int calibration(String that) {
		String first = "";
		String second = "";
		
		
		for(int i = 0; i < that.length(); i++)
		{
			if(Character.isDigit(that.charAt(i))) {
				first = that.substring(i,i+1);
				break;
			}
		}
		
		for(int i = that.length() - 1; i >= 0; i--)
		{
			if(Character.isDigit(that.charAt(i))) {
				second = that.substring(i,i+1);
				break;
			}
		}
	
		String returnVal = first.concat(second);
		return Integer.valueOf(returnVal);
		
	}
	
	
	/*
	 * Main method that runs the Calibration method passing
	 * in console line arguments 'args' and adds all the 
	 * results together and prints the summation into the
	 * console line
	 */
	public static void main(String[] args)
	{
		int sum = 0;

		for(String arg: args)
			sum = sum + calibration(arg);			
		
		System.out.println(sum);
	
		
		
		
	}
	
}
