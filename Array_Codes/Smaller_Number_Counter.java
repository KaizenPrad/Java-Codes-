import java.util.Arrays;

public class Smaller_Number_Counter {
    public static void main(String[] args) {
        int[] array = { 8, 1, 2, 2, 3 };
        int[] smallerarry = new int[array.length];
   
    

        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    max++;
                }
               smallerarry[i]=max;
             
            }
          
        }
        System.out.println(Arrays.toString(smallerarry));
    }
}
