import java.util.Arrays;
import java.util.Scanner;  
public class Concatenate_Arrays {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        System.out.println("Enter the first array: ");
        
   int[] concatenated = concat(arr1, arr2);

  System.out.println(Arrays.toString(concatenated));


    sc.close();
    }
    public static int[] concat(int[] arr1, int[] arr2){
        int[] total = new int[arr1.length + arr2.length];

    int index =0;
    for (int i = 0; i < arr1.length; i++) {
        total[index++]=arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        total[index++]=arr2[i];
    }
   
    return total;
    }
    
}
