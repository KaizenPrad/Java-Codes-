import java.util.Scanner; 
public class Code4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Number you want to check the Armstrong or not : ");
        double rem,sum=0;
        int num = sc.nextInt();//153
        int temp = num;
        double dig = digit(num);
        while (num>0){
            rem = num%10;
            sum += Math.pow(rem, dig);
            num/=10;
        }
        if (sum==temp) {
            System.out.println("The Number is Armstrong !");
        }
        else{
            System.out.println("THe NUmber is ANot an Armstrong number");
        }
    sc.close();
    }

    static int digit(int num){
        int digit = 0;
        while (num>0) {
                digit++;
                num/=10;            
        }
        return digit;
    }
}
