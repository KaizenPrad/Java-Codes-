
import java.util.Scanner; 

public class Maximum_and_Minimum_Number {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numbers : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
   System.out.println("Maximum Number : "+maxNumber(num1, num2, num3)); 
   System.out.println("Minimum Number : "+minNumber(num1, num2, num3)); 
 sc.close();
 }   

 static int minNumber(int num1, int num2, int num3){
    int min=num1;
    if (min>num2) {
        min = num2;
    }
    else if (min>num3) {
        min = num3;
    }
    return min;
 }

 static int maxNumber(int num1, int num2, int num3){
    int max=num1;
    if (max<num2) {
        max = num2;
    }
    else if (max<num3) {
        max = num3;
    }
    return max;
 }
}
