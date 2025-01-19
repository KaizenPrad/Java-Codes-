import java.util.Scanner;

public class Average_of_N_Number {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Here Enter the Numbers of Numbers you want to Enter : ");
            int a = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < a; i++) {
                System.out.print("Enter the Number " + i + ": ");
                int num = sc.nextInt();
                sum = sum+num;
            }
            double avg = sum/a;
            System.out.println("The Average of Following numbers you given is : " + avg );
            sc.close();
        }
        
}