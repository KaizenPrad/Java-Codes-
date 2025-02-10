import java.util.Arrays;

public class Greatest_Number_Candies {
    public static void main(String[] args) {
    int[] candies = {2,3,5,1,4};
    int candiesExtra =  3;
    System.out.println("The Candies before Extra Candies  : " + Arrays.toString(candies));
        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + candiesExtra;
        }
        int max=0;
        
        for (int j = 0; j < candies.length; j++) {
           
            if (candies[j]>max) {
                max = candies[j];
            }
        }
       
        System.out.println("The Candies after Extra Candies : " + Arrays.toString(candies));
        System.out.println(max + " is the Greatest Candies among all. ");
    }
}
