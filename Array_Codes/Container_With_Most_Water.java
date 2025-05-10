
public class Container_With_Most_Water {
 public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    int right = height.length-1;
    int left = 0;
    int max_area =0;
    int area =0;
    while (left < right) {
       area = Math.min(height[left], height[right]) * (right-left);
    
 max_area = Math.max(max_area, area);

    if (height[left]> height[right]) {
        right--;
    }
    else{
        left++;
    }

 }
 System.out.println(max_area);
    
 }   

}
