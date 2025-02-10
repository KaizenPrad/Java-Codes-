import java.util.Arrays;

public class two_Sum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        
        int[] Answer= twoSum(nums,target);
        System.out.println(Arrays.toString(Answer));
    }

    /*
        2,7,11,15
        if 2 + 7 = target = i or j print 
     */

    static int[] twoSum(int[] nums,int target){
        int[] output = new int[2];
      
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
             if (nums[i]+nums[j]==target) {
                    output[0] = i;
                    output[1] =j;
             }   
            }
            
        }
        return output;
    }
}
