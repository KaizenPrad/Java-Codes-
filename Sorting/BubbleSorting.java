import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
            int[] arr= {5,4,3,2,1};
            Bubble(arr);
            System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr){
        boolean swapped;
            // Run the steps n-1 times
            for(int i=0; i < arr.length; i++){
                swapped = false;
                //For each step, the sorted item will come to last respective index 
                for (int j = 1; j < arr.length -i ; j++) {
                        //Swap
                        if(arr[j]< arr[j-1]){
                        int temp =  arr[i];
                        arr[i] = arr[j-1];
                        arr[j-1]= temp;
                        swapped = true;
                        }
                }
                // if not a single swapping is done the it means array is already sorted hence sto the program;
               if(!swapped){                //<-------------- Complexity Thing reduced here 
                    break;
                }
            }
    }
}
