package day1;

public class DayOneSolution {

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
	
	public static void main(String[] args)
	{
		int sum = 0;

		for(String arg: args)
			sum = sum + calibration(arg);			
		
		System.out.println(sum);
	
		
		
		
	}
	
}
