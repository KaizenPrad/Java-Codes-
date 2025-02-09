import java.util.Arrays;
import java.util.Scanner; 
public class Sum_Of_Arrays_elements {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int[] arr1 = {1,2,3,4};
    int sum=0;
    System.out.println(Arrays.toString(arr1));
    for (int i = 0; i < arr1.length; i++) {
        sum += arr1[i];
        arr1[i]=sum;
    }
    System.out.println(Arrays.toString(arr1));

    sc.close();
    }
}
