package day6;

public class day6 {

	public static int distanceCalc (int timeLimit, int recordDistance ) {
		int k = 0;
		for (int i = 1; i < timeLimit; i++) {
			if(i * (timeLimit - i) > recordDistance)
				k++;
		}
		return k;
	}
	
	public static void main(String[] args) {
		
		System.out.println(distanceCalc(56, 546) * distanceCalc(97, 1927) *
				distanceCalc(78,1131) * distanceCalc(75, 1139));
		
		System.out.println(distanceCalc(56,546));
	}
}
