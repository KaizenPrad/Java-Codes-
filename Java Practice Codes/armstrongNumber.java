import java.util.Scanner; 

public class armstrongNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number : ");
      int num = sc.nextInt();
      int rem=0,sum=0;
        int temp = num;
        while (num>0) {
            rem=num%10;
            sum += Math.pow(rem,3);
            num=num/10;
        }

        if (temp==sum) {
            System.out.println("The Number is Armstrong Number");
        }
        else {
            System.out.println("The Number is not Armstrong Number");
            
        }
        

    sc.close();
    }    
}
