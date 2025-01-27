import java.util.Scanner; 

public class sumofNnumber {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Total Sale Amount : ");
            int sale = sc.nextInt();
            System.out.println("Enter the Commision percentage : ");
            int Commision = sc.nextInt();

            int totalcommmision = (sale*Commision)/100;

            System.out.println("The commison Rate according to percentage is = " + "Rs." + totalcommmision);

        sc.close();
        }
}
