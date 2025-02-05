import java.util.Scanner; 
public class Compound_Interest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("----------------The Compound Interest Program-------------------");
        System.out.print("Enter the `Original Principle Amount ` : ");
        float principle = sc.nextFloat();
        System.out.print("Enter the `Amount of Rate of Interest` : ");
        float Rate = sc.nextFloat();
        float OriginalRate = Rate/100;
        System.out.print("Enter the number of times Interest compound in a year : ");
        int n = sc.nextInt();
        
        
        double compound = principle*Math.pow(1+OriginalRate/n, n)-principle;
        System.out.println("The Compound Interest is :  " + compound);



    sc.close();
    }
}
