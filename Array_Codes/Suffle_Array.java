import java.util.Arrays;

public class Suffle_Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,4,3,2,1};
      int[] answer=  suffle(arr1,4);
        System.out.println(Arrays.toString(answer));
    }

    static int[] suffle(int[] arr,int n){
        int start=0, mid=n,index=0;
        int[] ans = new int[arr.length];

        while(mid<arr.length){
            ans[index++]=arr[start++];
            ans[index++]=arr[mid++];

        }

        return ans;
    }
}
