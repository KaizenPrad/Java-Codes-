import java.util.Scanner; 
public class Odd_Or_Even_numberchecker {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
   int a = sc.nextInt();
   oddOrEven(a);

   sc.close();
   } 

   static void oddOrEven(int num) {
    if (num%2==0) {
        System.out.println("The number is even.");
    }
    else{
        System.out.println("The number is odd.");
    }
   }
}
