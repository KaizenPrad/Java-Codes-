
public class Linear_Search {
    public static void main(String[] args) {
        int num[] = {75,85,45,41,14,85};
        int target = 14;
        int ans= LinearSearch(num, target);
        System.out.println("The Searched Target Index is : " + ans);
        
    }
    //Search in a array and return the index if item found
    //otherwise it item not found returb -1
    static int LinearSearch(int[] arr,int target){
            if (arr.length == 0) {
                return -1;
            }

            //run for loop for matching the element from the target 
            for (int i = 0; i < arr.length; i++) {
                    int element = arr[i];
                    if (element==target) {
                        return i+1;
                    }
            }
            //this line will execute if none of the statement runs 
            return -1;
                      
    }
}
