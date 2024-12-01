import java.lang.Math;
import java.util.Arrays;


// Main problem solution
public class dayOne{
	public static void main(String[] args){
		int result = 0;
		int k = 0;
		String[] input = getInput.fromFile("<Fill in File Path>");
		int[] listOne = new int[1000];
		int[] listTwo = new int[1000];
		for(String num : input){
			String[] splitResult = num.split("   ");
			listOne[k] = Integer.parseInt(splitResult[0]);
			listTwo[k] = Integer.parseInt(splitResult[1]);
			k++;
		}
		Arrays.sort(listOne);
		Arrays.sort(listTwo);

		for(int i = 0; i<1000; i++){
			int intOne = listOne[i];
			int intTwo = listTwo[i];

			result = result + Math.abs(intOne - intTwo);
		}
		System.out.println(result);
		System.out.println(similarityScore(listOne, listTwo));
	}
	// Gold start solution
	public static int similarityScore(int[] listOne, int[] listTwo){
		int returnval = 0;
		for(int i = 0; i<listOne.length; i++){
			int similarityScore = 0;
			for(int z = 0; z<listTwo.length; z++){
				if(listOne[i] == listTwo[z]){
					similarityScore++;
				}
			}
			returnval = returnval + (listOne[i] * similarityScore);
			System.out.println(listOne[i] + " found in listTwo " + similarityScore + " times");
		}
		return returnval;
	}
}