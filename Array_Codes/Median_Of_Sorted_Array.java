import java.util.Arrays;

public class Median_Of_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        
        double answer = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is  : " +  answer);

    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        int[] merged = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            merged[index++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merged[index++] = nums2[i];
        }

        for (int i = 0; i < merged.length; i++) {
            for (int j = i + 1; j < merged.length; j++) {
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;

                }
            }
        }

        if (merged.length % 2 == 0) {
            median = (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
        } else {
            median = merged[merged.length / 2];
        }

        System.out.println(Arrays.toString(merged));

        return median;
    }
}
