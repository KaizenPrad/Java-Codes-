import java.util.Arrays;

public class Number_Of_Good_Pair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        int count = 0;

        // Outer loop goes over each element
        for (int i = 0; i < arr.length; i++) {
            // Inner loop starts from i + 1 to avoid counting the same pair twice
            for (int j = i + 1; j < arr.length; j++) {
                // Check if the values are equal and they are different elements (i != j)
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The number of good pairs: " + count);
    }
}
