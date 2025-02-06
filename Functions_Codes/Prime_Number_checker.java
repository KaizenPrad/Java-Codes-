import java.util.Scanner; 
public class Prime_Number_checker {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number to check : ");
     int num = sc.nextInt();
     prime_checker(num);
    
    sc.close();
    }
    static void prime_checker(int n){
        int count=0;
       for (int i = 1; i <=n; i++) {
        if (n%i==0) {
          count++;
        }
       }
       if (count==2) {
        System.out.println("The number is Prime ");
       }
       else{
        System.out.println("The number is not Prime");
       }
    }
}
