import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrary {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
        
    } 
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> result = new ArrayList<>();
    
        for (int i = 0; i < nums.length; i++) {
            result.add(index[i], nums[i]);
        }
        int[] target = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            target[j]= result.get(j);
        }
        
        return target;
    }
}
