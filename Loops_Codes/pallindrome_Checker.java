import java.util.Scanner; 
public class pallindrome_Checker {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number You want to check :");
    int num = sc.nextInt();
    int remainder = 0;
    int temp = num;
    while (num>0) {
     remainder += num%10;
        remainder *= 10;
        num /=10;
    }
    remainder /=10;
    System.out.println(remainder);
    if (remainder==temp) {
        System.out.println("The number is Pallendrome ");
    }
    else{
    System.out.println("The number is Not Pallendrome ");
    }

    sc.close();
    }
}
