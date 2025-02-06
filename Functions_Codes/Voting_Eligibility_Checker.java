import java.util.Scanner; 
public class Voting_Eligibility_Checker {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Your Age : ");
     int age = sc.nextInt();
        Eligibility(age);
    
    sc.close();
    }

        static void Eligibility(int age){
            if (age>=18) {
                System.out.println("You are Eligible to Vote ");
            }
            else{
                System.out.println("You are not Eligible to vote ");
            }
        }

}
