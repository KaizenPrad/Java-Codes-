import java.util.Scanner;
public class Discount_Code {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" This is a Discount program");
            System.out.print("Enter the MRP of the product : ");
            int MRP = sc.nextInt();

            System.out.print("Enter the Amount of Discount :");
            int Discount = sc.nextInt();
            double Dis = MRP * Discount/100;
            System.out.println("The Discount of Prodct is : " + Dis + "and After Discount MRP is : " + (MRP-Dis));
            sc.close();
        }

}
