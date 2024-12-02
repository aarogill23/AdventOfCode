import java.util.ArrayList;

public class dayTwo {
    public static void main(String[] args) {
        ArrayList<Boolean> results = new ArrayList<>();
        int numTrues = 0;

        String[] input = getInput.fromFile("");

        for (String line : input) {
            results.add(safety(line));
            System.out.println(safety(line));
        }

        for (Boolean result : results) {
        	System.out.println(result);
            if (result) {
                numTrues++;
            }
        }

        System.out.println(numTrues);
    }

    public static boolean safety(String inputString) {
        ArrayList<Integer> nums = new ArrayList<>();
        int endNum = 1;
        boolean isIncreasing = false;

        for (int i = 0; endNum < inputString.length(); ) {
            while (endNum < inputString.length() && inputString.charAt(endNum) != ' ') {
                endNum++;
            }

            nums.add(Integer.parseInt(inputString.substring(i, endNum)));
            i = endNum + 1;
            endNum = endNum + 2;
        }

        if (nums.get(0) < nums.get(1)) {
            isIncreasing = true;
        }

        if (isIncreasing) {
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) < nums.get(i + 1) && (nums.get(i + 1) - nums.get(i) <= 3) && (nums.get(i + 1) - nums.get(i) >= 1)) {
                    continue;
                } else {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) > nums.get(i + 1) && (nums.get(i) - nums.get(i + 1) <= 3) && (nums.get(i) - nums.get(i + 1) >= 1)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
