import java.util.Scanner; 
public class BattingAverage {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Run Scored By Cricketer : ");
        int runscored = sc.nextInt();
        System.out.println("Enter the Total times Cricketer is got out  : ");
        int totaltime = sc.nextInt();
        float BattingAverage = runscored / totaltime;
        System.out.println("The Batting Average is : " + BattingAverage);
    sc.close();
    }
}
