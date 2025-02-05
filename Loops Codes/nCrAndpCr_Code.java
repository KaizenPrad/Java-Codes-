import java.util.Scanner;

public class nCrAndpCr_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose 1. nCr " + "\n Choose 2. nPr : ");
        int choice = sc.nextInt();
        // Input for n and r
        System.out.println("Enter the {N} Value for nCr Formula: ");
        int n = sc.nextInt();

        System.out.println("Enter the {R} Value for nCr Formula: ");
        int r = sc.nextInt();

        if (choice == 1) {
            FirstNCRCalculator(n, r);
        } else if (choice == 2) {
            FirstNPRCalculator(n, r);
        }

        sc.close();
    }

    static void FirstNPRCalculator(int n, int r) {
        int result = f(n) / f(n - r);
        if (result != 0) {
            System.out.println("nCr = " + result);

        } else {
            System.out.println("You have Entered Wrong Value keep N Value Greater than R!!!!");
        }
    }

    static void FirstNCRCalculator(int n, int r) {
        int result = f(n) / (f(r) * f(n - r));
        if (result != 0) {
            System.out.println("nCr = " + result);

        } else {
            System.out.println("You have Entered Wrong Value keep N Value Greater than R!!!!");
        }
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
