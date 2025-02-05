import java.util.Scanner;

public class nCrAndpCr_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for n and r
        System.out.println("Enter the {N} Value for nCr Formula: ");
        int n = sc.nextInt();

        System.out.println("Enter the {R} Value for nCr Formula: ");
        int r = sc.nextInt();

        // Calculate nCr using the formula: nCr = n! / (r! * (n - r)!)
        int result = f(n) / (f(r) * f(n - r));
        if (result!=0) {
            System.out.println("nCr = " + result);
            
        }
        else{
            System.out.println("You have Entered Wrong Value keep N Value Greater than R!!!!");
        }

        sc.close();
    }

    // Factorial function
    static int f(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
}
