import java.util.Scanner; 
public class Factorial_Giver {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number You want factorial of : ");
 int number= sc.nextInt();
factorial(number);
 sc.close();
 }   
 static void factorial(int number){
    int sum =1;
    System.out.print(number + "! = ");
    for (int i = number; i>=1; i--) {
       sum*=i;
       System.out.print( i + " * ");
    }
    System.out.print("= " + sum);
 }
}
