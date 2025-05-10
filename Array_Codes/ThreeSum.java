import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] number = {-1,0,1,2,-1,-4};
        
        // Sort the array to use the two-pointer technique
        Arrays.sort(number);

        Set<String> uniqueResults = new HashSet<>();

        for (int i = 0; i < number.length - 2; i++) {
            // Skip duplicates to avoid repeating the same triplet
            if (i > 0 && number[i] == number[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = number.length - 1;

            while (left < right) {
                int sum = number[i] + number[left] + number[right];

                if (sum == 0) {
                    // Found a triplet, store it as a string to handle duplicates
                    int[] result = {number[i], number[left], number[right]};
                    String resultStr = Arrays.toString(result);
                    if (!uniqueResults.contains(resultStr)) {
                        uniqueResults.add(resultStr);
                        System.out.println(resultStr);
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}

