import java.util.Scanner; 
public class Code5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number to check it is AutoTrophic or Not");
    double num = sc.nextInt();
    double square = Math.pow(num, 2);
    double digit = square % 10;
    if (digit == num) {
        
    }
    
    sc.close();
    }
    
}