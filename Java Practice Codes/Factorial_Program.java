import java.util.Scanner;

class Factorial_Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here is the Program to find the Factorial of given number");
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
                if (num%i==0) {
                    System.out.print(i);
                }
        }
            sc.close();
    }
}