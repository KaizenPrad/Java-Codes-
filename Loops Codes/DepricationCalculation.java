import java.util.Scanner;  
public class DepricationCalculation {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Original amount : ");
     int original = sc.nextInt();
     System.out.println("Now Enter the Reduced Value : ");
     int Reduced = sc.nextInt();
     float val = original - Reduced;
     float depricationCal = (val/original)*100;
     System.out.println("The Deprcated value is " + val + "  Depricated Percentage : " + depricationCal + "%");

    
    sc.close();
    }
}
