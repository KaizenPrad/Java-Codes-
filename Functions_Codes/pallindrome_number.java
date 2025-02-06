import java.util.Scanner; 
public class pallindrome_number{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
        pallindrome(num);
    sc.close();
    }
    static void pallindrome(int n){
        int rem=0,sum=0;
        int temp = n;
        while(n>0){
            rem = n%10;
            sum += rem;
            sum *=10;
            n /=10;
        }
      sum /= 10;
        
        if (temp==sum) {
            System.out.println("The number is Pallindrome ");
        }
        else{
            System.out.println("The Number is not Pallindrome");
        }
    }
}
