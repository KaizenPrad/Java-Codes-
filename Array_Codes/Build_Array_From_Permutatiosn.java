import java.util.Arrays;
import java.util.Scanner; 

public class Build_Array_From_Permutatiosn {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element no. " + i + ":");
            arr[i]=sc.nextInt();
        }
        int [] arr2 = new int[6];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr[i];
        }
        for (int  j = 0; j < arr2.length; j++) {
           int a = arr[j];
          arr2[j]=arr[a];
        }
        System.out.println(Arrays.toString(arr2));

       
    sc.close();
    }
    
}
