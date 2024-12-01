package day2;

public class DayTwoSolution {

	
 public static boolean isPossible(String record) {
	
	 int GameNum = findNums(record);
	 record = record.replaceFirst(Integer.toString(GameNum), "");
	 for(int i = record.indexOf(":"); i<record.length(); i++) {
		 int FirstNum = findNums(record);
		 record = record.replaceFirst(Integer.toString(FirstNum), "^");
		 int k = record.indexOf("^");
		 if(record.charAt(k+2) == 'g') {
			 if(FirstNum > 13)
				 return false;
		 }
		 else if(record.charAt(k+2) == 'r') {
			 if(FirstNum > 12)
				 return false;
		 }
		 else if(record.charAt(k+2) == 'b') {
			 if(FirstNum > 14)
				 return false;
		 }
		
		 record = record.replaceFirst("^", "");
	 }
	 System.out.println(GameNum);
	 return true;
 }
 
 public static int findNums(String that) {
	 for(int i = 0; i<that.length(); i++)
		 if(Character.isDigit(that.charAt(i))) {
			 if(Character.isDigit(that.charAt(i+1))) {
				 if(Character.isDigit(that.charAt(i+2))){
					 String returnString = that.substring(i, i+3);
					 return Integer.valueOf(returnString);
				 }
				String returnString = that.substring(i, i+2);
				return Integer.valueOf(returnString);
			 }
			 
			 return Integer.valueOf(that.substring(i, i+1));
		 }
	 return -1;
 }
 
 public static void main(String[] args) {
	 int counter = 1;
	 int score = 0;
	 for(String arg: args) {
		 if(isPossible(arg))
			 score = score + counter;
		 counter++;
		 System.out.println(counter +" "+ score);
	 }
	 
	 System.out.println(score);
	 
 }

}

